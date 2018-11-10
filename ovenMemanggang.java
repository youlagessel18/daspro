class Oven {

	String jenis;
	int suhu;

	public Oven(String jns,int sh) {
	this.jenis=jns;
	this.suhu=sh;
	}

public void memanggang() {
	System.out.println("======suhu yang harus diatur saat memanggang kue======");
	System.out.println("jenis kue : "+this.jenis);
	System.out.println("suhu yang harus diatur : "+this.suhu);
	}
}

public class ovenMemanggang{
public static void main(String[] args) {
Oven oven1 = new Oven("kue kering",150);
oven1.memanggang();
Oven oven2 = new Oven("bolu panggang",200);
oven2.memanggang();
Oven oven3 = new Oven("cake",170);
oven3.memanggang();
	}
}