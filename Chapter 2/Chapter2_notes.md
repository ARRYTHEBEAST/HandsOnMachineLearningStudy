
## Chapter 2: End-To-End Machine Learning Project
Pretend to be a data scientist in a real estate company. 

### The Steps to build a AI model

- Look at the big picture
- Get the data
- Explore and visualize the data to gain insights
- Prepare data for ML algos
- Select model and train it
- Fine-Tune the model
- Present the solution
- Deploy, monitor and maintain

### Working with Real Data

> **Sources to get datasets** <br>
> 1. OpenML.org
> 2. Kaggle.com
> 3. PapersWithCode.com
> 4. UC irvines machine learning repository
> 5. Amazon's AWS database
> 6. TenserFlow Datasets
> 7. DataPortals.org
> 8. OpenDataMonitor.eu

<br>

### **Look at the big picture**

Use the California census to build a model of housing prices in the state. 

Data includes:
1. Population
2. Median Income
3. Median Housing Price
4. etc etc

### Answer Fundamental Question:
- what type of supervision to use
- what type of ML problem is this
- what learning technique should be used

### Selecting a Performance Measure

1. RMSE: Root Mean Squared Error <br>
    Preferred for Regression Tasks with less outliers 
    <br> 
2. MEA: Mean Absolute Error <br>
    Preferred when there are a lot of outliers


### Creating a Test Split

#### Stratified Sampling

``` pd.cut() ```

it creates and income category attribute from the income median column. the income categories are 5 in number and that would be used to do the stratification. 

Furthermore the sklearn library, in the model selection has splitters which can perform stratified splits.

**StratifiedShuffleSplit** :
This is one of the model which can generate multiple splits
(fold), which can be used in cross validation.

### EDA Analysis on Housing Data

1. There are mostly numerical features except one categorical feature.
2. There are few null values in one of the feature
3. After plotting the histogram we get to know:
    - The scales are very different
    - Median house value and housing median age are capped at extreme ends.
    - The data is skewed right for all features.

### Feature Engineering

Create new features by mixing and matching or doing some changes to the existing features.


### Cleaning The Data For Training

**Handling Missing Values**

1. Get rid of the corresponding values
2. Get rid of the whole feature
3. Imputation 


> #### Scikit-Learn Design
> 1. Estimators:
>Any object that can estimate some parameter based on a dataset. Estimation is performed by 
    ```fit()```
> 2. Transformers:
>Something that transforms the dataset. The transformation is done by ```transform()``` or ```fit_transform()``` so that the ```fit()``` and ```transform()``` runs simultaneoulsy.
> 3. Predictors: 
> Something that makes prediction, given a dataset. It predicts using the ```predict()``` function. It also has ```score()``` that measures the quality of the prediction.
> 4. Inspection:
> It can access the estimator's hyperparameters and parameters via public instance variables with an underscore suffix.

#### SimpleImputer 
This is called from scikit-learn it is a transformer cum estimator. the ```fit()``` function is called  to calulate the median or anything according to the 'strategy' that is being used. Then the imputer will impute values in the empty places.

#### OneHotEncoder
This is used to encode categorical data and convert it to a machine that algo can understand. 


#### OneHotEncoder vs Ordinal Encoder

#### OneHotEncoder vs pd.getDummies()

### Feature Scaling

This brings all the numerical attributes to a simmilar scale so that the ML model wont prefer one attribute just becaues it has a higher numerical value. 

>#### **Warning** <br>
>the scalers should always be fit to the training data and never on the test data or any other dataset. After training the scaler, we can just use the ```transform()``` function on the test dataset or the validation dataset or anyother dataset. 

There are two types of scaling:
1. Min-Max Scaling(Normalization):
<br>
Here the data is converted into a range of 0 to 1. This is done by subtracting the min value and divinding by the difference between the min and the max. This is done using Scikit Learn's ```MinMaxScaler()``` transformer. 
2. Standardization
<br>
Here it subtracts the mean calue then divides the result by standard deviation. It is less affected by outliers. This is done by using ```StandardScaler()``` again from scikitlearn. 

#### Heavy-Tail distribution 
This is when values far from the mean are not expoenetially rare. This time both the feature scaling techinque will squash the valeus into small range. Therefore the Heavy-Tail has to be managed and should be made symmetrical. 

To do this 
1. we can replace the feature to with heavy tail to the right is to replace the data with square root.

2. Bucketizing:
    Chopping its distribution into roughly equal-sized buckets.

### RBF_Kernel

### Transformed Target Regressor and Inverse Transform:

Using the transformers only the input features have been scaled. Therefore the prediction labes will have to undergo an 'inverse trandform' so that the scaled prediction lables of the model is understandable to us. 

this can be done using ```inverse_transform()``` function from scikit-learn

Moreover, ```TransformedTargetRegressor()``` can also be used from the same library. This applies the scaler and the inverse trandform by itself. 

#### Custon Transformers:

These are needed for:
1. CleanUp Opertations
2. Combining Specific Attributes

It can be done by writing your own classses transformers. 

>refer the code section

### Transformation Pipelines:
There are many transformation that need to be done on the data. Now instead of writing each of the transformation by function and calling that function one by one. We just can use sklearn's pipelines which helps us sequence the transformations.

### Cross-Validation:

This technique makes n number of 'folds' or n number of different combination of training sets and validation sets. then the model is trained for n number of times using n-1 folds for training and the remaining nth fold for validation. This is repeated n times. 

### FineTuning The Model:
FineTuning is the process of optimizing the model hyperparameters (HyperParameter Tuning). 

There are two ways to do this:
1. Grid Search:

Exploring few combinations. 

2. Random Search:   
When the hyperparameter search space is large.

### Ensembling The Models:
This technique combines the models that performs the best. 






























