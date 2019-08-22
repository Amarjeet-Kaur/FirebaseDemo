package com.myappnew.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class andro_bubble extends AppCompatActivity {
    List<model> list =new ArrayList<>();
    DatabaseReference mMessageReference;
    ChildEventListener mMessageListener;
    RecyclerView recyclerView;

    Recycler_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_download);

        recyclerView = (RecyclerView)findViewById(R.id.rv_firebase);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

// get reference to 'users' node
        mMessageReference = FirebaseDatabase.getInstance().getReference("data_link");
    }
    @Override
    public void onStart() {
        super.onStart();

        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildName) {
// A new message has been added
// onChildAdded() will be called for each node at the first time
                model message = dataSnapshot.getValue(model.class);
                list.add(message);
                adapter = new Recycler_Adapter(andro_bubble.this,list);
                recyclerView.setAdapter(adapter);



            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String previousChildName) {
                Log.e( "onChildChanged:" , dataSnapshot.getKey());

// A message has changed
                model message = dataSnapshot.getValue(model.class);
                Toast.makeText(andro_bubble.this, "onChildChanged: " + message.title, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                Log.e("onChildRemoved:" , dataSnapshot.getKey());

// A message has been removed
                model message = dataSnapshot.getValue(model.class);
                Toast.makeText(andro_bubble.this, "onChildRemoved: " + message.title, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String previousChildName) {
                Log.e("onChildMoved:" ,dataSnapshot.getKey());

// A message has changed position
                model message = dataSnapshot.getValue(model.class);
                Toast.makeText(andro_bubble.this, "onChildRemoved: " + message.title, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e("postMessages:onCa", databaseError.toException()+"");

            }
        };

        mMessageReference.addChildEventListener(childEventListener);

// copy for removing at onStop()
        mMessageListener = childEventListener;
    }

    @Override
    public void onStop() {
        super.onStop();

        if (mMessageListener != null) {
            mMessageReference.removeEventListener(mMessageListener);
        }

        for (model message: list) {
            Log.e("listItem: " ,message.title);
        }
    }

}
