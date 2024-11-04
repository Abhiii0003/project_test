package digi.pankaj.gamingmaster.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

import java.util.List;

import digi.pankaj.gamingmaster.Modal.RecyclerModal;
import digi.pankaj.gamingmaster.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<RecyclerModal> recyclerModalList;

    Context context;

    public RecyclerViewAdapter(List<RecyclerModal> recyclerModalList, Context context) {
        this.recyclerModalList = recyclerModalList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.gaming_recycler_layout, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        RecyclerModal recyclerModal = recyclerModalList.get(position);
        Picasso.get().load(recyclerModal.getImageUrl()).into(holder.recyclerViewLayoutMainImage);
        Picasso.get().load(recyclerModal.getLogoUrl()).into(holder.recyclerViewLogo);
        holder.recyclerViewLayoutGameName.setText(recyclerModal.getGameName());



    }

    @Override
    public int getItemCount() {
        return recyclerModalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView recyclerViewLayoutMainImage, recyclerViewLogo;

        TextView recyclerViewLayoutGameName;

        MaterialButton playNowBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerViewLayoutMainImage = itemView.findViewById(R.id.recyclerViewLayoutMainImage);
            recyclerViewLogo = itemView.findViewById(R.id.recyclerViewLogo);
            recyclerViewLayoutGameName = itemView.findViewById(R.id.recyclerViewLayoutGameName);
            playNowBtn = itemView.findViewById(R.id.playNowBtn);

        }
    }
}
