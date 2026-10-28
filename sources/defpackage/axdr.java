package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axdr {
    public static final axdy a = new axdy("REMOVE_FROZEN");
    public final awtq b;
    private final int c;
    private final boolean d;
    private final int e;
    private final awtr f;
    private final ahud g;

    public axdr(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        awts awtsVar = awts.a;
        this.f = new awtr(null, awtsVar);
        this.b = new awtq(0L, awtsVar);
        this.g = new ahud(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            awtq awtqVar = this.b;
            long j = awtqVar.b;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = this.e;
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = (int) (1073741823 & j);
            if (((i2 + 2) & i) == (i3 & i)) {
                return 1;
            }
            if (!this.d) {
                if (this.g.s(i2 & i).a != null) {
                    int i4 = this.c;
                    if (i4 < 1024 || ((i2 - i3) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                }
            }
            if (awtqVar.c(j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                this.g.s(i & i2).c(obj);
                while ((this.b.b & 1152921504606846976L) != 0) {
                    this = this.c();
                    ahud ahudVar = this.g;
                    int i5 = this.e & i2;
                    Object obj2 = ahudVar.s(i5).a;
                    if ((obj2 instanceof axdq) && ((axdq) obj2).a == i2) {
                        ahudVar.s(i5).c(obj);
                    } else {
                        this = null;
                    }
                    if (this == null) {
                        break;
                    }
                }
                return 0;
            }
        }
    }

    public final Object b() {
        while (true) {
            awtq awtqVar = this.b;
            long j = awtqVar.b;
            long j2 = 0;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i;
            int i4 = i & i2;
            if (i3 != i4) {
                ahud ahudVar = this.g;
                Object obj = ahudVar.s(i4).a;
                if (obj == null) {
                    if (this.d) {
                    }
                } else if (!(obj instanceof axdq)) {
                    long j3 = (i2 + 1) & 1073741823;
                    if (awtqVar.c(j, (j & (-1073741824)) | j3)) {
                        ahudVar.s(i4).c(null);
                    } else if (this.d) {
                        axdr axdrVarC = this;
                        while (true) {
                            awtq awtqVar2 = axdrVarC.b;
                            while (true) {
                                long j4 = awtqVar2.b;
                                long j5 = j4 & 1073741823;
                                boolean z = awuv.a;
                                if ((j4 & 1152921504606846976L) != j2) {
                                    axdrVarC = axdrVarC.c();
                                    break;
                                }
                                if (awtqVar2.c(j4, (j4 & (-1073741824)) | j3)) {
                                    axdrVarC.g.s(((int) j5) & axdrVarC.e).c(null);
                                    axdrVarC = null;
                                    break;
                                }
                                j2 = 0;
                            }
                            if (axdrVarC == null) {
                                break;
                            }
                            j2 = 0;
                        }
                    }
                    return obj;
                }
            }
            return null;
        }
    }

    public final axdr c() {
        long j;
        while (true) {
            awtq awtqVar = this.b;
            j = awtqVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = 1152921504606846976L | j;
            if (awtqVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        awtr awtrVar = this.f;
        while (true) {
            axdr axdrVar = (axdr) awtrVar.a;
            if (axdrVar != null) {
                return axdrVar;
            }
            axdr axdrVar2 = new axdr(this.c << 1, this.d);
            long j3 = 1152921503533105152L & j;
            int i = (int) (1073741823 & j);
            while (true) {
                int i2 = this.e;
                int i3 = i & i2;
                if (i3 != (((int) (j3 >> 30)) & i2)) {
                    Object axdqVar = this.g.s(i3).a;
                    if (axdqVar == null) {
                        axdqVar = new axdq(i);
                    }
                    axdrVar2.g.s(axdrVar2.e & i).c(axdqVar);
                    i++;
                }
            }
            axdrVar2.b.b = (-1152921504606846977L) & j;
            awtrVar.d(null, axdrVar2);
        }
    }

    public final boolean d() {
        awtq awtqVar;
        long j;
        do {
            awtqVar = this.b;
            j = awtqVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!awtqVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
