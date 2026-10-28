package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imn extends imf {
    private final Context a;
    private final hlz b;

    public imn(Context context, hlz hlzVar) {
        super(anjx.class, anfy.class);
        this.a = context;
        this.b = hlzVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        anjx anjxVar = (anjx) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        if (optionalAl.isEmpty()) {
            throw new IllegalArgumentException("Display context must be provided");
        }
        int i = ((imk) optionalAl.get()).b;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            int i2 = ((imk) optionalAl.get()).b;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != 2) {
                throw new IllegalArgumentException("Unexpected display surface");
            }
            imk imkVar = (imk) optionalAl.get();
            aihf aihfVarCreateBuilder = anrp.a.createBuilder();
            alay alayVarC = ackj.c(anjxVar.getTitle());
            aihfVarCreateBuilder.copyOnWrite();
            anrp anrpVar = (anrp) aihfVarCreateBuilder.instance;
            alayVarC.getClass();
            anrpVar.c = alayVarC;
            anrpVar.b |= 1;
            hlz hlzVar = this.b;
            alay alayVarC2 = ackj.c(hlzVar.g(anjxVar));
            aihfVarCreateBuilder.copyOnWrite();
            anrp anrpVar2 = (anrp) aihfVarCreateBuilder.instance;
            alayVarC2.getClass();
            anrpVar2.d = alayVarC2;
            anrpVar2.b |= 2;
            apji apjiVarE = hlzVar.e(anjxVar.getThumbnailDetails());
            aihfVarCreateBuilder.copyOnWrite();
            anrp anrpVar3 = (anrp) aihfVarCreateBuilder.instance;
            apjiVarE.getClass();
            anrpVar3.e = apjiVarE;
            anrpVar3.b |= 4;
            anfy anfyVarB = hlzVar.b(anjxVar.getAudioPlaylistId(), anjxVar.getTitle(), ixt.s(anjxVar.getAudioPlaylistId()), (anrp) aihfVarCreateBuilder.build());
            Optional optional = imkVar.a;
            return (optional.isPresent() && ((imj) optional.get()).equals(imj.a)) ? anfyVarB : hmy.q(anfyVarB);
        }
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        arrayList.add(hmy.ad(context, anjxVar.getAndroidMediaStoreContentUri()));
        arrayList.add(hmy.ah(context, anjxVar.getAndroidMediaStoreContentUri()));
        arrayList.add(hmy.ac(context, anjxVar.getAndroidMediaStoreContentUri(), R.string.play_next_toast_album));
        arrayList.add(hmy.ab(context, anjxVar.getAndroidMediaStoreContentUri(), R.string.add_to_queue_toast_album));
        aihf aihfVarCreateBuilder2 = anfy.a.createBuilder();
        aihfVarCreateBuilder2.bH(arrayList);
        aihf aihfVarCreateBuilder3 = ange.a.createBuilder();
        aihf aihfVarCreateBuilder4 = anrp.a.createBuilder();
        alay alayVarC3 = ackj.c(anjxVar.getTitle());
        aihfVarCreateBuilder4.copyOnWrite();
        anrp anrpVar4 = (anrp) aihfVarCreateBuilder4.instance;
        alayVarC3.getClass();
        anrpVar4.c = alayVarC3;
        anrpVar4.b |= 1;
        alay alayVarC4 = anjxVar.f() ? ackj.c(context.getString(R.string.album_subtitle_with_artist_and_release_year, anjxVar.getArtistDisplayName(), Integer.valueOf(anjxVar.getReleaseDate().c))) : ackj.c(anjxVar.getArtistDisplayName());
        aihfVarCreateBuilder4.copyOnWrite();
        anrp anrpVar5 = (anrp) aihfVarCreateBuilder4.instance;
        alayVarC4.getClass();
        anrpVar5.d = alayVarC4;
        anrpVar5.b |= 2;
        apji apjiVarAi = hmy.ai(anjxVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder4.copyOnWrite();
        anrp anrpVar6 = (anrp) aihfVarCreateBuilder4.instance;
        apjiVarAi.getClass();
        anrpVar6.e = apjiVarAi;
        anrpVar6.b |= 4;
        anrp anrpVar7 = (anrp) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder3.copyOnWrite();
        ange angeVar = (ange) aihfVarCreateBuilder3.instance;
        anrpVar7.getClass();
        angeVar.c = anrpVar7;
        angeVar.b = 72399185;
        aihfVarCreateBuilder2.copyOnWrite();
        anfy anfyVar = (anfy) aihfVarCreateBuilder2.instance;
        ange angeVar2 = (ange) aihfVarCreateBuilder3.build();
        angeVar2.getClass();
        anfyVar.f = angeVar2;
        anfyVar.b |= 4;
        return (anfy) aihfVarCreateBuilder2.build();
    }
}
