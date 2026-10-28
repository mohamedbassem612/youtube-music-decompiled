package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class giy {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;

    public giy() {
        kwq kwqVar = new kwq();
        this.a = kwqVar;
        this.b = kwqVar.G();
        this.d = new fyl();
        this.c = new kyr((byte[]) null, (byte[]) null);
        kwqVar.C("internal.registerCallback", new ub(this, 7));
        kwqVar.C("internal.eventLogger", new ub(this, 8));
    }

    public final void a(String str, Callable callable) {
        ((kwq) this.a).C(str, callable);
    }

    public final boolean b() {
        return !((fyl) this.d).c.isEmpty();
    }

    public final boolean c() {
        fyl fylVar = (fyl) this.d;
        return !fylVar.b.equals(fylVar.a);
    }

    public giy(ght ghtVar, gkg gkgVar, gjt gjtVar) {
        this.a = ghtVar;
        this.c = gkgVar;
        this.d = gjtVar;
    }
}
