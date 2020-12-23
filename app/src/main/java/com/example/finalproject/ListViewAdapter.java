package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ViewHolder> {

    private ArrayList<ListName> listNames=new ArrayList<>();
    private Context context;


    public ListViewAdapter(Context context, ArrayList<ListName> listNames) {
        this.listNames=listNames;
        this.context=context;
    }

    @NonNull
    @Override
    public ListViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ListViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.car_name.setText(listNames.get(i).getName());
        viewHolder.car_desc.setText(listNames.get(i).getOwner().getLogin());

        final ListName listName = this.listNames.get(i);
        viewHolder.car_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ListDetails.class);
                Log.d("modal", "test" + listName.getLogin());
                intent.putExtra("carName", listName.getName());
                intent.putExtra("carLogin", listName.getLogin());
                intent.putExtra("carFullName", listName.getFull_name());



                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //private ImageView car_image;
        private TextView car_name,car_desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            car_name=(TextView) itemView.findViewById(R.id.car_name);
            car_desc=(TextView)itemView.findViewById(R.id.car_desc);
        }
    }
}
