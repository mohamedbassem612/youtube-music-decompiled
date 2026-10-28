package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbx {
    public static final awtk a = new awtk("\\S+");

    public static final void a(SpannableStringBuilder spannableStringBuilder, Object obj) {
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, 0, spannableStringBuilder.length(), 33);
        }
    }

    public static final Integer b(String str, int i) {
        String str2 = String.format("#%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        str2.getClass();
        try {
            return Integer.valueOf(Color.parseColor(str2.concat(awrc.C(str, "#", ""))));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final Integer c(acbs acbsVar) {
        try {
            String str = acbsVar.r;
            str.getClass();
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final int d(acbs acbsVar) {
        int i = acbsVar.h;
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return (i == 4 || i == 5) ? 2 : 0;
        }
        return 1;
    }

    public static final Integer e(acbs acbsVar) {
        int i;
        if (!acbsVar.j || (i = acbsVar.m) < 0 || i >= 256) {
            return null;
        }
        String str = acbsVar.k;
        str.getClass();
        return b(str, i);
    }
}
