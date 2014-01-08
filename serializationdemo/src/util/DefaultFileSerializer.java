package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA. User: kanishka Date: 1/7/14 Time: 11:50 AM To
 * change this template use File | Settings | File Templates.
 */
public class DefaultFileSerializer implements Serializer {

    @Override
    public void serialize(Serializable serializable, File filePath) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    @Override
    public Object deSerialize(File filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object deserializedObject = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return deserializedObject;
    }
}
