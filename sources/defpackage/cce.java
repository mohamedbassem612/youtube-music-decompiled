package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cce implements bvs {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cce(int i) {
        this.$cid = i;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        long jB;
        cgc cgcVar;
        switch (this.$cid) {
            case 0:
                ((btf) obj).o();
                break;
            case 1:
                int i = ccm.I;
                ((btf) obj).k(new cbo(2, new cct(1), null, 1003, null, -1, null, 4, null, false));
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                cgx cgxVar = (cgx) obj;
                chd chdVar = cgxVar.b;
                if (cgxVar.equals(chdVar.a) && chdVar.c != null) {
                    cha chaVar = chdVar.d;
                    int i2 = chaVar.d;
                    if (i2 != -1) {
                        long j = chaVar.e.e / i2;
                        cgo cgoVar = chdVar.l;
                        cgoVar.getClass();
                        jB = bwp.B(j, cgoVar.a());
                    } else {
                        jB = -9223372036854775807L;
                    }
                    chdVar.c.j(chdVar.d.e.e, bwp.F(jB), SystemClock.elapsedRealtime() - chdVar.j);
                    break;
                }
                break;
            case 14:
                cgx cgxVar2 = (cgx) obj;
                cgc cgcVar2 = cgxVar2.b.c;
                if (cgcVar2 != null) {
                    cft cftVar = cgxVar2.a;
                    cgcVar2.l(new cri(cftVar.a, cftVar.b, cftVar.c, cftVar.d, cftVar.e));
                }
                break;
            case 15:
                cgx cgxVar3 = (cgx) obj;
                chd chdVar2 = cgxVar3.b;
                if (cgxVar3.equals(chdVar2.a) && (cgcVar = chdVar2.c) != null && chdVar2.i) {
                    cgcVar.d();
                    break;
                }
                break;
            case 16:
                cgx cgxVar4 = (cgx) obj;
                chd chdVar3 = cgxVar4.b;
                if (cgxVar4.equals(chdVar3.a) && chdVar3.g) {
                    chdVar3.h = true;
                    break;
                }
                break;
            default:
                cgc cgcVar3 = ((chd) ((qcb) obj).a).c;
                if (cgcVar3 != null) {
                    cgcVar3.a();
                }
                break;
        }
    }
}
