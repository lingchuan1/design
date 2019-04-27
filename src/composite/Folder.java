package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{
    private String name;
    private List<IFile> children;

    public Folder(String name){
        this.name = name;
        children = new ArrayList<>();
    }
    @Override
    public boolean add(IFile iFile) {
        children.add(iFile);
        return true;
    }

    @Override
    public boolean remove(IFile iFile) {
        children.remove(iFile);
        return true;
    }

    @Override
    public List<IFile> getChild() {
        return children;
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
