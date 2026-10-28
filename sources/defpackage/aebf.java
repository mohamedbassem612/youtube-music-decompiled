package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aebf implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ nwj a;
    public final /* synthetic */ RecyclerView b;
    private boolean c = true;

    public aebf(nwj nwjVar, RecyclerView recyclerView) {
        this.a = nwjVar;
        this.b = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.c) {
            nwj nwjVar = this.a;
            if (nwjVar.f()) {
                this.c = false;
                RecyclerView recyclerView = this.b;
                recyclerView.post(new acqu(this, 16));
                nwjVar.c(recyclerView);
            }
        }
    }
}
