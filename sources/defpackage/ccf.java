package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ccf implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ ccf(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        int i = this.$cid;
        if (i == 0) {
            return Function$CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return Function$CC.$default$andThen(this, function);
        }
        if (i == 2) {
            return Function$CC.$default$andThen(this, function);
        }
        if (i == 3) {
            return Function$CC.$default$andThen(this, function);
        }
        if (i != 4) {
            return i != 5 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = this.a;
            int i3 = cch.b;
            return Integer.valueOf(i2);
        }
        if (i == 1) {
            int i4 = this.a;
            int i5 = cch.b;
            return Integer.valueOf(i4);
        }
        if (i == 2) {
            return Integer.valueOf(this.a);
        }
        if (i == 3) {
            int i6 = rcq.v;
            return (qvc) ((qwm) obj).is().get(this.a);
        }
        if (i == 4) {
            int i7 = rct.f;
            return (qvc) ((qup) obj).is().get(this.a);
        }
        if (i == 5) {
            aihf builder = ((aqmg) obj).toBuilder();
            builder.copyOnWrite();
            aqmg aqmgVar = (aqmg) builder.instance;
            aqmgVar.b |= 2;
            int i8 = this.a;
            aqmgVar.d = i8;
            builder.copyOnWrite();
            aqmg aqmgVar2 = (aqmg) builder.instance;
            aqmgVar2.b |= 4;
            aqmgVar2.e = i8;
            return (aqmg) builder.build();
        }
        alos alosVar = (alos) obj;
        aihf aihfVarCreateBuilder = amvg.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amvg amvgVar = (amvg) aihfVarCreateBuilder.instance;
        amvgVar.c = this.a - 1;
        amvgVar.b |= 1;
        amvg amvgVar2 = (amvg) aihfVarCreateBuilder.build();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alou alouVar2 = alou.a;
        amvgVar2.getClass();
        alouVar.d = amvgVar2;
        alouVar.c = 549;
        return alosVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i == 0) {
            return Function$CC.$default$compose(this, function);
        }
        if (i == 1) {
            return Function$CC.$default$compose(this, function);
        }
        if (i == 2) {
            return Function$CC.$default$compose(this, function);
        }
        if (i == 3) {
            return Function$CC.$default$compose(this, function);
        }
        if (i != 4) {
            return i != 5 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
