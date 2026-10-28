package defpackage;

import internal.org.jni_zero.CommonApis;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aegf implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aegf(int i) {
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
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return new CopyOnWriteArrayList();
            case 1:
                atxp atxpVar = adxz.a;
                return new HashMap();
            case 2:
                return CommonApis.i(obj);
            case 3:
                apsr apsrVar = (apsr) obj;
                aihf aihfVarCreateBuilder = akgq.a.createBuilder();
                String str = (apsrVar.b == 4 ? (apse) apsrVar.c : apse.a).d;
                aihfVarCreateBuilder.copyOnWrite();
                akgq akgqVar = (akgq) aihfVarCreateBuilder.instance;
                str.getClass();
                akgqVar.b |= 1;
                akgqVar.c = str;
                return (akgq) aihfVarCreateBuilder.build();
            case 4:
                return Long.valueOf(((Integer) obj).intValue() * 1000);
            case 5:
                return Long.valueOf(qti.b((String) obj));
            case 6:
                return ((afsa) obj).b.b();
            case 7:
                return agkj.h((LinkedHashMap) obj);
            case 8:
                return ((agld) obj).b();
            case 9:
                ahgr ahgrVar = (ahgr) obj;
                Collector collector = agol.a;
                if (ahgrVar.b == null) {
                    throw new NoSuchElementException();
                }
                if (!ahgrVar.a.isEmpty()) {
                    throw ahgrVar.a(false);
                }
                Object obj2 = ahgrVar.b;
                if (obj2 != agol.b) {
                    return obj2;
                }
                return null;
            case 10:
                ahgr ahgrVar2 = (ahgr) obj;
                if (ahgrVar2.a.isEmpty()) {
                    return Optional.ofNullable(ahgrVar2.b);
                }
                throw ahgrVar2.a(false);
            case 11:
                return ((Optional) obj).orElse(null);
            case 12:
                return ((Map.Entry) obj).getKey();
            case 13:
                return ((Map.Entry) obj).getValue();
            default:
                return new ArrayList();
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
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
