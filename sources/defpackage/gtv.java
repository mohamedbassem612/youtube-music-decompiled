package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtv extends gut {
    private final aunn a;
    private final hfn b;

    public gtv(hfn hfnVar, aunn aunnVar) {
        hfnVar.getClass();
        aunnVar.getClass();
        this.b = hfnVar;
        this.a = aunnVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqnq.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("command is missing ToggleFullscreenCommand extension");
        }
        hww hwwVarX = this.b.x();
        hww hwwVar = hww.h;
        aunn aunnVar = this.a;
        if (hwwVarX == hwwVar) {
            ((hwk) aunnVar.io()).n();
        } else {
            ((hwk) aunnVar.io()).m();
        }
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }
}
