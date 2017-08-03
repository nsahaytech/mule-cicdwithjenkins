/**
 * 
 */
package com.rak.test;

import com.rak.SetPayload;

import org.junit.Assert;
import org.junit.Test;
import org.mule.api.MuleEventContext;
import org.mule.tck.junit4.AbstractMuleContextTestCase;

/**
 * @author Ruman
 *
 */
public class SetPayloadTest extends AbstractMuleContextTestCase {

	@Test
	public void setPayload_should_SetPayloadAs_MULECICD() throws Exception
	{
		//Arrange
			SetPayload setPayload = new SetPayload();
			MuleEventContext eventContext = getTestEventContext("test");
		//Act
			setPayload.onCall(eventContext);
		//Assert
			Assert.assertEquals("MULECICD", eventContext.getMessage().getPayload());
	}
}
