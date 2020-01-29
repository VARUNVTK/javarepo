import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdf {
	public static void main(String[] args) {
		Document document = new Document();
		try{
			PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("D:/HelloWorld.pdf"));
		document.open();
		document.add(new Paragraph("Sourabh The Developer!!"));
		String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
	    Image image2 = Image.getInstance(new URL(imageUrl));
	    document.add(image2);
		document.close();
		writer.close();
		}
		catch(DocumentException e){
		e.printStackTrace();
		}
		catch(FileNotFoundException e){
		e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
