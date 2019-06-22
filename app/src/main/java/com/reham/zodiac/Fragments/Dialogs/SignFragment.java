package com.reham.zodiac.Fragments.Dialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.reham.zodiac.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignFragment extends DialogFragment
{

    private FragmentActivity context;

    public SignFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_sign, null);

        ImageView img_sign = view.findViewById(R.id.img_sign);
        TextView tv_sign = view.findViewById(R.id.tv_sign);
        Button btn_ok= view.findViewById(R.id.btn_ok);
        TextView tv_sign_description = view.findViewById(R.id.tv_sign_description);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });

        Bundle extras = getArguments();
        try {
            if (extras != null) {
                String sign = extras.getString("sign");
                tv_sign.setText(sign);

                if (sign.equals("Capricorn"))
                {
                    img_sign.setImageResource(R.drawable.capricorn);
                    tv_sign_description.setText(getResources().getText(R.string.capricorn_description));
                } else if (sign.equals("Aquarius"))
                {
                    img_sign.setImageResource(R.drawable.aquarius);
                    tv_sign_description.setText(getResources().getText(R.string.aquarius_description));
                } else if (sign.equals("Pisces"))
                {
                    img_sign.setImageResource(R.drawable.pisces);
                    tv_sign_description.setText(getResources().getText(R.string.pisces_description));
                } else if (sign.equals("Aries"))
                {
                    img_sign.setImageResource(R.drawable.aries);
                    tv_sign_description.setText(getResources().getText(R.string.aries_description));
                } else if (sign.equals("Taurus"))
                {
                    img_sign.setImageResource(R.drawable.taurus);
                    tv_sign_description.setText(getResources().getText(R.string.taurus_description));
                } else if (sign.equals("Gemini"))
                {
                    img_sign.setImageResource(R.drawable.gemini);
                    tv_sign_description.setText(getResources().getText(R.string.gemini_description));
                } else if (sign.equals("Cancer"))
                {
                    img_sign.setImageResource(R.drawable.cancer);
                    tv_sign_description.setText(getResources().getText(R.string.cancer_description));
                } else if (sign.equals("Leo"))
                {
                    img_sign.setImageResource(R.drawable.leo);
                    tv_sign_description.setText(getResources().getText(R.string.leo_description));
                } else if (sign.equals("Virgo"))
                {
                    img_sign.setImageResource(R.drawable.virgo);
                    tv_sign_description.setText(getResources().getText(R.string.virgo_description));
                } else if (sign.equals("Libra"))
                {
                    img_sign.setImageResource(R.drawable.libra);
                    tv_sign_description.setText(getResources().getText(R.string.libra_description));
                } else if (sign.equals("Scorpio"))
                {
                    img_sign.setImageResource(R.drawable.scorpio);
                    tv_sign_description.setText(getResources().getText(R.string.scorpio_description));
                } else if (sign.equals("Sagittarius"))
                {
                    img_sign.setImageResource(R.drawable.sagittarius);
                }
            } else {
                Toast.makeText(context, "Error finding data", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception ex)
        {
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }

        builder.setView(view);
        return builder.create();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign, container, false);
    }

}
