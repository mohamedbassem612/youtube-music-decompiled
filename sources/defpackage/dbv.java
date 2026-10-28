package defpackage;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dbv {
    public static final int a = a(2, 2, 2, 0);
    public static final int b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final boolean[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    public final List k = new ArrayList();
    public final SpannableStringBuilder l = new SpannableStringBuilder();
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    private int z;

    static {
        int iA = a(0, 0, 0, 0);
        b = iA;
        int iA2 = a(0, 0, 0, 3);
        c = new int[]{0, 0, 0, 0, 0, 2, 0};
        d = new int[]{0, 0, 0, 0, 0, 0, 2};
        e = new int[]{3, 3, 3, 3, 3, 3, 1};
        f = new boolean[]{false, false, false, true, true, true, false};
        g = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
        h = new int[]{0, 1, 2, 3, 4, 3, 4};
        i = new int[]{0, 0, 0, 0, 0, 3, 3};
        j = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
    }

    public dbv() {
        e();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public static int a(int i2, int i3, int i4, int i5) {
        int i6;
        ahno.W(i2, 4);
        ahno.W(i3, 4);
        ahno.W(i4, 4);
        ahno.W(i5, 4);
        if (i5 == 0 || i5 == 1) {
            i6 = 255;
        } else if (i5 == 2) {
            i6 = 127;
        } else if (i5 == 3) {
            i6 = 0;
        } else {
            i6 = 255;
        }
        return Color.argb(i6, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0, i4 > 1 ? 255 : 0);
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.l);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.z != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.z, length, 33);
            }
            if (this.A != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A, length, 33);
            }
            if (this.B != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.C), this.B, length, 33);
            }
            if (this.D != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.E), this.D, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void c(char c2) {
        if (c2 != '\n') {
            this.l.append(c2);
            return;
        }
        List list = this.k;
        list.add(b());
        this.l.clear();
        if (this.z != -1) {
            this.z = 0;
        }
        if (this.A != -1) {
            this.A = 0;
        }
        if (this.B != -1) {
            this.B = 0;
        }
        if (this.D != -1) {
            this.D = 0;
        }
        while (true) {
            if (list.size() < this.t && list.size() < 15) {
                this.y = list.size();
                return;
            }
            list.remove(0);
        }
    }

    public final void d() {
        this.k.clear();
        this.l.clear();
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.D = -1;
        this.y = 0;
    }

    public final void e() {
        d();
        this.m = false;
        this.n = false;
        this.o = 4;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 15;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        int i2 = b;
        this.x = i2;
        this.C = a;
        this.E = i2;
    }

    public final boolean f() {
        if (this.m) {
            return this.k.isEmpty() && this.l.length() == 0;
        }
        return true;
    }

    public final void g(boolean z, boolean z2) {
        if (this.z != -1) {
            if (!z) {
                SpannableStringBuilder spannableStringBuilder = this.l;
                spannableStringBuilder.setSpan(new StyleSpan(2), this.z, spannableStringBuilder.length(), 33);
                this.z = -1;
            }
        } else if (z) {
            this.z = this.l.length();
        }
        if (this.A == -1) {
            if (z2) {
                this.A = this.l.length();
            }
        } else {
            if (z2) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder2 = this.l;
            spannableStringBuilder2.setSpan(new UnderlineSpan(), this.A, spannableStringBuilder2.length(), 33);
            this.A = -1;
        }
    }

    public final void h(int i2, int i3) {
        if (this.B != -1 && this.C != i2) {
            SpannableStringBuilder spannableStringBuilder = this.l;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.C), this.B, spannableStringBuilder.length(), 33);
        }
        if (i2 != a) {
            this.B = this.l.length();
            this.C = i2;
        }
        if (this.D != -1 && this.E != i3) {
            SpannableStringBuilder spannableStringBuilder2 = this.l;
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.E), this.D, spannableStringBuilder2.length(), 33);
        }
        if (i3 != b) {
            this.D = this.l.length();
            this.E = i3;
        }
    }

    public final void i(int i2, int i3) {
        this.x = i2;
        this.u = i3;
    }
}
