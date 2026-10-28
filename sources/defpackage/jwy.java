package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jwy extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(2);
    public final String a;
    public final String b;
    final Bundle c;

    public jwy(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jwy)) {
            return false;
        }
        jwy jwyVar = (jwy) obj;
        return Objects.equals(this.a, jwyVar.a) && Objects.equals(this.b, jwyVar.b) && Objects.equals(this.c, jwyVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        Bundle bundle = this.c;
        String string = bundle != null ? bundle.toString() : "null";
        String str = this.b;
        return "CorpusId[package=" + this.a + ", corpus=" + str + ", userHandle=" + string + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.p(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
