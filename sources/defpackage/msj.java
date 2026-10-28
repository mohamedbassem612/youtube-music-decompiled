package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class msj extends LinkMovementMethod {
    public static final /* synthetic */ int a = 0;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private Runnable c;

    private final void a() {
        Runnable runnable = this.c;
        if (runnable != null) {
            b.removeCallbacks(runnable);
            this.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX;
        Layout layout;
        int lineForVertical;
        int offsetForHorizontal;
        frp[] frpVarArr;
        frp frpVar;
        int spanStart;
        int spanEnd;
        if (!(textView instanceof mry)) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        mry mryVar = (mry) textView;
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked == 3) {
            if (this.c != null) {
                a();
            }
            Selection.removeSelection(spannable);
            return false;
        }
        if (actionMasked == 1) {
            mryVar.requestFocus();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - mryVar.getTotalPaddingLeft();
            int totalPaddingTop = y - mryVar.getTotalPaddingTop();
            scrollX = totalPaddingLeft + mryVar.getScrollX();
            int scrollY = totalPaddingTop + mryVar.getScrollY();
            layout = mryVar.getLayout();
            lineForVertical = layout.getLineForVertical(scrollY);
            offsetForHorizontal = (Build.VERSION.SDK_INT >= 28 && layout.getLineStart(lineForVertical) == layout.getLineEnd(lineForVertical)) ? 0 : layout.getOffsetForHorizontal(lineForVertical, scrollX);
            frpVarArr = (frp[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, frp.class);
            if (frpVarArr.length != 0) {
                frpVar = frpVarArr[0];
                spanStart = spannable.getSpanStart(frpVar);
                spanEnd = spannable.getSpanEnd(frpVar);
                if (spanStart <= offsetForHorizontal && offsetForHorizontal < spanEnd) {
                    if (actionMasked == 1) {
                        if (this.c != null) {
                            a();
                        }
                        frpVar.onClick(mryVar);
                        Selection.removeSelection(spannable);
                    } else {
                        Selection.setSelection(spannable, spanStart, spanEnd);
                        msh mshVar = new msh(frpVar, mryVar, i);
                        this.c = mshVar;
                        b.postDelayed(mshVar, ViewConfiguration.getLongPressTimeout());
                    }
                    mryVar.d = true;
                    return true;
                }
            }
        } else if (actionMasked == 0) {
            actionMasked = 0;
            mryVar.requestFocus();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int totalPaddingLeft2 = x2 - mryVar.getTotalPaddingLeft();
            int totalPaddingTop2 = y2 - mryVar.getTotalPaddingTop();
            scrollX = totalPaddingLeft2 + mryVar.getScrollX();
            int scrollY2 = totalPaddingTop2 + mryVar.getScrollY();
            layout = mryVar.getLayout();
            lineForVertical = layout.getLineForVertical(scrollY2);
            if (Build.VERSION.SDK_INT >= 28) {
                offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            }
            frpVarArr = (frp[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, frp.class);
            if (frpVarArr.length != 0) {
                frpVar = frpVarArr[0];
                spanStart = spannable.getSpanStart(frpVar);
                spanEnd = spannable.getSpanEnd(frpVar);
                if (spanStart <= offsetForHorizontal) {
                    if (actionMasked == 1) {
                        if (this.c != null) {
                            a();
                        }
                        frpVar.onClick(mryVar);
                        Selection.removeSelection(spannable);
                    } else {
                        Selection.setSelection(spannable, spanStart, spanEnd);
                        msh mshVar2 = new msh(frpVar, mryVar, i);
                        this.c = mshVar2;
                        b.postDelayed(mshVar2, ViewConfiguration.getLongPressTimeout());
                    }
                    mryVar.d = true;
                    return true;
                }
            }
        }
        return super.onTouchEvent(mryVar, spannable, motionEvent);
    }
}
