package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agbd extends InstanceProxy {
    public final ahud a;

    public agbd(ahud ahudVar) {
        this.a = ahudVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '777393138'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != 70292770) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '777393138'."));
        }
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(16));
        ahud ahudVar = this.a;
        asia asiaVar = (asia) aihn.parseFrom(asia.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        asic asicVar = asiaVar.c;
        if (asicVar == null) {
            asicVar = asic.a;
        }
        int i2 = 1;
        acjx acjxVarAe = aawb.ae(asicVar.b == 1 ? (aqhn) asicVar.c : aqhn.a);
        ((adtv) ahudVar.b).aD(new adxm(asiaVar, i2), new adtz(runtimeStreamWriter), acjxVarAe, null);
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 70292770;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '777393138'."));
    }
}
