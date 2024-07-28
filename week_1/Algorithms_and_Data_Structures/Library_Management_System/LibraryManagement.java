package Java_FSE.week_1.Algorithms_and_Data_Structures.Library_Management_System;

import java.util.Scanner;

public class LibraryManagement {
    private static class Node {
        Book data;
        Node next;

        Node(Book data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LibraryManagement() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addBook(Book newBook) {
        Node newNode = new Node(newBook);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeBook(int bookId) {
        if (head == null) {
            System.out.println("Error: Cannot remove book, the list is empty.");
            return;
        }

        if (head.data.getBookId() == bookId) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data.getBookId() != bookId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Error: Cannot remove book, book not found.");
        } else {
            current.next = current.next.next;
            size--;
        }
    }

    public void traverseBooks() {
        System.out.println("Book List:");
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean linearSearchBookByTitle(String title) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.getTitle().equals(title)) {
                System.out.println("Book found with title '" + title + "', in position: " + index);
                return true;
            }
            current = current.next;
            index++;
        }
        System.out.println("Book not found with title '" + title + "'");
        return false;
    }

    public boolean binarySearchBookByTitle(String title) {
        Node current = head;
        if (current == null || current.next == null) {
            sortBooksByTitle();
        }

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (current.data.getTitle().compareTo(title) == 0) {
                System.out.println("Book found with title '" + title + "', in position: " + mid);
                return true;
            }

            if (current.data.getTitle().compareTo(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            current = current.next;
        }

        System.out.println("Book not found with title '" + title + "'");
        return false;
    }

    public void sortBooksByTitle() {
        Node current = head;
        if (current == null || current.next == null) {
            return;
        }

        while (current != null) {
            Node min = current;
            Node runner = current.next;

            while (runner != null) {
                if (runner.data.getTitle().compareTo(min.data.getTitle()) < 0) {
                    min = runner;
                }
                runner = runner.next;
            }

            Book temp = current.data;
            current.data = min.data;
            min.data = temp;

            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagement library = new LibraryManagement();

        // Add books
        library.addBook(new Book(1, "Book Title A", "Author A"));
        library.addBook(new Book(2, "Book Title C", "Author C"));
        library.addBook(new Book(3, "Book Title B", "Author B"));

        // Linear Search
        library.linearSearchBookByTitle("Book Title B");

        // Binary Search
        library.sortBooksByTitle();
        library.binarySearchBookByTitle("Book Title A");

        scanner.close();
    }
}