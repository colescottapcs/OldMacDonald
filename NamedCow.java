class NamedCow extends Cow
{
	String name;
	public NamedCow(String t, String n, String s)
	{
		super(t, s);
		name = n;
	}

	public String getName()
	{
		return name;
	}
}