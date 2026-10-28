package defpackage;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class boo {
    public static final Object a = new Object();
    public final Object b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public final Runnable h;
    private final vw i;
    private boolean j;
    private boolean k;

    public boo() {
        this.b = new Object();
        this.i = new vw();
        this.c = 0;
        Object obj = a;
        this.f = obj;
        this.h = new px(this, 3, null);
        this.e = obj;
        this.g = -1;
    }

    static void a(String str) {
        if (!vq.q().r()) {
            throw new IllegalStateException(a.bT(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void i(bon bonVar) {
        if (bonVar.d) {
            if (!bonVar.fY()) {
                bonVar.d(false);
                return;
            }
            int i = bonVar.e;
            int i2 = this.g;
            if (i < i2) {
                bonVar.e = i2;
                bonVar.c.a(this.e);
            }
        }
    }

    final void b(bon bonVar) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (bonVar != null) {
                i(bonVar);
            } else {
                vw vwVar = this.i;
                vt vtVar = new vt(vwVar);
                vwVar.c.put(vtVar, Boolean.FALSE);
                while (vtVar.hasNext()) {
                    i((bon) ((vs) vtVar.next()).b);
                    if (this.k) {
                        break;
                    }
                }
            }
            if (!this.k) {
                this.j = false;
                return;
            }
            bonVar = null;
        }
    }

    public final void c(bog bogVar, boq boqVar) {
        a("observe");
        if (bogVar.getLifecycle().a() != bob.a) {
            bom bomVar = new bom(this, bogVar, boqVar);
            Object objB = this.i.b(boqVar, bomVar);
            if (objB == null) {
                bogVar.getLifecycle().b(bomVar);
            } else if (!((bon) objB).c(bogVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public final void d(boq boqVar) {
        a("observeForever");
        bol bolVar = new bol(this, boqVar);
        Object objB = this.i.b(boqVar, bolVar);
        if (objB instanceof bom) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (objB == null) {
            bolVar.d(true);
        }
    }

    public void g(boq boqVar) {
        a("removeObserver");
        vw vwVar = this.i;
        vs vsVarA = vwVar.a(boqVar);
        Object obj = null;
        if (vsVarA != null) {
            vwVar.d--;
            WeakHashMap weakHashMap = vwVar.c;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((vv) it.next()).b(vsVarA);
                }
            }
            vs vsVar = vsVarA.d;
            vs vsVar2 = vsVarA.c;
            if (vsVar != null) {
                vsVar.c = vsVar2;
            } else {
                vwVar.a = vsVar2;
            }
            vs vsVar3 = vsVarA.c;
            if (vsVar3 != null) {
                vsVar3.d = vsVar;
            } else {
                vwVar.b = vsVar;
            }
            vsVarA.c = null;
            vsVarA.d = null;
            obj = vsVarA.b;
        }
        if (obj != null) {
            bon bonVar = (bon) obj;
            bonVar.b();
            bonVar.d(false);
        }
    }

    public void h(Object obj) {
        throw null;
    }

    protected void e() {
    }

    protected void f() {
    }

    public boo(Object obj) {
        this.b = new Object();
        this.i = new vw();
        this.c = 0;
        this.f = a;
        this.h = new px(this, 3, null);
        this.e = obj;
        this.g = 0;
    }
}
