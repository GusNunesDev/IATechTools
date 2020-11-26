package br.uninove.iatechtools.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import br.uninove.iatechtools.R;
import br.uninove.iatechtools.pojo.Nota;

public class RecyclerNotasAdapter extends RecyclerView.Adapter<RecyclerNotasAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Nota> listaNotas;

    public RecyclerNotasAdapter(Context context, ArrayList<Nota> listaNotas) {
        this.context = context;r
        this.listaNotas = listaNotas;
    }

    @NonNull
    @Override
    public RecyclerNotasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_nota, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerNotasAdapter.ViewHolder holder, int position) {
        holder.tvTituloNota.setText(listaNotas.get(position).getTitulo());

        String data = new SimpleDateFormat("dd/MM/yyyy").format(listaNotas.get(position).getDataCriacao().toString());

        holder.tvDataNota.setText(data);
    }

    @Override
    public int getItemCount() {
        return listaNotas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTituloNota, tvDataNota;
        ConstraintLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTituloNota = itemView.findViewById(R.id.tvTituloNota);
            tvDataNota = itemView.findViewById(R.id.tvDataNota);
            layout = itemView.findViewById(R.id.layout_parent);
        }
    }
}
