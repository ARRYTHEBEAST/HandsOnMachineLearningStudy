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

### Batch Normalization
Using He initialization along with ReLU can reduce the vanishing/exploding gradients problem. 
BN consists of adding an operation in the model just before or after the activation function of each hidden layer.

If BN is used at the start then there is no need for Standardiztion( all the values are in a standard scale)

BM consideratbly improved the neural networks. VG problem was reduced to the extent where even sigmoid and tanh activation functions could be used. Higher learning rates were also able to use to speed up the learning process. BN also acts as a regularizer. 

However, BN also addes some complexity to the model. THere is a runtinme penalty, the NN makes slower predicitons sue to the extra computations required at each layer. However its possible to fuse the BN layers with the previos layers after training to avoid the penalty. This is done by updating the previous layer's weights and biases so that it directly produces output of the appropriate offset and scale.

> The training time is slow because each epoch takes more time however the convergence is faster so it will take fewer epochs to reach the same perfomance. ALl in all the wall time is usually shorter. 




