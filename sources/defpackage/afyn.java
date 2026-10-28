package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afyn extends InstanceProxy {
    public final afym a;

    public afyn(afym afymVar) {
        this.a = afymVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '469328769'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i == -2047133634) {
            RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new aeni(18));
            this.a.f((ascb) aihn.parseFrom(ascb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry()), runtimeStreamWriter);
            return;
        }
        if (i != -2128800151) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '469328769'."));
        }
        RuntimeStreamWriter runtimeStreamWriter2 = new RuntimeStreamWriter(j, new aeni(19));
        this.a.g((ascc) aihn.parseFrom(ascc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry()), runtimeStreamWriter2);
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -2047133634 || i == -2128800151;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '469328769'."));
    }
}
