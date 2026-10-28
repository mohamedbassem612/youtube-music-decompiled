package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vdu extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ vdv b;
    final /* synthetic */ afxd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdu(vdv vdvVar, afxd afxdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = vdvVar;
        this.c = afxdVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            vdu vduVar = new vdu(this.b, this.c, awoqVar, 1, null);
            vduVar.d = obj;
            return vduVar;
        }
        vdu vduVar2 = new vdu(this.b, this.c, awoqVar, 0);
        vduVar2.d = obj;
        return vduVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((vdu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((vdu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        vdn vdnVar;
        if (this.$cid == 0) {
            awox awoxVar = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i == 0) {
                awut awutVar = (awut) this.d;
                afxd afxdVar = this.c;
                awuz awuzVarR = awro.r(awutVar, awov.a, 1, new dnz(afxdVar, (awoq) null, 18, (byte[]) null));
                awuzVarR.kJ(new vdt(afxdVar, 2));
                this.a = 1;
                obj = awuzVarR.c(this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
            }
            obj.getClass();
            yno.fp((alqv) obj);
            return awmy.a;
        }
        awox awoxVar2 = awox.a;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                vdnVar = (vdn) this.d;
                atqp.j(obj);
            } else {
                atqp.j(obj);
            }
            vdo vdoVar = (vdo) obj;
            String str = vdoVar.a;
            vdnVar.c.e.getClass();
            Duration duration = vdoVar.c;
            byte[] bArr = vdoVar.b;
            return awmy.a;
        }
        atqp.j(obj);
        awut awutVar2 = (awut) this.d;
        afxd afxdVar2 = this.c;
        awuz awuzVarR2 = awro.r(awutVar2, awov.a, 1, new dnz(afxdVar2, (awoq) null, 17));
        awuzVarR2.kJ(new vdt(afxdVar2, 0));
        this.a = 1;
        obj = awuzVarR2.c(this);
        if (obj == awoxVar2) {
            return awoxVar2;
        }
        obj.getClass();
        vdn vdnVar2 = (vdn) awrc.f((Optional) obj);
        if (vdnVar2 == null) {
            return awmy.a;
        }
        vdv vdvVar = this.b;
        this.d = vdnVar2;
        this.a = 2;
        Object objR = vdvVar.h.r(vdnVar2, this);
        if (objR == awoxVar2) {
            return awoxVar2;
        }
        obj = objR;
        vdnVar = vdnVar2;
        vdo vdoVar2 = (vdo) obj;
        String str2 = vdoVar2.a;
        vdnVar.c.e.getClass();
        Duration duration2 = vdoVar2.c;
        byte[] bArr2 = vdoVar2.b;
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdu(vdv vdvVar, afxd afxdVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = vdvVar;
        this.c = afxdVar;
    }
}
