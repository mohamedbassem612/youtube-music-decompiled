package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpd {
    public static final bps a = new bpc(1);
    public static final bps b = new bpc(0);
    public static final bps c = new bpc(2);

    public static final boy a(bpt bptVar) {
        Object objA = bptVar.a(a);
        if (objA == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        dow dowVar = (dow) objA;
        Object objA2 = bptVar.a(bpn.a);
        if (objA2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        String str = (String) objA2;
        if (bptVar.a(b) == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        bpa bpaVarA = bou.a(dowVar);
        if (bpaVarA == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Bundle bundle = (Bundle) bptVar.a(c);
        Map map = bpaVarA.b().a;
        Object boyVar = map.get(str);
        if (boyVar == null) {
            bpaVarA.c();
            Bundle bundle2 = bpaVarA.a;
            Bundle bundle3 = null;
            if (bundle2 != null && bundle2.containsKey(str)) {
                Bundle bundleA = doq.a(bundle2, str);
                if (bundleA == null) {
                    bundleA = aie.h((awml[]) Arrays.copyOf(new awml[0], 0));
                }
                bundle2.remove(str);
                if (bundle2.isEmpty()) {
                    bpaVarA.a = null;
                }
                bundle3 = bundleA;
            }
            if (bundle3 != null) {
                bundle = bundle3;
            }
            if (bundle == null) {
                boyVar = new boy();
            } else {
                ClassLoader classLoader = boy.class.getClassLoader();
                classLoader.getClass();
                bundle.setClassLoader(classLoader);
                boyVar = new boy(doq.b(bundle));
            }
            map.put(str, boyVar);
        }
        return (boy) boyVar;
    }

    public static final void b(dow dowVar) {
        bob bobVarA = dowVar.getLifecycle().a();
        if (bobVarA != bob.b && bobVarA != bob.c) {
            throw new IllegalArgumentException(a.bW(bobVarA, dowVar, "Failed to enable `SavedStateHandle` for `", "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."));
        }
        bou.b(dowVar, (bpp) dowVar);
    }
}
