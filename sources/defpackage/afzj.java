package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzj extends InstanceProxy {
    public final agcl a;

    public afzj(agcl agclVar) {
        this.a = agclVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        if (i != 1930921029) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '619481007'."));
        }
        asdr asdrVar = (asdr) aihn.parseFrom(asdr.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcl agclVar = this.a;
        wud wudVar = (wud) agclVar.a;
        wuc wucVarA = wudVar.a();
        aqed aqedVar = asdrVar.b;
        if (aqedVar == null) {
            aqedVar = aqed.a;
        }
        int iAO = acfz.aO(aqedVar.c);
        if (iAO == 0) {
            iAO = 1;
        }
        wucVarA.d = iAO;
        wucVarA.a = aqedVar.d;
        wucVarA.e(aqedVar.e);
        alap alapVar = asdrVar.c;
        if (alapVar == null) {
            alapVar = alap.a;
        }
        wucVarA.c = alapVar;
        aqec aqecVar = asdrVar.d;
        if (aqecVar == null) {
            aqecVar = aqec.a;
        }
        wucVarA.b = aqecVar;
        int i2 = 8;
        if ((aqedVar.b & 8) != 0) {
            wucVarA.n(aqedVar.f);
        } else {
            wucVarA.o(vzh.b);
        }
        return ahcs.f(ahcs.e(wudVar.b(wucVarA, MoreExecutors.directExecutor()), afwl.a(new vdm(agclVar, i2)), MoreExecutors.directExecutor()), new afzd(9), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '619481007'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1930921029;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '619481007'."));
    }
}
