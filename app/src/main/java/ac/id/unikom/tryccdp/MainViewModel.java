package ac.id.unikom.tryccdp;

import  androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import  androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel{
    private MutableLiveData<Celsius> model;

    public MainViewModel(){
        this.model = new MutableLiveData<>();
    }

    public LiveData<Celsius> getModel(){
        return this.model;
    }

    public void calculate(String celsius){
        if(celsius.isEmpty()){
            celsius = "0";
        }

        double  parsedCelsius  = Double.parseDouble(celsius);
        Celsius celsius1 = new Celsius();
        celsius1.setCelsius(parsedCelsius);

        this.model.setValue(celsius1);
    }
}
