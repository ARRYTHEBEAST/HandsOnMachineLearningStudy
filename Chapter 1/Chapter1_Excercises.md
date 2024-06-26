1. How would you define machine learning?
Machine learning is a type of algorithm or program to allow machines to learn by itself using a error function, and data. 

2. Can you name 4 types of applications where it shines?
    1. Self Driving Cars
    2. Instagram reccomendation systems
    3. Facial Detection, Iphone Lock
    4. Demand forcasting ARIMA/LSTM models

3. What is labelled training dataset/
A training dataset which is used in supervised machine learning, where the features are given with the tragets or labels. Or the data is given the target output. which the model can use to learn from.

4. What are the two most common supervised tasks?
    1. Classification
    2. Regression

5. What are the 4 unsupervised tasks?
    1. Clustering
    2. Anomaly Detection
    3. # Novelty Detection
    4. # Dimentionality Reduction

6. What algo is uded to allow a robot to walk in unknow terrain?
Reinforcement Learning

7. What algo is used to segment customers in group?
Clustering Unsupervised learning

8. What supervision is spam detection?
It is semi-supervised as not all data has lables, but some of them do.

9. What is online learning?
It is type of training where a large data is trained in batches and not continiouly at the same time. 

10. What is out-of-core learning?
It is a type of training where a model is traind on a data so huge that it can not be fit in the system memory. Thus the data is loaded in batches and the model is trained in bathches.

11. What algo relies on simmilarity measuere to make prediction?
Instance Based Model

12. What is the difference between Parameter and Hyperparameter?
Parameters directly affect the model and it changes as the training progresses. (the gradient in LinerRegression)
Hyperparameters are set before the training and it does not change after the training. (The batch size, the epochs of training)

13. What do model-based algo search for? what is the stratergy they use? How they make prediction?
They search for a loss funciton that they can minimize to generate a model and reduct the loss fnction to fit the model to the data.

14. 4 Challenges of ML
    1. Low quantity of data
    2. Low quality of data
    3. Overfitting
    4. Underfitting
    5. Data Mismatch

15. If your model performs good on training set but poor on Test then what is problem what is solution?
Overfitting. Then model is fit greatly to the training data. 
    1. Chose a simpler model
    2. Increase the constraints on the model
    3. Increase the quantity of data

16. What is a test set, why to use it?
It is a dataset which is used at the very end to finally evaluate the performance of the dataset. to get a final metric of the dataset.

17. What is the purpose of a validation set?
It is a dataset which is used to test the model during training to make it better and to tune its hyperparameters.

18. What is train-dev set?
It is a dataset which is used when there is a posiiblility of datamismatch when there is a difference in real data and training data.

19. What can go wrong when you hyperparameter tune using test data?
The model can overfit to the test datset reducing its generalization ability.

