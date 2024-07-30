import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//localfile
File file = new File ('D:\\demo.pdf')
PDDocument document = PDDocument.load(file)
PDFTextStripper pdfStripper =new PDFTextStripper()
String text = pdfStripper.getText(document)
WebUI.comment(text)

//file URL
URL url = new URL("https://investor.iconplc.com/static-files/59f123fd-ad38-405d-bc57-630c7d332e24")
BufferedInputStream file = new BufferedInputStream(url.openStream())
PDDocument document = PDDocument.load(file)
PDFTextStripper pdfStripper = new PDFTextStripper()
String text = pdfStripper.getText(document)
WebUI.comment(text)
document.close()

