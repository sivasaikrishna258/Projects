package org.Automation.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases   
{  
@Test  
public void testtopass()  
{  
AssertJUnit.assertTrue(true);  
}  
@Test  
public void testtofail()  
{  
AssertJUnit.assertFalse(false);  
}  
}  