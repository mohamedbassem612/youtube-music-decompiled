package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bsa implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new vj(4);
    public final brz[] a;
    public final String b;
    public final int c;
    private int d;

    public bsa(Parcel parcel) {
        this.b = parcel.readString();
        brz[] brzVarArr = (brz[]) parcel.createTypedArray(brz.CREATOR);
        int i = bwp.a;
        this.a = brzVarArr;
        this.c = brzVarArr.length;
    }

    public final brz a(int i) {
        return this.a[i];
    }

    public final bsa b(String str) {
        return !Objects.equals(this.b, str) ? new bsa(str, false, this.a) : this;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        brz brzVar = (brz) obj2;
        UUID uuid = brt.a;
        UUID uuid2 = ((brz) obj).a;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(brzVar.a) ? 1 : 0;
        }
        return uuid2.compareTo(brzVar.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bsa bsaVar = (bsa) obj;
            if (Objects.equals(this.b, bsaVar.b) && Arrays.equals(this.a, bsaVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        String str = this.b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.d = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedArray(this.a, 0);
    }

    public bsa(String str, List list) {
        this(str, false, (brz[]) list.toArray(new brz[0]));
    }

    public bsa(String str, boolean z, brz... brzVarArr) {
        this.b = str;
        brzVarArr = z ? (brz[]) brzVarArr.clone() : brzVarArr;
        this.a = brzVarArr;
        this.c = brzVarArr.length;
        Arrays.sort(brzVarArr, this);
    }

    public bsa(List list) {
        this(null, false, (brz[]) list.toArray(new brz[0]));
    }
}
