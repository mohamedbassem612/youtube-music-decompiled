package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agav extends InstanceProxy {
    public final agaw a;

    public agav(agaw agawVar) {
        this.a = agawVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '484588918'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i == 1379707729) {
            RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(14));
            agaw agawVar = this.a;
            agawVar.a(runtimeStreamWriter);
            return;
        }
        if (i != 114787353) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '484588918'."));
        }
        RuntimeStreamWriter runtimeStreamWriter2 = new RuntimeStreamWriter(j, new afzk(15));
        agaw agawVar2 = this.a;
        agawVar2.b(runtimeStreamWriter2);
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1379707729 || i == 114787353;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '484588918'."));
    }
}
