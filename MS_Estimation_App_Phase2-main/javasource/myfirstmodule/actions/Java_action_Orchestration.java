// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package myfirstmodule.actions;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import myfirstmodule.proxies.Orchestration_Service.MemberNames;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Java_action_Orchestration extends CustomJavaAction<java.lang.Double>
{
	private IMendixObject __Orchestration_service;
	private myfirstmodule.proxies.Orchestration_Service Orchestration_service;
	private java.util.List<IMendixObject> __Service_AttributeParameter1;
	private java.util.List<myfirstmodule.proxies.Service_Attribute_Local> Service_AttributeParameter1;
	private java.util.List<IMendixObject> __Service_Attribute_entity;
	private java.util.List<myfirstmodule.proxies.Orch_SAV> Service_Attribute_entity;

	public Java_action_Orchestration(IContext context, IMendixObject Orchestration_service, java.util.List<IMendixObject> Service_AttributeParameter1, java.util.List<IMendixObject> Service_Attribute_entity)
	{
		super(context);
		this.__Orchestration_service = Orchestration_service;
		this.__Service_AttributeParameter1 = Service_AttributeParameter1;
		this.__Service_Attribute_entity = Service_Attribute_entity;
	}

	@Override
	public java.lang.Double executeAction() throws Exception
	{
		this.Orchestration_service = __Orchestration_service == null ? null : myfirstmodule.proxies.Orchestration_Service.initialize(getContext(), __Orchestration_service);

		this.Service_AttributeParameter1 = new java.util.ArrayList<myfirstmodule.proxies.Service_Attribute_Local>();
		if (__Service_AttributeParameter1 != null)
			for (IMendixObject __Service_AttributeParameter1Element : __Service_AttributeParameter1)
				this.Service_AttributeParameter1.add(myfirstmodule.proxies.Service_Attribute_Local.initialize(getContext(), __Service_AttributeParameter1Element));

		this.Service_Attribute_entity = new java.util.ArrayList<myfirstmodule.proxies.Orch_SAV>();
		if (__Service_Attribute_entity != null)
			for (IMendixObject __Service_Attribute_entityElement : __Service_Attribute_entity)
				this.Service_Attribute_entity.add(myfirstmodule.proxies.Orch_SAV.initialize(getContext(), __Service_Attribute_entityElement));

		// BEGIN USER CODE
		Double ResultDev = 0.0;
		try {
			for (myfirstmodule.proxies.Orch_SAV entries : Service_Attribute_entity) {
				String key1 = entries.getValue_Name();
				String key = entries.getService_Attribute();
				Double value = entries.getValue_Point().doubleValue();
				System.out.println(key + "_" +
						"" +
						"" +
						"" +
						"" + key1 + "    " + value);
				Service_Attribute_Entries_Map.put(key + "_" + key1, value);
			}

			for (myfirstmodule.proxies.Service_Attribute_Local entries : Service_AttributeParameter1) {
				String key = entries.getService_Attribute_Name();
				Integer value = entries.getService_Point();
				System.out.println(key + "    " + value);
				Service_Attribute_Map.put(key, value);
			}

			// Process Development
			if(StringUtils.isNotEmpty(Orchestration_service.getDevelopment()))
			{
			ResultDev += getResultValue(MemberNames.Development.toString(),
					Orchestration_service.getDevelopment());
			System.out.println(ResultDev);
			}
			

			// Service Type
			if(StringUtils.isNotEmpty(Orchestration_service.getService_Type()))
			{
			ResultDev += getResultValue(MemberNames.Service_Type.toString(),
					Orchestration_service.getService_Type());
			System.out.println(ResultDev);
			}
			
			// Output Format
			if(StringUtils.isNotEmpty(Orchestration_service.getOutput_Format()))
			ResultDev += getResultValue(MemberNames.Output_Format.toString(),
					Orchestration_service.getOutput_Format());
			System.out.println(ResultDev);
			// Monolithic
			if(Orchestration_service.getCoExist_with_Monolithic() != null)
				ResultDev += getResultValue(
					MemberNames.CoExist_with_Monolithic.toString(),
					Orchestration_service.getCoExist_with_Monolithic()
							.getCaption());
			
			System.out.println("co" + ResultDev);
			// Versioning
			if(Orchestration_service.getVersioning()!= null)
			ResultDev += getResultValue(MemberNames.Versioning.toString(),
					Orchestration_service.getVersioning().getCaption());
			System.out.println(ResultDev);
			// ServiceOverlay
			if(Orchestration_service.getService_Overlap() != null )
				ResultDev += getResultValue(MemberNames.Service_Overlap.toString(),
					Orchestration_service.getService_Overlap().getCaption());
			System.out.println(ResultDev);
			// Blocking Use Case
			if(Orchestration_service.getBlocking_the_case() != null)
				ResultDev += getResultValue(
					MemberNames.Blocking_the_case.toString(),
					Orchestration_service.getBlocking_the_case().getCaption());
			System.out.println(ResultDev);
			// Consumers
			if(Orchestration_service.getConsumers() != null)
			ResultDev += getResultValue(MemberNames.Consumers.toString(),
					Orchestration_service.getConsumers().getCaption());
			System.out.println("consumer" + ResultDev);
			// Buisness Logic
			if(Orchestration_service.getBussiness_Logic_Nature() != null)
				ResultDev += getResultValue(
					MemberNames.Bussiness_Logic_Nature.toString(),
					Orchestration_service.getBussiness_Logic_Nature()
							.getCaption());
			System.out.println(ResultDev);
			// Mode of Integration
			if(Orchestration_service.getMode_of_Integration()!= null)
			ResultDev += getResultValue(
					MemberNames.Mode_of_Integration.toString(),
					Orchestration_service.getMode_of_Integration().getCaption());
			System.out.println(ResultDev);
			// Implementation Type
			if(Orchestration_service.getImplementation_Type() != null)
				ResultDev += getResultValue(
					MemberNames.Implementation_Type.toString(),
					Orchestration_service.getImplementation_Type().getCaption());
			System.out.println(ResultDev);
			// Aggregate Data
			if(Orchestration_service.getAggregate_Data()!= null)
				ResultDev += getResultValue(MemberNames.Aggregate_Data.toString(),
					Orchestration_service.getAggregate_Data().getCaption());
			System.out.println(ResultDev);
			// Cache Response
			if(Orchestration_service.getCache_Response()!= null)
			ResultDev += getResultValue(MemberNames.Cache_Response.toString(),
					Orchestration_service.getCache_Response().getCaption());
			System.out.println(ResultDev);
			String name = null;
			Double value = 0.0;

			// No Of Request Params
			// IF(ISBLANK(F3), 0, IF(F3 < 5,5,IF(F3 < 10, 7, IF(F3
			// <15,8,10))))*$F$1
if (Orchestration_service.getNo_Of_Request_Parameter()!= null)
{
			if (Orchestration_service.getNo_Of_Request_Parameter() < 5) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_Of_Request_Parameter.toString()
								+ "_<5"); // Set the proper
											// column name
			} else if (Orchestration_service.getNo_Of_Request_Parameter() < 10) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_Of_Request_Parameter.toString()
								+ "_<10"); // Set the proper
											// column name
			} else if (Orchestration_service.getNo_Of_Request_Parameter() < 15) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_Of_Request_Parameter.toString()
								+ "_<15"); // Set the proper
											// column name
			} else {
				value = 10.0;
			}

			System.out
					.println(value
							+ "   "
							+ "    "
							+ Service_Attribute_Map
									.get(MemberNames.No_Of_Request_Parameter
											.toString()));

			ResultDev += (value * Service_Attribute_Map
					.get(MemberNames.No_Of_Request_Parameter.toString())) / 100;
}

			// No Of Response Params
			// IF(ISBLANK(G3), 0, IF(G3 < 5,5,IF(G3 < 10, 7, IF(G3
			// <15,8,10))))*$G$1
