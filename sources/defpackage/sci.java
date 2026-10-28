package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sci implements rsq {
    private final awmd a;
    private final abmt b;
    private String c;
    private boolean d;
    private boolean e;
    private final xgl f;

    public sci(xgl xglVar, awmd awmdVar, abmt abmtVar) {
        this.f = xglVar;
        this.a = awmdVar;
        this.b = abmtVar;
    }

    public final boolean a(String str) {
        if (TextUtils.equals(this.c, str)) {
            return this.e;
        }
        rmp.n(null, String.format("Trigger cpn %s does not match VideoStartVolumeTriggerAdapterHelper cpn %s", str, this.c));
        return false;
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        if (!TextUtils.equals(this.c, str)) {
            this.c = str;
            this.d = false;
            this.e = false;
        }
        if (i != 2 || this.d) {
            return;
        }
        this.d = true;
        abmt abmtVar = this.b;
        int i2 = tqr.a;
        if (!abmtVar.b.k(1073830231)) {
            this.e = this.f.b() == 0;
        } else {
            Object obj = ((aehn) this.a.io()).a;
            this.e = false;
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
