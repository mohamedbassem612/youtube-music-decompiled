package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tvq extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ tvv b;
    final /* synthetic */ float c;
    final /* synthetic */ SwipeLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvq(SwipeLayout swipeLayout, String str, View view, tvv tvvVar, float f) {
        super(str);
        this.a = view;
        this.b = tvvVar;
        this.c = f;
        this.d = swipeLayout;
    }

    @Override // defpackage.tud
    protected final void a() {
        View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (view.getParent() != null) {
            this.d.p(((Integer) this.b.a()).intValue(), this.c);
        }
    }
}
