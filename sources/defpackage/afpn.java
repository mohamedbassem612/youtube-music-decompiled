package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afpn extends auox {
    @Override // defpackage.auox
    /* JADX INFO: renamed from: a */
    public final aunv generatedComponent() {
        if (!afty.o()) {
            return super.generatedComponent();
        }
        afuu afuuVarD = afwt.d(146, "ScrRet#Comp", afux.a, true);
        try {
            aunv aunvVarGeneratedComponent = super.generatedComponent();
            afuuVarD.close();
            return aunvVarGeneratedComponent;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.auox, defpackage.auph
    public final /* bridge */ /* synthetic */ Object generatedComponent() {
        return generatedComponent();
    }
}
