# Revision Through BookClub Videos

[Link To Video](https://youtu.be/FipyCGhvOC4?list=PLheFoa5iXad7r2AhM3mwGr3t_GUGumQC2)


#### Okay so the first thing that we have to do oin a a project is SELECT A PERFORMACE MEASURE. but why?

So performace metrics are used to evaluate a models performance.

Here in this case. The RMSE, MAE are both the loss function(which trains the model to optimize parametes) and it is also used as the evaluation metric to know how the model has trained.


### RMSE vs MAE
RMSE:

Difference between the predicted label vs True Label, this is rooted. then it is squared. Basically shows the **error which is root averaged and squared**

Advantage:
1. Differentiable
2. Local minima global minima
3. Robust to outliers as it is squared
4. It has same units as it is rooted


Mean Squared Error(MSE):

Advantage:
1. It is differentialble, derivative can be calculated.
2. It has one local minima and one global minima

Disadvantage:
1. Not robust to Outliers.
2. It changes its units. If the "y" the error value is a numeric label like 'salary' then the error will make it sqr(y-yhat). This means salary becomes salary squared.

Mean Absolute Error (MEA):

Advantage:
1. Robust to Outliers
2. It will be same unit.

Disadvantage:
1. Convergence usually takes time.
2. Optimization is complicated.

### RMSE and Confidence Interval

Confidence interval is the range within which the values are expected to lie. Lower the RMSE smaller the confidence interval.

>Instead of Mean **squared** error, can we not have some other index, like **cube** or some higher power?

### Train Test Split

When we want to split the data into train and test in an production environemt where the data keeps increasing and the dataset grows. It is necessary always for the same data to be split in the same way. One way to do this is use the index to keep track and other way is to do **hashing**.

#### Stratified Sampling:
This is really import to do cross validation, and proper validation. 

we just have to stratify with respect to one colunm. That can be the class distrtibution. and that we can create for continious dataset using ```pd.cut()``` we can create multiple bins which will funcitons as our class

### sklearn object design:

Estimators: any object that can estimate using the dataset. Has ```fit()``` method.
Transformers: any object that can transform the dataset. has ```transform()``` method.
Predictors: any object that can make predictions on the dataset. has ```predict()``` or ```score()``` methods.

### Imputing the missing or NA values:
This can be done by ```simpleimputer()``` and by selecting appropriate strategy.

### Encoding Categorical Values:

OneHotEncoder should be used. 

### Custom Transformers (Little Hard):




