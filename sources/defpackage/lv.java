package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lv extends qa {
    private static final int[] b = {R.attr.listDivider};
    public Drawable a;
    private int c;
    private final Rect d;

    public lv(Context context, int i) {
        super((byte[]) null);
        this.d = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(b);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.c = i;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        Drawable drawable = this.a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // defpackage.qa
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.n == null || this.a == null) {
            return;
        }
        int i = 0;
        if (this.c == 1) {
            canvas.save();
            if (recyclerView.i) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                Rect rect = this.d;
                RecyclerView.N(childAt, rect);
                int iRound = rect.bottom + Math.round(childAt.getTranslationY());
                this.a.setBounds(paddingLeft, iRound - this.a.getIntrinsicHeight(), width, iRound);
                this.a.draw(canvas);
                i++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.i) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            np npVar = recyclerView.n;
            Rect rect2 = this.d;
            npVar.getDecoratedBoundsWithMargins(childAt2, rect2);
            int iRound2 = rect2.right + Math.round(childAt2.getTranslationX());
            this.a.setBounds(iRound2 - this.a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.a.draw(canvas);
            i++;
        }
        canvas.restore();
    }
}
