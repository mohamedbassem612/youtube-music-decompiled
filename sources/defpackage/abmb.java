package defpackage;

import java.util.Observable;
import java.util.Observer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abmb implements Observer {
    final /* synthetic */ arnj a;
    final /* synthetic */ abmc b;

    public abmb(abmc abmcVar, arnj arnjVar) {
        this.a = arnjVar;
        this.b = abmcVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        abmc abmcVar = this.b;
        abmcVar.d.deleteObserver(this);
        arnj arnjVar = this.a;
        if ((arnjVar.b & 65536) != 0) {
            ajwo ajwoVar = arnjVar.p;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajwm.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                ajwo ajwoVar2 = arnjVar.p;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajwm.b);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                abmcVar.e.b(((ajwm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c);
            }
        }
        abmcVar.e();
        abmcVar.a();
        abmcVar.h(9, arnjVar);
    }
}
