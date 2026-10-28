package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yod implements yoe {
    public static final yod a = new yod(new wgs[0], new wgs[0], new wgs(alaw.b, null, false, null), new wiw[0], new wgo[0], yog.a, new yoc(yog.a), Alert.DURATION_SHOW_INDEFINITELY, false, false, false);
    public final wgs[] b;
    public final wgs[] c;
    public final wgs d;
    public final wiw[] e;
    public final wgo[] f;
    public final yog g;
    public final int h;
    public final boolean i;
    private final yoc j;
    private final boolean k;
    private final boolean l;

    public yod(wgs[] wgsVarArr, wgs[] wgsVarArr2, wgs wgsVar, wiw[] wiwVarArr, wgo[] wgoVarArr, yog yogVar, yoc yocVar, int i, boolean z, boolean z2, boolean z3) {
        zkf.d(wgsVarArr);
        this.b = wgsVarArr;
        zkf.d(wgsVarArr2);
        this.c = wgsVarArr2;
        this.d = wgsVar;
        zkf.d(wiwVarArr);
        this.e = wiwVarArr;
        zkf.d(wgoVarArr);
        this.f = wgoVarArr;
        zkf.d(yogVar);
        this.g = yogVar;
        zkf.d(yocVar);
        this.j = yocVar;
        this.h = i;
        this.i = z;
        this.k = z2;
        this.l = z3;
    }

    @Override // defpackage.yoe
    public final float a() {
        wgs[] wgsVarArr = this.b;
        if (wgsVarArr.length <= 0) {
            return 0.0f;
        }
        return wgsVarArr[0].c();
    }

    @Override // defpackage.yoe
    public final yog b() {
        return this.j.h;
    }

    @Override // defpackage.yoe
    public final yog c() {
        return this.g;
    }

    @Override // defpackage.yoe
    public final String d() {
        return this.j.j;
    }

    @Override // defpackage.yoe
    public final String e() {
        return this.j.b();
    }

    @Override // defpackage.yoe
    public final ArrayList f() {
        return zic.e(this.c);
    }

    @Override // defpackage.yoe
    public final ArrayList g() {
        return zic.e(n());
    }

    @Override // defpackage.yoe
    public final boolean h() {
        return this.j.c(64);
    }

    @Override // defpackage.yoe
    public final boolean i() {
        return this.c.length > 0;
    }

    @Override // defpackage.yoe
    public final boolean j() {
        for (wgs wgsVar : this.c) {
            if (wir.z().contains(Integer.valueOf(wgsVar.e()))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yoe
    public final boolean k() {
        return this.b.length > 0;
    }

    @Override // defpackage.yoe
    public final boolean l() {
        wgs wgsVar = this.d;
        if (wgsVar != null) {
            return wir.C().contains(Integer.valueOf(wgsVar.e())) || wir.d().contains(Integer.valueOf(wgsVar.e()));
        }
        return false;
    }

    @Override // defpackage.yoe
    public final wgo[] m() {
        return this.f;
    }

    public final wgs[] n() {
        return (wgs[]) this.g.b(Arrays.asList(this.b), this.k, this.l).toArray(new wgs[0]);
    }

    @Override // defpackage.yoe
    public final wiw[] o() {
        return this.e;
    }
}
