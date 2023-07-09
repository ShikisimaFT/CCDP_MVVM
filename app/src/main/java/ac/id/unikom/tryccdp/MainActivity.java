package ac.id.unikom.tryccdp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText celsius;
    private EditText fahrenheit;
    private EditText reamur;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this ).get(MainViewModel.class);
        initView();
        setupObserver();
    }

    private void setupObserver(){
        viewModel.getModel().observe(this,model -> {
            this.fahrenheit.setText(model.toFahrenheit() + "");
            this.reamur.setText(model.toReamur() + "");
        });
    }

    private void initView() {
        celsius = findViewById(R.id.celsius);
        fahrenheit = findViewById(R.id.fahrenheit);
        reamur = findViewById(R.id.reamur);

        celsius.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                viewModel.calculate((editable.toString()));
            }
        });
    }

}