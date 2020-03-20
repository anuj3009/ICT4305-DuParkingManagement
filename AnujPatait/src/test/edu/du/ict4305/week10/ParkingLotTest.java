package edu.du.ict4305.week10;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.du.ict4305.week10.Money;
import edu.du.ict4305.week10.ParkingLot;
import edu.du.ict4305.week10.ParkingLotType;
import edu.du.ict4305.week10.VehicleType;

/**
 * <b>Description:</b><br/>
 * This is the JUnit test class for ParkingLot.java class. In this class we will 
 * write all the test cases related to ParkingLot validation. 
 * 
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 02/15/2020
 * @author anujpatait
 *
 */
class ParkingLotTest {

	/**
	 * This test case will validate the unhappy path where id is empty.
	 * 
	 * <b>Result:</b>&nbsp; Pass when validateId() method will return False.
	 */
	@Test
	void testValidatEmptyId() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setId("");
		assertFalse(parkingLot.validateId());
	}
	
	/**
	 * This test case will validate the unhappy path where id is null.
	 * 
	 * <b>Result:</b>&nbsp; Pass when validateId() method will return False.
	 */
	@Test
	void testValidatNullId() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setId(null);
		assertFalse(parkingLot.validateId());
	}
	
	/**
	 * This test case will validate the happy path where id is valid.
	 * 
	 * <b>Result:</b>&nbsp; Pass when validateId() method will return True.
	 */
	@Test
	void testValidatId() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setId("Lot 1");
		assertTrue(parkingLot.validateId());
	}
	
	/**
	 * This test case will validate the unhappy path where name is empty.
	 * 
	 * <b>Result:</b>&nbsp; Pass when validateName() method will return False.
	 */
	@Test
	void testValidatEmptyName() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setName("");
		assertFalse(parkingLot.validateName());
	}
	
	/**
	 * This test case will validate the unhappy path where name is null.
	 * 
	 * <b>Result:</b>&nbsp; Pass when validateName() method will return False.
	 */
	@Test
	void testValidatNullName() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setName(null);
		assertFalse(parkingLot.validateName());
	}
	
	/**
	 * This test case will validate the happy path where name is valid.
	 * 
	 * <b>Result:</b>&nbsp; Pass when validateName() method will return True.
	 */
	@Test
	void testValidatName() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setName("Lot 1");
		assertTrue(parkingLot.validateName());
	}
	
	/**
	 * This test case will validate the unhappy path where lotType is null.
	 * 
	 * <b>Result:</b>&nbsp; Pass when validateLotType() method will return False.
	 */
	@Test
	void testValidatLotType() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setLotType(null);
		assertFalse(parkingLot.validateLotType());
	}
	
	/**
	 * This test case will validate the daily rate when all the input are valid. 
	 * 
	 * <b>Result:</b>&nbsp; Pass when the getDailyRate method will return correct rate. 
	 */
	@Test
	void testGetDailyRate() {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setLotType(ParkingLotType.TYPEA);
		parkingLot.setName("Lot 1");
		parkingLot.setId("001");
		
		Money money = new Money(16.0, "$");
		assertEquals(money.getAmount(), parkingLot.getDailyRate(VehicleType.COMPACT).getAmount());
	}


}
