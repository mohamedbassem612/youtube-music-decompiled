package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acma implements acln, aclo {
    private final vyo g;
    public final awku a = new awku(0);
    private boolean c = false;
    private boolean d = false;
    private int e = 0;
    public int b = 0;
    private String f = null;

    public acma(vyo vyoVar) {
        this.g = vyoVar;
    }

    @Override // defpackage.acln
    public final void ah(int i, boolean z) {
        vyo vyoVar = this.g;
        if (afxw.e(vyoVar).cA || z) {
            return;
        }
        if (!afxw.e(vyoVar).cs || i > 0) {
            if (!afxw.e(vyoVar).cB || i > 1) {
                int i2 = this.b + 1;
                this.b = i2;
                this.a.kk(Integer.valueOf(i2));
            }
        }
    }

    @Override // defpackage.acln
    public final void b(String str, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.f = str;
        int i = z ? 0 : this.b + 1;
        this.b = i;
        this.a.kk(Integer.valueOf(i));
    }

    @Override // defpackage.acln
    public final void c(int i, String str) {
        if (!str.equals(this.f)) {
            rmp.n(null, "ReelOslaMgr: onPageExit is not matching the current processing identifier, onPageExit identifier: " + str + ", processing identifier: " + this.f);
            return;
        }
        if (i == 0) {
            if (this.c) {
                int i2 = this.b;
                if (i2 != 0) {
                    rmp.n(null, "ReelTslaMgr: accumulatedViews is not 0 for ad. The page identifier: " + this.f + ", accumulatedViews: " + i2);
                }
            } else {
                int i3 = this.e;
                int i4 = this.b;
                if (i3 >= i4) {
                    rmp.n(null, "ReelOslaMgr: accumulatedViews is not greater than accumulatedViewsBeforePageEnter. The page identifier: " + this.f + ", isVideo: " + this.d + ", accumulatedViews: " + i4 + ", accumulatedViewsBeforePageEnter: " + i3);
                }
            }
            this.e = this.b;
        }
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ap() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ar() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void as() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void at() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void a(agkz agkzVar) {
    }
}
