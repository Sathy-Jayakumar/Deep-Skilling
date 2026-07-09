public class SearchTest {

    public static void main(String args[]) {

        Product[] products = {

            new Product(101,"Laptop","Electronics"),

            new Product(102,"Mouse","Electronics"),

            new Product(103,"Shoes","Fashion")

        };

        Product result = SearchAlgorithms.linearSearch(products,102);

        if(result != null)

            result.display();

    }

}