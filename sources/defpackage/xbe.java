package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbe implements TextWatcher {
    final /* synthetic */ xbf a;
    private final ForegroundColorSpan b;
    private boolean c;
    private long d;
    private boolean e = true;
    private int f = 0;

    public xbe(xbf xbfVar) {
        this.a = xbfVar;
        this.b = new ForegroundColorSpan(tzk.n(xbfVar.f(), R.attr.ytTextDisabled).orElse(0));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.c) {
            int length = editable.length();
            xbf xbfVar = this.a;
            if (length > xbfVar.v) {
                ForegroundColorSpan foregroundColorSpan = this.b;
                if (editable.getSpanStart(foregroundColorSpan) < 0) {
                    editable.setSpan(foregroundColorSpan, xbfVar.v, editable.length(), 33);
                }
            }
        }
        int length2 = editable.length();
        xbf xbfVar2 = this.a;
        if (length2 != 0) {
            xbfVar2.x().setHint("");
        } else {
            xbfVar2.x().setHint(xbfVar2.h());
        }
        xbf xbfVar3 = this.a;
        long jB = xbfVar3.k.b();
        if (jB - this.d >= 3000) {
            xbfVar3.h.d(tum.LIVE_CHAT_TEXT_TYPING);
            wxh wxhVar = xbfVar3.p;
            wxhVar.b = wxhVar.a.b();
            this.d = jB;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        xbf xbfVar;
        ViewGroup viewGroupQ;
        if (this.c && (charSequence instanceof SpannableStringBuilder)) {
            ((SpannableStringBuilder) charSequence).removeSpan(this.b);
        }
        if (this.f != 0 || (viewGroupQ = (xbfVar = this.a).q()) == null) {
            return;
        }
        this.f = (viewGroupQ.getMeasuredWidth() - xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_end)) - xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_start);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x020d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0211  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        ViewGroup viewGroupQ;
        int dimensionPixelOffset;
        boolean z2;
        int dimensionPixelOffset2;
        int dimensionPixelOffset3;
        int i4;
        boolean z3;
        Pattern patternI;
        String strConcat;
        xbf xbfVar = this.a;
        wys wysVar = xbfVar.g;
        int length = charSequence.length();
        int iB = wysVar.b(charSequence, xbfVar.w);
        this.c = iB > xbfVar.v;
        ImageView imageViewB = xbfVar.B();
        boolean z4 = length != 0;
        if (imageViewB != null) {
            boolean z5 = !z4 && xbfVar.N;
            xbf.S(xbfVar.t(), z5);
            xbf.S(xbfVar.D(), z5);
            xbf.S(xbfVar.u(), z5);
            z = charSequence.length() != 0 || (xbfVar.l && !xbfVar.N);
            xbf.S(xbfVar.v(), z);
            xbfVar.Q();
        } else {
            z = false;
        }
        ViewGroup viewGroupW = xbfVar.w();
        if (viewGroupW != null) {
            xbf.S(viewGroupW, (z || xbfVar.l || !xbfVar.z) ? false : true);
        }
        ViewGroup viewGroupR = xbfVar.r();
        if (viewGroupR != null) {
            xbf.S(viewGroupR, (z || xbfVar.l || !xbfVar.j) ? false : true);
        }
        ViewGroup viewGroupS = xbfVar.s();
        if (viewGroupS != null) {
            xbf.S(viewGroupS, (z || xbfVar.l || !xbfVar.A) ? false : true);
        }
        if (z4) {
            List list = xbfVar.y;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            wxl wxlVar = xbfVar.m;
            if (wxlVar != null) {
                wxlVar.j(list);
            }
            xbfVar.L(0);
        } else {
            xbfVar.L(4);
        }
        if (!z4) {
            xbfVar.x().setMaxLines(1);
        } else if (xbfVar.x().getMaxLines() == 1) {
            xbfVar.x().setMaxLines(-1);
            xbfVar.x().setMaxHeight(xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_input_field_max_height));
        }
        boolean z6 = xbfVar.x().getLineCount() < 2;
        if (xbfVar.x().getLineCount() != 0 && (viewGroupQ = xbfVar.q()) != null && (this.e ^ z6)) {
            if (z6) {
                TextPaint paint = xbfVar.x().getPaint();
                String string = charSequence.toString();
                if (!TextUtils.isEmpty(string)) {
                    aeiv aeivVar = wysVar.h;
                    if (aeivVar.k() && (patternI = aeivVar.i()) != null) {
                        Matcher matcher = patternI.matcher(string);
                        int length2 = string.length();
                        String strConcat2 = "";
                        boolean z7 = false;
                        int iStart = 0;
                        while (matcher.find()) {
                            if (matcher.start() > iStart) {
                                strConcat = !z7 ? strConcat2.concat(String.valueOf(string.substring(iStart, matcher.start()))) : strConcat2.concat(String.valueOf(string.substring(length2, matcher.start())));
                                iStart = matcher.start();
                            } else {
                                strConcat = strConcat2.concat(String.valueOf(string.substring(iStart, matcher.start())));
                            }
                            strConcat2 = strConcat;
                            for (int i5 = 0; i5 < 5; i5++) {
                                strConcat2 = strConcat2.concat("x");
                            }
                            length2 = matcher.end();
                            z7 = true;
                        }
                        if (z7) {
                            string = length2 < string.length() ? strConcat2.concat(String.valueOf(string.substring(length2))) : strConcat2;
                        }
                    }
                }
                if (((int) paint.measureText(string)) <= this.f) {
                    if (z6) {
                        z2 = true;
                        dimensionPixelOffset = 0;
                    } else {
                        dimensionPixelOffset = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_vertical);
                        z2 = false;
                    }
                    EditText editTextX = xbfVar.x();
                    int dimensionPixelOffset4 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_start);
                    if (z2) {
                        dimensionPixelOffset2 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_end);
                        dimensionPixelOffset3 = 0;
                    } else {
                        dimensionPixelOffset2 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_start);
                        dimensionPixelOffset3 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_bottom);
                    }
                    editTextX.setPadding(dimensionPixelOffset4, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
                    if (z6) {
                        i4 = xbfVar.K;
                        z3 = true;
                    } else {
                        i4 = xbfVar.L;
                        z3 = false;
                    }
                    viewGroupQ.setBackgroundResource(i4);
                    this.e = z6;
                    z6 = z3;
                }
            } else {
                if (z6) {
                    z2 = true;
                    dimensionPixelOffset = 0;
                } else {
                    dimensionPixelOffset = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_vertical);
                    z2 = false;
                }
                EditText editTextX2 = xbfVar.x();
                int dimensionPixelOffset5 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_start);
                if (z2) {
                    dimensionPixelOffset2 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_end);
                    dimensionPixelOffset3 = 0;
                } else {
                    dimensionPixelOffset2 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_start);
                    dimensionPixelOffset3 = xbfVar.f().getResources().getDimensionPixelOffset(R.dimen.live_chat_edit_text_padding_bottom);
                }
                editTextX2.setPadding(dimensionPixelOffset5, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
                if (z6) {
                    i4 = xbfVar.K;
                    z3 = true;
                } else {
                    i4 = xbfVar.L;
                    z3 = false;
                }
                viewGroupQ.setBackgroundResource(i4);
                this.e = z6;
                z6 = z3;
            }
        }
        if (xbfVar.C) {
            xbfVar.H(xbfVar.v - iB, z4 && !z6);
            return;
        }
        TextView textViewC = xbfVar.C();
        if (textViewC != null) {
            textViewC.setVisibility(8);
        }
    }
}
