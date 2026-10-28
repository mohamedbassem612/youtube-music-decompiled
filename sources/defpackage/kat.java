package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kat extends kry {
    public static final Parcelable.Creator CREATOR = new jys(16);
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public kat(kat katVar) {
        this.a = katVar.a;
        this.b = katVar.b;
        this.c = katVar.c;
        this.d = katVar.d;
        this.e = katVar.e;
    }

    public final void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kat) {
            kat katVar = (kat) obj;
            if (this.a == katVar.a && TextUtils.equals(this.b, katVar.b) && Objects.equals(this.c, katVar.c) && Objects.equals(this.d, katVar.d) && this.e == katVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        List list = this.c;
        ksy.F(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.d;
        ksy.F(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        ksy.j(parcel, 6, this.e);
        ksy.h(parcel, iG);
    }

    public kat(int i, String str, List list, List list2, double d) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = d;
    }

    public kat() {
        a();
    }
}
