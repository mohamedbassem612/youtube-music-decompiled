package defpackage;

import android.view.View;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rsf {
    public final List a;
    public final List b;
    public boolean c;
    public View d;
    public adly e;
    public sqr f;
    private final Map g;

    public rsf(List list, List list2) {
        this.a = list;
        this.b = list2;
        new HashSet();
        this.g = new HashMap();
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sqr) it.next()).e();
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((sqr) it2.next()).e();
        }
        b(null);
        this.g.clear();
        this.d = null;
        this.c = false;
    }

    public final void b(sqr sqrVar) {
        View view;
        adly adlyVar;
        this.f = sqrVar;
        if (sqrVar == null || (view = this.d) == null || (adlyVar = this.e) == null) {
            return;
        }
        sqrVar.a(view, adlyVar);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, wjf] */
    public final void c(Optional optional, akck akckVar, amco amcoVar) {
        akrn akrnVar;
        anjj anjjVar;
        akrn akrnVar2;
        anjj anjjVar2;
        a();
        this.c = true;
        sqr sqrVar = null;
        if ((akckVar.b & 64) != 0) {
            anjk anjkVar = akckVar.d;
            if (anjkVar == null) {
                anjkVar = anjk.a;
            }
            for (apji apjiVar : anjkVar.c) {
                aihl aihlVar = anjj.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    anjjVar2 = (anjj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                } else {
                    anjjVar2 = null;
                }
                if (anjjVar2 != null && (anjjVar2.c & 1) != 0) {
                    this.g.put(anjjVar2.d, anjjVar2);
                }
            }
        }
        List<sqr> list = this.b;
        for (sqr sqrVar2 : list) {
            sqrVar2.b = Optional.ofNullable(amcoVar);
            if ((akckVar.b & 32) != 0) {
                akrnVar2 = akckVar.c;
                if (akrnVar2 == null) {
                    akrnVar2 = akrn.a;
                }
            } else {
                akrnVar2 = null;
            }
            if (sqrVar2.d(akrnVar2)) {
                b(sqrVar2);
                break;
            }
        }
        if (this.f == null) {
            if ((akckVar.b & 64) == 0) {
                anjjVar = null;
                break;
            }
            anjk anjkVar2 = akckVar.d;
            if (anjkVar2 == null) {
                anjkVar2 = anjk.a;
            }
            Iterator it = anjkVar2.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    anjjVar = null;
                    break;
                }
                apji apjiVar2 = (apji) it.next();
                aihl aihlVar2 = anjj.b;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                apjiVar2.c(aihlVarCheckIsLite3);
                if (apjiVar2.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                    apjiVar2.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                    anjjVar = (anjj) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    break;
                }
            }
            if (anjjVar != null && (anjjVar.c & 2) != 0) {
                if (anjjVar.e == null) {
                    apji apjiVar3 = apji.a;
                }
                for (sqr sqrVar3 : list) {
                }
            }
        }
        if (this.f == null && optional.isPresent()) {
            ?? r8 = optional.get();
            for (sqr sqrVar4 : this.a) {
                sqrVar4.b = Optional.ofNullable(amcoVar);
                alvt alvtVarU = r8.u();
                if (alvtVarU == null) {
                    akrnVar = null;
                } else {
                    aoqc aoqcVar = alvtVarU.z;
                    if (aoqcVar == null) {
                        aoqcVar = aoqc.a;
                    }
                    if (aoqcVar.b == 153515154) {
                        aoqc aoqcVar2 = alvtVarU.z;
                        if (aoqcVar2 == null) {
                            aoqcVar2 = aoqc.a;
                        }
                        akrnVar = aoqcVar2.b == 153515154 ? (akrn) aoqcVar2.c : akrn.a;
                    } else {
                        akrnVar = null;
                    }
                }
                if (sqrVar4.d(akrnVar)) {
                    sqrVar = sqrVar4;
                    break;
                }
            }
            b(sqrVar);
        }
        sqr sqrVar5 = this.f;
        if (sqrVar5 == null || !this.c) {
            return;
        }
        sqrVar5.b();
    }

    @tcc
    void handleAdCompleteEvent(sen senVar) {
    }

    @tcc
    void handleReplaceCompanionEvent(rsg rsgVar) {
    }
}
