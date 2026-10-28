package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imx extends imf {
    private final Context a;
    private final hlz b;

    public imx(Context context, hlz hlzVar) {
        super(anuk.class, anfy.class);
        this.a = context;
        this.b = hlzVar;
    }

    private static final ajwo e(anuk anukVar) {
        aihf aihfVarCreateBuilder = apzc.a.createBuilder();
        String strP = hef.p(anukVar);
        aihfVarCreateBuilder.copyOnWrite();
        apzc apzcVar = (apzc) aihfVarCreateBuilder.instance;
        strP.getClass();
        apzcVar.c |= 1;
        apzcVar.d = strP;
        apzc apzcVar2 = (apzc) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apzc.b, apzcVar2);
        return (ajwo) aihhVar.build();
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        anuk anukVar = (anuk) obj;
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
            alay alayVarC = ackj.c(anukVar.getTitle());
            aihfVarCreateBuilder.copyOnWrite();
            anrp anrpVar = (anrp) aihfVarCreateBuilder.instance;
            alayVarC.getClass();
            anrpVar.c = alayVarC;
            anrpVar.b |= 1;
            hlz hlzVar = this.b;
            alay alayVarC2 = ackj.c(hlzVar.i(anukVar));
            aihfVarCreateBuilder.copyOnWrite();
            anrp anrpVar2 = (anrp) aihfVarCreateBuilder.instance;
            alayVarC2.getClass();
            anrpVar2.d = alayVarC2;
            anrpVar2.b |= 2;
            apji apjiVarE = hlzVar.e(anukVar.getThumbnailDetails());
            aihfVarCreateBuilder.copyOnWrite();
            anrp anrpVar3 = (anrp) aihfVarCreateBuilder.instance;
            apjiVarE.getClass();
            anrpVar3.e = apjiVarE;
            anrpVar3.b |= 4;
            anfy anfyVarB = hlzVar.b(anukVar.getPlaylistId(), anukVar.getTitle(), anukVar.getPodcastShowAdditionalMetadata().d ? null : ixt.s(anukVar.getPlaylistId()), (anrp) aihfVarCreateBuilder.build());
            Optional optional = imkVar.a;
            return (optional.isPresent() && ((imj) optional.get()).equals(imj.a)) ? anfyVarB : hmy.q(anfyVarB);
        }
        Optional optionalAl2 = hmy.al("display_context", imk.class, agkjVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strP = hef.p(anukVar);
        long jLongValue = anukVar.getTrackCount().longValue();
        if (jLongValue > 0) {
            arrayList.add(hmy.ad(this.a, strP));
        }
        if (((imk) optionalAl2.get()).a.isPresent() && ((imj) ((imk) optionalAl2.get()).a.get()).equals(imj.a)) {
            aihf aihfVarCreateBuilder2 = angf.a.createBuilder();
            aliz alizVar = aliz.EDIT;
            ajwo ajwoVarE = e(anukVar);
            aihh aihhVar = (aihh) ajnf.a.createBuilder();
            aihh aihhVar2 = (aihh) alja.a.createBuilder();
            aihhVar2.copyOnWrite();
            alja aljaVar = (alja) aihhVar2.instance;
            aljaVar.c = alizVar.yN;
            aljaVar.b |= 1;
            aihhVar.copyOnWrite();
            ajnf ajnfVar = (ajnf) aihhVar.instance;
            alja aljaVar2 = (alja) aihhVar2.build();
            aljaVar2.getClass();
            ajnfVar.f = aljaVar2;
            ajnfVar.e = 8;
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            ajwoVarE.getClass();
            ajnfVar2.s = ajwoVarE;
            ajnfVar2.b |= SemanticState.Multiline;
            aihh aihhVar3 = (aihh) ((ajnf) aihhVar.build()).toBuilder();
            aihf aihfVarCreateBuilder3 = aiqe.a.createBuilder();
            aihf aihfVarCreateBuilder4 = aiqd.a.createBuilder();
            String string = this.a.getString(R.string.menu_edit_playlist);
            aihfVarCreateBuilder4.copyOnWrite();
            aiqd aiqdVar = (aiqd) aihfVarCreateBuilder4.instance;
            string.getClass();
            aiqdVar.b |= 2;
            aiqdVar.c = string;
            aihfVarCreateBuilder3.copyOnWrite();
            aiqe aiqeVar = (aiqe) aihfVarCreateBuilder3.instance;
            aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder4.build();
            aiqdVar2.getClass();
            aiqeVar.c = aiqdVar2;
            aiqeVar.b |= 1;
            aihhVar3.copyOnWrite();
            ajnf ajnfVar3 = (ajnf) aihhVar3.instance;
            aiqe aiqeVar2 = (aiqe) aihfVarCreateBuilder3.build();
            aiqeVar2.getClass();
            ajnfVar3.v = aiqeVar2;
            ajnfVar3.b |= 262144;
            aihfVarCreateBuilder2.copyOnWrite();
            angf angfVar = (angf) aihfVarCreateBuilder2.instance;
            ajnf ajnfVar4 = (ajnf) aihhVar3.build();
            ajnfVar4.getClass();
            angfVar.c = ajnfVar4;
            angfVar.b |= 1;
            arrayList2.add((angf) aihfVarCreateBuilder2.build());
        } else {
            aihf aihfVarCreateBuilder5 = anfw.a.createBuilder();
            alay alayVarC3 = ackj.c(this.a.getString(R.string.menu_edit_playlist));
            aihfVarCreateBuilder5.copyOnWrite();
            anfw anfwVar = (anfw) aihfVarCreateBuilder5.instance;
            alayVarC3.getClass();
            anfwVar.c = alayVarC3;
            anfwVar.b |= 1;
            aihh aihhVar4 = (aihh) alja.a.createBuilder();
            aliz alizVar2 = aliz.EDIT;
            aihhVar4.copyOnWrite();
            alja aljaVar3 = (alja) aihhVar4.instance;
            aljaVar3.c = alizVar2.yN;
            aljaVar3.b |= 1;
            aihfVarCreateBuilder5.copyOnWrite();
            anfw anfwVar2 = (anfw) aihfVarCreateBuilder5.instance;
            alja aljaVar4 = (alja) aihhVar4.build();
            aljaVar4.getClass();
            anfwVar2.d = aljaVar4;
            anfwVar2.b |= 2;
            ajwo ajwoVarE2 = e(anukVar);
            aihfVarCreateBuilder5.copyOnWrite();
            anfw anfwVar3 = (anfw) aihfVarCreateBuilder5.instance;
            ajwoVarE2.getClass();
            anfwVar3.f = ajwoVarE2;
            anfwVar3.b |= 32;
            anfw anfwVar4 = (anfw) aihfVarCreateBuilder5.build();
            aihf aihfVarCreateBuilder6 = anfv.a.createBuilder();
            aihfVarCreateBuilder6.copyOnWrite();
            anfv anfvVar = (anfv) aihfVarCreateBuilder6.instance;
            anfwVar4.getClass();
            anfvVar.c = anfwVar4;
            anfvVar.b = 66441108;
            arrayList.add((anfv) aihfVarCreateBuilder6.build());
        }
        aihf aihfVarCreateBuilder7 = apyr.a.createBuilder();
        String strP2 = hef.p(anukVar);
        aihfVarCreateBuilder7.copyOnWrite();
        apyr apyrVar = (apyr) aihfVarCreateBuilder7.instance;
        strP2.getClass();
        apyrVar.c |= 1;
        apyrVar.d = strP2;
        apyr apyrVar2 = (apyr) aihfVarCreateBuilder7.build();
        aihh aihhVar5 = (aihh) ajwo.a.createBuilder();
        aihhVar5.e(apyr.b, apyrVar2);
        ajwo ajwoVar = (ajwo) aihhVar5.build();
        aihf aihfVarCreateBuilder8 = anfw.a.createBuilder();
        Context context = this.a;
        alay alayVarC4 = ackj.c(context.getString(R.string.menu_delete_playlist));
        aihfVarCreateBuilder8.copyOnWrite();
        anfw anfwVar5 = (anfw) aihfVarCreateBuilder8.instance;
        alayVarC4.getClass();
        anfwVar5.c = alayVarC4;
        anfwVar5.b |= 1;
        aihh aihhVar6 = (aihh) alja.a.createBuilder();
        aliz alizVar3 = aliz.DELETE;
        aihhVar6.copyOnWrite();
        alja aljaVar5 = (alja) aihhVar6.instance;
        aljaVar5.c = alizVar3.yN;
        aljaVar5.b |= 1;
        aihfVarCreateBuilder8.copyOnWrite();
        anfw anfwVar6 = (anfw) aihfVarCreateBuilder8.instance;
        alja aljaVar6 = (alja) aihhVar6.build();
        aljaVar6.getClass();
        anfwVar6.d = aljaVar6;
        anfwVar6.b |= 2;
        aihfVarCreateBuilder8.copyOnWrite();
        anfw anfwVar7 = (anfw) aihfVarCreateBuilder8.instance;
        ajwoVar.getClass();
        anfwVar7.f = ajwoVar;
        anfwVar7.b |= 32;
        anfw anfwVar8 = (anfw) aihfVarCreateBuilder8.build();
        aihf aihfVarCreateBuilder9 = anfv.a.createBuilder();
        aihfVarCreateBuilder9.copyOnWrite();
        anfv anfvVar2 = (anfv) aihfVarCreateBuilder9.instance;
        anfwVar8.getClass();
        anfvVar2.c = anfwVar8;
        anfvVar2.b = 66441108;
        arrayList.add((anfv) aihfVarCreateBuilder9.build());
        if (jLongValue > 0) {
            arrayList.add(hmy.ah(context, strP));
            arrayList.add(hmy.ac(context, strP, R.string.play_next_toast_playlist));
            arrayList.add(hmy.ab(context, strP, R.string.add_to_queue_toast_playlist));
        }
        aihf aihfVarCreateBuilder10 = anfy.a.createBuilder();
        aihfVarCreateBuilder10.bH(arrayList);
        aihfVarCreateBuilder10.copyOnWrite();
        anfy anfyVar = (anfy) aihfVarCreateBuilder10.instance;
        anfyVar.b();
        aifs.addAll(arrayList2, anfyVar.d);
        aihf aihfVarCreateBuilder11 = ange.a.createBuilder();
        aihf aihfVarCreateBuilder12 = anrp.a.createBuilder();
        alay alayVarC5 = ackj.c(anukVar.getTitle());
        aihfVarCreateBuilder12.copyOnWrite();
        anrp anrpVar4 = (anrp) aihfVarCreateBuilder12.instance;
        alayVarC5.getClass();
        anrpVar4.c = alayVarC5;
        anrpVar4.b |= 1;
        apji apjiVarAi = hmy.ai(anukVar.getThumbnailDetails(), 1);
        aihfVarCreateBuilder12.copyOnWrite();
        anrp anrpVar5 = (anrp) aihfVarCreateBuilder12.instance;
        apjiVarAi.getClass();
        anrpVar5.e = apjiVarAi;
        anrpVar5.b |= 4;
        if (anukVar.l()) {
            alay alayVarD = ackj.d(a.bN(context, R.string.num_songs, "num_songs", anukVar.getTrackCount()));
            aihfVarCreateBuilder12.copyOnWrite();
            anrp anrpVar6 = (anrp) aihfVarCreateBuilder12.instance;
            alayVarD.getClass();
            anrpVar6.d = alayVarD;
            anrpVar6.b |= 2;
        }
        anrp anrpVar7 = (anrp) aihfVarCreateBuilder12.build();
        aihfVarCreateBuilder11.copyOnWrite();
        ange angeVar = (ange) aihfVarCreateBuilder11.instance;
        anrpVar7.getClass();
        angeVar.c = anrpVar7;
        angeVar.b = 72399185;
        aihfVarCreateBuilder10.copyOnWrite();
        anfy anfyVar2 = (anfy) aihfVarCreateBuilder10.instance;
        ange angeVar2 = (ange) aihfVarCreateBuilder11.build();
        angeVar2.getClass();
        anfyVar2.f = angeVar2;
        anfyVar2.b |= 4;
        return (anfy) aihfVarCreateBuilder10.build();
    }
}
