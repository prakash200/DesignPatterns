package Creational.Builder;

public class Query {

    private String select;
    private String tableName;
    private String where;
    private String groupBy;
    private String orderBy;

    private String query;

    public String getQuery(){
        return query;
    }

    public void setQuery(String query){
        this.query = query;
    }

}
