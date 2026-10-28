package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeqt {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/systemhealth/jank/PrimesJankCapturer");
    private static final qci c = new qci("VE-S");
    private static final qci d = new qci("com.android.youtube-home-scroll-jank");
    private static final qci e = new qci("com.android.youtube-shorts-scroll-jank");
    public final Optional a;
    private final awmd f;
    private final awmd g;
    private final boolean h;
    private final boolean i;
    private final vxz j;

    public aeqt(awmd awmdVar, aetb aetbVar, awmd awmdVar2, Optional optional, vxz vxzVar) {
        this.f = awmdVar;
        this.g = awmdVar2;
        aqiu aqiuVar = aetbVar.io().g;
        aqiv aqivVar = (aqiuVar == null ? aqiu.a : aqiuVar).c;
        this.i = (aqivVar == null ? aqiv.a : aqivVar).d;
        aqiu aqiuVar2 = aetbVar.io().g;
        this.h = (aqiuVar2 == null ? aqiu.a : aqiuVar2).b;
        this.a = optional;
        this.j = vxzVar;
    }

    public final void b(int i) {
        if (g(i)) {
            ((qgy) this.f.io()).c(c);
        }
    }

    public final void c(aeqs aeqsVar) {
        if (this.i && this.h) {
            Object obj = ((axlj) this.g.io()).c;
            int i = ((aeqp) aeqsVar).f;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            boolean[] zArr = (boolean[]) obj;
            if (i2 >= zArr.length || !zArr[i2]) {
                return;
            }
            ((qgy) this.f.io()).c(aeqsVar.a());
        }
    }

    public final void d(apft apftVar) {
        if (f(apftVar)) {
            ((qgy) this.f.io()).c(c);
        }
    }

    public final void e(aeqs aeqsVar) {
        qgy qgyVar = (qgy) this.f.io();
        qci qciVarA = aeqsVar.a();
        qgw qgwVarA = qgx.a();
        qgwVarA.b(qciVarA);
        qgwVarA.a = null;
        qgyVar.b(qgwVarA.a());
    }

    public final boolean f(apft apftVar) {
        if (this.h) {
            if (((Boolean) Objects.requireNonNullElse((Boolean) ((agu) ((axlj) this.g.io()).b).a(Integer.valueOf(apftVar.g)), Boolean.FALSE)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i) {
        if (this.h) {
            if (((Boolean) Objects.requireNonNullElse((Boolean) ((agu) ((axlj) this.g.io()).a).a(Integer.valueOf(i)), Boolean.FALSE)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void h(Supplier supplier, int i) {
        qgw qgwVarA = qgx.a();
        qgwVarA.b(c);
        qgwVarA.a = (axgh) supplier.get();
        qgwVarA.g();
        vxz vxzVar = this.j;
        qgwVarA.f(vxzVar.l(154, 45732532L, false));
        if (i == 37414) {
            if (vxzVar.c(30, 45706057L, 0L) > 0 && vxzVar.c(31, 45706062L, 0L) > 0) {
                qgwVarA.c(e);
                qgwVarA.e(Double.valueOf(vxzVar.c(30, 45706057L, 0L) / 1000.0d));
                qgwVarA.d(Duration.ofMillis(vxzVar.c(31, 45706062L, 0L)));
            }
        } else if (i == 3854 && vxzVar.c(32, 45706069L, 0L) > 0 && vxzVar.c(33, 45706076L, 0L) > 0) {
            qgwVarA.c(d);
            qgwVarA.e(Double.valueOf(vxzVar.c(32, 45706069L, 0L) / 1000.0d));
            qgwVarA.d(Duration.ofMillis(vxzVar.c(33, 45706076L, 0L)));
        }
        taf.j(((qgy) this.f.io()).b(qgwVarA.a()), new abwu(20));
    }
}
