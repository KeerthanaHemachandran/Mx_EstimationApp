// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package myfirstmodule.actions;

import java.math.BigDecimal;
import java.util.Iterator;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import myfirstmodule.proxies.Assumptions;
import myfirstmodule.proxies.Assumptions_Local;

public class Java_action_Estimation extends CustomJavaAction<java.lang.Long>
{
	private java.math.BigDecimal SumSeriveType;
	private java.math.BigDecimal SumPolicy;
	private java.math.BigDecimal SumPattern;
	private java.math.BigDecimal SumTechStack;
	private java.math.BigDecimal SumDevProcess;
	private java.util.List<IMendixObject> __AssumptionObj;
	private java.util.List<myfirstmodule.proxies.Assumptions_Local> AssumptionObj;

	public Java_action_Estimation(IContext context, java.math.BigDecimal SumSeriveType, java.math.BigDecimal SumPolicy, java.math.BigDecimal SumPattern, java.math.BigDecimal SumTechStack, java.math.BigDecimal SumDevProcess, java.util.List<IMendixObject> AssumptionObj)
	{
		super(context);
		this.SumSeriveType = SumSeriveType;
		this.SumPolicy = SumPolicy;
		this.SumPattern = SumPattern;
		this.SumTechStack = SumTechStack;
		this.SumDevProcess = SumDevProcess;
		this.__AssumptionObj = AssumptionObj;
	}

	@Override
	public java.lang.Long executeAction() throws Exception
	{
		this.AssumptionObj = new java.util.ArrayList<myfirstmodule.proxies.Assumptions_Local>();
		if (__AssumptionObj != null)
			for (IMendixObject __AssumptionObjElement : __AssumptionObj)
				this.AssumptionObj.add(myfirstmodule.proxies.Assumptions_Local.initialize(getContext(), __AssumptionObjElement));

		// BEGIN USER CODE

              // ='Orchestration services'!T3*Assumptions!$F$4+'Patterns&
              // Practices'!$I$3*Assumptions!$F$5+'Tech
              // stack'!$N$3*Assumptions!$F$6+'Development
              // Process'!$O$3*Assumptions!$F$7+Policy!$M$3*Assumptions!$F$8
              
              Double ResultDev = 0.0;
              Double complex = 25.0 ;
              System.out.println(AssumptionObj.size());
              for (Iterator<Assumptions_Local> iterator = AssumptionObj.iterator(); iterator.hasNext();) {
            	  Assumptions_Local assumptions = (Assumptions_Local) iterator.next();
                     switch (assumptions.getProperties()) {
                     case "Service Nature":
                                 System.out.println(SumSeriveType.doubleValue()+"   "+assumptions.getPercentage().doubleValue());
                                 System.out.println(SumSeriveType+"   "+assumptions.getPercentage());
                           ResultDev += Math.ceil(SumSeriveType.doubleValue() * assumptions.getPercentage().doubleValue());
                         
                           break;
                     case "Tech stack":
                           ResultDev += Math.ceil(SumTechStack.doubleValue() * assumptions.getPercentage().doubleValue());
                          
                           break;
                     case "Patterns & Practices":
                           ResultDev += Math.ceil(SumPattern.doubleValue() * assumptions.getPercentage().doubleValue());
                          
                           break;
                     case "Development Process":
                           ResultDev += Math.ceil(SumDevProcess.doubleValue() * assumptions.getPercentage().doubleValue());
                           break;
                     case "Policy":
                           ResultDev += Math.ceil(SumPolicy.doubleValue() * assumptions.getPercentage().doubleValue());
                           break;
                     case "One time effort":
//                         ResultDev += Sum.doubleValue() * assumptions.getPercentage().doubleValue();
                           break;
                     case "Complex":
                           complex = assumptions.getPercentage().doubleValue();
                           break;

                     default:
                           break;
                     }
              }
              
              ResultDev = (ResultDev * complex)/10000;
              System.out.println(ResultDev+"   "+Math.ceil(ResultDev));
              
              return  (long) Math.ceil(ResultDev);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "Java_action_Estimation";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}