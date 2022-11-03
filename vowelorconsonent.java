package basicprogram;

public class vowelorconsonent {
public static void main(String []args)
{
	char ch='A';
	if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U'))
		System.out.println(ch+"is vowel");
	else if((ch>=48)&&(ch<=57))
		System.out.println(ch+ "is number");
	else
		System.out.println(ch+"is consonent");
	
}
}
//A=65 B=66 C=67
//a=97 b=98 c=99
//0-48 1=49
//'5'