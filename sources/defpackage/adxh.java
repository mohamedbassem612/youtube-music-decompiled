package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adxh extends adsx {
    /* JADX WARN: Illegal instructions before constructor call */
    public adxh(advb advbVar, tbt tbtVar, apun apunVar, arca arcaVar, adxd adxdVar, vxz vxzVar) {
        int i;
        aiie aiieVar = arcaVar.c;
        int i2 = 3;
        int i3 = (arcaVar == null || (i = arcaVar.d) == 0) ? 3 : i;
        aecf aecfVar = aecf.a;
        adum adumVarA = adun.a();
        if ((arcaVar.b & 4) != 0) {
            alay alayVar = arcaVar.f;
            adumVarA.c(ackj.k(null, alayVar == null ? alay.a : alayVar, null, false));
        }
        if ((arcaVar.b & 2) != 0) {
            alay alayVar2 = arcaVar.e;
            adumVarA.a = agev.h(ackj.k(null, alayVar2 == null ? alay.a : alayVar2, null, false));
        }
        if ((arcaVar.b & 16) != 0) {
            ajwo ajwoVar = arcaVar.h;
            adumVarA.d(ajwoVar == null ? ajwo.a : ajwoVar);
        }
        if ((arcaVar.b & SemanticState.Focused) != 0) {
            adumVarA.b = agev.i(Integer.valueOf(arcaVar.j));
        }
        if ((arcaVar.b & SemanticState.Hidden) != 0) {
            adumVarA.c = agev.i(Integer.valueOf(arcaVar.k));
        }
        int iBc = a.bc(arcaVar.l);
        int i4 = (iBc == 0 ? 1 : iBc) - 1;
        if (i4 == 2) {
            adumVarA.e = 2;
        } else if (i4 == 3) {
            adumVarA.e = 4;
        } else if (i4 != 4) {
            adumVarA.e = 1;
        } else {
            adumVarA.e = 3;
        }
        int iAX = a.aX(arcaVar.i);
        int i5 = (iAX == 0 ? 1 : iAX) - 1;
        if (i5 == 2) {
            i2 = 2;
        } else if (i5 != 3) {
            if (i5 != 4) {
                i2 = 5;
                if (i5 != 5) {
                    i2 = 6;
                    if (i5 != 6) {
                        i2 = 1;
                    }
                }
            } else {
                i2 = 4;
            }
        }
        adumVarA.d = i2;
        adumVarA.b(arcaVar.g);
        super(advbVar, tbtVar, apunVar, aiieVar, i3, aecfVar, new aduo(adumVarA.a()), adxdVar, vxzVar);
    }

    @Override // defpackage.adsx
    protected final Class c() {
        return arca.class;
    }

    @Override // defpackage.adsx
    protected final void e() {
        f(new adxg());
    }
}
