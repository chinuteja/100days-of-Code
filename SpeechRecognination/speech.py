import datetime
import pyttsx3
import speech_recognition as sr
import time
import os
import wikipedia
import webbrowser
import smtplib
engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
# print(voices)
#for male voice
# print(voices[0].id)
#for female voices
# print(voices[1].id)
engine.setProperty('voices',voices[0].id)
def speak(audio):
    engine.say(audio)
    engine.runAndWait()
def wishMe():
    hour = int(datetime.datetime.now().hour)
    if hour >=0 and hour <12:
        speak("Good Morning")
    if hour >=12 and hour < 15:
        speak("Good Afternoon")
    if hour >= 15 and hour < 19:
        speak("Good Evening")
    else:
        speak("Good Night")
    speak("I am Jarvis please Say me how can I help you")
def takeCommand():
    ''' it takes the command'''
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening")
        r.pause_threshold = 1
        audio = r.listen(source)
    try:
        print("Recognizing...........")
        query = r.recognize_google(audio,language= 'en-in')
        print("User said :",query)
    except Exception as e:
        print(e)
        print("Say that again")
        return "None"
    return query
def sendEmail(to,content):
    pass

def main():
    # wishMe()
    # speak("My name is Chinu")
    wishMe()
    while True:
        query = takeCommand().lower()
        if "wikipedia" in query:
            speak("Searching wikipedia...")
            query = query.replace("wikipedia","")
            results = wikipedia.summary(query,sentences = 2)
            speak("According to wikipedia")
            # print(results)
            speak(results)
        elif "open youtube" in query:
            webbrowser.open("youtube.com")
        elif "open geeksforgeeks" in query:
            webbrowser.open("geeksforgeeks.org")
        elif "play music" in query:
            music_dir = "D:\\music\\Dhoom-3-2013-128Kbps(Songs.PK)"
            songs = os.listdir(music_dir)
            print("songs",songs)
            for i in range(len(songs)):
                os.startfile(os.path.join(music_dir,songs[i]))
                time.sleep(300)
        elif "the time" in query:
            startTime = datetime.datetime.now().strftime("%H:%M:%S")
            speak(f"Sir the current time is {startTime}")
        # elif "email to Chinu" in query:
        #     try:
        #         speak("What should I say")
        #         content = takeCommand()
        #         to = "chinuteja2008@gmail.com"
        #         sendEmail(to,content)
        #         speak("Email has been sent")
        #     except Exception as e:
        #         print(e)
        #         speak("Sorry I am not able to send this email")
        elif "quit" in query:
            speak("I am quiting")
            break
    
if __name__ == '__main__':
    main()