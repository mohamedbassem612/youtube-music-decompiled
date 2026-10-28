package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hpm implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hpm(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
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
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r7v1, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v3, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        long j;
        switch (this.$cid) {
            case 0:
                return gzj.ax(this.a, this.b, this.c);
            case 1:
                return ((hin) ((his) this.a).a.k.io()).i((amzx) obj, this.c, (zne) this.b);
            case 2:
                return gzj.ax(this.a, this.b, this.c);
            case 3:
                return ((hsr) this.a).a.m(((aamo) obj).d(), (String) this.c, null, (aogf) this.b, 7);
            case 4:
                aaqb aaqbVar = (aaqb) obj;
                Object obj2 = this.a;
                if (obj2 == null) {
                    j = 0;
                } else {
                    aofu aofuVar = ((aamj) obj2).a.h;
                    aofuVar.getClass();
                    j = aofuVar.i;
                }
                Object obj3 = this.b;
                List list = aaqbVar.d;
                aihf aihfVarCreateBuilder = altw.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                altw altwVar = (altw) aihfVarCreateBuilder.instance;
                obj3.getClass();
                altwVar.b |= 1;
                altwVar.c = (String) obj3;
                aihfVarCreateBuilder.copyOnWrite();
                altw altwVar2 = (altw) aihfVarCreateBuilder.instance;
                altwVar2.b |= 2;
                altwVar2.e = j;
                aihfVarCreateBuilder.copyOnWrite();
                altw altwVar3 = (altw) aihfVarCreateBuilder.instance;
                aiie aiieVar = altwVar3.d;
                if (!aiieVar.c()) {
                    altwVar3.d = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(this.c, altwVar3.d);
                list.add((altw) aihfVarCreateBuilder.build());
                return aaqbVar;
            case 5:
                return (anzi) ((itq) this.a).h.ap((Class) this.c, anzi.class, obj, (agkj) this.b);
            case 6:
                return (anzn) ((itq) this.a).h.ap((Class) this.c, anzn.class, obj, (agkj) this.b);
            case 7:
                int i = otk.d;
                Context context = (Context) this.a;
                return Integer.valueOf(context.getResources().getIdentifier((String) this.b, (String) this.c, context.getPackageName()));
            case 8:
                agrf agrfVar = uql.a;
                return new uul(((Long) obj).longValue(), (Optional) this.a, (Optional) this.b, (Optional) this.c);
            default:
                return ygx.E((yez) obj, (ygt) this.b, ((ygl) this.a).b(), ((ygx) this.c).q);
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
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ hpm(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hpm(String str, List list, aamj aamjVar, int i) {
        this.$cid = i;
        this.b = str;
        this.c = list;
        this.a = aamjVar;
    }

    public /* synthetic */ hpm(ygx ygxVar, ygt ygtVar, ygl yglVar, int i) {
        this.$cid = i;
        this.c = ygxVar;
        this.b = ygtVar;
        this.a = yglVar;
    }
}
