package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class veo implements Function {
    public abstract void a(auha auhaVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        auha auhaVar = (auha) obj;
        aihf aihfVarB = b();
        if ((auhaVar.b & 1) != 0) {
            String str = auhaVar.c;
            aihfVarB.copyOnWrite();
            akqj akqjVar = (akqj) aihfVarB.instance;
            akqj akqjVar2 = akqj.a;
            str.getClass();
            akqjVar.b |= 1;
            akqjVar.c = str;
        }
        a(auhaVar, aihfVarB);
        if ((auhaVar.b & 2) != 0) {
            Function function = vfl.a;
            aqae aqaeVar = auhaVar.d;
            if (aqaeVar == null) {
                aqaeVar = aqae.a;
            }
            akqi akqiVar = (akqi) function.apply(aqaeVar);
            aihfVarB.copyOnWrite();
            akqj akqjVar3 = (akqj) aihfVarB.instance;
            akqj akqjVar4 = akqj.a;
            akqiVar.getClass();
            akqjVar3.f = akqiVar;
            akqjVar3.b |= 16;
        }
        return (akqj) aihfVarB.build();
    }

    public aihf b() {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
