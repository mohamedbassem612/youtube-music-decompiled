package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zz {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public zz(te teVar) {
        this.d = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList(teVar.a);
        this.c = new ArrayList(teVar.b);
        this.b = teVar.c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    private final void e() {
        if (this.a) {
            this.d = new ArrayList((Collection) this.d);
            this.c = new ArrayList((Collection) this.c);
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final te a() {
        this.a = true;
        return new te(this.d, this.c, (va) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(sz szVar) {
        szVar.getClass();
        e();
        this.d.add(szVar.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void c(Set set) {
        set.getClass();
        rx.a();
        azs.f(!set.isEmpty(), "The set of required permissions cannot be empty");
        e();
        this.c.add(new tr(set));
    }

    public final void d(sz szVar) {
        e();
        this.b = szVar == null ? null : szVar.a;
    }

    public zz() {
        this.d = new ArrayList();
        this.c = new ArrayList();
    }
}
