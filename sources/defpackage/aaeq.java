package defpackage;

import android.content.UriMatcher;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaeq implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aaeq(int i) {
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
                return wfs.g(119, ((aamt) obj).b());
            case 1:
                return aaea.h((String) obj);
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                aihf aihfVarCreateBuilder = InnertubeDrmService$AuthorizedFormat.a.createBuilder();
                akvr akvrVarA = akvr.a(iIntValue);
                if (akvrVarA != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat = (InnertubeDrmService$AuthorizedFormat) aihfVarCreateBuilder.instance;
                    innertubeDrmService$AuthorizedFormat.c = akvrVarA.g;
                    innertubeDrmService$AuthorizedFormat.b |= 1;
                }
                return (InnertubeDrmService$AuthorizedFormat) aihfVarCreateBuilder.build();
            case 3:
                return wfs.g(130, (String) obj);
            case 4:
                return ((aohk) ((weh) obj)).d();
            case 5:
                return wfs.h(((aohl) ((aohi) obj).a.build()).c);
            case 6:
                return (aohi) obj;
            case 7:
                return ((aohq) ((weh) obj)).d();
            case 8:
                return wfs.h(((aohr) ((aoho) obj).a.build()).c);
            case 9:
                return (aoho) obj;
            case 10:
                return wfs.g(198, (String) obj);
            case 11:
                return wfs.h(((aooq) ((aoon) obj).a.build()).c);
            case 12:
                return (aoon) obj;
            case 13:
                return wfs.g(119, (String) obj);
            case 14:
                return ((aqph) ((weh) obj)).d();
            case 15:
                return wfs.h(((aqpi) ((aqpf) obj).a.build()).d);
            case 16:
                return (aqpf) obj;
            case 17:
                return wfs.g(120, (String) obj);
            case 18:
                String str = (String) obj;
                UriMatcher uriMatcher = aaka.a;
                if (uriMatcher.match(Uri.parse(str)) == 1) {
                    aihf aihfVarCreateBuilder2 = akne.a.createBuilder();
                    String strC = aaka.c(str);
                    aihfVarCreateBuilder2.copyOnWrite();
                    akne akneVar = (akne) aihfVarCreateBuilder2.instance;
                    akneVar.b = 1;
                    akneVar.c = strC;
                    return (akne) aihfVarCreateBuilder2.build();
                }
                if (uriMatcher.match(Uri.parse(str)) != 2) {
                    return akne.a;
                }
                aihf aihfVarCreateBuilder3 = akne.a.createBuilder();
                String strC2 = aaka.c(str);
                aihfVarCreateBuilder3.copyOnWrite();
                akne akneVar2 = (akne) aihfVarCreateBuilder3.instance;
                akneVar2.b = 2;
                akneVar2.c = strC2;
                return (akne) aihfVarCreateBuilder3.build();
            case 19:
                return ((aajj) obj).a;
            default:
                return ((aajj) obj).b;
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
