package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aduz implements View.OnLayoutChangeListener {
    private final View a;
    private final View b;
    private final int[] c = new int[2];
    private final Rect d = new Rect();
    private final int e;

    public aduz(View view, View view2) {
        this.a = view;
        this.b = view2;
        this.e = view.getResources().getDimensionPixelSize(R.dimen.innertube_menu_anchor_size);
        if (view.getWidth() > 0) {
            a();
        }
        view.addOnLayoutChangeListener(this);
    }

    private final void a() {
        View view = this.b;
        int visibility = view.getVisibility();
        View view2 = this.a;
        if (visibility != 0) {
            TouchDelegate touchDelegate = view2.getTouchDelegate();
            if (touchDelegate instanceof twa) {
                ((twa) touchDelegate).a.remove(view);
                return;
            } else {
                view2.setTouchDelegate(null);
                return;
            }
        }
        int[] iArr = this.c;
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view2.getWidth();
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width2 = i3 + (view.getWidth() / 2);
        int height = i4 + (view.getHeight() / 2);
        int i5 = this.e;
        Rect rect = this.d;
        int i6 = height - i2;
        int i7 = i5 / 2;
        rect.top = Math.max(0, i6 - i7);
        rect.bottom = rect.top + i5;
        int i8 = bac.a;
        if (view2.getLayoutDirection() == 1) {
            rect.left = i;
            rect.right = i + i5;
        } else {
            rect.left = Math.min(width - i5, (width2 - i) - i7);
            rect.right = width;
        }
        twa.a(view2, view, new aduy(rect, view));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a();
    }
}
