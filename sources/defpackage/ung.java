package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ung extends tud {
    final /* synthetic */ unh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ung(unh unhVar, String str) {
        super(str);
        this.a = unhVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        unh unhVar = this.a;
        cc ccVar = unhVar.h;
        View view = ccVar.getView();
        if (view != null) {
            Rect rect = new Rect();
            ShortsPlayerView shortsPlayerView = unhVar.f;
            shortsPlayerView.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect2);
            tym.h(view.findViewById(R.id.shorts_edit_toolbar), new tyi(Math.max((((rect2.height() - rect.height()) / 2) - ccVar.getResources().getDimensionPixelSize(R.dimen.shorts_edit_toolbar_height)) - ccVar.getResources().getDimensionPixelSize(R.dimen.image_editor_toolbar_top_margin), 0), 1), ViewGroup.MarginLayoutParams.class);
            shortsPlayerView.getViewTreeObserver().removeOnGlobalLayoutListener(unhVar.x);
        }
    }
}
