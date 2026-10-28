package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xjs extends gdk {
    public final boolean c;
    public int d;
    private final awmd e;
    private long f;
    private long g;
    private final Map h;
    private amiu i;
    private final mbc j;

    public xjs(String str, awmd awmdVar, mbc mbcVar, tqj tqjVar) {
        super(str);
        this.e = awmdVar;
        int i = tqr.a;
        boolean zK = tqjVar.k(1073814159);
        this.c = zK;
        this.d = xjl.c(str, zK);
        this.h = new HashMap();
        this.j = mbcVar;
        this.i = amiu.a;
    }

    @Override // defpackage.gdk
    public final void c(String str, String str2) {
        super.c(str, str2);
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return;
        }
        amiu amiuVar = this.i;
        agkj agkjVar = xjl.c;
        if (agkjVar.containsKey(str)) {
            aihf builder = amiuVar.toBuilder();
            try {
                ((xjj) agkjVar.get(str)).a(str2, builder);
                amiuVar = (amiu) builder.build();
            } catch (RuntimeException e) {
                xjl.b("Csi-on-Gel: Failed to parse LatencyActionInfo ".concat(String.valueOf(String.format("for key = %s and value = %s", str, str2))), e, zvn.a);
            }
        } else {
            xjl.b("Csi-on-Gel: Unrecognize LatencyActionInfo ".concat(String.valueOf(String.format("for key = %s", str))), new Exception(), zvn.a);
        }
        this.i = amiuVar;
    }

    @Override // defpackage.gdk
    public final jij d(long j) {
        jij jijVar = new jij(j, (String) null, (jij) null);
        mbc mbcVar = this.j;
        long epochMilli = mbcVar.f().toEpochMilli() - SystemClock.elapsedRealtime();
        this.g = epochMilli;
        this.f = epochMilli + ((Long) jijVar.c).longValue();
        return jijVar;
    }

    @Override // defpackage.gdk
    public final boolean e(jij jijVar, long j, String... strArr) {
        boolean zE = super.e(jijVar, j, strArr);
        if (!zE || j <= 0) {
            return zE;
        }
        this.h.put(strArr[0], Long.valueOf(j + this.g));
        return true;
    }

    @Override // defpackage.gdk
    public final Map f(kro kroVar) {
        Map mapF = super.f(kroVar);
        int i = this.d;
        if (i != 0) {
            Map map = this.h;
            if (!map.isEmpty()) {
                xir xirVarO = ((xit) this.e.io()).o(i);
                xirVarO.l(this.f);
                for (String str : map.keySet()) {
                    xirVarO.o(str, ((Long) map.get(str)).longValue());
                }
                xirVarO.h(this.i);
            }
        }
        return mapF;
    }
}
