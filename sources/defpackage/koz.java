package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class koz implements lot {
    private final koq a;
    private final int b;
    private final knu c;
    private final long d;
    private final long e;

    public koz(koq koqVar, int i, knu knuVar, long j, long j2) {
        this.a = koqVar;
        this.b = i;
        this.c = knuVar;
        this.d = j;
        this.e = j2;
    }

    public static kqj b(kol kolVar, kpz kpzVar, int i) {
        kqi kqiVar = kpzVar.B;
        kqj kqjVar = kqiVar == null ? null : kqiVar.d;
        if (kqjVar == null || !kqjVar.b) {
            return null;
        }
        int[] iArr = kqjVar.d;
        if (iArr == null) {
            int[] iArr2 = kqjVar.f;
            if (iArr2 != null && lqd.n(iArr2, i)) {
                return null;
            }
        } else if (!lqd.n(iArr, i)) {
            return null;
        }
        if (kolVar.k < kqjVar.e) {
            return kqjVar;
        }
        return null;
    }

    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        kol kolVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        koq koqVar = this.a;
        if (koqVar.g()) {
            krt krtVar = krs.a().a;
            if ((krtVar == null || krtVar.b) && (kolVarB = koqVar.b(this.c)) != null) {
                Object obj = kolVarB.b;
                if (obj instanceof kpz) {
                    long j3 = this.d;
                    boolean z = j3 > 0;
                    if (krtVar != null) {
                        z &= krtVar.c;
                        kpz kpzVar = (kpz) obj;
                        boolean zL = kpzVar.L();
                        i = krtVar.d;
                        int i7 = krtVar.e;
                        int i8 = krtVar.a;
                        if (!zL || kpzVar.x()) {
                            i2 = i8;
                            i3 = i7;
                        } else {
                            kqj kqjVarB = b(kolVarB, kpzVar, this.b);
                            if (kqjVarB == null) {
                                return;
                            }
                            boolean z2 = kqjVarB.c && j3 > 0;
                            i2 = i8;
                            i3 = kqjVarB.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (lpaVar.j()) {
                        i6 = 0;
                        i5 = 0;
                    } else if (((lpf) lpaVar).c) {
                        i5 = -1;
                        i6 = 100;
                    } else {
                        Exception excE = lpaVar.e();
                        if (excE instanceof kmu) {
                            Status status = ((kmu) excE).a;
                            i4 = status.f;
                            klo kloVar = status.i;
                            if (kloVar != null) {
                                i5 = kloVar.c;
                            }
                            i6 = i4;
                        } else {
                            i4 = 101;
                        }
                        i5 = -1;
                        i6 = i4;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    int i9 = iElapsedRealtime;
                    Handler handler = koqVar.q;
                    handler.sendMessage(handler.obtainMessage(18, new kpa(new krj(this.b, i6, i5, j, j2, null, null, ((kpz) obj).x, i9), i2, i, i3)));
                }
            }
        }
    }
}
