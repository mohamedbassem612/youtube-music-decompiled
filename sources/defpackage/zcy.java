package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zcy implements crj {
    private static final zcx c = new zcq();
    private static final zcx d = new zcr();
    public final zjh a;
    public final agfr b;
    private final Map e = new HashMap();
    private final agfr f;
    private final tfq g;
    private final hed h;

    public zcy(tfq tfqVar, hed hedVar, agfr agfrVar, agfr agfrVar2) {
        this.a = new zjh(new zaz(agfrVar, 3));
        this.g = tfqVar;
        this.h = hedVar;
        this.b = agfrVar;
        this.f = agfrVar2;
    }

    private final zcs e(long j) {
        Map map = this.e;
        Long lValueOf = Long.valueOf(j);
        zcs zcsVar = (zcs) map.get(lValueOf);
        if (zcsVar != null) {
            return zcsVar;
        }
        zcs zcsVar2 = new zcs();
        map.put(lValueOf, zcsVar2);
        return zcsVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if ((r6 instanceof defpackage.zid) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.zcx f(defpackage.zcs r5, java.io.IOException r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zhm
            if (r0 == 0) goto L30
            r0 = r6
            zhm r0 = (defpackage.zhm) r0
            int r0 = r0.e
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L30
            agfr r0 = r4.b
            java.lang.Object r0 = r0.io()
            wiu r0 = (defpackage.wiu) r0
            aoqd r0 = r0.d
            akwm r0 = r0.f
            if (r0 != 0) goto L1d
            akwm r0 = defpackage.akwm.b
        L1d:
            boolean r0 = r0.aG
            if (r0 == 0) goto L53
            boolean r0 = r6 instanceof defpackage.zas
            if (r0 == 0) goto L53
            zas r6 = (defpackage.zas) r6
            long r0 = r6.d
            int r6 = (int) r0
            zcu r0 = new zcu
            r0.<init>(r4, r5, r6)
            goto L9d
        L30:
            boolean r0 = r6 instanceof defpackage.zaq
            if (r0 == 0) goto L56
            agfr r0 = r4.b
            java.lang.Object r0 = r0.io()
            wiu r0 = (defpackage.wiu) r0
            aoqd r0 = r0.d
            akwm r0 = r0.f
            if (r0 != 0) goto L44
            akwm r0 = defpackage.akwm.b
        L44:
            boolean r0 = r0.aO
            if (r0 == 0) goto L53
            zaq r6 = (defpackage.zaq) r6
            long r0 = r6.e
            int r6 = (int) r0
            zcu r0 = new zcu
            r0.<init>(r4, r5, r6)
            goto L9d
        L53:
            zcx r0 = defpackage.zcy.d
            goto L9d
        L56:
            boolean r0 = r6 instanceof defpackage.byv
            if (r0 == 0) goto L6d
            hed r1 = r4.h
            r2 = r6
            byv r2 = (defpackage.byv) r2
            agfr r3 = r4.f
            java.lang.Object r3 = r3.io()
            wja r3 = (defpackage.wja) r3
            boolean r1 = r1.r(r2, r3)
            if (r1 != 0) goto L9b
        L6d:
            boolean r1 = r6 instanceof defpackage.zav
            if (r1 != 0) goto L9b
            boolean r1 = r6 instanceof defpackage.zie
            if (r1 != 0) goto L9b
            tfq r1 = r4.g
            boolean r1 = r1.i()
            if (r1 == 0) goto L7f
            if (r0 != 0) goto L8f
        L7f:
            boolean r0 = r6 instanceof defpackage.byt
            if (r0 != 0) goto L95
            boolean r0 = r6 instanceof defpackage.byp
            if (r0 != 0) goto L9b
            boolean r0 = r6 instanceof defpackage.jsw
            if (r0 != 0) goto L9b
            boolean r6 = r6 instanceof defpackage.zid
            if (r6 != 0) goto L95
        L8f:
            zcw r0 = new zcw
            r0.<init>(r4, r5)
            goto L9d
        L95:
            zcv r0 = new zcv
            r0.<init>(r4, r5)
            goto L9d
        L9b:
            zcx r0 = defpackage.zcy.c
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcy.f(zcs, java.io.IOException):zcx");
    }

    @Override // defpackage.crj
    public final int a(int i) {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.crj
    public final void b(long j) {
        this.e.remove(Long.valueOf(j));
    }

    @Override // defpackage.crj
    public final long c(aae aaeVar) {
        zcx zcxVarF = f(e(((cnd) aaeVar.b).a), (IOException) aaeVar.c);
        zcxVarF.d();
        if (zcxVarF.e()) {
            return zcxVarF.b();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.crj
    public final yvt d(cri criVar, aae aaeVar) {
        if (criVar.a(2)) {
            long jC = f(e(((cnd) aaeVar.b).a), (IOException) aaeVar.c).c();
            if (jC != -9223372036854775807L) {
                return new yvt(2, jC, null, null, null);
            }
        }
        return null;
    }
}
