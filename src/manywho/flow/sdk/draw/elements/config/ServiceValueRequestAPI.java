package manywho.flow.sdk.draw.elements.config;

import java.io.Serializable;

import org.json.JSONObject;

import manywho.flow.sdk.draw.elements.value.*;

/*!

Copyright 2013 ManyWho, Inc.

Licensed under the ManyWho License, Version 1.0 (the "License"); you may not use this
file except in compliance with the License.

You may obtain a copy of the License at: http://manywho.com/sharedsource

Unless required by applicable law or agreed to in writing, software distributed under
the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied. See the License for the specific language governing
permissions and limitations under the License.

*/

public class ServiceValueRequestAPI extends JSONObject implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String privateid;
	public final String getId()
	{
		return privateid;
	}
	public final void setId(String value)
	{
		privateid = value;
	}

	private String privatedeveloperName;
	public final String getDeveloperName()
	{
		return privatedeveloperName;
	}
	public final void setDeveloperName(String value)
	{
		privatedeveloperName = value;
	}

	private ValueElementIdAPI privatevalueElementToReferenceId;
	public final ValueElementIdAPI getValueElementToReferenceId()
	{
		return privatevalueElementToReferenceId;
	}
	public final void setValueElementToReferenceId(ValueElementIdAPI value)
	{
		privatevalueElementToReferenceId = value;
	}

	/** 
	 This is a temporary property so we have the name of the shared element and type element entry tagged against the value (useful in listings)
	*/
	private String privatevalueElementToReferenceDeveloperName;
	public final String getValueElementToReferenceDeveloperName()
	{
		return privatevalueElementToReferenceDeveloperName;
	}
	public final void setValueElementToReferenceDeveloperName(String value)
	{
		privatevalueElementToReferenceDeveloperName = value;
	}

	private String privatecontentType;
	public final String getContentType()
	{
		return privatecontentType;
	}
	public final void setContentType(String value)
	{
		privatecontentType = value;
	}
}