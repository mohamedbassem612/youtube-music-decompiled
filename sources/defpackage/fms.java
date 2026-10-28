package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fms extends fml {
    private final fnj a;

    public fms() {
        fnh fnhVar = fnh.a;
        if (fnhVar == null) {
            fnf fnfVar = new fnf();
            fnh.a = new fnh(fnfVar);
            fnh fnhVar2 = fnh.a;
            fnfVar.c = fnhVar2;
            fnhVar = fnhVar2;
        }
        fnj fnjVar = new fnj(fnhVar);
        this.a = fnjVar;
        qcb qcbVar = new qcb(this);
        if (fnjVar.e != null) {
            throw new RuntimeException("Overriding existing listener!");
        }
        fnjVar.e = qcbVar;
    }

    @Override // defpackage.fmj
    public final void f() {
        if (g()) {
            this.a.b();
        }
    }

    @Override // defpackage.fmj
    public final boolean g() {
        return this.a.c;
    }

    @Override // defpackage.fmj
    public final void h(hhb hhbVar) {
        if (!l()) {
            i();
            return;
        }
        k();
        m(hhbVar);
        fnj fnjVar = this.a;
        int i = 0;
        while (true) {
            xsc xscVar = fnjVar.f;
            ArrayList arrayList = (ArrayList) xscVar.b;
            if (i >= arrayList.size()) {
                fnjVar.d = true;
                fnjVar.c = true;
                fnjVar.a.b(fnjVar);
                return;
            }
            fnp fnpVar = (fnp) arrayList.get(i);
            fnp fnpVar2 = (fnp) ((ArrayList) xscVar.a).get(i);
            String str = (String) ((ArrayList) xscVar.c).get(i);
            fnp fnpVarG = fnpVar2.g(str);
            if (fnpVarG != null) {
                xsc.aF(fnpVarG, fnpVar2, str);
            }
            if (fnpVar.b == null) {
                fnpVar.b = new ArrayList();
            }
            fnpVar.b.add(fnpVar2);
            if (fnpVar2.a == null) {
                fnpVar2.a = new LinkedHashMap();
            }
            fnpVar2.a.put(str, fnpVar);
            i++;
        }
    }

    protected abstract void m(hhb hhbVar);

    public final void n(fnp fnpVar, fnp fnpVar2) {
        this.a.a(fnpVar, fnpVar2, "default_input");
    }

    public final void o(fnp fnpVar, fnp fnpVar2, String str) {
        this.a.a(fnpVar, fnpVar2, str);
    }
}
