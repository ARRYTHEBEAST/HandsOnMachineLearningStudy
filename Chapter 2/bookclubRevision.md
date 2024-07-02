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



