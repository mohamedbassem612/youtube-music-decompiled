package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class va extends vm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vj(1);
    public final String a;
    public final byte[] b;
    public final byte[][] c;

    public va(String str, byte[] bArr, byte[][] bArr2) {
        super((byte[]) null);
        str.getClass();
        this.a = str;
        if (bArr2 == null || bArr2.length <= 0) {
            if (bArr == null) {
                throw new IllegalArgumentException("Either sha256Certificate or multiSignerSha256Certificates must be non-null");
            }
            this.b = bArr;
            this.c = null;
            return;
        }
        for (byte[] bArr3 : bArr2) {
            bArr3.getClass();
        }
        this.c = bArr2;
        this.b = bArr2[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof va) {
            va vaVar = (va) obj;
            if (this.a.equals(vaVar.a) && Arrays.equals(this.b, vaVar.b) && Arrays.deepEquals(this.c, vaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.deepHashCode(this.c)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", this.a);
        bundle.putByteArray("sha256Certificate", this.b);
        byte[][] bArr = this.c;
        if (bArr != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bArr.length);
            for (byte[] bArr2 : bArr) {
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("sha256Certificate", bArr2);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("sha256Certificates", arrayList);
        }
        parcel.writeBundle(bundle);
    }
}
