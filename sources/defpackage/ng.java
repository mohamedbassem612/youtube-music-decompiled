package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ng implements ayh {
    final /* synthetic */ RecyclerView a;

    public ng(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.ayh
    public final float a() {
        float f;
        RecyclerView recyclerView = this.a;
        if (recyclerView.n.canScrollVertically()) {
            f = recyclerView.K;
        } else {
            if (!recyclerView.n.canScrollHorizontally()) {
                return 0.0f;
            }
            f = recyclerView.J;
        }
        return -f;
    }

    @Override // defpackage.ayh
    public final void b() {
        this.a.an();
    }

    @Override // defpackage.ayh
    public final boolean c(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.a;
        if (recyclerView.n.canScrollVertically()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.canScrollHorizontally()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.an();
        return recyclerView.ar(i, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
