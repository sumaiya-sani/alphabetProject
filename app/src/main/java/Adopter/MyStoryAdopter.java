package Adopter;

import Utils.Listitem;
import Utils.StoryItem;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MainActivity4;
import com.example.myapplication.R;
import com.example.myapplication.ShowStory;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyStoryAdopter extends RecyclerView.Adapter<MyStoryAdopter.ViewHolder> {
    public Context context2;
    public List<StoryItem> storyItems;

    public MyStoryAdopter(Context context2,List storyItems){
        this.context2=context2;
        this.storyItems=storyItems;

    }

    @NonNull
    @NotNull
    @Override
    public MyStoryAdopter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_story,parent,false);
        return new MyStoryAdopter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyStoryAdopter.ViewHolder holder, int position) {
        StoryItem itemStory=storyItems.get(position);
        holder.imageViewStory.setImageResource(itemStory.getmImageResource());
        holder.textTitle.setText(itemStory.getTitle());
        holder.itemView.setOnClickListener(holder);

    }

    @Override
    public int getItemCount() {

        return storyItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        private ImageView imageViewStory;
        private TextView textTitle;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageViewStory=itemView.findViewById(R.id.imageViewstory);
            textTitle=itemView.findViewById(R.id.textViewtitle);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            StoryItem item=storyItems.get(position);
            Intent intentshowStory=new Intent(context2, ShowStory.class);
            intentshowStory.putExtra("image",item.getmImageResource());
            intentshowStory.putExtra("title",item.getTitle());
            intentshowStory.putExtra("mainStory",item.getMainStory());
            context2.startActivity(intentshowStory);

            //Toast.makeText(context2, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
    }
}
