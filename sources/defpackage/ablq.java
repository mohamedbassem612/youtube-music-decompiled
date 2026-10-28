package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ablq implements sya {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ablq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.sya
    public final Object a(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                aihf builder = ((atpu) obj).toBuilder();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                builder.copyOnWrite();
                atpu atpuVar = (atpu) builder.instance;
                atpuVar.b |= 2;
                atpuVar.d = zBooleanValue;
                return (atpu) builder.build();
            case 1:
                aihf builder2 = ((atpu) obj).toBuilder();
                aihf aihfVarCreateBuilder = aigu.a.createBuilder();
                long j = Long.parseLong((String) obj2);
                aihfVarCreateBuilder.copyOnWrite();
                ((aigu) aihfVarCreateBuilder.instance).b = j;
                builder2.copyOnWrite();
                atpu atpuVar2 = (atpu) builder2.instance;
                aigu aiguVar = (aigu) aihfVarCreateBuilder.build();
                aiguVar.getClass();
                atpuVar2.c = aiguVar;
                atpuVar2.b |= 1;
                return (atpu) builder2.build();
            case 2:
                aihf builder3 = ((atpu) obj).toBuilder();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                builder3.copyOnWrite();
                atpu atpuVar3 = (atpu) builder3.instance;
                atpuVar3.b |= 4;
                atpuVar3.e = zBooleanValue2;
                return (atpu) builder3.build();
            case 3:
                alyg alygVar = (alyg) obj;
                aihf aihfVar = (aihf) obj2;
                alygVar.getClass();
                aihfVar.getClass();
                alygVar.copyOnWrite();
                alyh alyhVar = (alyh) alygVar.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.build();
                alyh alyhVar2 = alyh.a;
                innertubeContext$InnerTubeContext.getClass();
                alyhVar.e = innertubeContext$InnerTubeContext;
                alyhVar.b |= 1;
                return alygVar;
            case 4:
                alyg alygVar2 = (alyg) obj;
                alygVar2.copyOnWrite();
                alyh alyhVar3 = (alyh) alygVar2.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alyh alyhVar4 = alyh.a;
                innertubeContext$InnerTubeContext2.getClass();
                alyhVar3.e = innertubeContext$InnerTubeContext2;
                alyhVar3.b |= 1;
                return alygVar2;
            case 5:
                aihf aihfVar2 = (aihf) obj;
                aihfVar2.copyOnWrite();
                alvr alvrVar = (alvr) aihfVar2.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext3 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alvr alvrVar2 = alvr.a;
                innertubeContext$InnerTubeContext3.getClass();
                alvrVar.c = innertubeContext$InnerTubeContext3;
                alvrVar.b |= 1;
                return aihfVar2;
            case 6:
                aihf aihfVar3 = (aihf) obj;
                aihfVar3.copyOnWrite();
                alpz alpzVar = (alpz) aihfVar3.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext4 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alpz alpzVar2 = alpz.a;
                innertubeContext$InnerTubeContext4.getClass();
                alpzVar.c = innertubeContext$InnerTubeContext4;
                alpzVar.b |= 1;
                return aihfVar3;
            case 7:
                aihf aihfVar4 = (aihf) obj;
                aihfVar4.copyOnWrite();
                alqk alqkVar = (alqk) aihfVar4.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext5 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alqk alqkVar2 = alqk.a;
                innertubeContext$InnerTubeContext5.getClass();
                alqkVar.e = innertubeContext$InnerTubeContext5;
                alqkVar.b |= 1;
                return aihfVar4;
            case 8:
                aihf aihfVar5 = (aihf) obj;
                aihf aihfVar6 = (aihf) obj2;
                aihfVar5.copyOnWrite();
                alqb alqbVar = (alqb) aihfVar5.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext6 = (InnertubeContext$InnerTubeContext) aihfVar6.build();
                alqb alqbVar2 = alqb.a;
                innertubeContext$InnerTubeContext6.getClass();
                alqbVar.c = innertubeContext$InnerTubeContext6;
                alqbVar.b |= 1;
                alvr alvrVar3 = ((alqb) aihfVar5.instance).e;
                if (alvrVar3 == null) {
                    alvrVar3 = alvr.a;
                }
                aihf builder4 = alvrVar3.toBuilder();
                builder4.copyOnWrite();
                alvr alvrVar4 = (alvr) builder4.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext7 = (InnertubeContext$InnerTubeContext) aihfVar6.build();
                innertubeContext$InnerTubeContext7.getClass();
                alvrVar4.c = innertubeContext$InnerTubeContext7;
                alvrVar4.b |= 1;
                aihfVar5.copyOnWrite();
                alqb alqbVar3 = (alqb) aihfVar5.instance;
                alvr alvrVar5 = (alvr) builder4.build();
                alvrVar5.getClass();
                alqbVar3.e = alvrVar5;
                alqbVar3.b |= 4;
                return aihfVar5;
            case 9:
                aihf aihfVar7 = (aihf) obj;
                aihf aihfVar8 = (aihf) obj2;
                aihfVar7.copyOnWrite();
                alqb alqbVar4 = (alqb) aihfVar7.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext8 = (InnertubeContext$InnerTubeContext) aihfVar8.build();
                alqb alqbVar5 = alqb.a;
                innertubeContext$InnerTubeContext8.getClass();
                alqbVar4.c = innertubeContext$InnerTubeContext8;
                alqbVar4.b |= 1;
                alvr alvrVar6 = ((alqb) aihfVar7.instance).e;
                if (alvrVar6 == null) {
                    alvrVar6 = alvr.a;
                }
                aihf builder5 = alvrVar6.toBuilder();
                builder5.copyOnWrite();
                alvr alvrVar7 = (alvr) builder5.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext9 = (InnertubeContext$InnerTubeContext) aihfVar8.build();
                innertubeContext$InnerTubeContext9.getClass();
                alvrVar7.c = innertubeContext$InnerTubeContext9;
                alvrVar7.b |= 1;
                aihfVar7.copyOnWrite();
                alqb alqbVar6 = (alqb) aihfVar7.instance;
                alvr alvrVar8 = (alvr) builder5.build();
                alvrVar8.getClass();
                alqbVar6.e = alvrVar8;
                alqbVar6.b |= 4;
                return aihfVar7;
            default:
                aihf aihfVar9 = (aihf) obj;
                aihfVar9.copyOnWrite();
                aqek aqekVar = (aqek) aihfVar9.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext10 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                aqek aqekVar2 = aqek.a;
                innertubeContext$InnerTubeContext10.getClass();
                aqekVar.c = innertubeContext$InnerTubeContext10;
                aqekVar.b |= 1;
                return aihfVar9;
        }
    }
}
