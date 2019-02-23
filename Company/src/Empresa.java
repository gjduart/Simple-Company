class Empresa {

	private Func f1,f2,f3;
	private Empresario boss; 

	
	
public Empresa() {
		f1 = new Func("Maria", 2000.00, 0 , 01 ); 
		f2 = new Func("João", 1900.00, 0 , 02); 
		f3 = new Func("Marcelo", 2700.00, 0 , 03); 
		
		boss = new Empresario("Mateus",3 , 7000.00);
		
		
		
}
 public void pagarFuncionario(int n) {
	 
	 
if (boss.getSaldo() > 0  ){
	 if (n == 01) {
		 
	   System.out.println("Debito:" + boss.getSaldo());
	   boss.setSaldo(boss.getSaldo() - f1.getSalario());
	   f1.setSaldo(f1.getSaldo() + f1.getSalario()); 
	   
	   
	 } else if (n == 02) {
		 
		 
		 
		   System.out.println("Debito:" + ((Empresario) boss).getSaldo());
		 boss.setSaldo(boss.getSaldo()- f2.getSalario());
		   f2.setSaldo(f2.getSaldo() + f2.getSalario()); 
		   
	 }else if (n == 03) { 
		 
		 
		 
		 
		   System.out.println("Debito:" + ((Empresario) boss).getSaldo());
		 boss.setSaldo(boss.getSaldo() - f3.getSalario());
		   f3.setSaldo(f3.getSaldo() + f3.getSalario()); 
 }
}
else {
	System.out.println("Operação inválida");
}
}
 
 
}