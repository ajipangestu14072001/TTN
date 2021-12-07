package com.example.ttn;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class Adapter extends RecyclerView.Adapter<Adapter.MyAdapter> {
    Context context;

    public Adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter holder, int position) {
        if(position==0)
        {
            holder.image.setImageResource(R.drawable.download);
            holder.image1.setImageResource(R.drawable.ic_baseline_data_object_24);
            holder.back.setBackgroundColor(Color.parseColor("#E6E53935"));
            holder.text.setText("Pemesanan");
            holder.back.setOnClickListener(v -> {
                //Toast.makeText(context.getApplicationContext(), "Pemesanaan", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, PemesananActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            });
        }
        if(position==1)
        {
            holder.image.setImageResource(R.drawable.download);
            holder.image1.setImageResource(R.drawable.ic_baseline_data_object_24);
            holder.back.setBackgroundColor(Color.parseColor("#F236883A"));
            holder.text.setText("Pembayaran");
            holder.back.setOnClickListener(v -> {
                //Toast.makeText(context.getApplicationContext(), "Pembayaran", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, PembayaranActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            });
        }
        if(position==2){
            holder.image.setImageResource(R.drawable.download);
            holder.image1.setImageResource(R.drawable.ic_baseline_data_object_24);
            holder.back.setBackgroundColor(Color.parseColor("#F2AF4576"));
            holder.text.setText("Pencatatan");
            holder.back.setOnClickListener(v -> {
                //Toast.makeText(context.getApplicationContext(), "Pencatatan", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, PencatatanActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            });
        }
        if(position==3)
        {
            holder.image.setImageResource(R.drawable.download);
            holder.image1.setImageResource(R.drawable.ic_baseline_data_object_24);
            holder.back.setBackgroundColor(Color.parseColor("#F2EEAA45"));
            holder.text.setText("Notifikasi");
            holder.back.setOnClickListener(v -> Toast.makeText(context.getApplicationContext(), "Notifikasi", Toast.LENGTH_SHORT).show());
        }
    }
    @Override
    public int getItemCount() {
        return 4;
    }
    public class MyAdapter extends RecyclerView.ViewHolder {
        ImageView image,image1;
        TextView text;
        RelativeLayout back;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            image1=itemView.findViewById(R.id.image1);
            text=itemView.findViewById(R.id.text);
            back=itemView.findViewById(R.id.back);
        }
    }
}
