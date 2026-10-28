package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hpa implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hpa(int i) {
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
                aigj aigjVar = hpb.a;
                return kro.aI(wfs.h((String) obj));
            case 1:
                aigj aigjVar2 = hpb.a;
                return rpi.Q((Optional) obj);
            case 2:
                return ((anyo) obj).getLastPlaybackTimestampMillis();
            case 3:
                return ((anyo) obj).getAddedTimestampMillis();
            case 4:
                return ((annv) obj).h();
            case 5:
                return Collection.EL.stream((List) obj);
            case 6:
                try {
                    return Optional.of((hcg) ahng.v((ListenableFuture) obj));
                } catch (ExecutionException e) {
                    ((agrc) ((agrc) ((agrc) hpk.a.b()).j(e)).k("com/google/android/apps/youtube/music/offline/compat/DownloadsLibraryUtil", "getDownloadsLibrary", (char) 214, "DownloadsLibraryUtil.java")).t("Error getting singleTrackContainers");
                    return Optional.empty();
                }
            case 7:
                return ((anyx) obj).g();
            case 8:
                return ((hth) obj).a();
            case 9:
                return rpi.Q((Optional) obj);
            case 10:
                return wfs.h((String) obj);
            case 11:
                return (anuk) ((Optional) obj).get();
            case 12:
                return ((annv) obj).h();
            case 13:
                return ((annv) obj).k();
            case 14:
                return ((annv) obj).f();
            case 15:
                return ((anyx) obj).getVideoId();
            case 16:
                return rpi.Q((Optional) obj);
            case 17:
                return (anjx) ((Optional) obj).get();
            case 18:
                return rpi.Q((Optional) obj);
            case 19:
                try {
                    return Optional.of((hcg) ahng.v((ListenableFuture) obj));
                } catch (ExecutionException e2) {
                    ((agrc) ((agrc) ((agrc) hpk.a.b()).j(e2)).k("com/google/android/apps/youtube/music/offline/compat/DownloadsLibraryUtil", "getDownloadsLibrary", (char) 236, "DownloadsLibraryUtil.java")).t("Error getting smartDownloadedSingleTrackContainers");
                    return Optional.empty();
                }
            default:
                return (hcg) ((Optional) obj).get();
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
