# Android Studio TextWatcher Implementation

---

TextWatcher is an interface that can be used to have editable actionables on text.

This implementation uses three public methods:
```
    afterTextChanged(Editable s)
    beforeTextChanged(CharSequence s, int start, int count, int after)
    onTextChanged(CharSequence s, int start, int before, int count)
```
The application takes in input through an Edit Text and sets every new Character Change inside of a TextView. There are logs indicating the progression of the TextWatcher. Notably, all logs indicate that all methods occur in the sucession of:
```
    beforeTextChanged()
    onTextChanged()
    afterTextChanged()
```
No depencies needed to be installed. The interface was added in API level 1.

Example of the implementation:
![Implementation of TextWatcher](https://i.imgur.com/DadgEQl.png)

References:
[Google Documentation on TextWatcher](https://developer.android.com/reference/android/text/TextWatcher#afterTextChanged(android.text.Editable))


---
Android Studio Canary Details: SdkVersion 30
Author: Giancarlo Deleon 12/07/2020

