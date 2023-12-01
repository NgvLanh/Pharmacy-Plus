
package support;

import Classes.Staff;

/**
 *
 * @author DUY
 */
public class Role {
    public static Staff user = null;
    
    public static void clear(){
        Role.user = null;
    }
    
    public static boolean login(){
        return Role.user != null;
    } 
    
    public static boolean Manager(){
        return Role.login() && user.isRole();
    } 
}
