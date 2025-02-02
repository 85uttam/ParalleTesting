package com.zinnia.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.zinnia.constants.FrameworkConstants;
import com.zinnia.exceptions.FrameworkException;
import com.zinnia.exceptions.InvalidPathForExcelException;

/**
 * Utility class to read or write to excel.
 *
 * @version 1.0
 * @since 1.0
 * @see com.zinnia.listeners.MethodInterceptor
 * @see DataProviderUtils
 */
public final class ExcelUtils {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private ExcelUtils() {}


	/**
	 * Encapsulates all the value from the mentioned excel sheet and store it in
	 * List holding HashMaps. Key for the map in the column header in the excel sheet.
	 *
	 * @param sheetname Excel sheetname to read the value from
	 * @return List where each index holds a map and Each map holds the details about the test
	 * TODO create reusable methods
	 */
	public static List<Map<String,String>> getTestDetails(String sheetname){
		List<Map<String,String>> list = null;

		try(FileInputStream fs = new FileInputStream(FrameworkConstants.getExcelpath())) {

			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetname);

			int lastrownum = sheet.getLastRowNum();
			int lastcolnum = sheet.getRow(0).getLastCellNum();

			Map<String,String> map =null;
			list = new ArrayList<>();

			for(int i=1; i<=lastrownum;i++) {
				map = new HashMap<>();
				for(int j=0;j<lastcolnum;j++) {
					String key= sheet.getRow(0).getCell(j).getStringCellValue();
					XSSFCell cell = sheet.getRow(i).getCell(j);
					String value = "";
			        if (cell != null) {
			            switch (cell.getCellType()) {
			                case STRING:
			                    value = cell.getStringCellValue();
			                    break;
			                case NUMERIC:
			                    value = String.valueOf(cell.getNumericCellValue());
			                    break;
			                case BOOLEAN:
			                    value = String.valueOf(cell.getBooleanCellValue());
			                    break;
			                case FORMULA:
			                    // Evaluate the formula and get the value
			                    value = cell.getStringCellValue(); // Or evaluate formula and get appropriate value
			                    break;
			                default:
			                    // Handle other types like BLANK, ERROR, _NONE, etc.
			                    value = ""; // Or handle as needed
			                    break;
			            }
			        }
					map.put(key, value);
				}
				list.add(map);
			}

		} catch (FileNotFoundException e) {
			throw new InvalidPathForExcelException("Excel File you trying to read is not found");
		} catch (IOException e) {
			throw new FrameworkException("Some io exception happened  while reading excel file");
		}
		System.out.println(list);
		return list;
	}



}
