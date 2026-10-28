package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class rzv implements rsq, sap {
    public wjf b;
    public final awmd c;
    private abob f;
    private final awmd g;
    final List e = new ArrayList();
    public final List d = new ArrayList();
    public String a = "";

    public rzv(awmd awmdVar, awmd awmdVar2) {
        this.c = awmdVar;
        this.g = awmdVar2;
    }

    @Override // defpackage.sap
    public final void X(smr smrVar) {
        List list = this.d;
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eqq eqqVar = (eqq) arrayList.get(i);
            if (smrVar == null) {
                rmp.n(null, "Provided onSlotUnscheduled() param was null");
            } else if (eqqVar == null) {
                rmp.n(null, "Slot bundle was null");
            } else {
                if (TextUtils.equals(((smr) eqqVar.a).a, smrVar.a)) {
                    this.e.add(eqqVar);
                    list.remove(eqqVar);
                }
            }
        }
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        this.a = str;
        this.f = abobVar;
        this.b = wjfVar;
        if (abobVar == abob.a) {
            this.d.clear();
            this.e.clear();
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        if (this.f == abob.i) {
            List list = this.e;
            if (list.isEmpty() || !TextUtils.equals(this.a, str)) {
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            arrayList.addAll(list);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                eqq eqqVar = (eqq) arrayList.get(i);
                if (eqqVar.b) {
                    if (!((snh) eqqVar.c).a(j)) {
                        list.remove(eqqVar);
                        ((roq) this.g.io()).f(10, (skh) eqqVar.d, new rzt(eqqVar, 2));
                    }
                } else if (((snh) eqqVar.c).a(j)) {
                    eqqVar.b = true;
                }
            }
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }
}
