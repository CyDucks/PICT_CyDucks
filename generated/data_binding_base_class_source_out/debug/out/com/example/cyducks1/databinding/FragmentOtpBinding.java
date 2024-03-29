// Generated by view binder compiler. Do not edit!
package com.example.cyducks1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cyducks1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOtpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editText1;

  @NonNull
  public final EditText editText2;

  @NonNull
  public final EditText editText3;

  @NonNull
  public final EditText editText4;

  @NonNull
  public final EditText editText5;

  @NonNull
  public final EditText editText6;

  @NonNull
  public final TextView textOTP;

  private FragmentOtpBinding(@NonNull ConstraintLayout rootView, @NonNull EditText editText1,
      @NonNull EditText editText2, @NonNull EditText editText3, @NonNull EditText editText4,
      @NonNull EditText editText5, @NonNull EditText editText6, @NonNull TextView textOTP) {
    this.rootView = rootView;
    this.editText1 = editText1;
    this.editText2 = editText2;
    this.editText3 = editText3;
    this.editText4 = editText4;
    this.editText5 = editText5;
    this.editText6 = editText6;
    this.textOTP = textOTP;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOtpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_otp, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOtpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editText1;
      EditText editText1 = ViewBindings.findChildViewById(rootView, id);
      if (editText1 == null) {
        break missingId;
      }

      id = R.id.editText2;
      EditText editText2 = ViewBindings.findChildViewById(rootView, id);
      if (editText2 == null) {
        break missingId;
      }

      id = R.id.editText3;
      EditText editText3 = ViewBindings.findChildViewById(rootView, id);
      if (editText3 == null) {
        break missingId;
      }

      id = R.id.editText4;
      EditText editText4 = ViewBindings.findChildViewById(rootView, id);
      if (editText4 == null) {
        break missingId;
      }

      id = R.id.editText5;
      EditText editText5 = ViewBindings.findChildViewById(rootView, id);
      if (editText5 == null) {
        break missingId;
      }

      id = R.id.editText6;
      EditText editText6 = ViewBindings.findChildViewById(rootView, id);
      if (editText6 == null) {
        break missingId;
      }

      id = R.id.textOTP;
      TextView textOTP = ViewBindings.findChildViewById(rootView, id);
      if (textOTP == null) {
        break missingId;
      }

      return new FragmentOtpBinding((ConstraintLayout) rootView, editText1, editText2, editText3,
          editText4, editText5, editText6, textOTP);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
