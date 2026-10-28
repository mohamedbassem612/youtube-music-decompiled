package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aukt extends aukc {
    public static final Parcelable.Creator CREATOR = new ahpw(14);

    public aukt() {
    }

    @Override // defpackage.aukc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aukt) {
            return Arrays.equals(((aukt) obj).a, this.a);
        }
        return false;
    }

    public aukt(Parcel parcel) {
        super(parcel);
    }
}
