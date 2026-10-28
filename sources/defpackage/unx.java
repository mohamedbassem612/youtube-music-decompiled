package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class unx extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ uoa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unx(uoa uoaVar, View view, View view2) {
        super("MultiImageEditorFragmentPeer");
        this.a = view;
        this.b = view2;
        this.c = uoaVar;
    }

    @Override // defpackage.tud
    public final void a() {
        View view = this.a;
        int width = view.getWidth();
        int height = ((view.getHeight() - width) / 2) + width + view.getResources().getDimensionPixelSize(R.dimen.multi_image_editor_thumbnail_list_margin_top);
        this.b.setY(height);
        uoa uoaVar = this.c;
        if (uoaVar.D == height) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            uoaVar.D = height;
        }
    }
}
