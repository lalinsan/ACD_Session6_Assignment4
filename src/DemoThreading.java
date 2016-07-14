/*
 * Student: Eduardo Aguirre
 * Session 6
 * Assignment 4
 * Java Class that runs multiple states of a Threads using diverse methods
 * Print Number 1 to 10 using a While Loop
 *  
 */

class DemoThreading extends Thread
{		  
		  @SuppressWarnings("static-access")
		public static void main(String args[])
		  {  
		     DemoThreading dt=new DemoThreading();
		     //dt.setName("My own thread");
		     dt.start();
		     while (dt.isAlive()) //Run main treat as long as it is alive. 
		     {
		    	 System.out.println("State :    " + dt.getState());	//Checks State of the Thread
			     System.out.println("Is alive : " + dt.isAlive());  //Check is the Thread is alive
			     System.out.println("Thread ID: " + dt.getId());    //Check the Thread ID
			     System.out.println("Priority:  " + dt.getPriority()); //Check the Thread Priority
			     System.out.println("State :    " + dt.getState());	 //Check State 
			     dt.interrupt(); //Interrupt Thread
			     System.out.println("State :    " + dt.getState()); //Checks State of the Thread
			     try  //Puts Thread to Sleep
			     {
					dt.sleep(2000);
				 } 
			     catch (InterruptedException e) 
			     {
					e.printStackTrace();
				 }
			     
			     System.out.println("Is interrupted : " + dt.isInterrupted()); //Check if the Thread has been interrupted
			     System.out.println("Is alive : " + dt.isAlive()); //Check if the the Threas is alive
		     }
		         System.out.println("My main Thread is over"); //Print out a message that the Main Thread is over
		  }  
		  
		  public void run() //Secondary Threat
		  {  
		    System.out.println("My thread is in running state."); 
		    int i=0;
		    while (i<=10) //Executes the code below as long as i<10.
		    {
		    	System.out.println("Printing the count :" +i); //Prints the number from 1-10
		    	i++; //Increments the value i by 1		    	
		    }
		    		
		    System.out.println("My child treat is over"); //Print out a message that the Child Thread is over
		    
		 }   
}
	

