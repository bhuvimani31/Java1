package Virtualkey;

import java.io.File;
import java.util.Scanner;

public class Searchfile {

	public void search() {
		String path="D:\\Project\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename to search");
		String filename=sc.next();
		File f=new File(path);
		//display operation
		int flag=0;
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			if(ff.getName().equals(filename)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		
		}
		
		
		if(flag==1) {
			System.out.println("file is found");
		}
		else {
			System.out.println("file is not found");
		}
		
	}

}