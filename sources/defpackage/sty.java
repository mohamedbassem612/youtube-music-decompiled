package defpackage;

import android.content.Intent;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sty implements sxt {
    final /* synthetic */ swe a;
    private final byte[] b;

    public sty(swe sweVar, byte[] bArr) {
        this.a = sweVar;
        this.b = bArr;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        if (i != 1900) {
            return false;
        }
        if (i2 == -1) {
            swe sweVar = this.a;
            ?? r7 = sweVar.f;
            for (yhi yhiVar : r7) {
                vrf vrfVar = (vrf) yhiVar.b;
                ((vwt) vrfVar.b).U();
                ?? r2 = vrfVar.a;
                aror arorVar = (aror) yhiVar.a;
                r2.c(arorVar.c == 3 ? (ajwo) arorVar.d : ajwo.a, null);
                sweVar.c(this.b, 3);
            }
            r7.clear();
            return false;
        }
        if (i2 == 0) {
            swe sweVar2 = this.a;
            ?? r8 = sweVar2.f;
            Iterator it = r8.iterator();
            while (it.hasNext()) {
                ((vwt) ((vrf) ((yhi) it.next()).b).b).U();
                sweVar2.c(this.b, 4);
            }
            r8.clear();
            return false;
        }
        if (i2 != 1) {
            return false;
        }
        swe sweVar3 = this.a;
        ?? r9 = sweVar3.f;
        for (yhi yhiVar2 : r9) {
            ?? r3 = ((vrf) yhiVar2.b).a;
            aror arorVar2 = (aror) yhiVar2.a;
            r3.c(arorVar2.e == 5 ? (ajwo) arorVar2.f : ajwo.a, null);
            sweVar3.c(this.b, 5);
        }
        r9.clear();
        return false;
    }
}
