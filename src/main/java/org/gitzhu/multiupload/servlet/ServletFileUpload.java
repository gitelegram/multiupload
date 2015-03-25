package org.gitzhu.multiupload.servlet;

import org.gitzhu.multiupload.FileItem;
import org.gitzhu.multiupload.FileUpload;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by gitzhu on 3/25/15.
 */
public class ServletFileUpload extends FileUpload {


    public ServletFileUpload(){}

    public ServletFileUpload(FileItemFactory fileItemFactory){
        super(fileItemFactory);
    }

    public List<FileItem> parseRequest(HttpServletRequest request){
        return parseRequest(new ServletRequestContext(request));
    }

}
