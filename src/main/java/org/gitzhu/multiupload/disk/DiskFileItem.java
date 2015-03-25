package org.gitzhu.multiupload.disk;

import org.gitzhu.multiupload.FileItem;

/**
 * Created by gitzhu on 3/25/15.
 */
public class DiskFileItem implements FileItem{


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public byte[] get() {
        return new byte[0];
    }

    @Override
    public String getFieldName() {
        return null;
    }

    @Override
    public void delete() {

    }
}
