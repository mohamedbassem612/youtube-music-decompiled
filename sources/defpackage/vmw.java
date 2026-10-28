package defpackage;

import com.google.protos.youtube.api.innertube.AssetDetail;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import internal.org.jni_zero.CommonApis;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vmw implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vmw(int i) {
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
                return CommonApis.i(obj);
            case 1:
                return ((String) obj).toLowerCase(Locale.ROOT);
            case 2:
                return CommonApis.i(obj);
            case 3:
                return CommonApis.i(obj);
            case 4:
                weh wehVar = ((wff) obj).b;
                wehVar.getClass();
                return wehVar.b();
            case 5:
                return afxw.b((apji) obj);
            case 6:
                return afxw.b((apji) obj);
            case 7:
                return afxw.b((apji) obj);
            case 8:
                return afxw.i((apji) obj);
            case 9:
                agrf agrfVar = wja.a;
                aihf aihfVarCreateBuilder = InnertubeDrmService$AuthorizedFormat.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat = (InnertubeDrmService$AuthorizedFormat) aihfVarCreateBuilder.instance;
                innertubeDrmService$AuthorizedFormat.c = ((akvr) obj).g;
                innertubeDrmService$AuthorizedFormat.b |= 1;
                return (InnertubeDrmService$AuthorizedFormat) aihfVarCreateBuilder.build();
            case 10:
                return ((wgs) obj).v();
            case 11:
                return String.valueOf(((aqdg) obj).L);
            case 12:
                return String.valueOf(((aqdh) obj).l);
            case 13:
                return new HashSet();
            case 14:
                return ((AssetDetail) obj).c;
            case 15:
                return String.valueOf((Integer) obj);
            case 16:
                return ((ajtn) obj).b;
            case 17:
                return new xgj((argn) ((Map.Entry) obj).getKey(), (amud) null);
            case 18:
                return new xgj((argn) ((Map.Entry) obj).getKey(), (amud) null);
            case 19:
                return new xgj((argn) obj, (amud) null);
            default:
                return amjt.a(((Integer) obj).intValue());
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
