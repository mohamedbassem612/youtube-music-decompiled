package defpackage;

import android.content.ActivityNotFoundException;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aedt extends LinkMovementMethod {
    public static final aedt a = new aedt();

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1) {
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length <= 0) {
            Selection.removeSelection(spannable);
            Touch.onTouchEvent(textView, spannable, motionEvent);
            return false;
        }
        ClickableSpan clickableSpan = clickableSpanArr[0];
        YouTubeAppCompatTextView youTubeAppCompatTextView = (YouTubeAppCompatTextView) textView;
        if (actionMasked == 0) {
            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
        } else {
            Selection.removeSelection(spannable);
            try {
                clickableSpan.onClick(youTubeAppCompatTextView);
            } catch (ActivityNotFoundException e) {
                ((agrc) ((agrc) ((agrc) YouTubeAppCompatTextView.g.c()).j(e)).k("com/google/android/libraries/youtube/rendering/ui/spec/typography/YouTubeAppCompatTextView$ThruLinkMovementMethod", "onTouchEvent", (char) 413, "YouTubeAppCompatTextView.java")).t("Activity was not found for browser intent.");
            }
        }
        youTubeAppCompatTextView.h = true;
        return true;
    }
}
