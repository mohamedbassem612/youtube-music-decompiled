package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aduu extends adsx {
    /* JADX WARN: Illegal instructions before constructor call */
    public aduu(advb advbVar, tbt tbtVar, apun apunVar, alig aligVar, adwx adwxVar, aecf aecfVar, adxd adxdVar, vxz vxzVar) {
        alay alayVar;
        int i;
        aiie aiieVar = aligVar.c;
        int i2 = (aligVar == null || ((i = aligVar.e) <= 0 && (i = aligVar.d) == 0)) ? 3 : i;
        adum adumVarA = adun.a();
        ajwo ajwoVar = apunVar.k;
        adumVarA.d(ajwoVar == null ? ajwo.a : ajwoVar);
        if ((aligVar.b & 16) != 0) {
            alayVar = aligVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        adumVarA.c(ackj.k(null, alayVar, null, false));
        super(advbVar, tbtVar, apunVar, aiieVar, i2, aecfVar, new aduo(adumVarA.a()), adxdVar, vxzVar);
    }

    @Override // defpackage.adsx
    protected final Class c() {
        return alig.class;
    }

    @Override // defpackage.adsx
    protected final void e() {
        f(new adut());
    }
}
