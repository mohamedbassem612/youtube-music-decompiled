package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwx implements cvi {
    private final /* synthetic */ int $cid;
    private final Object a;

    public cwx(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new cwb(35152, 2, "image/png");
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? agpi.a : agpi.a;
        }
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        int i = this.$cid;
        if (i == 0) {
            ((cwb) this.a).b(cvkVar);
            return;
        }
        if (i != 1) {
            ((cwb) this.a).b(cvkVar);
            return;
        }
        cwj cwjVarS = cvkVar.s(0, 3);
        cvkVar.z(new cvy(-9223372036854775807L, 0L));
        cvkVar.t();
        bse bseVar = (bse) this.a;
        bsd bsdVar = new bsd(bseVar);
        bsdVar.e("text/x-unknown");
        bsdVar.k = bseVar.q;
        cwjVarS.b(new bse(bsdVar));
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        int i = this.$cid;
        if (i == 0) {
            ((cwb) this.a).d(j, j2);
        } else if (i != 1) {
            ((cwb) this.a).d(j, j2);
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        int i = this.$cid;
        if (i == 0) {
            return ((cwb) this.a).e(cvjVar);
        }
        if (i != 1) {
            return ((cwb) this.a).e(cvjVar);
        }
        return true;
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        int i = this.$cid;
        if (i == 0) {
            return ((cwb) this.a).g(cvjVar, qhaVar);
        }
        if (i != 1) {
            return ((cwb) this.a).g(cvjVar, qhaVar);
        }
        return cvjVar.c(Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
    }

    public cwx(int i) {
        this.$cid = i;
        this.a = new cwb(16973, 2, "image/bmp");
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    public cwx(bse bseVar, int i) {
        this.$cid = i;
        this.a = bseVar;
    }
}
