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