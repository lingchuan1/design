package composite;

import java.util.List;

public interface IFile {
    boolean add(IFile iFile);
    boolean remove(IFile iFile);
    List<IFile> getChild();
    void display();
}
