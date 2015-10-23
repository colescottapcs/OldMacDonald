class Chick implements Animal 
{     
    private String type;     
	private String sound1; 
	private String sound2;     
	public Chick(String t, String s)
	{         
		type = t;         
		sound1 = s;     
	}     
	public Chick(String t, String s1, String s2)
	{         
		type = t;
		sound1 = s1;      
		sound2 = s2;     
	}     
	public Chick()
	{         
		type = "unknown";         
	}      
	public String getSound(){return sound2==null?sound1:(Math.random()<0.5?sound1:sound2);}     
	public String getType(){return type;} 
}