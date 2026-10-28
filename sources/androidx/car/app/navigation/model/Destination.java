package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.adr;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Destination {
    private final CarText mAddress;
    private final CarIcon mImage;
    private final CarText mName;

    Destination(adr adrVar) {
        CarText carText = adrVar.a;
        this.mName = null;
        CarText carText2 = adrVar.b;
        this.mAddress = null;
        CarIcon carIcon = adrVar.c;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Destination) {
            Destination destination = (Destination) obj;
            if (Objects.equals(this.mName, destination.mName) && Objects.equals(this.mAddress, destination.mAddress) && Objects.equals(this.mImage, destination.mImage)) {
                return true;
            }
        }
        return false;
    }

    public CarText getAddress() {
        return this.mAddress;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getName() {
        return this.mName;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mAddress, this.mImage);
    }

    public String toString() {
        return "[name: " + CarText.toShortString(this.mName) + ", address: " + CarText.toShortString(this.mAddress) + ", image: " + this.mImage + ']';
    }

    private Destination() {
        this.mName = null;
        this.mAddress = null;
        this.mImage = null;
    }
}
