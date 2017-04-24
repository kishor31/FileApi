/**
 * 
 */
package controller;

import java.util.Date;
import java.util.List;

/**
 * @author kishor
 *
 */
public interface IArchiveService {

	DocumentMetadata save(Document document);

	List<DocumentMetadata> findDocuments(String person, Date date);

	byte[] getDocumentFile(String id);

}
