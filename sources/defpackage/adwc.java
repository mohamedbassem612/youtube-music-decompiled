package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adwc implements adwb {
    private final LinearLayoutManager a;

    public adwc(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // defpackage.adwb
    public final int a() {
        return this.a.findFirstVisibleItemPosition();
    }

    @Override // defpackage.adwb
    public final int b() {
        return this.a.findLastCompletelyVisibleItemPosition();
    }

    @Override // defpackage.adwb
    public final int c() {
        return this.a.findLastVisibleItemPosition();
    }

    @Override // defpackage.adwb
    public final void d(int i) {
        this.a.scrollToPositionWithOffset(i, 0);
    }
}
