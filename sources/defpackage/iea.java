package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iea implements Callable {
    public ieb a;
    final /* synthetic */ ied b;
    private final ListenableFuture c;
    private final ListenableFuture d;

    public iea(ied iedVar, ieb iebVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        this.b = iedVar;
        this.a = iebVar;
        this.c = listenableFuture;
        this.d = listenableFuture2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    public final void a(ieg iegVar, wgi wgiVar, boolean z, boolean z2) {
        ieg iegVar2;
        boolean z3;
        wgi wgiVar2;
        boolean z4;
        boolean z5;
        int i;
        agrx agrxVar = agso.a;
        if (!z) {
            if (iegVar != null) {
                this.b.i.d("RESTORE_LOCAL", false);
            } else {
                iegVar = null;
            }
            ieg iegVar3 = iegVar;
            if (wgiVar != null) {
                this.b.i.d("RESTORE", false);
            } else {
                wgiVar = null;
            }
            wgi wgiVar3 = wgiVar;
            if (iegVar != null && !iegVar.a.isEmpty()) {
                iegVar = iegVar3;
            } else if (wgiVar3 == null) {
                ((icq) this.b.h.io()).i();
            }
        }
        if (iegVar != null) {
            iegVar2 = iegVar;
            if (iegVar.a.isEmpty()) {
                z3 = true;
            }
            if (wgiVar != null) {
                wgiVar2 = wgiVar;
                if (ied.m(wgiVar)) {
                    z4 = true;
                }
                ied iedVar = this.b;
                icq icqVar = (icq) iedVar.h.io();
                z5 = !z3 && z4;
                if (z) {
                    i = 17;
                } else if (z2) {
                    i = 14;
                } else if (z5) {
                    i = 15;
                } else {
                    i = 16;
                }
                icqVar.q(i, 2);
                iedVar.k.kk(new idb(false, false, iegVar2, wgiVar2, iedVar.s.l(134, 45849000L, false)));
                iedVar.c();
            }
            wgiVar2 = null;
            z4 = false;
            ied iedVar2 = this.b;
            icq icqVar2 = (icq) iedVar2.h.io();
            if (z3) {
            }
            if (z) {
                i = 17;
            } else if (z2) {
                i = 14;
            } else if (z5) {
                i = 15;
            } else {
                i = 16;
            }
            icqVar2.q(i, 2);
            iedVar2.k.kk(new idb(false, false, iegVar2, wgiVar2, iedVar2.s.l(134, 45849000L, false)));
            iedVar2.c();
        }
        iegVar2 = null;
        z3 = false;
        if (wgiVar != null) {
            wgiVar2 = wgiVar;
            if (ied.m(wgiVar)) {
                z4 = true;
            }
            ied iedVar3 = this.b;
            icq icqVar3 = (icq) iedVar3.h.io();
            if (z3) {
            }
            if (z) {
                i = 17;
            } else if (z2) {
                i = 14;
            } else if (z5) {
                i = 15;
            } else {
                i = 16;
            }
            icqVar3.q(i, 2);
            iedVar3.k.kk(new idb(false, false, iegVar2, wgiVar2, iedVar3.s.l(134, 45849000L, false)));
            iedVar3.c();
        }
        wgiVar2 = null;
        z4 = false;
        ied iedVar4 = this.b;
        icq icqVar4 = (icq) iedVar4.h.io();
        if (z3) {
        }
        if (z) {
            i = 17;
        } else if (z2) {
            i = 14;
        } else if (z5) {
            i = 15;
        } else {
            i = 16;
        }
        icqVar4.q(i, 2);
        iedVar4.k.kk(new idb(false, false, iegVar2, wgiVar2, iedVar4.s.l(134, 45849000L, false)));
        iedVar4.c();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0129  */
    /* JADX WARN: Code duplicated, block: B:33:0x012b  */
    /* JADX WARN: Code duplicated, block: B:39:0x017e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01da  */
    /* JADX WARN: Code duplicated, block: B:55:0x0215  */
    /* JADX WARN: Code duplicated, block: B:56:0x021b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0231  */
    /* JADX WARN: Code duplicated, block: B:68:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x025f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0261  */
    /* JADX WARN: Code duplicated, block: B:75:0x0275  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015f, code lost:
    
        if (r19 > r17) goto L37;
     */
    /* JADX WARN: Type inference failed for: r15v8, types: [hyz, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iea.call():java.lang.Object");
    }
}
