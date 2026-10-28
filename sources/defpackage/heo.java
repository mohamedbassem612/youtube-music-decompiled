package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class heo implements sya {
    private final /* synthetic */ int $cid;

    public /* synthetic */ heo(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sya
    public final Object a(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                aihf aihfVar = (aihf) obj;
                aihfVar.copyOnWrite();
                aldw aldwVar = (aldw) aihfVar.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                aldw aldwVar2 = aldw.a;
                innertubeContext$InnerTubeContext.getClass();
                aldwVar.c = innertubeContext$InnerTubeContext;
                aldwVar.b |= 1;
                return aihfVar;
            case 1:
                aihf aihfVar2 = (aihf) obj;
                aihfVar2.copyOnWrite();
                alsp alspVar = (alsp) aihfVar2.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alsp alspVar2 = alsp.a;
                innertubeContext$InnerTubeContext2.getClass();
                alspVar.c = innertubeContext$InnerTubeContext2;
                alspVar.b |= 1;
                return aihfVar2;
            case 2:
                aihf aihfVar3 = (aihf) obj;
                aihfVar3.copyOnWrite();
                aldl aldlVar = (aldl) aihfVar3.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext3 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                aldl aldlVar2 = aldl.a;
                innertubeContext$InnerTubeContext3.getClass();
                aldlVar.c = innertubeContext$InnerTubeContext3;
                aldlVar.b |= 1;
                return aihfVar3;
            case 3:
                aihf builder = ((atpl) obj).toBuilder();
                arfb arfbVar = ((Boolean) obj2).booleanValue() ? arfb.VIDEO_QUALITY_SETTING_DATA_SAVER : arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                builder.copyOnWrite();
                atpl atplVar = (atpl) builder.instance;
                atplVar.i = arfbVar.e;
                atplVar.b |= 16;
                return (atpl) builder.build();
            case 4:
                aihf builder2 = ((aimn) obj).toBuilder();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                builder2.copyOnWrite();
                aimn aimnVar = (aimn) builder2.instance;
                aimnVar.b |= 2;
                aimnVar.d = zBooleanValue;
                return (aimn) builder2.build();
            case 5:
                String str = (String) obj;
                aimn aimnVar2 = iqe.a;
                str.getClass();
                aimn aimnVar3 = (aimn) ((aili) obj2).b.get(str);
                return aimnVar3 == null ? aimnVar2 : aimnVar3;
            case 6:
                aihf aihfVar4 = (aihf) obj;
                aihfVar4.copyOnWrite();
                alpr alprVar = (alpr) aihfVar4.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext4 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alpr alprVar2 = alpr.a;
                innertubeContext$InnerTubeContext4.getClass();
                alprVar.c = innertubeContext$InnerTubeContext4;
                alprVar.b |= 1;
                return aihfVar4;
            case 7:
                Object obj3 = ((dov) obj).a;
                aihf aihfVar5 = (aihf) obj2;
                agqr it = ((agkj) obj3).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    Integer num = (Integer) entry.getValue();
                    num.intValue();
                    str2.getClass();
                    aihfVar5.copyOnWrite();
                    atos atosVar = (atos) aihfVar5.instance;
                    atos atosVar2 = atos.a;
                    aiip aiipVar = atosVar.d;
                    if (!aiipVar.b) {
                        atosVar.d = aiipVar.a();
                    }
                    atosVar.d.put(str2, num);
                }
                return aihfVar5;
            case 8:
                aihf aihfVar6 = (aihf) obj;
                aihfVar6.copyOnWrite();
                alze alzeVar = (alze) aihfVar6.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext5 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alze alzeVar2 = alze.a;
                innertubeContext$InnerTubeContext5.getClass();
                alzeVar.c = innertubeContext$InnerTubeContext5;
                alzeVar.b |= 1;
                return aihfVar6;
            case 9:
                Object obj4 = ((dov) obj).a;
                aihf aihfVar7 = (aihf) obj2;
                agqr it2 = ((agkj) obj4).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (entry2.getValue() != null) {
                        Long l = (Long) entry2.getValue();
                        String str3 = (String) entry2.getKey();
                        l.longValue();
                        str3.getClass();
                        aihfVar7.copyOnWrite();
                        vlg vlgVar = (vlg) aihfVar7.instance;
                        vlg vlgVar2 = vlg.a;
                        aiip aiipVar2 = vlgVar.d;
                        if (!aiipVar2.b) {
                            vlgVar.d = aiipVar2.a();
                        }
                        vlgVar.d.put(str3, l);
                    }
                }
                return aihfVar7;
            case 10:
                aihf aihfVar8 = (aihf) obj;
                aihfVar8.copyOnWrite();
                allb allbVar = (allb) aihfVar8.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext6 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                allb allbVar2 = allb.a;
                innertubeContext$InnerTubeContext6.getClass();
                allbVar.c = innertubeContext$InnerTubeContext6;
                allbVar.b |= 2;
                return aihfVar8;
            case 11:
                aihf aihfVar9 = (aihf) obj;
                aihfVar9.copyOnWrite();
                allj alljVar = (allj) aihfVar9.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext7 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                allj alljVar2 = allj.a;
                innertubeContext$InnerTubeContext7.getClass();
                alljVar.c = innertubeContext$InnerTubeContext7;
                alljVar.b |= 1;
                return aihfVar9;
            case 12:
                aihf aihfVar10 = (aihf) obj;
                aihfVar10.copyOnWrite();
                alll alllVar = (alll) aihfVar10.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext8 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alll alllVar2 = alll.a;
                innertubeContext$InnerTubeContext8.getClass();
                alllVar.c = innertubeContext$InnerTubeContext8;
                alllVar.b |= 1;
                return aihfVar10;
            case 13:
                aihf aihfVar11 = (aihf) obj;
                aihfVar11.copyOnWrite();
                alsl alslVar = (alsl) aihfVar11.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext9 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alsl alslVar2 = alsl.a;
                innertubeContext$InnerTubeContext9.getClass();
                alslVar.e = innertubeContext$InnerTubeContext9;
                alslVar.b |= 1;
                return aihfVar11;
            case 14:
                aihh aihhVar = (aihh) obj;
                aihhVar.copyOnWrite();
                almb almbVar = (almb) aihhVar.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext10 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                almb almbVar2 = almb.a;
                innertubeContext$InnerTubeContext10.getClass();
                almbVar.d = innertubeContext$InnerTubeContext10;
                almbVar.b |= 1;
                return aihhVar;
            case 15:
                aihh aihhVar2 = (aihh) obj;
                aihhVar2.copyOnWrite();
                almb almbVar3 = (almb) aihhVar2.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext11 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                almb almbVar4 = almb.a;
                innertubeContext$InnerTubeContext11.getClass();
                almbVar3.d = innertubeContext$InnerTubeContext11;
                almbVar3.b |= 1;
                return aihhVar2;
            case 16:
                aihf aihfVar12 = (aihf) obj;
                aihfVar12.copyOnWrite();
                almm almmVar = (almm) aihfVar12.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext12 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                almm almmVar2 = almm.a;
                innertubeContext$InnerTubeContext12.getClass();
                almmVar.d = innertubeContext$InnerTubeContext12;
                almmVar.b |= 2;
                return aihfVar12;
            case 17:
                aihf aihfVar13 = (aihf) obj;
                aihfVar13.copyOnWrite();
                almp almpVar = (almp) aihfVar13.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext13 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                almp almpVar2 = almp.a;
                innertubeContext$InnerTubeContext13.getClass();
                almpVar.c = innertubeContext$InnerTubeContext13;
                almpVar.b |= 1;
                return aihfVar13;
            case 18:
                aihf aihfVar14 = (aihf) obj;
                aihfVar14.copyOnWrite();
                alyz alyzVar = (alyz) aihfVar14.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext14 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alyz alyzVar2 = alyz.a;
                innertubeContext$InnerTubeContext14.getClass();
                alyzVar.c = innertubeContext$InnerTubeContext14;
                alyzVar.b |= 1;
                return aihfVar14;
            case 19:
                aihf aihfVar15 = (aihf) obj;
                aihfVar15.copyOnWrite();
                alzj alzjVar = (alzj) aihfVar15.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext15 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alzj alzjVar2 = alzj.a;
                innertubeContext$InnerTubeContext15.getClass();
                alzjVar.e = innertubeContext$InnerTubeContext15;
                alzjVar.b |= 1;
                return aihfVar15;
            default:
                aihf aihfVar16 = (aihf) obj;
                aihfVar16.copyOnWrite();
                almu almuVar = (almu) aihfVar16.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext16 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                almu almuVar2 = almu.a;
                innertubeContext$InnerTubeContext16.getClass();
                almuVar.c = innertubeContext$InnerTubeContext16;
                almuVar.b |= 1;
                return aihfVar16;
        }
    }
}
