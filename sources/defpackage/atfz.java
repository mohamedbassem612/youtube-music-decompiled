package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atfz extends mew implements mes {
    public volatile mew e;
    public volatile mew f;
    public volatile mew g;
    volatile mew h;
    volatile asxe i;
    volatile asxe j;

    static {
        atfy.a.d(19);
    }

    public atfz() {
        super(atfy.a);
    }

    public final boolean aR() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    public final boolean aS() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final boolean aT() {
        return (this.h == null && (Memory.peekByte(this.c + 9) & 2) == 0) ? false : true;
    }

    public final boolean aU() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    public final boolean aV() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final int aW() {
        int iAU = a.aU(Memory.peekInt(this.c + (true != a ? 36L : 16L), false));
        if (iAU != 0) {
            return iAU;
        }
        return 1;
    }

    public final mew aX() {
        if (this.h == null && (Memory.peekByte(this.c + 9) & 2) != 0) {
            this.h = new mew(cp(true != a ? 48 : 88, atcm.a));
        }
        return this.h == null ? atcl.a : this.h;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0023 A[PHI: r1
      0x0023: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:9:0x0015, B:13:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final int aY() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 52L : 28L), false);
        if (iPeekInt != 0) {
            int i2 = 2;
            if (iPeekInt == 1) {
                i = i2;
            } else if (iPeekInt != 2) {
                i2 = 4;
                if (iPeekInt == 3) {
                    i = i2;
                } else if (iPeekInt == 4) {
                    i = 5;
                }
            } else {
                i = 3;
            }
        } else {
            i = 1;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final int aZ() {
        long j = this.c;
        int i = 0;
        switch (Memory.peekInt(j + (true != a ? 44L : 24L), false)) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0024 A[PHI: r3
      0x0024: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:11:0x0018, B:15:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[PHI: r1
      0x0026: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:9:0x0015, B:13:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final int ba() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 60L : 36L), false);
        if (iPeekInt != 0) {
            int i2 = 2;
            if (iPeekInt != 1) {
                int i3 = 3;
                if (iPeekInt != 2) {
                    i2 = 4;
                    if (iPeekInt != 3) {
                        i3 = 5;
                        if (iPeekInt == 4) {
                            i = i3;
                        } else if (iPeekInt == 5) {
                            i = 6;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    i = i3;
                }
            } else {
                i = i2;
            }
        } else {
            i = 1;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final asxe bb() {
        if (this.j == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.j = new asxe(cp(true != a ? 20 : 56, asxd.a));
        }
        if (this.j != null) {
            return this.j;
        }
        int i = asxe.A;
        return asxc.a;
    }

    public final asxe bc() {
        if (this.i == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.i = new asxe(cp(true != a ? 16 : 48, asxd.a));
        }
        if (this.i != null) {
            return this.i;
        }
        int i = asxe.A;
        return asxc.a;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
