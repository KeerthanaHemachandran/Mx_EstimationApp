// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum AttributeType
{
	Text(new java.lang.String[][] { new java.lang.String[] { "en_US", "String" }, new java.lang.String[] { "nl_NL", "String" } }),
	Number(new java.lang.String[][] { new java.lang.String[] { "en_US", "Integer" }, new java.lang.String[] { "nl_NL", "Integer" } }),
	Decimal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Float" }, new java.lang.String[] { "nl_NL", "Float" } }),
	Date(new java.lang.String[][] { new java.lang.String[] { "en_US", "Date" }, new java.lang.String[] { "nl_NL", "Datum" } }),
	YesNo(new java.lang.String[][] { new java.lang.String[] { "en_US", "Boolean" }, new java.lang.String[] { "nl_NL", "Boolean" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AttributeType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}