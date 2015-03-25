package org.gitzhu.multiupload;

import java.io.Serializable;

/**
 * Created by gitzhu on 3/25/15.
 */
public interface FileItem extends Serializable {

    public String getName();

    public String getContentType();

    public long getSize();

    public byte[] get();

    public String getFieldName();

    public void delete();

}
