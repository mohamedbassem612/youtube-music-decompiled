package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adha implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adha(Object obj, int i) {
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
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [adkz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return (alae) ((adhf) this.a).d.get((String) obj);
            case 1:
                return this.a.invoke(obj);
            case 2:
                return (alae) this.a.get((String) obj);
            case 3:
                return Boolean.valueOf(((ci) obj).aa(this.a.d(0)));
            case 4:
                return ((avlr) obj).ag(new adsm((adsr) this.a), new achk(5));
            case 5:
                return ((avlr) obj).ag(new acym(this.a, 6), new acrr(10));
            case 6:
                return Integer.valueOf(((aeaa) this.a).f.getResources().getDimensionPixelOffset(((Integer) obj).intValue()));
            case 7:
                return ((abgo) this.a).b((String) obj);
            case 8:
                return ((avlr) obj).af(new acym(this.a, 7));
            case 9:
                try {
                    return Optional.of((anhz) aihn.parseFrom(anhz.a, (byte[]) obj, ExtensionRegistryLite.getGeneratedRegistry()));
                } catch (aiik e) {
                    Object obj2 = this.a;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                    zvjVarA.j = 51;
                    String message = e.getMessage() == null ? "no error message" : e.getMessage();
                    zvl zvlVar = ((aegs) obj2).k;
                    zvjVarA.d("InvalidProtocolBufferException while decoding MiniAppMetadata for parseMiniAppWebToNativeParams: ".concat(String.valueOf(message)));
                    zvlVar.a(zvjVarA.a());
                    return Optional.empty();
                }
            default:
                return Integer.valueOf(((Integer) obj).intValue() + ((aeoh) this.a).g);
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
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
