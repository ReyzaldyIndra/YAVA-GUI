package com.verdin.jsf.model;

import javax.faces.bean.ApplicationScoped;
//import javax.faces.bean.ManagedBean;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.jboss.logging.Logger;

import com.verdin.jsf.model.Host;


//import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
//@ManagedBean(name = "hostService")
//@ApplicationScoped
public class HostDAO {
	
	static Logger logger = Logger.getLogger(HostDAO.class);
	
	public List<Host> getHosts() throws Exception {

		logger.info("get in DAO ...");
		
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("jboss/datasources/AmbariDS"); 
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

	    List<Host> _hosts =  new ArrayList<Host>();
	    
	   // select host_id,host_name,cpu_count,ph_cpu_count,cpu_info,discovery_status,
	   // host_attributes,ipv4,ipv6,public_host_name,last_registration_time,
	   // os_arch,os_info,os_type,rack_info,total_mem from hosts;

	    

		String q_STUDENT = "select host_id,host_name,cpu_count,ph_cpu_count,cpu_info,discovery_status,host_attributes,ipv4,ipv6,public_host_name,last_registration_time,os_arch,os_info,os_type,rack_info,total_mem from hosts"; 
	

		try {

			conn = ds.getConnection();

			st = conn.createStatement();

			rs = st.executeQuery(q_STUDENT);



			while (rs.next()) {

				logger.info("get in DAO ... "+ _hosts.size());
				
				
				Host s = new Host();
				
				s.setHost_id(rs.getInt("host_id"));
				s.setHost_name(rs.getString("host_name"));
				s.setCpu_count(rs.getInt("cpu_count"));
				
				s.setPh_cpu_count(rs.getInt("ph_cpu_count"));
				s.setCpu_info(rs.getString("cpu_info"));
				s.setDiscovery_status(rs.getString("discovery_status"));
				s.setHost_attributes(rs.getString("host_attributes"));
				s.setIpv4(rs.getString("ipv4"));
				s.setIpv6(rs.getString("ipv6"));
				s.setPublic_host_name(rs.getString("public_host_name"));
				s.setLast_registration_time(rs.getLong("last_registration_time"));
				s.setOs_arch(rs.getString("os_arch"));
				s.setOs_info(rs.getString("os_info"));
				s.setOs_type(rs.getString("os_type"));
				s.setRack_info(rs.getString("rack_info"));
				s.setTotal_mem(rs.getInt("total_mem"));
				
				
				_hosts.add(s);

			}  
			
			logger.info("get in DAO ... "+ _hosts.size());
			
		}  catch (Exception e) {
			
			e.printStackTrace();

		} finally {
			conn.close();
		}


		return _hosts;

	}


}

