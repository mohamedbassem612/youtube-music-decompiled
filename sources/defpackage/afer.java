package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afer extends axx {
    private final TextInputLayout a;

    public afer(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        CharSequence charSequence;
        CharSequence charSequenceConcat;
        CharSequence charSequence2;
        TextView textView;
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        TextInputLayout textInputLayout = this.a;
        EditText editText = textInputLayout.c;
        Editable text = editText != null ? editText.getText() : null;
        CharSequence charSequenceF = textInputLayout.f();
        afei afeiVar = textInputLayout.d;
        CharSequence charSequence3 = afeiVar.n ? afeiVar.m : null;
        CharSequence charSequenceE = textInputLayout.e();
        CharSequence charSequence4 = textInputLayout.j ? textInputLayout.i : null;
        int i = textInputLayout.f;
        CharSequence contentDescription = (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) ? textView.getContentDescription() : null;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z = !zIsEmpty;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequenceF);
        boolean z2 = textInputLayout.p;
        boolean zIsEmpty3 = TextUtils.isEmpty(charSequenceE);
        boolean z3 = !zIsEmpty3;
        boolean z4 = (zIsEmpty3 && TextUtils.isEmpty(contentDescription)) ? false : true;
        CharSequence charSequence5 = true == zIsEmpty2 ? null : charSequenceF;
        CharSequence charSequenceConcat2 = charSequence3;
        if (TextUtils.isEmpty(charSequence3)) {
            charSequence = charSequenceE;
        } else {
            charSequence = charSequenceE;
            if (afeiVar.e == 2 && afeiVar.o != null && !TextUtils.isEmpty(afeiVar.m)) {
                if (!TextUtils.isEmpty(charSequence5)) {
                    charSequenceConcat2 = TextUtils.concat(charSequence5, ", ", charSequenceConcat2);
                }
                charSequence5 = charSequenceConcat2;
            }
        }
        afeo afeoVar = textInputLayout.a;
        TextView textView2 = afeoVar.a;
        if (textView2.getVisibility() == 0) {
            bbzVar.a.setLabelFor(textView2);
            bbzVar.Q(textView2);
        } else {
            bbzVar.Q(afeoVar.c);
        }
        if (zIsEmpty) {
            if (!TextUtils.isEmpty(charSequence5)) {
                bbzVar.O(charSequence5);
                if (!z2 && charSequence4 != null) {
                    bbzVar.O(TextUtils.concat(charSequence5, ", ", charSequence4));
                }
            } else if (charSequence4 != null) {
                bbzVar.O(charSequence4);
            }
        } else if (TextUtils.isEmpty(charSequence5)) {
            bbzVar.O(text);
        } else {
            if (text == null) {
                if (charSequence5 == null) {
                    charSequence5 = "";
                    charSequence2 = null;
                } else {
                    charSequence2 = charSequence5;
                }
            } else if (charSequence5 == null) {
                charSequence5 = text;
                charSequence2 = null;
            } else {
                SpanWatcher[] spanWatcherArr = (SpanWatcher[]) text.getSpans(0, text.length(), SpanWatcher.class);
                if (spanWatcherArr == null || (spanWatcherArr.length) == 0) {
                    charSequenceConcat = TextUtils.concat(text, ", ", charSequence5);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                    for (SpanWatcher spanWatcher : spanWatcherArr) {
                        spannableStringBuilder.removeSpan(spanWatcher);
                    }
                    charSequenceConcat = spannableStringBuilder.append((CharSequence) ", ").append(charSequence5);
                }
                CharSequence charSequence6 = charSequence5;
                charSequence5 = charSequenceConcat;
                charSequence2 = charSequence6;
            }
            bbzVar.O(charSequence5);
            charSequence5 = charSequence2;
        }
        if (!TextUtils.isEmpty(charSequence5)) {
            if (true == z) {
                charSequence5 = null;
            }
            bbzVar.F(charSequence5);
            bbzVar.a.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = bbzVar.a;
        accessibilityNodeInfo.setMaxTextLength(i);
        if (z4) {
            accessibilityNodeInfo.setError(true == z3 ? charSequence : contentDescription);
        }
        textInputLayout.b.c().v(bbzVar);
    }

    @Override // defpackage.axx
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        int i = TextInputLayout.t;
        this.a.b.c().w(accessibilityEvent);
    }
}
