package defpackage;

import android.text.TextUtils;
import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ryx(a = sjb.class)
public final class ryr implements ryy, rsq, rst {
    private String a;
    private long b;
    private String c;
    private long d;
    private final LruCache e = new LruCache(10);
    private final vyo f;
    private final abmt g;

    public ryr(vyo vyoVar, abmt abmtVar) {
        this.f = vyoVar;
        this.g = abmtVar;
    }

    private static final String c(shh shhVar, String str, long j) {
        return (!TextUtils.equals(((slb) shhVar.d(sjb.class)).o, str) || j <= 0) ? "0" : Long.toString(j);
    }

    @Override // defpackage.rst
    public final void P(long j, String str) {
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.ryy
    public final String a() {
        return "0";
    }

    @Override // defpackage.ryy
    public final String b(shh shhVar) {
        slb slbVar;
        slb slbVar2;
        Long l;
        if (!taq.ar(this.f) || !shhVar.e(sjb.class) || (slbVar = (slb) shhVar.d(sjb.class)) == null || !slbVar.B()) {
            if (shhVar.e(sjb.class)) {
                return (((shhVar.e(sid.class) && ((wjf) shhVar.d(sid.class)).T()) || this.g.ao()) && shhVar.e(siv.class) && shhVar.d(shx.class) == slm.MID_ROLL) ? c(shhVar, this.c, this.d) : c(shhVar, this.a, this.b);
            }
            return "0";
        }
        if (!shhVar.e(sjb.class) || (slbVar2 = (slb) shhVar.d(sjb.class)) == null) {
            return "0";
        }
        String str = slbVar2.o;
        return (TextUtils.isEmpty(str) || (l = (Long) this.e.get(str)) == null) ? "0" : Long.toString(l.longValue());
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.rsq
    public final void p(String str, long j, int i) {
        if (i != 3 || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.put(str, Long.valueOf(j));
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

    @Override // defpackage.rst
    public final /* synthetic */ void O(String str, String str2, String str3) {
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
