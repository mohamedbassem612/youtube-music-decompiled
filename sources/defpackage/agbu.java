package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agbu extends InstanceProxy {
    public final agbt a;

    public agbu(agbt agbtVar) {
        this.a = agbtVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '414514912'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '414514912'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1820290358;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        long epochMilli;
        if (i != 1820290358) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '414514912'."));
        }
        askb askbVar = (askb) aihn.parseFrom(askb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agbt agbtVar = this.a;
        if ((askbVar.b & 1) != 0) {
            aijp aijpVar = askbVar.e;
            if (aijpVar == null) {
                aijpVar = aijp.a;
            }
            epochMilli = aikz.a(aijpVar);
        } else {
            epochMilli = agbtVar.a.f().toEpochMilli();
        }
        int i2 = askbVar.c;
        if (i2 == 8 || i2 == 9 || i2 == 10 || i2 == 13 || i2 == 18) {
            agbtVar.a(askbVar, epochMilli);
        } else {
            agbtVar.b.execute(afwl.i(new laz(agbtVar, askbVar, epochMilli, 6)));
        }
        aihf aihfVarCreateBuilder = askc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        askc askcVar = (askc) aihfVarCreateBuilder.instance;
        askcVar.b |= 1;
        askcVar.c = true;
        return ((askc) aihfVarCreateBuilder.build()).toByteArray();
    }
}
