package Creational.Builder;

public class Driver {
    public static void main(String[] args){
        System.out.println("\n Welcome to Builder \n");

        QueryBuilder queryBuilder = new QueryBuilder()
                .select("Select *")
                .from("from users")
                .where("where country==India");
        Query query = queryBuilder.build();

        System.out.println(query.getQuery());

    }

}
