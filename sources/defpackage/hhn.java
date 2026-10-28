package defpackage;

import android.app.Notification;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hhn implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hhn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                anzs anzsVar = (anzs) obj;
                anzsVar.getClass();
                return Boolean.valueOf((anzsVar.b & 8) != 0);
            case 1:
                ((agrc) ((agrc) hcc.a.c()).j((Throwable) obj).k("com/google/android/apps/youtube/music/entities/data/MusicPersistentEntityStoreWriterImpl", "addOrReplaceEntities$<anonymous>", 48, "MusicPersistentEntityStoreWriterImpl.kt")).t("Failed to batch write entities");
                return awmy.a;
            case 2:
                Map map = (Map) obj;
                map.getClass();
                List list = (List) map.get(znf.d.l);
                return list != null ? atqq.B(map, new awml(znf.e.l, list)) : map;
            case 3:
                ((weo) obj).getClass();
                return znf.d;
            case 4:
                ((Boolean) obj).getClass();
                return awmy.a;
            case 5:
                ((agrc) ((agrc) hoo.a.b().i(agso.a, "MusicOfflineHomeBlock")).j((Throwable) obj).k("com/google/android/apps/youtube/music/offline/blocks/MusicOfflineHomeBlockImpl", "subscribeToDownloadsStore$<anonymous>", 134, "MusicOfflineHomeBlockImpl.kt")).t("Error observing downloads store entities.");
                return awmy.a;
            case 6:
                ((weo) obj).getClass();
                return awmy.a;
            case 7:
                Notification notification = (Notification) obj;
                int i = hub.h;
                notification.getClass();
                return typ.b(ato.d(notification));
            case 8:
                aayw aaywVar = (aayw) obj;
                aaywVar.getClass();
                wgi wgiVar = aaywVar.d;
                if (wgiVar != null && fhz.ab(wgiVar.a) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                Optional optional = (Optional) obj;
                optional.getClass();
                return Boolean.valueOf(optional.isPresent());
            case 10:
                aayw aaywVar2 = (aayw) obj;
                aaywVar2.getClass();
                wgi wgiVar2 = aaywVar2.d;
                wgiVar2.getClass();
                Optional optionalC = hna.C(fhz.ah(wgiVar2.a));
                optionalC.getClass();
                return optionalC;
            case 11:
                idd iddVar = (idd) obj;
                iddVar.getClass();
                return Boolean.valueOf(!iddVar.d());
            case 12:
                idd iddVar2 = (idd) obj;
                iddVar2.getClass();
                return iddVar2.f();
            case 13:
                aayw aaywVar3 = (aayw) obj;
                aaywVar3.getClass();
                return Optional.ofNullable(aaywVar3.c);
            case 14:
                gsg gsgVar = (gsg) obj;
                gsgVar.getClass();
                amlg amlgVar = gsgVar.b;
                return Boolean.valueOf(amlgVar == amlg.DISLIKE || amlgVar == amlg.INDIFFERENT);
            case 15:
                weo weoVar = (weo) obj;
                weoVar.getClass();
                return Boolean.valueOf(weoVar.c != null);
            case 16:
                weo weoVar2 = (weo) obj;
                weoVar2.getClass();
                weh wehVar = weoVar2.c;
                if (wehVar != null) {
                    return (akvp) wehVar;
                }
                throw new IllegalArgumentException("currentEntity is guaranteed to be non-null");
            case 17:
                akvp akvpVar = (akvp) obj;
                akvpVar.getClass();
                return akvpVar.getIsSelected();
            case 18:
                aobm aobmVar = (aobm) obj;
                agrf agrfVar = jah.a;
                aobmVar.getClass();
                aobh aobhVarA = aobh.a(aobmVar.c);
                if (aobhVarA == null) {
                    aobhVarA = aobh.UNRECOGNIZED;
                }
                return Boolean.valueOf(aobhVarA == aobh.NETWORK_QUALITY_BUCKET_OFFLINE);
            case 19:
                ((agrc) ((agrc) jah.a.c()).j((Throwable) obj).k("com/google/android/apps/youtube/music/ui/presentation/ConnectivityDirectUpdateCoordinator", "start$<anonymous>$<anonymous>", 102, "MusicConnectivityDirectUpdateBlockImpl.kt")).t("Failed to observe network status signal");
                return awmy.a;
            default:
                pot potVar = (pot) obj;
                potVar.getClass();
                return potVar.a;
        }
    }
}
