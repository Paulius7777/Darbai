import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, IOException {
		DBConectPutyy connect = new DBConectPutyy();
//		connect.getDataClients();
//		connect.getDataDevices();
//		connect.createDataClient("Tomas","39402128573","i9", "2018-01-12" , "2018-01-22",15);
//		connect.update("2018-01-02","12","Jonas"); // grazinimo data, kaina kur vardas;
//		connect.delete("i8");    //irenginio id;
//		connect.createDataDevices("", "", "", "", ""); //INSERT INTO Devices VALUES('i8','Lenovo','32','4','Juoda');
		
		//3 uzduotis
//		connect.DeviceNumberAndAS("i1","39805124475");   //devaic number ir vartotojo AS kodas;39805124475, i1
		//4 uzduotis pagal asmens koda atspausdinti visus irenginiu kodus ir pasirinkus viena is ju 
		//atspausdinti visa informacija apie ji;
//		connect.asFindDevices("38902155698");  //ivesti AS;39812052658
		//5uzduotis Vartotojas turi turėti galimybę sugeneruoti report į naują failą.
		//T.y. : savo įrenginio grąžinimo lapelį.
//		connect.report("i8"); //Irenginio kodas su visa informacija;
		// 6 Uzduotis Vartotojas turi turėti galimybę užregistruoti naują įrenginio taisymą.
		//Reikia paprašyti visų reikalingų duomenų ir juos patalpinti naujoje eilutėje
		
//		connect.createDataClient("","","","","",0);
//		connect.createDataDevices("","","","","");
		

	}

}
