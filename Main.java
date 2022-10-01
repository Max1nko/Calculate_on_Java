package ru.alexanderklimov.testapplication;

import ...

public class MainActivity extends ActionBarActivity implements SubClass.MyCallback {

    private TextView mResultTextView;
    private SubClass mSubClass;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mResultTextView = (TextView)findViewById(R.id.textViewResult);

        mSubClass = new SubClass();
        mSubClass.registerCallBack(this);
    }

    public void onClick(View v) {
        mSubClass.doSomething();
    }

    @Override
    public void callBackReturn() {
        mResultTextView.setText("Вызван метод обратного вызова");
    }
}    
