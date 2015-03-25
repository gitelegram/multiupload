package org.gitzhu.multiupload;

import org.gitzhu.multiupload.servlet.FileItemFactory;

import java.util.List;

/**
 * Created by gitzhu on 3/25/15.
 */
public abstract class FileUploadBase {


    public List<FileItem> parseRequest(RequestContext context){
       return null;
    }

    public abstract FileItemFactory getFileItemFactory();

    public abstract void setFileItemFactory(FileItemFactory fileItemFactory);
}
