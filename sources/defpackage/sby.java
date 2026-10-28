package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sby extends sbk implements rsq {
    private final awmd a;
    private final sci b;
    private abnr c;
    private String d;

    public sby(awmd awmdVar, sci sciVar) {
        this.a = awmdVar;
        this.b = sciVar;
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.q(sld.class, sle.class);
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        abnr abnrVar3 = this.c;
        abnr abnrVar4 = abnr.FULLSCREEN;
        boolean z = abnrVar3 != abnrVar4 && abnrVar == abnrVar4;
        boolean z2 = abnrVar3 == abnrVar4 && abnrVar != abnrVar4;
        if (!z && !z2) {
            this.c = abnrVar;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            if (z) {
                snk snkVar = sniVar.b;
                if (snkVar instanceof sld) {
                    sld sldVar = (sld) snkVar;
                    String str = sldVar.b;
                    if (TextUtils.equals(str, this.d) && (!sldVar.a || !this.b.a(str))) {
                        arrayList.add(sniVar);
                    }
                }
            }
            if (z2) {
                snk snkVar2 = sniVar.b;
                if (snkVar2 instanceof sle) {
                    sle sleVar = (sle) snkVar2;
                    String str2 = sleVar.b;
                    if (TextUtils.equals(str2, this.d) && (!sleVar.a || !this.b.a(str2))) {
                        arrayList.add(sniVar);
                    }
                }
            }
        }
        this.c = abnrVar;
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.rsq
    public final void d(String str, int i) {
        this.d = str;
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
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
