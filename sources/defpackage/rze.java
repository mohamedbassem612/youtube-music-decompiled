package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ryx(a = sjb.class)
public final class rze implements ryy, rsq {
    private String a;
    private long b;

    @Override // defpackage.ryy
    public final String a() {
        return "0.0";
    }

    @Override // defpackage.ryy
    public final String b(shh shhVar) {
        return (!TextUtils.equals(((slb) shhVar.d(sjb.class)).o, this.a) || this.b <= 0) ? "0.0" : String.format(Locale.US, "%.1f", Double.valueOf(this.b / 1000.0d));
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        this.a = str;
        this.b = j;
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
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
