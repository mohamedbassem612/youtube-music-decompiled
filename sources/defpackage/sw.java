package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sw {
    public String a;
    public zz b;
    private boolean c;
    private List d;
    private boolean e;

    public sw(sx sxVar) {
        this.d = new ArrayList();
        sxVar.getClass();
        this.a = sxVar.a;
        this.c = sxVar.b;
        this.b = new zz(sxVar.c);
        this.d = sxVar.d;
    }

    public final sx a() {
        this.e = true;
        return new sx(this.a, this.c, this.b.a(), this.d);
    }

    public final void b() {
        if (this.e) {
            this.d = new ArrayList(this.d);
            this.e = false;
        }
    }

    public final void c(te teVar) {
        teVar.getClass();
        b();
        this.d.add(teVar);
    }

    public final void d(sz szVar) {
        b();
        this.b.b(szVar);
    }

    public final void e(Set set) {
        b();
        this.b.c(set);
    }

    public final void f(boolean z) {
        b();
        this.c = z;
    }

    public final void g(sz szVar) {
        b();
        this.b.d(szVar);
    }

    public sw(String str) {
        this.d = new ArrayList();
        str.getClass();
        this.a = str;
        this.b = new zz();
    }
}
