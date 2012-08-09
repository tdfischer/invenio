package net.wm161.invenio;

import net.wm161.invenio.lib.CharacterManager;
import net.wm161.invenio.lib.model.PlayerCharacter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CharacterDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    PlayerCharacter m_item;

    public CharacterDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
        	m_item = CharacterManager.instance().characters().get(getArguments().getInt(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.character_overview, container, false);
        if (m_item != null) {
            ((TextView) rootView.findViewById(R.id.creatureName)).setText(m_item.name());
            ((TextView) rootView.findViewById(R.id.creatureLevel)).setText(String.valueOf(m_item.level()));
        }
        return rootView;
    }
}
