package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmx {
    public final acqz a;
    public volatile int b = 1;
    public final hno c;
    private final abvk d;
    private final acmn e;
    private final Context f;

    public acmx(acqz acqzVar, abvk abvkVar, hno hnoVar, acmn acmnVar, Context context) {
        acqzVar.getClass();
        this.a = acqzVar;
        abvkVar.getClass();
        this.d = abvkVar;
        hnoVar.getClass();
        this.c = hnoVar;
        acmnVar.getClass();
        this.e = acmnVar;
        context.getClass();
        this.f = context;
    }

    public final void a(boolean z) {
        this.b = 3;
        e(z ? new acqy(4, false) : new acqy(0, false));
    }

    public final void b() {
        this.b = 2;
        d(new acqy(0, false));
    }

    public final void c(boolean z) {
        e(new acqy(2, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r1 >= 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.acqy r4) {
        /*
            r3 = this;
            acqz r0 = r3.a
            int r1 = r0.Q
            if (r1 <= 0) goto L39
            int r1 = r1 + (-1)
            boolean r2 = r0.am
            if (r2 == 0) goto L21
        Lc:
            acqh r2 = r0.ag
            if (r2 == 0) goto L1f
            if (r1 < 0) goto L1f
            acra r2 = r2.L(r1)
            if (r2 == 0) goto L1f
            boolean r2 = r2.c
            if (r2 != 0) goto L1f
            int r1 = r1 + (-1)
            goto Lc
        L1f:
            if (r1 < 0) goto L39
        L21:
            ijt r3 = r0.aq
            r3.b()
            r0.T = r4
            com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView r3 = r0.y
            boolean r4 = r0.T()
            r3.aL(r4)
            r0.R = r1
            com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView r3 = r0.y
            r3.aj(r1)
            goto L40
        L39:
            abvk r3 = r3.d
            r0 = 0
            r3.af(r0)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmx.d(acqy):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0031 A[PHI: r1
      0x0031: PHI (r1v2 int) = (r1v1 int), (r1v3 int), (r1v3 int) binds: [B:3:0x0008, B:17:0x0029, B:19:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public final void e(acqy acqyVar) {
        acqh acqhVar;
        acqh acqhVar2;
        acqz acqzVar = this.a;
        int i = acqzVar.Q + 1;
        if (acqzVar.am) {
            while (true) {
                acqh acqhVar3 = acqzVar.ag;
                if (acqhVar3 == null || i > acqhVar3.C()) {
                    break;
                }
                acqh acqhVar4 = acqzVar.ag;
                acra acraVarL = acqhVar4 == null ? null : acqhVar4.L(i);
                if (acraVarL == null || acraVarL.c) {
                    break;
                } else {
                    i++;
                }
            }
            acqh acqhVar5 = acqzVar.ag;
            if (acqhVar5 == null || i <= acqhVar5.C()) {
                acqhVar = acqzVar.ag;
                if (acqhVar == null && i <= acqhVar.C()) {
                    acqzVar.aq.b();
                    acqzVar.T = acqyVar;
                    acqzVar.y.aL(acqzVar.T());
                    acqzVar.R = i;
                    acqzVar.y.aj(i);
                    return;
                }
                if (acqzVar.Q() && !acqzVar.b.m) {
                    acqzVar.aq.b();
                    acqhVar2 = acqzVar.ag;
                    if (acqhVar2 != null || i > acqhVar2.z()) {
                        return;
                    }
                    acqzVar.T = acqyVar;
                    acqzVar.y.aj(i);
                    return;
                }
            }
        } else {
            acqhVar = acqzVar.ag;
            if (acqhVar == null) {
            }
            if (acqzVar.Q()) {
                acqzVar.aq.b();
                acqhVar2 = acqzVar.ag;
                if (acqhVar2 != null) {
                    return;
                } else {
                    return;
                }
            }
        }
        if (twb.c(this.f)) {
            return;
        }
        this.e.j();
    }
}
