package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aeg {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public aeg(tp tpVar) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = false;
        ((ArrayList) this.e).addAll(tpVar.a());
        ((ArrayList) this.c).addAll(tpVar.b());
        Object obj = this.b;
        if (tpVar.e == null) {
            List list = tpVar.c;
            azs.l(list);
            tpVar.e = new afx(list);
        }
        ((ArrayList) obj).addAll(DesugarCollections.unmodifiableSet(tpVar.e));
        this.d.addAll(DesugarCollections.unmodifiableList(tpVar.d));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final tp a() {
        this.a = true;
        return new tp(this.e, this.c, this.b, this.d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection] */
    public final void b() {
        if (this.a) {
            this.d = new ArrayList((Collection) this.d);
            this.e = new ArrayList((Collection) this.e);
            this.b = new ArrayList((Collection) this.b);
            this.c = new ArrayList((Collection) this.c);
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [avbf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [avbf, java.lang.Object] */
    public final avbh c() {
        Object obj = this.e;
        return new avbh((avbg) obj, (String) this.d, this.c, this.b, this.a);
    }

    public final void d() {
        this.a = true;
    }

    public aeg() {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = false;
    }

    public aeg(byte[] bArr) {
    }
}
