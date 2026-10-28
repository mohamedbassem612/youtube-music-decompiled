package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afli {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public afli(afbk afbkVar) {
        this.e = new afbi();
        this.g = new afbi();
        this.c = new afbi();
        this.j = new afbi();
        this.d = new afav(0.0f);
        this.k = new afav(0.0f);
        this.f = new afav(0.0f);
        this.b = new afav(0.0f);
        this.a = new afba();
        this.i = new afba();
        this.l = new afba();
        this.h = new afba();
        this.e = afbkVar.j;
        this.g = afbkVar.k;
        this.c = afbkVar.l;
        this.j = afbkVar.m;
        this.d = afbkVar.b;
        this.k = afbkVar.c;
        this.f = afbkVar.d;
        this.b = afbkVar.e;
        this.a = afbkVar.f;
        this.i = afbkVar.g;
        this.l = afbkVar.h;
        this.h = afbkVar.i;
    }

    private static void n(afba afbaVar) {
        if (afbaVar instanceof afbi) {
            float f = ((afbi) afbaVar).a;
        } else if (afbaVar instanceof afaz) {
            float f2 = ((afaz) afbaVar).a;
        }
    }

    public final aflm a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5 = this.a;
        if (obj5 == null || (obj = this.b) == null || (obj2 = this.d) == null || (obj3 = this.f) == null || (obj4 = this.i) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" workerClass");
            }
            if (this.b == null) {
                sb.append(" constraints");
            }
            if (this.d == null) {
                sb.append(" initialDelay");
            }
            if (this.f == null) {
                sb.append(" inputData");
            }
            if (this.i == null) {
                sb.append(" tags");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj6 = this.c;
        Object obj7 = this.e;
        Object obj8 = this.g;
        Object obj9 = this.h;
        Object obj10 = this.j;
        agev agevVar = (agev) obj10;
        agev agevVar2 = (agev) obj8;
        agev agevVar3 = (agev) obj7;
        agev agevVar4 = (agev) obj6;
        dyp dypVar = (dyp) obj3;
        aflk aflkVar = (aflk) obj2;
        dyn dynVar = (dyn) obj;
        Class cls = (Class) obj5;
        aflm aflmVar = new aflm(cls, dynVar, agevVar4, aflkVar, agevVar3, dypVar, agevVar2, (agev) obj9, (agkz) obj4, agevVar, (agev) this.k, (agev) this.l);
        agev agevVar5 = aflmVar.l;
        if (agevVar5.g() && ((String) agevVar5.c()).contains(":")) {
            throw new IllegalArgumentException("Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
        }
        return aflmVar;
    }

    public final void b(dyn dynVar) {
        if (dynVar == null) {
            throw new NullPointerException("Null constraints");
        }
        this.b = dynVar;
    }

    public final void c(Set set) {
        this.i = agkz.n(set);
    }

    public final void d(float f) {
        this.b = new afav(f);
    }

    public final void e(float f) {
        this.f = new afav(f);
    }

    public final void f(float f) {
        this.d = new afav(f);
    }

    public final void g(float f) {
        this.k = new afav(f);
    }

    public final void h(float f) {
        f(f);
        g(f);
        e(f);
        d(f);
    }

    public final void i(float f) {
        afbi afbiVar = new afbi();
        l(afbiVar);
        m(afbiVar);
        k(afbiVar);
        j(afbiVar);
        h(f);
    }

    public final void j(afba afbaVar) {
        this.j = afbaVar;
        n(afbaVar);
    }

    public final void k(afba afbaVar) {
        this.c = afbaVar;
        n(afbaVar);
    }

    public final void l(afba afbaVar) {
        this.e = afbaVar;
        n(afbaVar);
    }

    public final void m(afba afbaVar) {
        this.g = afbaVar;
        n(afbaVar);
    }

    public afli() {
        agdf agdfVar = agdf.a;
        this.c = agdfVar;
        this.e = agdfVar;
        this.g = agdfVar;
        this.h = agdfVar;
        this.j = agdfVar;
        this.k = agdfVar;
        this.l = agdfVar;
    }

    public afli(aflm aflmVar) {
        agdf agdfVar = agdf.a;
        this.c = agdfVar;
        this.e = agdfVar;
        this.g = agdfVar;
        this.h = agdfVar;
        this.j = agdfVar;
        this.k = agdfVar;
        this.l = agdfVar;
        this.a = aflmVar.a;
        this.b = aflmVar.b;
        this.c = aflmVar.c;
        this.d = aflmVar.d;
        this.e = aflmVar.e;
        this.f = aflmVar.f;
        this.g = aflmVar.g;
        this.h = aflmVar.h;
        this.i = aflmVar.i;
        this.j = aflmVar.j;
        this.k = aflmVar.k;
        this.l = aflmVar.l;
    }

    public afli(byte[] bArr) {
        this.e = new afbi();
        this.g = new afbi();
        this.c = new afbi();
        this.j = new afbi();
        this.d = new afav(0.0f);
        this.k = new afav(0.0f);
        this.f = new afav(0.0f);
        this.b = new afav(0.0f);
        this.a = new afba();
        this.i = new afba();
        this.l = new afba();
        this.h = new afba();
    }
}
