import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper

import com.kms.katalon.core.annotation.Keyword

public class pdfReader {
	@Keyword
	def readPDFlocal(String filePath) {
		PDDocument document = null

		File file = new File (filePath)	// Tạo đối tượng File từ đường dẫn
		document = PDDocument.load(file) // Tải tài liệu PDF từ File
		PDFTextStripper pdfStripper =new PDFTextStripper() // Sử dụng PDFTextStripper để trích xuất văn bản
		String data = pdfStripper.getText(document)
		return data
	}
}
