package aminulaust.com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Raju on 5/6/17.
 */


public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Friend> friendList;

    // Constructor
    public Adapter(List<Friend> friendList) {
        this.friendList = friendList;
    }

    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_list, parent, false);

        return new MyViewHolder (itemView);
    }

    @Override
    public void onBindViewHolder(Adapter.MyViewHolder holder, int position) {

        Friend friend = friendList.get(position);
        holder.name.setText(friend.getName());
        holder.email.setText(friend.getEmail());

    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    // View Holder Class

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name, email;

        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.tvName);
            email = (TextView) itemView.findViewById(R.id.tvEmail);
        }
    }
}