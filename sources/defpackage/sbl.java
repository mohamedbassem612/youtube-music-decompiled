package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbl extends sbk implements rsq, rtg {
    private final awmd a;
    private final sci b;

    public sbl(awmd awmdVar, sci sciVar, vwt vwtVar) {
        this.a = awmdVar;
        this.b = sciVar;
        vwtVar.an(this);
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(ska.class);
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        abobVar.h();
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        if (i == 4) {
            ArrayList arrayList = new ArrayList();
            for (sni sniVar : this.g.aa()) {
                snk snkVar = sniVar.b;
                if (snkVar instanceof ska) {
                    ska skaVar = (ska) snkVar;
                    if (skaVar.c != 2) {
                        String str2 = skaVar.b;
                        if (TextUtils.equals(str2, str) && (!skaVar.a || !this.b.a(str2))) {
                            arrayList.add(sniVar);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ((rsk) this.a.io()).q(arrayList);
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rtg
    public final /* synthetic */ void Y(boolean z) {
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
