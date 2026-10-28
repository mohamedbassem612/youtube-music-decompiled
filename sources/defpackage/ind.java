package defpackage;

import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ind extends imf {
    private final Context a;
    private final awmd b;
    private final Executor c;
    private Optional d;
    private Optional e;

    public ind(Context context, awmd awmdVar, Executor executor) {
        super(anyx.class, anzi.class);
        this.a = context;
        this.b = awmdVar;
        this.c = executor;
    }

    private final aihh f(anyx anyxVar, agkj agkjVar) {
        String string;
        this.d = hmy.al("display_context", imk.class, agkjVar);
        this.e = hmy.al("container_context", imi.class, agkjVar);
        aihh aihhVar = (aihh) anzi.a.createBuilder();
        alay alayVarC = ackj.c(anyxVar.getTitle());
        aihhVar.copyOnWrite();
        anzi anziVar = (anzi) aihhVar.instance;
        alayVarC.getClass();
        anziVar.g = alayVarC;
        anziVar.b |= 16;
        ArrayList arrayList = new ArrayList();
        int iAV = a.aV(anyxVar.getContentRating().c);
        if (iAV != 0 && iAV == 2) {
            arrayList.add(fhz.G(this.a));
        }
        if (anyxVar.getExternallyHostedMetadata().b) {
            arrayList.add(fhz.H(this.a));
        }
        aihhVar.copyOnWrite();
        anzi anziVar2 = (anzi) aihhVar.instance;
        anziVar2.e();
        aifs.addAll(arrayList, anziVar2.t);
        if (this.e.isPresent() && ((imi) this.e.get()).d == 1) {
            if (anyxVar.getAlbumTrackIndex().longValue() > 0) {
                string = Long.toString(anyxVar.getAlbumTrackIndex().longValue());
            } else {
                string = (!this.e.isPresent() || TextUtils.isEmpty(((imi) this.e.get()).c)) ? this.a.getString(R.string.unknown_album_track_index) : ((imi) this.e.get()).c;
            }
            alay alayVarD = ackj.d(string);
            aihhVar.copyOnWrite();
            anzi anziVar3 = (anzi) aihhVar.instance;
            alayVarD.getClass();
            anziVar3.e = alayVarD;
            anziVar3.b |= 4;
        } else {
            apji apjiVarAi = hmy.ai(anyxVar.getThumbnailDetails(), 1);
            aihhVar.copyOnWrite();
            anzi anziVar4 = (anzi) aihhVar.instance;
            apjiVarAi.getClass();
            anziVar4.c = apjiVarAi;
            anziVar4.b |= 1;
        }
        if (this.e.isPresent() && ((imi) this.e.get()).d == 2 && !TextUtils.isEmpty(((imi) this.e.get()).a)) {
            aihf aihfVarCreateBuilder = anzh.a.createBuilder();
            String str = ((imi) this.e.get()).c;
            aihfVarCreateBuilder.copyOnWrite();
            anzh anzhVar = (anzh) aihfVarCreateBuilder.instance;
            anzhVar.b |= 1;
            anzhVar.c = ahno.Z(str);
            aihhVar.copyOnWrite();
            anzi anziVar5 = (anzi) aihhVar.instance;
            anzh anzhVar2 = (anzh) aihfVarCreateBuilder.build();
            anzhVar2.getClass();
            anziVar5.q = anzhVar2;
            anziVar5.b |= 16384;
        }
        if (this.e.isPresent() && ((imi) this.e.get()).d == 5) {
            alay alayVarC2 = ackj.c(this.a.getString(R.string.song_subtitle_with_entity_type_and_artist_and_duration, anyxVar.getArtistNames(), nsj.c(Duration.ofMillis(anyxVar.getLengthMs().longValue()).toSeconds())));
            aihhVar.copyOnWrite();
            anzi anziVar6 = (anzi) aihhVar.instance;
            alayVarC2.getClass();
            anziVar6.h = alayVarC2;
            anziVar6.b |= 32;
        } else {
            alay alayVarC3 = ackj.c(this.a.getString(R.string.song_subtitle_with_artist_and_duration, anyxVar.getArtistNames(), nsj.c(Duration.ofMillis(anyxVar.getLengthMs().longValue()).toSeconds())));
            aihhVar.copyOnWrite();
            anzi anziVar7 = (anzi) aihhVar.instance;
            alayVarC3.getClass();
            anziVar7.h = alayVarC3;
            anziVar7.b |= 32;
        }
        if (this.d.isPresent() && ((imk) this.d.get()).a.isPresent() && ((imk) this.d.get()).a.get() == imj.c) {
            aihhVar.copyOnWrite();
            anzi anziVar8 = (anzi) aihhVar.instance;
            anziVar8.d = 1;
            anziVar8.b |= 2;
        }
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anyx.class, anfy.class, anyxVar, agkjVar);
        aihh aihhVar2 = (aihh) apji.a.createBuilder();
        aihhVar2.e(angi.a, anfyVar);
        aihhVar.copyOnWrite();
        anzi anziVar9 = (anzi) aihhVar.instance;
        apji apjiVar = (apji) aihhVar2.build();
        apjiVar.getClass();
        anziVar9.p = apjiVar;
        anziVar9.b |= SemanticState.Multiline;
        aihhVar.copyOnWrite();
        anzi anziVar10 = (anzi) aihhVar.instance;
        anziVar10.r = 2;
        anziVar10.b |= 32768;
        return aihhVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    @Override // defpackage.imf, defpackage.iml
    public final /* synthetic */ ListenableFuture a(Object obj, agkj agkjVar) {
        anyx anyxVar = (anyx) obj;
        aihh aihhVarF = f(anyxVar, agkjVar);
        if (this.d.isEmpty()) {
            return ahng.n((anzi) aihhVarF.build());
        }
        int i = ((imk) this.d.get()).b;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return ahno.ap(new egz(this, anyxVar, aihhVarF, 18, (short[]) null), this.c);
        }
        boolean z = true;
        if (i2 != 1) {
            return ahng.m(new IllegalArgumentException("Unsupported DisplaySurface: ".concat(hmy.am(((imk) this.d.get()).b))));
        }
        String videoId = anyxVar.getVideoId();
        if (this.e.isPresent()) {
            int i3 = ((imi) this.e.get()).d;
            if (i3 == 0) {
                throw null;
            }
            if (i3 != 4) {
                int i4 = ((imi) this.e.get()).d;
                if (i4 == 0) {
                    throw null;
                }
                if (i4 != 5) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        apji apjiVarS = hmy.s(videoId, z);
        aihhVarF.copyOnWrite();
        anzi anziVar = (anzi) aihhVarF.instance;
        anzi anziVar2 = anzi.a;
        apjiVarS.getClass();
        anziVar.e();
        anziVar.t.add(0, apjiVarS);
        ias iasVarG = hna.g();
        iasVarG.b = this.e.isPresent() ? ((imi) this.e.get()).a : "PPSV";
        iasVarG.a = anyxVar.getVideoId();
        Optional optionalAl = hmy.al("offline_playlist_sort_order", aofy.class, agkjVar);
        if (optionalAl.isPresent()) {
            iasVarG.j((aofy) optionalAl.get());
        }
        if (anyxVar.getEligibleForResumption().booleanValue()) {
            iasVarG.f(anyxVar.getEligibleForResumption().booleanValue());
        }
        ajwo ajwoVarA = iasVarG.a();
        aihhVarF.copyOnWrite();
        anzi anziVar3 = (anzi) aihhVarF.instance;
        ajwoVarA.getClass();
        anziVar3.i = ajwoVarA;
        anziVar3.b |= 64;
        aihf aihfVarCreateBuilder = anst.a.createBuilder();
        String videoId2 = anyxVar.getVideoId();
        aihfVarCreateBuilder.copyOnWrite();
        anst anstVar = (anst) aihfVarCreateBuilder.instance;
        videoId2.getClass();
        anstVar.b = 2;
        anstVar.c = videoId2;
        anst anstVar2 = (anst) aihfVarCreateBuilder.build();
        aihhVarF.copyOnWrite();
        anzi anziVar4 = (anzi) aihhVarF.instance;
        anstVar2.getClass();
        anziVar4.v = anstVar2;
        anziVar4.b |= 131072;
        ArrayList arrayList = new ArrayList();
        arrayList.add(hmy.af(anyxVar.getVideoId()));
        arrayList.add(hmy.ae(this.a, anyxVar.getVideoId(), (imi) this.e.orElse(null)));
        aihhVarF.copyOnWrite();
        anzi anziVar5 = (anzi) aihhVarF.instance;
        anziVar5.d();
        aifs.addAll(arrayList, anziVar5.u);
        return ahng.n((anzi) aihhVarF.build());
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        anyx anyxVar = (anyx) obj;
        aihh aihhVarF = f(anyxVar, agkjVar);
        if (this.d.isEmpty()) {
            return (anzi) aihhVarF.build();
        }
        int i = ((imk) this.d.get()).b;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unsupported DisplaySurface: ".concat(hmy.am(((imk) this.d.get()).b)));
        }
        e(anyxVar, aihhVarF);
        return (anzi) aihhVarF.build();
    }

    public final void e(anyx anyxVar, aihh aihhVar) {
        ajwo ajwoVarO = hef.o(anyxVar.getAndroidMediaStoreContentUri(), this.e.isPresent() ? ((imi) this.e.get()).a : "", 0, false);
        aihhVar.copyOnWrite();
        anzi anziVar = (anzi) aihhVar.instance;
        anzi anziVar2 = anzi.a;
        ajwoVarO.getClass();
        anziVar.i = ajwoVarO;
        anziVar.b |= 64;
        if (this.e.isPresent() && ((imi) this.e.get()).d == 2 && !TextUtils.isEmpty(((imi) this.e.get()).c)) {
            aihh aihhVar2 = (aihh) ajnf.a.createBuilder();
            alay alayVarC = ackj.c(this.a.getString(R.string.remove));
            aihhVar2.copyOnWrite();
            ajnf ajnfVar = (ajnf) aihhVar2.instance;
            alayVarC.getClass();
            ajnfVar.m = alayVarC;
            ajnfVar.b |= 64;
            aihhVar2.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar2.instance;
            ajnfVar2.d = 3;
            ajnfVar2.c = 1;
            String str = ((imi) this.e.get()).a;
            String str2 = ((imi) this.e.get()).c;
            aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
            aihf aihfVarCreateBuilder = apzb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            apzb apzbVar = (apzb) aihfVarCreateBuilder.instance;
            str.getClass();
            apzbVar.c |= 1;
            apzbVar.d = str;
            aihf aihfVarCreateBuilder2 = apyx.a.createBuilder();
            aihf aihfVarCreateBuilder3 = apyz.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            apyz apyzVar = (apyz) aihfVarCreateBuilder3.instance;
            str2.getClass();
            apyzVar.b |= 1;
            apyzVar.c = str2;
            aihfVarCreateBuilder2.copyOnWrite();
            apyx apyxVar = (apyx) aihfVarCreateBuilder2.instance;
            apyz apyzVar2 = (apyz) aihfVarCreateBuilder3.build();
            apyzVar2.getClass();
            apyxVar.c = apyzVar2;
            apyxVar.b = 2;
            aihfVarCreateBuilder.cm(aihfVarCreateBuilder2);
            aihhVar3.e(ish.b, (apzb) aihfVarCreateBuilder.build());
            ajwo ajwoVar = (ajwo) aihhVar3.build();
            aihhVar2.copyOnWrite();
            ajnf ajnfVar3 = (ajnf) aihhVar2.instance;
            ajwoVar.getClass();
            ajnfVar3.s = ajwoVar;
            ajnfVar3.b |= SemanticState.Multiline;
            aihf aihfVarCreateBuilder4 = anxt.a.createBuilder();
            apji apjiVar = apji.a;
            aihh aihhVar4 = (aihh) apjiVar.createBuilder();
            aihhVar4.e(ajnp.a, (ajnf) aihhVar2.build());
            aihfVarCreateBuilder4.copyOnWrite();
            anxt anxtVar = (anxt) aihfVarCreateBuilder4.instance;
            apji apjiVar2 = (apji) aihhVar4.build();
            apjiVar2.getClass();
            anxtVar.a();
            anxtVar.b.add(apjiVar2);
            anxt anxtVar2 = (anxt) aihfVarCreateBuilder4.build();
            aihh aihhVar5 = (aihh) apjiVar.createBuilder();
            aihhVar5.e(anxu.a, anxtVar2);
            aihhVar.copyOnWrite();
            anzi anziVar3 = (anzi) aihhVar.instance;
            apji apjiVar3 = (apji) aihhVar5.build();
            apjiVar3.getClass();
            anziVar3.l = apjiVar3;
            anziVar3.b |= SemanticState.Hidden;
        }
    }
}
