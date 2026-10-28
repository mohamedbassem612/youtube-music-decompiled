package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljq extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(7);
    private final String a;
    private final String b;

    public ljq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("tag", this.a, arrayList);
        kro.p("display_text", this.b, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
