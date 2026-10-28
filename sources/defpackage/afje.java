package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afje implements afgl, afgm {
    public afje() {
        Boolean.FALSE.booleanValue();
    }

    @Override // defpackage.afgk
    public final ListenableFuture a(afgp afgpVar) {
        ListenableFuture aherVar;
        afuu afuuVarD = afwt.d(119, "Get Intent Account", afux.a, true);
        try {
            Intent intent = afgpVar.a;
            if (intent.hasExtra("account_id")) {
                int intExtra = intent.getIntExtra("account_id", -1);
                if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    ((agrc) ((agrc) afgf.a.b()).k("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 117, "AccountIntents.java")).t("AccountId was manually propagated. Use AccountIntents instead.");
                }
                affd affdVarA = intExtra != -1 ? affd.a(intExtra) : null;
                aherVar = affdVarA == null ? aher.a : new aher(affdVarA);
            } else {
                aherVar = aher.a;
            }
            afuuVarD.close();
            return aherVar;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afgl
    public final ListenableFuture b(affd affdVar) {
        throw null;
    }

    @Override // defpackage.afgl
    public final /* synthetic */ ListenableFuture c(affd affdVar) {
        return ahng.n(null);
    }
}
