package com.hari.interviewprep.springdemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import com.hari.interviewprep.springdemo.dto.Address;
import com.hari.interviewprep.springdemo.dto.FourWheeler;
import com.hari.interviewprep.springdemo.dto.TwoWheeler;
import com.hari.interviewprep.springdemo.dto.UserDetails;
import com.hari.interviewprep.springdemo.dto.Vehicle;

public class SpringDemo {
	public static void main(String[] args) {
		SessionFactory sessionFact = createSessionFactory();

		// EmployeeDetails employee = new EmployeeDetails();
		// employee.setEmployeeName("Hari");
		// employee.setJoiningDate(new Date());
		// officeAddress.setCity("Irvine");
		// officeAddress.setStreet("4, Discovery");
		// officeAddress.setState("CA");
		// officeAddress.setPincode("92618");
		//
		// user.setHomeAddress(homeAddress);
		// user.setOfficeAddress(officeAddress);
		// user.getVehicleColl().add(vehicle);
		// user.getVehicleColl().add(vehicle1);
		//
		// UserDetails user1 = new UserDetails();
		// user1.setUserName("Hari");
		// Vehicle vehicle2 = new Vehicle();
		// vehicle2.setVehicleName("Jet");
		// Vehicle vehicle3 = new Vehicle();
		// vehicle3.setVehicleName("Limo");
		// Address homeAddress1 = new Address();
		// homeAddress1.setCity("Irvine");
		// homeAddress1.setStreet("123, Oak Glen");
		// homeAddress1.setState("CA");
		// homeAddress1.setPincode("92630");
		// user1.setHomeAddress(homeAddress1);
		// user1.setOfficeAddress(officeAddress);
		// user1.getVehicleColl().add(vehicle2);
		// user1.getVehicleColl().add(vehicle3);

		// vehicle.getUserColl().add(user);
		// vehicle.getUserColl().add(user1);
		// vehicle1.getUserColl().add(user1);
		// vehicle1.getUserColl().add(user2);
		// vehicle2.getUserColl().add(user2);
		// vehicle2.getUserColl().add(user);
		// vehicle3.getUserColl().add(user1);
		// vehicle3.getUserColl().add(user);

		// StudentDetails student = new StudentDetails();
		// student.setStudentName("Hari");
		// Address homeAddress = new Address();
		// Address officeAddress = new Address();
		//
		// homeAddress.setCity("Irvine");
		// homeAddress.setStreet("123, Oak Glenn");
		// homeAddress.setState("CA");
		// homeAddress.setPincode("92630");
		//
		// officeAddress.setCity("Irvine");
		// officeAddress.setStreet("4, Discovery");
		// officeAddress.setState("CA");
		// officeAddress.setPincode("92618");
		//
		// student.getSetOfAddresses().add(homeAddress);
		// student.getSetOfAddresses().add(officeAddress);

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");

		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setVehicleName("Porsche");
		fourWheeler.setSteeringWheel("Porsche steering");

		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setVehicleName("Ducati");
		twoWheeler.setSteeringHandle("Ducati Handle");

		/* Open Session from SessionFactory */
		Session session = sessionFact.openSession();

		/* Begin Transaction */
		session.beginTransaction();
		
		UserDetails user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println(user.getUserName());

		/* Persist EmployeeDetails Object */
		// session.save(employee);
		// session.save(user);
		// session.save(user1);
		// session.save(user2);
		// session.save(vehicle);
		// session.save(vehicle1);
		// session.save(vehicle2);
		// session.save(vehicle3);
		// session.save(student);
		// session.save(fourWheeler);
		// session.save(twoWheeler);

		/* HQL */
		// Query query = session.createQuery("from UserDetails");
		// Query query = session.getNamedQuery("UserDetails.byName");
		// query.setInteger(0, 1);
		// query.setString(0, "Hari");
		// query.setMaxResults(2);
		// Criteria criteria = session.createCriteria(UserDetails.class);
		// criteria.add(Restrictions.eq("userName", "Hari"));
		// List<UserDetails> listOfUsers = (List<UserDetails>) criteria.list();
		// List<UserDetails> listOfUsers = (List<UserDetails>) query.list();
		// int i = 0;
		// for (UserDetails user : listOfUsers) {
		// ++i;
		// System.out.println("User" + i + " is " + user.getUserName());
		// }
		/* Commit the transaction */
		session.getTransaction().commit();
		session.close();
		UserDetails user2 = (UserDetails) session.get(UserDetails.class, 2);
		System.out.println(user2.getUserName());

		// user = null;
		//
		// session = sessionFact.openSession();
		// session.beginTransaction();
		// user = (UserDetails) session.get(UserDetails.class, 2);
		// System.out.println("User ID retrieved is " + user.getUserId());
		// System.out.println("User Name retrieved is " + user.getUserName());
		// System.out.println("User Address - Street retrieved is "
		// + user.getOfficeAddress().getStreet());
		// System.out.println("User Address - City retrieved is "
		// + user.getOfficeAddress().getCity());
		// System.out.println("User Address - State retrieved is "
		// + user.getOfficeAddress().getState());
		// System.out.println("User Address - Pincode retrieved is "
		// + user.getOfficeAddress().getPincode());
		// for (Vehicle veh : user.getVehicleColl()) {
		// System.out.println("User Vehicle retrieved is "
		// + veh.getVehicleName());
		// }

		// StudentDetails student = (StudentDetails)
		// session.get(StudentDetails.class, 3);
		// session.close();
		// System.out.println("Student Id retrieved is " +
		// student.getStudendId());
		// System.out.println("Student Name retrieved is "
		// + student.getStudentName());
		// System.out.println(student.getSetOfAddresses().size());

	}

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceReg = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceReg);
	}

}
