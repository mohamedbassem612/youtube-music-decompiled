package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwp {
    public int a;
    public int b;

    public final void a(bwb bwbVar) {
        this.a = bwbVar.j();
        this.b = bwbVar.j();
    }

    public final void b(oh ohVar) {
        View view = ohVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
