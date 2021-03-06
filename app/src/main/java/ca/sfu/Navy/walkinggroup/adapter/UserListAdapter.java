package ca.sfu.Navy.walkinggroup.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import ca.sfu.Navy.walkinggroup.R;
import ca.sfu.Navy.walkinggroup.model.SavedSharedPreference;
import ca.sfu.Navy.walkinggroup.model.ServerProxy;
import ca.sfu.Navy.walkinggroup.model.ServerProxyBuilder;
import ca.sfu.Navy.walkinggroup.model.User;



public class UserListAdapter extends ArrayAdapter<User> {

    private Context mcontext;
    private List<User> userList = new ArrayList<>();
    private String userName;
    private String userEmail;
    private ServerProxy proxy;


    public UserListAdapter(@NonNull Context context, List<User> list){
        super(context, 0, list);
        mcontext = context;
        userList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(mcontext).inflate(R.layout.user_list, parent, false);
        }

        User currentUser = userList.get(position);

        TextView userName = (TextView) listItem.findViewById(R.id.User_text_name);
        userName.setText(currentUser.getName());

        TextView userEmail = (TextView) listItem.findViewById(R.id.User_text_email);
        userEmail.setText(currentUser.getEmail());


        return listItem;
    }


}
