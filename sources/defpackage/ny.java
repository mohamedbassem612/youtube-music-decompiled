package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ny implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int $cid;

    public ny(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.$cid;
        if (i == 0) {
            return new nz(parcel, null);
        }
        if (i == 1) {
            return new cb(parcel, null);
        }
        if (i == 2) {
            return new pe(parcel, null);
        }
        if (i != 3) {
            return i != 4 ? new duy(parcel, null) : new dua(parcel, null);
        }
        return new asw(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return new nz[i];
        }
        if (i2 == 1) {
            return new cb[i];
        }
        if (i2 == 2) {
            return new pe[i];
        }
        if (i2 != 3) {
            return i2 != 4 ? new duy[i] : new dua[i];
        }
        return new asw[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.$cid;
        if (i == 0) {
            return new nz(parcel, classLoader);
        }
        if (i == 1) {
            return new cb(parcel, classLoader);
        }
        if (i == 2) {
            return new pe(parcel, classLoader);
        }
        if (i != 3) {
            return i != 4 ? new duy(parcel, classLoader) : new dua(parcel, classLoader);
        }
        return new asw(parcel, classLoader);
    }
}
