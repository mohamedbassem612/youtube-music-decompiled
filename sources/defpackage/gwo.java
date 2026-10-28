package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwo extends gut {
    private final gfp a;
    private final affd b;

    public gwo(gfp gfpVar, affd affdVar) {
        this.a = gfpVar;
        this.b = affdVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aotp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a.h(ajwoVar, this.b);
    }
}
