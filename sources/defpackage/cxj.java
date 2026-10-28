package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cxj implements cvi {
    private cvk b;
    private int c;
    private int d;
    private int e;
    private cxo g;
    private cvj h;
    private cwe i;
    private dae j;
    private final bwb a = new bwb(2);
    private long f = -1;

    private final int h(cvj cvjVar) {
        bwb bwbVar = this.a;
        bwbVar.L(2);
        ((cvb) cvjVar).n(bwbVar.b, 0, 2, false);
        return bwbVar.s();
    }

    private final int i(cvj cvjVar) {
        bwb bwbVar = this.a;
        bwbVar.L(2);
        ((cvb) cvjVar).n(bwbVar.b, 0, 2, false);
        return bwbVar.s() - 2;
    }

    private final void j() {
        cvk cvkVar = this.b;
        cvkVar.getClass();
        cvkVar.t();
        this.b.z(new cvy(-9223372036854775807L, 0L));
        this.c = 6;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.b = cvkVar;
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            dae daeVar = this.j;
            daeVar.getClass();
            daeVar.d(j, j2);
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        int i;
        if (h(cvjVar) != 65496) {
            return false;
        }
        while (true) {
            int iH = h(cvjVar);
            this.d = iH;
            if (iH == 65498 || (i = i(cvjVar)) < 0) {
                return false;
            }
            if (this.d != 65505) {
                ((cvb) cvjVar).m(i, false);
            } else {
                bwb bwbVar = this.a;
                bwbVar.L(i);
                ((cvb) cvjVar).n(bwbVar.b, 0, i, false);
                if (Objects.equals(bwbVar.S(), "http://ns.adobe.com/xap/1.0/")) {
                    String strS = bwbVar.S();
                    String[] strArr = cwl.a;
                    if (strS != null) {
                        String[] strArr2 = cwl.a;
                        for (int i2 = 0; i2 < 4; i2++) {
                            if (strS.contains(String.valueOf(strArr2[i2]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        String strS;
        axmq axmqVarA;
        long j;
        int i = this.c;
        long j2 = -1;
        if (i == 0) {
            bwb bwbVar = this.a;
            bwbVar.L(2);
            ((cvb) cvjVar).o(bwbVar.b, 0, 2, false);
            int iS = bwbVar.s();
            this.d = iS;
            if (iS == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    j();
                }
            } else if ((iS < 65488 || iS > 65497) && iS != 65281) {
                this.c = 1;
            }
        } else if (i == 1) {
            this.e = i(cvjVar);
            ((cvb) cvjVar).p(2, false);
            this.c = 2;
        } else if (i == 2) {
            if (this.d == 65505) {
                bwb bwbVar2 = new bwb(this.e);
                cvb cvbVar = (cvb) cvjVar;
                cvbVar.o(bwbVar2.b, 0, this.e, false);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(bwbVar2.S()) && (strS = bwbVar2.S()) != null) {
                    long j3 = cvbVar.a;
                    cxo cxoVar = null;
                    if (j3 != -1 && (axmqVarA = cwl.a(strS)) != null) {
                        ?? r2 = axmqVarA.b;
                        int i2 = ((agpi) r2).d;
                        if (i2 >= 2) {
                            int i3 = i2 - 1;
                            long j4 = -1;
                            long j5 = -1;
                            long j6 = -1;
                            long j7 = -1;
                            while (i3 >= 0) {
                                aawx aawxVar = (aawx) r2.get(i3);
                                String str = (String) aawxVar.c;
                                boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                                long j8 = j2;
                                if (i3 == 0) {
                                    j3 -= aawxVar.a;
                                    j = 0;
                                } else {
                                    j = j3 - aawxVar.b;
                                }
                                long j9 = j;
                                long j10 = j3;
                                j3 = j9;
                                if (z && j3 != j10) {
                                    j7 = j10 - j3;
                                    j6 = j3;
                                }
                                if (i3 == 0) {
                                    j4 = j3;
                                    j5 = j10;
                                }
                                i3--;
                                j2 = j8;
                            }
                            long j11 = j2;
                            if (j6 != j11 && j7 != j11 && j4 != j11 && j5 != j11) {
                                cxoVar = new cxo(j4, j5, axmqVarA.a, j6, j7);
                            }
                        }
                    }
                    this.g = cxoVar;
                    if (cxoVar != null) {
                        this.f = cxoVar.d;
                    }
                }
            } else {
                ((cvb) cvjVar).p(this.e, false);
            }
            this.c = 0;
        } else {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || cvjVar != this.h) {
                    this.h = cvjVar;
                    this.i = new cwe(cvjVar, this.f);
                }
                dae daeVar = this.j;
                daeVar.getClass();
                int iG = daeVar.g(this.i, qhaVar);
                if (iG != 1) {
                    return iG;
                }
                qhaVar.a += this.f;
                return 1;
            }
            long j12 = ((cvb) cvjVar).b;
            long j13 = this.f;
            if (j12 != j13) {
                qhaVar.a = j13;
                return 1;
            }
            if (cvjVar.n(this.a.b, 0, 1, true)) {
                cvjVar.k();
                if (this.j == null) {
                    this.j = new dae(dbl.a, 8);
                }
                cwe cweVar = new cwe(cvjVar, this.f);
                this.i = cweVar;
                if (this.j.e(cweVar)) {
                    dae daeVar2 = this.j;
                    long j14 = this.f;
                    cvk cvkVar = this.b;
                    cvkVar.getClass();
                    daeVar2.b(new cwg(j14, cvkVar));
                    cxo cxoVar2 = this.g;
                    cxoVar2.getClass();
                    cvk cvkVar2 = this.b;
                    cvkVar2.getClass();
                    cwj cwjVarS = cvkVar2.s(SemanticState.ReadOnly, 4);
                    bsd bsdVar = new bsd();
                    bsdVar.a("image/jpeg");
                    bsdVar.l = new bsx(-9223372036854775807L, cxoVar2);
                    cwjVarS.b(new bse(bsdVar));
                    this.c = 5;
                } else {
                    j();
                }
            } else {
                j();
            }
        }
        return 0;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
