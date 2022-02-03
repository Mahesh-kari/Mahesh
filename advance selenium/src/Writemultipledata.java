import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writemultipledata 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./Excel/trail.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet s = book.getSheet("Sheet1");

	for (int i=4; i<s.getLastRowNum() ; i++) 
	{
		Row r = s.getRow(i);
	for (int j=0;j<r.getLastCellNum(); j++) 
	{
		Cell c = r.getCell(j);
		String value = c.toString();
		System.out.println(value);
	}
	
}
}
}
