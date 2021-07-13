import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
public Student(String firstName,String lastName,int id,int testScores[])
{
    super(firstName,lastName,id);
this.testScores=testScores;
}
public char calculate()
{
int total=0;
for(int i=0;i<testScores.length;i++)
{
total=total+testScores[i];
}
int average=total/testScores.length;
char ch;
if (average>=90&&average<=100)
{
ch='O';
}
else if(average>=80&&average<90)
{
ch='E';
}
else if(average>=70&&average<80)
{
ch='A';
}
else if(average>=55&&average<70)
{
ch='P';
}
else if(average>=40&&average<55)
{
ch='D';
}
else
{
ch='T';
}
return ch;
}
}
class Solution {
