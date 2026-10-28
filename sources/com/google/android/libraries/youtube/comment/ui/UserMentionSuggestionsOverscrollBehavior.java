package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.ast;
import defpackage.asv;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class UserMentionSuggestionsOverscrollBehavior extends ast {
    private boolean b;
    private int c;
    private int d;
    private int e;

    public UserMentionSuggestionsOverscrollBehavior() {
        this.e = -1;
    }

    @Override // defpackage.ast
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Optional optionalOf;
        ast astVar = ((asv) view2.getLayoutParams()).a;
        if ((view instanceof ScrollView) && (astVar instanceof BottomSheetBehavior)) {
            EditText editText = (EditText) coordinatorLayout.findViewById(R.id.content);
            Layout layout = editText.getLayout();
            if (layout == null) {
                optionalOf = Optional.empty();
            } else {
                int lineForOffset = layout.getLineForOffset(editText.getSelectionStart());
                optionalOf = Optional.of(Integer.valueOf(layout.getLineBaseline(lineForOffset) + layout.getLineAscent(lineForOffset)));
            }
            if (!optionalOf.isEmpty()) {
                int iIntValue = ((Integer) optionalOf.get()).intValue();
                View viewFindViewById = coordinatorLayout.findViewById(R.id.filler_space);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                BottomSheetBehavior bottomSheetBehaviorX = BottomSheetBehavior.x(view2);
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i = iArr[1];
                if (bottomSheetBehaviorX.F == 5) {
                    this.b = false;
                } else {
                    if (!this.b) {
                        int[] iArr2 = new int[2];
                        editText.getLocationOnScreen(iArr2);
                        this.c = iIntValue + iArr2[1] + (editText.getLineHeight() << 1);
                        this.d = view.getScrollY();
                        this.b = true;
                    }
                    int i2 = this.c;
                    int height = this.e;
                    if (i < i2) {
                        if (height == -1) {
                            height = viewFindViewById.getHeight();
                            this.e = height;
                        }
                        int i3 = this.c - i;
                        int i4 = height + i3;
                        if (viewFindViewById.getHeight() != i4) {
                            layoutParams.height = i4;
                            viewFindViewById.requestLayout();
                            view.scrollTo(0, this.d + i3);
                            view.setVerticalScrollBarEnabled(false);
                        }
                    } else if (height >= 0) {
                        this.e = -1;
                        layoutParams.height = 0;
                        viewFindViewById.requestLayout();
                        view.setVerticalScrollBarEnabled(true);
                    }
                }
            }
        }
        return false;
    }

    public UserMentionSuggestionsOverscrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
    }
}
