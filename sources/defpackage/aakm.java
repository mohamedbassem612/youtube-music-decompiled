package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakm implements aant {
    private final aake a;
    private final aakw b;
    private final wco c;
    private final aanb d;
    private final vxz e;

    public aakm(aake aakeVar, aakw aakwVar, wco wcoVar, aanb aanbVar, vxz vxzVar) {
        this.a = aakeVar;
        this.b = aakwVar;
        this.c = wcoVar;
        this.d = aanbVar;
        this.e = vxzVar;
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        aoom aoomVar = (aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        return ((aoomVar.c & 16384) == 0 || !aoomVar.o) ? this.a.a(aofhVar) : this.b.a(aofhVar);
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        int iBc;
        int iBc2 = a.bc(aofhVar.c);
        if (iBc2 == 0) {
            iBc2 = 1;
        }
        int i = iBc2 - 1;
        if (i != 1) {
            if (i == 2) {
                return this.a.b(zwaVar, aofhVar);
            }
            if (i != 3) {
                aano aanoVar = new aano(aanp.c);
                aanoVar.d = 23;
                return ahng.n(aanoVar.a());
            }
        }
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        if (!((aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).o) {
            return (this.e.l(202, 45783727L, false) && (iBc = a.bc(aofhVar.c)) != 0 && iBc == 2 && ((Boolean) this.c.b(zwaVar).m(aofhVar.d).E()).booleanValue()) ? ahng.n(aanp.a) : this.a.b(zwaVar, aofhVar);
        }
        int iBc3 = a.bc(aofhVar.c);
        if (iBc3 != 0 && iBc3 == 2) {
            String strH = wfs.h(aofhVar.d);
            Optional optionalOfNullable = Optional.ofNullable(this.d.h(zwaVar));
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((aaqn) optionalOfNullable.get()).d());
            }
            vre vreVar = new vre(strH, 7);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((aaew) optionalOfNullable.get()).f((String) vreVar.a));
            }
            aamt aamtVar = (aamt) optionalOfNullable.orElse(null);
            if (aamtVar == null) {
                aano aanoVar2 = new aano(aanp.c);
                aanoVar2.d = 26;
                return ahng.n(aanoVar2.a());
            }
            if (this.e.l(202, 45783727L, false) && aamtVar.g()) {
                return ahng.n(aanp.a);
            }
        }
        return this.b.b(zwaVar, aofhVar);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return ahng.n(agpi.a);
        }
        aofg aofgVar = ((aofh) agkeVar.get(0)).e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        aoom aoomVar = (aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        return ((aoomVar.c & 16384) == 0 || !aoomVar.o) ? this.a.c(zwaVar, agkeVar) : this.b.c(zwaVar, agkeVar);
    }
}
