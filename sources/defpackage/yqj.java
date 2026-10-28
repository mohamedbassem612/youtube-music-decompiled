package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yqj implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yqj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, ysz] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, tnh] */
    /* JADX WARN: Type inference failed for: r9v53, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, tns] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.b((byi) obj);
                return;
            case 1:
                yen yenVar = (yen) this.a;
                yha yhaVar = yenVar.d;
                yhaVar.getClass();
                xxy xxyVar = new xxy(yhaVar, null);
                yenVar.a.f(yenVar.b, xxyVar, (Set) obj);
                return;
            case 2:
                this.a.a((alzi) obj);
                return;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    tnm tnmVar = ((toe) this.a).b;
                    tnmVar.getClass();
                    tnmVar.e();
                    return;
                }
                return;
            case 4:
                tnx tnxVar = (tnx) obj;
                boolean zH = tnxVar.h();
                ?? r9 = this.a;
                if (zH) {
                    r9.ad(tnxVar.c().a);
                    return;
                } else {
                    r9.y(tnxVar.a().a);
                    return;
                }
            case 5:
                ((aajt) this.a).i = true;
                return;
            case 6:
                aohg aohgVar = (aohg) obj;
                if (aohgVar != null) {
                    Object obj2 = this.a;
                    aarj aarjVar = (aarj) obj2;
                    zwb zwbVar = aarjVar.f;
                    if (zwbVar.u()) {
                        String strK = zwbVar.e().k();
                        aaqg aaqgVar = (aaqg) aarjVar.c.io();
                        aaqgVar.b.edit().putLong(tym.y("last_offline_video_playback_position_sync_timestamp_%s", strK), aohgVar.d).apply();
                        aaqgVar.A(strK, aohgVar.c);
                        vxz vxzVar = aarjVar.k;
                        aiie aiieVar = aohgVar.e;
                        if (!vxzVar.l(180, 45706258L, false) || aiieVar.isEmpty()) {
                            return;
                        }
                        try {
                            ((aarj) obj2).g.b((List) Collection.EL.stream(aiieVar).map(new aalr(5)).collect(aghu.a));
                            return;
                        } catch (aaob e) {
                            ((agrc) ((agrc) ((agrc) aarj.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "handleOfflineVideoPlaybackPositionUpdate", (char) 256, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("Failed to queue playback position update actions.");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 7:
                agke agkeVar = (agke) obj;
                agjz agjzVar = new agjz(4);
                int size = agkeVar.size();
                Object obj3 = this.a;
                for (int i = 0; i < size; i++) {
                    arer arerVar = (arer) agkeVar.get(i);
                    aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                    aofhVar.c = 2;
                    aofhVar.b |= 1;
                    String strAm = arerVar.am();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                    strAm.getClass();
                    aofhVar2.b |= 2;
                    aofhVar2.d = strAm;
                    agjzVar.h((aofh) aihfVarCreateBuilder.build());
                }
                try {
                    ((aarj) obj3).g.b(agjzVar.g());
                    return;
                } catch (aaob e2) {
                    ((agrc) ((agrc) ((agrc) aarj.a.b()).j(e2)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "onCleanUpResponse", (char) 307, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("[Offline] Error removing single video position when cleaning response.");
                    return;
                }
            case 8:
                Optional optional = (Optional) obj;
                Object obj4 = this.a;
                if (optional != null) {
                    try {
                        if (optional.isPresent()) {
                            aany aanyVar = ((aarj) obj4).g;
                            aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
                            aofhVar3.c = 2;
                            aofhVar3.b |= 1;
                            String strAm2 = ((arer) optional.get()).am();
                            aihfVarCreateBuilder2.copyOnWrite();
                            aofh aofhVar4 = (aofh) aihfVarCreateBuilder2.instance;
                            strAm2.getClass();
                            aofhVar4.b |= 2;
                            aofhVar4.d = strAm2;
                            aanyVar.a((aofh) aihfVarCreateBuilder2.build());
                            return;
                        }
                        return;
                    } catch (aaob e3) {
                        ((agrc) ((agrc) ((agrc) aarj.a.b()).j(e3)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "onRemoveSingleVideoPositionResponse", (char) 324, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("[Offline] Error removing single video position when removing single video position response.");
                        return;
                    }
                }
                return;
            case 9:
                abqc abqcVar = (abqc) this.a;
                abqcVar.k = (wjf) obj;
                abqcVar.c(abqcVar.k);
                return;
            case 10:
                abqc abqcVar2 = (abqc) this.a;
                abqcVar2.i = (wgi) obj;
                abqcVar2.g();
                abqcVar2.i();
                return;
            case 11:
                abty abtyVar = (abty) this.a;
                if (abtyVar.d()) {
                    abtyVar.a();
                    return;
                }
                return;
            case 12:
                Iterable$EL.forEach(((abvs) this.a).c, new aavj(2));
                return;
            case 13:
                atpl atplVar = (atpl) obj;
                int i2 = atplVar.b & 65536;
                Object obj5 = this.a;
                if (i2 != 0) {
                    ((abww) obj5).g(atplVar.t);
                    return;
                }
                abww abwwVar = (abww) obj5;
                if (((abmt) abwwVar.e.io()).g.l(356, 45758683L, false)) {
                    abwwVar.g(true);
                    return;
                }
                return;
            case 14:
                Optional optional2 = (Optional) obj;
                Object obj6 = this.a;
                synchronized (obj6) {
                    if (((achd) obj6).c == 2) {
                        ((achd) obj6).b = optional2;
                        ((achd) obj6).c = 3;
                    }
                    break;
                }
                return;
            case 15:
                acrn acrnVar = (acrn) this.a;
                acrnVar.g((alql) obj, acrnVar.c.b(), acrnVar.i, false);
                return;
            case 16:
                if (((alql) obj) == null) {
                    ((acrq) this.a).f();
                    return;
                }
                return;
            case 17:
                akzt akztVar = (akzt) obj;
                if ((akztVar.b & 2) != 0) {
                    Object obj7 = this.a;
                    ajwo ajwoVar = akztVar.d;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    ((sve) obj7).a.a(ajwoVar);
                    return;
                }
                return;
            case 18:
                ((aehd) this.a).g = null;
                return;
            case 19:
                ((aelh) this.a).a((alvy) obj);
                return;
            default:
                aqel aqelVar = (aqel) obj;
                if (aqelVar == null || (aqelVar.b & 2) == 0) {
                    return;
                }
                vxe vxeVar = (vxe) ((aelt) this.a).b.io();
                ajwo ajwoVar2 = aqelVar.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar.a(ajwoVar2);
                return;
        }
    }
}
