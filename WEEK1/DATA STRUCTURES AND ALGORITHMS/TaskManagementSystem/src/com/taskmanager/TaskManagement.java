package com.taskmanager;

public class TaskManagement {
    private Node head;

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null; 
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.task.getTaskId() + ", Task Name: " + current.task.getTaskName() + ", Status: " + current.task.getStatus());
            current = current.next;
        }
    }

    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false; // List is empty
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false; 
    }

    public static void main(String[] args) {
        TaskManagement management = new TaskManagement();

        
        management.addTask(new Task(1, "Task One", "Pending"));
        management.addTask(new Task(2, "Task Two", "Completed"));
        management.addTask(new Task(3, "Task Three", "In Progress"));

        
        System.out.println("Traversing tasks:");
        management.traverseTasks();

      
        System.out.println("\nSearching for task with ID 2:");
        Task task = management.searchTask(2);
        if (task != null) {
            System.out.println("Found: " + task.getTaskName());
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting task with ID 2:");
        if (management.deleteTask(2)) {
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nTraversing tasks after deletion:");
        management.traverseTasks();
    }
}
