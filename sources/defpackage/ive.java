package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ive implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ admo a;
    public final /* synthetic */ int b;

    public /* synthetic */ ive(admo admoVar, int i, int i2) {
        this.$cid = i2;
        this.a = admoVar;
        this.b = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid == 0) {
            String str = (String) obj;
            aihf aihfVarCreateBuilder = apyy.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            apyy apyyVar = (apyy) aihfVarCreateBuilder.instance;
            apyyVar.c = 1;
            apyyVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            apyy apyyVar2 = (apyy) aihfVarCreateBuilder.instance;
            str.getClass();
            apyyVar2.b |= 2;
            apyyVar2.d = str;
            Optional optionalJ = ivj.J(this.a.getItem(this.b + 1));
            imc imcVar = new imc(aihfVarCreateBuilder, 9);
            if (true == optionalJ.isPresent()) {
                Object obj2 = optionalJ.get();
                aihf aihfVar = (aihf) imcVar.a;
                aihfVar.copyOnWrite();
                apyy apyyVar3 = (apyy) aihfVar.instance;
                apyyVar3.b |= 4;
                apyyVar3.e = (String) obj2;
            }
            return Optional.of((apyy) aihfVarCreateBuilder.build());
        }
        String str2 = (String) obj;
        agrf agrfVar = ijl.ar;
        aihf aihfVarCreateBuilder2 = aote.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aote aoteVar = (aote) aihfVarCreateBuilder2.instance;
        str2.getClass();
        aoteVar.b |= 32;
        aoteVar.f = str2;
        aotd aotdVar = aotd.ACTION_MOVE_VIDEO_BEFORE;
        aihfVarCreateBuilder2.copyOnWrite();
        aote aoteVar2 = (aote) aihfVarCreateBuilder2.instance;
        aoteVar2.d = aotdVar.an;
        aoteVar2.b |= 1;
        Object item = this.a.getItem(this.b + 1);
        if (item != null) {
            Optional optionalO = ijl.O(item);
            hun hunVar = new hun(aihfVarCreateBuilder2, 19);
            if (true == optionalO.isPresent()) {
                Object obj3 = optionalO.get();
                aihf aihfVar2 = (aihf) hunVar.a;
                aihfVar2.copyOnWrite();
                aote aoteVar3 = (aote) aihfVar2.instance;
                aoteVar3.b |= SemanticState.LiveRegion;
                aoteVar3.h = (String) obj3;
            }
        }
        return (aote) aihfVarCreateBuilder2.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
