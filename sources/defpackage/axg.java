package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axg {
    public static final axh a;
    public static final axg b;
    public static final axg c;
    private static final String d;
    private static final String e;
    private final boolean f;
    private final axh g;

    static {
        axh axhVar = axn.c;
        a = axhVar;
        d = "\u200e";
        e = "\u200f";
        b = new axg(false, axhVar);
        c = new axg(true, axhVar);
    }

    public axg(boolean z, axh axhVar) {
        this.f = z;
        this.g = axhVar;
    }

    public static axg a() {
        return aie.g(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1, a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    public final String b(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        boolean z = false;
        boolean zA = this.g.a(str, 0, str.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zA2 = (zA ? axn.b : axn.a).a(str, 0, str.length());
        boolean z2 = this.f;
        String str3 = "";
        if (z2) {
            if (z2 || (zA2 && new axf(str).b() != -1)) {
                str2 = "";
            } else {
                str2 = e;
            }
        } else if (zA2 || new axf(str).b() == 1) {
            str2 = d;
        } else {
            zA2 = false;
            if (z2) {
                str2 = "";
            } else {
                str2 = "";
            }
        }
        spannableStringBuilder.append((CharSequence) str2);
        if (zA != z2) {
            spannableStringBuilder.append(true != zA ? (char) 8234 : (char) 8235);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        boolean zA3 = (zA ? axn.b : axn.a).a(str, 0, str.length());
        if (!z2) {
            if (zA3 || new axf(str).c() == 1) {
                str3 = d;
            }
            spannableStringBuilder.append((CharSequence) str3);
            return spannableStringBuilder.toString();
        }
        z = zA3;
        if (z2 && (!z || new axf(str).c() == -1)) {
            str3 = e;
        }
        spannableStringBuilder.append((CharSequence) str3);
        return spannableStringBuilder.toString();
    }
}
