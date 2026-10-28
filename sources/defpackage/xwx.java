package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xwx implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xwx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 8;
        int i2 = 4;
        switch (this.$cid) {
            case 0:
                return (wjf) obj;
            case 1:
                return ((acip) obj).Z();
            case 2:
                return ((acip) obj).aj();
            case 3:
                agrf agrfVar = yam.a;
                return Boolean.FALSE;
            case 4:
                agrf agrfVar2 = yam.a;
                return Boolean.TRUE;
            case 5:
                agrf agrfVar3 = yam.a;
                return Boolean.FALSE;
            case 6:
                aihf aihfVarCreateBuilder = atpe.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar = (atpe) aihfVarCreateBuilder.instance;
                atpeVar.b |= 1;
                atpeVar.c = -1;
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar2 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar2.b |= SemanticState.Obscured;
                atpeVar2.m = "";
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar3 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar3.b |= 4;
                atpeVar3.e = -1L;
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar4 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar4.b |= 8;
                atpeVar4.f = -1L;
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar5 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar5.b |= 32;
                atpeVar5.g = "";
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar6 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar6.b |= SemanticState.Focused;
                atpeVar6.h = "";
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar7 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar7.b |= 2;
                atpeVar7.d = -1;
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar8 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar8.b |= SemanticState.Hidden;
                atpeVar8.i = "";
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar9 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar9.b |= SemanticState.LiveRegion;
                atpeVar9.j = 0;
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar10 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar10.b |= SemanticState.Modal;
                atpeVar10.l = -1L;
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar11 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar11.b |= SemanticState.ReadOnly;
                atpeVar11.k = -1L;
                aihfVarCreateBuilder.copyOnWrite();
                atpe atpeVar12 = (atpe) aihfVarCreateBuilder.instance;
                atpeVar12.b |= SemanticState.Multiline;
                atpeVar12.n = -1;
                return (atpe) aihfVarCreateBuilder.build();
            case 7:
                return ((atpm) obj).b;
            case 8:
                int i3 = zjr.L;
                aihf builder = ((atpl) obj).toBuilder();
                builder.copyOnWrite();
                ((atpl) builder.instance).b().clear();
                return (atpl) builder.build();
            case 9:
                return tnx.d((toe) obj);
            case 10:
                return (pnq) ((tnx) obj).c().a;
            case 11:
                return ((zzy) obj).a;
            case 12:
                return awmy.a;
            case 13:
                return new Exception((Throwable) obj);
            case 14:
                return new Exception((Throwable) obj);
            case 15:
                agrf agrfVar4 = aady.a;
                return agdf.a;
            case 16:
                return (agkj) Collection.EL.stream((agkz) obj).map(new aaeq(i2)).collect(aghu.a(new aaeq(5), new aaeq(6)));
            case 17:
                return (agkj) Collection.EL.stream((agkz) obj).map(new aaeq(7)).collect(aghu.a(new aaeq(i), new aaeq(9)));
            case 18:
                return (agkj) Collection.EL.stream((agkz) obj).map(new aaeq(14)).collect(aghu.a(new aaeq(15), new aaeq(16)));
            case 19:
                return aakb.c((uc) obj);
            default:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((java.util.Collection) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((aamj) it.next()).a);
                }
                return arrayList;
        }
    }
}
