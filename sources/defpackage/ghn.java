package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ghn implements yaw {
    final /* synthetic */ ghs a;

    public ghn(ghs ghsVar) {
        this.a = ghsVar;
    }

    @Override // defpackage.yaw
    public final yay a(xvn xvnVar, ycp ycpVar, ycp ycpVar2, amyv amyvVar, String str, int i, String str2) {
        ght ghtVar = this.a.a;
        qcb qcbVar = (qcb) ghtVar.kv.io();
        Context context = (Context) ghtVar.v.io();
        ttm ttmVar = (ttm) ghtVar.cJ.io();
        SharedPreferences sharedPreferences = (SharedPreferences) ghtVar.J.io();
        xoh xohVar = (xoh) ghtVar.oS.io();
        xns xnsVar = (xns) ghtVar.kG.io();
        xwj xwjVar = (xwj) ghtVar.dj.io();
        xwo xwoVar = (xwo) ghtVar.kI.io();
        xnv xnvVar = (xnv) ghtVar.kY.io();
        ghtVar.cM();
        wjr wjrVar = (wjr) ghtVar.ki.io();
        afwv afwvVar = (afwv) ghtVar.oN.io();
        aupr auprVar = ghtVar.de;
        return new yay(xvnVar, qcbVar, context, ycpVar, ycpVar2, ttmVar, sharedPreferences, xohVar, xnsVar, xwjVar, xwoVar, xnvVar, wjrVar, i, str2, afwvVar, (xla) auprVar.io(), amyvVar, new xpl((yed) ghtVar.ku.io(), (xla) auprVar.io(), (char[]) null), str, (vxz) ghtVar.dd.io(), (mbc) ghtVar.l.io());
    }
}
