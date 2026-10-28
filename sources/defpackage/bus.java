package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bus {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int A;
    public final float B;
    public final int C;
    public final float D;
    public final float E;
    public final boolean F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final int L;
    public final CharSequence u;
    public final Layout.Alignment v;
    public final Layout.Alignment w;
    public final Bitmap x;
    public final float y;
    public final int z;

    static {
        bur burVar = new bur();
        burVar.d("");
        burVar.a();
        int i2 = bwp.a;
        a = "0";
        b = "h";
        c = "1";
        d = "2";
        e = "3";
        f = "i";
        g = "4";
        h = "5";
        i = "6";
        j = "7";
        k = "8";
        l = "9";
        m = "a";
        n = "b";
        o = "c";
        p = "d";
        q = "e";
        r = "f";
        s = "g";
        t = "j";
    }

    public bus(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7, int i8) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            ahno.F(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.u = SpannedString.valueOf(charSequence);
        } else {
            this.u = charSequence != null ? charSequence.toString() : null;
        }
        this.v = alignment;
        this.w = alignment2;
        this.x = bitmap;
        this.y = f2;
        this.z = i2;
        this.A = i3;
        this.B = f3;
        this.C = i4;
        this.D = f5;
        this.E = f6;
        this.F = z;
        this.G = i6;
        this.H = i5;
        this.I = f4;
        this.J = i7;
        this.K = f7;
        this.L = i8;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bus busVar = (bus) obj;
            if (TextUtils.equals(this.u, busVar.u) && this.v == busVar.v && this.w == busVar.w && ((bitmap = this.x) != null ? !((bitmap2 = busVar.x) == null || !bitmap.sameAs(bitmap2)) : busVar.x == null) && this.y == busVar.y && this.z == busVar.z && this.A == busVar.A && this.B == busVar.B && this.C == busVar.C && this.D == busVar.D && this.E == busVar.E && this.F == busVar.F && this.G == busVar.G && this.H == busVar.H && this.I == busVar.I && this.J == busVar.J && this.K == busVar.K && this.L == busVar.L) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.u, this.v, this.w, this.x, Float.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D), Float.valueOf(this.E), Boolean.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Float.valueOf(this.I), Integer.valueOf(this.J), Float.valueOf(this.K), Integer.valueOf(this.L));
    }
}
