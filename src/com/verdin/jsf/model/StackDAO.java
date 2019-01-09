package com.verdin.jsf.model;

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

import com.verdin.jsf.model.Stack;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class StackDAO {
	
static Logger logger = Logger.getLogger(StackDAO.class);
	
	public List<Stack> getStacks() throws Exception {

		logger.info("get in DAO ...");
		
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("jboss/datasources/AmbariDS"); 
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

	    List<Stack> _stacks =  new ArrayList<Stack>();
	    
	   // select host_id,host_name,cpu_count,ph_cpu_count,cpu_info,discovery_status,
	   // host_attributes,ipv4,ipv6,public_host_name,last_registration_time,
	   // os_arch,os_info,os_type,rack_info,total_mem from hosts;

	    

		String q_STUDENT = "select stack_id, stack_name, stack_version from stack"; 
	

		try {

			conn = ds.getConnection();

			st = conn.createStatement();

			rs = st.executeQuery(q_STUDENT);



			while (rs.next()) {

				logger.info("get in DAO ... "+ _stacks.size());
				
				
				Stack s = new Stack();
				
				s.setStack_id(rs.getInt("stack_id"));
				s.setStack_name(rs.getString("stack_name"));
				s.setStack_version(rs.getString("stack_version"));
				
				
				
				
				_stacks.add(s);

			}  
			
			logger.info("get in DAO ... "+ _stacks.size());
			
		}  catch (Exception e) {
			
			e.printStackTrace();

		} finally {
			conn.close();
		}


		return _stacks;

	}


}


