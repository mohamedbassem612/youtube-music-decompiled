package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahld implements ahhx {
    @Override // defpackage.ahhx
    public final Object a(ahfy ahfyVar, ahhp ahhpVar) throws GeneralSecurityException {
        int i = ahie.a;
        for (int i2 = 0; i2 < ahfyVar.a(); i2++) {
            ahfx ahfxVarC = ahfyVar.c(i2);
            if (ahfxVarC.d && ahfxVarC.b.equals(ahfw.a)) {
                if (((ahhe) ahfyVar.b(ahhe.class)) != null) {
                    throw null;
                }
                ahfyVar.d();
                return new ahmb(6);
            }
        }
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
    }
}
