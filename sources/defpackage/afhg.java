package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class afhg {
    private final int a;

    public afhg(int i) {
        this.a = i;
    }

    public abstract Bundle a();

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("state_account_state_type", this.a - 1);
        return bundle;
    }
}
