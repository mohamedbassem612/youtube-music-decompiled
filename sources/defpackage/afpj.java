package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afpj extends auof {
    public afpj(qe qeVar) {
        super(qeVar, new auoj(qeVar), new afpn(qeVar, qeVar), new afpm(qeVar, new aunr(qeVar, null, null)));
    }

    @Override // defpackage.auof
    protected final Object a() {
        afuu afuuVarD = afwt.d(142, "Act#comp", afux.a, true);
        try {
            Activity activity = this.a;
            ahno.U(activity.getApplication() instanceof afov, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
            Object objA = super.a();
            afuuVarD.close();
            return objA;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
