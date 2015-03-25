package org.gitzhu.multiupload.servlet;

import org.gitzhu.multiupload.FileItem;

/**
 * Created by gitzhu on 3/25/15.
 */
public interface FileItemFactory {

    public FileItem createItem(String filedName, String contentType, boolean isFormField, String fileName);
}
