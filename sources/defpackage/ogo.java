package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ogo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lry(18);
    public final ofl a;
    public final double b;
    private final boolean c;

    public ogo(Parcel parcel) {
        double d = parcel.readDouble();
        double d2 = parcel.readDouble();
        this.b = parcel.readDouble();
        this.c = parcel.readByte() != 0;
        this.a = new ofl(d, d2, new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()), new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()), new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()), new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ogo)) {
            return false;
        }
        ogo ogoVar = (ogo) obj;
        return this.b == ogoVar.b && this.c == ogoVar.c && this.a.equals(ogoVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Double.valueOf(this.b), Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ofl oflVar = this.a;
        parcel.writeDouble(oflVar.a);
        parcel.writeDouble(oflVar.b);
        parcel.writeDouble(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        Rect rect = oflVar.c;
        parcel.writeInt(rect.left);
        parcel.writeInt(rect.top);
        parcel.writeInt(rect.right);
        parcel.writeInt(rect.bottom);
        Rect rect2 = oflVar.d;
        parcel.writeInt(rect2.left);
        parcel.writeInt(rect2.top);
        parcel.writeInt(rect2.right);
        parcel.writeInt(rect2.bottom);
        Rect rect3 = oflVar.e;
        parcel.writeInt(rect3.left);
        parcel.writeInt(rect3.top);
        parcel.writeInt(rect3.right);
        parcel.writeInt(rect3.bottom);
        Rect rect4 = oflVar.f;
        parcel.writeInt(rect4.left);
        parcel.writeInt(rect4.top);
        parcel.writeInt(rect4.right);
        parcel.writeInt(rect4.bottom);
    }

    public ogo(ofl oflVar, double d, boolean z) {
        this.a = oflVar;
        this.b = d;
        this.c = z;
    }
}
