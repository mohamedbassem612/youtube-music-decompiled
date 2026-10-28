package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actx {
    public final abvk a;
    public final awly b;
    public final SparseBooleanArray c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final hno h;
    public adif i;
    private final abmt j;
    private int k;

    public actx(abvk abvkVar, abmt abmtVar, hno hnoVar) {
        abvkVar.getClass();
        abmtVar.getClass();
        hnoVar.getClass();
        this.a = abvkVar;
        this.j = abmtVar;
        this.h = hnoVar;
        this.b = new awli().az();
        this.c = new SparseBooleanArray();
    }

    public final int a() {
        int i;
        int i2 = 0;
        if (this.e) {
            this.b.kk(Boolean.TRUE);
            this.a.ap(false, 19);
            SparseBooleanArray sparseBooleanArray = this.c;
            synchronized (sparseBooleanArray) {
                do {
                    i = this.k + 1;
                    this.k = i;
                    if (i == Integer.MAX_VALUE) {
                        this.k = 1;
                        i = 1;
                    }
                } while (sparseBooleanArray.get(i));
                sparseBooleanArray.put(this.k, true);
                i2 = this.k;
            }
        }
        return i2;
    }

    public final void b() {
        int i = this.d;
        if (i != 0) {
            this.d = 0;
            d(i);
        }
    }

    public final void c() {
        int size;
        int i = this.d;
        if (i != 0) {
            this.d = 0;
            SparseBooleanArray sparseBooleanArray = this.c;
            synchronized (sparseBooleanArray) {
                sparseBooleanArray.delete(i);
                size = sparseBooleanArray.size();
            }
            if (size == 0) {
                this.b.kk(Boolean.FALSE);
            }
        }
    }

    public final void d(int i) {
        SparseBooleanArray sparseBooleanArray = this.c;
        synchronized (sparseBooleanArray) {
            if (i != 0) {
                if (sparseBooleanArray.get(i)) {
                    sparseBooleanArray.delete(i);
                    if (sparseBooleanArray.size() == 0 && this.e) {
                        e();
                    }
                }
            }
        }
    }

    public final void e() {
        wjf wjfVarC;
        if (f() || this.f) {
            return;
        }
        int i = this.d;
        if (i != 0) {
            this.d = 0;
            SparseBooleanArray sparseBooleanArray = this.c;
            synchronized (sparseBooleanArray) {
                sparseBooleanArray.delete(i);
            }
        }
        this.b.kk(Boolean.FALSE);
        abvk abvkVar = this.a;
        acfw acfwVarI = abvkVar.i();
        if (acfwVarI != null && (wjfVarC = acfwVarI.c()) != null && wjfVarC.V() && !aawr.y(abvkVar)) {
            abvkVar.af(this.j.j());
        }
        abvkVar.A();
    }

    public final boolean f() {
        if (this.g) {
            adif adifVar = this.i;
            if ((adifVar != null ? adifVar.i() : null) == apdw.REEL_LOOP_BEHAVIOR_END_SCREEN) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        boolean z;
        SparseBooleanArray sparseBooleanArray = this.c;
        synchronized (sparseBooleanArray) {
            z = sparseBooleanArray.size() != 0;
        }
        return z;
    }
}
