package defpackage;

import android.widget.TextView;
import com.google.android.apps.youtube.music.player.MusicPlayerView;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;
import com.google.android.apps.youtube.music.ui.image.AutoCropImageView;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hva implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hva(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        boolean z;
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) hvb.a.b().i(agso.a, "Offline")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/sync/implementation/MusicPlaylistSyncTask", "syncIfStalePlaylist", 208, "MusicPlaylistSyncTask.java")).w("Error retrieving refresh entity: %s", ((huu) this.a).a);
                break;
            case 1:
                int i = hub.h;
                this.a.invoke(obj);
                break;
            case 2:
                ((hvs) this.a).b();
                break;
            case 3:
                wgi wgiVar = ((aazm) obj).b;
                if (wgiVar != null) {
                    Object obj2 = this.a;
                    aorw aorwVar = wgiVar.g;
                    if (aorwVar == null || (aorwVar.c & 134217728) == 0) {
                        ((hvw) obj2).d(null);
                    } else {
                        ajwo ajwoVar = aorwVar.l;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        ((hvw) obj2).d(ajwoVar);
                    }
                }
                break;
            case 4:
                hvw hvwVar = (hvw) this.a;
                z = hvwVar.c.o().ab() && ((aayt) obj).a == abnv.f;
                if (hvwVar.e != z) {
                    hvwVar.e = z;
                    hvwVar.e();
                }
                break;
            case 5:
                hyz hyzVar = (hyz) ((hzc) obj).a().orElse(null);
                yx yxVar = (yx) this.a;
                yxVar.a();
                if (hyzVar instanceof hza) {
                    yxVar.a = ((hza) hyzVar).l();
                }
                break;
            case 6:
                ((yx) this.a).a();
                break;
            case 7:
                float fZ = tym.z(((Float) obj).floatValue(), 0.0f, 1.0f);
                MusicPlayerView musicPlayerView = (MusicPlayerView) this.a;
                if (musicPlayerView.d != fZ) {
                    musicPlayerView.d = fZ;
                    musicPlayerView.requestLayout();
                }
                break;
            case 8:
                float fZ2 = tym.z(((Float) obj).floatValue(), 0.0f, 1.0f);
                AutoCropImageView autoCropImageView = ((hwc) this.a).b;
                if (autoCropImageView.e != fZ2) {
                    autoCropImageView.e = fZ2;
                    if (autoCropImageView.a()) {
                        autoCropImageView.requestLayout();
                    }
                }
                break;
            case 9:
                aazj aazjVar = (aazj) obj;
                abob abobVar = aazjVar.a;
                hxf hxfVar = (hxf) this.a;
                boolean z2 = hxfVar.k;
                hxfVar.k = abobVar.h();
                wjf wjfVar = aazjVar.b;
                boolean z3 = hxfVar.l;
                boolean z4 = hxfVar.i;
                if (wjfVar != null) {
                    hxfVar.l = wjfVar.R();
                    z = !hna.x(wjfVar) && hna.v(wjfVar);
                    hxfVar.i = z;
                } else {
                    z = z4;
                }
                if (hxfVar.k != z2 || z != z4 || hxfVar.l != z3) {
                    hxfVar.e();
                }
                break;
            case 10:
                ((hxf) this.a).e();
                break;
            case 11:
                z = ((xzh) obj).a != null;
                hxf hxfVar2 = (hxf) this.a;
                boolean z5 = hxfVar2.j;
                hxfVar2.j = z;
                if (z5 != z) {
                    hxfVar2.e();
                }
                break;
            case 12:
                ((hxf) this.a).e();
                break;
            case 13:
                hxf hxfVar3 = (hxf) this.a;
                hxfVar3.m.j((ibh) obj);
                hxfVar3.e();
                break;
            case 14:
                ibt ibtVar = (ibt) obj;
                AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = (AudioVideoSwitcherToggleView) this.a;
                if (audioVideoSwitcherToggleView.a != ibtVar) {
                    audioVideoSwitcherToggleView.a = ibtVar;
                    audioVideoSwitcherToggleView.d();
                }
                break;
            case 15:
                ((hxj) this.a).f();
                break;
            case 16:
                hxj hxjVar = (hxj) this.a;
                hxjVar.a();
                hxjVar.f();
                break;
            case 17:
                hye hyeVar = (hye) this.a;
                TextView textView = hyeVar.k;
                if (textView != null) {
                    textView.setText(nsj.c(hyeVar.o.c().toSeconds()));
                }
                break;
            case 18:
                ((hye) this.a).p((igi) obj);
                break;
            case 19:
                amks amksVarW = fhz.W(((aayw) obj).d);
                ((hzp) this.a).g = amksVarW != null ? (aihh) amksVarW.toBuilder() : null;
                break;
            default:
                Optional optional = (Optional) obj;
                Iterator it = ((hzp) this.a).b.iterator();
                while (it.hasNext()) {
                    ((hzv) it.next()).h(optional);
                }
                break;
        }
    }
}
