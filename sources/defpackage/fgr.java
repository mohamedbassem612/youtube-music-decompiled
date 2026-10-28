package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgr extends fgy {
    public static final /* synthetic */ int g = 0;

    @fmu
    public List a;

    @fmu
    public boolean b;

    @fmu
    public int c;

    @fmu
    public int d;

    @fmu
    public int e;

    @fmu
    public int f;
    private final String q = "Column";

    public static fgq f(fhd fhdVar) {
        return new fgq(fhdVar, new fgr());
    }

    @Override // defpackage.fgy
    public final fjq b(fjd fjdVar, fhd fhdVar) {
        fjq fjqVar = new fjq(fhdVar);
        fjqVar.L = true == this.b ? 2 : 1;
        int i = this.d;
        if (i != 0) {
            fjqVar.J = i;
        }
        int i2 = this.c;
        if (i2 != 0) {
            fjqVar.I = i2;
        }
        int i3 = this.e;
        if (i3 != 0) {
            fjqVar.H = i3;
        }
        int i4 = this.f;
        if (i4 != 0) {
            fjqVar.K = i4;
        }
        List<fgy> list = this.a;
        if (list == null) {
            return fjqVar;
        }
        for (fgy fgyVar : list) {
            if (fjdVar.d()) {
                return null;
            }
            if (fjdVar.c()) {
                fjqVar.t(fgyVar);
            } else {
                fjqVar.y(fjdVar, fhdVar, fgyVar);
            }
        }
        return fjqVar;
    }

    @Override // defpackage.fgy
    public final String c() {
        return this.q;
    }

    @Override // defpackage.fgy
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        int i;
        int i2;
        int i3;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fgr fgrVar = (fgr) fgyVar;
            if (this.j == fgrVar.j) {
                return true;
            }
            List list = this.a;
            if (list != null) {
                if (fgrVar.a != null && list.size() == fgrVar.a.size()) {
                    int size = this.a.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (((fgy) this.a.get(i4)).g((fgy) fgrVar.a.get(i4))) {
                        }
                    }
                    i = this.d;
                    if (i != 0 ? fgrVar.d == 0 : i == fgrVar.d) {
                        i2 = this.c;
                        if (i2 != 0 ? fgrVar.c == 0 : i2 == fgrVar.c) {
                            i3 = this.e;
                            if (i3 != 0 ? fgrVar.e == 0 : i3 == fgrVar.e) {
                                if (this.b == fgrVar.b) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (fgrVar.a == null) {
                i = this.d;
                if (i != 0) {
                    i2 = this.c;
                    if (i2 != 0) {
                        i3 = this.e;
                        if (i3 != 0) {
                            if (this.b == fgrVar.b) {
                                return true;
                            }
                        } else if (this.b == fgrVar.b) {
                            return true;
                        }
                    } else {
                        i3 = this.e;
                        if (i3 != 0) {
                            if (this.b == fgrVar.b) {
                                return true;
                            }
                        } else if (this.b == fgrVar.b) {
                            return true;
                        }
                    }
                } else {
                    i2 = this.c;
                    if (i2 != 0) {
                        i3 = this.e;
                        if (i3 != 0) {
                            if (this.b == fgrVar.b) {
                                return true;
                            }
                        } else if (this.b == fgrVar.b) {
                            return true;
                        }
                    } else {
                        i3 = this.e;
                        if (i3 != 0) {
                            if (this.b == fgrVar.b) {
                                return true;
                            }
                        } else if (this.b == fgrVar.b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
