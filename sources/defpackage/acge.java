package defpackage;

import android.text.TextUtils;
import java.util.UUID;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acge {
    public final acgc g;
    public final acgc h;
    public final String i;
    public final int j;

    public acge(long j, long j2, int i, String str) {
        ahno.F(j <= j2);
        this.g = new acgc(this, acgd.a, j);
        this.h = new acgc(this, acgd.b, j2);
        this.j = i;
        this.i = TextUtils.isEmpty(str) ? UUID.randomUUID().toString() : str;
    }

    public static acgc n(long j) {
        return new acge(j, j, Integer.MIN_VALUE, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).g;
    }

    public final long k() {
        return this.h.b;
    }

    public final long l() {
        return this.g.b;
    }

    public final acgb m() {
        return acgb.a(this.g.b, this.h.b);
    }

    public final boolean o(long j) {
        if (j >= l()) {
            return j < k() || (j == k() && l() == k());
        }
        return false;
    }

    public final String toString() {
        String string = Long.toString(l());
        String string2 = Long.toString(k());
        long jL = l();
        long jK = k();
        StringBuilder sb = new StringBuilder("Interval[");
        sb.append(string);
        sb.append(", ");
        sb.append(string2);
        sb.append(jL == jK ? "]" : ")");
        return sb.toString();
    }
}
