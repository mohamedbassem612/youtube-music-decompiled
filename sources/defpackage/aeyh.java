package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeyh {
    public boolean e;
    public avgj g;
    private CharSequence h;
    private final TextPaint i;
    private final int j;
    private int k;
    public Layout.Alignment a = Layout.Alignment.ALIGN_NORMAL;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    private float l = 0.0f;
    private float m = 1.0f;
    public int c = 1;
    public boolean d = true;
    public TextUtils.TruncateAt f = null;

    public aeyh(CharSequence charSequence, TextPaint textPaint, int i) {
        this.h = charSequence;
        this.i = textPaint;
        this.j = i;
        this.k = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.h == null) {
            this.h = "";
        }
        int iMax = Math.max(0, this.j);
        CharSequence charSequenceEllipsize = this.h;
        if (this.b == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.i, iMax, this.f);
        }
        this.k = Math.min(charSequenceEllipsize.length(), this.k);
        if (this.e && this.b == 1) {
            this.a = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, this.k, this.i, iMax);
        builderObtain.setAlignment(this.a);
        builderObtain.setIncludePad(this.d);
        builderObtain.setTextDirection(this.e ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.b);
        float f = this.l;
        if (f != 0.0f || this.m != 1.0f) {
            builderObtain.setLineSpacing(f, this.m);
        }
        if (this.b > 1) {
            builderObtain.setHyphenationFrequency(this.c);
        }
        avgj avgjVar = this.g;
        if (avgjVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) avgjVar.a).k.getBreakStrategy());
        }
        return builderObtain.build();
    }

    public final void b(float f, float f2) {
        this.l = f;
        this.m = f2;
    }
}
