package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbo extends bta {
    public final int c;
    public final String d;
    public final int e;
    public final bse f;
    public final int g;
    public final cnm h;
    final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public cbo(int i, Throwable th, String str, int i2, String str2, int i3, bse bseVar, int i4, cnm cnmVar, boolean z) {
        String str3;
        int i5;
        String string;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str3 = str2;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(bseVar);
            String strN = bwp.N(i4);
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(strN);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(str) ? string : a.cd(str, string, ": "), th, i2, i, str3, i5, bseVar, i4, cnmVar, SystemClock.elapsedRealtime(), z);
    }

    final cbo b(cnm cnmVar) {
        String message = getMessage();
        int i = bwp.a;
        return new cbo(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, cnmVar, this.b, this.i);
    }

    private cbo(String str, Throwable th, int i, int i2, String str2, int i3, bse bseVar, int i4, cnm cnmVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        ahno.F(z2);
        ahno.F(th != null || i2 == 3);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = bseVar;
        this.g = i4;
        this.h = cnmVar;
        this.i = z;
    }
}
