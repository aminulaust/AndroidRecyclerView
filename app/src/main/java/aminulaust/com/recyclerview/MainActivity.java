package aminulaust.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Friend> friendList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new Adapter(friendList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareFriends();
    }

    private void prepareFriends() {

        Friend friend;

        friend = new Friend("Hello", "hello@gmail.com");
        friend = new Friend("XYZ", "xyz@mail.com");
        friendList.add(friend);

        friend = new Friend("Test", "test@gmail.com");
        friendList.add(friend);

        friend = new Friend("Hello", "hello@gmail.com");
        friend = new Friend("XYZ", "xyz@mail.com");
        friendList.add(friend);

        friend = new Friend("Test", "test@gmail.com");
        friendList.add(friend);

        friend = new Friend("Hello", "hello@gmail.com");

        friendList.add(friend);

    }
}
