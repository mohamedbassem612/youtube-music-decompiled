package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agax extends InstanceProxy {
    public final agcl a;

    public agax(agcl agclVar) {
        this.a = agclVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '429754717'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '429754717'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -727186507;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        int iAS;
        int iAS2;
        if (i != -727186507) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '429754717'."));
        }
        ashg ashgVar = (ashg) aihn.parseFrom(ashg.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcl agclVar = this.a;
        int i2 = ashgVar.b;
        if (i2 != 2 || i2 != 2 || (iAS = a.aS(((Integer) ashgVar.c).intValue())) == 0 || iAS == 1) {
            throw new IllegalArgumentException("No MusicPlayerInstance provided.");
        }
        if (ashgVar.b != 2 || (iAS2 = a.aS(((Integer) ashgVar.c).intValue())) == 0) {
            iAS2 = 1;
        }
        Object obj = iAS2 + (-1) != 2 ? agclVar.a : agclVar.b;
        aihf aihfVarCreateBuilder = ashh.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ashi.a.createBuilder();
        String strH = ((BaseClient) obj).h();
        aihfVarCreateBuilder2.copyOnWrite();
        ashi ashiVar = (ashi) aihfVarCreateBuilder2.instance;
        strH.getClass();
        ashiVar.b |= 1;
        ashiVar.c = strH;
        ashi ashiVar2 = (ashi) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ashh ashhVar = (ashh) aihfVarCreateBuilder.instance;
        ashiVar2.getClass();
        ashhVar.c = ashiVar2;
        ashhVar.b |= 1;
        return ((ashh) aihfVarCreateBuilder.build()).toByteArray();
    }
}
