package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ine extends imf {
    private final Context a;
    private final awmd b;
    private imk c;
    private imi d;

    public ine(Context context, awmd awmdVar) {
        super(anyx.class, anzn.class);
        this.a = context;
        this.b = awmdVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0178  */
    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        anyx anyxVar = (anyx) obj;
        this.c = (imk) hmy.al("display_context", imk.class, agkjVar).orElse(null);
        this.d = (imi) hmy.al("container_context", imi.class, agkjVar).orElse(null);
        aihf aihfVarCreateBuilder = anzn.a.createBuilder();
        alay alayVarC = ackj.c(anyxVar.getTitle());
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar = (anzn) aihfVarCreateBuilder.instance;
        alayVarC.getClass();
        anznVar.e = alayVarC;
        anznVar.b |= 4;
        ArrayList arrayList = new ArrayList();
        int iAV = a.aV(anyxVar.getContentRating().c);
        if (iAV != 0 && iAV == 2) {
            arrayList.add(fhz.G(this.a));
        }
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar2 = (anzn) aihfVarCreateBuilder.instance;
        anznVar2.b();
        aifs.addAll(arrayList, anznVar2.m);
        boolean z = true;
        apji apjiVarAi = hmy.ai(anyxVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar3 = (anzn) aihfVarCreateBuilder.instance;
        apjiVarAi.getClass();
        anznVar3.c = apjiVarAi;
        anznVar3.b |= 1;
        imi imiVar = this.d;
        if (imiVar == null || imiVar.d != 5) {
            alay alayVarC2 = ackj.c(this.a.getString(R.string.song_subtitle_with_artist_and_duration, anyxVar.getArtistNames(), nsj.c(Duration.ofMillis(anyxVar.getLengthMs().longValue()).toSeconds())));
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar4 = (anzn) aihfVarCreateBuilder.instance;
            alayVarC2.getClass();
            anznVar4.f = alayVarC2;
            anznVar4.b |= 8;
        } else {
            alay alayVarC3 = ackj.c(this.a.getString(R.string.song_subtitle_with_entity_type_and_artist_and_duration, anyxVar.getArtistNames(), nsj.c(Duration.ofMillis(anyxVar.getLengthMs().longValue()).toSeconds())));
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar5 = (anzn) aihfVarCreateBuilder.instance;
            alayVarC3.getClass();
            anznVar5.f = alayVarC3;
            anznVar5.b |= 8;
        }
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anyx.class, anfy.class, anyxVar, agkjVar);
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(angi.a, anfyVar);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar6 = (anzn) aihfVarCreateBuilder.instance;
        apji apjiVar = (apji) aihhVar.build();
        apjiVar.getClass();
        anznVar6.k = apjiVar;
        anznVar6.b |= SemanticState.Hidden;
        imk imkVar = this.c;
        if (imkVar == null) {
            return (anzn) aihfVarCreateBuilder.build();
        }
        int i = imkVar.b;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            String androidMediaStoreContentUri = anyxVar.getAndroidMediaStoreContentUri();
            imi imiVar2 = this.d;
            ajwo ajwoVarO = hef.o(androidMediaStoreContentUri, imiVar2 != null ? imiVar2.a : "", 0, false);
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar7 = (anzn) aihfVarCreateBuilder.instance;
            ajwoVarO.getClass();
            anznVar7.h = ajwoVarO;
            anznVar7.b |= 32;
        } else if (i2 == 1) {
            String videoId = anyxVar.getVideoId();
            imi imiVar3 = this.d;
            if (imiVar3 == null) {
                z = false;
            } else {
                int i3 = imiVar3.d;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 != 4 && i3 != 5) {
                    z = false;
                }
            }
            apji apjiVarS = hmy.s(videoId, z);
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar8 = (anzn) aihfVarCreateBuilder.instance;
            apjiVarS.getClass();
            anznVar8.b();
            anznVar8.m.add(0, apjiVarS);
            ias iasVarG = hna.g();
            imi imiVar4 = this.d;
            iasVarG.b = imiVar4 != null ? imiVar4.a : "PPSV";
            iasVarG.a = anyxVar.getVideoId();
            Optional optionalAl = hmy.al("offline_playlist_sort_order", aofy.class, agkjVar);
            if (optionalAl.isPresent()) {
                iasVarG.j((aofy) optionalAl.get());
            }
            if (anyxVar.getEligibleForResumption().booleanValue()) {
                iasVarG.f(anyxVar.getEligibleForResumption().booleanValue());
            }
            ajwo ajwoVarA = iasVarG.a();
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar9 = (anzn) aihfVarCreateBuilder.instance;
            ajwoVarA.getClass();
            anznVar9.h = ajwoVarA;
            anznVar9.b |= 32;
            aihf aihfVarCreateBuilder2 = anst.a.createBuilder();
            String videoId2 = anyxVar.getVideoId();
            aihfVarCreateBuilder2.copyOnWrite();
            anst anstVar = (anst) aihfVarCreateBuilder2.instance;
            videoId2.getClass();
            anstVar.b = 2;
            anstVar.c = videoId2;
            anst anstVar2 = (anst) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar10 = (anzn) aihfVarCreateBuilder.instance;
            anstVar2.getClass();
            anznVar10.q = anstVar2;
            anznVar10.b |= SemanticState.Multiline;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(hmy.af(anyxVar.getVideoId()));
            arrayList2.add(hmy.ae(this.a, anyxVar.getVideoId(), this.d));
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar11 = (anzn) aihfVarCreateBuilder.instance;
            anznVar11.a();
            aifs.addAll(arrayList2, anznVar11.l);
        }
        return (anzn) aihfVarCreateBuilder.build();
    }
}
