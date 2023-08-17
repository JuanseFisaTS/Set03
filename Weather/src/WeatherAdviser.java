public class WeatherAdviser {

    public String provideWeatherAdvisory(int temperature) {
        // TODO: Provide a weather advisory message based on the temperature.
        if (temperature<0){
           return "It's freezing! Wear a heavy coat.";
        }
        if (temperature>=0 && temperature <=10){
           return "It's cold! Bundle up.";
        }
        if (temperature>10 && temperature <=20){
           return "It's cool! A light jacket will do.";
        }
        if (temperature>20){
           return "It's warm! Enjoy the day.";
        }
        return "";
    }
}