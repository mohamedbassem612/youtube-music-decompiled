package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adgm implements bla {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ View a;

    public /* synthetic */ adgm(View view, int i) {
        this.$cid = i;
        this.a = view;
    }

    @Override // defpackage.bla
    public final void l(float f) {
        int i = this.$cid;
        View view = this.a;
        if (i == 0) {
            view.setTranslationX(f);
            return;
        }
        SwipeLayout swipeLayout = (SwipeLayout) view;
        if (swipeLayout.t()) {
            f = -f;
        }
        swipeLayout.o((int) f);
    }
}
