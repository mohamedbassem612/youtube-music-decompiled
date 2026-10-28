package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cms extends cmi {
    private final HashMap a = new HashMap();
    private Handler b;

    protected cms() {
    }

    protected cnm f(Object obj, cnm cnmVar) {
        throw null;
    }

    protected abstract void g(Object obj, cno cnoVar, btn btnVar);

    public final void h(final Object obj, cno cnoVar) {
        HashMap map = this.a;
        ahno.F(!map.containsKey(obj));
        cnn cnnVar = new cnn() { // from class: cmq
            @Override // defpackage.cnn
            public final void a(cno cnoVar2, btn btnVar) {
                this.a.g(obj, cnoVar2, btnVar);
            }
        };
        cmr cmrVar = new cmr(this, obj);
        map.put(obj, new xsc(cnoVar, cnnVar, cmrVar, (float[]) null));
        Handler handler = this.b;
        handler.getClass();
        cnoVar.t(handler, cmrVar);
        Handler handler2 = this.b;
        handler2.getClass();
        cnoVar.s(handler2, cmrVar);
        cfd cfdVarR = r();
        crd crdVar = this.z;
        crdVar.getClass();
        cnoVar.y(cnnVar, cfdVarR, crdVar);
        if (this.y.isEmpty()) {
            cnoVar.u(cnnVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [cjv, cns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cno, java.lang.Object] */
    public final void j(Object obj) {
        xsc xscVar = (xsc) this.a.remove(obj);
        xscVar.getClass();
        ?? r2 = xscVar.a;
        r2.A(xscVar.b);
        ?? r1 = xscVar.c;
        r2.C(r1);
        r2.B(r1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cno, java.lang.Object] */
    @Override // defpackage.cno
    public void jG() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((xsc) it.next()).a.jG();
        }
    }

    @Override // defpackage.cmi
    protected void jH(bzg bzgVar) {
        this.b = bwp.H(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [cjv, cns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [cno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [cnn, java.lang.Object] */
    @Override // defpackage.cmi
    protected void jI() {
        HashMap map = this.a;
        for (xsc xscVar : map.values()) {
            ?? r2 = xscVar.a;
            r2.A(xscVar.b);
            ?? r1 = xscVar.c;
            r2.C(r1);
            r2.B(r1);
        }
        map.clear();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [cno, java.lang.Object] */
    @Override // defpackage.cmi
    protected final void v() {
        for (xsc xscVar : this.a.values()) {
            xscVar.a.u(xscVar.b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [cno, java.lang.Object] */
    @Override // defpackage.cmi
    protected final void x() {
        for (xsc xscVar : this.a.values()) {
            xscVar.a.w(xscVar.b);
        }
    }

    protected void m(Object obj) {
    }

    protected int d(Object obj, int i) {
        return i;
    }
}
