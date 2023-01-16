package Adopter;


import Utils.NumberList;
import Utils.StoryItem;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyNumberAdopter extends RecyclerView.Adapter<MyNumberAdopter.ViewHolder> {
    private Context context;
    public List<NumberList> listitemsNumber;
    private PopupWindow popupWindow;

    public MyNumberAdopter(Context context,List listitemsNumber){
        this.context=context;
        this.listitemsNumber=listitemsNumber;

    }
    @NonNull
    @NotNull
    @Override
    public MyNumberAdopter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View viewNumber= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_number,parent,false);
        return new ViewHolder(viewNumber);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyNumberAdopter.ViewHolder holder, int position) {
        NumberList itemsNumber=listitemsNumber.get(position);
        holder.imagsView.setImageResource(itemsNumber.getNumberImage());
        holder.imagsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });



    }

    @Override
    public int getItemCount() {
        return listitemsNumber.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imagsView;
        public ViewHolder(@NonNull @NotNull View itemViewNumber) {
            super(itemViewNumber);
            imagsView=itemView.findViewById(R.id.numberImg);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();

            NumberList item=listitemsNumber.get(position);
            Toast.makeText(context, item.getNumberImage(), Toast.LENGTH_SHORT).show();
        }
    }




}
