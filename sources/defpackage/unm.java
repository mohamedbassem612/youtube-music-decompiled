package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class unm extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    private float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unm(View view, View view2) {
        super("ImageEditorFragmentPeer");
        this.a = view;
        this.b = view2;
        this.c = -1.0f;
    }

    @Override // defpackage.tud
    public final void a() {
        View view = this.a;
        float y = view.getY() + view.getHeight();
        View view2 = this.b;
        float height = y - view2.getHeight();
        view2.setY(height);
        if (this.c == height) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.c = height;
        }
    }
}
