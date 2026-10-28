package defpackage;

import app.rive.semantics.SemanticState;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddn implements cvi {
    private final int a;
    private final bwb d;
    private cvk e;
    private long f;
    private boolean i;
    private boolean j;
    private boolean k;
    private final dqp l;
    private final ddo b = new ddo(true, null, 0, "audio/mp4a-latm");
    private final bwb c = new bwb(SemanticState.Modal);
    private int h = -1;
    private long g = -1;

    public ddn(int i) {
        this.a = i;
        bwb bwbVar = new bwb(10);
        this.d = bwbVar;
        this.l = new dqp(bwbVar.b, (byte[]) null);
    }

    private final int h(cvj cvjVar) {
        cvb cvbVar;
        int i = 0;
        while (true) {
            bwb bwbVar = this.d;
            cvbVar = (cvb) cvjVar;
            cvbVar.n(bwbVar.b, 0, 10, false);
            bwbVar.P(0);
            if (bwbVar.p() != 4801587) {
                break;
            }
            bwbVar.Q(3);
            int iM = bwbVar.m();
            i += iM + 10;
            cvbVar.m(iM, false);
        }
        cvjVar.k();
        cvbVar.m(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        return i;
    }

    private final void i(cvj cvjVar) throws bsz {
        if (this.i) {
            return;
        }
        this.h = -1;
        cvjVar.k();
        long j = 0;
        int i = 0;
        if (((cvb) cvjVar).b == 0) {
            h(cvjVar);
        }
        int i2 = 0;
        while (true) {
            try {
                bwb bwbVar = this.d;
                if (cvjVar.n(bwbVar.b, 0, 2, true)) {
                    bwbVar.P(0);
                    if (!ddo.g(bwbVar.s())) {
                        break;
                    }
                    if (cvjVar.n(bwbVar.b, 0, 4, true)) {
                        dqp dqpVar = this.l;
                        dqpVar.q(14);
                        int i3 = dqpVar.i(13);
                        if (i3 <= 6) {
                            this.i = true;
                            throw new bsz("Malformed ADTS stream", null, true, 1);
                        }
                        j += (long) i3;
                        i2++;
                        if (i2 != 1000 && cvjVar.m(i3 - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i = i2;
            break;
        }
        cvjVar.k();
        if (i > 0) {
            this.h = (int) (j / ((long) i));
        } else {
            this.h = -1;
        }
        this.i = true;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.e = cvkVar;
        this.b.b(cvkVar, new dev(Integer.MIN_VALUE, 0, 1));
        cvkVar.t();
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        this.j = false;
        this.b.f();
        this.f = j2;
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        int iH = h(cvjVar);
        int i = iH;
        int i2 = 0;
        int i3 = 0;
        do {
            bwb bwbVar = this.d;
            cvb cvbVar = (cvb) cvjVar;
            cvbVar.n(bwbVar.b, 0, 2, false);
            bwbVar.P(0);
            if (ddo.g(bwbVar.s())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                cvbVar.n(bwbVar.b, 0, 4, false);
                dqp dqpVar = this.l;
                dqpVar.q(14);
                int i4 = dqpVar.i(13);
                if (i4 <= 6) {
                    i++;
                    cvjVar.k();
                    cvbVar.m(i, false);
                } else {
                    cvbVar.m(i4 - 6, false);
                    i3 += i4;
                }
            } else {
                i++;
                cvjVar.k();
                cvbVar.m(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iH < 8192);
        return false;
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        int i;
        int i2;
        this.e.getClass();
        long j = ((cvb) cvjVar).a;
        int i3 = this.a;
        if (i3 != 0 && j != -1) {
            i(cvjVar);
        }
        bwb bwbVar = this.c;
        int iA = cvjVar.a(bwbVar.b, 0, SemanticState.Modal);
        if (!this.k) {
            if (i3 == 0 || (i = this.h) <= 0) {
                this.e.z(new cvy(-9223372036854775807L, 0L));
                this.k = true;
            } else {
                long j2 = this.b.a;
                if (j2 != -9223372036854775807L) {
                    i2 = iA;
                } else if (iA == -1) {
                    i2 = -1;
                }
                if (j2 != -9223372036854775807L) {
                    this.e.z(new cva(j, this.g, (int) ((((long) i) * 8000000) / j2), i, false, true));
                    iA = i2;
                } else {
                    iA = i2;
                    this.e.z(new cvy(-9223372036854775807L, 0L));
                }
                this.k = true;
            }
        }
        if (iA == -1) {
            return -1;
        }
        bwbVar.P(0);
        bwbVar.O(iA);
        if (!this.j) {
            this.b.b = this.f;
            this.j = true;
        }
        this.b.a(bwbVar);
        return 0;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
