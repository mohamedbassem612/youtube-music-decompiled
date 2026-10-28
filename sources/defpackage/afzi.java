package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afzi extends InstanceProxy {
    public final afzh a;
    public final asiu b;

    public afzi(afzh afzhVar, asiu asiuVar) {
        this.a = afzhVar;
        this.b = asiuVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* synthetic */ mew a() {
        return this.b;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '824631238'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '824631238'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 834112479 || i == 2114090927;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i != 834112479) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '824631238'."));
        }
        return this.a.a((asdq) aihn.parseFrom(asdq.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
    }
}
