package demosmbms.demo.service;


import demosmbms.demo.dao.ProviderDao;
import demosmbms.demo.pojo.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sun.java2d.pipe.SolidTextRenderer;

import java.util.List;

@Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
@Service
public class ProviderServiceImpl{



	@Autowired
	private ProviderDao providerDao;
	public List<Provider> providerGetAll(){
		return providerDao.getAllProvider();
	}

	public ProviderServiceImpl() {
	}
	public boolean add(Provider provider) {
		int j=providerDao.add(provider);
//		int a=1/0;
		return j>0?true:false;
	}
	public List<Provider> getProviderList(String proName, String proCode) {

		return providerDao.getAllProvider(proName,proCode);
	}
	public int deleteProviderById(String delId) {
		return providerDao.delete(delId);
	}
	public Provider getProviderById(String id) {
		return providerDao.getProviderById(id);
	}
	public boolean modify(Provider provider) {
		return providerDao.modify(provider)>0?true:false;
	}

}
