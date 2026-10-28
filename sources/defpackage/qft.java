package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qft implements agfr {
    private final /* synthetic */ int $cid;
    private final Context a;

    public qft(Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        int i = this.$cid;
        Context context = this.a;
        if (i != 0) {
            return agev.h(qnl.l(context));
        }
        return !mef.h(context) ? agdf.a : agev.i(new File(context.getFilesDir(), "primes/crash"));
    }
}
