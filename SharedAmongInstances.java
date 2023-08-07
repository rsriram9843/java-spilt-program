package Shared;

public class SharedAmongInstances {
	static int a = 5;
	int b;
	void increased() {
		
		SharedAmongInstances i = new SharedAmongInstances();
		i.b=6;
		b++;
		System.out.println(b);
		SharedAmongInstances n = new SharedAmongInstances();
		n.b=7;
		b++;
		System.out.println(b);
	}
	void incresae() {
		a++;
		System.out.println(a);
	}
	
	

}

