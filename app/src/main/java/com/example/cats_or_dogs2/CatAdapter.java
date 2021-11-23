package com.example.cats_or_dogs2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.viewHolder> {
    Context context;
    ArrayList<CatManager> allCats;

    public interface listClickListener{
        void onCatSelected(CatManager selectedCats);
    }

    public listClickListener listener;

    public static class viewHolder extends RecyclerView.ViewHolder{
        private final ImageView cat_image;
        private final TextView name_text;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            cat_image = itemView.findViewById(R.id.animal_image_id);
            name_text = itemView.findViewById(R.id.animal_name_text);
        }

        public ImageView getCat_image() { return cat_image; }
        public TextView getName_text() { return name_text; }
    }
    CatAdapter(Context c, ArrayList<CatManager> cats){
        context = c;
        allCats = cats;

    }

    @NonNull
    @Override
    public CatAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_table_view,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

//        holder.getName_text().setText(allCats.get(position).name_text);
//        holder.getCat_image().setImageResource(allCats.get(position).animal_image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener.onCatSelected(allCats.get(position)); }
        });
    }
    @Override
    public int getItemCount() { return allCats.size();}
}
