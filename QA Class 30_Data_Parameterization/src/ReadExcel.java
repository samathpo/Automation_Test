
public class ReadExcel {

	public static void main(String[] args) {
		
		Xls_Reader xls = new Xls_Reader("C:\\Eclip_workspace\\QA Class 30_Data_Parameterization\\src\\TESTSUITE\\TESTSUITE.xlsx");
		
		int rowCount=xls.getRowCount("GMAIL");
		System.out.println(rowCount);
		
		for(int i=1;i<rowCount;i++) {
		
	String v1=xls.getCellData("GMAIL", "TCID", i);
	String v2=xls.getCellData("GMAIL", "TESTCASE", i);
	String v3=xls.getCellData("GMAIL", "STATUS", i);
	System.out.println(v1+" |"+v2+" | "+v3);
		
		}
	}

}
