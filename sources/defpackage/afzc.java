package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzc extends BaseClient {
    protected afzc(long j) {
        super(j);
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClient
    public final int a() {
        return 733596004;
    }

    public final vcl i() {
        InstanceProxy instanceProxyD = d();
        if (instanceProxyD instanceof afze) {
            return ((afze) instanceProxyD).a;
        }
        return null;
    }
}
