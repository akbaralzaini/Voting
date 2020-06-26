package project.akbaralzaini.voting.adapter;

import project.akbaralzaini.voting.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import project.akbaralzaini.voting.model.kandidat;

public class KandidatAdapter extends ArrayAdapter<kandidat> {

    List<kandidat> listStudent;
    Context context;
    int layout;

    public KandidatAdapter(Context context, int layout, List<kandidat> listStudent) {
        super(context, layout, listStudent);
        this.context=context;
        this.layout=layout;
        this.listStudent=listStudent;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        StudentHolder holder;

        if(v==null){
            LayoutInflater vi=((Activity)context).getLayoutInflater();
            v=vi.inflate(layout, parent,false);

            holder=new StudentHolder();
            holder.t1View=(ImageView) v.findViewById(R.id.gambar);
            holder.namaView=(TextView) v.findViewById(R.id.nama);
            holder.kelasView=(TextView) v.findViewById(R.id.kelas);
            //holder.visiView=(TextView) v.findViewById(R.id.visi);

            v.setTag(holder);
        }
        else{
            holder=(StudentHolder) v.getTag();
        }

        kandidat Kandidat=listStudent.get(position);
        holder.t1View.setImageResource(Kandidat.getFoto());
        holder.namaView.setText(Kandidat.getNama());
        holder.kelasView.setText(Kandidat.getKelas());
        //holder.visiView.setText(Kandidat.getVisi());

        return v;
    }

    static class StudentHolder{
        ImageView t1View;
        TextView namaView;
        TextView kelasView;
        //TextView visiView;
    }

}
