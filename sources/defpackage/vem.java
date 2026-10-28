package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class vem implements agek {
    private final /* synthetic */ int $cid;

    public vem(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                auie auieVar = (auie) obj;
                aihf aihfVarCreateBuilder = akqt.a.createBuilder();
                if ((auieVar.b & 1) != 0) {
                    double d = auieVar.c;
                    aihfVarCreateBuilder.copyOnWrite();
                    akqt akqtVar = (akqt) aihfVarCreateBuilder.instance;
                    akqtVar.b |= 1;
                    akqtVar.c = d;
                }
                if ((auieVar.b & 2) != 0) {
                    double d2 = auieVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    akqt akqtVar2 = (akqt) aihfVarCreateBuilder.instance;
                    akqtVar2.b |= 2;
                    akqtVar2.d = d2;
                }
                return (akqt) aihfVarCreateBuilder.build();
            case 1:
                return ((elr) obj).a;
            case 2:
                aqlb aqlbVar = (aqlb) obj;
                aihf aihfVarCreateBuilder2 = akqc.a.createBuilder();
                aqla aqlaVar = aqlbVar.f;
                if (aqlaVar == null) {
                    aqlaVar = aqla.a;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                akqc akqcVar = (akqc) aihfVarCreateBuilder2.instance;
                aqlaVar.getClass();
                akqcVar.c = aqlaVar;
                akqcVar.b |= 1;
                aqla aqlaVar2 = aqlbVar.c;
                if (aqlaVar2 == null) {
                    aqlaVar2 = aqla.a;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                akqc akqcVar2 = (akqc) aihfVarCreateBuilder2.instance;
                aqlaVar2.getClass();
                akqcVar2.d = aqlaVar2;
                akqcVar2.b |= 2;
                aqla aqlaVar3 = aqlbVar.g;
                if (aqlaVar3 == null) {
                    aqlaVar3 = aqla.a;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                akqc akqcVar3 = (akqc) aihfVarCreateBuilder2.instance;
                aqlaVar3.getClass();
                akqcVar3.e = aqlaVar3;
                akqcVar3.b |= 4;
                aqla aqlaVar4 = aqlbVar.e;
                if (aqlaVar4 == null) {
                    aqlaVar4 = aqla.a;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                akqc akqcVar4 = (akqc) aihfVarCreateBuilder2.instance;
                aqlaVar4.getClass();
                akqcVar4.f = aqlaVar4;
                akqcVar4.b |= 8;
                return (akqc) aihfVarCreateBuilder2.build();
            case 3:
                aimy aimyVar = (aimy) obj;
                aihf aihfVarCreateBuilder3 = akpp.a.createBuilder();
                if ((aimyVar.b & 1) != 0) {
                    int i = aimyVar.c;
                    aihfVarCreateBuilder3.copyOnWrite();
                    akpp akppVar = (akpp) aihfVarCreateBuilder3.instance;
                    akppVar.b |= 1;
                    akppVar.c = i;
                }
                if ((aimyVar.b & 2) != 0) {
                    int i2 = aimyVar.d;
                    aihfVarCreateBuilder3.copyOnWrite();
                    akpp akppVar2 = (akpp) aihfVarCreateBuilder3.instance;
                    akppVar2.b |= 2;
                    akppVar2.d = i2;
                }
                aihu aihuVar = aimyVar.e;
                aihfVarCreateBuilder3.copyOnWrite();
                akpp akppVar3 = (akpp) aihfVarCreateBuilder3.instance;
                aihu aihuVar2 = akppVar3.e;
                if (!aihuVar2.c()) {
                    akppVar3.e = aihn.mutableCopy(aihuVar2);
                }
                aifs.addAll(aihuVar, akppVar3.e);
                if ((aimyVar.b & 4) != 0) {
                    int iAU = a.aU(aimyVar.f);
                    if (iAU == 0 || iAU != 2) {
                        aihfVarCreateBuilder3.copyOnWrite();
                        akpp akppVar4 = (akpp) aihfVarCreateBuilder3.instance;
                        akppVar4.f = 0;
                        akppVar4.b |= 4;
                    } else {
                        aihfVarCreateBuilder3.copyOnWrite();
                        akpp akppVar5 = (akpp) aihfVarCreateBuilder3.instance;
                        akppVar5.f = 1;
                        akppVar5.b |= 4;
                    }
                }
                return (akpp) aihfVarCreateBuilder3.build();
            case 4:
                String str = (String) obj;
                aihf aihfVarCreateBuilder4 = akps.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                akps akpsVar = (akps) aihfVarCreateBuilder4.instance;
                str.getClass();
                akpsVar.b |= 1;
                akpsVar.c = str;
                return (akps) aihfVarCreateBuilder4.build();
            case 5:
                aimw aimwVar = (aimw) obj;
                aihf aihfVarCreateBuilder5 = aqla.a.createBuilder();
                if ((aimwVar.b & 1) != 0) {
                    double d3 = aimwVar.c;
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqla aqlaVar5 = (aqla) aihfVarCreateBuilder5.instance;
                    aqlaVar5.b |= 1;
                    aqlaVar5.c = d3;
                }
                if ((aimwVar.b & 2) != 0) {
                    double d4 = aimwVar.d;
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqla aqlaVar6 = (aqla) aihfVarCreateBuilder5.instance;
                    aqlaVar6.b |= 2;
                    aqlaVar6.d = d4;
                }
                if ((aimwVar.b & 4) != 0) {
                    double d5 = aimwVar.e;
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqla aqlaVar7 = (aqla) aihfVarCreateBuilder5.instance;
                    aqlaVar7.b |= 4;
                    aqlaVar7.e = d5;
                }
                if ((aimwVar.b & 8) != 0) {
                    double d6 = aimwVar.f;
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqla aqlaVar8 = (aqla) aihfVarCreateBuilder5.instance;
                    aqlaVar8.b |= 8;
                    aqlaVar8.f = d6;
                }
                return (aqla) aihfVarCreateBuilder5.build();
            case 6:
                atzx atzxVar = (atzx) obj;
                int iOrdinal = atzxVar.ordinal();
                if (iOrdinal == 0) {
                    return arfo.ALIGN_HORIZONTAL_UNSPECIFIED;
                }
                if (iOrdinal == 1) {
                    return arfo.ALIGN_HORIZONTAL_ALIGN_LEFT;
                }
                if (iOrdinal == 2) {
                    return arfo.ALIGN_HORIZONTAL_ALIGN_CENTER;
                }
                if (iOrdinal == 3) {
                    return arfo.ALIGN_HORIZONTAL_ALIGN_RIGHT;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atzxVar))));
            case 7:
                asmx asmxVar = (asmx) obj;
                aihf aihfVarCreateBuilder6 = aksb.a.createBuilder();
                if ((asmxVar.b & 1) != 0) {
                    String str2 = asmxVar.c;
                    aihfVarCreateBuilder6.copyOnWrite();
                    aksb aksbVar = (aksb) aihfVarCreateBuilder6.instance;
                    str2.getClass();
                    aksbVar.b |= 1;
                    aksbVar.c = str2;
                }
                if ((asmxVar.b & 2) != 0) {
                    String str3 = asmxVar.d;
                    aihfVarCreateBuilder6.copyOnWrite();
                    aksb aksbVar2 = (aksb) aihfVarCreateBuilder6.instance;
                    str3.getClass();
                    aksbVar2.b |= 2;
                    aksbVar2.d = str3;
                }
                return (aksb) aihfVarCreateBuilder6.build();
            case 8:
                asmy asmyVar = (asmy) obj;
                aihf aihfVarCreateBuilder7 = aksc.a.createBuilder();
                if ((asmyVar.b & 1) != 0) {
                    String str4 = asmyVar.c;
                    aihfVarCreateBuilder7.copyOnWrite();
                    aksc akscVar = (aksc) aihfVarCreateBuilder7.instance;
                    str4.getClass();
                    akscVar.b |= 1;
                    akscVar.c = str4;
                }
                if ((asmyVar.b & 2) != 0) {
                    String str5 = asmyVar.d;
                    aihfVarCreateBuilder7.copyOnWrite();
                    aksc akscVar2 = (aksc) aihfVarCreateBuilder7.instance;
                    str5.getClass();
                    akscVar2.b |= 2;
                    akscVar2.d = str5;
                }
                if ((asmyVar.b & 4) != 0) {
                    int i3 = asmyVar.e;
                    aihfVarCreateBuilder7.copyOnWrite();
                    aksc akscVar3 = (aksc) aihfVarCreateBuilder7.instance;
                    akscVar3.b |= 4;
                    akscVar3.e = i3;
                }
                if ((asmyVar.b & 8) != 0) {
                    boolean z = asmyVar.f;
                    aihfVarCreateBuilder7.copyOnWrite();
                    aksc akscVar4 = (aksc) aihfVarCreateBuilder7.instance;
                    akscVar4.b |= 8;
                    akscVar4.f = z;
                }
                return (aksc) aihfVarCreateBuilder7.build();
            default:
                asnb asnbVar = (asnb) obj;
                aihf aihfVarCreateBuilder8 = aksf.a.createBuilder();
                if ((asnbVar.b & 1) != 0) {
                    int i4 = asnbVar.c;
                    aihfVarCreateBuilder8.copyOnWrite();
                    aksf aksfVar = (aksf) aihfVarCreateBuilder8.instance;
                    aksfVar.b |= 1;
                    aksfVar.c = i4;
                }
                if ((asnbVar.b & 2) != 0) {
                    String str6 = asnbVar.d;
                    aihfVarCreateBuilder8.copyOnWrite();
                    aksf aksfVar2 = (aksf) aihfVarCreateBuilder8.instance;
                    str6.getClass();
                    aksfVar2.b |= 2;
                    aksfVar2.d = str6;
                }
                return (aksf) aihfVarCreateBuilder8.build();
        }
    }
}
