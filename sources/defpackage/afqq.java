package defpackage;

import android.os.Looper;
import android.view.View;
import j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afqq implements afqk {
    public afqk a;
    private final cc b;
    private final awou c;

    public afqq(cc ccVar, awou awouVar) {
        this.b = ccVar;
        this.c = awouVar;
    }

    @Override // defpackage.afqk
    public final ahub a(axat axatVar) {
        axatVar.getClass();
        if (!awrc.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalStateException("streamFrom() must be called from the main thread.");
        }
        try {
            if (this.b.getViewLifecycleOwner().getLifecycle().a() != bob.b) {
                throw new IllegalStateException("A @ViewLifecycle StreamMixin may only register callbacks in `onCreateView()`.");
            }
            afqk afqkVar = this.a;
            if (afqkVar == null) {
                cc ccVar = this.b;
                bog viewLifecycleOwner = ccVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                try {
                    afqf afqfVar = (afqf) new bpn(ccVar.getViewModelStore(), new afqj(0)).a(afqf.class);
                    if (Map.EL.putIfAbsent(afqfVar.a, viewLifecycleOwner, new afx(0)) == null) {
                        viewLifecycleOwner.getLifecycle().b(afqfVar);
                        if (!afqfVar.b) {
                            afqfVar.b = true;
                            afqfVar.c = viewLifecycleOwner;
                        }
                    }
                    afqo afqoVar = new afqo(viewLifecycleOwner, aewp.l(this.c, viewLifecycleOwner.getLifecycle()), new ahub(afqfVar));
                    viewLifecycleOwner.getLifecycle().b(new afxb(new adp(this, 6)));
                    this.a = afqoVar;
                    afqkVar = afqoVar;
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            if (!awrc.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                throw new IllegalStateException("streamFrom() must be called from the main thread.");
            }
            final afqo afqoVar2 = (afqo) afqkVar;
            afqp afqpVar = afqoVar2.c;
            java.util.Map map = afqpVar.a;
            Object objValueOf = map.get(axatVar);
            if (objValueOf == null) {
                if (!afqpVar.b) {
                    throw new IllegalStateException("This StateFlow object was not streamed from in the first lifecycle of this LifecycleOwner. A LifecycleOwner must streamFrom() every StateFlow it wishes to stream from in its first lifecycle, and must always stream from exactly the same set of StateFlow objects after each configuration change. This prevents state loss.");
                }
                int i = bac.a;
                objValueOf = Integer.valueOf(View.generateViewId());
                map.put(axatVar, objValueOf);
            }
            afqoVar2.d.o(((Number) objValueOf).intValue(), afqoVar2.a, new afqe() { // from class: afql
                @Override // defpackage.afqe
                public final Object a() {
                    if (afqoVar2.c.b) {
                        return awmy.a;
                    }
                    throw new IllegalStateException("This shouldn't happen. If there was a client-side error, it should've crashed during `flowId` generation. Please report go/tiktok-bug.");
                }
            });
            return new ahub(new acjo(afqkVar, axatVar, 10, null), (byte[]) null);
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("A @ViewLifecycle StreamMixin may only register callbacks in `onCreateView()`.", e2);
        }
    }
}
