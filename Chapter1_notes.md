Chapter 1 Notes

1. What is Machine Learning?
    Machine Learning is the field of study that gives computers the ability to learn without being exolivitly programmed.

2. Machine Learning is great for:
    1. Problems for which existing solutions require a lot of fine tuning or long list of rules.
    2. Complex problems for which using a traditional approach yields no good solutions.
    3. Fluctuating environments.
    4. Getting insights about complex problems and large amounts of data.

3. Types of Machine Learning Systems and how to segment them:
    1. How are they Supervised during training?
    2. Can they learn incrementally on the fly?
    3. Do they work by comparing new data points to known data points, or instead by detecting patterns in the training data and building a predictive model?

4. Training Supervision:

    1. Supervised Learning:
    Training set provided contains 'Lables/Targets','Classes' for the given 'Features'.
    Examples:
        1. Classification 
        2. Regression 

    2. Unsupervised Learning:
    Training set provided does not contain 'Labels' 
    Examples:
        1. Clustering
        2. Visualization
        3. Dimentionality Reduction
        4. Anomaly Detection
        5. Novelty Detection
        6. Association Rule Learning

    3. Semi-Supervised Learning
    Training set provided contains both labeled data and unlabeled data.
    Examples:
        1. Semi-Clustering 

    4. Self-Supervised Learning:
    Generating a fully labeled dataset from a fully unlabeld dataset.
    #little confusion here

    5. Reinforcement Learning:
    Uses an 'Agent' and 'Environment', with 'Reward' and 'Penalty' based system, to determine the best 'Policy'. Like Darwin's theory of evolution but in computer science. 

5. Batch Learning vs Online Learning
    Wether the system can learn incrementally from a stream of incoming data.

    1. Batch Learning:
    System cannot learn from a stream of incoming data. It is trained using all available data. It takes a lot of compute and time, it is done offline. First the system is trained, then it is launched. It runs in production without learning anymore. The performace decays overtime (Model Rot / Data Drift). Model needs to be trained on up-to-data data always. If amount of data is huge batch learning is impossible due to costs.

    2. Online Learning:
    System can learn from a stream of incoming data either by feeding it sequentially, individually or in small groups called mini-batches. Each learning step is cheap and fast, can lear on the fly. Good for system whose data constanly changes and the requiresment is for the model to adapt regularly. Requires less compute. Can train on huge training datasets which cannot fit on system memory (out-of-core learning). 
    
    Includes a parameter: 'Learning Rate'
        If learning rate is high then the model will train quickly but it will also forget quickly and be more sensitive to noise, or sequences of nonrepresentaitve data points (Outliers).

    If bad data is fed into this, then performace will decline quickly. Admin needs to monitor the system and turn the learning off is something is wrong or revert to previous working state. Also needs to monitor input data using Eg: Anomaly Detection Algo.

6. Instance-Based Learning vs Model-Based Learning:
    How the models generalize. The ability to predict on unseen 'Test' data.

    1. Instance-Based Learning:
        The system learns the examples by heart, then generalizes to new cases by using a similarity measure to compare them to the learned examples  
    
    2. Model-Based Learning:
        Make a model using the data and use it to make predictions (generalize) to other unseen datas. Select a model (Model Selection), to do this a performace measure needs to be specified. 

        Performance Measures:
            1. Utility Funciton (How good the model is)
            2. Cost/Loss Function (How bad the model is)

        Reducing or Increasing the performace measure depending on which is being used is called as Training.

 <!--Refer to linearregression for code for a linar regression model-->

7. Main Challenges of Machine Learning 
    'bad model' and 'bad data'

    1.Bad Data
        1. Insuffient Quantity of Training Data:
        The data is as important (if not more) as the model(algorithm) selection. The data should be in high quantity to allow the model to learn more.

        2. Non-Repersentative Training Data:
        The data should be repersentative of the new cases that you want to generalize to. If sample is too small, there will be 'sampling noise', but even large datasets can have nonrepresentaitve data if the sampling method is flawed. This is 'Sampling Bias'

        3. Poor-Quality Data
        Erros, Outliers, Noise makes the data low quality. 

        4. Irrelevant Features
        'Garbage In, Garbage Out', this is the principle behind this. 'Feature Selection' and 'Feature Engineering' should be done to bring out quality data to train the model.

    2. Bad Model
        1. Overfitting:
        The model performs well on training data, but does bad on unseen data. Overfitting happens when the model is too complex relative to the amoint and noisiness of the training data. 
            Solutions:
                1. Simplify the model by redcuing parameters, number of attributes, constrainign the model.
                2. More training data
                3. Reduce noise in the training data
        
        Constraining the data: Regularization
        Regularization can be controlled by HyperParameters. It is a parameter of the learning algorithm(not of the model). It is not affected by the learning algorithm itself. It must be set prior to the training and remains constant during training. 

        2. Underfitting:
        When model does not understand the pattern in the data and it can not make predictions. This occurs when the model is too simple.
            Solutions:
                1. Choose powerfull model, with more parameters
                2. Feed better features to the model.
                3. Reduce constraints on the model.

8. Testing and Validating Models
    Spliting the data into two; 'training set' and 'testing set'

    (80% trainign and 20% testing)** depends on the size of dataset and the validation technique that is being used.

9. Hyperparameter Tuning and Model Selection 

    Hyperparameter tuning cannot be done using the test dataset, as this will tune the model's Hyperparameter to overfit the Test dataset. this will again reduce the generalization capabilities of the model.

    The solution to this is: 'Holdout Validation'
    This involves splitting the Trainig data into another 2 parts, train and val set. using the train set train multiple models, and do its validation using the val sets. the best model can be then finally tested using the test dataset. 

    But the validation set should not be too small neither too large to pervent model traingng to be bad or to prevent inaccurate validation.

    Cross-Validation can be done to solve above problem.

10. Data Mismatch 

    If real representative data is scares, but almost simmilar but not completely representative data is available from diiferent sources(Internet, repos, etc). In this case the real data is to be used as the validation and the test datset. The simmilar dataset should be also split into more two datasets: 'train', 'train_dev'. The model is trained using train and then validated using train_dev, it the modle performs bad then it must have overfit the train set, but if it performs welll here then, it can be furhter evalurated using val set. If it performs bad in val then theere is data mismatch, that means the data is not actlly simillar. Some editing is required to make the data more simmilar to the real data.


<!--Fin-->    

