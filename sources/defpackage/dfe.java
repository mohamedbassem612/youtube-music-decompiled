package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dfe implements cvi {
    private final /* synthetic */ int $cid;
    private final bwb a;
    private final cwb b;

    public dfe(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new bwb(4);
        this.b = new cwb(-1, -1, "image/avif");
    }

    private final boolean h(cvj cvjVar, int i) {
        bwb bwbVar = this.a;
        bwbVar.L(4);
        ((cvb) cvjVar).n(bwbVar.b, 0, 4, false);
        return bwbVar.w() == ((long) i);
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return this.$cid != 0 ? agpi.a : agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        int i = this.$cid;
        cwb cwbVar = this.b;
        if (i != 0) {
            cwbVar.b(cvkVar);
        } else {
            cwbVar.b(cvkVar);
        }
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        int i = this.$cid;
        cwb cwbVar = this.b;
        if (i != 0) {
            cwbVar.d(j, j2);
        } else {
            cwbVar.d(j, j2);
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        if (this.$cid != 0) {
            ((cvb) cvjVar).m(4, false);
            if (h(cvjVar, 1718909296) && h(cvjVar, 1635150182)) {
                return true;
            }
        } else {
            bwb bwbVar = this.a;
            bwbVar.L(4);
            cvb cvbVar = (cvb) cvjVar;
            cvbVar.n(bwbVar.b, 0, 4, false);
            if (bwbVar.w() == 1380533830) {
                cvbVar.m(4, false);
                bwbVar.L(4);
                cvbVar.n(bwbVar.b, 0, 4, false);
                if (bwbVar.w() == 1464156752) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        int i = this.$cid;
        cwb cwbVar = this.b;
        return i != 0 ? cwbVar.g(cvjVar, qhaVar) : cwbVar.g(cvjVar, qhaVar);
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    public dfe(int i) {
        this.$cid = i;
        this.a = new bwb(4);
        this.b = new cwb(-1, -1, "image/webp");
    }
}
