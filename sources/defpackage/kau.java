package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kau extends kry {
    public static final Parcelable.Creator CREATOR = new jys(17);
    public String a;
    public String b;
    public int c;
    public String d;
    public kat e;
    public int f;
    public List g;
    public int h;
    public long i;
    public boolean j;

    public kau(kau kauVar) {
        this.a = kauVar.a;
        this.b = kauVar.b;
        this.c = kauVar.c;
        this.d = kauVar.d;
        this.e = kauVar.e;
        this.f = kauVar.f;
        this.g = kauVar.g;
        this.h = kauVar.h;
        this.i = kauVar.i;
        this.j = kauVar.j;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = -1L;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kau) {
            kau kauVar = (kau) obj;
            if (TextUtils.equals(this.a, kauVar.a) && TextUtils.equals(this.b, kauVar.b) && this.c == kauVar.c && TextUtils.equals(this.d, kauVar.d) && Objects.equals(this.e, kauVar.e) && this.f == kauVar.f && Objects.equals(this.g, kauVar.g) && this.h == kauVar.h && this.i == kauVar.i && this.j == kauVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i), Boolean.valueOf(this.j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.A(parcel, 6, this.e, i);
        ksy.l(parcel, 7, this.f);
        List list = this.g;
        ksy.F(parcel, 8, list == null ? null : DesugarCollections.unmodifiableList(list));
        ksy.l(parcel, 9, this.h);
        ksy.m(parcel, 10, this.i);
        ksy.i(parcel, 11, this.j);
        ksy.h(parcel, iG);
    }

    public kau(String str, String str2, int i, String str3, kat katVar, int i2, List list, int i3, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = katVar;
        this.f = i2;
        this.g = list;
        this.h = i3;
        this.i = j;
        this.j = z;
    }

    public kau() {
        a();
    }
}
