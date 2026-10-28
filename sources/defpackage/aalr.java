package defpackage;

import internal.org.jni_zero.CommonApis;
import j$.util.function.Function$CC;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aalr implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aalr(int i) {
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return (aohq) obj;
            case 1:
                return wfs.h(((aohq) obj).b());
            case 2:
                return ((aamj) obj).a.a;
            case 3:
                return ((aanq) obj).d();
            case 4:
                return ((aamh) obj).a;
            case 5:
                aohe aoheVar = (aohe) obj;
                return aarj.d(wfs.g(76, aoheVar.b), aoheVar.c);
            case 6:
                return aarq.e(((aaro) obj).e);
            case 7:
                return ((aaro) obj).a();
            case 8:
                return ((aamw) obj).a;
            case 9:
                return (aamw) obj;
            case 10:
                return aazy.a((acca) obj);
            case 11:
                return aazz.a((wiw) obj);
            case 12:
                wgo wgoVar = (wgo) obj;
                aihf aihfVarCreateBuilder = ajhl.a.createBuilder();
                String str = wgoVar.a;
                aihfVarCreateBuilder.copyOnWrite();
                ajhl ajhlVar = (ajhl) aihfVarCreateBuilder.instance;
                str.getClass();
                ajhlVar.b |= 2;
                ajhlVar.d = str;
                String str2 = wgoVar.b;
                aihfVarCreateBuilder.copyOnWrite();
                ajhl ajhlVar2 = (ajhl) aihfVarCreateBuilder.instance;
                str2.getClass();
                ajhlVar2.b |= 1;
                ajhlVar2.c = str2;
                boolean z = wgoVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                ajhl ajhlVar3 = (ajhl) aihfVarCreateBuilder.instance;
                ajhlVar3.b |= 8;
                ajhlVar3.f = z;
                return (ajhl) aihfVarCreateBuilder.build();
            case 13:
                return new CopyOnWriteArrayList();
            case 14:
                return CommonApis.i(obj);
            case 15:
                return (aret) ((weh) obj);
            case 16:
                return ((abnx) obj).d;
            case 17:
                return new zj((byte[]) null, (char[]) null);
            case 18:
                return ((abmk) obj).a;
            case 19:
                return ((abqh) obj).getClass();
            default:
                return ((abqh) obj).b;
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
