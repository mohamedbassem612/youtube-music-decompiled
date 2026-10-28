package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imp extends imf {
    private final Context a;
    private final awmd b;
    private final hlz c;

    public imp(Context context, awmd awmdVar, hlz hlzVar) {
        super(anjx.class, anzi.class);
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
        aihh aihhVar = (aihh) anzi.a.createBuilder();
        apji apjiVarAi = hmy.ai(anjxVar.getThumbnailDetails(), 1);
        aihhVar.copyOnWrite();
        anzi anziVar = (anzi) aihhVar.instance;
        apjiVarAi.getClass();
        anziVar.c = apjiVarAi;
        anziVar.b |= 1;
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anjx.class, anfy.class, anjxVar, agkjVar);
        apji apjiVar = apji.a;
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(angi.a, anfyVar);
        aihhVar.copyOnWrite();
        anzi anziVar2 = (anzi) aihhVar.instance;
        apji apjiVar2 = (apji) aihhVar2.build();
        apjiVar2.getClass();
        anziVar2.p = apjiVar2;
        anziVar2.b |= SemanticState.Multiline;
        aihhVar.copyOnWrite();
        anzi anziVar3 = (anzi) aihhVar.instance;
        anziVar3.r = 2;
        anziVar3.b |= 32768;
        Optional optionalAl2 = hmy.al("display_context", imk.class, agkjVar);
        if (optionalAl2.isPresent() && ((imk) optionalAl2.get()).a.isPresent() && ((imk) optionalAl2.get()).a.get() == imj.c) {
            aihhVar.copyOnWrite();
            anzi anziVar4 = (anzi) aihhVar.instance;
            anziVar4.d = 1;
            anziVar4.b |= 2;
        }
        int i = ((imk) optionalAl.get()).b;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            alay alayVarC = ackj.c(anjxVar.getTitle());
            aihhVar.copyOnWrite();
            anzi anziVar5 = (anzi) aihhVar.instance;
            alayVarC.getClass();
            anziVar5.g = alayVarC;
            anziVar5.b |= 16;
            alay alayVarC2 = anjxVar.f() ? ackj.c(this.a.getString(R.string.album_subtitle_with_artist_and_release_year, anjxVar.getArtistDisplayName(), Integer.valueOf(anjxVar.getReleaseDate().c))) : ackj.c(anjxVar.getArtistDisplayName());
            aihhVar.copyOnWrite();
            anzi anziVar6 = (anzi) aihhVar.instance;
            alayVarC2.getClass();
            anziVar6.h = alayVarC2;
            anziVar6.b |= 32;
            ajwo ajwoVarA = vxh.a(anjxVar.getAndroidMediaStoreContentUri());
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
            aihf aihfVarCreateBuilder = anst.a.createBuilder();
            String audioPlaylistId = anjxVar.getAudioPlaylistId();
            aihfVarCreateBuilder.copyOnWrite();
            anst anstVar = (anst) aihfVarCreateBuilder.instance;
            audioPlaylistId.getClass();
            anstVar.b = 1;
            anstVar.c = audioPlaylistId;
            aihhVar.copyOnWrite();
            anzi anziVar8 = (anzi) aihhVar.instance;
            anst anstVar2 = (anst) aihfVarCreateBuilder.build();
            anstVar2.getClass();
            anziVar8.v = anstVar2;
            anziVar8.b |= 131072;
            alay alayVarD = ackj.d(anjxVar.getTitle());
            aihhVar.copyOnWrite();
            anzi anziVar9 = (anzi) aihhVar.instance;
            alayVarD.getClass();
            anziVar9.g = alayVarD;
            anziVar9.b |= 16;
            hlz hlzVar = this.c;
            alay alayVarC3 = ackj.c(hlzVar.g(anjxVar));
            aihhVar.copyOnWrite();
            anzi anziVar10 = (anzi) aihhVar.instance;
            alayVarC3.getClass();
            anziVar10.h = alayVarC3;
            anziVar10.b |= 32;
            aihhVar.copyOnWrite();
            anzi anziVar11 = (anzi) aihhVar.instance;
            anziVar11.f = 1;
            anziVar11.b |= 8;
            aihhVar.l(hmy.r(anjxVar.getAudioPlaylistId()));
            int iAV = a.aV(anjxVar.getContentRating().c);
            if (iAV == 0) {
                iAV = 1;
            }
            Optional optionalP = hlzVar.p(iAV);
            if (optionalP.isPresent()) {
                aihh aihhVar3 = (aihh) apjiVar.createBuilder();
                aihhVar3.e(anpw.a, optionalP.get());
                aihhVar.l((apji) aihhVar3.build());
            }
            Context context = this.a;
            aihhVar.k(hmy.t(context, anjxVar.getAudioPlaylistId(), annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS, annn.MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_IN_PROGRESS));
            aihhVar.k(hmy.u(context, anjxVar.getAudioPlaylistId()));
            ajwo ajwoVarT = fhz.T(anjxVar.getAudioPlaylistId(), true);
            aihhVar.copyOnWrite();
            anzi anziVar12 = (anzi) aihhVar.instance;
            ajwoVarT.getClass();
            anziVar12.i = ajwoVarT;
            anziVar12.b |= 64;
        }
        return (anzi) aihhVar.build();
    }
}
