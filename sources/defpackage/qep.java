package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qep {
    public final mbc a;
    public final String b;
    public final awmd c;
    public final oml d;
    private final Context e;
    private BatteryManager f;

    public qep(String str, oml omlVar, mbc mbcVar, awmd awmdVar, Context context) {
        this.b = str;
        this.d = omlVar;
        this.a = mbcVar;
        this.c = awmdVar;
        this.e = context;
    }

    public static boolean b(qfa qfaVar, qfa qfaVar2) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        if (Objects.equals(qfaVar.d, qfaVar2.d) && Objects.equals(qfaVar.e, qfaVar2.e) && (l = qfaVar.b) != null && (l2 = qfaVar.c) != null && (l3 = qfaVar2.b) != null && (l4 = qfaVar2.c) != null) {
            long jLongValue = l3.longValue() - l.longValue();
            long jLongValue2 = l4.longValue() - l2.longValue();
            if (jLongValue2 > 0) {
                long jAbs = Math.abs(jLongValue - jLongValue2);
                if (jAbs >= 25) {
                    if (jAbs / jLongValue2 <= 3.472222222222222E-5d) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final synchronized BatteryManager a() {
        BatteryManager batteryManager;
        batteryManager = this.f;
        if (batteryManager == null) {
            batteryManager = (BatteryManager) this.e.getSystemService(BatteryManager.class);
            this.f = batteryManager;
        }
        return batteryManager;
    }
}
