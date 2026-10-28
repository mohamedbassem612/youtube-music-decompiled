package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsx {
    public static final lsz a;

    static {
        Uri uri = lsy.a;
        a = lta.a();
    }

    public static int a(ContentResolver contentResolver, String str, int i) {
        lsz lszVar = a;
        ltd ltdVar = (ltd) lszVar;
        ltdVar.h(contentResolver);
        ltdVar.f(contentResolver);
        ltdVar.f.lock();
        try {
            Object obj = ((ltd) lszVar).j;
            Integer numValueOf = (Integer) ((ltd) lszVar).d(((ltd) lszVar).i, str, Integer.valueOf(i), ltd.c);
            ltdVar.f.unlock();
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            String strA = ltdVar.a(contentResolver, str, null);
            if (strA != null) {
                try {
                    int i2 = Integer.parseInt(strA);
                    numValueOf = Integer.valueOf(i2);
                    i = i2;
                } catch (NumberFormatException unused) {
                }
            }
            ltdVar.g(obj, ltdVar.i, str, numValueOf, ltd.c);
            return i;
        } catch (Throwable th) {
            ltdVar.f.unlock();
            throw th;
        }
    }

    public static boolean b(ContentResolver contentResolver, String str, boolean z) {
        return a.b(contentResolver, str, z);
    }

    public static long c(ContentResolver contentResolver, long j) {
        return a.c(contentResolver, j);
    }
}
