package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeed implements nt {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aeed(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.nt
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.$cid != 0) {
            motionEvent.getClass();
        }
    }

    @Override // defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.$cid != 0) {
            motionEvent.getClass();
            if (motionEvent.getAction() == 0) {
                new zf(((cc) this.a).requireActivity().getWindow(), recyclerView).b(8);
            }
        } else {
            ((aeei) this.a).m = motionEvent.getY();
        }
        return false;
    }

    @Override // defpackage.nt
    public final void f(boolean z) {
    }
}
