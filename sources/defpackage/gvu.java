package defpackage;

import android.os.Build;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gvu extends gut {
    private final abgp a;
    private final ycp b;

    public gvu(ycp ycpVar, abgp abgpVar) {
        this.b = ycpVar;
        this.a = abgpVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, tpq] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaz.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        ycp ycpVar = this.b;
        if (ycpVar.b == 1) {
            if (ycpVar.e != null) {
                ycpVar.e.ax();
                return;
            }
            return;
        }
        abgp abgpVar = this.a;
        if (abgpVar.w) {
            abgpVar.k();
            return;
        }
        if (abgpVar.C == null) {
            abgpVar.C = new avgj(abgpVar);
        }
        abgpVar.w = true;
        abgm abgmVar = abgpVar.a;
        abgmVar.v();
        abgmVar.f(Build.MANUFACTURER + ' ' + Build.MODEL + ' ' + Build.VERSION.RELEASE);
        abgmVar.q(abgpVar.m);
        abgmVar.c(abgpVar.n);
        abgmVar.h(abgpVar.s);
        abgpVar.n();
        zkk zkkVar = abgpVar.d;
        abgmVar.t((zkj) zkkVar.io());
        abgpVar.m();
        abgpVar.l();
        avmm avmmVar = abgpVar.t;
        avgj avgjVar = abgpVar.C;
        abvn abvnVar = abgpVar.g;
        avmn[] avmnVarArr = new avmn[1];
        avmnVarArr[0] = ((avlh) (abvnVar.g().cg() ? abvnVar.C().W(new aalc(16)).W(new aalc(17)) : abvnVar.r().i)).i(aawb.y(abvnVar.X(), 32768L)).i(new abwr(1)).al(new abae(avgjVar, 19), new xuk(12));
        avmmVar.e(avmnVarArr);
        avmmVar.c(((agfa) abgpVar.b).a.d().P().L(avmh.a()).r(new aalc(15)).ak(new abae(abgpVar, 18)));
        abgpVar.c.d(abgpVar);
        zkkVar.addObserver(abgpVar);
    }
}
