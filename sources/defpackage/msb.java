package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class msb extends bdl {
    private final TextView a;

    public msb(TextView textView) {
        super(textView);
        this.a = textView;
    }

    private final ClickableSpan a(int i) {
        CharSequence text = this.a.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    private final CharSequence b(ClickableSpan clickableSpan) {
        CharSequence text = this.a.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.bdl
    protected final int getVirtualViewAt(float f, float f2) {
        TextView textView = this.a;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int offsetForHorizontal = -1;
            if (textView.getLayout() != null) {
                offsetForHorizontal = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f2 - textView.getTotalPaddingTop())) + textView.getScrollY())), Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f - textView.getTotalPaddingLeft())) + textView.getScrollX());
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return spanned.getSpanStart(clickableSpanArr[0]);
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.bdl
    protected final void getVisibleVirtualViews(List list) {
        CharSequence text = this.a.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.bdl
    protected final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        ClickableSpan clickableSpanA;
        if (i2 != 16 || (clickableSpanA = a(i)) == null) {
            return false;
        }
        clickableSpanA.onClick(this.a);
        return true;
    }

    @Override // defpackage.bdl
    protected final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan clickableSpanA = a(i);
        if (clickableSpanA != null) {
            accessibilityEvent.setContentDescription(b(clickableSpanA));
        } else {
            accessibilityEvent.setContentDescription(this.a.getText());
        }
    }

    @Override // defpackage.bdl
    protected final void onPopulateNodeForVirtualView(int i, bbz bbzVar) {
        Layout layout;
        ClickableSpan clickableSpanA = a(i);
        if (clickableSpanA == null) {
            bbzVar.z(this.a.getText());
        } else if (clickableSpanA instanceof mrn) {
            CharSequence charSequenceB = ((mrn) clickableSpanA).a;
            if (charSequenceB == null) {
                charSequenceB = b(clickableSpanA);
            }
            bbzVar.z(charSequenceB);
        } else {
            bbzVar.z(b(clickableSpanA));
        }
        bbzVar.C(true);
        bbzVar.w(true);
        Rect rect = new Rect();
        TextView textView = this.a;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && clickableSpanA != null && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpanA);
            int spanEnd = spanned.getSpanEnd(clickableSpanA);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else {
                int i2 = (int) primaryHorizontal;
                if (layout.getParagraphDirection(lineForOffset) == -1) {
                    rect.right = i2;
                } else {
                    rect.left = i2;
                }
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
        if (rect.isEmpty()) {
            rect.set(0, 0, 1, 1);
        }
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        bbzVar.r(new Rect(rect.left + iArr[0], rect.top + iArr[1], rect.right + iArr[0], rect.bottom + iArr[1]));
        bbzVar.j(16);
    }
}
