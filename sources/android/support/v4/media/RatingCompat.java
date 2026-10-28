package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ax;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(8);
    public final int a;
    public final float b;
    public Object c;

    public RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static RatingCompat a(boolean z) {
        return new RatingCompat(2, true != z ? 0.0f : 1.0f);
    }

    public static RatingCompat b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public final boolean c() {
        return this.b >= 0.0f;
    }

    public final boolean d() {
        return this.a == 2 && this.b == 1.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
