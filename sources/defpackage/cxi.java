package defpackage;

import android.util.Pair;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxi implements cvi {
    private final /* synthetic */ int $cid;
    private final cvi a;
    private final cvi b;
    private cvk c;
    private cvi d;
    private Pair e;

    public cxi(int i, int i2) {
        this.$cid = i2;
        this.a = new cwb(65496, 2, "image/jpeg");
        this.b = i == 0 ? new cxj() : null;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return this.$cid != 0 ? agpi.a : agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        int i = this.$cid;
        this.c = cvkVar;
        if (i != 0) {
            if (this.b == null) {
                cvi cviVar = this.a;
                this.d = cviVar;
                cviVar.b(cvkVar);
                return;
            }
            return;
        }
        if (this.b == null) {
            cvi cviVar2 = this.a;
            this.d = cviVar2;
            cviVar2.b(cvkVar);
        }
    }

    @Override // defpackage.cvi
    public final void c() {
        cvi cviVar;
        if (this.$cid == 0 || (cviVar = this.b) == null) {
            return;
        }
        cviVar.c();
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        int i = this.$cid;
        cvi cviVar = this.d;
        if (i != 0) {
            if (cviVar != null) {
                cviVar.d(j, j2);
                return;
            } else {
                this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                return;
            }
        }
        if (cviVar != null) {
            cviVar.d(j, j2);
        } else {
            this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        int i = this.$cid;
        cvi cviVar = this.b;
        if (i != 0) {
            if (cviVar != null && bcy.e(cvjVar, true)) {
                return true;
            }
            cvjVar.k();
            return bcy.e(cvjVar, false);
        }
        if (cviVar != null && cviVar.e(cvjVar)) {
            return true;
        }
        cvjVar.k();
        return this.a.e(cvjVar);
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        int i = this.$cid;
        cvi cviVar = this.d;
        if (i != 0) {
            if (cviVar == null) {
                cvi cviVar2 = this.b;
                cviVar2.getClass();
                if (!bcy.e(cvjVar, true)) {
                    cviVar2 = this.a;
                }
                this.d = cviVar2;
                cvjVar.k();
                Pair pair = this.e;
                if (pair != null) {
                    this.d.d(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                    this.e = null;
                }
                cvi cviVar3 = this.d;
                cvk cvkVar = this.c;
                cvkVar.getClass();
                cviVar3.b(cvkVar);
            }
            return this.d.g(cvjVar, qhaVar);
        }
        if (cviVar == null) {
            cvi cviVar4 = this.b;
            cviVar4.getClass();
            if (!cviVar4.e(cvjVar)) {
                cviVar4 = this.a;
            }
            this.d = cviVar4;
            cvjVar.k();
            Pair pair2 = this.e;
            if (pair2 != null) {
                this.d.d(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                this.e = null;
            }
            cvi cviVar5 = this.d;
            cvk cvkVar2 = this.c;
            cvkVar2.getClass();
            cviVar5.b(cvkVar2);
        }
        return this.d.g(cvjVar, qhaVar);
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    public cxi(int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = new cwb(-1, -1, "image/heif");
        this.b = i != 0 ? null : new cxh();
    }
}
