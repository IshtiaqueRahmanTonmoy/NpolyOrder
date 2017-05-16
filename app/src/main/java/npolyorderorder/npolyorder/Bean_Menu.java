package npolyorderorder.npolyorder;


public class Bean_Menu {

	int id;
	private String icon = new String();
	private String name = new String();
	private String Proname = new String();
	private String Price = new String();

	
	public Bean_Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bean_Menu(String icon, String name, String proname, String price) {
		super();
		this.icon = icon;
		this.name = name;
		Proname = proname;
		Price = price;
	}



	public Bean_Menu(int id, String icon, String name, String proname,
					 String price) {
		super();
		this.id = id;
		this.icon = icon;
		this.name = name;
		Proname = proname;
		Price = price;

	}


	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProname() {
		return Proname;
	}
	public void setProname(String proname) {
		Proname = proname;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
	
}	