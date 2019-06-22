package com.reham.zodiac.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.reham.zodiac.Fragments.Dialogs.SignFragment;
import com.reham.zodiac.R;

public class FindSign extends Fragment {

    private Spinner months_spinner, days_spinner, years_spinner;
    private Button submitBtn;

    private String sign;

    public FindSign() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =  inflater.inflate(R.layout.fragment_find_sign, container, false);

        // Handle DropDown Lists
        months_spinner = view.findViewById(R.id.month_spinner);
        days_spinner = view.findViewById(R.id.day_spinner);
        years_spinner = view.findViewById(R.id.year_spinner);

        addItemsOnMonthsSpinner();
        addItemsOnDaysSpinner();
        addItemsOnYearsSpinner();

        // Handle the button
        submitBtn = view.findViewById(R.id.submitBtn);

        // Click Event Listener to Send data to BackEnd
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if ((months_spinner.getSelectedItemId()+1) == 1)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 19)
                    {
                        sign = "Capricorn";
                    }else
                    {
                        sign = "Aquarius";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 2)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 18)
                    {
                        sign = "Aquarius";
                    }else
                    {
                        sign = "Pisces";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 3)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 20)
                    {
                        sign = "Pisces";
                    }else
                    {
                        sign = "Aries";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 4)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 19)
                    {
                        sign = "Aries";
                    }else
                    {
                        sign = "Taurus";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 5)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 20)
                    {
                        sign = "Taurus";
                    }else
                    {
                        sign = "Gemini";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 6)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 20)
                    {
                        sign = "Gemini";
                    }else
                    {
                        sign = "Cancer";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 7)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 22)
                    {
                        sign = "Cancer";
                    }else
                    {
                        sign = "Leo";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 8)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 22)
                    {
                        sign = "Leo";
                    }else
                    {
                        sign = "Virgo";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 9)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 22)
                    {
                        sign = "Virgo";
                    }else
                    {
                        sign = "Libra";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 10)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 22)
                    {
                        sign = "Libra";
                    }else
                    {
                        sign = "Scorpio";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 11)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 21)
                    {
                        sign = "Scorpio";
                    }else
                    {
                        sign = "Sagittarius";
                    }
                }else if ((months_spinner.getSelectedItemId()+1) == 12)
                {
                    if ((days_spinner.getSelectedItemId()+1) <= 22)
                    {
                        sign = "Sagittarius";
                    }else
                    {
                        sign = "Capricorn";
                    }
                }
                FragmentManager fm  = getFragmentManager();
                SignFragment signFragment = new SignFragment();

                Bundle b = new Bundle();
                b.putString("sign", sign);
                signFragment.setArguments(b);

                signFragment.show(fm, "signFragment");
            }
        });

        return view;
    }
    // Fill The Spinners with the string arrays declared in the strings.xml
    public void addItemsOnMonthsSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.months
                , R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        months_spinner.setAdapter(adapter);
    }
    public void addItemsOnDaysSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.days
                , R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        days_spinner.setAdapter(adapter);
    }
    public void addItemsOnYearsSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.years
                , R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        years_spinner.setAdapter(adapter);
    }
}
