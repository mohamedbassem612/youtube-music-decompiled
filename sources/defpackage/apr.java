package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apr {
    public static final yi a = new yi();

    public static final float a(int i) {
        return -i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public static final void b(View view, anq anqVar) {
        aoa aoaVarC = anqVar.c();
        amw.b("LayoutCoordinate operations are only valid when isAttached is true");
        ans ansVar = aoaVarC.h.e;
        int iL = ansVar.a.l();
        if (iL == 3) {
            if (ansVar.i.m) {
                ansVar.a(true);
            } else if (!ansVar.d) {
                ansVar.d = true;
                if (!ansVar.c) {
                    ansVar.e++;
                }
            }
        } else if (iL == 4) {
            iL = 4;
            if (ansVar.i.m) {
                ansVar.a(true);
            } else if (!ansVar.d) {
                ansVar.d = true;
                if (!ansVar.c) {
                    ansVar.e++;
                }
            }
        }
        long jE = 0;
        if (iL == 4) {
            anv anvVar = ansVar.j;
            if (!ansVar.g) {
                ansVar.g = true;
                boolean z = ansVar.f;
                ansVar.h++;
            }
        }
        while (aoaVarC != null) {
            if (aoaVarC == aoaVarC.h.d()) {
                amw.a("LayoutNode should be attached to an owner");
                throw new awmh();
            }
            jE = ape.e(jE);
            aoaVarC = null;
        }
        int iRound = Math.round(Float.intBitsToFloat((int) (jE >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jE & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}
