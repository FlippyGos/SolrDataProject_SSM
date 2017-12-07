package cn.itcast.core.index;

import org.springframework.data.solr.repository.SolrCrudRepository;

import cn.itcast.core.pojo.User;


public interface IUserIndexRepository extends SolrCrudRepository<User, Integer> {
	

}
