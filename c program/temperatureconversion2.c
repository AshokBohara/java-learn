#include<stdio.h>//
int main()
{
	float celsius,fahrenheit;
	int choice;
	printf("enter tempreature to convert 1:fahrenheit to celsius\n2:celsius to fahrenheit");
	scanf("%d",&choice);
	if (choice==1 )
	{
		printf("enter tempreature in fahrenheit\n");
		scanf("%f",&fahrenheit);
		celsius=(fahrenheit-32)*5/9;
		printf("tempreature in celcius is=%f\n",celsius);	
	}
	
	else
	
        printf("enter tempreature in celsius");
        scanf("%f",&celsius);
        fahrenheit=(9*celsius/5)+32;
        printf("tempreature in fahrenheit is=%f\n",fahrenheit);
}
