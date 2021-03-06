package com.kmutt.stcp.repository;

import com.kmutt.stcp.entity.Subject;
import com.kmutt.stcp.repository.common.AbstractHibernateDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by jirapatj on 2/19/16.
 */
@Repository
public class SubjectRepository extends AbstractHibernateDAO<Subject> {

    public SubjectRepository() {
        super();
        setClazz(Subject.class);
    }
}
