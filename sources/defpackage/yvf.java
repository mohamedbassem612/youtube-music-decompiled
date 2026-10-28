package defpackage;

import android.content.Context;
import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvf implements yvj {
    public yvf(Context context, awmd awmdVar, aaqc aaqcVar) {
        agke agkeVar = agpi.a;
        zkf.d(awmdVar);
        tym.I(context);
        int i = zic.a;
        new yvk(aaqcVar, null, null, this, EnumSet.noneOf(ywp.class));
    }

    public static final boolean b() {
        try {
            return "L1".equals(cki.r(brt.d).c("securityLevel"));
        } catch (cko unused) {
            return false;
        }
    }

    @Override // defpackage.yvj
    public final /* synthetic */ void jy(agke agkeVar, String str) {
    }
}
