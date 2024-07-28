# Chapter 5: Support Vector Machines

A SVM is a powerfull and versatile machine capable of performing both llinear and nonlinear tasks. 

#### Linear SVM Classification:

This draws a line between 2 cluster of features which is the decision boundary. This line not only seperates the classes but also stays far from the closest training instance. This is called 'large margin classification'. 

#### Soft Margin Classification:

If we strictly impose that all linstances must be off the street and on the correct side this is called hard margin classification.  But SMC is when the data is not completely seperable and when it is senitive to outliers. 

### Kernels

#### Polynomial Kernel

This makes it possible to get the same resulat as if you had added many polunomial features even with a high degree. 

#### Similarity Function

gaussian RBF, adds naother feature to check how much each intance resembles a landmark.


> LinearSVC is much faster than SVC(kernel='linear')
