
public class MemberTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.add = "��⵵";
		p.name = "��ö��";
		p.phone = 01020003000;

		Customer c = new Customer(1, 1500);
int a;
		System.out.println(p.toString() + " " + c.toString());
	}
}
