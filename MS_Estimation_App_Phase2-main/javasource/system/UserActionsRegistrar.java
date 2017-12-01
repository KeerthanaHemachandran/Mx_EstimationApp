package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(appcloudservices.actions.GenerateRandomPassword.class);
    registrator.registerUserAction(appcloudservices.actions.LogOutUser.class);
    registrator.registerUserAction(appcloudservices.actions.StartSignOnServlet.class);
    registrator.registerUserAction(mxmodelreflection.actions.ReplaceToken.class);
    registrator.registerUserAction(mxmodelreflection.actions.SyncObjects.class);
    registrator.registerUserAction(mxmodelreflection.actions.TestThePattern.class);
    registrator.registerUserAction(mxmodelreflection.actions.ValidateTokensInMessage.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_action_Databased.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_action_Estimation.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_action_Estimation_Data.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_action_Orchestration.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
    registrator.registerUserAction(xlsreport.actions.GenerateExcelDoc.class);
  }
}
