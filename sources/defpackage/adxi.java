package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adxi implements advd {
    private final wnf a;
    protected final xgn b;
    private final tbt c;
    private final advb d;
    private final ttm e;
    private final vxz f;
    private final vxz g;

    public adxi(wnf wnfVar, tbt tbtVar, advb advbVar, ttm ttmVar, xgn xgnVar, vxz vxzVar, vxz vxzVar2) {
        adtc adtcVar = adtc.a;
        wnfVar.getClass();
        this.a = wnfVar;
        tbtVar.getClass();
        this.c = tbtVar;
        advbVar.getClass();
        this.d = advbVar;
        xgnVar.getClass();
        this.b = xgnVar;
        vxzVar.getClass();
        this.f = vxzVar;
        vxzVar2.getClass();
        this.g = vxzVar2;
        ttmVar.getClass();
        this.e = ttmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.advd
    public advc a(Object obj, adxd adxdVar, adwr adwrVar) {
        advc aduuVar;
        if (obj instanceof wga) {
            advj advjVar = new advj(this.a, this.d, this.c, this.e, this.b, adxdVar, this.g);
            if (adxdVar != null) {
                return advjVar;
            }
            advjVar.e((wga) obj);
            return advjVar;
        }
        if (obj instanceof amgb) {
            return new advk(this.a, this.d, this.c, this.e, this.b, (amgb) obj, this.g);
        }
        MessageLite messageLite = null;
        if (obj instanceof wgh) {
            apun apunVar = ((wgh) obj).a;
            advb advbVar = this.d;
            tbt tbtVar = this.c;
            apup apupVar = apunVar.l;
            if (apupVar == null) {
                apupVar = apup.a;
            }
            if ((apupVar.b & 8) != 0) {
                apup apupVar2 = apunVar.l;
                if (apupVar2 == null) {
                    apupVar2 = apup.a;
                }
                messageLite = apupVar2.f;
                if (messageLite == null) {
                    messageLite = arca.a;
                }
            }
            aduuVar = new adxh(advbVar, tbtVar, apunVar, messageLite, adxdVar, this.f);
        } else {
            if (!(obj instanceof wfz)) {
                if (!(obj instanceof aovx)) {
                    return null;
                }
                advu advuVar = new advu(this.a, this.d, this.c, this.e, this.b, this.f, this.g);
                advuVar.h((aovx) obj);
                return advuVar;
            }
            apun apunVar2 = ((wfz) obj).a;
            advb advbVar2 = this.d;
            tbt tbtVar2 = this.c;
            apup apupVar3 = apunVar2.l;
            if (apupVar3 == null) {
                apupVar3 = apup.a;
            }
            if ((apupVar3.b & 4) != 0) {
                apup apupVar4 = apunVar2.l;
                if (apupVar4 == null) {
                    apupVar4 = apup.a;
                }
                messageLite = apupVar4.e;
                if (messageLite == null) {
                    messageLite = alig.a;
                }
            }
            aduuVar = new aduu(advbVar2, tbtVar2, apunVar2, messageLite, adwx.a, aecf.a, adxdVar, this.f);
        }
        return aduuVar;
    }
}
