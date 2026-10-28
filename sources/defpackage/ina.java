package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ina extends imf {
    private final Context a;
    private final awmd b;
    private final hlz c;

    public ina(Context context, awmd awmdVar, hlz hlzVar) {
        super(anuk.class, anzn.class);
        this.a = context;
        this.b = awmdVar;
        this.c = hlzVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        anuk anukVar = (anuk) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        if (optionalAl.isEmpty()) {
            throw new IllegalArgumentException("Display context must be provided");
        }
        aihf aihfVarCreateBuilder = anzn.a.createBuilder();
        alay alayVarD = ackj.d(anukVar.getTitle());
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar = (anzn) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anznVar.e = alayVarD;
        anznVar.b |= 4;
        apji apjiVarAi = hmy.ai(anukVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar2 = (anzn) aihfVarCreateBuilder.instance;
        apjiVarAi.getClass();
        anznVar2.c = apjiVarAi;
        anznVar2.b |= 1;
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anuk.class, anfy.class, anukVar, agkjVar);
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(angi.a, anfyVar);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar3 = (anzn) aihfVarCreateBuilder.instance;
        apji apjiVar = (apji) aihhVar.build();
        apjiVar.getClass();
        anznVar3.k = apjiVar;
        anznVar3.b |= SemanticState.Hidden;
        int i = ((imk) optionalAl.get()).b;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            if (anukVar.l()) {
                alay alayVarD2 = ackj.d(a.bN(this.a, R.string.num_songs, "num_songs", anukVar.getTrackCount()));
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar4 = (anzn) aihfVarCreateBuilder.instance;
                alayVarD2.getClass();
                anznVar4.f = alayVarD2;
                anznVar4.b |= 8;
            }
            ajwo ajwoVarA = vxh.a(hef.p(anukVar));
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar5 = (anzn) aihfVarCreateBuilder.instance;
            ajwoVarA.getClass();
            anznVar5.h = ajwoVarA;
            anznVar5.b |= 32;
        } else {
            int i2 = ((imk) optionalAl.get()).b;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 2) {
                Optional optionalAl2 = hmy.al("container_context", imi.class, agkjVar);
                aihf aihfVarCreateBuilder2 = anst.a.createBuilder();
                String playlistId = anukVar.getPlaylistId();
                aihfVarCreateBuilder2.copyOnWrite();
                anst anstVar = (anst) aihfVarCreateBuilder2.instance;
                playlistId.getClass();
                anstVar.b = 1;
                anstVar.c = playlistId;
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar6 = (anzn) aihfVarCreateBuilder.instance;
                anst anstVar2 = (anst) aihfVarCreateBuilder2.build();
                anstVar2.getClass();
                anznVar6.q = anstVar2;
                anznVar6.b |= SemanticState.Multiline;
                alay alayVarC = ackj.c(this.c.j(anukVar, optionalAl2));
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar7 = (anzn) aihfVarCreateBuilder.instance;
                alayVarC.getClass();
                anznVar7.f = alayVarC;
                anznVar7.b |= 8;
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar8 = (anzn) aihfVarCreateBuilder.instance;
                anznVar8.d = 1;
                anznVar8.b |= 2;
                aihfVarCreateBuilder.bV(hmy.r(anukVar.getPlaylistId()));
                if (anukVar.getPodcastShowAdditionalMetadata().d) {
                    aihfVarCreateBuilder.bV(fhz.H(this.a));
                }
                Context context = this.a;
                aihfVarCreateBuilder.bU(hmy.t(context, anukVar.getPlaylistId(), annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS, annn.MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_IN_PROGRESS));
                aihfVarCreateBuilder.bU(hmy.u(context, anukVar.getPlaylistId()));
                ajwo ajwoVarT = fhz.T(anukVar.getPlaylistId(), false);
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar9 = (anzn) aihfVarCreateBuilder.instance;
                ajwoVarT.getClass();
                anznVar9.h = ajwoVarT;
                anznVar9.b |= 32;
            }
        }
        return (anzn) aihfVarCreateBuilder.build();
    }
}
