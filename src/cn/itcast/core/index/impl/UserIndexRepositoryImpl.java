//package cn.itcast.core.index.impl;
//
//import java.awt.print.Book;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.solr.core.SolrTemplate;
//import org.springframework.data.solr.repository.Query;
//import org.springframework.data.solr.repository.support.SimpleSolrRepository;
//
//import cn.itcast.core.index.IUserIndexRepository;
//import cn.itcast.core.pojo.User;
//
//@Resource
//public class UserIndexRepositoryImpl extends SimpleSolrRepository<User, Integer> implements IUserIndexRepository {
//
//    @Autowired
//    private SolrTemplate solrTemplate;
//
//    @Autowired
//    public void setSolrOperations(){
//        super.setSolrOperations(solrTemplate);
//    }
//
//    @Query("")
//    public List<Book> queryBookByName(String string) {
//
//        return null;
//    }
//	
//}
