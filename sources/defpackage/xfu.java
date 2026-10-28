package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xfu implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ xfu(int i, int i2, int i3) {
        this.$cid = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid != 0) {
            aihf builder = ((aily) obj).toBuilder();
            builder.copyOnWrite();
            aily ailyVar = (aily) builder.instance;
            ailyVar.b |= 2;
            ailyVar.d = this.a;
            builder.copyOnWrite();
            aily ailyVar2 = (aily) builder.instance;
            ailyVar2.b |= 4;
            ailyVar2.e = this.b;
            return (aily) builder.build();
        }
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
        argnVar2.b |= 4;
        argnVar2.e = 0;
        int iAbs = Math.abs(this.b);
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
        argnVar3.b |= 8;
        argnVar3.f = iAbs;
        return (argn) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
