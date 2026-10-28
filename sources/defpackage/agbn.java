package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agbn extends InstanceProxy {
    public final auym a;

    public agbn(auym auymVar) {
        this.a = auymVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        if (i == 1186813987) {
            return ahcs.f(ape.f(new dzx(this.a, (ashy) aihn.parseFrom(ashy.a, bArr, ExtensionRegistryLite.getGeneratedRegistry()), 8)), new agbg(2), MoreExecutors.directExecutor());
        }
        if (i != 640035315) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '654867126'."));
        }
        return ahcs.f(ape.f(new dzx(this.a, (ashw) aihn.parseFrom(ashw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry()), 9)), new agbg(3), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '654867126'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1186813987 || i == 640035315;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '654867126'."));
    }
}
