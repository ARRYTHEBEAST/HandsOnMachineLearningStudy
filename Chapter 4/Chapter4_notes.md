# Chapter 4: Training Models

Two ways of solving a problem:

1. CLosed Form solution: This directly computes the mdoel parameters that best fit the model to the training set. 

2. Using an 'Iterative Optimization' approach, called as 'Gradient Descent'.

Shit, the author has asked for the reader to go through linear algebra, partial derivatives. So refer to the notebook called.

## Linear Regression

In chapter 1 ther was a simple linear regression of life satisfaction:

life_satisfaction = theta0 + theta1 x GDP_per_capita

> learning algorithms will optimize a different loss funcitn during training than the final model's performance measure. 

## Cost Funtion:
the model will try to minimixe the cost funtion to make sure that the parametrs allow the model to fit the data. 

<br>

### Normal Equatiton
So linear regression can be trained with a closed form solution, This is lnown as the Normal Equation. This directly gives the values of both the parameters.

### Gradient Descent:
This is a generic optimization algorithm capable of finding solutions to a wide range of problems. This is an iteration based algorithm. 

First it starts via a random initialization. Then you imporve it gradually by attempting to decrease the cost funciton.


### Batch Gradient Descent

To implemet gradient descent you need to compute the cost function with regard to each model parameter (theta).
This will require me to calculate the 'Partial Derivative'

Then instead of calculating partial derivatives individually of all feature. All the partial derivatives are calculated in one go using a 'gradient vector'.

This formula involves calculations over the full training set at each gradient descent.

### Mini-Batch Gradient Descent
This is simmilar in fucntion to batch gradient descent, but here instead of using the full training dataset only the specified amount of data is used. This is the unique difference in this and the previous techniques. 

### Stochastic Gradient Descent:
This implementaion of gradient descent involves using only one data point and estimating.
This picks up ransom instance in the training set at every step and computes the gradients based only on that single instance.

But due to the stochastic(random) nature. The regularity of the algotithm is very less. The model will not converge at a single point and it will keep jittering at the minima.

Due to this nature however SGD has more chances to escape the local minima and find the global minima. 

## Learning Curves:
learning curves plots the value of training and validation errors iteratively in some time intervals. 
This is done by either partial_fit() or by training the model with increaseing the data iteratively. 

```learning_curve()```
## Bias/Variance trade off

The model's generalization error can be expressed as teh sum of three erros:

Bias:
This is due to wrong assumptions, such as assuming the data is linear.
Good Model Should Have low bias. 

Variance:
Models excessive sensitivity to small variations in the training data.
Good Model should have low variance. 

Irreducible error:
THis is due to the noisiness of the data. 

Increasing a models complexity will increase its variance and resuce its bias. Reducing a models complexity will increase the bias and reduce its variance. This is the trade off.

## Regularized Linear Models:
A good way to handle overfitting is to regularize the modle. 

Regularization of polynomial models is to reduce the number of polynomial degree.

### Ridge Regression:
This is the regularixed version of linear regression. The regularization term added to the MSE(cost function) forces the learning to fit the data while keeping the weights small. 

The added parameter: ```lambda*x*sqr(Slope)```


this used the l2 norm.


### Lasso Regression:
Least absolute shrinkage and selection operator. 

The added parameter: ```|lambda|*x*sqr(Slope)```
This also helps to do feature selection.
This uses the l1 norm
Lasso performs well when there are many number of features.

### Elastic Net Regression

It is a middle ground between ridge and lasso.
The added parameter, term is weighted sum of both ridge and lasso regularization terms. and the mix ratio is controlable. 'r'


### When to use what:

1. Only regression is never reccomended, some form of regularization is reccomended. 
2. Ridge is a good default
3. If you suspect few features are not useful use Lasso.
4. Elastic Net is preffered over Lasso. 

### Early Stopping:
Stop straining as soon as the validation error reaches a minimum.

## Logistic Regression

This is a regression model which is used for classification tasks.

How does this work?

    Model computes a weighted sum of the input features, however it outputs a the logistic of this result.
    



