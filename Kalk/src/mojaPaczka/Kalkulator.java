package mojaPaczka;
import java.util.Scanner;

public class Kalkulator		{
public  static void main (String []args){
	       int fisrtValue; 
	       int secondValue;
	       char operation;      
	       Scanner valuesIN = new Scanner(System.in);   // wczytywanie zmiennych 
	       System.out.println("Podaj pierwsz¹ liczbê:"); 
	       fisrtValue = valuesIN.nextInt();
	       System.out.println("Podaj drug¹ liczbê:");
	       secondValue = valuesIN.nextInt();	 
	       System.out.println("Dodawanie liczb - wciœnij +");
	       System.out.println("Odejmowanie liczb - wciœnij -");
	       System.out.println("Mno¿enie liczb - wciœnij *");
	       System.out.println("Dzielenie liczb - wciœnij /");	 
	       operation = valuesIN.next().charAt(0);  //wczytanie operacji
	  if(operation=='+') {
		  Dodawanie(fisrtValue,secondValue);
		  
	  }
	  else if(operation=='-') {
		  Odejmowanie(fisrtValue,secondValue);
	  }
	  else if(operation=='*') {
		  Mnozenie(fisrtValue,secondValue);
	  }
	  else if(operation=='/') {
		  Dzielenie(fisrtValue,secondValue);
	  }
	    }




public static int Dodawanie(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}
public static int Odejmowanie(int firstValue, int secondValue) {
		return firstValue - secondValue;
	}
public static int Mnozenie(int firstValue, int secondValue) {
		return firstValue * secondValue;
	}	
public static float Dzielenie(int firstValue, int secondValue) {
	if(secondValue==0) {
		throw new java.lang.RuntimeException("Nie dziel przez 0");
	}
		return (float)firstValue/secondValue;
	}
}

