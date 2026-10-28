package defpackage;

import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.time.Duration;
import j$.util.Optional;
import java.text.NumberFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inf extends imf {
    private final Context a;
    private final awmd b;
    private final hwz c;
    private final hfn d;

    public inf(Context context, awmd awmdVar, hfn hfnVar, hwz hwzVar) {
        super(anyx.class, aoun.class);
        this.a = context;
        this.b = awmdVar;
        this.d = hfnVar;
        this.c = hwzVar;
    }

    @Override // defpackage.imf, defpackage.iml
    public final /* synthetic */ ListenableFuture a(Object obj, agkj agkjVar) {
        anyx anyxVar = (anyx) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        ahno.F(optionalAl.isPresent());
        Optional optionalAl2 = hmy.al("playlist_panel_video_context", ini.class, agkjVar);
        ahno.F(optionalAl2.isPresent());
        aihh aihhVarE = e(anyxVar, agkjVar, (imk) optionalAl.get(), (ini) optionalAl2.get());
        int i = ((imk) optionalAl.get()).b;
        byte[] bArr = null;
        if (i == 0) {
            throw null;
        }
        if (i == 2) {
            aihf aihfVarCreateBuilder = aoum.a.createBuilder();
            aoia aoiaVarX = fhz.X(this.a);
            aihfVarCreateBuilder.copyOnWrite();
            aoum aoumVar = (aoum) aihfVarCreateBuilder.instance;
            aoiaVarX.getClass();
            aoumVar.c = aoiaVarX;
            aoumVar.b = 60572968;
            aihhVarE.copyOnWrite();
            aoun aounVar = (aoun) aihhVarE.instance;
            aoum aoumVar2 = (aoum) aihfVarCreateBuilder.build();
            aoun aounVar2 = aoun.a;
            aoumVar2.getClass();
            aounVar.u = aoumVar2;
            aounVar.b |= 4194304;
            ias iasVarG = hna.g();
            iasVarG.a = anyxVar.getVideoId();
            iasVarG.b = ((ini) optionalAl2.get()).c;
            iasVarG.g();
            iasVarG.i(anyxVar.getMusicVideoType());
            iasVarG.l(this.d.r());
            if (anyxVar.getEligibleForResumption().booleanValue()) {
                return afxd.f(this.c.m(anyxVar.getVideoId())).g(new idw(aihhVarE, iasVarG, 10, bArr), MoreExecutors.directExecutor());
            }
            ajwo ajwoVarB = iasVarG.b();
            aihhVarE.copyOnWrite();
            aoun aounVar3 = (aoun) aihhVarE.instance;
            ajwoVarB.getClass();
            aounVar3.l = ajwoVarB;
            aounVar3.b |= SemanticState.Hidden;
        }
        return ahng.n((aoun) aihhVarE.build());
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        anyx anyxVar = (anyx) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        ahno.F(optionalAl.isPresent());
        Optional optionalAl2 = hmy.al("playlist_panel_video_context", ini.class, agkjVar);
        ahno.F(optionalAl2.isPresent());
        aihh aihhVarE = e(anyxVar, agkjVar, (imk) optionalAl.get(), (ini) optionalAl2.get());
        int i = ((imk) optionalAl.get()).b;
        if (i == 0) {
            throw null;
        }
        if (i == 2) {
            ias iasVarG = hna.g();
            iasVarG.a = anyxVar.getVideoId();
            iasVarG.b = ((ini) optionalAl2.get()).c;
            iasVarG.g();
            iasVarG.i(anyxVar.getMusicVideoType());
            iasVarG.l(this.d.r());
            ajwo ajwoVarB = iasVarG.b();
            aihhVarE.copyOnWrite();
            aoun aounVar = (aoun) aihhVarE.instance;
            aoun aounVar2 = aoun.a;
            ajwoVarB.getClass();
            aounVar.l = ajwoVarB;
            aounVar.b |= SemanticState.Hidden;
            aihf aihfVarCreateBuilder = aoum.a.createBuilder();
            aoia aoiaVarX = fhz.X(this.a);
            aihfVarCreateBuilder.copyOnWrite();
            aoum aoumVar = (aoum) aihfVarCreateBuilder.instance;
            aoiaVarX.getClass();
            aoumVar.c = aoiaVarX;
            aoumVar.b = 60572968;
            aihhVarE.copyOnWrite();
            aoun aounVar3 = (aoun) aihhVarE.instance;
            aoum aoumVar2 = (aoum) aihfVarCreateBuilder.build();
            aoumVar2.getClass();
            aounVar3.u = aoumVar2;
            aounVar3.b |= 4194304;
        }
        return (aoun) aihhVarE.build();
    }

    public final aihh e(anyx anyxVar, agkj agkjVar, imk imkVar, ini iniVar) {
        aihh aihhVar = (aihh) aoun.a.createBuilder();
        String videoId = anyxVar.getVideoId();
        aihhVar.copyOnWrite();
        aoun aounVar = (aoun) aihhVar.instance;
        videoId.getClass();
        aounVar.b |= SemanticState.Obscured;
        aounVar.n = videoId;
        aihhVar.copyOnWrite();
        aoun aounVar2 = (aoun) aihhVar.instance;
        aounVar2.b |= SemanticState.Focused;
        int i = iniVar.a;
        aounVar2.k = i == iniVar.b;
        alay alayVarD = ackj.d(anyxVar.getTitle());
        aihhVar.copyOnWrite();
        aoun aounVar3 = (aoun) aihhVar.instance;
        alayVarD.getClass();
        aounVar3.d = alayVarD;
        aounVar3.b |= 1;
        alay alayVarD2 = ackj.d(anyxVar.getArtistNames());
        aihhVar.copyOnWrite();
        aoun aounVar4 = (aoun) aihhVar.instance;
        alayVarD2.getClass();
        aounVar4.f = alayVarD2;
        aounVar4.b |= 4;
        aihh aihhVar2 = (aihh) alay.a.createBuilder();
        aihh aihhVar3 = (aihh) alba.a.createBuilder();
        String str = NumberFormat.getInstance().format(i + 1);
        aihhVar3.copyOnWrite();
        alba albaVar = (alba) aihhVar3.instance;
        str.getClass();
        albaVar.b |= 1;
        albaVar.c = str;
        aihhVar2.v(aihhVar3);
        alay alayVar = (alay) aihhVar2.build();
        aihhVar.copyOnWrite();
        aoun aounVar5 = (aoun) aihhVar.instance;
        alayVar.getClass();
        aounVar5.i = alayVar;
        aounVar5.b |= 64;
        aqmh thumbnailDetails = anyxVar.getThumbnailDetails();
        aihhVar.copyOnWrite();
        aoun aounVar6 = (aoun) aihhVar.instance;
        thumbnailDetails.getClass();
        aounVar6.g = thumbnailDetails;
        aounVar6.b |= 8;
        if (anyxVar.getLengthMs().longValue() > 0) {
            String strC = nsj.c(Duration.ofMillis(anyxVar.getLengthMs().longValue()).toSeconds());
            alay alayVarC = ackj.c(strC);
            aihhVar.copyOnWrite();
            aoun aounVar7 = (aoun) aihhVar.instance;
            alayVarC.getClass();
            aounVar7.h = alayVarC;
            aounVar7.b |= 16;
            alay alayVarC2 = ackj.c(this.a.getString(R.string.song_subtitle_with_artist_and_duration, anyxVar.getArtistNames(), strC));
            aihhVar.copyOnWrite();
            aoun aounVar8 = (aoun) aihhVar.instance;
            alayVarC2.getClass();
            aounVar8.e = alayVarC2;
            aounVar8.b |= 2;
        } else {
            alay alayVarC3 = ackj.c(anyxVar.getArtistNames());
            aihhVar.copyOnWrite();
            aoun aounVar9 = (aoun) aihhVar.instance;
            alayVarC3.getClass();
            aounVar9.e = alayVarC3;
            aounVar9.b |= 2;
        }
        if (imkVar.b == 1) {
            aihf aihfVarCreateBuilder = apzf.a.createBuilder();
            String androidMediaStoreContentUri = anyxVar.getAndroidMediaStoreContentUri();
            aihfVarCreateBuilder.copyOnWrite();
            apzf apzfVar = (apzf) aihfVarCreateBuilder.instance;
            androidMediaStoreContentUri.getClass();
            apzfVar.c |= 1;
            apzfVar.d = androidMediaStoreContentUri;
            aihfVarCreateBuilder.copyOnWrite();
            apzf apzfVar2 = (apzf) aihfVarCreateBuilder.instance;
            apzfVar2.c |= 4;
            apzfVar2.f = i;
            aihf aihfVarCreateBuilder2 = apzg.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            apzg apzgVar = (apzg) aihfVarCreateBuilder2.instance;
            apzgVar.b |= 2;
            apzgVar.d = true;
            aihfVarCreateBuilder.copyOnWrite();
            apzf apzfVar3 = (apzf) aihfVarCreateBuilder.instance;
            apzg apzgVar2 = (apzg) aihfVarCreateBuilder2.build();
            apzgVar2.getClass();
            apzfVar3.g = apzgVar2;
            apzfVar3.c |= 8;
            String str2 = iniVar.c;
            if (!TextUtils.isEmpty(str2)) {
                aihfVarCreateBuilder.copyOnWrite();
                apzf apzfVar4 = (apzf) aihfVarCreateBuilder.instance;
                str2.getClass();
                apzfVar4.c |= 2;
                apzfVar4.e = str2;
            }
            aihh aihhVar4 = (aihh) ajwo.a.createBuilder();
            aihhVar4.e(ish.a, (apzf) aihfVarCreateBuilder.build());
            aihhVar.copyOnWrite();
            aoun aounVar10 = (aoun) aihhVar.instance;
            ajwo ajwoVar = (ajwo) aihhVar4.build();
            ajwoVar.getClass();
            aounVar10.l = ajwoVar;
            aounVar10.b |= SemanticState.Hidden;
        }
        int iAV = a.aV(anyxVar.getContentRating().c);
        if (iAV != 0 && iAV == 2) {
            aihf aihfVarCreateBuilder3 = ajkc.a.createBuilder();
            anpv anpvVarD = fhz.D(this.a);
            aihfVarCreateBuilder3.copyOnWrite();
            ajkc ajkcVar = (ajkc) aihfVarCreateBuilder3.instance;
            anpvVarD.getClass();
            ajkcVar.d = anpvVarD;
            ajkcVar.b |= 16777216;
            aihhVar.w(aihfVarCreateBuilder3);
        }
        if (anyxVar.getExternallyHostedMetadata().b) {
            aihf aihfVarCreateBuilder4 = ajkc.a.createBuilder();
            anpv anpvVarE = fhz.E(this.a);
            aihfVarCreateBuilder4.copyOnWrite();
            ajkc ajkcVar2 = (ajkc) aihfVarCreateBuilder4.instance;
            anpvVarE.getClass();
            ajkcVar2.d = anpvVarE;
            ajkcVar2.b |= 16777216;
            aihhVar.w(aihfVarCreateBuilder4);
        }
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anyx.class, anfy.class, anyxVar, agkjVar);
        aihf aihfVarCreateBuilder5 = angb.a.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        angb angbVar = (angb) aihfVarCreateBuilder5.instance;
        anfyVar.getClass();
        angbVar.c = anfyVar;
        angbVar.b = 66439850;
        aihhVar.copyOnWrite();
        aoun aounVar11 = (aoun) aihhVar.instance;
        angb angbVar2 = (angb) aihfVarCreateBuilder5.build();
        angbVar2.getClass();
        aounVar11.p = angbVar2;
        aounVar11.b |= 32768;
        return aihhVar;
    }
}
