package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imz extends imf {
    private final Context a;
    private final awmd b;
    private final hlz c;

    public imz(Context context, awmd awmdVar, hlz hlzVar) {
        super(anuk.class, anzi.class);
        this.a = context;
        this.b = awmdVar;
        this.c = hlzVar;
    }

    @Override // defpackage.imf, defpackage.iml
    public final /* bridge */ /* synthetic */ ListenableFuture a(Object obj, agkj agkjVar) {
        anuk anukVar = (anuk) obj;
        if (hmy.al("display_context", imk.class, agkjVar).isEmpty()) {
            throw new IllegalArgumentException("Display context must be provided");
        }
        return ahng.n(d(anukVar, agkjVar));
    }

    @Override // defpackage.iml
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final anzi d(anuk anukVar, agkj agkjVar) {
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        if (optionalAl.isEmpty()) {
            throw new IllegalArgumentException("Display context must be provided");
        }
        aihh aihhVar = (aihh) anzi.a.createBuilder();
        alay alayVarD = ackj.d(anukVar.getTitle());
        aihhVar.copyOnWrite();
        anzi anziVar = (anzi) aihhVar.instance;
        alayVarD.getClass();
        anziVar.g = alayVarD;
        anziVar.b |= 16;
        apji apjiVarAi = hmy.ai(anukVar.getThumbnailDetails(), 1);
        aihhVar.copyOnWrite();
        anzi anziVar2 = (anzi) aihhVar.instance;
        apjiVarAi.getClass();
        anziVar2.c = apjiVarAi;
        anziVar2.b |= 1;
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anuk.class, anfy.class, anukVar, agkjVar);
        aihh aihhVar2 = (aihh) apji.a.createBuilder();
        aihhVar2.e(angi.a, anfyVar);
        aihhVar.copyOnWrite();
        anzi anziVar3 = (anzi) aihhVar.instance;
        apji apjiVar = (apji) aihhVar2.build();
        apjiVar.getClass();
        anziVar3.p = apjiVar;
        anziVar3.b |= SemanticState.Multiline;
        aihhVar.copyOnWrite();
        anzi anziVar4 = (anzi) aihhVar.instance;
        anziVar4.r = 2;
        anziVar4.b |= 32768;
        Optional optionalAl2 = hmy.al("display_context", imk.class, agkjVar);
        if (optionalAl2.isPresent() && ((imk) optionalAl2.get()).a.isPresent() && ((imk) optionalAl2.get()).a.get() == imj.c) {
            aihhVar.copyOnWrite();
            anzi anziVar5 = (anzi) aihhVar.instance;
            anziVar5.d = 1;
            anziVar5.b |= 2;
        }
        int i = ((imk) optionalAl.get()).b;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            if (anukVar.l()) {
                alay alayVarD2 = ackj.d(a.bN(this.a, R.string.num_songs, "num_songs", anukVar.getTrackCount()));
                aihhVar.copyOnWrite();
                anzi anziVar6 = (anzi) aihhVar.instance;
                alayVarD2.getClass();
                anziVar6.h = alayVarD2;
                anziVar6.b |= 32;
            }
            ajwo ajwoVarA = vxh.a(hef.p(anukVar));
            aihhVar.copyOnWrite();
            anzi anziVar7 = (anzi) aihhVar.instance;
            ajwoVarA.getClass();
            anziVar7.i = ajwoVarA;
            anziVar7.b |= 64;
        } else {
            int i2 = ((imk) optionalAl.get()).b;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != 2) {
                throw new IllegalArgumentException("Unexpected display surface");
            }
            Optional optionalAl3 = hmy.al("container_context", imi.class, agkjVar);
            aihf aihfVarCreateBuilder = anst.a.createBuilder();
            String playlistId = anukVar.getPlaylistId();
            aihfVarCreateBuilder.copyOnWrite();
            anst anstVar = (anst) aihfVarCreateBuilder.instance;
            playlistId.getClass();
            anstVar.b = 1;
            anstVar.c = playlistId;
            aihhVar.copyOnWrite();
            anzi anziVar8 = (anzi) aihhVar.instance;
            anst anstVar2 = (anst) aihfVarCreateBuilder.build();
            anstVar2.getClass();
            anziVar8.v = anstVar2;
            anziVar8.b |= 131072;
            alay alayVarC = ackj.c(this.c.j(anukVar, optionalAl3));
            aihhVar.copyOnWrite();
            anzi anziVar9 = (anzi) aihhVar.instance;
            alayVarC.getClass();
            anziVar9.h = alayVarC;
            anziVar9.b |= 32;
            aihhVar.copyOnWrite();
            anzi anziVar10 = (anzi) aihhVar.instance;
            anziVar10.f = 1;
            anziVar10.b |= 8;
            aihhVar.l(hmy.r(anukVar.getPlaylistId()));
            if (anukVar.getPlaylistId().equals("LM")) {
                aihhVar.l(fhz.F(fhz.C(this.a, aliz.KEEP, R.string.pinned_badge_content_desc, new anpu[0])));
            }
            if (anukVar.getPodcastShowAdditionalMetadata().d) {
                aihhVar.l(fhz.H(this.a));
            }
            Context context = this.a;
            aihhVar.k(hmy.t(context, anukVar.getPlaylistId(), annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS, annn.MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_IN_PROGRESS));
            aihhVar.k(hmy.u(context, anukVar.getPlaylistId()));
            ajwo ajwoVarT = fhz.T(anukVar.getPlaylistId(), false);
            aihhVar.copyOnWrite();
            anzi anziVar11 = (anzi) aihhVar.instance;
            ajwoVarT.getClass();
            anziVar11.i = ajwoVarT;
            anziVar11.b |= 64;
        }
        return (anzi) aihhVar.build();
    }
}
