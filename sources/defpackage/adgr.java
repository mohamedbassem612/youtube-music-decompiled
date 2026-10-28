package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class adgr implements otc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adgr(adgu adguVar, int i) {
        this.$cid = i;
        this.a = adguVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.otc
    public final boolean a(View view, MotionEvent motionEvent) {
        if (this.$cid == 0) {
            motionEvent.getClass();
            return ((adgu) this.a).D().c(view, motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            view.postDelayed(this.a, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            view.removeCallbacks(this.a);
        }
        return false;
    }

    public adgr(Runnable runnable, int i) {
        this.$cid = i;
        this.a = runnable;
    }
}
