package one;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    // Add a component (file or folder)
    public void addComponent(Component component) {
        components.add(component);
    }

    // Remove a component (file or folder)
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        // Show details of all components inside this folder
        for (Component component : components) {
            component.showDetails();
        }
    }
}

