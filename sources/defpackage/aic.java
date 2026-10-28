package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aic implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aid createFromParcel(Parcel parcel, ClassLoader classLoader) {
        aii aiiVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            aiiVar = aii.b;
        } else if (i == 1) {
            aiiVar = aii.c;
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.bP(i, "Unsupported MutableState policy ", " was restored"));
            }
            aiiVar = aii.a;
        }
        return new aid(value, aiiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new aid[i];
    }
}
