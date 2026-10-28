package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acih {
    public final boolean a;

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    public acih(bxh bxhVar, aami aamiVar) {
        int i = aamiVar.a;
        boolean z = false;
        ahno.F(i == 6 || i == 3);
        byte[] bArr = new byte[Math.min(4, ((ByteBuffer) aamiVar.b).remaining())];
        ((ByteBuffer) aamiVar.b).asReadOnlyBuffer().get(bArr);
        dqp dqpVar = new dqp(bArr, (byte[]) null);
        atz.h(bxhVar.a);
        if (!dqpVar.u()) {
            int i2 = dqpVar.i(2);
            boolean zU = dqpVar.u();
            atz.h(bxhVar.b);
            if (zU) {
                boolean zU2 = (i2 == 3 || i2 == 0) ? true : dqpVar.u();
                dqpVar.r();
                atz.h(!bxhVar.d);
                if (dqpVar.u()) {
                    atz.h(!bxhVar.e);
                    dqpVar.r();
                }
                atz.h(bxhVar.c);
                if (i2 != 3) {
                    dqpVar.r();
                }
                dqpVar.s(bxhVar.f);
                if (i2 != 2 && i2 != 0 && !zU2) {
                    dqpVar.s(3);
                }
                if (i2 == 3 || i2 == 0 || dqpVar.i(8) != 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        this.a = z;
    }

    public acih(boolean z) {
        this.a = z;
    }

    public acih() {
        this.a = true;
    }

    public acih(vyo vyoVar) {
        anew anewVar = vyoVar.b().j;
        aojp aojpVar = (anewVar == null ? anew.a : anewVar).c;
        aojn aojnVar = (aojpVar == null ? aojp.a : aojpVar).g;
        aojnVar = aojnVar == null ? aojn.a : aojnVar;
        boolean z = aojnVar.d;
        this.a = aojnVar.e;
        boolean z2 = aojnVar.g;
        boolean z3 = aojnVar.k;
        long j = aojnVar.l;
        long j2 = aojnVar.m;
        boolean z4 = aojnVar.p;
    }
}
