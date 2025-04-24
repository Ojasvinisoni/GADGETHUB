/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadget.dao;

import in.gadgethub.pojo.DemandPojo;
import java.util.List;

/**
 *
 * @author SONI
 */
public interface DemandDao {
    public Boolean addProduct(DemandPojo demandPojo);
    public Boolean removeProduct(String userId, String prodId );
    public List<DemandPojo>haveDemanded(String prodId);
    
}
