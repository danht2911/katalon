import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.Cell

// Đọc Workbook từ file Excel
FileInputStream file = new FileInputStream(new File("D:/demo.xlsx"))
Workbook workbook = WorkbookFactory.create(file)

// Lấy sheet đầu tiên trong workbook
Sheet sheet = workbook.getSheetAt(0)

// Khởi tạo danh sách để lưu dữ liệu từ Excel
List<String> dataList = new ArrayList<>()

// Lấy số lượng hàng và cột từ sheet
int rowNumber = sheet.getLastRowNum() + 1
int colNumber = sheet.getRow(0).getLastCellNum()

// Duyệt qua từng hàng và cột để lấy giá trị
for (int i = 0; i < rowNumber; i++) {
    for (int j = 0; j < colNumber; j++) {
        Cell cell = sheet.getRow(i).getCell(j)
        if (cell != null) {
            dataList.add(cell.toString())
        } else {
            dataList.add("")
        }
    }
}

println(dataList) // In ra danh sách dữ liệu
file.close() // Đóng file
