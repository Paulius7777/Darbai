package iISavaiteIIIPamoka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
	


	public static void main(String[] args) throws IOException {
		List<String> userList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		String login = sc.nextLine();
		System.out.println("1: Register");
		System.out.println("2: Login");
		
		if(login.equals("1")){
			createUserFile();
//			userList.add();

		}
			if(login.equals("2")){
			System.out.println("Pasirinkti");
			System.out.println("1 widrawal");
			System.out.println("2 chek");
			System.out.println("3 deposit");
			String pasirinkti = sc.nextLine();
			if(pasirinkti.equals("1")){
			
				widrawal();
				
			}
			if(pasirinkti.equals("3")){
				deposit();
			}
			
		}
		

	}

	private static void deposit() throws IOException {
		System.out.println("iveskite inesama suma:");
		Scanner sc = new Scanner(System.in);
		String bal = sc.nextLine();
		int sk = Integer.parseInt(bal);
		BufferedReader read = new BufferedReader(new FileReader("qqq.txt"));
		String rd = read.readLine();
		int balancas = Integer.parseInt(rd);
		int viso = balancas + sk;
		System.out.println(viso);
		String viso1 = String.valueOf(viso);
		
		PrintWriter write = new PrintWriter(new FileWriter("qqq.txt"));
		write.write(viso1);
		write.close();
		
		
		
	}

	private static void widrawal() throws IOException {
		System.out.println("iveskite isemimo suma:");
		Scanner sc = new Scanner(System.in);
		String bal = sc.nextLine();
		int sk = Integer.parseInt(bal);
		
		BufferedReader read = new BufferedReader(new FileReader("qqq.txt"));
		String rd = read.readLine();
		int balancas = Integer.parseInt(rd);
		if(sk <= balancas){
			int likutis = balancas-sk;
			PrintWriter write = new PrintWriter(new FileWriter("qqq.txt"));
			write.write(likutis);
			write.close();
			
			
		}else{
			System.out.println("per mazas likutis");
		}
		
		
		
	}

	private static void createUserFile() throws IOException {
		Scanner nw = new Scanner(System.in);
		System.out.println("ivesti vartotojo varda");
		String name = nw.nextLine();
		try {
				PrintWriter newText = new PrintWriter(name +".txt");
					User user = new User();
					user.setBalance(0);
					user.setName(name);
				newText.println(user.getBalance(0));
				
				newText.close();
				 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		
		
	}

}
