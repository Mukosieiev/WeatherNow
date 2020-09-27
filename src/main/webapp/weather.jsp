<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Weather</title>
        <link rel="stylesheet"
              href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins"
              rel="stylesheet" />
        <style>
            * {
                font-family: poppins;
            }
        </style>
    </head>
    <body style="background: #5DADE2;">
        <div class="text-center my-5 py-5">
            <div class="d-flex justify-content-center">
                <form class="col-md-4" action="/getTemp" method="GET">
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" name="cityname"
                               placeholder="City name">
                        <div class="input-group-append">
                            <button class="btn btn-success" type="submit">Search</button>
                        </div>
                    </div>
                </form>
            </div>
            <p class="lead">${weatherData.name}, ${weatherData.sys.country} Weather</p>
            <p class="text-secondary">as of ${weatherData.date}</p>
            <p class="display-4">${weatherData.main.temp}°</p>
            <p><img src="images/${weatherData.weather.icon}.png" width="50" height="50" /></p>
            <p class="lead">${weatherData.weather.main}</p>
            <div class="d-flex justify-content-center">
                <div class="col-md-6">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="row my-1">
                                <div class="col-md-6 text-left">High / Low</div>
                                <div class="col-md-6 text-right">${weatherData.main.temp_min}°/${weatherData.main.temp_max}°</div>
                            </div>
                            <div class="row my-1">
                                <div class="col-md-6 text-left">Humidity</div>
                                <div class="col-md-6 text-right">${weatherData.main.humidity}%</div>
                            </div>
                            <div class="row my-1">
                                <div class="col-md-6 text-left">Pressure</div>
                                <div class="col-md-6 text-right">${weatherData.main.pressure}in</div>
                            </div>
                            <div class="row my-1">
                                <div class="col-md-6 text-left">Sunrise</div>
                                <div class="col-md-6 text-right">${weatherData.sys.sunrise}</div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="row my-1">
                                <div class="col-md-6 text-left">Visibility</div>
                                <div class="col-md-6 text-right">${weatherData.visibility} mi</div>
                            </div>
                            <div class="row my-1">
                                <div class="col-md-6 text-left">Wind</div>
                                <div class="col-md-6 text-right">${weatherData.wind.speed} mph</div>
                            </div>
                            <div class="row my-1">
                                <div class="col-md-6 text-left">Feels Like</div>
                                <div class="col-md-6 text-right">${weatherData.main.feels_like}°</div>
                            </div>
                            <div class="row my-1">
                                <div class="col-md-6 text-left">Sunset</div>
                                <div class="col-md-6 text-right">${weatherData.sys.sunset}</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
            <script
            src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
            <script
            src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>