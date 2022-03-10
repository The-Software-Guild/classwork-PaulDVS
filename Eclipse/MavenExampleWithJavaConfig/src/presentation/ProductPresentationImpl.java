package presentation;

import entities.product;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ProductPresentationImpl implements ProductPresentation {

	private ProductService productService;
	
	
	public ProductPresentationImpl(ProductService productService) {
		super();
		this.productService = productService;
	}

	@Override
	public void showMenu() {
		System.out.println("===============================");
		System.out.println("1. Show Products ");
		System.out.println("2. Create new Product ");
		System.out.println("3. Search Product by ID ");
		System.out.println("4. Delete Product by ID ");
		System.out.println("5. Update Product Price by ID ");
		
		System.out.println("9. Exit");
		System.out.println("==============================");
		
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		List<product> productList;
		
		switch (choice) {
			case 1:
				productList=productService.getAllProducts();
				System.out.println("Product List");
				for(product product:productList) {
					System.out.println(product);
				}
				break;
				
			case 2:
				product temptProduct = new product();
				
				System.out.println("Enter Product ID : ");
				temptProduct.setProductID(scanner.nextLong());
				System.out.println("Enter Product Code : ");
				temptProduct.setCode(scanner.next());
				System.out.println("Enter Product Name : ");
				temptProduct.setName(scanner.next());
				System.out.println("Enter Product Description : ");
				temptProduct.setDesc(scanner.next());
				System.out.println("Enter Product Price : ");
				temptProduct.setPrice(scanner.nextDouble());
				
				
				if(productService.saveProduct(temptProduct))
					System.out.println("Product Saved Successfully!");
				else
					System.out.println("Product Insertion Failed!");
				break;
				
			case 3:
				System.out.println("Enter Product ID : ");
				int id=scanner.nextInt();
				product searchProduct = productService.getProductById(id);
				
				if(searchProduct!=null)
					System.out.println(searchProduct);
				else
					System.out.println("Product with ID "+id+" does not exist!");
				break;
				
			case 4:
				System.out.println("Enter Product ID : ");
				int deleteID=scanner.nextInt();
				if(productService.deleteProduct(deleteID))
					System.out.println("Product Deleted Successfully!");
				else
					System.out.println("Product Delete Failed!");
				break;
				
			case 5:
				System.out.println("Enter Product ID : ");
				int priceUpdateID=scanner.nextInt();
				System.out.println("Enter new Price : ");
				double newPrice=scanner.nextDouble();
				
				
				if(productService.updateProductPrice(priceUpdateID, newPrice))
					System.out.println("Product Price updated Successfully!");
				else
					System.out.println("Product Price update Failed!");
				break;
				
			case 9:
				System.out.println("Quiting");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
		
		}
	}

}
