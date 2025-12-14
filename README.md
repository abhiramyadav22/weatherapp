# 🌤️ JavaFX Weather Forecast Application

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/JavaFX-20-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Maven-Build-brightgreen?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/License-MIT-purple?style=for-the-badge"/>
</p>

<p align="center">
  A modern JavaFX desktop application that fetches real-time weather data using the OpenWeatherMap API.  
  Designed as an <b>internship-ready, portfolio-quality project</b> with clean architecture and real-world practices.
</p>

---

## ✨ Highlights (Why this project matters)

✔ Real-time API integration (not dummy data)  
✔ Clean MVC-style separation (Controller / Service / Model)  
✔ JavaFX + FXML (industry-relevant desktop UI)  
✔ Maven-managed build (professional workflow)  
✔ Error handling & user feedback  
✔ Ready for extension (forecast, caching, native builds)

This is not a “college assignment”. This is a **production-style mini application**.

---

## 🖥️ Application Preview

> 📝 Tip: Add screenshots or a GIF later under `/docs`
- Desktop UI with city input
- Weather icon rendering
- Live temperature, humidity, wind & condition
- Status feedback (success / error)

---

## 🚀 Features

- 🌍 Search weather by city name
- 🌡️ Displays temperature (°C) and feels-like temperature
- 💧 Shows humidity percentage
- 🌬️ Displays wind speed
- ☁️ Weather condition text & icon
- ⚠️ Graceful error handling (invalid city / API issues)
- 🧼 Clean UI with JavaFX + FXML

---

## 🛠️ Tech Stack

| Layer | Technology |
|------|-----------|
| Language | Java 17+ |
| UI | JavaFX 20 |
| Layout | FXML |
| Build Tool | Maven |
| JSON Parsing | Gson |
| API | OpenWeatherMap |
| IDE | IntelliJ IDEA |

---

## 📁 Project Structure

weatherapp/
├── pom.xml
├── README.md
├── LICENSE
└── src/
└── main/
├── java/
│ └── com/abhi/weatherapp/
│ ├── app/
│ │ └── MainApp.java
│ ├── controller/
│ │ └── WeatherController.java
│ ├── service/
│ │ └── WeatherService.java
│ ├── model/
│ │ ├── WeatherResponse.java
│ │ ├── Weather.java
│ │ ├── Main.java
│ │ └── Wind.java
│ └── util/
│ └── ApiConfig.java
└── resources/
└── weather.fxml


🧪 Testing & Quality

Input validation for empty city

Exception handling for network/API failures

UI status feedback for user clarity

🧩 Future testing ideas:

Mock API responses

Unit tests for WeatherService

UI tests using TestFX

🔮 Future Improvements

5-day weather forecast

Unit toggle (°C / °F)

Offline cache

Dark mode UI

Native installer using jpackage

CI pipeline with GitHub Actions

📜 License

This project is licensed under the MIT License.
Free to use, modify, and distribute.

👨‍💻 Author

Abhiram Yadav
📧 Email: abhiramyadav002@gmail.com

🔗 GitHub: https://github.com/abhiramyadav22

🎯 Internship-Ready Summary (For Recruiters)

Real API usage (OpenWeatherMap)

JavaFX desktop application

Maven-based professional setup

Clean architecture & readable code

Easy to run and extend
