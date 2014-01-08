package util;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA. User: kanishka Date: 1/7/14 Time: 11:38 AM To
 * change this template use File | Settings | File Templates.
 */
public interface Serializer {

    /**
     * *
     *
     * @param serializable
     * @param filePath
     */
    public void serialize(Serializable serializable, File filePath) throws IOException;

    /**
     * *
     *
     * @param filePath
     * @return
     */
    public Object deSerialize(File filePath) throws IOException, ClassNotFoundException;
}
