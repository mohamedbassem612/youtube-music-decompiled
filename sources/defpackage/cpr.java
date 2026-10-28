package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class cpr extends cpb {
    private final int o;
    private final bse p;
    private long q;
    private boolean r;

    public cpr(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, long j2, long j3, int i2, bse bseVar2) {
        super(byeVar, byiVar, bseVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = bseVar2;
    }

    @Override // defpackage.crm
    public final void b() {
        cpd cpdVarD = d();
        cpdVarD.b(0L);
        int iA = 0;
        cwj cwjVarA = cpdVarD.a(0, this.o);
        cwjVarA.b(this.p);
        try {
            byi byiVarA = this.f.a(this.q);
            bze bzeVar = this.m;
            long jB = bzeVar.b(byiVarA);
            if (jB != -1) {
                jB += this.q;
            }
            cvb cvbVar = new cvb(bzeVar, this.q, jB);
            while (true) {
                long j = this.q;
                if (iA == -1) {
                    cwjVarA.e(this.k, 1, (int) j, 0, null);
                    aua.d(this.m);
                    this.r = true;
                    return;
                }
                this.q = j + ((long) iA);
                iA = cwjVarA.a(cvbVar, Alert.DURATION_SHOW_INDEFINITELY, true);
            }
        } catch (Throwable th) {
            aua.d(this.m);
            throw th;
        }
    }

    @Override // defpackage.cpo
    public final boolean j() {
        return this.r;
    }

    @Override // defpackage.crm
    public final void a() {
    }
}
