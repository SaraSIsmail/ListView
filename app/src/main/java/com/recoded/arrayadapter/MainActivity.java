package com.recoded.arrayadapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.recoded.arrayadapter.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;

    ArrayList <Contact>  contact= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b= DataBindingUtil.setContentView(this,R.layout.activity_main);

        contact.add(new Contact("sara","07503785778","sarasafar47@gmail.com",R.drawable.ic_person_red_24dp));
        contact.add(new Contact("lana","0750898978","lana@gmail.com",R.drawable.ic_person_yellow_24dp));
        contact.add(new Contact("fri","07503789388","frishta@gmail.com",R.drawable.ic_person_green_24dp));
        contact.add(new Contact("baran","0750121212","baran@gmail.com",R.drawable.ic_person_black_24dp));
        contact.add(new Contact("warin","07501115778","warin@gmail.com",R.drawable.ic_person_blue_24dp));
        contact.add(new Contact("warin","07501115778","warin@gmail.com",R.drawable.ic_person_blue_24dp));
        contact.add(new Contact("warin","07501115778","warin@gmail.com",R.drawable.ic_person_blue_24dp));
        contact.add(new Contact("warin","07501115778","warin@gmail.com",R.drawable.ic_person_blue_24dp));
        contact.add(new Contact("warin","07501115778","warin@gmail.com",R.drawable.ic_person_blue_24dp));

        ContactAdapter adapter = new ContactAdapter(this,R.layout.contactview, contact);
        b.listview.setAdapter(adapter);
    }

}

class  ContactAdapter  extends ArrayAdapter<Contact>{

    private Context context;
    private int LayoutId;
    private List<Contact> contacts ;

    public ContactAdapter (Context context , int LayoutId , List<Contact>contacts){
        super(context , LayoutId , contacts);
        this.context=context;
        this.LayoutId=LayoutId;
        this.contacts=contacts;
        
    }
    @NonNull
    @Override
    public View getView(int position , @Nullable View convertView , @NonNull ViewGroup parent){
        if(convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView=layoutInflater.inflate(LayoutId,null);
        }
        ImageView image=(ImageView)convertView.findViewById(R.id.image);
        TextView name=(TextView)convertView.findViewById(R.id.name);
        TextView phone=(TextView)convertView.findViewById(R.id.phone);
        TextView email=(TextView)convertView.findViewById(R.id.email);

        Contact cont= contacts.get(position);

        image.setImageResource(cont.getImage());
        name.setText(cont.getName());
        phone.setText(cont.getPhone());
        email.setText(cont.getEmail());
     return  convertView;
    }

}