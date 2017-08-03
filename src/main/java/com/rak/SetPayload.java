/**
 * 
 */
package com.rak;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

/**
 * @author Ruman
 *
 */
public class SetPayload implements Callable {

	/* (non-Javadoc)
	 * @see org.mule.api.lifecycle.Callable#onCall(org.mule.api.MuleEventContext)
	 */
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		eventContext.getMessage().setPayload("MULECICD");
		return eventContext.getMessage().getPayload();
	}

}
