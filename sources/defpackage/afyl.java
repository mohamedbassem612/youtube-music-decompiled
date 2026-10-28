package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afyl extends BaseClient {
    protected afyl(long j) {
        super(j);
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClient
    public final int a() {
        return 469328769;
    }

    public final afym i() {
        InstanceProxy instanceProxyD = d();
        if (instanceProxyD instanceof afyn) {
            return ((afyn) instanceProxyD).a;
        }
        return null;
    }
}
