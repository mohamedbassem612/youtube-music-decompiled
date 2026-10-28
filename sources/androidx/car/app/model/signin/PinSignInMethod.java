package androidx.car.app.model.signin;

import androidx.car.app.model.CarText;
import defpackage.adn;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class PinSignInMethod implements adn {
    private static final int MAX_PIN_LENGTH = 12;
    private final CarText mPinCode;

    public PinSignInMethod(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalArgumentException("PIN must not be empty");
        }
        if (length > 12) {
            throw new IllegalArgumentException("PIN must not be longer than 12 characters");
        }
        this.mPinCode = CarText.create(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PinSignInMethod) {
            return Objects.equals(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
        }
        return false;
    }

    public CarText getPinCode() {
        CarText carText = this.mPinCode;
        carText.getClass();
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mPinCode);
    }

    private PinSignInMethod() {
        this.mPinCode = null;
    }
}
