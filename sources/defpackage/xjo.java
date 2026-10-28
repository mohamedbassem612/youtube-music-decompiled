package defpackage;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xjo extends gdk {
    private static long c;
    private long d;
    private final boolean e;
    private final xkd f;

    public xjo(String str, xkd xkdVar, boolean z) {
        super(str);
        this.f = xkdVar;
        this.e = z;
    }

    @Override // defpackage.gdk
    public final void c(String str, String str2) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            long j = xjp.a;
        } else {
            super.c(str, str2);
        }
    }

    @Override // defpackage.gdk
    public final jij d(long j) {
        jij jijVar = new jij(j, (String) null, (jij) null);
        long epochMilli = c;
        if (epochMilli == 0) {
            epochMilli = this.f.c.f().toEpochMilli() - SystemClock.elapsedRealtime();
            c = epochMilli;
        }
        this.d = epochMilli + ((Long) jijVar.c).longValue();
        return jijVar;
    }

    @Override // defpackage.gdk
    public final Map f(kro kroVar) {
        int iC;
        Map mapF = super.f(kroVar);
        if (!this.a.isEmpty() && (iC = xjl.c(this.b, this.e)) != 0) {
            xit xitVar = (xit) this.f.d.io();
            Map mapB = b();
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            for (Map.Entry entry : mapB.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str != null && str2 != null && !str.isEmpty() && !str2.isEmpty()) {
                    xjj xjjVar = (xjj) xjl.c.get(str);
                    if (xjjVar == null) {
                        xjl.b("Csi-on-Gel: Unrecognize LatencyActionInfo ".concat(String.valueOf(String.format("for key = %s", str))), new Exception(), zvn.a);
                    } else {
                        try {
                            xjjVar.a(str2, aihfVarCreateBuilder);
                        } catch (RuntimeException e) {
                            xjl.b("Csi-on-Gel: Failed to parse LatencyActionInfo ".concat(String.valueOf(String.format("for %s = %s", str, str2))), e, zvn.a);
                        }
                    }
                }
            }
            amiu amiuVar = (amiu) aihfVarCreateBuilder.build();
            xir xirVarO = xitVar.o(iC);
            xirVarO.l(this.d);
            for (jij jijVar : this.a) {
                Long l = (Long) jijVar.c;
                if (l.longValue() > 0) {
                    xirVarO.o((String) jijVar.a, l.longValue() + c);
                }
            }
            xirVarO.h(amiuVar);
        }
        return mapF;
    }
}
