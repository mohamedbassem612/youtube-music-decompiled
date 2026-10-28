package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byr implements byd {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ Executor c;
    final /* synthetic */ yup d;
    final /* synthetic */ aojm e;
    final /* synthetic */ mbc f;
    final /* synthetic */ zjr g;
    final /* synthetic */ tqj h;
    final /* synthetic */ vyo i;
    final /* synthetic */ String j;
    final /* synthetic */ vxz k;
    final /* synthetic */ abxv l;
    final /* synthetic */ hed m;
    final /* synthetic */ hed n;
    final /* synthetic */ wjr o;
    final /* synthetic */ hhb p;

    public byr(Context context, String str, hed hedVar, Executor executor, yup yupVar, aojm aojmVar, vxz vxzVar, wjr wjrVar, mbc mbcVar, zjr zjrVar, tqj tqjVar, hhb hhbVar, vyo vyoVar, String str2, hed hedVar2, abxv abxvVar) {
        this.a = context;
        this.b = str;
        this.n = hedVar;
        this.c = executor;
        this.d = yupVar;
        this.e = aojmVar;
        this.k = vxzVar;
        this.o = wjrVar;
        this.f = mbcVar;
        this.g = zjrVar;
        this.h = tqjVar;
        this.p = hhbVar;
        this.i = vyoVar;
        this.j = str2;
        this.m = hedVar2;
        this.l = abxvVar;
        new cso((char[]) null);
    }

    @Override // defpackage.byd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final byw a() {
        String str;
        ypm ypmVarW;
        byw bywVarCJ = zik.cJ(this.b, this.n, this.c, this.d, this.e, this.k, this.o, this.g, this.h, this.p);
        alik alikVarB = this.i.b();
        if (alikVarB == null) {
            return bywVarCJ;
        }
        anew anewVar = alikVarB.j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        aojp aojpVar = anewVar.c;
        if (aojpVar == null) {
            aojpVar = aojp.a;
        }
        aojn aojnVar = aojpVar.g;
        if (aojnVar == null) {
            aojnVar = aojn.a;
        }
        return (!aojnVar.c || (str = this.j) == null || (ypmVarW = this.m.w(str)) == null) ? bywVarCJ : this.l.k(bywVarCJ, ypmVarW);
    }
}
