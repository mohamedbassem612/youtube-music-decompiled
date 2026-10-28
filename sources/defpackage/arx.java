package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class arx implements arn {
    public int c;
    public ard d;
    protected int j;
    zg l;
    public final arq e = new arq(this);
    public int f = 0;
    public boolean g = false;
    public final arp h = new arp(this);
    public final arp i = new arp(this);
    protected int k = 1;

    public arx(ard ardVar) {
        this.d = ardVar;
    }

    protected static final void j(arp arpVar, arp arpVar2, int i) {
        arpVar.k.add(arpVar2);
        arpVar.e = i;
        arpVar2.j.add(arpVar);
    }

    protected static final arp k(arc arcVar) {
        arc arcVar2 = arcVar.e;
        if (arcVar2 != null) {
            int i = arcVar2.i;
            ard ardVar = arcVar2.d;
            int i2 = i - 1;
            if (i2 == 1) {
                return ardVar.h.h;
            }
            if (i2 == 2) {
                return ardVar.i.h;
            }
            if (i2 == 3) {
                return ardVar.h.i;
            }
            if (i2 == 4) {
                return ardVar.i.i;
            }
            if (i2 == 5) {
                return ardVar.i.a;
            }
        }
        return null;
    }

    protected static final arp l(arc arcVar, int i) {
        arc arcVar2 = arcVar.e;
        if (arcVar2 != null) {
            ard ardVar = arcVar2.d;
            arx arxVar = i == 0 ? ardVar.h : ardVar.i;
            int i2 = arcVar2.i - 1;
            if (i2 == 1 || i2 == 2) {
                return arxVar.h;
            }
            if (i2 == 3 || i2 == 4) {
                return arxVar.i;
            }
        }
        return null;
    }

    public long a() {
        arq arqVar = this.e;
        if (arqVar.i) {
            return arqVar.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.arn
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        int iMax;
        ard ardVar = this.d;
        if (i2 == 0) {
            int i3 = ardVar.w;
            iMax = Math.max(ardVar.v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            int i4 = ardVar.z;
            iMax = Math.max(ardVar.y, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    protected final void i(arp arpVar, arp arpVar2, int i, arq arqVar) {
        List list = arpVar.k;
        list.add(arpVar2);
        list.add(this.e);
        arpVar.g = i;
        arpVar.h = arqVar;
        arpVar2.j.add(arpVar);
        arqVar.j.add(arpVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    protected final void m(arc arcVar, arc arcVar2, int i) {
        arx arxVar;
        arx arxVar2;
        arq arqVar;
        float f;
        int i2;
        arp arpVarK = k(arcVar);
        arp arpVarK2 = k(arcVar2);
        if (arpVarK.i && arpVarK2.i) {
            int iB = arpVarK.f + arcVar.b();
            int iB2 = arpVarK2.f - arcVar2.b();
            arq arqVar2 = this.e;
            int i3 = iB2 - iB;
            if (!arqVar2.i && this.j == 3) {
                int i4 = this.c;
                if (i4 != 0) {
                    int i5 = 1;
                    if (i4 != 1) {
                        int i6 = 0;
                        if (i4 == 2) {
                            ard ardVar = this.d;
                            ard ardVar2 = ardVar.U;
                            if (ardVar2 != null) {
                                if (i == 0) {
                                    arxVar = ardVar2.h;
                                    i5 = 0;
                                } else {
                                    arxVar = ardVar2.i;
                                    i6 = 1;
                                }
                                arq arqVar3 = arxVar.e;
                                if (arqVar3.i) {
                                    arqVar2.c(h((int) ((arqVar3.f * (i5 == 0 ? ardVar.x : ardVar.A)) + 0.5f), i5));
                                    i = i5;
                                } else {
                                    i = i6;
                                }
                            }
                        } else if (i4 == 3) {
                            ard ardVar3 = this.d;
                            aru aruVar = ardVar3.h;
                            if (aruVar.j == 3 && aruVar.c == 3) {
                                arv arvVar = ardVar3.i;
                                if (arvVar.j != 3 || arvVar.c != 3) {
                                    if (i == 0) {
                                        i = 0;
                                        arxVar2 = ardVar3.i;
                                    } else {
                                        i = 1;
                                        i6 = 1;
                                        arxVar2 = aruVar;
                                    }
                                    arqVar = arxVar2.e;
                                    if (arqVar.i) {
                                        f = ardVar3.X;
                                        if (i6 == 1) {
                                            i2 = (int) ((arqVar.f / f) + 0.5f);
                                        } else {
                                            i2 = (int) ((f * arqVar.f) + 0.5f);
                                        }
                                        arqVar2.c(i2);
                                    }
                                }
                            } else {
                                if (i == 0) {
                                    i = 0;
                                    arxVar2 = ardVar3.i;
                                } else {
                                    i = 1;
                                    i6 = 1;
                                    arxVar2 = aruVar;
                                }
                                arqVar = arxVar2.e;
                                if (arqVar.i) {
                                    f = ardVar3.X;
                                    if (i6 == 1) {
                                        i2 = (int) ((arqVar.f / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * arqVar.f) + 0.5f);
                                    }
                                    arqVar2.c(i2);
                                }
                            }
                        }
                    } else {
                        arqVar2.c(Math.min(h(arqVar2.m, i), i3));
                    }
                } else {
                    arqVar2.c(h(i3, i));
                }
            }
            if (arqVar2.i) {
                int i7 = arqVar2.f;
                if (i7 == i3) {
                    this.h.c(iB);
                    this.i.c(iB2);
                    return;
                }
                ard ardVar4 = this.d;
                float f2 = i == 0 ? ardVar4.ae : ardVar4.af;
                if (arpVarK == arpVarK2) {
                    iB = arpVarK.f;
                    iB2 = arpVarK2.f;
                    f2 = 0.5f;
                }
                arp arpVar = this.h;
                arpVar.c((int) (iB + 0.5f + (((iB2 - iB) - i7) * f2)));
                this.i.c(arpVar.f + arqVar2.f);
            }
        }
    }
}
