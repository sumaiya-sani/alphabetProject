package Adopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

import Utils.StortThaiItem;
import Utils.StoryItem;

public class MyThaiStoryAdopter extends RecyclerView.Adapter<MyThaiStoryAdopter.ViewHolder>{
    public Context context3;
    public List<StortThaiItem> storyThaiItems;

    public MyThaiStoryAdopter(Context context3,List storyThaiItems){
        this.context3=context3;
        this.storyThaiItems=storyThaiItems;

    }
    @NonNull
    @Override
    public MyThaiStoryAdopter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_story_thai,parent,false);
        return new MyThaiStoryAdopter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyThaiStoryAdopter.ViewHolder holder, int position) {
        StortThaiItem itemsStory=storyThaiItems.get(position);
        holder.imageViewStoryThai.setImageResource(itemsStory.getmImageResource());
        holder.textTitleThai.setText(itemsStory.getTitle());
    }

    @Override
    public int getItemCount() {
        return storyThaiItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageViewStoryThai;
        private TextView textTitleThai;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewStoryThai=itemView.findViewById(R.id.imagestoryThai);
           textTitleThai=itemView.findViewById(R.id.titleThai);

        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            StortThaiItem item2=storyThaiItems.get(position);
            Toast.makeText(context3, item2.getTitle(), Toast.LENGTH_SHORT).show();

        }
    }
}
