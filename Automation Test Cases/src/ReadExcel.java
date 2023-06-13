
public class ReadExcel {

	public static void main(String[] args) {
		
		Xls_Reader xls = new Xls_Reader("C:\\Eclip_workspace\\Automation Test Cases\\src\\XLSTEST\\CustomersInfo.xlsx");
		
		int rowCount=xls.getRowCount("NAME");
		System.out.println(rowCount);
		
		for(int i=1;i<rowCount;i++) {
		
	String v1=xls.getCellData("NAME", "FirstName", i);
	String v2=xls.getCellData("NAME", "LastName", i);
	String v3=xls.getCellData("NAME", "Address", i);
	String v4=xls.getCellData("NAME", "City", i);
	String v5=xls.getCellData("NAME", "State", i);
	String v6=xls.getCellData("NAME", "ZipCode", i);
	String v7=xls.getCellData("NAME", "Phone", i);
	String v8=xls.getCellData("NAME", "SSN", i);
	String v9=xls.getCellData("NAME", "UserName", i);
	String v10=xls.getCellData("NAME", "Password", i);
	String v11=xls.getCellData("NAME", "Confirm", i);
	System.out.println(v1+" | "+v2+" | "+v3+" | "+v4+" |"+v5+" | "+v6+" |"+v7+" | "+v8+" | "+v9+" | "+v10+" | "+v11);
		
		}
	}

}
