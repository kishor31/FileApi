package controller;

import java.util.Date;
import java.util.Properties;

public class Document extends DocumentMetadata {
    private static final long serialVersionUID = 2004955454853853315L;
    
    private byte[] fileData;
    
    public Document( byte[] fileData, String fileName, Date documentDate, String personName) {
        super(fileName, personName, documentDate, personName);
        this.fileData = fileData;
    }

    public Document(Properties properties) {
        super(properties);
    }
    
    public Document(DocumentMetadata metadata) {
        super(metadata.getUuid(), metadata.getFileName(), metadata.getDocumentDate(), metadata.getPersonName());
    }

    public byte[] getFileData() {
        return fileData;
    }
    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }
    
    public DocumentMetadata getMetadata() {
        return new DocumentMetadata(getUuid(), getFileName(), getDocumentDate(), getPersonName());
    }
    

}
