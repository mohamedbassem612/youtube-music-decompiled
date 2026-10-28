package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jia extends nh {
    public final List a = new ArrayList();

    @Override // defpackage.nh
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.nh
    public final oh e(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new oh(frameLayout);
    }

    @Override // defpackage.nh
    public final void o(oh ohVar, int i) {
        View view = ((jhq) this.a.get(i)).c;
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeAllViews();
        }
        ((FrameLayout) ohVar.a).addView(view);
    }

    @Override // defpackage.nh
    public final void s(oh ohVar) {
        ((FrameLayout) ohVar.a).removeAllViews();
    }
}
