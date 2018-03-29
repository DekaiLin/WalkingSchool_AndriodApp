package ca.sfu.Navy.walkinggroup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.gms.maps.model.LatLng;

import ca.sfu.Navy.walkinggroup.model.SavedSharedPreference;
import ca.sfu.Navy.walkinggroup.model.User;

/**
 * Created by lirongl on 2018-03-13.
 */

public class SecondMessageFragment extends AppCompatDialogFragment {

    private LatLng location;
    private long groupID;
    private User user;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.custom_info_window,null);

        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                switch (which){
                    case DialogInterface.BUTTON_NEGATIVE:
                        Log.i("MyApp","YOU CLICK THE Close the window");
                        break;
                }
            }
        };

        return new AlertDialog.Builder(getActivity())
                .setTitle("Question")
                .setView(v)
                .setNegativeButton("Close the window", listener)

                .create();
    }
}
