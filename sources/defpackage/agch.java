package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class agch extends InstanceProxy {
    public final agcg a;

    public agch(agcg agcgVar) {
        this.a = agcgVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '512985100'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '512985100'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -556871116 || i == 1224759830;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i != -556871116) {
            if (i != 1224759830) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '512985100'."));
            }
            return this.a.a().toByteArray();
        }
        aspp asppVar = (aspp) aihn.parseFrom(aspp.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcg agcgVar = this.a;
        ((AtomicReference) agcgVar.a).set(asppVar.b);
        return aigv.a.toByteArray();
    }
}
