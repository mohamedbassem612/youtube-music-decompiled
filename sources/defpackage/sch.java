package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sch extends sbk implements rsq {
    private final awmd a;
    private final awmd b;
    private abob c;
    private String d;

    public sch(awmd awmdVar, awmd awmdVar2) {
        this.a = awmdVar;
        this.b = awmdVar2;
    }

    private final boolean b(smr smrVar, boolean z) {
        if (this.c == abob.a) {
            return (z && ((sbj) this.b.io()).e.contains(smrVar.a)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.sbk
    protected final void Z(snk snkVar, smr smrVar) {
        boolean zB;
        if (this.c != null) {
            if (snkVar instanceof slt) {
                slt sltVar = (slt) snkVar;
                String str = sltVar.a;
                zB = b(smrVar, sltVar.b);
            } else {
                zB = false;
            }
            if ((snkVar instanceof she) && TextUtils.equals(this.d, ((she) snkVar).a) && this.c != abob.a) {
                zB = true;
            }
            if ((snkVar instanceof slw) && TextUtils.equals(this.d, ((slw) snkVar).a)) {
                zB = true;
            }
            if (snkVar instanceof slq) {
                slq slqVar = (slq) snkVar;
                if (this.c != abob.f || !TextUtils.equals(this.d, slqVar.c())) {
                    if (!zB) {
                        return;
                    }
                }
            } else if (!zB) {
                return;
            }
            ((rsk) this.a.io()).q(Arrays.asList(this.g.Y(snkVar.b())));
        }
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.s(slt.class, she.class, slw.class, slq.class);
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        this.d = str;
        this.c = abobVar;
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof slt) {
                slt sltVar = (slt) snkVar;
                String str3 = sltVar.a;
                if (b(sniVar.c, sltVar.b)) {
                    arrayList.add(sniVar);
                }
            } else if (snkVar instanceof she) {
                she sheVar = (she) snkVar;
                if (this.c == abob.c && TextUtils.equals(this.d, sheVar.a)) {
                    arrayList.add(sniVar);
                }
            } else if (snkVar instanceof slw) {
                if (TextUtils.equals(this.d, ((slw) snkVar).a)) {
                    arrayList.add(sniVar);
                }
            } else if (snkVar instanceof slq) {
                slq slqVar = (slq) snkVar;
                if (this.c == abob.f && TextUtils.equals(this.d, slqVar.c())) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
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

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
