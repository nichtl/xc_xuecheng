package com.xuecheng.manage_cms_client.dao;
import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Ni
 * @version 1.0
 * @date 2019/11/21 15:02
 */
//查询站点信息
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}