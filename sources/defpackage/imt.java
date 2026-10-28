package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imt extends imf {
    private final Context a;
    private final awmd b;

    public imt(Context context, awmd awmdVar) {
        super(ankr.class, anzn.class);
        this.a = context;
        this.b = awmdVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        ankr ankrVar = (ankr) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        aihf aihfVarCreateBuilder = anzn.a.createBuilder();
        alay alayVarD = ackj.d(ankrVar.getName());
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar = (anzn) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anznVar.e = alayVarD;
        anznVar.b |= 4;
        apji apjiVarAi = hmy.ai(ankrVar.getThumbnailDetails(), 2);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar2 = (anzn) aihfVarCreateBuilder.instance;
        apjiVarAi.getClass();
        anznVar2.c = apjiVarAi;
        anznVar2.b |= 1;
        alay alayVarD2 = ackj.d(a.bN(this.a, R.string.num_songs, "num_songs", ankrVar.getTrackCount()));
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar3 = (anzn) aihfVarCreateBuilder.instance;
        alayVarD2.getClass();
        anznVar3.f = alayVarD2;
        anznVar3.b |= 8;
        if (optionalAl.isPresent()) {
            int i = ((imk) optionalAl.get()).b;
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                ajwo ajwoVarA = vxh.a(ankrVar.getAndroidMediaStoreContentUri());
                aihfVarCreateBuilder.copyOnWrite();
                anzn anznVar4 = (anzn) aihfVarCreateBuilder.instance;
                ajwoVarA.getClass();
                anznVar4.h = ajwoVarA;
                anznVar4.b |= 32;
            }
        }
        anfy anfyVar = (anfy) ((hfn) this.b.io()).ap(ankr.class, anfy.class, ankrVar, agkjVar);
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(angi.a, anfyVar);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar5 = (anzn) aihfVarCreateBuilder.instance;
        apji apjiVar = (apji) aihhVar.build();
        apjiVar.getClass();
        anznVar5.k = apjiVar;
        anznVar5.b |= SemanticState.Hidden;
        return (anzn) aihfVarCreateBuilder.build();
    }
}
