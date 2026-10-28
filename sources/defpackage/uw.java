package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uw extends ss {
    static {
        sb sbVar = new sb("VisibilityType");
        rz rzVar = new rz("notPlatformSurfaceable");
        rzVar.b(2);
        sbVar.c(rzVar.a());
        sj sjVar = new sj("packageName");
        sjVar.b(1);
        sbVar.c(sjVar.a());
        avju avjuVar = new avju("sha256Cert");
        avjuVar.p(1);
        sbVar.c(avjuVar.q());
        sg sgVar = new sg("role");
        sgVar.b(1);
        sbVar.c(sgVar.a());
        sg sgVar2 = new sg("permission");
        sgVar2.b(1);
        sbVar.c(sgVar2.a());
        sbVar.a();
    }

    public static Set q(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        afx afxVar = new afx(jArr.length);
        for (long j : jArr) {
            afxVar.add(Integer.valueOf((int) j));
        }
        return afxVar;
    }
}
