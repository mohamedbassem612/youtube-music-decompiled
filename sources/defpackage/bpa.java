package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpa implements dos, dow, bpp {
    public Bundle a;
    private final /* synthetic */ dow b;
    private final /* synthetic */ bpp c;
    private boz d;
    private boolean e;

    public bpa(dow dowVar, bpp bppVar) {
        this.b = dowVar;
        this.c = bppVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [dos, java.lang.Object] */
    @Override // defpackage.dos
    public final Bundle a() {
        Bundle bundleH = aie.h((awml[]) Arrays.copyOf(new awml[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        for (Map.Entry entry : b().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((axfd) ((boy) entry.getValue()).b).d.a();
            if (!bundleA.isEmpty()) {
                dox.a(bundleH, str, bundleA);
            }
        }
        this.e = false;
        return bundleH;
    }

    public final boz b() {
        boz bozVar = this.d;
        if (bozVar != null && bozVar.b) {
            this.d = null;
        }
        boz bozVar2 = this.d;
        if (bozVar2 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            bfu bfuVar = new bfu(2);
            int i = awrn.a;
            awqv awqvVar = new awqv(boz.class);
            if (linkedHashMap.containsKey(awqvVar)) {
                throw new IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + awqvVar.b() + '.');
            }
            linkedHashMap.put(awqvVar, new qv(awqvVar, bfuVar));
            Collection collectionValues = linkedHashMap.values();
            collectionValues.getClass();
            qv[] qvVarArr = (qv[]) collectionValues.toArray(new qv[0]);
            bpu bpuVar = new bpu((qv[]) Arrays.copyOf(qvVarArr, qvVarArr.length));
            bpt bptVarF = bnz.f(this);
            bptVarF.getClass();
            bozVar2 = (boz) new bpn(getViewModelStore(), bpuVar, bptVarF).b(new awqv(boz.class));
            this.d = bozVar2;
        }
        bozVar2.getClass();
        return bozVar2;
    }

    public final void c() {
        if (this.e) {
            return;
        }
        Bundle bundleA = getSavedStateRegistry().a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleH = aie.h((awml[]) Arrays.copyOf(new awml[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        if (bundleA != null) {
            bundleH.putAll(bundleA);
        }
        this.a = bundleH;
        this.e = true;
        b();
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return this.b.getLifecycle();
    }

    @Override // defpackage.dow
    public final dou getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }

    @Override // defpackage.bpp
    public final bpo getViewModelStore() {
        return this.c.getViewModelStore();
    }
}
