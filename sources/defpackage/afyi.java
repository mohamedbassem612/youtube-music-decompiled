package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afyi extends InstanceProxy {
    public final qcb a;

    public afyi(qcb qcbVar) {
        this.a = qcbVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '628512363'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '628512363'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1733583239 || i == 85509750 || i == 684840054 || i == 1274969085 || i == 901442269;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i == 1733583239) {
            this.a.r(((aijm) aihn.parseFrom(aijm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b, 1, Optional.empty());
            return aigv.a.toByteArray();
        }
        if (i == 85509750) {
            this.a.r(((aijm) aihn.parseFrom(aijm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b, -1, Optional.empty());
            return aigv.a.toByteArray();
        }
        if (i == 684840054) {
            this.a.r(((aijm) aihn.parseFrom(aijm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b, -1, Optional.empty());
            return aigv.a.toByteArray();
        }
        if (i == 1274969085) {
            this.a.r(((aijm) aihn.parseFrom(aijm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b, 1, Optional.empty());
            return aigv.a.toByteArray();
        }
        if (i != 901442269) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '628512363'."));
        }
        amgn amgnVar = (amgn) aihn.parseFrom(amgn.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        this.a.r(amgnVar.b, amgnVar.c, Optional.of(Long.valueOf(amgnVar.d)));
        return aigv.a.toByteArray();
    }
}
