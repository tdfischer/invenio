package net.wm161.invenio.lib.model;

public class Creature {
	private String m_name;
	private int m_level;
	private CreatureClass m_class;
	
	public Creature() {
		m_name = "NoName";
		m_level = 1;
	}
	
	public CreatureClass creatureClass() {
		return m_class;
	}
	
	public Creature setCreatureClass(CreatureClass c) {
		m_class = c;
		return this;
	}
	
	public String toString() {
		return m_name;
	}
	
	public String name() {
		return m_name;
	}
	
	public Creature setName(String name) {
		m_name = name;
		return this;
	}
	
	public int level() {
		return m_level;
	}
	
	public Creature setLevel(int level) {
		m_level = level;
		return this;
	}
}
