package composite;

import java.util.List;

public class File implements IFile{
    private String name;
    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
