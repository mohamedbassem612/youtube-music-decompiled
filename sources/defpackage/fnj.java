package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fnj {
    public final fnh a;
    public qcb e;
    public final xsc f = new xsc((byte[]) null, (byte[]) null);
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;

    public fnj(fnh fnhVar) {
        this.a = fnhVar;
    }

    public final void a(fnp fnpVar, fnp fnpVar2, String str) {
        if (this.d) {
            throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
        }
        xsc xscVar = this.f;
        ((ArrayList) xscVar.b).add(fnpVar);
        ((ArrayList) xscVar.a).add(fnpVar2);
        ((ArrayList) xscVar.c).add(str);
        ArrayList arrayList = this.b;
        arrayList.add(fnpVar);
        arrayList.add(fnpVar2);
    }

    public final void b() {
        if (!this.c) {
            return;
        }
        int i = 0;
        this.c = false;
        this.a.c(this);
        xsc xscVar = this.f;
        while (true) {
            ArrayList arrayList = (ArrayList) xscVar.b;
            if (i >= arrayList.size()) {
                return;
            }
            fnp fnpVar = (fnp) arrayList.get(i);
            fnp fnpVar2 = (fnp) ((ArrayList) xscVar.a).get(i);
            String str = (String) ((ArrayList) xscVar.c).get(i);
            if (fnpVar2.g(str) == fnpVar) {
                xsc.aF(fnpVar, fnpVar2, str);
            }
            i++;
        }
    }
}
