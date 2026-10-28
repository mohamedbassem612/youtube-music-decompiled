package defpackage;

import j$.util.Objects;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oyu {
    public final String a;
    public final File b;
    public final String c;
    public final ozc d;
    final boolean f;
    final boolean g;
    public final elr l;
    public final tld m;
    private oyt o;
    public final aglz e = new aghn(null);
    int h = 0;
    private boolean n = false;
    public nsg k = null;
    public int i = -1;
    public final int j = -1;

    public oyu(ozc ozcVar, String str, File file, String str2, elr elrVar, tld tldVar) {
        this.o = oyt.a;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.l = elrVar;
        this.d = ozcVar;
        this.m = tldVar;
        String str3 = oyr.a;
        boolean zStartsWith = str.startsWith("data:");
        this.f = zStartsWith;
        boolean zStartsWith2 = str.startsWith("file:");
        this.g = zStartsWith2;
        if (zStartsWith2 || zStartsWith) {
            this.o = oyt.c;
        }
    }

    public final synchronized oyt a() {
        return this.o;
    }

    final synchronized void b() {
    }

    final synchronized void c() {
    }

    final synchronized void d() {
        this.n = true;
    }

    public final synchronized boolean e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oyu)) {
            return false;
        }
        oyu oyuVar = (oyu) obj;
        return Objects.equals(this.a, oyuVar.a) && Objects.equals(this.b, oyuVar.b) && Objects.equals(this.c, oyuVar.c) && Objects.equals(this.o, oyuVar.o) && this.n == oyuVar.n;
    }

    public final void f(oyt oytVar) {
        if (this.g || this.f) {
            return;
        }
        this.o = oytVar;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.o, Boolean.valueOf(this.n));
    }

    public final String toString() {
        ageu ageuVarAb = ahno.ab(oyu.class);
        ageuVarAb.b("", this.a);
        ageuVarAb.b("targetDirectory", this.b);
        ageuVarAb.b("fileName", this.c);
        ageuVarAb.b("requiredConnectivity", this.o);
        ageuVarAb.g("canceled", this.n);
        return ageuVarAb.toString();
    }
}
