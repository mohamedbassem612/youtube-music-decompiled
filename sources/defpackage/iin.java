package defpackage;

import android.database.sqlite.SQLiteDatabase;
import j$.util.Optional;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iin implements aheh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public iin(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zza] */
    @Override // defpackage.aheh
    public final void a(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            ((agrc) ((agrc) ((agrc) iio.a.c().i(agso.a, "Widget.PlayerCtrRestore")).j(th)).k("com/google/android/apps/youtube/music/player/widget/persistence/PlayerControlsModelRestorationController$RestorationCallback", "onFailure", 'i', "PlayerControlsModelRestorationController.java")).t("Restoration failed");
            ((iio) this.a).f = null;
            return;
        }
        if (i == 1) {
            ((agrc) ((agrc) ((agrc) gqh.a.b()).j(th)).k("com/google/android/apps/youtube/music/browse/PersistentBrowseService$2", "onFailure", (char) 326, "PersistentBrowseService.java")).t("PersistentBrowseService failed to fetch continuation");
            if (th instanceof toe) {
                this.a.jj((toe) th);
                return;
            }
            return;
        }
        if (i == 2) {
            ((agrc) ((agrc) iir.a.b().i(agso.a, "Widget.RecentlyPlayed")).k("com/google/android/apps/youtube/music/player/widget/recentlyplayed/MusicWidgetRecentlyPlayedMetadataController$RestorationCallback", "onFailure", 204, "MusicWidgetRecentlyPlayedMetadataController.java")).t("Failed to restore recently played items from storage.");
            iir iirVar = (iir) this.a;
            iirVar.b.clear();
            iirVar.c();
            return;
        }
        if (i == 3) {
            ((agrc) ((agrc) ((agrc) iqd.a.b()).j(th)).k("com/google/android/apps/youtube/music/settings/logging/SettingsSnapshotLogger$1", "onFailure", 'V', "SettingsSnapshotLogger.java")).t("Failed to log settings snapshot");
            iqd iqdVar = (iqd) this.a;
            xeu xeuVar = iqdVar.b;
            if (xeuVar.b) {
                aihf aihfVarCreateBuilder = ajev.a.createBuilder();
                aihf aihfVarA = iqdVar.a();
                aihfVarCreateBuilder.copyOnWrite();
                ajev ajevVar = (ajev) aihfVarCreateBuilder.instance;
                ajeu ajeuVar = (ajeu) aihfVarA.build();
                ajeuVar.getClass();
                ajevVar.c = ajeuVar;
                ajevVar.b |= 8;
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.APP_SETTINGS_CAPTURED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            aihf aihfVarCreateBuilder2 = ajev.a.createBuilder();
            ajeu ajeuVar2 = (ajeu) iqdVar.a().build();
            aihfVarCreateBuilder2.copyOnWrite();
            ajev ajevVar2 = (ajev) aihfVarCreateBuilder2.instance;
            ajeuVar2.getClass();
            ajevVar2.c = ajeuVar2;
            ajevVar2.b |= 8;
            ajev ajevVar3 = (ajev) aihfVarCreateBuilder2.build();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            ajevVar3.getClass();
            alouVar.d = ajevVar3;
            alouVar.c = 59;
            xeuVar.b((alou) alosVar.build());
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, zza] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        int i = this.$cid;
        int i2 = 4;
        if (i == 0) {
            Optional optional = (Optional) obj;
            iio iioVar = (iio) this.a;
            if (iioVar.b.a()) {
                agrx agrxVar = agso.a;
                return;
            }
            hkp hkpVar = new hkp(this, i2);
            if (true == optional.isPresent()) {
                Object obj2 = optional.get();
                ((hwm) ((iio) ((iin) hkpVar.a).a).d.io()).c((aima) obj2);
            }
            iioVar.f = null;
            return;
        }
        if (i == 1) {
            this.a.a((gnq) obj);
            return;
        }
        if (i == 2) {
            List list = (List) obj;
            agrx agrxVar2 = agso.a;
            iir iirVar = (iir) this.a;
            iirVar.b.clear();
            if (list != null) {
                list.size();
                iirVar.b.addAll(list);
            }
            iirVar.c();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                ((obw) this.a).a.c((obq) obj);
                return;
            }
            if (i == 5) {
                new File(((qso) this.a).b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
                return;
            } else {
                if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
                    return;
                }
                Object obj3 = this.a;
                synchronized (((qso) obj3).h) {
                    ((qso) obj3).d();
                }
                return;
            }
        }
        aihf aihfVar = (aihf) obj;
        xeu xeuVar = ((iqd) this.a).b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVar, alot.APP_SETTINGS_CAPTURED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        ajev ajevVar = (ajev) aihfVar.build();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        ajevVar.getClass();
        alouVar.d = ajevVar;
        alouVar.c = 59;
        xeuVar.b((alou) alosVar.build());
    }
}
