package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yoc {
    public static final yog a = new yog(3, 2);
    public static final yog b = new yog(3, 1);
    public static final yog c = new yog(4, 2);
    public static final yog d = new yog(4, 1);
    public static final yog e = new yog(2160, 144);
    public static final yog f = new yog(4320, 144);
    public final yog g;
    public final yog h;
    public final boolean i;
    public final String j;
    public final int k;
    public final int l;
    public final long m;
    public final int n;
    public final int o;
    public final zkj p;

    public yoc(yog yogVar, yog yogVar2, boolean z, String str, int i, int i2, long j, int i3, int i4, zkj zkjVar) {
        zkf.d(yogVar);
        this.g = yogVar;
        zkf.d(yogVar2);
        this.h = yogVar2;
        this.i = z;
        this.j = str;
        this.k = i;
        this.l = i2;
        this.m = j;
        this.n = i3;
        this.o = i4;
        this.p = zkjVar;
    }

    public final yoc a(int i) {
        return new yoc(new yog(i, i, 2, agpr.a), this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, null);
    }

    public final String b() {
        int i = this.k;
        if (i == -1) {
            return "none";
        }
        long j = this.m;
        if (j == -1) {
            return "none";
        }
        long jRound = Math.round(Math.pow(1.6d, Math.round(Math.log(j / 1000) / 0.47000362924573563d)));
        int i2 = this.l;
        return "dt." + jRound + ";lmq." + i + ";dir." + (i2 != -2 ? String.valueOf(i2) : "none");
    }

    public final boolean c(int i) {
        return (this.o & i) > 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yoc)) {
            return false;
        }
        yoc yocVar = (yoc) obj;
        return Objects.equals(this.g, yocVar.g) && Objects.equals(this.h, yocVar.h) && Objects.equals(this.j, yocVar.j) && this.i == yocVar.i;
    }

    public final int hashCode() {
        return ((((this.g.hashCode() + 5363) * 31) + this.h.hashCode()) * 31) + (true != this.i ? 0 : 313);
    }

    public yoc(yog yogVar) {
        this(yogVar, a, false, "", -1, -2, -1L, Alert.DURATION_SHOW_INDEFINITELY, 0, null);
    }
}
