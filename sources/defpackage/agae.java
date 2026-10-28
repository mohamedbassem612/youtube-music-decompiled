package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agae extends InstanceProxy {
    public final agad a;

    public agae(agad agadVar) {
        this.a = agadVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '702101139'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '702101139'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 986551010 || i == 1402080051 || i == -1139761199 || i == 804243932 || i == -32685219 || i == 648701054 || i == 1657169085 || i == 1221382089 || i == -41193566 || i == -1634139110;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        aigv aigvVar;
        int i2 = 1;
        if (i == -1139761199) {
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            aigv aigvVar2 = aigv.a;
            agad agadVar = this.a;
            aunn aunnVar = agadVar.b;
            agadVar.l.a(avlh.f(((hwz) aunnVar.io()).h(), ((hwz) aunnVar.io()).i(), new jnx(i2)).P().L(agadVar.d));
            return aigvVar2.toByteArray();
        }
        if (i == 804243932) {
            ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
            aigv aigvVar3 = aigv.a;
            agad agadVar2 = this.a;
            if (((hwz) agadVar2.b.io()).g() == asfk.MUSIC_PLAYBACK_CONTENT_MODE_STATE_ACTIVE) {
                ((hxf) agadVar2.a.io()).d();
            } else {
                ((hxf) agadVar2.a.io()).c();
            }
            return aigvVar3.toByteArray();
        }
        if (i == -32685219) {
            ExtensionRegistryLite generatedRegistry3 = ExtensionRegistryLite.getGeneratedRegistry();
            aigv aigvVar4 = aigv.a;
            agad agadVar3 = this.a;
            agadVar3.g.c(agadVar3.m.a(((hfn) agadVar3.c.io()).y().P().L(agadVar3.d).H(new hbn(agadVar3, i2))));
            return aigvVar4.toByteArray();
        }
        if (i == 648701054) {
            ExtensionRegistryLite generatedRegistry4 = ExtensionRegistryLite.getGeneratedRegistry();
            aigv aigvVar5 = aigv.a;
            this.a.g.b();
            return aigvVar5.toByteArray();
        }
        if (i == 1657169085) {
            ((awku) ((khn) this.a.h.io()).b).kk(Boolean.valueOf(((asfm) aihn.parseFrom(asfm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b));
            return aigv.a.toByteArray();
        }
        if (i != -1634139110) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '702101139'."));
        }
        asfd asfdVar = (asfd) aihn.parseFrom(asfd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agad agadVar4 = this.a;
        int iAT = a.aT(asfdVar.c);
        if (iAT == 0) {
            iAT = 1;
        }
        int i3 = iAT - 2;
        RuntimeSignal runtimeSignal = (i3 == 0 || i3 == 1 || i3 != 2) ? agadVar4.j : agadVar4.k;
        if (asfdVar.b.isEmpty()) {
            agadVar4.a(runtimeSignal);
            aigvVar = aigv.a;
        } else {
            aihh aihhVar = (aihh) almb.a.createBuilder();
            String str = asfdVar.b;
            aihhVar.copyOnWrite();
            almb almbVar = (almb) aihhVar.instance;
            str.getClass();
            almbVar.b |= 16;
            almbVar.h = str;
            almb almbVar2 = (almb) aihhVar.build();
            aunn aunnVar2 = agadVar4.e;
            woo wooVarL = ((wom) aunnVar2.io()).l();
            wooVarL.I(almbVar2);
            wom womVar = (wom) aunnVar2.io();
            Executor executor = agadVar4.f;
            byte[] bArr2 = null;
            taf.i(womVar.h(wooVarL, executor), executor, new gou(agadVar4, runtimeSignal, i2, bArr2), new gov(agadVar4, runtimeSignal, i2, bArr2), null);
            aigvVar = aigv.a;
        }
        return aigvVar.toByteArray();
    }
}
