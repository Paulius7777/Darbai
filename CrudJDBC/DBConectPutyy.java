import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.mysql.fabric.xmlrpc.base.Data;

public class DBConectPutyy {
	
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	
	public DBConectPutyy() {
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://java2.andriuskemeris.com/PauliusA?useSSL=false", "student", "codeacademy_java2");
			statement = connection.createStatement();
					
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	//select Clients.Vardas, Clients.Asmens_kodas, Devices.Irenginio_pavadinimas, Devices.Irenginio_spalva "
	//+ "from Clients LEFT JOIN Devices ON Clients.Irenginys = Irenginio_numeris;\r\n" + 
	//";";
	public void getDataClients()throws SQLException {
		String query = "select * from Clients;";
		resultSet = statement.executeQuery(query);
		System.out.println("Records from tables");
		while(resultSet.next()) {
			String vardas = resultSet.getString("Vardas");
			String asmens_kodas = resultSet.getString("Asmens_kodas");
			String irenginys = resultSet.getString("Irenginys");
			String pridavimo_data = resultSet.getString("Pridavimo_data");
			String atidavimoData = resultSet.getString("Zadeta_grazinti_data");
			int kaina = resultSet.getInt("Kaina");
			
			System.out.println("Vardas: " + vardas);
			System.out.println("AS: " + asmens_kodas);
			System.out.println("Irenginys: " + irenginys);
			System.out.println("Pridavimo_data: " + pridavimo_data.toString());
			System.out.println("Zadeta_grazinti_kaina : " + atidavimoData.toString());
			System.out.println("Kaina: " + kaina);
			System.out.println("-------------------------------------------");
			
		}
		
		
	}
	public void getDataDevices()throws SQLException {
		String query = "select * from Devices;";
		resultSet = statement.executeQuery(query);
		System.out.println("Records from tables");
		while(resultSet.next()) {

			
			String irenginioNumeris = resultSet.getString("Irenginio_numeris");
			String irenginioPavadinimas = resultSet.getString("Irenginio_pavadinimas");
			int irenginioHDDatmintis = resultSet.getInt("Irenginio_HDD_atmintis");
			int irenginioRamatmintis = resultSet.getInt("Irenginio_RAM_atmintis");
			String irenginioSpalva = resultSet.getString("Irenginio_spalva");
			
			System.out.println("Irenginio Numesris: " + irenginioNumeris);
			System.out.println("Irenginio Pvadinimas: " + irenginioPavadinimas);
			System.out.println("Irenginio HDD atmintis:  " + irenginioHDDatmintis);
			System.out.println("Irenginio RAM atmintis: " + irenginioRamatmintis);
			System.out.println("Irenginio spalva: " + irenginioSpalva);
			System.out.println("-------------------------------------------");
		}
	}
	public void createDataClient(String vardasInsert, String AS, String Irenginys, String pridavimoData, String grazinimoData, int kaina) throws SQLException {
		String query = "INSERT INTO Clients VALUES('" + vardasInsert + "','" + AS + "','"+ Irenginys +"','"+ pridavimoData+"','"+grazinimoData+"','"+kaina+"'"+");\r\n" + 
				"";
		statement.executeUpdate(query);
}
	public void update(String grazinimoData, String kaina, String vardas) throws SQLException {
		String query = "UPDATE Clients SET Zadeta_grazinti_data = ('"+grazinimoData+"' ), Kaina = ("+kaina+") WHERE Vardas = '"+vardas+"';\r\n" + 
				"";
		statement.executeUpdate(query);
		
	}
	public void delete(String irenginys) throws SQLException {
		String query = "DELETE FROM Clients WHERE Irenginys='"+irenginys+"';";
		statement.executeUpdate(query);
		String queryD = "DELETE FROM Devices WHERE Irenginio_numeris='" + irenginys + "';";
		statement.executeUpdate(queryD);
	}
	public void createDataDevices(String irenginioNumeris, String irenginioPavadinimas, String IrenginioHDD, String irenginioRAM, String irenginioSpalva) throws SQLException {
		String query = "INSERT INTO Devices VALUES('"+irenginioNumeris+"','"+irenginioPavadinimas+"','"+IrenginioHDD+"','"+irenginioRAM+"','"+irenginioSpalva+"');";
		statement.executeUpdate(query);
	}
		
	public void DeviceNumberAndAS(String irenginioNumeris, String asmensKodas) throws SQLException {
		String query = " select * from Clients where Irenginys = '"+irenginioNumeris+"' and Asmens_kodas = '"+asmensKodas+"';";
		resultSet = statement.executeQuery(query);
		System.out.println("Klientas");
			while(resultSet.next()) {
				String vardas = resultSet.getString("Vardas");
				String asmens_kodas = resultSet.getString("Asmens_kodas");
				String irenginys = resultSet.getString("Irenginys");
				String pridavimo_data = resultSet.getString("Pridavimo_data");
				String atidavimoData = resultSet.getString("Zadeta_grazinti_data");
				int kaina = resultSet.getInt("Kaina");
				
			
				System.out.println("Vardas: " + vardas);
				System.out.println("AS: " + asmens_kodas);
				System.out.println("Irenginys: " + irenginys);
				System.out.println("Pridavimo_data: " + pridavimo_data.toString());
				System.out.println("Zadeta_grazinti_kaina : " + atidavimoData.toString());
				System.out.println("Kaina: " + kaina);
				System.out.println("-------------------------------------------");
				
			}
}
	public void asFindDevices(String as) throws SQLException {
		String query = "select Irenginys from Clients where Asmens_kodas = '"+as+"';";
		resultSet = statement.executeQuery(query);
		while(resultSet.next()) {
			String irenginiuKodai = resultSet.getString("Irenginys");
			System.out.println("Irenginio numeris: " + irenginiuKodai);
		}
		
	}
	public void report(String irenginioKodas) throws SQLException, IOException {

		String query = "select * from Clients LEFT JOIN Devices ON Clients.Irenginys = Irenginio_numeris where Irenginio_numeris='i7';\r\n" + 
				"";
		resultSet = statement.executeQuery(query);
		System.out.println("Klientas");
			while(resultSet.next()) {
				String vardas = resultSet.getString("Vardas");
				String asmens_kodas = resultSet.getString("Asmens_kodas");
				String irenginys = resultSet.getString("Irenginys");
				String pridavimo_data = resultSet.getString("Pridavimo_data");
				String atidavimoData = resultSet.getString("Zadeta_grazinti_data");
				int kaina = resultSet.getInt("Kaina");
				
				String irenginioNumeris = resultSet.getString("Irenginio_numeris");
				String irenginioPavadinimas = resultSet.getString("Irenginio_pavadinimas");
				int irenginioHDDatmintis = resultSet.getInt("Irenginio_HDD_atmintis");
				int irenginioRamatmintis = resultSet.getInt("Irenginio_RAM_atmintis");
				String irenginioSpalva = resultSet.getString("Irenginio_spalva");
				
				File clientFile = new File(vardas+".txt");

				FileWriter wr = new FileWriter(clientFile);
				BufferedWriter br = new BufferedWriter(wr);
				br.write("Vardas: " + vardas);
				br.newLine();
				br.write("Asmens kodas: " + asmens_kodas);
				br.newLine();
				br.write("Pridavimo_data: " + pridavimo_data.toString());
				br.newLine();
				br.write("Zadeta_grazinti_kaina : " + atidavimoData.toString());
				br.newLine();
				br.write("Kaina: " + kaina);
				br.newLine();
				br.write("Irenginio Numesris: " + irenginioNumeris);
				br.newLine();
				br.write("Irenginio Pvadinimas: " + irenginioPavadinimas);
				br.newLine();
				br.write("Irenginio HDD atmintis:  " + irenginioHDDatmintis);
				br.newLine();
				br.write("Irenginio RAM atmintis: " + irenginioRamatmintis);
				br.newLine();
				br.write("Irenginio spalva: " + irenginioSpalva);
				br.newLine();
				br.close();

			}
	}
	

}
