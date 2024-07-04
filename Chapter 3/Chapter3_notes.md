# Chapter 3: Classification

Classifier, can classify the data according to the class they belong to.

#### Performance measure in classifier:

Precision is not used here as if the data is skewed and classs imbalance is there then there is a possiblility that always predicting the class which has greatest number of instances will have a higher probability of success. So the mode ability is not actually being trained. 

#### Precision Recall trade off:
As the threshold increases the precision increases but recall decreases. However as the the threshold decreases precision decreases and recall increases. Plots precision vs recall(its shape like the PPC curve)

#### ROC Curve:
Receiver operating characteristics (ROC) curve. It is used with binary classifiers. It plots the true positive rate(FPR). It is the ratio of negative instanes that are incorrectly classified as positive. It is equal to 1-True Negative Rate. 
