package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class den implements dew {
    private final dem a;
    private final bwb b = new bwb(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public den(dem demVar) {
        this.a = demVar;
    }

    @Override // defpackage.dew
    public final void a(bwb bwbVar, int i) {
        int iN;
        int i2 = i & 1;
        if (i2 != 0) {
            iN = bwbVar.c + bwbVar.n();
        } else {
            iN = -1;
        }
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            bwbVar.P(iN);
            this.d = 0;
        }
        while (bwbVar.d() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iN2 = bwbVar.n();
                    bwbVar.P(bwbVar.c - 1);
                    if (iN2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(bwbVar.d(), 3 - this.d);
                bwb bwbVar2 = this.b;
                bwbVar.K(bwbVar2.b, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    bwbVar2.P(0);
                    bwbVar2.O(3);
                    bwbVar2.Q(1);
                    int iN3 = bwbVar2.n();
                    int iN4 = bwbVar2.n();
                    this.e = (iN3 & SemanticState.Focused) != 0;
                    this.c = (((iN3 & 15) << 8) | iN4) + 3;
                    int iE = bwbVar2.e();
                    int i5 = this.c;
                    if (iE < i5) {
                        bwbVar2.H(Math.min(4098, Math.max(i5, bwbVar2.e() << 1)));
                    }
                }
            } else {
                int iMin2 = Math.min(bwbVar.d(), this.c - this.d);
                bwb bwbVar3 = this.b;
                bwbVar.K(bwbVar3.b, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        bwbVar3.O(i7);
                    } else {
                        if (bwp.e(bwbVar3.b, 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        bwbVar3.O(this.c - 4);
                    }
                    bwbVar3.P(0);
                    this.a.a(bwbVar3);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.dew
    public final void b() {
        this.f = true;
    }

    @Override // defpackage.dew
    public final void c(nzd nzdVar, cvk cvkVar, dev devVar) {
        this.a.b(nzdVar, cvkVar, devVar);
        this.f = true;
    }
}
