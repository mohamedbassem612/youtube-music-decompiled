package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agbh extends InstanceProxy {
    public final adxp a;
    public final asiu b;

    public agbh(adxp adxpVar, asiu asiuVar) {
        this.a = adxpVar;
        this.b = asiuVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* synthetic */ mew a() {
        return this.b;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        ListenableFuture listenableFutureF;
        if (i != 70292770) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '635949799'."));
        }
        asih asihVar = (asih) aihn.parseFrom(asih.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        adxp adxpVar = this.a;
        AtomicBoolean atomicBoolean = adxpVar.a;
        int i2 = 0;
        if (atomicBoolean.getAndSet(true)) {
            listenableFutureF = adxp.h("Another continuation request is pending.");
        } else {
            acjx acjxVarA = adxpVar.a();
            if (acjxVarA == null) {
                atomicBoolean.set(false);
                listenableFutureF = adxp.h("Continuation data is not available.");
            } else {
                listenableFutureF = ape.f(new qzb(adxpVar, asihVar, acjxVarA, 5));
            }
        }
        return ahcs.f(listenableFutureF, new agbg(i2), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '635949799'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 70292770 || i == -1454804934 || i == 924732073;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        aqi aqiVar;
        ahsx ahsxVar;
        aifz aifzVarA;
        if (i == -1454804934) {
            adxp adxpVar = this.a;
            if (adxpVar.e()) {
                aifzVarA = aifz.a(false);
            } else {
                aifzVarA = aifz.a(adxpVar.a() != null);
            }
            return aifzVarA.toByteArray();
        }
        if (i != 924732073) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '635949799'."));
        }
        adxp adxpVar2 = this.a;
        synchronized (adxpVar2) {
            aqiVar = adxpVar2.e;
            adxpVar2.e = null;
            ahsxVar = adxpVar2.f;
            adxpVar2.f = null;
        }
        if (ahsxVar != null) {
            ((ConcurrentHashMap) ahsxVar.b).remove(ahsxVar.a);
            ?? r6 = ahsxVar.c;
            if (r6 != 0) {
                r6.cancel(false);
            }
        }
        if (aqiVar != null) {
            aihf aihfVarCreateBuilder = asii.a.createBuilder();
            aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ((atxp) aihfVarCreateBuilder2.instance).b = 1;
            atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asii asiiVar = (asii) aihfVarCreateBuilder.instance;
            atxpVar.getClass();
            asiiVar.c = atxpVar;
            asiiVar.b |= 1;
            aqiVar.b((asii) aihfVarCreateBuilder.build());
            adxpVar2.a.set(false);
        }
        return aigv.a.toByteArray();
    }
}
