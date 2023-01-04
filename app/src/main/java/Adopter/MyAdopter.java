package Adopter;

import Utils.Listitem;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MainActivity4;
import com.example.myapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyAdopter extends RecyclerView.Adapter<MyAdopter.ViewHolder> {
private Context context;
public List<Listitem>listitems;

    public MyAdopter(Context context,List listitems){
        this.context=context;
        this.listitems=listitems;

    }
    @NonNull
    @NotNull
    @Override
    public MyAdopter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyAdopter.ViewHolder holder, int position) {
        Listitem item=listitems.get(position);
        holder.image.setImageResource(item.getAlphabetImage());
        holder.itemView.setOnClickListener(holder);

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
private ImageView image;
        public ViewHolder(@NonNull @NotNull View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            image=itemView.findViewById(R.id.alphaImg);

        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            Listitem  item=listitems.get(position);
            //Toast.makeText(context, item.getAlphabetImage(), Toast.LENGTH_SHORT).show();
            Intent intentThired=new Intent(context, MainActivity4.class);
         intentThired.putExtra("image",item.getAlphabetImage());
         context.startActivity(intentThired);

        }
    }
}
