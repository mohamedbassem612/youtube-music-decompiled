package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cil {
    public final int a;
    public final long b;
    public final boolean c;
    public final String d;
    public final long e;
    public final long f;
    public final Uri g;
    public final long h;
    public final String i;
    public final long j;
    public final boolean k;
    public final int l;
    public final long m;
    public final agke n;
    public final long o;
    public final boolean p;
    public final boolean q;

    public cil(cik cikVar) {
        long j;
        boolean z;
        this.a = cikVar.a;
        this.b = cikVar.b;
        int i = cikVar.a;
        boolean z2 = false;
        this.c = i == 1 && cikVar.c;
        this.d = cikVar.d;
        this.e = cikVar.e;
        this.f = cikVar.f;
        this.g = cikVar.g;
        this.h = cikVar.h;
        this.i = cikVar.i;
        this.j = cikVar.j;
        this.k = cikVar.k;
        this.l = cikVar.l;
        this.m = cikVar.m;
        this.n = cikVar.n;
        if (i == 1) {
            j = cikVar.o;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        this.o = j;
        this.p = !z || cikVar.p;
        if (z && cikVar.q) {
            z2 = true;
        }
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cil) {
            cil cilVar = (cil) obj;
            if (this.a == cilVar.a && this.b == cilVar.b && this.c == cilVar.c && this.e == cilVar.e && this.f == cilVar.f && this.h == cilVar.h && this.j == cilVar.j && this.k == cilVar.k && this.l == cilVar.l && this.m == cilVar.m && this.o == cilVar.o && this.p == cilVar.p && this.q == cilVar.q && Objects.equals(this.d, cilVar.d) && Objects.equals(this.g, cilVar.g) && Objects.equals(this.i, cilVar.i) && Objects.equals(this.n, cilVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), this.d, Long.valueOf(this.e), Long.valueOf(this.f), this.g, Long.valueOf(this.h), this.i, Long.valueOf(this.j), Boolean.valueOf(this.k), Integer.valueOf(this.l), Long.valueOf(this.m), this.n, Long.valueOf(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q));
    }
}
