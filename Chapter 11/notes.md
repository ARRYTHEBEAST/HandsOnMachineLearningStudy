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

BN is omitted in the architecture diagrams because its assumed that it is added after every layer. 

### Gradient Clipping:

This technique too mitigate the exploding gradient problem. It clip the gradient during backpropagation so that they never exceed some threshold. This is used in RNN's. This will clop every component of the gradient vector between -1 and 1. This means that all the partial dericatives of the loss. This threshold is a tunable hyperparameter. 

### Reusing Pretrained Layers

this is also called transfer learning. If you can access a DNN then the layers can be used. the more similar the tasks are the more layers should be shared. For very similar tasks use all the hiden-layer and just replace the output layer. 

1. Freeze all the resued layers so that theur weights become non trainable so that gradient descent won't modify them and they will remain fixed. then if the performance is low then try unfreezong some of the layers to that backprop tweaks them.

Well turns out transfer learning does not work....
However it does work! but it works when with large dense networks not with small dense networks.

### Unsupervised Pretraining

if you have less training (unlabled) data and cant find a pretrained model, then unsupervised pretraining can be performed. This is the way where an unsupervised model such as an autoencoder or a generative adversarial network.

### Pretraining on an Auxiliary Task
Ill just give a example: If you want to create a model to detect faces, then you will need a model which can detect faces using a few images. 100's of images of each person is not possible. So you can gather a lot of pictures on the web and train a neural netwok to detect whether or not two different pictures feature detectors for faces.


## Faster Optimizers:

Training a very large newural network can be painfully slow. So far we have seen four ways to speed up training:

1. Applying a good initialization strategy for the conection weights
2. Using a good activation function using batch normalization
3. Reusing parts of a pretrained network

Another boost comes from using a faster optimizers than the regular gradient descent optimizer.

### Momentum

Regular GD will take small steps when the slope is gentle and big steps when the slope is steep but it will never pick up speed.  This makes the regular GD very slow.

The momentum algorithm uses another hyperparameter, called momentum which adds friction to the 'momentum' feature of the algorithm. 

The most common value of momentum is 0.9 and in practice it works better always.

### Nesterov Accelerated Gradient

This one is even faster than the regular momentum optimization.

### AdaGrad

This algo decays the learning rate, it is adaptive learning rate. This helps point the resulting updates more directly toward the global optimum. 

AdaGrad frequently performs well for simple quadratic problems but not so for Deep Learning. WTF. So dont use AdaGrad in DL, use it in Linear Regression instead.

### RMSProp

AdaGrad runs the risk of slowing down a bit too fast never converging to the global optimum. This algo fixes this. 

### Adam: Adaptive moment estimation

This combines the ideas of momentum optimization and RMSProp. Adam is a adaptive learning rate algo so it requires less tuning of the learning rate hyperparameter. 

## Learning Rate Scheduling

A good learning rate is very important.

### Dropout 
This is implemented by all SOTA models and it gives them 1-2 percent accuracy boost.

This algo means every neuron has a probability p of being temporarily dropped out for the trainign step, but will be acitve in the next step. THis probability is the dropout rate.

SOTA models implement dropout layer after the last hidden layer.
Dropout slows down the convergence but often results in a better model when tuned properly.

### MC Dropout (monte carlo)

this is a better droput, somethign something.

## Summary and Practical Guidelines.














