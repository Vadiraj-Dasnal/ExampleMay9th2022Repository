package com.sgtesting.iopackage;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		
		File f=new File("D:\\IoPackageDemo");
		String name=f.getName();
		System.out.println("File name: "+name);
		
		String fpath=f.getPath();
		System.out.println("File path: "+fpath);
		
		String fparent=f.getParent();
		System.out.println("Parent folder: "+fparent);
		
		String fpath1=f.getAbsolutePath();
		System.out.println("Absolute file path: "+fpath1);
		
		boolean b1=f.isFile();
		System.out.println("Is it a file: "+b1);
		
		boolean b2=f.isDirectory();
		System.out.println("Is it a folder: "+b2);
		
		boolean b3=f.isHidden();
		System.out.println("Is it a hidden file: "+b3);
		
		boolean b4=f.canRead();
		System.out.println("Can read this file: "+b4);
		
		boolean b5=f.canWrite();
		System.out.println("Can write this file: "+b5);
		
		boolean b6=f.canExecute();
		System.out.println("Can Execute this file: "+b6);
	}
}
