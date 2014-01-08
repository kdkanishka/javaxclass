package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
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
public class Base64FileSerializer implements Serializer {

    @Override
    public void serialize(Serializable serializable, File filePath) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.write(Base64.encodeToByte(byteArrayOutputStream.toByteArray(), true));
        fileOutputStream.close();
        objectOutputStream.close();
        byteArrayOutputStream.close();

    }

    @Override
    public Object deSerialize(File filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        byte[] byteContent = new byte[dataInputStream.available()];
        dataInputStream.readFully(byteContent);
        byteContent = Base64.decode(byteContent);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteContent);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }
}
