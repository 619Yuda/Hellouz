package tn.zoppolis.hellouz;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import tn.zoppolis.hellouz.R;

/**
 * Created by oussa on 30/06/2017.
 */

public class FragTime  extends DialogFragment {
    OnFragmentSendText mSendText;
    String send_text= "bedoui";

    public interface OnFragmentSendText{
        public void onSentText(String text);
    }


    public void onAttach(Activity activity){
        super.onAttach(activity);

        try{
            mSendText = (OnFragmentSendText)activity;
        } catch(ClassCastException e){
            throw new ClassCastException(activity.toString() + " must implement OnFragmentSendText");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dialog_time, container, false);
        getDialog().setTitle("Simple Dialog");


        Button button  = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                mSendText.onSentText(send_text);
                dismiss();              }
        });

        return rootView;
    }


}

