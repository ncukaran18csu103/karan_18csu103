from flask import Flask, request, render_template
import pickle
import numpy as np
import pandas as pd
import cv2


app = Flask(__name__)
model = pickle.load(open('model.pkl', 'rb'))

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/predict',methods=['POST'])
def predict():
    input_features = [float(x) for x in request.form.values()]
    features_value = [np.array(input_features)]
    
    features_name = ['mean radius', 'mean texture', 'mean perimeter', 'mean area',
       'mean smoothness', 'mean compactness', 'mean concavity',
       'mean concave points', 'mean symmetry', 'mean fractal dimension',
       'radius error', 'texture error', 'perimeter error', 'area error',
       'smoothness error', 'compactness error', 'concavity error',
       'concave points error', 'symmetry error', 'fractal dimension error',
       'worst radius', 'worst texture', 'worst perimeter', 'worst area',
       'worst smoothness', 'worst compactness', 'worst concavity',
       'worst concave points', 'worst symmetry', 'worst fractal dimension']
    
    df = pd.DataFrame(features_value, columns=features_name)
    output = model.predict(df)
        
    '''
    if output == 0:
        val = "  doesn't cancer [Benign(0)]"
        img=cv2.imread("AI.jpg",1)
        cv2.imshow("image",img)
    else:
        val = "has cancer [malignant(1)]"
        img1=cv2.imread("AI.jpg",1)
        cv2.imshow("image",img1)
        '''
    return render_template('after.html', data=output)

if __name__ == "__main__":
    app.run(debug=True,port=8500)
