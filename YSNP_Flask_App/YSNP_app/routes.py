from flask import render_template
from app import app

@app.route("/")
def home():
    return "Hello, World!"

@app.route("/hello/<name>")
def hello(name):
    return render_template('hello.html', name=name)