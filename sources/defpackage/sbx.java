package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbx extends sbk implements rsq {
    private final awmd a;
    private final sci b;
    private String c;

    public sbx(awmd awmdVar, sci sciVar) {
        this.a = awmdVar;
        this.b = sciVar;
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(sls.class);
    }

    @Override // defpackage.rsq
    public final void d(String str, int i) {
        this.c = str;
    }

    @Override // defpackage.rsq
    public final void f(zhz zhzVar) {
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            sls slsVar = (sls) sniVar.b;
            slsVar.f();
            boolean z = zhzVar.f;
            boolean z2 = slsVar.h() && this.b.a(slsVar.e());
            if (z && TextUtils.equals(slsVar.e(), this.c) && !z2) {
                arrayList.add(new sni(sniVar, shh.b(new shp(sfv.d(zhzVar)))));
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
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
