import java.util.List;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializeStudents <T extends Serializable> {
    private String fileName;

    public SerializeStudents(String fileName) {
        setFileName(fileName);
    }

    @SuppressWarnings("unchecked")
    public List<T> deserialize() {
        List<T> students = null;

        try (
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
        ) {
            students = (List<T>)in.readObject();
        } catch(Exception exception) {
            System.err.println("Unable to deserialize");
        }

        return students;
    }

    public void serialize(List<T> students) {
        try (
            FileOutputStream fileOut = new FileOutputStream(this.fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
        ) {
            out.writeObject(students);
        } catch(Exception exception) {
            System.err.println("Unable to serialize");
        }
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}