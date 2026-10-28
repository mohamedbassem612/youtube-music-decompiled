package defpackage;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aamm {
    public final aaml a;
    public final aaml b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    private final aaml j;

    public aamm(aaml aamlVar, aaml aamlVar2, boolean z, boolean z2) {
        long j;
        aaml aamlVar3 = aamlVar == null ? aamlVar2 : aamlVar;
        aamlVar3.getClass();
        this.i = aamlVar3.o;
        this.j = aamlVar3;
        this.a = aamlVar;
        this.b = aamlVar2;
        this.e = z;
        this.f = z2;
        if (aamlVar == null) {
            aamlVar = null;
            j = 0;
        } else {
            j = aamlVar.e;
        }
        this.c = j + (aamlVar2 == null ? 0L : aamlVar2.e);
        this.d = (aamlVar == null ? 0L : aamlVar.b()) + (aamlVar2 != null ? aamlVar2.b() : 0L);
        this.g = aamlVar3.m;
        String str = aamlVar3.m;
        boolean z3 = false;
        if (!TextUtils.isEmpty(str) && !str.startsWith("0000-0000")) {
            z3 = true;
        }
        this.h = z3;
    }

    public static aamm e(String str, aohq aohqVar) {
        aaml aamlVarA = null;
        aaml aamlVarA2 = null;
        for (aqdp aqdpVar : aohqVar.getStreamsProgress()) {
            alaw alawVar = (alaw) wjr.F(aqdpVar.g.G(), alaw.b);
            if (alawVar == null) {
                return null;
            }
            wgs wgsVar = new wgs(alawVar, str, false, null);
            int iAV = a.aV(aqdpVar.e);
            if (iAV == 0) {
                iAV = 1;
            }
            int i = iAV - 1;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (aamlVarA == null) {
                        aamk aamkVarE = aaml.e();
                        aamkVarE.e(wgsVar);
                        aamkVarE.c(aqdpVar.c);
                        aamkVarE.b(false);
                        aamkVarE.d(true);
                        aamlVarA = aamkVarE.a();
                    }
                }
            } else if (aamlVarA2 == null) {
                aamk aamkVarE2 = aaml.e();
                aamkVarE2.e(wgsVar);
                aamkVarE2.c(aqdpVar.c);
                aamkVarE2.b(true);
                aamkVarE2.d(true);
                aamlVarA2 = aamkVarE2.a();
            }
        }
        return new aamm(aamlVarA, aamlVarA2, true, false);
    }

    public final wgs a() {
        aaml aamlVar = this.b;
        if (aamlVar != null) {
            return aamlVar.c;
        }
        return null;
    }

    public final wgs b(List list, boolean z) {
        aaml aamlVar = this.b;
        if (aamlVar != null && aamlVar.i() && aamlVar.j(list, z)) {
            return aamlVar.c;
        }
        return null;
    }

    public final wgs c() {
        aaml aamlVar = this.a;
        if (aamlVar != null) {
            return aamlVar.c;
        }
        return null;
    }

    public final wgs d(List list, boolean z) {
        aaml aamlVar = this.a;
        if (aamlVar != null && aamlVar.i() && aamlVar.j(list, z)) {
            return aamlVar.c;
        }
        return null;
    }

    public final String f() {
        return this.j.g();
    }
}
