package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agaj extends InstanceProxy {
    public final agcl a;

    public agaj(agcl agclVar) {
        this.a = agclVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '467789049'."));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != -1121786619) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '467789049'."));
        }
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(4));
        agcl agclVar = this.a;
        runtimeStreamWriter.a(new aaer(((avlh) agclVar.b.io()).ak(new zgd(runtimeStreamWriter, 8)), 1));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -1121786619 || i == 552722233 || i == -1726603167;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i != 552722233) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '467789049'."));
        }
        return agcl.c((tfl) new avrh((avlh) this.a.b.io()).iterator().next()).toByteArray();
    }
}
