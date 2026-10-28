package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ugr implements Parcelable {
    public final Uri a;
    public final int b;
    public final int c;
    public final long d;
    public final float e;
    public final int f;

    public ugr(Uri uri, int i, int i2, long j, float f, int i3) {
        if (uri == null) {
            throw new NullPointerException("Null path");
        }
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = f;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ugr) {
            ugr ugrVar = (ugr) obj;
            if (this.a.equals(ugrVar.a) && this.b == ugrVar.b && this.c == ugrVar.c && this.d == ugrVar.d) {
                if (Float.floatToIntBits(this.e) == Float.floatToIntBits(ugrVar.e) && this.f == ugrVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.d;
        return (((((((((iHashCode * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "ShortsVideoMetadata{path=" + this.a.toString() + ", width=" + this.b + ", height=" + this.c + ", videoDurationMs=" + this.d + ", targetFrameRate=" + this.e + ", rotationDegrees=" + this.f + '}';
    }

    public ugr() {
        throw null;
    }
}
