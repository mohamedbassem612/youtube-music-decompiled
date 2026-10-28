package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aevr extends bdh {
    public static final Parcelable.Creator CREATOR = new aewc(1);
    public final int a;
    public final int b;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public aevr(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
    }

    @Override // defpackage.bdh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public aevr(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.F;
        this.b = bottomSheetBehavior.i;
        this.e = bottomSheetBehavior.f;
        this.f = bottomSheetBehavior.C;
        this.g = bottomSheetBehavior.D;
    }
}
