package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agas extends InstanceProxy {
    public final agat a;

    public agas(agat agatVar) {
        this.a = agatVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '379756180'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '379756180'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 669964186 || i == -1333711387 || i == -238953732 || i == -413524087 || i == 140597726 || i == 1374017773 || i == -1413100472 || i == -1918963920 || i == -977141100 || i == 254093669 || i == -1700092881 || i == -2061976318 || i == 1416723429 || i == -1870135645 || i == -2046960172 || i == 161002273 || i == -1363064292 || i == -1947631786 || i == -2066310030;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i == 669964186) {
            return this.a.o().toByteArray();
        }
        if (i == -1333711387) {
            return this.a.h((ashb) aihn.parseFrom(ashb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == -238953732) {
            return this.a.m().toByteArray();
        }
        if (i == -413524087) {
            return this.a.i((ashd) aihn.parseFrom(ashd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == 140597726) {
            return this.a.n().toByteArray();
        }
        if (i == 1374017773) {
            return this.a.a((asho) aihn.parseFrom(asho.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == -1413100472) {
            return this.a.p().toByteArray();
        }
        if (i == -1918963920) {
            return this.a.c((ashn) aihn.parseFrom(ashn.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == -977141100) {
            return this.a.f((asgd) aihn.parseFrom(asgd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == 254093669) {
            return this.a.k().toByteArray();
        }
        if (i == -1700092881) {
            return this.a.j().toByteArray();
        }
        if (i == -2061976318) {
            return this.a.g((asha) aihn.parseFrom(asha.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == 1416723429) {
            return this.a.d((asfz) aihn.parseFrom(asfz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == -1870135645) {
            return this.a.b((asgs) aihn.parseFrom(asgs.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i == -2046960172) {
            return this.a.r().toByteArray();
        }
        if (i == 161002273) {
            return this.a.q().toByteArray();
        }
        if (i == -1363064292) {
            return this.a.s().toByteArray();
        }
        if (i == -1947631786) {
            return this.a.e((asgb) aihn.parseFrom(asgb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toByteArray();
        }
        if (i != -2066310030) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '379756180'."));
        }
        return this.a.l().toByteArray();
    }
}
