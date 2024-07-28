package Java_FSE.week_1.Algorithms_and_Data_Structures.Task_Management_System;

import java.util.*;

public class TaskSinglyLinkedList {
    private static class Node {
        Task data;
        Node next;

        Node(Task data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public TaskSinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    //Adding task to linked list
    public void addTask(Task newTask) {
        Node newNode = new Node(newTask);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //Search in linked list
    public boolean searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.data.getTaskId() == taskId) {
                System.out.println("\nTask found with ID: " + current.data.getTaskId());
                return true;
            }
            current = current.next;
        }
        System.out.println("\nTask not found with ID: " + taskId);
        return false;
    }

    //Tarverse linked list of task
    public void traverseTasks() {
        System.out.println("\nTask List:");
        Node current = head;
        while (current != null) {
            current.data.printTask();
            current = current.next;
        }
    }

    //Delete task from linked list
    public boolean deleteTask(int taskId) {
        if (size == 0) {
            System.out.println("\nError: Cannot delete task. List is empty.");
            return false;
        }

        if (head.data.getTaskId() == taskId) {
            System.out.print("\nDeleting Task :");
            head.data.printTask();
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.data.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("\nError: Cannot delete task. Task not found.");
            return false;
        } else {
            current.next = current.next.next;
            size--;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskSinglyLinkedList taskList = new TaskSinglyLinkedList();

        taskList.addTask(new Task(1, "Task A", "In Progress"));
        taskList.addTask(new Task(4, "Task K", "Queued"));
        taskList.addTask(new Task(6, "Task D", "Completed"));
        taskList.addTask(new Task(10, "Task E", "In Progress"));
        taskList.addTask(new Task(3, "Task B", "Completed"));
        taskList.searchTask(1);
        taskList.traverseTasks();
        taskList.deleteTask(1);
        taskList.traverseTasks();

        scanner.close();
    }
}