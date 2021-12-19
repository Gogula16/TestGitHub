package LOOPConcepts;

import org.junit.Test;

public class AT05_ElseIf {
    @Test
    public void ElseifLooplearn() {
        String browser = "Chrome";
        if (browser.equalsIgnoreCase("Chrome")){
            System.out.println("This test case will be executed in Chrome");
        }
        else if (browser.equalsIgnoreCase("IE")){
        System.out.println("This test case will be executed in IE");
        }
        else if (browser.equalsIgnoreCase("Firefox")){
            System.out.println("This test case will be executed in Firefox");
        }
        else if (browser.equalsIgnoreCase("Microsoft Edge")){
            System.out.println("This test case will be executed in Microsoft Edge");
        }
        else{
            System.out.println("Browser is not in the list");
            }
        }

    }

