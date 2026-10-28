package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhh extends lbc {
    public volatile lhf a;
    public volatile lhf b;
    public lhf c;
    public final Map d;
    public kzv e;
    public volatile boolean f;
    public volatile lhf g;
    public lhf h;
    public boolean i;
    public final Object j;

    public lhh(ldr ldrVar) {
        super(ldrVar);
        this.j = new Object();
        this.d = new ConcurrentHashMap();
    }

    @Override // defpackage.lbc
    protected final boolean f() {
        return false;
    }

    public final lhf s(kzv kzvVar) {
        if (kzvVar == null) {
            throw new NullPointerException("null reference");
        }
        Map map = this.d;
        Integer numValueOf = Integer.valueOf(kzvVar.a);
        lhf lhfVar = (lhf) map.get(numValueOf);
        if (lhfVar == null) {
            lhfVar = new lhf(null, y(kzvVar.b), L().s(), false, 0L, 0L);
            map.put(numValueOf, lhfVar);
        }
        return this.g != null ? this.g : lhfVar;
    }

    public final lhf t(boolean z) {
        a();
        o();
        lhf lhfVar = this.c;
        return (z && lhfVar == null) ? this.h : lhfVar;
    }

    public final void u(String str, lhf lhfVar, boolean z) {
        lhf lhfVar2;
        lhf lhfVar3 = this.a == null ? this.b : this.a;
        if (lhfVar.b == null) {
            lhfVar2 = new lhf(lhfVar.a, str != null ? y(str) : null, lhfVar.c, lhfVar.e, lhfVar.f, lhfVar.g);
        } else {
            lhfVar2 = lhfVar;
        }
        this.b = this.a;
        this.a = lhfVar2;
        aU().j(new lhg(this, lhfVar2, lhfVar3, SystemClock.elapsedRealtime(), z));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    public final void v(lhf lhfVar, lhf lhfVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        o();
        boolean z3 = false;
        if (lhfVar2 != null) {
            if (lhfVar2.c == lhfVar.c && Objects.equals(lhfVar2.b, lhfVar.b) && Objects.equals(lhfVar2.a, lhfVar.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.c != null) {
            z3 = true;
        }
        if (z2) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            lga.N(lhfVar, bundle2, true);
            if (lhfVar2 != null) {
                String str = lhfVar2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = lhfVar2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", lhfVar2.c);
            }
            if (z3) {
                long jA = m().b.a(j);
                if (jA > 0) {
                    L().F(bundle2, jA);
                }
            }
            if (!G().p()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z4 = lhfVar.e;
            String str3 = true != z4 ? "auto" : "app";
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z4) {
                long j3 = lhfVar.f;
                if (j3 != 0) {
                    j2 = j3;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z4) {
                long j4 = lhfVar.g;
                if (j4 != 0) {
                    jElapsedRealtime = j4;
                }
            }
            i().O(str3, "_vs", j2, jElapsedRealtime, bundle2);
        }
        if (z3) {
            x(this.c, true, j);
        }
        this.c = lhfVar;
        if (lhfVar.e) {
            this.h = lhfVar;
        }
        j().F(lhfVar);
    }

    public final void w(kzv kzvVar, Bundle bundle) {
        Bundle bundle2;
        if (!G().p() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.d.put(Integer.valueOf(kzvVar.a), new lhf(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id"), false, 0L, 0L));
    }

    public final void x(lhf lhfVar, boolean z, long j) {
        g().e(SystemClock.elapsedRealtime());
        if (!m().w(lhfVar != null && lhfVar.d, z, j) || lhfVar == null) {
            return;
        }
        lhfVar.d = false;
    }

    public final String y(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        return str2.length() > G().c(null, false) ? str2.substring(0, G().c(null, false)) : str2;
    }
}
