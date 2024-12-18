package one;

public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        
        // Create folders
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        
        // Add files to Folder1
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        
        // Add files and Folder2 to Folder1
        folder1.addComponent(folder2);
        folder2.addComponent(file3);

        // Show details of Folder1 (will also display contents of Folder2 and Files inside)
        folder1.showDetails();
    }
}

