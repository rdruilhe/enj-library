/*
 * EnJ - EnOcean Java API
 * 
 * Copyright 2014 Andrea Biasi, Dario Bonino 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package it.polito.elite.enocean.enj.eep.eep26.A5.A502;

import it.polito.elite.enocean.enj.eep.EEPIdentifier;
import it.polito.elite.enocean.enj.eep.eep26.attributes.EEP26TemperatureLinear;

import java.io.Serializable;

/**
 * @author bonino
 *
 */
public class A50217 extends A502 implements Serializable
{

	/**
	 * Serializable version UID
	 */
	private static final long serialVersionUID = 1L;

	// the type definition
	public static final byte type = (byte) 0x17;

	/**
	 * @param version
	 */
	public A50217()
	{
		super();

		// add attributes A50217 has operative range between 10.0 and 90.0 Celsius
		this.addChannelAttribute(1, new EEP26TemperatureLinear(10.0, 90.0));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.polito.elite.enocean.enj.eep.EEP#getEEPIdentifier()
	 */
	@Override
	public EEPIdentifier getEEPIdentifier()
	{
		// return the EEPIdentifier for this profile
		return new EEPIdentifier(A502.rorg, A502.func, A50217.type);
		
	}

}
