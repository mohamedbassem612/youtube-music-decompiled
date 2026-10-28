package defpackage;

import android.net.Uri;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzf implements zzi {
    public abnr a;
    public long b;
    public boolean c;
    private final mbc d;
    private final long e;
    private final String g;
    private final Map h;
    private final aboa i;
    private final tfq j;

    public abzf(tfq tfqVar, abnr abnrVar, aboa aboaVar, Map map, mbc mbcVar, long j, String str) {
        this.j = tfqVar;
        this.i = aboaVar;
        this.h = map;
        this.a = abnrVar;
        this.d = mbcVar;
        this.e = j;
        this.g = str;
    }

    private static String c(long j) {
        return String.format(Locale.US, "%.1f", Double.valueOf(j / 1000.0d));
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        Integer num = (Integer) abze.a.get(str);
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return c(this.b);
                case 2:
                    return this.g;
                case 3:
                    return true != this.c ? "pause" : "playing";
                case 4:
                    return String.valueOf(this.j.a());
                case 5:
                    return c(this.d.b() - this.e);
                case 6:
                    abnr abnrVar = this.a;
                    return abnrVar != null ? abnrVar.a() : "0";
                case 7:
                    return this.i.a();
            }
        }
        if (str.startsWith("VSS_")) {
            awmd awmdVar = (awmd) this.h.get(str.substring(4).toLowerCase(Locale.US));
            if (awmdVar != null) {
                return ((abyl) awmdVar.io()).b();
            }
        }
        return null;
    }

    @Override // defpackage.zzi
    public final String b() {
        return "VideoStats2MacroConverter";
    }
}
