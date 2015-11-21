package com.dariel.cruz.modern_art_ui.dialogs;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.dariel.cruz.modern_art_ui.R;
import com.dariel.cruz.modern_art_ui.activities.MainActivity;

/**
 * Created by Dariel on 11/21/15.
 */
public class AlertDialogFragment extends DialogFragment {


    public static AlertDialogFragment newInstance(){
        return new AlertDialogFragment();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        return new AlertDialog.Builder(getActivity())
                .setMessage(R.string.alert_message)
                .setCancelable(false)
                .setPositiveButton(R.string.visit_moma, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((MainActivity) getActivity()).onDialogPositive();
                    }
                })
                .setNegativeButton(R.string.not_now, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((MainActivity) getActivity()).onDialogNegative();
                    }
                }).create();
    }
}
