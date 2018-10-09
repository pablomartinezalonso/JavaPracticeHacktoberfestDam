
public class OperadorLogicoPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int m=2, n=5;
		boolean res;
		
		res = (m > n) &&(m >= n);//res=false
		System.out.println("La expresión resulta ser: "+res);
		res =!( (m < n) || (m != n)    );//res=false
		System.out.println("La expresión resulta ser: "+res);
		
		//--------------------------------------------------------------------
		
		m++; // m=3
		System.out.println("El valor de m es: "+m);
		n--; // n=4
		System.out.println("El valor de n es: "+n);
		
		int num=5;
		num = num << 1; // num = 10, equivale a num = num * 2
		System.out.println("El valor de num es: "+num);
		num = num >> 1; // num = 5, equivale a num = num / 2
		System.out.println("El valor de num es: "+num);
		
		//--------------------------------------------------------------------
		
		int a=5;
		int b=10;
		int resu;
		
		resu=a&b;
		System.out.println("El valor de resu es: "+resu);
		resu=a|b;
		System.out.println("El valor de resu es: "+resu);
		
		
		//------------------------Operadores de Asignacion--------------------
		
		int numx=5;
		System.out.println("El valor de numx es: "+numx);
		
		numx += 5; // numx = 10, equivale a numx = numx + 5
		System.out.println("El valor de numx es: "+numx);
		numx -= 5; // numx = 10, equivale a numx = numx + 5
		System.out.println("El valor de numx es: "+numx);
		numx *= 5; // numx = 10, equivale a numx = numx + 5
		System.out.println("El valor de numx es: "+numx);
		numx /= 5; // numx = 10, equivale a numx = numx + 5
		System.out.println("El valor de numx es: "+numx);
		numx %= 5; // numx = 10, equivale a numx = numx + 5
		System.out.println("El valor de numx es: "+numx);
		
	}

}
