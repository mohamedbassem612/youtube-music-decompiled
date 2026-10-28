package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kky extends kkz {
    @Override // defpackage.kkz
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new kla("Invalid response to one way request", null));
        }
    }

    @Override // defpackage.kkz
    public final boolean b() {
        return true;
    }
}
