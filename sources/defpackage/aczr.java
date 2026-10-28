package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aczr {
    Map a;
    public boolean b;
    public final avmb c;
    private final Set d = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public aczr(avmb avmbVar) {
        this.c = avmbVar;
    }

    private static boolean c(View view, int i) {
        if (System.identityHashCode(view) == i) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c(viewGroup.getChildAt(i2), i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void d(View view, int i, boolean z) {
        if (i == 2) {
            if (z) {
                this.d.add(view);
            }
        } else if (i == 4) {
            this.d.remove(view);
        }
    }

    public final synchronized Map a() {
        if (this.a == null) {
            try {
                boolean z = Memory.peekByte(FlagServices.b().c + 41) != 0;
                this.b = z;
                if (z) {
                    this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
                } else {
                    this.a = new ConcurrentHashMap();
                }
            } catch (UnsatisfiedLinkError unused) {
                this.b = false;
            }
        }
        return this.a;
    }

    public final avlb b(View view, int i, boolean z) {
        avlb avlbVarM;
        Map mapA = a();
        if (!this.b) {
            aczq aczqVar = (aczq) mapA.get(Integer.valueOf(System.identityHashCode(view)));
            if (aczqVar != null) {
                d(view, i, z);
                return aczqVar.b();
            }
            synchronized (mapA) {
                for (Map.Entry entry : mapA.entrySet()) {
                    if (((aczq) entry.getValue()).a() && (entry.getKey() instanceof Integer) && c(view, ((Integer) entry.getKey()).intValue())) {
                        d(view, i, z);
                        avlbVarM = ((aczq) entry.getValue()).b();
                    }
                }
                avlbVarM = avlb.m(new IllegalArgumentException("InlinePlaybackDelegateController called with unregistered view."));
            }
            return avlbVarM;
        }
        aczq aczqVar2 = (aczq) mapA.get(view);
        if (aczqVar2 != null) {
            d(view, i, z);
            return aczqVar2.b();
        }
        synchronized (mapA) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                Object key = entry2.getKey();
                if (key instanceof View) {
                    View view2 = (View) key;
                    while (view2 != null) {
                        if (view2.equals(view)) {
                            Object key2 = entry2.getKey();
                            if (key2 instanceof View) {
                                d((View) key2, i, z);
                            } else {
                                d(view, i, z);
                            }
                            return ((aczq) entry2.getValue()).b();
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
            return avlb.m(new IllegalArgumentException("InlinePlaybackDelegateController called with unregistered view."));
        }
    }
}
