package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sbi implements rsq {
    final /* synthetic */ sbj a;

    public sbi(sbj sbjVar) {
        this.a = sbjVar;
    }

    @Override // defpackage.rsq
    public final void h(aazs aazsVar) {
        sbj sbjVar = this.a;
        HashMap map = sbjVar.b;
        String strA = aazsVar.a();
        map.remove(strA);
        sbjVar.c.remove(strA);
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        HashMap map = this.a.c;
        Long l = (Long) map.get(str);
        if (l == null || l.longValue() != j3) {
            map.put(str, Long.valueOf(j3));
        }
    }

    @Override // defpackage.rsq
    public final void p(String str, long j, int i) {
        this.a.b.put(str, Long.valueOf(j));
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
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
