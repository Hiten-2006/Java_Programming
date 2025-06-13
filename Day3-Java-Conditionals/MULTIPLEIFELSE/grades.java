class grades
{
public static void main(String[]args)
{double total_marks=382;
char grade;
double perc=(total_marks/500)*100;
if (perc>=80)
{
grade='A';
}
else if ((perc>=70)&&(perc<80))
{
grade='B';
}
else if ((perc>=60)&&(perc<70))
{
grade='C';
}
else
{
grade='D';
}
{
System.out.println("The percentage of the students is:" +perc);
System.out.println("\n The grade of the students is:" +grade);
}
}
}