package initial_code;

import java.util.ArrayList;

public class ShoppingArrayList {
	ArrayList<String> product=new ArrayList<>();
	
	public void addProduct()
	
	{
	product.add("cetaphil");
	product.add("ponds");
	product.add("vasline");
	product.add("headphone");
	product.add("tv");
	product.add("cooler");
	System.out.println(product);
	}
	public void removeProduct()
	{
		product.remove(1);
		System.out.println(product);
	}
	public void displayCart()
	{
		if(product.isEmpty())
		{
			System.out.println("The cart is empty");
		}
		else
			System.out.println("Here you go");
			System.out.println(product);
	}
	public static void main(String[] args) {
		
		ShoppingArrayList	arrayList=new ShoppingArrayList();
		arrayList. addProduct();
		arrayList.removeProduct();
		arrayList.displayCart();
	}

}
