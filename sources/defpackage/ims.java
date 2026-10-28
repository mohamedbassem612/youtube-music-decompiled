package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ims extends imf {
    private final Context a;
    private final awmd b;

    public ims(Context context, awmd awmdVar) {
        super(ankr.class, anzi.class);
        this.a = context;
        this.b = awmdVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        ankr ankrVar = (ankr) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        aihh aihhVar = (aihh) anzi.a.createBuilder();
        alay alayVarD = ackj.d(ankrVar.getName());
        aihhVar.copyOnWrite();
        anzi anziVar = (anzi) aihhVar.instance;
        alayVarD.getClass();
        anziVar.g = alayVarD;
        anziVar.b |= 16;
        apji apjiVarAi = hmy.ai(ankrVar.getThumbnailDetails(), 2);
        aihhVar.copyOnWrite();
        anzi anziVar2 = (anzi) aihhVar.instance;
        apjiVarAi.getClass();
        anziVar2.c = apjiVarAi;
        anziVar2.b |= 1;
        alay alayVarD2 = ackj.d(a.bN(this.a, R.string.num_songs, "num_songs", ankrVar.getTrackCount()));
        aihhVar.copyOnWrite();
        anzi anziVar3 = (anzi) aihhVar.instance;
        alayVarD2.getClass();
        anziVar3.h = alayVarD2;
        anziVar3.b |= 32;
        if (optionalAl.isPresent()) {
            int i = ((imk) optionalAl.get()).b;
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                ajwo ajwoVarA = vxh.a(ankrVar.getAndroidMediaStoreContentUri());
                aihhVar.copyOnWrite();
                anzi anziVar4 = (anzi) aihhVar.instance;
                ajwoVarA.getClass();
                anziVar4.i = ajwoVarA;
                anziVar4.b |= 64;
            }
        }
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(ankr.class, anfy.class, ankrVar, agkjVar);
        aihh aihhVar2 = (aihh) apji.a.createBuilder();
        aihhVar2.e(angi.a, anfyVar);
        aihhVar.copyOnWrite();
        anzi anziVar5 = (anzi) aihhVar.instance;
        apji apjiVar = (apji) aihhVar2.build();
        apjiVar.getClass();
        anziVar5.p = apjiVar;
        anziVar5.b |= SemanticState.Multiline;
        aihhVar.copyOnWrite();
        anzi anziVar6 = (anzi) aihhVar.instance;
        anziVar6.r = 2;
        anziVar6.b |= 32768;
        if (optionalAl.isPresent() && ((imk) optionalAl.get()).a.isPresent() && ((imk) optionalAl.get()).a.get() == imj.c) {
            aihhVar.copyOnWrite();
            anzi anziVar7 = (anzi) aihhVar.instance;
            anziVar7.d = 1;
            anziVar7.b |= 2;
        }
        return (anzi) aihhVar.build();
    }
}
