package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzl extends InstanceProxy {
    public final agcl a;

    public afzl(agcl agclVar) {
        this.a = agclVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '427886809'."));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [aunn, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        int i2 = 4;
        int i3 = 5;
        if (i == 1096794815) {
            RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(0));
            agcl agclVar = this.a;
            runtimeStreamWriter.a(new vnm(((vyo) agclVar.b.io()).d().af(new vva(runtimeStreamWriter, i3)), i2));
            return;
        }
        if (i != -1062169965) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '427886809'."));
        }
        RuntimeStreamWriter runtimeStreamWriter2 = new RuntimeStreamWriter(j, new afzk(2));
        agcl agclVar2 = this.a;
        final long j2 = ((asdx) aihn.parseFrom(asdx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b;
        vyo vyoVar = (vyo) agclVar2.b.io();
        vyl.d();
        runtimeStreamWriter2.a(new vnm(vyoVar.c(new avnn() { // from class: vyn
            @Override // defpackage.avnn
            public final Object a(Object obj) {
                akww akwwVar = ((alik) obj).v;
                if (akwwVar == null) {
                    akwwVar = akww.a;
                }
                return agcl.d(akwwVar, j2);
            }
        }).af(new vva(runtimeStreamWriter2, i2)), i3));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 550601787 || i == -1229548663 || i == -827674897 || i == 1096794815 || i == -62449909 || i == -1062169965;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aunn, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i == 550601787) {
            return ((vxu) this.a.a.io()).c().toByteArray();
        }
        if (i == -1229548663) {
            asdx asdxVar = (asdx) aihn.parseFrom(asdx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcl agclVar = this.a;
            long j = asdxVar.b;
            vyl.d();
            akww akwwVar = ((vxu) agclVar.a.io()).c().u;
            if (akwwVar == null) {
                akwwVar = akww.a;
            }
            return agcl.d(akwwVar, j).toByteArray();
        }
        if (i == -827674897) {
            return ((vyo) this.a.b.io()).b().toByteArray();
        }
        if (i != -62449909) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '427886809'."));
        }
        asdx asdxVar2 = (asdx) aihn.parseFrom(asdx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcl agclVar2 = this.a;
        long j2 = asdxVar2.b;
        vyl.d();
        akww akwwVar2 = ((vyo) agclVar2.b.io()).b().v;
        if (akwwVar2 == null) {
            akwwVar2 = akww.a;
        }
        return agcl.d(akwwVar2, j2).toByteArray();
    }
}
