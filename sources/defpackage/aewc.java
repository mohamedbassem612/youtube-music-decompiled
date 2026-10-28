package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aewc implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int $cid;

    public aewc(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.$cid;
        if (i == 0) {
            return new aewd(parcel, null);
        }
        if (i == 1) {
            return new aevr(parcel, (ClassLoader) null);
        }
        if (i != 2) {
            return i != 3 ? new afet(parcel, null) : new afcz(parcel, null);
        }
        return new aexz(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return new aewd[i];
        }
        if (i2 == 1) {
            return new aevr[i];
        }
        if (i2 != 2) {
            return i2 != 3 ? new afet[i] : new afcz[i];
        }
        return new aexz[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.$cid;
        if (i == 0) {
            return new aewd(parcel, classLoader);
        }
        if (i == 1) {
            return new aevr(parcel, classLoader);
        }
        if (i != 2) {
            return i != 3 ? new afet(parcel, classLoader) : new afcz(parcel, classLoader);
        }
        return new aexz(parcel, classLoader);
    }
}
