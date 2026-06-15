


import java.util.*;
public class StudentManagementSystem {
    
public static void main(String[] args) {
    int i=1;

Scanner Sc= new Scanner(System.in);
 
        
ArrayList<String> stdclass= new ArrayList<String>();
ArrayList<String> name= new ArrayList<String>();
ArrayList<Integer> roll= new ArrayList<Integer>();






while(true){

    System.out.println("1. Add student \n 2. View student \n 3. Search student \n 4. Delete student \n 5. To exit");
    int choice=Sc.nextInt();
Sc.nextLine();

switch (choice) {
    case 1 : 

while(true){
System.out.println("Enter student Name: ( or type exit ) ");
String n=Sc.nextLine();
if (n.equalsIgnoreCase("exit")){
    break;
}
System.out.println("Enter roll number :");
int r=Sc.nextInt();
Sc.nextLine();
System.out.println("Enter class :");
String c=Sc.nextLine();
name.add(n);
roll.add(r);
stdclass.add(c);
}
        case 2  :

System.out.printf("%-15s %-10s %-10s\n ", "NAME" , "ROLL" ,"CLASS");
System.out.println();
for (int j=0;j<name.size();j++){

System.out.printf("%-15s  %-10s  %-10s\n", name.get(j),roll.get(j),stdclass.get(j));
}
        break;

case 3: 

System.out.println("Enter roll number to search the student details : ");
Boolean search=false;
int s=Sc.nextInt();
Sc.nextLine();
System.out.printf("%-20s %-10s %-10s\n ", "NAME" , "ROLL" ,"CLASS");

for(int j=0;j<roll.size();j++){

if(s==roll.get(j)){
System.out.println();
System.out.printf("%-20s  %-10s  %-10s\n", name.get(j),roll.get(j),stdclass.get(j));
search=true;
}

}

if(!search){

    System.out.println("student not found...");
}

case 4:
    System.out.println("Enter roll number to delete student details : ");
    boolean found=false;
int d=Sc.nextInt();
for(int j=0;j<roll.size();j++){
if(d==roll.get(j)){
    name.remove(j);
    roll.remove(j);
    stdclass.remove(j);
System.out.println("deleted succesfully...");
 found=true;

}


}
if(!found)
{
    System.out.println(" Roll not found");
}

    break;

    case 5: 
return;

    default:
        System.out.println(" 'Default choice' ");
        break;
    
    }
}




}}
