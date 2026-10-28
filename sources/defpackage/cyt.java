package defpackage;

import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyt extends cxp {
    private nzd b;
    private final bwb a = new bwb();
    private final dqp c = new dqp((byte[]) null);

    @Override // defpackage.cxp
    protected final bsx b(cxn cxnVar, ByteBuffer byteBuffer) {
        bsw cysVar;
        long j;
        nzd nzdVar = this.b;
        if (nzdVar == null || cxnVar.a != nzdVar.f()) {
            nzd nzdVar2 = new nzd(cxnVar.timeUs);
            this.b = nzdVar2;
            nzdVar2.a(cxnVar.timeUs - cxnVar.a);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        bwb bwbVar = this.a;
        bwbVar.N(bArrArray, iLimit);
        dqp dqpVar = this.c;
        dqpVar.p(bArrArray, iLimit);
        dqpVar.s(39);
        long jI = dqpVar.i(1);
        long jI2 = dqpVar.i(32);
        dqpVar.s(20);
        int i = dqpVar.i(12);
        int i2 = dqpVar.i(8);
        bwbVar.Q(14);
        long j2 = (jI << 32) | jI2;
        if (i2 == 0) {
            cysVar = new cys();
        } else if (i2 == 255) {
            long jW = bwbVar.w();
            int i3 = i - 4;
            bwbVar.K(new byte[i3], 0, i3);
            cysVar = new cyr(jW, j2);
        } else if (i2 == 4) {
            int iN = bwbVar.n();
            ArrayList arrayList = new ArrayList(iN);
            for (int i4 = 0; i4 < iN; i4++) {
                bwbVar.w();
                int iN2 = bwbVar.n() & SemanticState.Focused;
                ArrayList arrayList2 = new ArrayList();
                if (iN2 == 0) {
                    int iN3 = bwbVar.n();
                    int i5 = iN3 & 64;
                    int i6 = iN3 & 32;
                    if (i5 != 0) {
                        bwbVar.w();
                    } else {
                        int iN4 = bwbVar.n();
                        ArrayList arrayList3 = new ArrayList(iN4);
                        for (int i7 = 0; i7 < iN4; i7++) {
                            bwbVar.n();
                            bwbVar.w();
                            arrayList3.add(new buv());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (i6 != 0) {
                        bwbVar.n();
                        bwbVar.w();
                    }
                    bwbVar.s();
                    bwbVar.n();
                    bwbVar.n();
                }
                arrayList.add(new nj(arrayList2));
            }
            cysVar = new cys(arrayList);
        } else if (i2 == 5) {
            nzd nzdVar3 = this.b;
            bwbVar.w();
            int iN5 = bwbVar.n() & SemanticState.Focused;
            List list = Collections.EMPTY_LIST;
            if (iN5 == 0) {
                int iN6 = bwbVar.n();
                boolean z = (iN6 & 64) != 0;
                int i8 = iN6 & 32;
                boolean z2 = (iN6 & 16) != 0;
                long jD = (!z || z2) ? -9223372036854775807L : cyv.d(bwbVar, j2);
                if (!z) {
                    int iN7 = bwbVar.n();
                    ArrayList arrayList4 = new ArrayList(iN7);
                    int i9 = 0;
                    while (i9 < iN7) {
                        bwbVar.n();
                        nzdVar3.b(!z2 ? cyv.d(bwbVar, j2) : -9223372036854775807L);
                        arrayList4.add(new buv());
                        i9++;
                        z2 = z2;
                    }
                    list = arrayList4;
                }
                if (i8 != 0) {
                    bwbVar.n();
                    bwbVar.w();
                }
                bwbVar.s();
                bwbVar.n();
                bwbVar.n();
                j = jD;
            } else {
                j = -9223372036854775807L;
            }
            cysVar = new cyu(j, nzdVar3.b(j), list);
        } else if (i2 != 6) {
            cysVar = null;
        } else {
            nzd nzdVar4 = this.b;
            long jD2 = cyv.d(bwbVar, j2);
            cysVar = new cyv(jD2, nzdVar4.b(jD2));
        }
        return cysVar == null ? new bsx(-9223372036854775807L, new bsw[0]) : new bsx(-9223372036854775807L, cysVar);
    }
}
