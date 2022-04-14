package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ClassToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=Arrays.asList(new Product(120,"mango"),new Product(140,"apple"),new Product(150,"grapes")
				,new Product(180,"kiwi"),null,new Product(0,"apricots"),new Product(190,null));
		/*
		 * for(Product pro:products) { System.out.println(pro); }
		 */
		System.out.println(products);
		Long count=products.stream().filter(Objects::nonNull).filter(values->values.getPrice()!=0)
				.filter(vals->vals.getName()!=null).filter(p->p.getPrice()>120).count();
		System.out.println(count);  
	   
		
		List<Product> prods=products.stream().filter(Objects::nonNull).filter(q->q.getPrice()!=0).filter(w->w.getName()!=null)
				.filter(e->e.getPrice()>140).collect(Collectors.toList());
		System.out.println(prods);
		
		//getting names
		List<String> names=products.stream().filter(Objects::nonNull).filter(a->a.getName()!=null).map(pr->pr.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		
		//comparing names
		/*
		 * List<Product>
		 * comp=products.stream().filter(Objects::nonNull).filter(q->q.getName().
		 * equalsIgnoreCase("mango")) .collect(Collectors.toList());
		 * System.out.println(comp);
		 */
		
		
		
		List<Product> getParticularProductByProductNameSearch = products.stream().filter(Objects::nonNull)
				.filter(product -> product.getName().equalsIgnoreCase("lemon")).collect(Collectors.toList());
		System.out.println(getParticularProductByProductNameSearch);

	}
}
class Product{
	private int price;
	private String name;
	public int getPrice() {
		return price;
	}
	
	public Product(int price,String name) {
		this.price=price;
		this.name=name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
