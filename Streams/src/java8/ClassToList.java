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
        
		Long count=products.stream().filter(Objects::nonNull).filter(values->values.getPrice()!=0)
				.filter(vals->vals.getName()!=null).filter(p->p.getPrice()>120).count();
		System.out.println(count);  
	   
		
		List<Product> prods=products.stream().filter(Objects::nonNull).filter(q->q.getPrice()!=0).filter(w->w.getName()!=null)
				.filter(e->e.getPrice()>140).collect(Collectors.toList());
		if(prods.isEmpty()) {
       	 System.out.println("empty");
        }
        else {
       	 prods.stream().forEach(y->System.out.println(y.getName()+" "+ y.getPrice()));
       	 
        }
		
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
				.filter(q->q.getName()!=null).filter(product -> product.getName().equalsIgnoreCase("mango"))
				.collect(Collectors.toList());
		if(getParticularProductByProductNameSearch.isEmpty()) {
			System.out.println("empty");
		}
		else {
			getParticularProductByProductNameSearch.stream().forEach(x->System.out.println(x.getName()+" "+x.getPrice()));
		}
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
