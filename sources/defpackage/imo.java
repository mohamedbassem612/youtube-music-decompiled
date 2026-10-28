package defpackage;

import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imo extends imf {
    private final Context a;
    private final awmd b;

    public imo(Context context, awmd awmdVar) {
        super(anjx.class, anne.class);
        this.a = context;
        this.b = awmdVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        Optional optionalEmpty3;
        anjx anjxVar = (anjx) obj;
        aihf aihfVarCreateBuilder = anne.a.createBuilder();
        alay alayVarD = ackj.d(anjxVar.getTitle());
        aihfVarCreateBuilder.copyOnWrite();
        anne anneVar = (anne) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anneVar.c = alayVarD;
        anneVar.b |= 1;
        Object[] objArr = {anjxVar.getArtistDisplayName()};
        Context context = this.a;
        alay alayVarD2 = ackj.d(context.getString(R.string.by_artist, objArr));
        aihfVarCreateBuilder.copyOnWrite();
        anne anneVar2 = (anne) aihfVarCreateBuilder.instance;
        alayVarD2.getClass();
        anneVar2.d = alayVarD2;
        anneVar2.b |= 2;
        alay alayVarC = anjxVar.f() ? ackj.c(context.getString(R.string.offline_album_detail_page_subtitle_with_year, context.getString(R.string.album_label), Integer.valueOf(anjxVar.getReleaseDate().c))) : ackj.c(context.getString(R.string.album_label));
        aihfVarCreateBuilder.copyOnWrite();
        anne anneVar3 = (anne) aihfVarCreateBuilder.instance;
        alayVarC.getClass();
        anneVar3.e = alayVarC;
        anneVar3.b |= 4;
        apji apjiVarAi = hmy.ai(anjxVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder.copyOnWrite();
        anne anneVar4 = (anne) aihfVarCreateBuilder.instance;
        apjiVarAi.getClass();
        anneVar4.j = apjiVarAi;
        anneVar4.b |= SemanticState.LiveRegion;
        if (!TextUtils.isEmpty(anjxVar.getAndroidMediaStoreContentUri())) {
            optionalEmpty = Optional.of(hef.o("", anjxVar.getAndroidMediaStoreContentUri(), 0, false));
        } else if (TextUtils.isEmpty(anjxVar.getAudioPlaylistId())) {
            optionalEmpty = Optional.empty();
        } else {
            ias iasVarG = hna.g();
            iasVarG.b = anjxVar.getAudioPlaylistId();
            optionalEmpty = Optional.of(iasVarG.a());
        }
        if (!TextUtils.isEmpty(anjxVar.getAndroidMediaStoreContentUri())) {
            optionalEmpty2 = Optional.of(hef.o("", anjxVar.getAndroidMediaStoreContentUri(), 0, true));
        } else if (TextUtils.isEmpty(anjxVar.getAudioPlaylistId())) {
            optionalEmpty2 = Optional.empty();
        } else {
            ias iasVarG2 = hna.g();
            iasVarG2.b = anjxVar.getAudioPlaylistId();
            iasVarG2.k(true);
            optionalEmpty2 = Optional.of(iasVarG2.a());
        }
        if (optionalEmpty.isEmpty() || optionalEmpty2.isEmpty()) {
            optionalEmpty3 = Optional.empty();
        } else {
            aihf aihfVarCreateBuilder2 = annc.a.createBuilder();
            apji apjiVarAj = hmy.aj(context, 3, (ajwo) optionalEmpty.get());
            aihfVarCreateBuilder2.copyOnWrite();
            annc anncVar = (annc) aihfVarCreateBuilder2.instance;
            apjiVarAj.getClass();
            anncVar.c = apjiVarAj;
            anncVar.b |= 1;
            apji apjiVarAk = hmy.ak(context, 19, (ajwo) optionalEmpty2.get());
            aihfVarCreateBuilder2.copyOnWrite();
            annc anncVar2 = (annc) aihfVarCreateBuilder2.instance;
            apjiVarAk.getClass();
            anncVar2.d = apjiVarAk;
            anncVar2.b |= 2;
            annc anncVar3 = (annc) aihfVarCreateBuilder2.build();
            aihh aihhVar = (aihh) apji.a.createBuilder();
            aihhVar.e(annf.c, anncVar3);
            optionalEmpty3 = Optional.of((apji) aihhVar.build());
        }
        if (optionalEmpty3.isPresent()) {
            Object obj2 = optionalEmpty3.get();
            aihfVarCreateBuilder.copyOnWrite();
            anne anneVar5 = (anne) aihfVarCreateBuilder.instance;
            anneVar5.g = (apji) obj2;
            anneVar5.b |= 64;
        }
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(anjx.class, anfy.class, anjxVar, agkjVar);
        aihh aihhVar2 = (aihh) apji.a.createBuilder();
        aihhVar2.e(angi.a, anfyVar);
        aihfVarCreateBuilder.copyOnWrite();
        anne anneVar6 = (anne) aihfVarCreateBuilder.instance;
        apji apjiVar = (apji) aihhVar2.build();
        apjiVar.getClass();
        anneVar6.i = apjiVar;
        anneVar6.b |= SemanticState.Hidden;
        return (anne) aihfVarCreateBuilder.build();
    }
}
