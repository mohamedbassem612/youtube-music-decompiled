package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aako implements aant {
    public final aakg a;
    public final aakz b;
    private final wco c;
    private final aanb d;

    public aako(aakg aakgVar, aakz aakzVar, aanb aanbVar, wco wcoVar) {
        this.a = aakgVar;
        this.b = aakzVar;
        this.d = aanbVar;
        this.c = wcoVar;
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        return aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i != 1) {
            if (i == 2) {
                return this.b.b(zwaVar, aofhVar);
            }
            if (i != 3) {
                if (i == 4) {
                    return ahno.as(tzk.b(this.c.b(zwaVar).m(aofhVar.d)), new aakn(this, zwaVar, aofhVar, 0), MoreExecutors.directExecutor());
                }
                aano aanoVar = new aano(aanp.c);
                aanoVar.d = 23;
                return ahng.n(aanoVar.a());
            }
        }
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqpb.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        if (!((aqpb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).m) {
            return this.a.b(zwaVar, aofhVar);
        }
        String strH = wfs.h(aofhVar.d);
        Optional optionalOfNullable = Optional.ofNullable(this.d.h(zwaVar));
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((aaqn) optionalOfNullable.get()).d());
        }
        vre vreVar = new vre(strH, 8);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((aaew) optionalOfNullable.get()).f((String) vreVar.a) != null));
        }
        if (((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue()) {
            return this.b.b(zwaVar, aofhVar);
        }
        aano aanoVar2 = new aano(aanp.c);
        aanoVar2.d = 26;
        return ahng.n(aanoVar2.a());
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        throw new UnsupportedOperationException();
    }
}
