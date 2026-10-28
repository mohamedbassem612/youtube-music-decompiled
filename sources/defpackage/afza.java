package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afza extends InstanceProxy {
    public final agbt a;

    public afza(agbt agbtVar) {
        this.a = agbtVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        if (i != 879513754) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '366354626'."));
        }
        ascm ascmVar = (ascm) aihn.parseFrom(ascm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agbt agbtVar = this.a;
        aigu aiguVar = ascmVar.b;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        long jB = aikw.b(aiguVar);
        int iAS = a.aS(ascmVar.c);
        if (iAS == 0) {
            iAS = 1;
        }
        return ahcs.f(agbtVar.b(iAS).schedule(new fxv(13), jB, TimeUnit.MILLISECONDS), new oly(18), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != -1743061909) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '366354626'."));
        }
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(1));
        agbt agbtVar = this.a;
        ascr ascrVar = (ascr) aihn.parseFrom(ascr.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        aigu aiguVar = ascrVar.b;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        long jB = aikw.b(aiguVar);
        int i2 = 18;
        rxn rxnVar = new rxn(runtimeStreamWriter, i2);
        mbc mbcVar = agbtVar.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int iAS = a.aS(ascrVar.c);
        runtimeStreamWriter.a(new rme(ahno.aj(rxnVar, jB, jB, timeUnit, mbcVar, agbtVar.b(iAS != 0 ? iAS : 1)), i2));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -1743061909 || i == 879513754;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '366354626'."));
    }
}
