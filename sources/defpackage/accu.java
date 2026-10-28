package defpackage;

import internal.org.jni_zero.CommonApis;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class accu implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ accu(int i) {
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
                return (String) ((Map.Entry) obj).getKey();
            case 1:
                return ((acca) obj).a;
            case 2:
                return ((aciu) obj).d();
            case 3:
                return ((acra) obj).c().U;
            case 4:
                return ((acra) obj).c().o;
            case 5:
                return afxw.b((apji) obj);
            case 6:
                return ((asmv) obj).toByteString();
            case 7:
                aihh aihhVar = (aihh) akrn.a.createBuilder();
                int i = acxu.a;
                aihhVar.e(arrj.a, (aigj) obj);
                return new acxm((akrn) aihhVar.build());
            case 8:
                return ((alae) obj).c;
            case 9:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(alaf.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                return (alae) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            case 10:
                return CommonApis.i(obj);
            case 11:
                Runnable runnable = (Runnable) obj;
                return runnable instanceof Comparable ? new adjs(runnable) : afwl.i(runnable);
            case 12:
                return axlj.F();
            case 13:
                return axlj.F();
            case 14:
                return axlj.F();
            case 15:
                return axlj.F();
            case 16:
                String strAv = adsr.av((advc) obj);
                return strAv != null ? Stream.CC.of(strAv) : Stream.CC.empty();
            case 17:
                return ((abfv) obj).a;
            case 18:
                return ((Optional) obj).get();
            case 19:
                atxp atxpVar = adxz.a;
                return (advj) ((advc) obj);
            default:
                atxp atxpVar2 = adxz.a;
                return new HashMap();
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
