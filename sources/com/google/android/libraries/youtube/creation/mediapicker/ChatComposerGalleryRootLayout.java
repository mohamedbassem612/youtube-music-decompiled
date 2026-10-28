package com.google.android.libraries.youtube.creation.mediapicker;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ChatComposerGalleryRootLayout extends ConstraintLayout {
    private final Rect i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatComposerGalleryRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = new Rect();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ViewParent parent;
        View viewFindViewById;
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 0) {
            float y = motionEvent.getY();
            View viewFindViewById2 = findViewById(R.id.gallery_contents);
            if (viewFindViewById2 == null || !viewFindViewById2.isShown()) {
                viewFindViewById = findViewById(R.id.multi_select_footer);
                if (viewFindViewById == null && viewFindViewById.isShown() && y >= viewFindViewById.getTop() + viewFindViewById.getTranslationY()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                Rect rect = this.i;
                rect.set(0, 0, viewFindViewById2.getWidth(), viewFindViewById2.getHeight());
                offsetDescendantRectToMyCoords(viewFindViewById2, rect);
                if (y < rect.top) {
                    viewFindViewById = findViewById(R.id.multi_select_footer);
                    if (viewFindViewById == null) {
                    }
                    z = false;
                }
                z = true;
            }
        } else {
            z = false;
        }
        if (z && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent) || z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatComposerGalleryRootLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatComposerGalleryRootLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ChatComposerGalleryRootLayout(Context context, AttributeSet attributeSet, int i, int i2, awqx awqxVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
