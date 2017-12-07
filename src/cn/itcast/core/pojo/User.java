package cn.itcast.core.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;
import org.springframework.format.annotation.DateTimeFormat;

@SolrDocument(solrCoreName="user")
public class User implements Serializable{
	
	public static final String  user_id = "id";
	public static final String  user_name= "name";
	public static final String  user_birthday = "birthday";
	
	 @Field("id")
    private Integer id;

    @Field("user_name")
    private String name;
    
    @Field("user_birthday")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday
				+ "]";
	}
    
    
    
}