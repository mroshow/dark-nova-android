package com.example;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class helionprimegame extends Activity {
    /** Called when the activity is first created. */
	
	private TextView t1;
	private TextView t2;
	private TextView t3;
	private TextView t4;
	private Button bsurrender;
	private Button bflee;
	private Button bignore;
	private int ignore;
	public int haede;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.encounter);
     //   getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
      
        	
            t1=(TextView)this.findViewById(R.id.line1);
        	t1.setText("At 20 clicks from helion prime you");
        	t2=(TextView)this.findViewById(R.id.line2);
        	t2.setText("encounter a Pirate Minox");
            t3=(TextView) this.findViewById(R.id.line3);
        	t3.setText("Your opponent attacks");
        	
            
            bsurrender=(Button) this.findViewById(R.id.surrender);
            bsurrender.setVisibility(View.INVISIBLE);
            
            bflee=(Button) this.findViewById(R.id.flee);
            bflee.setVisibility(View.VISIBLE);
            bflee.setText("Surrender");
            
            bignore=(Button) this.findViewById(R.id.ignore);
            bignore.setVisibility(View.VISIBLE);
            bignore.setText("Flee");
                
            bignore=(Button) this.findViewById(R.id.ignore);
            bignore.setOnClickListener(new OnClickListener() {
            	public void onClick(View v){
            		
            		if( ignore==0)
            		{
            		
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("The pirate ship missed you.");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("the pirate ship is still following you");
                    	t3=(TextView) findViewById(R.id.line3);
                    	t3.setText("your opponent attacks");
                	
                	
            		ignore=1;
            		
            		}
            		else if(ignore ==1)
            		{
            			t1=(TextView) findViewById(R.id.line1);
                    	t1.setText("At 15 clicks from helionprime you");
                    	t2=(TextView) findViewById(R.id.line2);
                    	t2.setText("encounter a trader spathi scout");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("It ignores you");
                        
                        bflee=(Button) findViewById(R.id.flee);
                        bflee.setVisibility(View.INVISIBLE);
                        
                		ignore=2;
            		}
            		else if (ignore == 2 )
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("At 14 clicks from helionprime you");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("encounter a trader Vorlan cruiser");
                    	t3=(TextView) findViewById(R.id.line3);
                    	t3.setText("It ignores you");
                    	ignore = 3;
            			
            		}
            		else if (ignore==3)
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("At 12 clicks from helionprime you");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("encounter pirate spathi scout");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("Your opponent attacks");
                        
                    	
                    	bflee=(Button)findViewById(R.id.flee);
                        bflee.setVisibility(View.VISIBLE);
                    	bflee.setText("Surrender");
                    	ignore = 4;
                    	bignore = (Button) findViewById(R.id.ignore);
                        bignore.setText("Flee");
                    	
                    	bsurrender=(Button)findViewById(R.id.surrender);
                        bsurrender.setVisibility(View.INVISIBLE);
            		}
            		else if (ignore == 4)
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("At 10 clicks from helionprime you");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("encounter Pirate T-16 Womprat");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("Your opponent attacks ");
         
                        ignore=10;
                      
            		}
            		else if (ignore==10)
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("The pirate ship missed you.");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("the pirate ship is still following you");
                    	t3=(TextView) findViewById(R.id.line3);
                    	t3.setText("your opponent attacks");
                    	 
                    	ignore =5;
            		}
            		else if(ignore==5)
            		{
            			t1=(TextView) findViewById(R.id.line1);
                    	t1.setText("At 9 clicks from helionprime you");
                    	t2=(TextView) findViewById(R.id.line2);
                    	t2.setText("encounter a police Spathi Scout");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("The police hail they want you to ");
                        t4=(TextView) findViewById(R.id.line4);
                    	t4.setText("surrender");
                    	
                    	ignore =6;
            		}
            		else if(ignore==6)
            		{
            			t1=(TextView) findViewById(R.id.line1);
                    	t1.setText("At 8 clicks from helionprime you");
                    	t2=(TextView) findViewById(R.id.line2);
                    	t2.setText("encounter a police Vorchan");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("The police hail they want you to ");
                        t4=(TextView) findViewById(R.id.line4);
                    	t4.setText("surrender");
                        
                        ignore =7;
            		}
            		
            		else if(ignore==7)
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("At 7 clicks from helionprime");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("you encounter a pirate Minox");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("Your opponent attacks");
                
                        ignore=9;
            		} 
                        
            		else if(ignore==9)
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("At 5 clicks from helionprime");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("you encounter a police Tkhar uberhauler");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("The police hail they want you to ");
                        t4=(TextView) findViewById(R.id.line4);
                        t4.setText("surrender");
                        
                        ignore =11;
            		}
            		else if(ignore==11)
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("the police ship miss you");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("the police ship is still following you");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("The police hail they want you to ");
                        t4=(TextView) findViewById(R.id.line4);
                        t4.setText("surrender");
                        
                      
                        ignore =13;
            		}
            		else if(ignore==13)
            		{
            			t1=(TextView)findViewById(R.id.line1);
                    	t1.setText("the police ship hits you");
                    	t2=(TextView)findViewById(R.id.line2);
                    	t2.setText("the police ship is still following you");
                    	t3=(TextView) findViewById(R.id.line3);
                        t3.setText("The police hail they want you to ");
                        t4=(TextView) findViewById(R.id.line4);
                        t4.setText("surrender");
                        
                      
                        ignore =14;
            		}
            		
            		
            	}
            });
             
    }
}