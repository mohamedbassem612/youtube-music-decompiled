package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgl {
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public CharSequence h;
    public ColorStateList i;
    final boolean m;
    public TextUtils.TruncateAt n;
    public int o;
    public Layout.Alignment p;
    public axh q;
    public int r;
    boolean s;
    public TextPaint a = new TextPaint(1);
    public float j = 1.0f;
    public float k = 0.0f;
    public boolean l = true;

    public fgl() {
        this.m = Build.VERSION.SDK_INT >= 28;
        this.n = null;
        this.o = Alert.DURATION_SHOW_INDEFINITELY;
        this.p = Layout.Alignment.ALIGN_NORMAL;
        this.q = axn.c;
        this.r = 0;
        this.s = false;
    }

    public final void a() {
        if (this.s) {
            TextPaint textPaint = new TextPaint(this.a);
            textPaint.set(this.a);
            this.a = textPaint;
            this.s = false;
        }
    }

    public final int hashCode() {
        int color = (((((((((((((((((((((((((((((((((this.a.getColor() + 31) * 31) + Float.floatToIntBits(this.a.getTextSize())) * 31) + (this.a.getTypeface() != null ? this.a.getTypeface().hashCode() : 0)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + this.e) * 31) + this.a.linkColor) * 31) + Float.floatToIntBits(this.a.density)) * 31) + Arrays.hashCode(this.a.drawableState)) * 31) + this.f) * 31) + this.g) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + 2139095039) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        TextUtils.TruncateAt truncateAt = this.n;
        int iHashCode = (((color + (truncateAt != null ? truncateAt.hashCode() : 0)) * 961) + this.o) * 31;
        Layout.Alignment alignment = this.p;
        int iHashCode2 = (iHashCode + (alignment != null ? alignment.hashCode() : 0)) * 31;
        axh axhVar = this.q;
        int iHashCode3 = (((iHashCode2 + (axhVar != null ? axhVar.hashCode() : 0)) * 31) + this.r) * 923521;
        CharSequence charSequence = this.h;
        return (iHashCode3 + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
    }
}
