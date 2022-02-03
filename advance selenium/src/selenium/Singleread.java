package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Singleread 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	// 1.specify the path of excel
FileInputStream fis = new FileInputStream("./Excel/trail.xlsx");
  Workbook book = WorkbookFactory.create(fis);
  Sheet s = book.getSheet("Sheet1");
  Row r = s.getRow(0);
  Cell c = r.getCell(0);
  String val = c.toString();
  System.out.println(val);
}
}

