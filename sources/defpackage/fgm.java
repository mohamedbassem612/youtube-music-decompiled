package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgm {
    static final agm a = new agm(100);
    public int b = 2;
    public int c = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = 2;
    public final fgl e = new fgl();
    public Layout f = null;
    public boolean g = true;

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123 A[Catch: IndexOutOfBoundsException -> 0x0148, TryCatch #2 {IndexOutOfBoundsException -> 0x0148, blocks: (B:49:0x00e0, B:51:0x0100, B:67:0x0125, B:69:0x0140, B:70:0x0143, B:52:0x0103, B:54:0x0107, B:55:0x010a, B:57:0x010e, B:59:0x0112, B:60:0x0115, B:62:0x0119, B:63:0x011c, B:65:0x0120, B:66:0x0123), top: B:95:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0159 A[LOOP:0: B:91:0x00c3->B:81:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x016e A[SYNTHETIC] */
    public final Layout a() {
        boolean z;
        BoringLayout.Metrics metricsIsBoring;
        int iCeil;
        boolean z2;
        int i;
        fgl fglVar;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutBuild;
        Layout layout;
        if (this.g && (layout = this.f) != null) {
            return layout;
        }
        fgl fglVar2 = this.e;
        CharSequence charSequence = fglVar2.h;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        int iHashCode = -1;
        if (this.g) {
            CharSequence charSequence2 = fglVar2.h;
            if (!(charSequence2 instanceof Spannable) || ((ClickableSpan[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length() - 1, ClickableSpan.class)).length <= 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (this.g && !z) {
            iHashCode = fglVar2.hashCode();
            Layout layout2 = (Layout) a.b(Integer.valueOf(iHashCode));
            if (layout2 != null) {
                return layout2;
            }
        }
        int i2 = fglVar2.o;
        if (i2 == 1) {
            metricsIsBoring = BoringLayout.isBoring(fglVar2.h, fglVar2.a);
            i2 = 1;
        } else {
            metricsIsBoring = null;
        }
        fgl fglVar3 = this.e;
        int i3 = fglVar3.g;
        if (i3 != 0) {
            iCeil = i3 != 1 ? Math.min((int) Math.ceil(Layout.getDesiredWidth(fglVar3.h, fglVar3.a)), fglVar3.f) : fglVar3.f;
        } else {
            iCeil = (int) Math.ceil(Layout.getDesiredWidth(fglVar3.h, fglVar3.a));
        }
        int iRound = Math.round((fglVar3.a.getFontMetricsInt(null) * fglVar3.j) + fglVar3.k);
        int i4 = this.d;
        int i5 = this.c;
        int iMin = i4 == 1 ? Math.min(iCeil, i5 * iRound) : Math.min(iCeil, i5);
        int iMax = this.b == 1 ? Math.max(iMin, 0) : Math.max(iMin, 0);
        if (metricsIsBoring == null) {
            while (true) {
                try {
                    CharSequence charSequence3 = fglVar3.h;
                    int length = charSequence3.length();
                    TextPaint textPaint = fglVar3.a;
                    Layout.Alignment alignment = fglVar3.p;
                    float f = fglVar3.j;
                    float f2 = fglVar3.k;
                    boolean z3 = fglVar3.l;
                    TextUtils.TruncateAt truncateAt = fglVar3.n;
                    axh axhVar = fglVar3.q;
                    int i6 = fglVar3.r;
                    z2 = z;
                    try {
                        boolean z4 = fglVar3.m;
                        i = iHashCode;
                        try {
                            StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence3, 0, length, textPaint, iMax).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z3).setEllipsize(truncateAt).setEllipsizedWidth(iMax).setMaxLines(i2);
                            if (axhVar == axn.a) {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            } else if (axhVar == axn.b) {
                                textDirectionHeuristic = TextDirectionHeuristics.RTL;
                            } else if (axhVar == axn.c) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            } else if (axhVar == axn.d) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            } else if (axhVar == axn.e) {
                                textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            } else if (axhVar == axn.f) {
                                textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            } else {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            }
                            StaticLayout.Builder indents = maxLines.setTextDirection(textDirectionHeuristic).setBreakStrategy(i6).setHyphenationFrequency(0).setIndents(null, null);
                            indents.setJustificationMode(0);
                            if (Build.VERSION.SDK_INT >= 28) {
                                indents.setUseLineSpacingFromFallbacks(z4);
                            }
                            layoutBuild = indents.build();
                            break;
                        } catch (IndexOutOfBoundsException e) {
                            e = e;
                            fglVar = this.e;
                            if (!(fglVar.h instanceof String)) {
                                throw e;
                            }
                            Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e);
                            fglVar.h = fglVar.h.toString();
                            z = z2;
                            iHashCode = i;
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i = iHashCode;
                        fglVar = this.e;
                        if (!(fglVar.h instanceof String)) {
                            throw e;
                        }
                        Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e);
                        fglVar.h = fglVar.h.toString();
                        z = z2;
                        iHashCode = i;
                    }
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    z2 = z;
                }
                Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e);
                fglVar.h = fglVar.h.toString();
                z = z2;
                iHashCode = i;
            }
        } else {
            z2 = z;
            i = iHashCode;
            fgl fglVar4 = this.e;
            layoutBuild = BoringLayout.make(fglVar4.h, fglVar4.a, iMax, fglVar4.p, fglVar4.j, fglVar4.k, metricsIsBoring, fglVar4.l, fglVar4.n, iMax);
        }
        if (this.g && !z2) {
            this.f = layoutBuild;
            a.c(Integer.valueOf(i), layoutBuild);
        }
        this.e.s = true;
        return layoutBuild;
    }

    public final void b(int i) {
        fgl fglVar = this.e;
        float f = i;
        if (fglVar.a.getTextSize() != f) {
            fglVar.a();
            fglVar.a.setTextSize(f);
            this.f = null;
        }
    }

    public final void c(Typeface typeface) {
        fgl fglVar = this.e;
        if (fglVar.a.getTypeface() != typeface) {
            fglVar.a();
            fglVar.a.setTypeface(typeface);
            this.f = null;
        }
    }
}
