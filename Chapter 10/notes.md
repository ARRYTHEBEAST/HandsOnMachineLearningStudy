# Chapter 10. Introduction to Artificial Neural Networks with Keras ( And tenserflow ( self study))

### Logical computation with Neurons

Artificial Neuron: has one or more binary inputs. The output s activated when more than an certain number of its inputs are active.


### The perceptron

It is one of the most simplest ANN architecture. 
#### TLU
This is based on a threshold logic unit(TLU) or linear threshold unit (LTU). The inputs and outputs are numbers insteead of binary inputs. The TLU computes a linear function of its imputs. Then it applies a step function to the result. The most common step function used is Heaviside sttep function. A single TLU can be used for classification problem.

Perceptron is composed of one or more TLUs organized in single layer, where every TLU is connected to every input. This layer is called fully connected layer or a dense layer. The inputs are called the input layer. and the outputs is called the output layer. 