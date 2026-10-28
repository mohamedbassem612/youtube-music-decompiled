package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lba extends lbb {
    public final Map a;
    public final Map b;
    public long c;

    public lba(ldr ldrVar) {
        super(ldrVar);
        this.b = new afv();
        this.a = new afv();
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            aT().c.a("Ad unit id must be a non-empty string");
        } else {
            aU().j(new laz(this, str, j, 0));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            aT().c.a("Ad unit id must be a non-empty string");
        } else {
            aU().j(new laz(this, str, j, 2));
        }
    }

    public final void c(long j, lhf lhfVar) {
        if (lhfVar == null) {
            aT().k.a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            aT().k.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        lga.N(lhfVar, bundle, true);
        i().N("am", "_xa", bundle);
    }

    public final void d(String str, long j, lhf lhfVar) {
        if (lhfVar == null) {
            aT().k.a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            aT().k.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        lga.N(lhfVar, bundle, true);
        i().N("am", "_xu", bundle);
    }

    public final void e(long j) {
        lhf lhfVarT = l().t(false);
        Map map = this.a;
        for (String str : map.keySet()) {
            d(str, j - ((Long) map.get(str)).longValue(), lhfVarT);
        }
        if (!map.isEmpty()) {
            c(j - this.c, lhfVarT);
        }
        f(j);
    }

    public final void f(long j) {
        Map map = this.a;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j));
        }
        if (map.isEmpty()) {
            return;
        }
        this.c = j;
    }
}
