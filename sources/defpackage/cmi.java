package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cmi implements cno {
    private Looper b;
    private btn c;
    private cfd d;
    public crd z;
    private final ArrayList a = new ArrayList(1);
    public final HashSet y = new HashSet(1);
    public final aae A = new aae(new CopyOnWriteArrayList(), 0, (cnm) null);
    public final aae B = new aae();

    @Override // defpackage.cno
    public final void A(cnn cnnVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(cnnVar);
        if (!arrayList.isEmpty()) {
            u(cnnVar);
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.y.clear();
        jI();
    }

    @Override // defpackage.cno
    public final void B(cjv cjvVar) {
        CopyOnWriteArrayList<eol> copyOnWriteArrayList = (CopyOnWriteArrayList) this.B.c;
        for (eol eolVar : copyOnWriteArrayList) {
            if (eolVar.b == cjvVar) {
                copyOnWriteArrayList.remove(eolVar);
            }
        }
    }

    @Override // defpackage.cno
    public final void C(cns cnsVar) {
        CopyOnWriteArrayList<eol> copyOnWriteArrayList = (CopyOnWriteArrayList) this.A.c;
        for (eol eolVar : copyOnWriteArrayList) {
            if (eolVar.b == cnsVar) {
                copyOnWriteArrayList.remove(eolVar);
            }
        }
    }

    protected final aae F(cnm cnmVar) {
        return this.A.t(0, cnmVar);
    }

    protected final aae G(cnm cnmVar) {
        return this.B.u(0, cnmVar);
    }

    protected abstract void jH(bzg bzgVar);

    protected abstract void jI();

    protected final cfd r() {
        cfd cfdVar = this.d;
        cfdVar.getClass();
        return cfdVar;
    }

    @Override // defpackage.cno
    public final void s(Handler handler, cjv cjvVar) {
        ((CopyOnWriteArrayList) this.B.c).add(new eol(handler, cjvVar));
    }

    @Override // defpackage.cno
    public final void t(Handler handler, cns cnsVar) {
        ((CopyOnWriteArrayList) this.A.c).add(new eol(handler, cnsVar));
    }

    @Override // defpackage.cno
    public final void u(cnn cnnVar) {
        HashSet hashSet = this.y;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cnnVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        v();
    }

    @Override // defpackage.cno
    public final void w(cnn cnnVar) {
        this.b.getClass();
        HashSet hashSet = this.y;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cnnVar);
        if (zIsEmpty) {
            x();
        }
    }

    @Override // defpackage.cno
    public final void y(cnn cnnVar, cfd cfdVar, crd crdVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.b;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        ahno.F(z);
        this.d = cfdVar;
        this.z = crdVar;
        btn btnVar = this.c;
        this.a.add(cnnVar);
        if (this.b == null) {
            this.b = looperMyLooper;
            this.y.add(cnnVar);
            jH(crdVar.f());
        } else if (btnVar != null) {
            w(cnnVar);
            cnnVar.a(this, btnVar);
        }
    }

    public final void z(btn btnVar) {
        this.c = btnVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cnn) arrayList.get(i)).a(this, btnVar);
        }
    }

    @Override // defpackage.cno
    public /* synthetic */ void D() {
    }

    @Override // defpackage.cno
    public /* synthetic */ void E() {
    }

    protected void v() {
    }

    protected void x() {
    }

    @Override // defpackage.cno
    public /* synthetic */ void jJ(bss bssVar) {
    }
}
