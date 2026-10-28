package defpackage;

import android.os.Bundle;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wac implements syk {
    public final awmd a;
    private final ahex b;

    public wac(awmd awmdVar, ahex ahexVar) {
        this.a = awmdVar;
        this.b = ahexVar;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        String string = bundle.getString("MDD_TASK_TAG_KEY");
        if (string == null) {
            return 1;
        }
        jnu jnuVar = new jnu(this, string, 5);
        ahex ahexVar = this.b;
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new afwh(afty.c(false), jnuVar, 0));
        ahexVar.execute(ahfoVar);
        try {
            ahfoVar.get();
            return 0;
        } catch (InterruptedException | ExecutionException unused) {
            return 1;
        }
    }
}
