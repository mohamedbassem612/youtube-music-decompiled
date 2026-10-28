package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjd {
    public final ComponentTree a;
    public fjc b;
    public fib h;
    public fib i;
    private fkz j;
    private fhp k;
    public boolean c = false;
    public boolean d = false;
    public final List f = new LinkedList();
    public final List g = new LinkedList();
    public final String e = Thread.currentThread().getName();

    public fjd(fjc fjcVar, fkz fkzVar, ComponentTree componentTree, fhp fhpVar, fib fibVar) {
        this.b = fjcVar;
        this.k = fhpVar;
        this.a = componentTree;
        this.h = fibVar;
        this.j = fkzVar;
    }

    public final fkz a() {
        fkz fkzVar = this.j;
        fkzVar.getClass();
        return fkzVar;
    }

    final void b() {
        this.b = null;
        this.j = null;
        this.k = null;
        this.h = null;
        this.f.add(Thread.currentThread().getName());
    }

    final boolean c() {
        fhp fhpVar = this.k;
        boolean z = (fhpVar == null || gzj.aT() || !fhpVar.j) ? false : true;
        fjc fjcVar = this.b;
        return fjcVar != null && fjcVar.H && z;
    }

    public final boolean d() {
        fhp fhpVar = this.k;
        return fhpVar != null && fhpVar.m;
    }
}
