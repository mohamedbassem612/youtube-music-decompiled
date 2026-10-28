package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hcx implements wfv {
    private final Executor a;
    private final hed b;

    public hcx(hed hedVar, Executor executor) {
        this.b = hedVar;
        this.a = executor;
    }

    @Override // defpackage.wfv
    public final void b(Bundle bundle) {
        taf.n(this.b.A(), this.a, new gln(bundle, 7));
    }

    @Override // defpackage.wfv
    public final void c(Bundle bundle) {
    }
}
