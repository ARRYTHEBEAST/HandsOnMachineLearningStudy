# Chapter 6: Decision Tree

Decision trees are versatile machine learning algorithms that can perform both classificaiton and regression.
They are also fundamental components of random forests, which are the most powerfull ML algorithms available today.

### Objectives:
1. How to train, visualize and make predictions with decision trees
2. CART Training algorithm
3. How to Regularize trees and use them for regression.
4. Limitation of decision trees.

### CART Training Algorithm

Classification and Regression Tree (CART)

This is also known as growing trees algorithm. This works by splitting the dataset into two subsets using a single feature k and a threshold tk. It trains to find the pair of (k, tk) that produces the purest subsets. This gives the cost function fo the algorithm.

CART COST FUNCTION. This however only give two optikons per branch it can only diverge into two not more.


The CART algorithm is very 'greesy; it seraches for an ooptimum split at the top level then repears the process at each layer. It does not check wether or not the split will lead to the lowes possible impurity several layers down.  This algorithm produces a good model but not always a optimal model.

Entropy: In ml entropy is used as a measure of impurity. A sets entropy is zero when it contains instances of only one class. 


#### Decision Tree High Variance therefore: RANDOM FOREST!!!!

The main issue with decision tree is that they have quite a high variance. Therefore ro reduce variance an ensemble of trees is used: Random forest.