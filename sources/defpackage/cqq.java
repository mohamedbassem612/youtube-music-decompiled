package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqq extends cqp {
    public final boolean e;
    public final cql f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final boolean w;
    private final int x;
    private final String y;

    /* JADX WARN: Code duplicated, block: B:132:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x006e  */
    public cqq(int i, bto btoVar, int i2, cql cqlVar, int i3, String str, boolean z) {
        boolean z2;
        boolean z3;
        int i4;
        int iB;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        float f;
        int i7;
        bse bseVar;
        int i8;
        int i9;
        int i10;
        super(i, btoVar, i2);
        this.f = cqlVar;
        int i11 = 1;
        int i12 = true != cqlVar.N ? 16 : 24;
        boolean z6 = cqlVar.M;
        if (!z || (((i8 = (bseVar = this.d).w) != -1 && i8 > cqlVar.b) || ((i9 = bseVar.x) != -1 && i9 > cqlVar.c))) {
            z2 = false;
        } else {
            float f2 = bseVar.A;
            if ((f2 == -1.0f || f2 <= cqlVar.d) && ((i10 = bseVar.k) == -1 || i10 <= cqlVar.e)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.e = z2;
        if (z) {
            bse bseVar2 = this.d;
            int i13 = bseVar2.w;
            if (i13 != -1) {
                int i14 = cqlVar.f;
                if (i13 >= 0) {
                    i6 = bseVar2.x;
                    if (i6 != -1) {
                        int i15 = cqlVar.g;
                        if (i6 >= 0) {
                            f = bseVar2.A;
                            if (f != -1.0f) {
                                int i16 = cqlVar.h;
                                if (f >= 0.0f) {
                                    i7 = bseVar2.k;
                                    if (i7 != -1) {
                                        int i17 = cqlVar.i;
                                        if (i7 >= 0) {
                                            z3 = false;
                                        }
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                i7 = bseVar2.k;
                                if (i7 != -1) {
                                    int i18 = cqlVar.i;
                                    if (i7 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        f = bseVar2.A;
                        if (f != -1.0f) {
                            int i19 = cqlVar.h;
                            if (f >= 0.0f) {
                                i7 = bseVar2.k;
                                if (i7 != -1) {
                                    int i110 = cqlVar.i;
                                    if (i7 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i7 = bseVar2.k;
                            if (i7 != -1) {
                                int i111 = cqlVar.i;
                                if (i7 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
            } else {
                i6 = bseVar2.x;
                if (i6 != -1) {
                    int i112 = cqlVar.g;
                    if (i6 >= 0) {
                        f = bseVar2.A;
                        if (f != -1.0f) {
                            int i113 = cqlVar.h;
                            if (f >= 0.0f) {
                                i7 = bseVar2.k;
                                if (i7 != -1) {
                                    int i114 = cqlVar.i;
                                    if (i7 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i7 = bseVar2.k;
                            if (i7 != -1) {
                                int i115 = cqlVar.i;
                                if (i7 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    f = bseVar2.A;
                    if (f != -1.0f) {
                        int i116 = cqlVar.h;
                        if (f >= 0.0f) {
                            i7 = bseVar2.k;
                            if (i7 != -1) {
                                int i117 = cqlVar.i;
                                if (i7 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i7 = bseVar2.k;
                        if (i7 != -1) {
                            int i118 = cqlVar.i;
                            if (i7 >= 0) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.g = z3;
        this.h = aub.e(i3, false);
        bse bseVar3 = this.d;
        float f3 = bseVar3.A;
        this.i = f3 != -1.0f && f3 >= 10.0f;
        this.j = bseVar3.k;
        this.k = bseVar3.a();
        int i20 = 0;
        while (true) {
            agke agkeVar = cqlVar.p;
            int i21 = ((agpi) agkeVar).d;
            i4 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i20 >= i21) {
                iB = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                iB = cqr.b(this.d, (String) agkeVar.get(i20), false);
                if (iB > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.m = i20;
        this.n = iB;
        int i22 = this.d.f;
        int i23 = cqlVar.q;
        this.o = cqr.c(i22, 0);
        int i24 = this.d.f;
        this.q = i24 == 0 || (i24 & 1) != 0;
        this.r = cqr.b(this.d, str, cqr.e(str) == null);
        bse bseVar4 = this.d;
        String str2 = bseVar4.q;
        int i25 = i3 & 384;
        int i26 = SemanticState.Hidden;
        if (i25 == 256) {
            String strB = cma.b(bseVar4);
            str2 = strB != null ? strB : str2;
            i25 = 256;
        }
        int i27 = 0;
        while (true) {
            agke agkeVar2 = cqlVar.n;
            if (i27 < ((agpi) agkeVar2).d) {
                if (str2 != null && str2.equals(agkeVar2.get(i27))) {
                    i4 = i27;
                    break;
                }
                i27++;
            } else {
                break;
            }
        }
        this.l = i4;
        this.p = cqr.a(this.d, cqlVar.o);
        if (i25 == 128) {
            z4 = true;
            i26 = i25;
        } else if (i25 == 256) {
            z4 = true;
        } else {
            i26 = i25;
            z4 = false;
        }
        this.s = z4;
        this.t = i26 == 128;
        this.u = (i3 & 64) == 64;
        this.y = str2;
        if (str2 != null) {
            switch (str2) {
                case "video/dolby-vision":
                    i5 = 5;
                    break;
                case "video/av01":
                    i5 = 4;
                    break;
                case "video/hevc":
                    i5 = 3;
                    break;
                case "video/avc":
                    i5 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i5 = 2;
                    break;
                default:
                    i5 = 0;
                    break;
            }
        } else {
            i5 = 0;
        }
        this.v = i5;
        this.w = z4 && bru.i(this.d.G);
        bse bseVar5 = this.d;
        if ((bseVar5.f & 16384) == 0) {
            cql cqlVar2 = this.f;
            if (!aub.e(i3, cqlVar2.W) || (!(z5 = this.e) && !cqlVar2.L)) {
                i11 = 0;
            } else if (aub.e(i3, false) && this.g && z5 && bseVar5.k != -1) {
                boolean z7 = cqlVar2.H;
                boolean z8 = cqlVar2.G;
                if ((i3 & i12) != 0) {
                    i11 = 2;
                }
            }
        } else {
            i11 = 0;
        }
        this.x = i11;
    }

    @Override // defpackage.cqp
    public final int b() {
        return this.x;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean c(cqp cqpVar) {
        cqq cqqVar = (cqq) cqpVar;
        if (Objects.equals(this.y, cqqVar.y)) {
            boolean z = this.f.O;
            if (this.s == cqqVar.s && this.u == cqqVar.u) {
                return true;
            }
        }
        return false;
    }
}
