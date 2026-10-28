package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ure implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ure(uqx uqxVar, qub qubVar, auhs auhsVar, Size size, int i) {
        this.$cid = i;
        this.b = uqxVar;
        this.a = qubVar;
        this.c = auhsVar;
        this.d = size;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        xsc xscVar;
        Optional optionalEmpty;
        if (this.$cid == 0) {
            Double d = (Double) obj;
            Optional optionalOf = Optional.of(d);
            double dDoubleValue = d.doubleValue();
            Object obj2 = this.a;
            Optional optionalEmpty2 = Optional.empty();
            return new urm((Optional) this.b, (Optional) this.c, optionalOf, new agqj(xsc.O((Size) ((xsc) obj2).b, dDoubleValue, (Point) this.d, optionalEmpty2)));
        }
        augy augyVar = (augy) obj;
        uqu uquVar = new uqu();
        qub qubVar = (qub) this.a;
        uquVar.a = qubVar.a;
        Rect rect = qubVar.b;
        uquVar.b = new Size(rect.width(), rect.height());
        uquVar.e(augyVar);
        uquVar.c = urn.a();
        uquVar.f(true);
        uquVar.d(false);
        uquVar.c(agpr.a);
        uquVar.d = usj.b(usj.g((auhs) this.c, augyVar.e));
        uqx uqxVar = (uqx) this.b;
        boolean zIsPresent = uqxVar.d.isPresent();
        Object obj3 = this.d;
        if (zIsPresent) {
            xscVar = new xsc(Optional.of(uqp.a((akgx) uqxVar.d.get(), uqxVar.i)), Optional.empty(), (Size) obj3);
        } else {
            xscVar = new xsc(Optional.empty(), uqxVar.e, (Size) obj3);
        }
        uquVar.g = xscVar;
        if (uqxVar.f.isEmpty() || uqxVar.d.isEmpty()) {
            optionalEmpty = Optional.empty();
        } else {
            Object obj4 = uqxVar.d.get();
            DisplayMetrics displayMetrics = uqxVar.i;
            uqp uqpVarA = uqp.a((akgx) obj4, displayMetrics);
            Object obj5 = uqxVar.f.get();
            Object obj6 = uqxVar.f.get();
            int iGz = yno.gz((akgx) uqxVar.d.get(), displayMetrics);
            float f = ((akgs) obj6).b;
            agrf agrfVar = twm.a;
            optionalEmpty = Optional.of(new urd(uqpVarA, new uqm((akgs) obj5, Math.max(iGz, (int) TypedValue.applyDimension(1, f, displayMetrics))), (Size) obj3));
        }
        uquVar.e = optionalEmpty;
        if (obj3 == null) {
            throw new NullPointerException("Null playerDimensions");
        }
        uquVar.f = (Size) obj3;
        return uquVar.a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ ure(xsc xscVar, Optional optional, Optional optional2, Point point, int i) {
        this.$cid = i;
        this.a = xscVar;
        this.b = optional;
        this.c = optional2;
        this.d = point;
    }
}
