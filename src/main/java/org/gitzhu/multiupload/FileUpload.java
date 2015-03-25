package org.gitzhu.multiupload;

import org.gitzhu.multiupload.servlet.FileItemFactory;

/**
 * Created by gitzhu on 3/25/15.
 */
public class FileUpload extends FileUploadBase {

    private FileItemFactory fileItemFactory;

    public FileUpload(){super();}

    public FileUpload(FileItemFactory fileItemFactory){
        super();
        this.fileItemFactory = fileItemFactory;
    }

    @Override
    public FileItemFactory getFileItemFactory() {
        return fileItemFactory;
    }

    @Override
    public void setFileItemFactory(FileItemFactory fileItemFactory) {
        this.fileItemFactory = fileItemFactory;
    }
}
