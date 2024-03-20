package com.example.cyducks1.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Isko continue button pe lagana hai...karke dekha tha maine but dhang se nahi hora tha toh hata diya");
    }

    public LiveData<String> getText() {
        return mText;
    }
}