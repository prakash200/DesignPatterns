package Creational.Builder;

public class QueryBuilder {

    private String select = "";
    private String from = "";
    private String where = "";
    private String groupBy= "";
    private String orderBy = "";

    public QueryBuilder select(String select){
        this.select = select;
        return this;
    }

    public QueryBuilder from(String from){
        this.from = from;
        return this;
    }

    public QueryBuilder where(String where){
        this.where = where;
        return this;
    }

    public QueryBuilder groupBy(String groupBy){
        this.groupBy = groupBy;
        return this;
    }

    public QueryBuilder orderBy(String orderBy){
        this.orderBy = orderBy;
        return this;
    }

    public Query build(){
        if (select.isEmpty()){
            throw new RuntimeException("cannot create query without select");
        } else if (from.isEmpty()) {
            throw new RuntimeException("cannot create query without table name");
        }

        Query query = new Query();
        query.setQuery(
                String.join( " ", select,from,where,groupBy,orderBy)
        );

        return query;
    }
}
