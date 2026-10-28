package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.activities.MusicPickerActivity;
import com.google.android.apps.youtube.music.audiopreview.AudioPreviewPlayerActivity;
import com.google.android.apps.youtube.music.browser.BrowserActivity;
import com.google.android.apps.youtube.music.deeplink.MusicServiceDeepLinkActivity;
import com.google.android.apps.youtube.music.playlist.customthumbnail.CustomThumbnailCreationActivity;
import com.google.android.apps.youtube.music.settings.SettingsCompatActivity;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gfa implements qz {
    private final /* synthetic */ int $cid;
    final /* synthetic */ fx a;

    public gfa(fx fxVar, int i) {
        this.$cid = i;
        this.a = fxVar;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [afpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [afpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [afpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [afpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [afpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [afpf, java.lang.Object] */
    @Override // defpackage.qz
    public final void a(Context context) {
        switch (this.$cid) {
            case 0:
                fx fxVar = this.a;
                ((MusicPickerActivity) fxVar).c();
                ((geb) fxVar).generatedComponent().bQ().a();
                break;
            case 1:
                fx fxVar2 = this.a;
                geb gebVar = (geb) fxVar2;
                if (!gebVar.a) {
                    gebVar.a = true;
                    gebVar.componentManager().f();
                }
                break;
            case 2:
                fx fxVar3 = this.a;
                ((AudioPreviewPlayerActivity) fxVar3).b();
                ((glw) fxVar3).generatedComponent().bQ().a();
                break;
            case 3:
                ((glw) this.a).c();
                break;
            case 4:
                ((glw) this.a).c();
                break;
            case 5:
                fx fxVar4 = this.a;
                ((BrowserActivity) fxVar4).b();
                ((gsb) fxVar4).generatedComponent().bQ().a();
                break;
            case 6:
                fx fxVar5 = this.a;
                gsb gsbVar = (gsb) fxVar5;
                if (!gsbVar.a) {
                    gsbVar.a = true;
                    gsbVar.componentManager().f();
                }
                break;
            case 7:
                fx fxVar6 = this.a;
                hav havVar = (hav) fxVar6;
                if (!havVar.a) {
                    havVar.a = true;
                    havVar.componentManager().f();
                }
                break;
            case 8:
                fx fxVar7 = this.a;
                ((MusicServiceDeepLinkActivity) fxVar7).c();
                ((hav) fxVar7).generatedComponent().bQ().a();
                break;
            case 9:
                fx fxVar8 = this.a;
                ((CustomThumbnailCreationActivity) fxVar8).b();
                ((ikd) fxVar8).generatedComponent().bQ().a();
                break;
            case 10:
                fx fxVar9 = this.a;
                ikd ikdVar = (ikd) fxVar9;
                if (!ikdVar.a) {
                    ikdVar.a = true;
                    ikdVar.componentManager().f();
                }
                break;
            case 11:
                fx fxVar10 = this.a;
                ioh iohVar = (ioh) fxVar10;
                if (!iohVar.a) {
                    iohVar.a = true;
                    ((SettingsCompatActivity) fxVar10).b = iohVar.componentManager().f().c.v();
                }
                break;
            case 12:
                fx fxVar11 = this.a;
                ((SettingsCompatActivity) fxVar11).o();
                ((ioh) fxVar11).generatedComponent().bQ().a();
                break;
            case 13:
                fx fxVar12 = this.a;
                qbu qbuVar = (qbu) fxVar12;
                if (!qbuVar.a) {
                    qbuVar.a = true;
                    qbuVar.componentManager().f();
                }
                break;
            case 14:
                fx fxVar13 = this.a;
                rmz rmzVar = (rmz) fxVar13;
                if (!rmzVar.a) {
                    rmzVar.a = true;
                    rmzVar.componentManager().f();
                }
                break;
            case 15:
                fx fxVar14 = this.a;
                xpz xpzVar = (xpz) fxVar14;
                if (!xpzVar.b) {
                    xpzVar.b = true;
                    gkd gkdVarF = xpzVar.componentManager().f();
                    PairWithTvActivity pairWithTvActivity = (PairWithTvActivity) fxVar14;
                    ghj ghjVar = gkdVarF.c;
                    pairWithTvActivity.c = (aeda) ghjVar.n.io();
                    pairWithTvActivity.e = (afip) ghjVar.kW.io();
                    pairWithTvActivity.d = (vxz) gkdVarF.b.dd.io();
                }
                break;
            default:
                fx fxVar15 = this.a;
                ydj ydjVar = (ydj) fxVar15;
                if (!ydjVar.b) {
                    ydjVar.b = true;
                    ydjVar.componentManager().f();
                }
                break;
        }
    }
}
