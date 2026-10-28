package defpackage;

import android.text.Spanned;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwc {
    public static final CharSequence a(String str) {
        if (!auvv.a.io().b()) {
            return str;
        }
        Spanned spannedC = aas.c(str);
        spannedC.getClass();
        return spannedC;
    }

    public static final boolean b(aidq aidqVar) {
        return aidqVar.c == 29 && qnl.aa(36);
    }

    public static final int c(int i) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 == 2) {
                return -1;
            }
            if (i2 != 3) {
                return i2 != 4 ? 0 : -2;
            }
        }
        return i3;
    }
}
