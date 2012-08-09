package net.wm161.invenio.lib;

import java.util.ArrayList;
import java.util.List;

import net.wm161.invenio.lib.model.CreatureClass;
import net.wm161.invenio.lib.model.PlayerCharacter;

public class CharacterManager {
	private static CharacterManager s_instance = null;
	private ArrayList<PlayerCharacter> m_characters = new ArrayList<PlayerCharacter>();
	
	private CharacterManager() {
		PlayerCharacter c = new PlayerCharacter();
		c.setName("Tim Horton");
		c.setLevel(2);
		c.setCreatureClass(new CreatureClass().setName("Gnome"));
		addCharacter(c);
	}

	public static CharacterManager instance() {
		if (s_instance == null) {
			s_instance = new CharacterManager();
		}
		return s_instance;
	}
	
	public List<PlayerCharacter> characters() {
		return m_characters;
	}
	
	public void addCharacter(PlayerCharacter p) {
		m_characters.add(p);
	}
}
