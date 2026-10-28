package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class acfa implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acfa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [agek, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((acex) obj).a.q(((acfg) this.a).e);
            case 1:
                abvw abvwVar = (abvw) obj;
                abvz abvzVar = abvwVar.a;
                return new abmk(new acex(abvzVar.a(), abvzVar.b(), abvwVar.c), new abvv(this.a, abvwVar.b, abvwVar, 1));
            case 2:
                return (acfs) ((acfg) this.a).u.get((String) obj);
            case 3:
                return this.a.invoke(obj);
            case 4:
                return this.a;
            case 5:
                return this.a;
            case 6:
                return this.a.invoke(obj);
            default:
                return this.a.apply((anfv) obj);
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
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
