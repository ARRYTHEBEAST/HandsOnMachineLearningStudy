from flask import Flask
import os
app = Flask(__name__)

@app.route('/',methods=['GET'])
def home():
    return "hello world"

if __name__ == '__main__':
    app.run(debug=True, port=5000)
