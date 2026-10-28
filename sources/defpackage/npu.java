package defpackage;

import android.view.View;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npu implements View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public npu(kjc kjcVar, aamo aamoVar, String str, int i) {
        this.$cid = i;
        this.a = aamoVar;
        this.c = str;
        this.b = kjcVar;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.$cid != 0) {
            Object obj = this.b;
            synchronized (obj) {
                Object obj2 = this.a;
                if (((aamo) obj2).a) {
                    ((aamo) obj2).f();
                } else {
                    ((aamo) obj2).h();
                }
                ((kjc) obj).a.remove(this.c);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        try {
            ((npt) this.a).a(view);
            npv.o(view);
            ((npr) this.b).b();
            Object obj3 = this.c;
            ((npv) obj3).d = -1;
            ((npv) obj3).e = -1;
            ((npv) obj3).a = 0;
            ((npv) obj3).b = 0;
        } finally {
            view.removeOnAttachStateChangeListener(this);
            npv npvVar = (npv) this.c;
            WeakReference weakReference = npvVar.c;
            if (weakReference != null && Objects.equals(weakReference.get(), view)) {
                npvVar.c = null;
            }
        }
    }

    public npu(npv npvVar, npt nptVar, npr nprVar, int i) {
        this.$cid = i;
        this.a = nptVar;
        this.b = nprVar;
        this.c = npvVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
