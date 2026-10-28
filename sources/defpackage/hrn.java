package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hrn implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hrn(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, weh] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((aamo) obj).d();
            case 1:
                return (String) obj;
            case 2:
                return (String) obj;
            case 3:
                aano aanoVar = new aano(aanp.c);
                aanoVar.d = 26;
                return aanoVar.a();
            case 4:
                return ((aohb) obj).c;
            case 5:
                return aamo.b((aohb) obj);
            case 6:
                agrf agrfVar = hsn.a;
                allp allpVar = ((allo) obj).d;
                if (allpVar == null) {
                    allpVar = allp.a;
                }
                return afxw.u(allpVar);
            case 7:
                allt alltVar = ((allo) obj).c;
                return alltVar == null ? allt.a : alltVar;
            case 8:
                return (String) ((Optional) obj).get();
            case 9:
                return wfs.h(((hcg) obj).a.get().b());
            case 10:
                return (hcg) obj;
            case 11:
                return wfs.h((String) obj);
            case 12:
                return ((aamo) obj).d();
            case 13:
                return kro.at((String) obj);
            case 14:
                aohb aohbVar = ((aohc) obj).c;
                if (aohbVar == null) {
                    aohbVar = aohb.a;
                }
                return aamo.b(aohbVar);
            case 15:
                return ((aamo) obj).d();
            case 16:
                return kro.ay((String) obj);
            case 17:
                return kyr.B(obj);
            case 18:
                return kyr.B(obj);
            case 19:
                return kyr.B(obj);
            default:
                return kyr.B(obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
