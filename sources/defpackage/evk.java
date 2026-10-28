package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evk {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public esc c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public ety h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public ett m;
    public esf n;
    public evs o;
    public boolean p;
    public boolean q;
    public kmm r;

    final euc a(Class cls) {
        euc eucVar = (euc) this.i.get(cls);
        if (eucVar == null) {
            for (Map.Entry entry : this.i.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    eucVar = (euc) entry.getValue();
                    break;
                }
            }
        }
        if (eucVar != null) {
            return eucVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(enb.b(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return ezr.b;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [axr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [axr, java.lang.Object] */
    final ewd b(Class cls) {
        ewd ewdVar;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        jqs jqsVarB = this.c.b();
        fdt fdtVar = (fdt) jqsVarB.b;
        AtomicReference atomicReference = fdtVar.c;
        Class cls6 = this.g;
        Class cls7 = this.j;
        ewd ewdVar2 = null;
        ffq ffqVar = (ffq) atomicReference.getAndSet(null);
        if (ffqVar == null) {
            ffqVar = new ffq();
        }
        ffqVar.a(cls5, cls6, cls7);
        afv afvVar = fdtVar.b;
        synchronized (afvVar) {
            ewdVar = (ewd) afvVar.get(ffqVar);
        }
        fdtVar.c.set(ffqVar);
        Object obj = jqsVarB.b;
        ewd ewdVar3 = fdt.a;
        if (ewdVar3.equals(ewdVar)) {
            return null;
        }
        if (ewdVar != null) {
            return ewdVar;
        }
        ArrayList arrayList = new ArrayList();
        gev gevVar = (gev) jqsVarB.e;
        for (Class cls8 : gevVar.f(cls5, cls6)) {
            ci ciVar = (ci) jqsVarB.d;
            for (Class cls9 : ciVar.T(cls8, cls7)) {
                arrayList.add(new evm(cls5, cls8, cls9, gevVar.e(cls5, cls8), ciVar.S(cls8, cls9), jqsVarB.c));
                cls5 = cls;
                ciVar = ciVar;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            ewdVar2 = new ewd(cls2, cls3, cls4, arrayList, jqsVarB.c);
        }
        afv afvVar2 = ((fdt) obj).b;
        synchronized (afvVar2) {
            ffq ffqVar2 = new ffq(cls2, cls3, cls4);
            if (ewdVar2 != null) {
                ewdVar3 = ewdVar2;
            }
            afvVar2.put(ffqVar2, ewdVar3);
        }
        return ewdVar2;
    }

    final exe c() {
        return this.r.e();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final List d() {
        if (!this.l) {
            this.l = true;
            List list = this.b;
            list.clear();
            List listE = e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                hed hedVar = (hed) listE.get(i);
                Object obj = hedVar.b;
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                int i2 = 0;
                while (true) {
                    ?? r7 = hedVar.c;
                    if (i2 < r7.size()) {
                        if (!list.contains(r7.get(i2))) {
                            list.add((ett) r7.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final List e() {
        if (!this.k) {
            this.k = true;
            List list = this.a;
            list.clear();
            List listD = this.c.b().d(this.d);
            int size = listD.size();
            for (int i = 0; i < size; i++) {
                hed hedVarB = ((eyv) listD.get(i)).b(this.d, this.e, this.f, this.h);
                if (hedVarB != null) {
                    list.add(hedVarB);
                }
            }
        }
        return this.a;
    }

    final List f(File file) {
        return this.c.b().d(file);
    }

    final boolean g(Class cls) {
        return b(cls) != null;
    }

    final ewv h() {
        return this.c.e;
    }
}
