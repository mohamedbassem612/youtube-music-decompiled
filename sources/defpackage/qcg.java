package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qcg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pyc(2);
    public final byte[] a;
    public final String b;
    public final int c;

    public qcg(byte[] bArr, int i, String str) {
        this.a = bArr;
        this.c = i;
        this.b = str;
    }

    public static aai a() {
        aai aaiVar = new aai();
        aaiVar.b(1);
        return aaiVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qcg) {
            qcg qcgVar = (qcg) obj;
            boolean z = qcgVar instanceof qcg;
            if (Arrays.equals(this.a, qcgVar.a)) {
                int i = this.c;
                int i2 = qcgVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    String str = this.b;
                    if (str == null) {
                        if (qcgVar.b == null) {
                            return true;
                        }
                    } else if (str.equals(qcgVar.b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.a) ^ 1000003;
        int i = this.c;
        a.by(i);
        String str = this.b;
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.c;
        return "ParentToolsResult{hostClientData=" + Arrays.toString(this.a) + ", exitStatus=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", parentLinkPayload=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        parcel.writeString(this.b);
    }

    public qcg() {
        throw null;
    }
}
