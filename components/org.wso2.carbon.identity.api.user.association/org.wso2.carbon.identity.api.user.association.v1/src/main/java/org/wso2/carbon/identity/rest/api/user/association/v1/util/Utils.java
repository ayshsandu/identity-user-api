package org.wso2.carbon.identity.rest.api.user.association.v1.util;

import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.identity.user.account.association.UserAccountConnector;

public class Utils {

    public static UserAccountConnector getUserAccountConnector() {

        return (UserAccountConnector) PrivilegedCarbonContext.getThreadLocalCarbonContext()
                .getOSGiService(UserAccountConnector.class, null);
    }
}
