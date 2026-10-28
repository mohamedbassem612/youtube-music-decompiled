package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imu extends imf {
    private final Context a;

    public imu(Context context) {
        super(ankr.class, anfy.class);
        this.a = context;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        ankr ankrVar = (ankr) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        ArrayList arrayList = new ArrayList();
        if (optionalAl.isPresent()) {
            int i = ((imk) optionalAl.get()).b;
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                arrayList.add(hmy.ad(this.a, ankrVar.getAndroidMediaStoreContentUri()));
            }
        }
        aihf aihfVarCreateBuilder = anfy.a.createBuilder();
        aihfVarCreateBuilder.bH(arrayList);
        aihf aihfVarCreateBuilder2 = ange.a.createBuilder();
        aihf aihfVarCreateBuilder3 = anrp.a.createBuilder();
        alay alayVarC = ackj.c(ankrVar.getName());
        aihfVarCreateBuilder3.copyOnWrite();
        anrp anrpVar = (anrp) aihfVarCreateBuilder3.instance;
        alayVarC.getClass();
        anrpVar.c = alayVarC;
        anrpVar.b |= 1;
        alay alayVarD = ackj.d(a.bN(this.a, R.string.num_songs, "num_songs", ankrVar.getTrackCount()));
        aihfVarCreateBuilder3.copyOnWrite();
        anrp anrpVar2 = (anrp) aihfVarCreateBuilder3.instance;
        alayVarD.getClass();
        anrpVar2.d = alayVarD;
        anrpVar2.b |= 2;
        apji apjiVarAi = hmy.ai(ankrVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder3.copyOnWrite();
        anrp anrpVar3 = (anrp) aihfVarCreateBuilder3.instance;
        apjiVarAi.getClass();
        anrpVar3.e = apjiVarAi;
        anrpVar3.b |= 4;
        anrp anrpVar4 = (anrp) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder2.copyOnWrite();
        ange angeVar = (ange) aihfVarCreateBuilder2.instance;
        anrpVar4.getClass();
        angeVar.c = anrpVar4;
        angeVar.b = 72399185;
        aihfVarCreateBuilder.copyOnWrite();
        anfy anfyVar = (anfy) aihfVarCreateBuilder.instance;
        ange angeVar2 = (ange) aihfVarCreateBuilder2.build();
        angeVar2.getClass();
        anfyVar.f = angeVar2;
        anfyVar.b |= 4;
        return (anfy) aihfVarCreateBuilder.build();
    }
}