if(Orchestration_service.getNo_of_Response_Parameter()!= null)
{
			if (Orchestration_service.getNo_of_Response_Parameter() < 5) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_of_Response_Parameter.toString()
								+ "_<5"); // Set the proper
											// column name
			} else if (Orchestration_service.getNo_of_Response_Parameter() < 10) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_of_Response_Parameter.toString()
								+ "_<10"); // Set the proper
											// column name
			} else if (Orchestration_service.getNo_of_Response_Parameter() < 15) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_of_Response_Parameter.toString()
								+ "_<15"); // Set the proper
											// column name
			} else {
				value = 10.0;
			}

			System.out.println(value
					+ "   "
					+ "    "
					+ Service_Attribute_Map
							.get(MemberNames.No_of_Response_Parameter
									.toString()));

			ResultDev += (value * Service_Attribute_Map
					.get(MemberNames.No_of_Response_Parameter.toString())) / 100;
}

			// No Of Services
			// IF(ISBLANK(N3), 0,IF(N3 < 2,5,IF(N3 < 3, 7, IF(N3
			// <4,8,10))))*$N$1

			// Set Name
if(Orchestration_service.getNo_of_services_to_be_integrated()!= null)
{
			if (Orchestration_service.getNo_of_services_to_be_integrated() < 2) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_of_services_to_be_integrated
								.toString() + "_<2"); // Set the proper
														// column name
			} else if (Orchestration_service
					.getNo_of_services_to_be_integrated() < 3) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_of_services_to_be_integrated
								.toString() + "_<3"); // Set the proper
														// column name
			} else if (Orchestration_service
					.getNo_of_services_to_be_integrated() < 4) {
				value = Service_Attribute_Entries_Map
						.get(MemberNames.No_of_services_to_be_integrated
								.toString() + "_<4"); // Set the proper
														// column name
			} else {
				value = 10.0;
			}

			System.out.println(value
					+ "   "
					+ "    "
					+ Service_Attribute_Map
							.get(MemberNames.No_of_services_to_be_integrated
									.toString()));

			ResultDev += (value * Service_Attribute_Map
					.get(MemberNames.No_of_services_to_be_integrated.toString())) / 100;

			System.out.println("ResultDev " + ResultDev);
		}
		}
		catch (Exception e) {

			e.printStackTrace();

		}

		return ResultDev;

		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "Java_action_Orchestration";
	}

	// BEGIN EXTRA CODE

	private Double getResultValue(String _serviceAttObj, String _valueAttObj) {

		String serviceAttObj = _serviceAttObj;
		String valueAttObj = _valueAttObj;

		System.out.println(serviceAttObj
				+ "   "
				+ valueAttObj
				+ "    "
				+ Service_Attribute_Entries_Map.get(_serviceAttObj + "_"
						+ valueAttObj) + "   "
				+ Service_Attribute_Map.get(serviceAttObj));
		// System.out.println(Service_Attribute_Map.get(serviceAttObj));
		// System.out.println((Service_Attribute_Map.get(serviceAttObj) / 100));

		Double val = (Service_Attribute_Entries_Map.get(_serviceAttObj + "_"
				+ valueAttObj) * Service_Attribute_Map.get(serviceAttObj)) / 100;
		System.out.println(val);
		return val;
	}

	Map<String, Double> Service_Attribute_Entries_Map = new HashMap<>();
	Map<String, Integer> Service_Attribute_Map = new HashMap<>();

	// END EXTRA CODE
}
