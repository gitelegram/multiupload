package org.gitzhu.multiupload.disk;

import org.gitzhu.multiupload.FileItem;
import org.gitzhu.multiupload.servlet.FileItemFactory;

/**
 * Created by gitzhu on 3/25/15.
 */
public class DiskFileItemFactory implements FileItemFactory{


    @Override
    public FileItem createItem(String filedName, String contentType, boolean isFormField, String fileName) {
        DiskFileItem result = new DiskFileItem();
        return result;
    }

}
