package net.wm161.invenio.lib.model;

public class CreatureClass {
	private String m_name;
	
	public String name() {
		return m_name;
	}
	
	public CreatureClass setName(String name) {
		m_name = name;
		return this;
	}
}
