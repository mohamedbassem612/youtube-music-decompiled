package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qjj {
    public static final qjj a;
    public static final qjj b = new qjj(-1, 3);
    private static final int[] e;
    public final int c;
    public final int d;

    static {
        int[] iArr = {1, 10, 100, 1000, 10000, 100000, 1000000};
        e = iArr;
        a = new qjj(iArr[3], 3);
    }

    public qjj(int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
    }

    public static qjj b(axhi axhiVar) {
        int i;
        int i2 = axhiVar.c;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 2) {
            i = i2 != 4 ? 0 : 2;
        } else {
            i = 1;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                return new qjj((i2 == 4 ? (axhh) axhiVar.d : axhh.a).c, (axhiVar.c == 4 ? (axhh) axhiVar.d : axhh.a).d);
            }
            if (i3 != 2) {
                throw new RuntimeException(null, null);
            }
        }
        return new qjj(i2 == 2 ? ((Integer) axhiVar.d).intValue() : 0, 3);
    }

    public final int a() {
        int i = this.d;
        return i < 7 ? e[i] : (int) Math.pow(10.0d, i);
    }

    public final boolean c(double d) {
        return d * ((double) a()) < ((double) this.c);
    }

    public final boolean d() {
        return this.c == a();
    }

    public final boolean e() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjj) {
            qjj qjjVar = (qjj) obj;
            if (this.c == qjjVar.c && this.d == qjjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.c == -1;
    }

    final void g(aihf aihfVar) {
        if (e()) {
            int i = this.c;
            aihfVar.copyOnWrite();
            axhi axhiVar = (axhi) aihfVar.instance;
            axhi axhiVar2 = axhi.a;
            axhiVar.c = 2;
            axhiVar.d = Integer.valueOf(i);
            return;
        }
        aihf aihfVarCreateBuilder = axhh.a.createBuilder();
        int i2 = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        axhh axhhVar = (axhh) aihfVarCreateBuilder.instance;
        axhhVar.b |= 1;
        axhhVar.c = i2;
        int i3 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        axhh axhhVar2 = (axhh) aihfVarCreateBuilder.instance;
        axhhVar2.b |= 2;
        axhhVar2.d = i3;
        aihfVar.copyOnWrite();
        axhi axhiVar3 = (axhi) aihfVar.instance;
        axhh axhhVar3 = (axhh) aihfVarCreateBuilder.build();
        axhi axhiVar4 = axhi.a;
        axhhVar3.getClass();
        axhiVar3.d = axhhVar3;
        axhiVar3.c = 4;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
