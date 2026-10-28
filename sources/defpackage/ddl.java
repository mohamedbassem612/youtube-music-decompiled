package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddl implements cvi {
    private final /* synthetic */ int $cid;
    private final bwb a;
    private boolean b;
    private final Object c;

    public ddl(int i, byte[] bArr) {
        this.$cid = i;
        this.c = new ddk(null, 0, "audio/ac3");
        this.a = new bwb(2786);
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return this.$cid != 0 ? agpi.a : agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        if (this.$cid != 0) {
            ((ddk) this.c).b(cvkVar, new dev(Integer.MIN_VALUE, 0, 1));
            cvkVar.t();
            cvkVar.z(new cvy(-9223372036854775807L, 0L));
            return;
        }
        ((ddm) this.c).b(cvkVar, new dev(Integer.MIN_VALUE, 0, 1));
        cvkVar.t();
        cvkVar.z(new cvy(-9223372036854775807L, 0L));
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        if (this.$cid != 0) {
            this.b = false;
            ((ddk) this.c).f();
        } else {
            this.b = false;
            ((ddm) this.c).f();
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        cvb cvbVar;
        char c;
        int i;
        int i2;
        cvb cvbVar2;
        int iA;
        int i3 = this.$cid;
        int i4 = SemanticState.Multiline;
        char c2 = 6;
        if (i3 == 0) {
            bwb bwbVar = new bwb(10);
            int i5 = 0;
            while (true) {
                cvbVar = (cvb) cvjVar;
                cvbVar.n(bwbVar.b, 0, 10, false);
                bwbVar.P(0);
                if (bwbVar.p() != 4801587) {
                    break;
                }
                bwbVar.Q(3);
                int iM = bwbVar.m();
                i5 += iM + 10;
                cvbVar.m(iM, false);
                i4 = SemanticState.Multiline;
            }
            cvjVar.k();
            cvbVar.m(i5, false);
            int i6 = i5;
            loop3: while (true) {
                int i7 = 0;
                while (true) {
                    cvbVar.n(bwbVar.b, 0, 7, false);
                    bwbVar.P(0);
                    int iS = bwbVar.s();
                    if (iS == 44096 || iS == 44097) {
                        i7++;
                        if (i7 >= 4) {
                            return true;
                        }
                        byte[] bArr = bwbVar.b;
                        int i8 = cuq.a;
                        if (bArr.length < 7) {
                            i2 = -1;
                            c = c2;
                        } else {
                            c = c2;
                            int i9 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                            if (i9 == 65535) {
                                i9 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[c] & 255);
                                i = 7;
                            } else {
                                i = 4;
                            }
                            if (iS == 44097) {
                                i += 2;
                            }
                            i2 = i9 + i;
                        }
                        if (i2 == -1) {
                            break loop3;
                        }
                        cvbVar.m(i2 - 7, false);
                        c2 = c;
                        i4 = SemanticState.Multiline;
                    }
                }
                cvjVar.k();
                i6++;
                if (i6 - i5 >= i4) {
                    break;
                }
                cvbVar.m(i6, false);
            }
        } else {
            bwb bwbVar2 = new bwb(10);
            int i10 = 0;
            while (true) {
                cvbVar2 = (cvb) cvjVar;
                cvbVar2.n(bwbVar2.b, 0, 10, false);
                bwbVar2.P(0);
                if (bwbVar2.p() != 4801587) {
                    break;
                }
                bwbVar2.Q(3);
                int iM2 = bwbVar2.m();
                i10 += iM2 + 10;
                cvbVar2.m(iM2, false);
            }
            cvjVar.k();
            cvbVar2.m(i10, false);
            int i11 = 0;
            int i12 = i10;
            while (true) {
                cvbVar2.n(bwbVar2.b, 0, 6, false);
                bwbVar2.P(0);
                if (bwbVar2.s() != 2935) {
                    cvjVar.k();
                    i12++;
                    if (i12 - i10 >= 8192) {
                        break;
                    }
                    cvbVar2.m(i12, false);
                    i11 = 0;
                } else {
                    i11++;
                    if (i11 >= 4) {
                        return true;
                    }
                    byte[] bArr2 = bwbVar2.b;
                    int[] iArr = cuo.a;
                    if (bArr2.length < 6) {
                        iA = -1;
                    } else if (((bArr2[5] & 248) >> 3) > 10) {
                        iA = ((((bArr2[2] & 7) << 8) | (bArr2[3] & 255)) + 1) << 1;
                    } else {
                        byte b = bArr2[4];
                        iA = cuo.a((b & 192) >> 6, b & 63);
                    }
                    if (iA == -1) {
                        break;
                    }
                    cvbVar2.m(iA - 6, false);
                }
            }
        }
        return false;
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        int i = this.$cid;
        bwb bwbVar = this.a;
        if (i != 0) {
            int iA = cvjVar.a(bwbVar.b, 0, 2786);
            if (iA == -1) {
                return -1;
            }
            bwbVar.P(0);
            bwbVar.O(iA);
            if (!this.b) {
                ((ddk) this.c).a = 0L;
                this.b = true;
            }
            ((ddk) this.c).a(bwbVar);
        } else {
            int iA2 = cvjVar.a(bwbVar.b, 0, 16384);
            if (iA2 == -1) {
                return -1;
            }
            bwbVar.P(0);
            bwbVar.O(iA2);
            if (!this.b) {
                ((ddm) this.c).a = 0L;
                this.b = true;
            }
            ((ddm) this.c).a(bwbVar);
        }
        return 0;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    public ddl(int i) {
        this.$cid = i;
        this.c = new ddm(null, 0, "audio/ac4");
        this.a = new bwb(16384);
    }
}
