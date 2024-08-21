# Chapter 10. Introduction to Artificial Neural Networks with Keras ( And tenserflow ( self study))

### Logical computation with Neurons

Artificial Neuron: has one or more binary inputs. The output s activated when more than an certain number of its inputs are active.


### The perceptron

It is one of the most simplest ANN architecture. 
#### TLU
This is based on a threshold logic unit(TLU) or linear threshold unit (LTU). The inputs and outputs are numbers insteead of binary inputs. The TLU computes a linear function of its imputs. Then it applies a step function to the result. The most common step function used is Heaviside sttep function. A single TLU can be used for classification problem.

#### Perceptron

Perceptron is composed of one or more TLUs organized in single layer, where every TLU is connected to every input. This layer is called fully connected layer or a dense layer. The inputs are called the input layer. and the outputs is called the output layer. 

How is a perceptron trained?
Simmilar to SGD

### Multilayer Perceptron

The limitations of perceptron can be eliminated by stacking multiple perceptrons. which result in a ANN called as MLP.

### MLP and Backpropagation

MLP is composed of one input layer, one or more hidden layers and one output layer.

THe layer closer to input later are called the lower layer. and the ones close to the output are called upper layer. 

When an ANN contains deep stack of hidden later it is called a Deep neural network.

Backpropagation is the combination of reverse-mode autodiff and gradient descent. This is a technique to compute all the gradient s automatically and efficiently. In just two passes through the network it is able to compute the gradients of the NN's error with regard to every single model parameter. It can find out how each connection weight and bias should be tweaked in order to reduce the error. 


How backpropagation works:

It handles one mini batch at a time, and it goes through the full training set multiple times. Each pass is called an epoch.

Each mini batch enters the network through the input later. The algo then compute the output of all the neurons in the first hidden later for every instance in the mini batch. The result is passed on to the next later, its output is computer and passed to the next layer this is the forward pass: it is exactly like making predictions, except all intermediate results are preservd since they are needed for the backward pass.

Next, the algo measures the networks output error( using loss function)

Then it computes how much each output bias ans each connection to the output later contributed to the error. This is done analytically by applying the chain rule.

Algo then measures how much of these error contributions came from each connection in the layer below again using the chain rule working backward until it reaches the input layer. 
This reverse pass measures the error gradiernt across all the connection weights and biases in the network by propagating the error gradiaent backward through the network.

Finally the algo perfroms a gradient descent step to tweak all the connection weights in the netweok using the error gradients it just computed. 


### Regression MLP Architecture

Hyperparameter              Typical Value
Hidden Layers               Depends on the problem, but 1-5
neurons per H-layer         usually 10-100
output neurons              1 per prediction dimension
Hidden Activation Funciton  ReLU
Output Activation Function  NONE, ReLU or Softplus or Sigmoid/tanh
Loss Function               MSE or Huber(if outliers)


#### Classification MLP
For binary classification problem a single output neuron is needed using the sigmoid activation function: the output will be 0 or 1. 

For multiclass classification softmax activation function should be used so that the output layer outputs all add to 1. 

and for multilabel classificaiton sigmoid activation function should be used. 



### Implementing MLP with keras


### Describing the Architecture of the model

1. Create a Sequential model/ this is a keras model for nn that is composed of a single stack of layers connectied sequentially. 
2. The first(Input) layer is created. The input shape is the shape of the instances not the batch size.
3. Then Flatten layer is added to convert each image into a 1D array. If it receives input of X it computes
X.reshape(-1,784)
4. Then dense layer is added with 300 neurons. This uses relu 
5. Then a second dense layer is added with 100 neurons
6. Finally the output (dense) layer is added with 10 neurons one per class using the softmax activation fucntion becuase the classes are exclusive.

#### Compiling the model
The loss function and the optimizer needs to be specified after calling the ```compile()`` method.

#### Hyperparameter Tuning

The model can be retrained if it has not converged yet.
Learning rate can be tuned. Then a different optimizer can be used.Then number of layers, number of neurons per layer, types of activation funcitons for each layer. The batch size. 