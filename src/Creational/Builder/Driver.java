package Creational.Builder;

public class Driver {
    public static void main(String[] args){
        System.out.println("\n Welcome to Builder \n");
        // Brute force : defining all methods in Query and passing all variables
        // like select, from , where etc from here driver class
        // but we cannot do any validation and also method chaining is also not possible
        QueryBuilder queryBuilder = new QueryBuilder()
                .select("Select *")
                .from("from users")
                .where("where country==India");
        Query query = queryBuilder.build();

        System.out.println(query.getQuery());

    }

}
