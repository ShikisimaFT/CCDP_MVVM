package ac.id.unikom.tryccdp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class Celsius {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public Double toReamur() {return  0.8 * celsius;
    }

    public Double toFahrenheit() {return (1.8 * celsius) + 32;
    }
}
