package in.thbd.mybank.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import in.thbd.mybank.Model.Myoffer;
import in.thbd.mybank.R;

public class MyOfferAdapter extends RecyclerView.Adapter<MyOfferAdapter.ViewHolder> {

    List<Myoffer> modelList;

    public MyOfferAdapter(List<Myoffer> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public MyOfferAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.offer_layout,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOfferAdapter.ViewHolder holder, int position) {
        String title = modelList.get(position).getTitle();
        int image = modelList.get(position).getImage();
        holder.setItems(title, image, position);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTXt;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTXt = itemView.findViewById(R.id.TitleID);
            imageView = itemView.findViewById(R.id.imageViewID);
        }

        public void setItems(String title, int image, int position) {
            titleTXt.setText(title);
            imageView.setImageResource(image);

        }
    }
}
