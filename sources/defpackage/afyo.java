package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afyo extends InstanceProxy {
    public final agcl a;

    public afyo(agcl agclVar) {
        this.a = agclVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '552942334'."));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [aunn, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != 159955733) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '552942334'."));
        }
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new aeni(20));
        agcl agclVar = this.a;
        runtimeStreamWriter.a(new gmk(((hfn) agclVar.b.io()).y().P().L((avmb) agclVar.a).al(new gks(runtimeStreamWriter, 3), new glg(2)), 1));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 159955733 || i == 225473316;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aunn, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i != 225473316) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '552942334'."));
        }
        agcl agclVar = this.a;
        aihf aihfVarCreateBuilder = afyp.a.createBuilder();
        int iE = agcl.e(((hfn) agclVar.b.io()).x());
        aihfVarCreateBuilder.copyOnWrite();
        afyp afypVar = (afyp) aihfVarCreateBuilder.instance;
        afypVar.c = iE - 1;
        afypVar.b |= 1;
        return ((afyp) aihfVarCreateBuilder.build()).toByteArray();
    }
}
