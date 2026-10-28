package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msn {
    static final nso a = nxy.a;

    public static boolean a(CharSequence charSequence, int i, int i2) {
        return i2 > 0 && TextUtils.isEmpty(charSequence) && msf.f(i) == TextUtils.TruncateAt.END;
    }
}
