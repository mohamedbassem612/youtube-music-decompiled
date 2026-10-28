package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzo extends InstanceProxy {
    public final agcg a;

    public afzo(agcg agcgVar) {
        this.a = agcgVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '464566978'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '464566978'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1199368048;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aunn, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        boolean zB;
        if (i != 1199368048) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '464566978'."));
        }
        aseb asebVar = (aseb) aihn.parseFrom(aseb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        xeu xeuVar = (xeu) this.a.a.io();
        alou alouVar = asebVar.b;
        if (alouVar == null) {
            alouVar = alou.a;
        }
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(alouVar, alot.a(alouVar.c));
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            zB = true;
        } else {
            zB = xeuVar.b(alouVar);
        }
        aihf aihfVarCreateBuilder = asec.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asec asecVar = (asec) aihfVarCreateBuilder.instance;
        asecVar.b |= 1;
        asecVar.c = zB;
        return ((asec) aihfVarCreateBuilder.build()).toByteArray();
    }
}
