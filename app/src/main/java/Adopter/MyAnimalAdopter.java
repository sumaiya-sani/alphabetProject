package Adopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;
import java.util.concurrent.RecursiveAction;

import Utils.AnimalList;



public class MyAnimalAdopter extends RecyclerView.Adapter<MyAnimalAdopter.ViewHolder> {
    public Context context3;
    public List<AnimalList> animalLists;

    public MyAnimalAdopter(Context context3,List animalLists){
        this.context3=context3;
        this.animalLists=animalLists;
    }


    @NonNull
    @Override
    public MyAnimalAdopter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewAnimal= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_animal,parent,false);
        return new MyAnimalAdopter.ViewHolder(viewAnimal);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAnimalAdopter.ViewHolder holder, int position) {
        AnimalList itemAnimal=animalLists.get(position);
        holder.imageViewAnimal.setImageResource(itemAnimal.getAnimalImage());
        holder.animalText.setText(itemAnimal.getAnimalName());

    }

    @Override
    public int getItemCount() {
        return animalLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewAnimal;
        private TextView animalText;
        private ImageView alphAnimalText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewAnimal= itemView.findViewById(R.id.imageAnimal);
            animalText=itemView.findViewById(R.id.animalName);
        }
    }
}
