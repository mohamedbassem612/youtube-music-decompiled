package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agcs extends InstanceProxy {
    public final ci a;

    public agcs(ci ciVar) {
        this.a = ciVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '413795664'."));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, wcn] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != -1997309435) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '413795664'."));
        }
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(18));
        ci ciVar = this.a;
        runtimeStreamWriter.a(new acfb(ciVar.a.j(((asuc) aihn.parseFrom(asuc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b, true).af(new acym(runtimeStreamWriter, 3)), 5));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -1997309435;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '413795664'."));
    }
}
