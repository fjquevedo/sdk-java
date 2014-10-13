package manywho.flow.sdk.run.elements.map;

import java.io.Serializable;

import org.json.JSONObject;

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

public class OutcomeResponseAPI extends JSONObject implements Serializable
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

	private String privatelabel;
	public final String getLabel()
	{
		return privatelabel;
	}
	public final void setLabel(String value)
	{
		privatelabel = value;
	}

	private String privatepageActionBindingType;
	public final String getPageActionBindingType()
	{
		return privatepageActionBindingType;
	}
	public final void setPageActionBindingType(String value)
	{
		privatepageActionBindingType = value;
	}

	private String privatepageActionType;
	public final String getPageActionType()
	{
		return privatepageActionType;
	}
	public final void setPageActionType(String value)
	{
		privatepageActionType = value;
	}

	private boolean privateisBulkAction;
	public final boolean getIsBulkAction()
	{
		return privateisBulkAction;
	}
	public final void setIsBulkAction(boolean value)
	{
		privateisBulkAction = value;
	}

	private String privatepageObjectBindingId;
	public final String getPageObjectBindingId()
	{
		return privatepageObjectBindingId;
	}
	public final void setPageObjectBindingId(String value)
	{
		privatepageObjectBindingId = value;
	}

	private int privateorder;
	public final int getOrder()
	{
		return privateorder;
	}
	public final void setOrder(int value)
	{
		privateorder = value;
	}

	private boolean privateisOut;
	public final boolean getIsOut()
	{
		return privateisOut;
	}
	public final void setIsOut(boolean value)
	{
		privateisOut = value;
	}
}