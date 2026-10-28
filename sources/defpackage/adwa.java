package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adwa implements adwb {
    private final /* synthetic */ int $cid;
    private final np a;

    public adwa(np npVar, int i) {
        this.$cid = i;
        this.a = npVar;
    }

    @Override // defpackage.adwb
    public final int a() {
        int i = this.$cid;
        np npVar = this.a;
        return i != 0 ? ((FlowLayoutManager) npVar).c() : ((LinearLayoutManager) npVar).findFirstVisibleItemPosition();
    }

    @Override // defpackage.adwb
    public final int b() {
        int i = this.$cid;
        np npVar = this.a;
        return i != 0 ? ((FlowLayoutManager) npVar).d() : ((LinearLayoutManager) npVar).findLastCompletelyVisibleItemPosition();
    }

    @Override // defpackage.adwb
    public final int c() {
        int i = this.$cid;
        np npVar = this.a;
        return i != 0 ? ((FlowLayoutManager) npVar).e() : ((LinearLayoutManager) npVar).findLastVisibleItemPosition();
    }

    @Override // defpackage.adwb
    public final void d(int i) {
        int i2 = this.$cid;
        np npVar = this.a;
        if (i2 != 0) {
            ((FlowLayoutManager) npVar).l(i, 0);
        } else {
            ((LinearLayoutManager) npVar).scrollToPositionWithOffset(i, 0);
        }
    }
}
