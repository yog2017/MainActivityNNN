package com.example.ideapad.myapplicationnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


}
    
    //
//    private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        DueFragment dueFragment =new DueFragment();
//        iDataPassDue= dueFragment;
//        LateFragment lateFragment =new LateFragment();
//        iDataPassLate= lateFragment;
//        PaidFragment paidFragment =new PaidFragment();
//        iDataPassPaid= paidFragment;
//
//        String due=getResources().getString(R.string.due_lable);
//        String late=getResources().getString(R.string.late_lable);
//        String paid=getResources().getString(R.string.paid_lable);
//
//        adapter.addFragment(dueFragment, due);
//        adapter.addFragment(lateFragment, late);
//        adapter.addFragment(paidFragment, paid);
//        viewPager.setAdapter(adapter);




    }


