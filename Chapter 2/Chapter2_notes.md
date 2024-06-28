
## Chapter 2: End-To-End Machine Learning Project
Pretend to be a data scientist in a real estate company. 

### The Steps to build a AI model

- Look at the big picture
- Get the data
- Explore and visualize the data to gain insights
- Prepare data for ML algos
- Select model and train it
- Fine-Tune the model
- Present the solution
- Deploy, monitor and maintain

### Working with Real Data

> **Sources to get datasets** <br>
> 1. OpenML.org
> 2. Kaggle.com
> 3. PapersWithCode.com
> 4. UC irvines machine learning repository
> 5. Amazon's AWS database
> 6. TenserFlow Datasets
> 7. DataPortals.org
> 8. OpenDataMonitor.eu

<br>

### **Look at the big picture**

Use the California census to build a model of housing prices in the state. 

Data includes:
1. Population
2. Median Income
3. Median Housing Price
4. etc etc

### Answer Fundamental Question:
- what type of supervision to use
- what type of ML problem is this
- what learning technique should be used

### Selecting a Performance Measure

1. RMSE: Root Mean Squared Error <br>
    Preferred for Regression Tasks with less outliers 
    <br> 
2. MEA: Mean Absolute Error <br>
    Preferred when there are a lot of outliers


### Creating a Test Split

#### Stratified Sampling

``` pd.cut() ```

it creates and income category attribute from the income median column. the income categories are 5 in number and that would be used to do the stratification. 

Furthermore the sklearn library, in the model selection has splitters which can perform stratified splits.

**StratifiedShuffleSplit** :
This is one of the model which can generate multiple splits
(fold), which can be used in cross validation.

### EDA Analysis on Housing Data

1. There are mostly numerical features except one categorical feature.
2. There are few null values in one of the feature
3. After plotting the histogram we get to know:
    - The scales are very different
    - Median house value and housing median age are capped at extreme ends.
    - The data is skewed right for all features.

