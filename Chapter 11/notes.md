# Chapter 11: Training Deep Neural Networks
> just a footnote. I am again going to start my ML journey from today, there has been a large gap of almost a month now.

### Problems in Training a Deep Neural Network
1. Gradient growing smaller or larger
2. Not enough training data for a large network.
3. Training may be slow
4. Overfitting the training set 


### Vanishing/Exploding Gradient Problem
The backpropagation's second phase works by going from the output layer to the input layer, propagating the error gradient along the way. 

Sigmoid activation function cause this problem. (sigmoid transforms the output to 0 to 1). 

To solve this just use ReLU. However ReLU has its own problems like dying relu here the neuron will just output a zero. therefore leaky relu is used. But that too has a problem that it is not smooth. and its derivative abruptly change this makes the gradint descent bounce around the optimum and slow down the convergence.  To solve this ELU and SELU are used which are the smooth variants of ReLU.

The expoenetial linear unit(ELU):
this outperformend all the relu variants.
