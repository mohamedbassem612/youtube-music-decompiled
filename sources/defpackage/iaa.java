package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iaa implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iaa(int i) {
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
                return ((annv) obj).f();
            case 1:
                return wfs.h((String) obj);
            case 2:
                return ((annv) obj).k();
            case 3:
                return wfs.h((String) obj);
            case 4:
                return ((annv) obj).h();
            case 5:
                return ((annv) obj).f();
            case 6:
                return ((annv) obj).k();
            case 7:
                return ((aret) obj).b();
            case 8:
                return ((Optional) obj).stream();
            case 9:
                return ((weh) obj).b();
            case 10:
                return afxw.s(obj);
            case 11:
                return ((hyz) obj).t();
            case 12:
                return Collection.EL.stream((List) obj);
            case 13:
                aihf builder = ((aily) obj).toBuilder();
                builder.copyOnWrite();
                aily ailyVar = (aily) builder.instance;
                ailyVar.b |= 64;
                ailyVar.i = 0L;
                return (aily) builder.build();
            case 14:
                return aily.a.createBuilder();
            case 15:
                return ((anyx) obj).getVideoId();
            case 16:
                return rpi.Q((Optional) obj);
            case 17:
                ajwo ajwoVar = ((anzs) obj).f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                return gzj.R(ajwoVar);
            case 18:
                return ((hyz) obj).t();
            case 19:
                anzi anziVar = (anzi) obj;
                aihf aihfVarCreateBuilder = anwv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                anwv anwvVar = (anwv) aihfVarCreateBuilder.instance;
                anziVar.getClass();
                anwvVar.d = anziVar;
                anwvVar.b |= 262144;
                return (anwv) aihfVarCreateBuilder.build();
            default:
                return ((gzn) obj).n;
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
