package defpackage;

import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imy extends imf {
    private final Context a;
    private final awmd b;

    public imy(Context context, awmd awmdVar) {
        super(anuk.class, annx.class);
        this.a = context;
        this.b = awmdVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        Optional optionalEmpty3;
        anuk anukVar = (anuk) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        aihf aihfVarCreateBuilder = annx.a.createBuilder();
        if (optionalAl.isPresent()) {
            int i = ((imk) optionalAl.get()).b;
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                String strP = hef.p(anukVar);
                aihfVarCreateBuilder.copyOnWrite();
                annx annxVar = (annx) aihfVarCreateBuilder.instance;
                strP.getClass();
                annxVar.b |= 16;
                annxVar.f = strP;
            }
        }
        aihf aihfVarCreateBuilder2 = anne.a.createBuilder();
        alay alayVarD = ackj.d(anukVar.getTitle());
        aihfVarCreateBuilder2.copyOnWrite();
        anne anneVar = (anne) aihfVarCreateBuilder2.instance;
        alayVarD.getClass();
        anneVar.c = alayVarD;
        anneVar.b |= 1;
        Context context = this.a;
        alay alayVarC = ackj.c(context.getString(R.string.playlist_with_num_songs, context.getString(R.string.playlist_label), a.bN(context, R.string.num_songs, "num_songs", anukVar.getTrackCount())));
        aihfVarCreateBuilder2.copyOnWrite();
        anne anneVar2 = (anne) aihfVarCreateBuilder2.instance;
        alayVarC.getClass();
        anneVar2.e = alayVarC;
        anneVar2.b |= 4;
        apji apjiVarAi = hmy.ai(anukVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder2.copyOnWrite();
        anne anneVar3 = (anne) aihfVarCreateBuilder2.instance;
        apjiVarAi.getClass();
        anneVar3.j = apjiVarAi;
        anneVar3.b |= SemanticState.LiveRegion;
        if (anukVar.getTrackCount().longValue() == 0) {
            optionalEmpty3 = Optional.empty();
        } else {
            if (!TextUtils.isEmpty(anukVar.i())) {
                optionalEmpty = Optional.of(hef.o("", hef.p(anukVar), 0, false));
            } else if (TextUtils.isEmpty(anukVar.getFullListId())) {
                optionalEmpty = Optional.empty();
            } else {
                ias iasVarG = hna.g();
                iasVarG.b = anukVar.getFullListId();
                optionalEmpty = Optional.of(iasVarG.a());
            }
            if (!TextUtils.isEmpty(anukVar.i())) {
                optionalEmpty2 = Optional.of(hef.o("", hef.p(anukVar), 0, true));
            } else if (TextUtils.isEmpty(anukVar.getFullListId())) {
                optionalEmpty2 = Optional.empty();
            } else {
                ias iasVarG2 = hna.g();
                iasVarG2.b = anukVar.getFullListId();
                iasVarG2.k(true);
                optionalEmpty2 = Optional.of(iasVarG2.a());
            }
            if (optionalEmpty.isEmpty() || optionalEmpty2.isEmpty()) {
                optionalEmpty3 = Optional.empty();
            } else {
                aihf aihfVarCreateBuilder3 = annc.a.createBuilder();
                apji apjiVarAj = hmy.aj(context, 19, (ajwo) optionalEmpty.get());
                aihfVarCreateBuilder3.copyOnWrite();
                annc anncVar = (annc) aihfVarCreateBuilder3.instance;
                apjiVarAj.getClass();
                anncVar.d = apjiVarAj;
                anncVar.b |= 2;
                apji apjiVarAk = hmy.ak(context, 3, (ajwo) optionalEmpty2.get());
                aihfVarCreateBuilder3.copyOnWrite();
                annc anncVar2 = (annc) aihfVarCreateBuilder3.instance;
                apjiVarAk.getClass();
                anncVar2.c = apjiVarAk;
                anncVar2.b |= 1;
                annc anncVar3 = (annc) aihfVarCreateBuilder3.build();
                aihh aihhVar = (aihh) apji.a.createBuilder();
                aihhVar.e(annf.c, anncVar3);
                optionalEmpty3 = Optional.of((apji) aihhVar.build());
            }
        }
        imc imcVar = new imc(aihfVarCreateBuilder2, 2);
        if (true == optionalEmpty3.isPresent()) {
            Object obj2 = optionalEmpty3.get();
            aihf aihfVar = (aihf) imcVar.a;
            aihfVar.copyOnWrite();
            anne anneVar4 = (anne) aihfVar.instance;
            anneVar4.g = (apji) obj2;
            anneVar4.b |= 64;
        }
        hfn hfnVar = (hfn) this.b.io();
        Optional optionalAl2 = hmy.al("display_context", imk.class, agkjVar);
        if (!optionalAl2.isEmpty()) {
            HashMap map = new HashMap(agkjVar);
            zh zhVar = new zh((imk) optionalAl2.get());
            zhVar.e(imj.a);
            map.put("display_context", zhVar.d());
            agkjVar = agkj.h(map);
        }
        anfy anfyVar = (anfy) hfnVar.ap(anuk.class, anfy.class, anukVar, agkjVar);
        apji apjiVar = apji.a;
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(angi.a, anfyVar);
        aihfVarCreateBuilder2.copyOnWrite();
        anne anneVar5 = (anne) aihfVarCreateBuilder2.instance;
        apji apjiVar2 = (apji) aihhVar2.build();
        apjiVar2.getClass();
        anneVar5.i = apjiVar2;
        anneVar5.b |= SemanticState.Hidden;
        aihh aihhVar3 = (aihh) apjiVar.createBuilder();
        aihhVar3.e(annf.b, (anne) aihfVarCreateBuilder2.build());
        aihfVarCreateBuilder.copyOnWrite();
        annx annxVar2 = (annx) aihfVarCreateBuilder.instance;
        apji apjiVar3 = (apji) aihhVar3.build();
        apjiVar3.getClass();
        annxVar2.c = apjiVar3;
        annxVar2.b |= 1;
        aihf aihfVarCreateBuilder4 = anny.a.createBuilder();
        alay alayVarC2 = ackj.c(context.getString(R.string.edit_playlist_title));
        aihfVarCreateBuilder4.copyOnWrite();
        anny annyVar = (anny) aihfVarCreateBuilder4.instance;
        alayVarC2.getClass();
        annyVar.d = alayVarC2;
        annyVar.b |= 2;
        alay alayVarD2 = ackj.d(anukVar.getTitle());
        aihfVarCreateBuilder4.copyOnWrite();
        anny annyVar2 = (anny) aihfVarCreateBuilder4.instance;
        alayVarD2.getClass();
        annyVar2.c = alayVarD2;
        annyVar2.b |= 1;
        anny annyVar3 = (anny) aihfVarCreateBuilder4.build();
        aihh aihhVar4 = (aihh) apjiVar.createBuilder();
        aihhVar4.e(annz.a, annyVar3);
        aihfVarCreateBuilder.copyOnWrite();
        annx annxVar3 = (annx) aihfVarCreateBuilder.instance;
        apji apjiVar4 = (apji) aihhVar4.build();
        apjiVar4.getClass();
        annxVar3.d = apjiVar4;
        annxVar3.b |= 2;
        return (annx) aihfVarCreateBuilder.build();
    }
}
