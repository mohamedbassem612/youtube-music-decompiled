package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wc implements bnu {
    private final WeakReference a;

    public wc(wm wmVar) {
        this.a = new WeakReference(wmVar);
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((wm) weakReference.get()).z = null;
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
