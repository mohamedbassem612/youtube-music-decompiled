package defpackage;

import android.content.ActivityNotFoundException;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tva extends LinkMovementMethod {
    private static tva a;

    public static MovementMethod a() {
        tva tvaVar = a;
        if (tvaVar != null) {
            return tvaVar;
        }
        tva tvaVar2 = new tva();
        a = tvaVar2;
        return tvaVar2;
    }

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
        YouTubeTextView youTubeTextView = (YouTubeTextView) textView;
        agrf agrfVar = YouTubeTextView.b;
        if (youTubeTextView.d && (clickableSpan instanceof tuc)) {
            tuc tucVar = (tuc) clickableSpan;
            if (actionMasked == 0) {
                tucVar.b = youTubeTextView.e;
            } else {
                tucVar.b = 0;
            }
            youTubeTextView.invalidate();
        }
        if (actionMasked == 0) {
            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
        } else {
            Selection.removeSelection(spannable);
            try {
                clickableSpan.onClick(youTubeTextView);
            } catch (ActivityNotFoundException unused) {
                ((agrc) ((agrc) YouTubeTextView.b.c()).k("com/google/android/libraries/youtube/common/ui/YouTubeTextView$ThruLinkMovementMethod", "onTouchEvent", 511, "YouTubeTextView.java")).t("Activity was not found for browser intent.");
            }
        }
        youTubeTextView.c = true;
        return true;
    }
}
