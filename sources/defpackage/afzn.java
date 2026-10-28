package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzn extends InstanceProxy {
    public final agcv a;

    public afzn(agcv agcvVar) {
        this.a = agcvVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        if (i == 1114816553) {
            asdv asdvVar = (asdv) aihn.parseFrom(asdv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar = this.a;
            asdvVar.getClass();
            vwg vwgVar = (vwg) agcvVar;
            return ahcs.f(awrc.ag(vwgVar.b, awov.a, new qbj(vwgVar, asdvVar, (awoq) null, 16)), new afzd(10), MoreExecutors.directExecutor());
        }
        if (i != -2092204837) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '718064391'."));
        }
        asdt asdtVar = (asdt) aihn.parseFrom(asdt.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcv agcvVar2 = this.a;
        asdtVar.getClass();
        vwg vwgVar2 = (vwg) agcvVar2;
        return ahcs.f(awrc.ag(vwgVar2.b, awov.a, new qbj(vwgVar2, asdtVar, (awoq) null, 15)), new afzd(11), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != 896913314) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '718064391'."));
        }
        int i2 = 3;
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(i2));
        agcv agcvVar = this.a;
        asdz asdzVar = (asdz) aihn.parseFrom(asdz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        asdzVar.getClass();
        vwg vwgVar = (vwg) agcvVar;
        int andIncrement = vwgVar.c.getAndIncrement();
        awwd awwdVarT = awro.t(vwgVar.b, null, 0, new gme(vwgVar, asdzVar, runtimeStreamWriter, (awoq) null, 14), 3);
        synchronized (agcvVar) {
            ((vwg) agcvVar).d.h(andIncrement, awwdVarT);
        }
        runtimeStreamWriter.a(new tso(agcvVar, andIncrement, i2));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 896913314 || i == 1114816553 || i == -2092204837;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '718064391'."));
    }
}
