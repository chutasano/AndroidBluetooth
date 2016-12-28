#Bluetooth Computation Offloader
Chuta Sano


This demo offloads static computations through bluetooth connected devices by sending a byte encoded APK file containing the computation through bluetooth. The receiving device would then run the computation to emulate a startActivityForResult call.


This is based off Google's Android Bluetooth Chat demo. Literally replaced string messages to byte arrays and then implemented an encoding/decoding scheme from byte -> apk file


TODO: Dynamic computation using reflection?
      Testing on speed + usefulness