package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfu implements zgn {
    private final apbx a;
    private final mbc b;
    private final long c;
    private final hno d;

    public zfu(hno hnoVar, apbx apbxVar, mbc mbcVar, long j) {
        this.d = hnoVar;
        this.a = apbxVar;
        this.b = mbcVar;
        this.c = j;
    }

    @Override // defpackage.zgn
    public final int a() {
        return 20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    public final String b() {
        float fA;
        int iB;
        hno hnoVar = this.d;
        if (((zhl) hnoVar.j).j.m(192, 45622250L)) {
            aehn aehnVar = (aehn) hnoVar.d.io();
            fA = aehnVar.b();
            iB = aehnVar.c();
        } else {
            twf twfVar = (twf) hnoVar.a;
            fA = twfVar.a();
            iB = twfVar.b();
        }
        if (fA == -1.0f) {
            return null;
        }
        return String.format(Locale.US, "%s:%s:%d", yno.cE(this.b, this.c), yno.cD(this.a, fA, 3), Integer.valueOf(iB));
    }

    @Override // defpackage.zgn
    public final void c(zhg zhgVar) {
        String strB = b();
        if (strB != null) {
            zhgVar.c("bat", strB);
        }
    }
}
