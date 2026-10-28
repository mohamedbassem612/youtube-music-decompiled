package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vnt extends FrameLayout {
    final /* synthetic */ vnv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnt(Context context, vnv vnvVar) {
        super(context);
        this.a = vnvVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.a();
    }
}
