package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class dli extends oj {
    final RecyclerView c;
    final axx d;
    final axx e;

    public dli(RecyclerView recyclerView) {
        super(recyclerView);
        this.d = this.b;
        this.e = new dlh(this);
        this.c = recyclerView;
    }

    @Override // defpackage.oj
    public final axx a() {
        return this.e;
    }
}
