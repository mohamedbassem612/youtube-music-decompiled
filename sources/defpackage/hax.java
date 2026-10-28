package defpackage;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.youtube.music.deeplink.MusicServiceDeepLinkActivity;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hax implements xgm, afgr {
    public final MusicServiceDeepLinkActivity a;
    public final xgn b;
    public final vxe c;
    public final tbt d;
    public final Handler e;
    public LoadingFrameLayout f;
    public Runnable g;
    private final affh h;
    private String i;
    private String j;
    private final abi k;
    private final syn l;
    private final oml m;

    public hax(MusicServiceDeepLinkActivity musicServiceDeepLinkActivity, abi abiVar, xgn xgnVar, vxe vxeVar, tbt tbtVar, Handler handler, affh affhVar, oml omlVar, syn synVar) {
        this.a = musicServiceDeepLinkActivity;
        this.k = abiVar;
        this.b = xgnVar;
        this.c = vxeVar;
        this.d = tbtVar;
        this.e = handler;
        this.h = affhVar;
        this.m = omlVar;
        this.l = synVar;
        afha afhaVarB = afhb.b(musicServiceDeepLinkActivity);
        afhaVarB.b(rqz.class);
        affhVar.a(afhaVarB.a()).c(this);
    }

    @Override // defpackage.afgr
    public final void F(ahud ahudVar) {
        agrx agrxVar = agso.a;
        this.l.k(15, 2, 2);
    }

    public final void a(Uri uri, Intent intent) {
        MusicServiceDeepLinkActivity musicServiceDeepLinkActivity = this.a;
        Uri referrer = musicServiceDeepLinkActivity.getReferrer();
        if (referrer != null && referrer.getHost() != null) {
            String host = referrer.getHost();
            String scheme = referrer.getScheme();
            if (scheme == null || !scheme.equals("android-app")) {
                this.j = host;
            } else {
                this.i = host;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (!pathSegments.isEmpty() && pathSegments.get(0).equals("deeplinkaction")) {
            gnc gncVar = new gnc(this, 18);
            this.g = gncVar;
            this.e.postDelayed(gncVar, 500L);
            this.b.b(xhb.a(59149), null, null);
            this.k.b(uri, ahno.Z(this.i), ahno.Z(this.j), new gml((Object) this, uri, 3));
            return;
        }
        Intent intent2 = new Intent(intent);
        String str = this.i;
        if (str != null) {
            intent2.putExtra("referring_app_name", str);
        }
        String str2 = this.j;
        if (str2 != null) {
            intent2.putExtra("referrer", str2);
        }
        intent2.setClassName(musicServiceDeepLinkActivity, "com.google.android.apps.youtube.music.activities.MusicActivity");
        intent2.setFlags(intent2.getFlags() & (-8388609));
        afwl.m(musicServiceDeepLinkActivity, intent2);
        musicServiceDeepLinkActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        musicServiceDeepLinkActivity.finish();
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.b;
    }

    @tcc
    public void handleAddToToastEvent(vvr vvrVar) {
        agev agevVar = vvrVar.d;
        if (!agevVar.g()) {
            agev agevVar2 = vvrVar.a;
            if (agevVar2.g()) {
                MusicServiceDeepLinkActivity musicServiceDeepLinkActivity = this.a;
                alay alayVar = ((aoda) agevVar2.c()).c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                tuk.o(musicServiceDeepLinkActivity, ackj.k(null, alayVar, null, false).toString(), 0);
                return;
            }
            return;
        }
        aixa aixaVar = fhz.O((ajwo) agevVar.c()).d;
        if (aixaVar == null) {
            aixaVar = aixa.a;
        }
        int i = aixaVar.b;
        if ((i & 2) != 0) {
            MusicServiceDeepLinkActivity musicServiceDeepLinkActivity2 = this.a;
            aocd aocdVar = aixaVar.d;
            if (aocdVar == null) {
                aocdVar = aocd.a;
            }
            alay alayVar2 = aocdVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            tuk.o(musicServiceDeepLinkActivity2, ackj.k(null, alayVar2, null, false).toString(), 0);
            return;
        }
        if ((i & 1) != 0) {
            MusicServiceDeepLinkActivity musicServiceDeepLinkActivity3 = this.a;
            aoda aodaVar = aixaVar.c;
            if (aodaVar == null) {
                aodaVar = aoda.a;
            }
            alay alayVar3 = aodaVar.c;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
            tuk.o(musicServiceDeepLinkActivity3, ackj.k(null, alayVar3, null, false).toString(), 0);
        }
    }

    @tcc
    public void handleDeepLinkCompletedEvent(haz hazVar) {
        MusicServiceDeepLinkActivity musicServiceDeepLinkActivity = this.a;
        if (musicServiceDeepLinkActivity.isFinishing()) {
            return;
        }
        if (hazVar.a) {
            musicServiceDeepLinkActivity.setResult(-1);
        } else {
            Intent intent = new Intent();
            intent.putExtra("RESULT_ERROR_MESSAGE", hazVar.b);
            musicServiceDeepLinkActivity.setResult(0, intent);
        }
        musicServiceDeepLinkActivity.finish();
    }

    @Override // defpackage.afgr
    public final void n(affx affxVar) {
        this.m.m("MusicDeeplink", affxVar, this.h, 15);
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void k() {
    }
}
