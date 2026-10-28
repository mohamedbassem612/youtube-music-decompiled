package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aact implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ aact(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid != 0) {
            return wfs.g(this.a, wfs.h((String) obj));
        }
        aihf aihfVarCreateBuilder = aofh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
        aofhVar.c = 3;
        aofhVar.b |= 1;
        String strG = wfs.g(this.a, (String) obj);
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
        strG.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strG;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = 100;
        aofg aofgVar2 = (aofg) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
        aofgVar2.getClass();
        aofhVar3.e = aofgVar2;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
