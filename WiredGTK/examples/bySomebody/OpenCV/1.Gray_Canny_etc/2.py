import cv2
image = cv2.imread('colored.png')
gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
edges = cv2.Canny(gray_image,100,200)
cv2.imshow('Original', edges)
