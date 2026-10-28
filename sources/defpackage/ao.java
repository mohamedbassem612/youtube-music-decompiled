package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ao {
    final ap a;
    ao b;
    public an f;
    final int g;
    public int c = 0;
    int d = -1;
    public int h = 1;
    public int i = 1;
    public int e = 0;

    public ao(ap apVar, int i) {
        this.a = apVar;
        this.g = i;
    }

    private final String f(HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder("null:");
        sb.append(a.c(this.g));
        ao aoVar = this.b;
        sb.append(aoVar != null ? " connected to ".concat(aoVar.f(hashSet)) : "");
        return sb.toString();
    }

    public final int a() {
        ao aoVar;
        if (this.a.K == 8) {
            return 0;
        }
        int i = this.d;
        return (i < 0 || (aoVar = this.b) == null || aoVar.a.K != 8) ? this.c : i;
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        return this.b != null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x0068  */
    /* JADX WARN: Code duplicated, block: B:46:0x006f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x0075  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public final void d(ao aoVar, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (aoVar == null) {
            this.b = null;
            this.c = 0;
            this.d = -1;
            this.h = 1;
            this.e = 2;
            return;
        }
        if (!z) {
            int i5 = aoVar.g;
            int i6 = this.g;
            if (i5 != i6) {
                int i7 = i6 - 1;
                if (i7 == 1) {
                    if (i5 != 2) {
                        z2 = true;
                    } else if (i5 == 4) {
                        z2 = true;
                        i5 = 4;
                    } else {
                        z2 = false;
                    }
                    if (aoVar.a instanceof ar) {
                        z4 = z2;
                    } else if (!z2 && i5 != 8) {
                        z4 = false;
                    }
                    if (!z4) {
                        return;
                    }
                } else {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (i5 != 2) {
                                z2 = true;
                            } else if (i5 == 4) {
                                z2 = true;
                                i5 = 4;
                            } else {
                                z2 = false;
                            }
                            if (aoVar.a instanceof ar) {
                                z4 = z2;
                            } else if (!z2) {
                                z4 = false;
                            }
                            if (!z4) {
                                return;
                            }
                        } else if (i7 != 4) {
                            if (i7 != 6 || i5 == 6 || i5 == 8 || i5 == 9) {
                                return;
                            }
                        }
                    }
                    if (i5 == 3) {
                        z3 = true;
                    } else if (i5 == 5) {
                        i5 = 5;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(aoVar.a instanceof ar)) {
                        z4 = z3;
                    } else if (!z3 && i5 != 9) {
                        z4 = false;
                    }
                    if (!z4) {
                        return;
                    }
                }
            } else {
                if (i6 == 7) {
                    return;
                }
                if (i6 == 6 && (!aoVar.a.r() || !this.a.r())) {
                    return;
                }
            }
        }
        this.b = aoVar;
        if (i > 0) {
            this.c = i;
        } else {
            this.c = 0;
        }
        this.d = i2;
        this.h = i3;
        this.e = i4;
    }

    public final void e() {
        an anVar = this.f;
        if (anVar == null) {
            this.f = new an(1);
        } else {
            anVar.b();
        }
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("null:");
        sb.append(a.c(this.g));
        ao aoVar = this.b;
        sb.append(aoVar != null ? " connected to ".concat(aoVar.f(hashSet)) : "");
        return sb.toString();
    }
}
