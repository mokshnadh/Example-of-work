package com.java.FairBilling;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class FairBilling implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Scanner sc;
	static int Time, Menu;
	static String Name ;
	static String On = "Start";
	static String Off = "End";
	
	
	public static <Name, On, strTime, Off> void main(String[] args) throws FileNotFoundException, IOException, EOFException, ClassNotFoundException {
		
		
		do{
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		sc = new Scanner(System.in);
		System.out.println(" Please Enter the UserName:");
		Name = (String) sc.next();	
		if(Name != Name) {
		}
		
			System.out.println(" Press 1 to Start the Session:\n" 
				+ " Press 3 to Stop the Session:\n "
				+ "Press 5 to view the Log Files:\n"
				+ " Press 7 to view the number of sessions and sum of timings:\n"
				+ "Press 9 to exit");
		Time = sc.nextInt();
		
		
		if(Time >= 9){
			System.out.println("You entered a number to Exit :: Thanks for using the application");
			System.exit(0);
		}
		
		
		if(Time == 1) {   // Code to start the session
			    Date now = new Date();

			    String strTime = sdfTime.format(now);

			    File file = new File("LogFile2.txt");
	
				  FileOutputStream fo = new FileOutputStream(file);
				ObjectOutputStream output = new ObjectOutputStream(fo);
				  ArrayList<strTime> strTime1 = new ArrayList<strTime>();
				  ArrayList<Name> names = new ArrayList<Name>();
				  ArrayList<On> on = new ArrayList<On>();
			 			
					 for(Name a1: names) {
						 ((ObjectOutput) output).writeObject(a1);
					 }
					 for(strTime tz: strTime1) {
						 ((ObjectOutput) output).writeObject(tz);
					 }
					 for(On b1: on) {
						 ((ObjectOutput) output).writeObject(b1);
					 }
					 System.out.println(strTime  +" \t " + Name + "\t\t" + On);
					 
		}
					  if(Time == 3) { // Code to stop the session
						    Date now1 = new Date();

						    String strTime11 = sdfTime.format(now1);

						    File file1 = new File("LogFile2.txt");
				
							  FileOutputStream fo1 = new FileOutputStream(file1);
							ObjectOutputStream output1 = new ObjectOutputStream(fo1);
							  ArrayList<strTime> strTime111 = new ArrayList<strTime>();
							  ArrayList<Name> names1 = new ArrayList<Name>();
							  ArrayList<Off> off = new ArrayList<Off>();
						
								 for(Name a2: names1) {
									 ((ObjectOutput) output1).writeObject(a2);
								 }
								 for(strTime tz: strTime111) {
									 ((ObjectOutput) output1).writeObject(tz);
								 }
								 for(Off b2: off) {
									 ((ObjectOutput) output1).writeObject(b2);
								 }
								 System.out.println(strTime11  +" \t " + Name + "\t\t" + Off);
					  }	  
					  
					 
					  
				 if(Time == 5) {//Code to show the log files
					 File file = new File("LogFile2.txt");
					 File file1 = new File("LogFile2.txt");
					 FileInputStream f1 = new FileInputStream(file1);
					 FileInputStream f = new FileInputStream(file);
				  ObjectInputStream input = new ObjectInputStream(f1);
				  ObjectInputStream input1 = new ObjectInputStream(f);
				  ArrayList<strTime> strTime1111 = new ArrayList<strTime>();
				  ArrayList<Name> names = new ArrayList<Name>();
				  ArrayList<Name> names1 = new ArrayList<Name>();
				  ArrayList<On> on1 = new ArrayList<On>();
				  ArrayList<Off> off1 = new ArrayList<Off>();
				 
				  try {
					  while(true) {
						 
						 Name a1 = (Name)input1.readObject(); 
						 Name a2 = (Name)input.readObject(); 
						 names.add(a1);
						 names1.add(a2);
						 On b1 = (On)input1.readObject();
						 on1.add(b1);
						 Off b2 = (Off)input1.readObject();
						 off1.add(b2);
						 strTime tz = (strTime)input1.readObject();
						 strTime1111.add(tz);
						 
					  }
				  } catch (EOFException ex) {  
				  }
				  for(Name a1 : names) {
					  System.out.println(a1);
				  }for(Name a2 : names1) {
					  System.out.println(a2);
				  }for(On b1 : on1) {
					  System.out.println(b1);
				  } for(Off b2 : off1) {
					  System.out.println(b2);
				  } for(strTime tz : strTime1111) {
					  System.out.println(tz);
				  } 
				  
				 }
			
			if(Time == 7) { //Code to calculate the session and timings
					 
					 
				 }
			
		} while(Time>0);
			  }
		}
	
	



 
