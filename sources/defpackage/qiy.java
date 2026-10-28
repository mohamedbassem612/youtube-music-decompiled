package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qiy extends qjl {
    private final Random c;
    private final qjj d;
    private final qiv e;
    private final ahbw f;

    public qiy(axhi axhiVar, qjj qjjVar, Random random, qiv qivVar, ahbw ahbwVar) {
        super(qjjVar.c > 0, axhiVar);
        this.c = random;
        this.d = qjjVar;
        this.e = qivVar;
        this.f = ahbwVar;
    }

    @Override // defpackage.qjl
    public final axhi b(qjj qjjVar) {
        return this.a ? f(qjjVar) : e();
    }

    @Override // defpackage.qjl
    public final qjj d(String str) {
        qjj qjjVar = this.d;
        if (!ahno.aa(str)) {
            qiv qivVar = this.e;
            long epochMilli = this.f.a().toEpochMilli() - qivVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = qivVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = qivVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                qivVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * qivVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = qivVar.a;
            short[] sArr4 = qivVar.b;
            int i4 = (i3 + cCharAt) & 255;
            int i5 = length & 255;
            int iMin = Math.min((int) sArr3[i4], (int) sArr4[i5]);
            int i6 = iMin + 1;
            short sMin = (short) Math.min(32767, i6);
            if (sArr3[i4] == iMin) {
                sArr3[i4] = sMin;
            }
            if (sArr4[i5] == iMin) {
                sArr4[i5] = sMin;
            }
            double dSqrt = i6;
            if (i6 < 50) {
                dSqrt = Math.sqrt(dSqrt);
            }
            qjjVar = new qjj((int) (((double) qjjVar.c) / dSqrt), qjjVar.d);
        }
        return !qjjVar.c(this.c.nextDouble()) ? qjj.b : qjjVar;
    }

    @Override // defpackage.qjl
    public final axhi f(qjj qjjVar) {
        if (qjjVar == null || qjjVar.equals(this.d)) {
            return this.b;
        }
        aihf aihfVarCreateBuilder = axhi.a.createBuilder();
        int iBt = a.bt(this.b.e);
        if (iBt == 0) {
            iBt = 1;
        }
        aihfVarCreateBuilder.copyOnWrite();
        axhi axhiVar = (axhi) aihfVarCreateBuilder.instance;
        axhiVar.e = iBt - 1;
        axhiVar.b |= 2;
        qjjVar.g(aihfVarCreateBuilder);
        return (axhi) aihfVarCreateBuilder.build();
    }
}
