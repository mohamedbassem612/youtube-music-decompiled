package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qty implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pyc(6);
    public final Uri a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final long f;
    public final long[] g;
    public final Integer h;
    public final int[] i;
    private final boolean j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final int n;
    private final byte[] o;
    private final agkj p;

    public qty(Parcel parcel) {
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readLong();
        this.g = parcel.readInt() != 0 ? parcel.createLongArray() : null;
        this.i = parcel.createIntArray();
        this.l = parcel.readInt() == 1;
        this.n = parcel.readInt();
        this.o = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.m = parcel.readInt() == 1;
        this.h = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
        this.p = agpn.b;
    }

    public final long a(int i) {
        long[] jArr = this.g;
        jArr.getClass();
        ahno.W(i, jArr.length);
        return jArr[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qty) {
            return afxw.l(this.a, ((qty) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        Uri uri = this.a;
        String name = getClass().getName();
        String strConcat = "source=".concat(String.valueOf(String.valueOf(uri)));
        String str = "videoTrackIndex=" + this.k;
        String str2 = "width=" + this.b;
        String str3 = "height=" + this.c;
        String str4 = "pixelAspect=" + this.e;
        String str5 = "rotationDegrees=" + this.d;
        String str6 = "durationUs=" + this.f;
        long[] jArr = this.g;
        String strConcat2 = "frameTimesUs count=".concat((jArr != null ? Integer.valueOf(jArr.length) : "null").toString());
        int[] iArr = this.i;
        String strConcat3 = "syncSamplesIndices count=".concat((iArr != null ? Integer.valueOf(iArr.length) : "null").toString());
        String str7 = "hasBFrames=" + this.l;
        String str8 = "stereoMode=" + this.n;
        byte[] bArr = this.o;
        return nqv.i(name, strConcat, str, str2, str3, str4, str5, str6, strConcat2, strConcat3, str7, str8, "projectionData count=".concat((bArr != null ? Integer.valueOf(bArr.length) : "null").toString()), "hasMetadataTrack=" + this.m, "numFrames=".concat(String.valueOf(this.h)), "mdtaMetadata count=" + this.p.size());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeLong(this.f);
        long[] jArr = this.g;
        parcel.writeInt(jArr != null ? 1 : 0);
        if (jArr != null) {
            parcel.writeLongArray(jArr);
        }
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.n);
        byte[] bArr = this.o;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.m ? 1 : 0);
        Integer num = this.h;
        parcel.writeInt(num != null ? 1 : 0);
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
    }

    public qty(Uri uri, boolean z, int i, int i2, long[] jArr, Map map) {
        agkj agkjVarH;
        uri.getClass();
        this.a = uri;
        this.j = z;
        this.k = 0;
        this.b = i;
        this.c = i2;
        this.e = 1.0f;
        this.m = false;
        this.d = 0;
        this.f = 0L;
        this.l = false;
        this.n = 0;
        this.o = null;
        if (map != null) {
            agkjVarH = agkj.h(map);
        } else {
            agkjVarH = agpn.b;
        }
        this.p = agkjVarH;
        if (jArr != null) {
            this.h = null;
            this.g = jArr;
            this.i = null;
            return;
        }
        throw new IllegalStateException("No frame times from video nor frame count.");
    }
}
