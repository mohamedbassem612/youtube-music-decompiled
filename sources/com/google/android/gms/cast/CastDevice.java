package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.amp;
import defpackage.kaa;
import defpackage.khd;
import defpackage.khe;
import defpackage.kry;
import defpackage.ksy;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CastDevice extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kaa();
    public final String a;
    final String b;
    public InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final byte[] m;
    public final String n;
    public final boolean o;
    public final Integer p;
    final Boolean q;
    final Network r;
    public final amp s;
    private final List t;
    private final khd u;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, khd khdVar, Integer num, Boolean bool, Network network) {
        this.a = k(str);
        String strK = k(str2);
        this.b = strK;
        if (!TextUtils.isEmpty(strK)) {
            try {
                this.c = InetAddress.getByName(strK);
            } catch (UnknownHostException e) {
                e.getMessage();
            }
        }
        this.d = k(str3);
        this.e = k(str4);
        this.f = k(str5);
        this.g = i;
        this.t = list == null ? new ArrayList() : list;
        this.h = i3;
        this.i = k(str6);
        this.j = str7;
        this.k = i4;
        this.l = str8;
        this.m = bArr;
        this.n = str9;
        this.o = z;
        this.u = khdVar;
        this.p = num;
        this.q = bool;
        this.r = network;
        this.s = new amp(i2, null, null);
    }

    public static CastDevice c(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String k(String str) {
        return str == null ? "" : str;
    }

    public final int a() {
        return this.s.a;
    }

    public final int b() {
        if (g()) {
            return 4;
        }
        if (h()) {
            return 3;
        }
        if (i()) {
            return 5;
        }
        return e(1) ? 2 : 1;
    }

    public final khd d() {
        khd khdVar = this.u;
        return (khdVar == null && i()) ? new khd(1, false, false, null, null, null, null, null, false, false, false) : khdVar;
    }

    public final boolean e(int i) {
        return this.s.a(i);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CastDevice) {
            CastDevice castDevice = (CastDevice) obj;
            if (Objects.equals(this.a, castDevice.a) && Objects.equals(this.c, castDevice.c) && Objects.equals(this.e, castDevice.e) && Objects.equals(this.d, castDevice.d)) {
                String str = this.f;
                String str2 = castDevice.f;
                if (Objects.equals(str, str2) && (i = this.g) == (i2 = castDevice.g) && Objects.equals(this.t, castDevice.t) && a() == castDevice.a() && this.h == castDevice.h && Objects.equals(this.i, castDevice.i) && this.k == castDevice.k && Objects.equals(this.l, castDevice.l) && Objects.equals(this.j, castDevice.j) && Objects.equals(str, str2) && i == i2 && ((((bArr = this.m) == null && castDevice.m == null) || Arrays.equals(bArr, castDevice.m)) && Objects.equals(this.n, castDevice.n) && this.o == castDevice.o && Objects.equals(d(), castDevice.d()) && j() == castDevice.j() && Objects.equals(this.r, castDevice.r))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.s.a(262144);
    }

    public final boolean g() {
        return this.s.a(64);
    }

    public final boolean h() {
        return this.s.b();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        amp ampVar = this.s;
        return ampVar.b() || ampVar.a(SemanticState.Focused);
    }

    public final boolean j() {
        return Boolean.TRUE.equals(this.q);
    }

    public final String toString() {
        String strConcat;
        if (g()) {
            strConcat = "[dynamic group]";
        } else if (h()) {
            strConcat = "[static group]";
        } else {
            strConcat = i() ? "[speaker pair]" : "";
        }
        if (f()) {
            strConcat = strConcat.concat("[cast connect]");
        }
        String str = this.d;
        Locale locale = Locale.ROOT;
        Pattern pattern = khe.a;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            if (length <= 2) {
                str = length == 2 ? "xx" : "x";
            } else {
                str = String.format(Locale.ROOT, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
            }
        }
        return String.format(locale, "\"%s\" (%s) %s", str, this.a, strConcat);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, str);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.B(parcel, 6, this.f);
        ksy.l(parcel, 7, this.g);
        ksy.F(parcel, 8, DesugarCollections.unmodifiableList(this.t));
        ksy.l(parcel, 9, a());
        ksy.l(parcel, 10, this.h);
        ksy.B(parcel, 11, this.i);
        ksy.B(parcel, 12, this.j);
        ksy.l(parcel, 13, this.k);
        ksy.B(parcel, 14, this.l);
        ksy.q(parcel, 15, this.m);
        ksy.B(parcel, 16, this.n);
        ksy.i(parcel, 17, this.o);
        ksy.A(parcel, 18, d(), i);
        ksy.w(parcel, 19, this.p);
        ksy.o(parcel, 20, Boolean.valueOf(j()));
        ksy.A(parcel, 21, this.r, i);
        ksy.h(parcel, iG);
    }
}
