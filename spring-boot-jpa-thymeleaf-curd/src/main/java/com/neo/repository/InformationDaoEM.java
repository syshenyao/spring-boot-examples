package com.neo.repository;

import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component  //标记为组件，spring启动时会将该类扫描进容器
public class InformationDaoEM {
    
    @PersistenceContext //注入的是实体管理器,执行持久化操作
    EntityManager entityManager;

    public String getInfoWebWaring(String column){
        String SQL = "SELECT "+column+" FROM user";
        Object obj = entityManager.createNativeQuery(SQL).getSingleResult();

        return String.valueOf(obj);
    }
    
  

}
