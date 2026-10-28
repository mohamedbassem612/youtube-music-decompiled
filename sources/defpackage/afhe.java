package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhe extends afhg {
    public final int a;
    public final afhq b;

    public afhe(int i, afhq afhqVar) {
        super(3);
        this.a = i;
        this.b = afhqVar;
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        if (awrc.c(afhqVar, afhq.a)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.afhg
    public final Bundle a() {
        Bundle bundleB = b();
        bundleB.putInt("state_account_id", this.a);
        ahng.aG(bundleB, "state_account_info", this.b);
        return bundleB;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof afhe) && ((afhe) obj).a == this.a;
    }
}
