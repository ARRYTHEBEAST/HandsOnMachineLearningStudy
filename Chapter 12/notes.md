# Chapter 12. Custom Models and Training with Tensorflow

This chapter goes into actually creating Neural Networks without the keras API.

### TensorFlow
Poerful library for numerical computation. well suited and finetuned for large scale ML, but can be used for anything else that requires heavy computation.

1. its simmilar to Numpy, with GPU support
2. Distribured computing across multiple devices and servers
3. includes a JIT compiler for opotimized computation.
4. Computation graphs can be extracted so you can train a TF model in one environment and run it in another. 
5. It implemnets a reverse mode autodiff and provides some excellent optimizers RMSProp Nadam.


At low level TF is impleneted using efficient C++ code.

### Tensor
It is like a numpy array, it is usually multidimensional array. 