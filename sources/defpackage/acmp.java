package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmp extends qa {
    final /* synthetic */ acmt a;
    private int b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acmp(acmt acmtVar) {
        super((byte[]) null);
        this.a = acmtVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        int height = recyclerView.getHeight() / 2;
        if (height > 0) {
            int iMax = Math.max(-height, Math.min(height, this.b + i2));
            this.b = iMax;
            float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f - (Math.min(Math.abs(iMax), height) / height)));
            ViewGroup viewGroup = this.a.d;
            if (viewGroup != null) {
                viewGroup.setAlpha(fMax);
            }
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (this.c == 2 && i == 0) {
            this.b = 0;
        }
        this.c = i;
    }
}
