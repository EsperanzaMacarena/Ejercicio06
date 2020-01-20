package com.escacena.ejercicio06;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class MyProductRecyclerViewAdapter extends RecyclerView.Adapter<MyProductRecyclerViewAdapter.ViewHolder> {

    private final List<Product> products;
    private Context context;
    private int layout;

    public MyProductRecyclerViewAdapter(List<Product> products, Context context, int layout) {
        this.products = products;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = products.get(position);
        holder.rating.setText(holder.mItem.getRating());
        holder.soldBy.setText(holder.mItem.getSoldBy());
        holder.price.setText(holder.mItem.getPrice());
        holder.amazonChoice.setText(holder.mItem.getAmazonChoice());
        holder.delivery.setText(holder.mItem.getDelivery());
        holder.commentsNumber.setText(holder.mItem.getCommentsNumber());
        holder.deliveryPrice.setText(holder.mItem.getDeliveryPrice());

        Glide
                .with(context)
                .load(holder.mItem.getPhotoProduct())
                .centerCrop()
                .into(holder.imgProduct);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public ImageView imgProduct;
        public Product mItem;
        public TextView product, rating, soldBy, price, amazonChoice,
                delivery, commentsNumber, deliveryPrice;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            this.imgProduct = view.findViewById(R.id.imageView);
            this.product = view.findViewById(R.id.productName);
            this.rating = view.findViewById(R.id.productRating);
            this.soldBy = view.findViewById(R.id.productSoldBy);
            this.price = view.findViewById(R.id.productDeliveryPrice);
            this.amazonChoice = view.findViewById(R.id.AmazonChoice);
            this.delivery = view.findViewById(R.id.productDelivery);
            this.commentsNumber = view.findViewById(R.id.productCommentsNumber);
            this.deliveryPrice = view.findViewById(R.id.productDeliveryPrice);

        }

        @Override
        public String toString() {
            return "ViewHolder{" +
                    "mView=" + mView +
                    ", imgProduct=" + imgProduct +
                    ", mItem=" + mItem +
                    ", product=" + product +
                    ", rating=" + rating +
                    ", soldBy=" + soldBy +
                    ", price=" + price +
                    ", amazonChoice=" + amazonChoice +
                    ", delivery=" + delivery +
                    ", commentsNumber=" + commentsNumber +
                    ", deliveryPrice=" + deliveryPrice +
                    '}';
        }
    }
}
