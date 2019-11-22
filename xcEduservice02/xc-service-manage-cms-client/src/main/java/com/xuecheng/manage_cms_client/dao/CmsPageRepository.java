package com.xuecheng.manage_cms_client.dao;
import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Ni
 * @version 1.0
 * @date 2019/11/21 15:01
 */
//查询页面信息
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}