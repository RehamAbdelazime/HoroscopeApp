package com.general_pc.zodiac;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class FindSign extends Fragment {

    private Spinner months_spinner, days_spinner, years_spinner;
    private Button submitBtn;

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
            public void onClick(View v) {
                Toast.makeText(view.getContext(), "months: "+ String.valueOf(months_spinner.getSelectedItem()) +
                                " days: "+ String.valueOf(days_spinner.getSelectedItem())
                                +" years: "+ String.valueOf(years_spinner.getSelectedItem())
                        , Toast.LENGTH_SHORT).show();
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
