
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		activity_home
	 *	@date 		0
	 *	@title 		Home  1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.xd
	 *
	 */
	

package project.akbaralzaini.voting;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import project.akbaralzaini.voting.adapter.KandidatAdapter;
import project.akbaralzaini.voting.model.kandidat;

	public class home_activity extends Activity {



	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		ListView listView=(ListView) findViewById(R.id.listkandidat);
		List<kandidat> listKandidat=new ArrayList<kandidat>();

		kandidat kandidat1,kandidat2,kandidat3;

		kandidat1 = new kandidat();
		kandidat1.setFoto(R.drawable.akbaralzainiy);
		kandidat1.setNama("akbar alzaini");
		kandidat1.setKelas("Mipa 6");
		kandidat1.setVisi("bytsyu sstts6ts s6sbts6  s6bt6st 6v5s6 sv5s6b ty9 s7 s sy9sy9sy9sys ");

		listKandidat.add(kandidat1);

		kandidat2 = new kandidat();
		kandidat2.setFoto(R.drawable.akbaralzainiy);
		kandidat2.setNama("akbar alzaini");
		kandidat2.setKelas("Mipa 6");
		kandidat2.setVisi("bytsyu sstts6ts s6sbts6  s6bt6st 6v5s6 sv5s6b ty9 s7 s sy9sy9sy9sys ");

		listKandidat.add(kandidat2);

		kandidat3 = new kandidat();
		kandidat3.setFoto(R.drawable.akbaralzainiy);
		kandidat3.setNama("akbar alzaini");
		kandidat3.setKelas("Mipa 6");
		kandidat3.setVisi("bytsyu sstts6ts s6sbts6  s6bt6st 6v5s6 sv5s6b ty9 s7 s sy9sy9sy9sys ");

		listKandidat.add(kandidat3);

		listView.setAdapter(new KandidatAdapter(this,R.layout.list_item,listKandidat));
	
	}

}
	
	