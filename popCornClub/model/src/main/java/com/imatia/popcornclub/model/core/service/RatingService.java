package com.imatia.popcornclub.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.imatia.popcornclub.api.core.service.IRatingService;
import com.imatia.popcornclub.model.core.dao.RatingDao;
import com.ontimize.db.EntityResult;
import com.imatia.popcornclub.model.core.dao.RatingDao;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("RatingService")
@Lazy
public class RatingService implements IRatingService{

 @Autowired private RatingDao ratingDao;
 @Autowired private DefaultOntimizeDaoHelper daoHelper;
 
 @Override
 public EntityResult ratingQuery(Map<String, Object> keyMap, List<String> attrList)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.query(this.ratingDao, keyMap, attrList);
 }

 @Override
 public EntityResult ratingInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.insert(this.ratingDao, attrMap);
 }

 @Override
 public EntityResult ratingUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.update(this.ratingDao, attrMap, keyMap);
 }

 @Override
 public EntityResult ratingDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.delete(this.ratingDao, keyMap);
 }

}