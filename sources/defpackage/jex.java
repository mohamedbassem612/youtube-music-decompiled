package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.youtube.music.ui.presenter.MusicSnappyGridLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jex extends od {
    final /* synthetic */ MusicSnappyGridLayoutManager a;
    private final LinearLayoutManager n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jex(MusicSnappyGridLayoutManager musicSnappyGridLayoutManager, Context context, LinearLayoutManager linearLayoutManager) {
        super(context);
        this.a = musicSnappyGridLayoutManager;
        this.n = linearLayoutManager;
    }

    @Override // defpackage.od
    public final PointF e(int i) {
        return this.n.computeScrollVectorForPosition(i);
    }

    @Override // defpackage.od
    protected final int k() {
        return this.a.k == 2 ? 1 : -1;
    }

    @Override // defpackage.od
    protected final int l() {
        return -1;
    }
}
