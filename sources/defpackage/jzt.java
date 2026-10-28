package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzt extends kry {
    public static final Parcelable.Creator CREATOR = new jys(7);
    public String a;
    String b;
    final List c;
    String d;
    Uri e;
    String f;
    public String g;
    public Boolean h;
    public Boolean i;
    public final int j;

    public jzt(String str, String str2, List list, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = str5;
        this.h = bool;
        this.i = bool2;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzt) {
            jzt jztVar = (jzt) obj;
            if (khe.g(this.a, jztVar.a) && khe.g(this.b, jztVar.b) && khe.g(this.c, jztVar.c) && khe.g(this.d, jztVar.d) && khe.g(this.e, jztVar.e) && khe.g(this.f, jztVar.f) && khe.g(this.g, jztVar.g) && this.j == jztVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.j));
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List list = this.c;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + (list == null ? 0 : list.size()) + ", senderAppIdentifier: " + this.d + ", senderAppLaunchUrl: " + String.valueOf(this.e) + ", iconUrl: " + this.f + ", type: " + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.F(parcel, 4, null);
        ksy.D(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        ksy.B(parcel, 6, this.d);
        ksy.A(parcel, 7, this.e, i);
        ksy.B(parcel, 8, this.f);
        ksy.B(parcel, 9, this.g);
        ksy.o(parcel, 10, this.h);
        ksy.o(parcel, 11, this.i);
        ksy.l(parcel, 12, this.j);
        ksy.h(parcel, iG);
    }

    private jzt() {
        this.c = new ArrayList();
        this.j = 1;
    }
}
