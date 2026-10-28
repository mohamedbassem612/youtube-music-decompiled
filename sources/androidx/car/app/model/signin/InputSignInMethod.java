package androidx.car.app.model.signin;

import androidx.car.app.model.CarText;
import defpackage.aaz;
import defpackage.adl;
import defpackage.adn;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class InputSignInMethod implements adn {
    public static final int INPUT_TYPE_DEFAULT = 1;
    public static final int INPUT_TYPE_PASSWORD = 2;
    public static final int KEYBOARD_DEFAULT = 1;
    public static final int KEYBOARD_EMAIL = 2;
    public static final int KEYBOARD_NUMBER = 4;
    public static final int KEYBOARD_PHONE = 3;
    private final CarText mDefaultValue;
    private final CarText mErrorMessage;
    private final CarText mHint;
    private final aaz mInputCallbackDelegate;
    private final int mInputType;
    private final int mKeyboardType;
    private final boolean mShowKeyboardByDefault;

    InputSignInMethod(adl adlVar) {
        CarText carText = adlVar.b;
        this.mHint = null;
        CarText carText2 = adlVar.c;
        this.mDefaultValue = null;
        int i = adlVar.d;
        this.mInputType = 0;
        CarText carText3 = adlVar.e;
        this.mErrorMessage = null;
        int i2 = adlVar.f;
        this.mKeyboardType = 0;
        aaz aazVar = adlVar.a;
        this.mInputCallbackDelegate = null;
        boolean z = adlVar.g;
        this.mShowKeyboardByDefault = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InputSignInMethod) {
            InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
            if (this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && Objects.equals(this.mHint, inputSignInMethod.mHint) && Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage)) {
                return true;
            }
        }
        return false;
    }

    public CarText getDefaultValue() {
        return this.mDefaultValue;
    }

    public CarText getErrorMessage() {
        return this.mErrorMessage;
    }

    public CarText getHint() {
        return this.mHint;
    }

    public aaz getInputCallbackDelegate() {
        aaz aazVar = this.mInputCallbackDelegate;
        aazVar.getClass();
        return aazVar;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    public int hashCode() {
        return Objects.hash(this.mHint, this.mDefaultValue, Integer.valueOf(this.mInputType), this.mErrorMessage, Integer.valueOf(this.mKeyboardType), Boolean.valueOf(this.mShowKeyboardByDefault));
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "[inputType:" + this.mInputType + ", keyboardType: " + this.mKeyboardType + ']';
    }

    private InputSignInMethod() {
        this.mHint = null;
        this.mDefaultValue = null;
        this.mInputType = 1;
        this.mErrorMessage = null;
        this.mKeyboardType = 1;
        this.mInputCallbackDelegate = null;
        this.mShowKeyboardByDefault = false;
    }
}
