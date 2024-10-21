# Chapter 14: Deep Computer Vision Using Convolutional Neural Networks

CNN emerged from the study of the brain's visual cortex. 

Visual cortex have a small local receptive field, they react only to visual stimuli located in a limited region of the visiual field.

The studies of visual cortex inspired the neocognititron which evolved into CNN.


Many neurons in visual cortex have a small local receptive field, they react only to visual stimuli. The receptive fileds of different neurons overlap and they tile the whole visual field. Some neurons only react to horizontal line and some only to other orientations. The higher level neurons have a larger receptive fileds and they react to more complex patters that are combination of the lower level patterns. The higher level neurons are based on the output of lower level neurons.

paper by Yann LeCun introduces Convolutional Layers and Pooling Layers in 1998.

#### Convolutional Layers

The neurons in the first convolutional layer are not connected to everysingle pixel in the input image, but only to the pixeld in their receptive fields. 

#### Filters

A neurons weights can be represented as a small image the size of the receptive field. 