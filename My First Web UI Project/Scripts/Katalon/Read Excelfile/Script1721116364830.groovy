import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import com.kms.katalon.keyword.excel.ExcelKeywords

String filePath = "D:/demo.xlsx"

Workbook workBook = ExcelKeywords.getWorkbook(filePath)
Sheet sheet = ExcelKeywords.getExcelSheet(workBook, workBook.getSheetName(0))

List<String> dataList = new ArrayList<>()

int rowNumber = sheet.getLastRowNum() + 1 // Lấy số lượng hàng và cột từ sheet
int colNumber = sheet.getRow(0).getLastCellNum()

for (int i =0; i<rowNumber;i++){
 for (int j=0; j<colNumber;j++) {
   dataList.add(ExcelKeywords.getCellValueByIndex(sheet,i,j))
}
}

println(dataList) 

//To validate drop down list in this scenarios:
//- I choose Vietnam from the first drop down list so that all the states of Vietnam are listed in the State drop down list
//- Then I get all the states of Vietnam into the first array list and do the acsending sort
//- Using Excel plugin to create new workbook ExcelKeyword.getWorkBook,  get Excel sheet ExcelKeyword.getExcelSheet then ExcelKeyword.getCellValueByIndex(sheet,row,column)
//- Get the states of Vietnam into the new string
//- Using data.split(',') to get all the states into the second array list and do the collection.sort() to having the same acsending
//- Use Boolean result = Arrays.equals(danh1,danh2) to compare data and return the Pass or Fail result
