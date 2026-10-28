package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imq extends imf {
    private final Context a;
    private final awmd b;
    private final hlz c;

    public imq(Context context, awmd awmdVar, hlz hlzVar) {
        super(anjx.class, anzn.class);
        this.a = context;
        this.b = awmdVar;
        this.c = hlzVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        anjx anjxVar = (anjx) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        if (optionalAl.isEmpty()) {
            throw new IllegalArgumentException("Display context must be provided");
        }
        aihf aihfVarCreateBuilder = anzn.a.createBuilder();
        apji apjiVarAi = hmy.ai(anjxVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar = (anzn) aihfVarCreateBuilder.instance;
        apjiVarAi.getClass();
        anznVar.c = apjiVarAi;
        anznVar.b |= 1;
        aihf aihfVarCreateBuilder2 = anst.a.createBuilder();
        String audioPlaylistId = anjxVar.getAudioPlaylistId();
        aihfVarCreateBuilder2.copyOnWrite();
        anst anstVar = (anst) aihfVarCreateBuilder2.instance;
        audioPlaylistId.getClass();
        anstVar.b = 1;
        anstVar.c = audioPlaylistId;
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar2 = (anzn) aihfVarCreateBuilder.instance;
        anst anstVar2 = (anst) aihfVarCreateBuilder2.build();
        anstVar2.getClass();
        anznVar2.q = anstVar2;
        anznVar2.b |= SemanticState.Multiline;
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anjx.class, anfy.class, anjxVar, agkjVar);
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihhVar.e(angi.a, anfyVar);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar3 = (anzn) aihfVarCreateBuilder.instance;
        apji apjiVar2 = (apji) aihhVar.build();
        apjiVar2.getClass();
        anznVar3.k = apjiVar2;
        anznVar3.b |= SemanticState.Hidden;
        int i = ((imk) optionalAl.get()).b;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            alay alayVarC = ackj.c(anjxVar.getTitle());
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar4 = (anzn) aihfVarCreateBuilder.instance;
            alayVarC.getClass();
            anznVar4.e = alayVarC;
            anznVar4.b |= 4;
            alay alayVarC2 = anjxVar.f() ? ackj.c(this.a.getString(R.string.album_subtitle_with_artist_and_release_year, anjxVar.getArtistDisplayName(), Integer.valueOf(anjxVar.getReleaseDate().c))) : ackj.c(anjxVar.getArtistDisplayName());
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar5 = (anzn) aihfVarCreateBuilder.instance;
            alayVarC2.getClass();
            anznVar5.f = alayVarC2;
            anznVar5.b |= 8;
            ajwo ajwoVarA = vxh.a(anjxVar.getAndroidMediaStoreContentUri());
            aihfVarCreateBuilder.copyOnWrite();
            anzn anznVar6 = (anzn) aihfVarCreateBuilder.instance;
            ajwoVarA.getClass();
            anznVar6.h = ajwoVarA;
            anznVar6.b |= 32;
        } else {
            int i2 = ((imk) optionalAl.get()).b;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 2) {
                alay alayVarD = ackj.d(anjxVar.getTitle());
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar7 = (anzn) aihfVarCreateBuilder.instance;
                alayVarD.getClass();
                anznVar7.e = alayVarD;
                anznVar7.b |= 4;
                hlz hlzVar = this.c;
                alay alayVarC3 = ackj.c(hlzVar.g(anjxVar));
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar8 = (anzn) aihfVarCreateBuilder.instance;
                alayVarC3.getClass();
                anznVar8.f = alayVarC3;
                anznVar8.b |= 8;
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar9 = (anzn) aihfVarCreateBuilder.instance;
                anznVar9.d = 1;
                anznVar9.b |= 2;
                aihfVarCreateBuilder.bV(hmy.r(anjxVar.getAudioPlaylistId()));
                int iAV = a.aV(anjxVar.getContentRating().c);
                if (iAV == 0) {
                    iAV = 1;
                }
                Optional optionalP = hlzVar.p(iAV);
                if (optionalP.isPresent()) {
                    aihh aihhVar2 = (aihh) apjiVar.createBuilder();
                    aihhVar2.e(anpw.a, optionalP.get());
                    aihfVarCreateBuilder.bV((apji) aihhVar2.build());
                }
                Context context = this.a;
                aihfVarCreateBuilder.bU(hmy.t(context, anjxVar.getAudioPlaylistId(), annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS, annn.MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_IN_PROGRESS));
                aihfVarCreateBuilder.bU(hmy.u(context, anjxVar.getAudioPlaylistId()));
                ajwo ajwoVarT = fhz.T(anjxVar.getAudioPlaylistId(), true);
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar10 = (anzn) aihfVarCreateBuilder.instance;
                ajwoVarT.getClass();
                anznVar10.h = ajwoVarT;
                anznVar10.b |= 32;
            }
        }
        return (anzn) aihfVarCreateBuilder.build();
    }
}
