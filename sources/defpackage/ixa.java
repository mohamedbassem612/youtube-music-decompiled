package defpackage;

import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ixa implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ixa(int i) {
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
        Object stackTraceElement;
        switch (this.$cid) {
            case 0:
                aihh aihhVar = (aihh) apji.a.createBuilder();
                aihhVar.e(anzo.a, (anzn) obj);
                return (apji) aihhVar.build();
            case 1:
                return wfs.h((String) obj);
            case 2:
                return afxw.s(obj);
            case 3:
                return (iyn) ((advc) obj);
            case 4:
                ajsy ajsyVar = (ajsy) obj;
                ajsyVar.getClass();
                return ajsyVar;
            case 5:
                return afxw.r((apji) obj);
            case 6:
                return ((jjv) obj).a.c;
            case 7:
                return ((jjv) obj).a.c;
            case 8:
                return ((jjv) obj).a.c;
            case 9:
                ajwo ajwoVar = ((alba) obj).l;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            case 10:
                agsn agsnVar = joz.a;
                aihh aihhVar2 = (aihh) apji.a.createBuilder();
                aihl aihlVar = anpw.a;
                anpv anpvVar = ((ajkc) obj).d;
                if (anpvVar == null) {
                    anpvVar = anpv.b;
                }
                aihhVar2.e(aihlVar, anpvVar);
                return (apji) aihhVar2.build();
            case 11:
                kjy kjyVar = new kjy((kjz) obj);
                kjyVar.c(true);
                return kjyVar.a();
            case 12:
                return ((kjz) obj).a;
            case 13:
                return ((kjz) obj).b;
            case 14:
                return Stream.CC.ofNullable(((kid) obj).b());
            case 15:
                ahac ahacVar = (ahac) obj;
                stackTraceElement = new StackTraceElement(ahacVar.c, ahacVar.d, ahacVar.e, ahacVar.f);
                break;
            case 16:
                ahac ahacVar2 = (ahac) obj;
                stackTraceElement = new StackTraceElement(ahacVar2.c, ahacVar2.d, ahacVar2.e, ahacVar2.f);
                break;
            case 17:
                aihl aihlVar2 = arnq.b;
                aihlVar2.getClass();
                return Integer.valueOf(aihlVar2.a());
            case 18:
                stackTraceElement = new nzd((aslg) obj);
                break;
            case 19:
                return (oin) obj;
            default:
                int i = osy.a;
                return new osx();
        }
        return stackTraceElement;
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
