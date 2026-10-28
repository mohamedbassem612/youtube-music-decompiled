package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zyr implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        tnd tndVar = (tnd) obj;
        aihf aihfVarCreateBuilder = atxm.a.createBuilder();
        String str = tndVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        atxm atxmVar = (atxm) aihfVarCreateBuilder.instance;
        str.getClass();
        atxmVar.b = str;
        String str2 = tndVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        atxm atxmVar2 = (atxm) aihfVarCreateBuilder.instance;
        str2.getClass();
        atxmVar2.c = str2;
        return (atxm) aihfVarCreateBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
