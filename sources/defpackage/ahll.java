package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahll {
    public static final ahfu a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        agvp.A(ahgd.class, ahgd.class, new ahld(), map3);
        agvp.A(ahge.class, ahge.class, new ahle(), map3);
        final int i = 13;
        agvp.z(new ahjy(i), ahjw.class, ahgd.class, map2);
        agvp.z(new ahjy(18), ahjx.class, ahge.class, map2);
        final int i2 = 7;
        agvp.w(ahjw.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i2) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i3 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        final int i3 = 12;
        agvp.w(ahjx.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i3) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i4 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.y(ahjv.class, new ahli(), map5);
        final int i4 = 10;
        agvp.v("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i4) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i5 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i6 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i7 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i8 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        final int i5 = 11;
        agvp.v("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i5) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i6 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i7 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i8 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i9 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.u(ahjv.class, new ahjz(), map);
        agvp.x("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", new ahlh(), map7);
        agvp.z(new ahjy(15), ahkd.class, ahgd.class, map2);
        agvp.z(new ahjy(19), ahkf.class, ahge.class, map2);
        final int i6 = 9;
        agvp.w(ahkd.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i6) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i7 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.w(ahkf.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i7 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.y(ahkc.class, new ahli(), map5);
        agvp.v("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i3) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i7 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i8 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i9 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i10 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.v("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i7 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i8 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i9 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i10 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.u(ahkc.class, new ahjz(), map);
        agvp.x("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", new ahlh(), map7);
        agvp.z(new ahjy(i4), ahkj.class, ahgd.class, map2);
        agvp.z(new ahjy(11), ahkk.class, ahge.class, map2);
        final int i7 = 1;
        agvp.w(ahkj.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i7) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i8 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        final int i8 = 0;
        agvp.w(ahkk.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i8) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i9 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.y(ahki.class, new ahli(), map5);
        agvp.v("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i7) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i9 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i10 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i11 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i12 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.v("type.googleapis.com/google.crypto.tink.MlDsaPublicKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i8) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i9 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i10 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i11 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i12 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.u(ahki.class, new ahjz(), map);
        agvp.x("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey", new ahlh(), map7);
        agvp.z(new ahjy(i3), ahkt.class, ahgd.class, map2);
        agvp.z(new ahjy(14), ahku.class, ahge.class, map2);
        final int i9 = 2;
        agvp.w(ahkt.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i9) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i10 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        final int i10 = 3;
        agvp.w(ahku.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i10) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i11 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.y(ahks.class, new ahli(), map5);
        agvp.v("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i9) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i11 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i12 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i13 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i14 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.v("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i10) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i11 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i12 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i13 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i14 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.u(ahks.class, new ahjz(), map);
        agvp.x("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", new ahlh(), map7);
        agvp.z(new ahjy(16), ahla.class, ahgd.class, map2);
        agvp.z(new ahjy(17), ahlb.class, ahge.class, map2);
        final int i11 = 4;
        agvp.w(ahla.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i11) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i12 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        final int i12 = 5;
        agvp.w(ahlb.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i12) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i13 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.y(ahkz.class, new ahli(), map5);
        agvp.v("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i11) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i13 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i14 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i15 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i16 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.v("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i12) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i13 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i14 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i15 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i16 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.u(ahkz.class, new ahjz(), map);
        agvp.x("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", new ahlh(), map7);
        agvp.z(new ahjy(20), ahlt.class, ahgd.class, map2);
        agvp.z(new ahhm() { // from class: ahlk
            @Override // defpackage.ahhm
            public final Object a(ahfv ahfvVar) throws GeneralSecurityException {
                if (i7 == 0) {
                    ahjq ahjqVar = (ahjq) ahfvVar;
                    Provider providerA = ahgn.a();
                    if (providerA != null) {
                        return ahmi.c(ahjqVar, providerA);
                    }
                    throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
                }
                ahlu ahluVar = (ahlu) ahfvVar;
                if (!afyd.q(1)) {
                    throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                Provider providerA2 = ahgn.a();
                if (providerA2 != null) {
                    return ahmr.b(ahluVar, providerA2);
                }
                throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
            }
        }, ahlu.class, ahge.class, map2);
        final int i13 = 6;
        agvp.w(ahlt.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i13) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i14 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        final int i14 = 8;
        agvp.w(ahlu.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i14) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i15 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.y(ahls.class, new ahli(), map5);
        agvp.v("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i13) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i15 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i16 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i17 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i18 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        final int i15 = 7;
        agvp.v("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i15) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i16 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i17 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i18 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i19 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.u(ahls.class, new ahjz(), map);
        agvp.x("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", new ahlh(), map7);
        agvp.z(new ahlj(), ahjp.class, ahgd.class, map2);
        agvp.z(new ahhm() { // from class: ahlk
            @Override // defpackage.ahhm
            public final Object a(ahfv ahfvVar) throws GeneralSecurityException {
                if (i8 == 0) {
                    ahjq ahjqVar = (ahjq) ahfvVar;
                    Provider providerA = ahgn.a();
                    if (providerA != null) {
                        return ahmi.c(ahjqVar, providerA);
                    }
                    throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
                }
                ahlu ahluVar = (ahlu) ahfvVar;
                if (!afyd.q(1)) {
                    throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                Provider providerA2 = ahgn.a();
                if (providerA2 != null) {
                    return ahmr.b(ahluVar, providerA2);
                }
                throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
            }
        }, ahjq.class, ahge.class, map2);
        final int i16 = 10;
        agvp.w(ahjp.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i16) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i17 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        final int i17 = 11;
        agvp.w(ahjq.class, new ahht() { // from class: ahlf
            @Override // defpackage.ahht
            public final ahgb a(ahfv ahfvVar, ahgj ahgjVar) throws GeneralSecurityException {
                switch (i17) {
                    case 0:
                        return ahmg.d((ahkk) ahfvVar);
                    case 1:
                        return ahmg.a((ahkj) ahfvVar, ahgjVar);
                    case 2:
                        return ahmj.a((ahkt) ahfvVar, ahgjVar);
                    case 3:
                        return ahmj.e((ahku) ahfvVar);
                    case 4:
                        return ahmn.a((ahla) ahfvVar, ahgjVar);
                    case 5:
                        return ahmn.e((ahlb) ahfvVar);
                    case 6:
                        ahlt ahltVar = (ahlt) ahfvVar;
                        int i18 = ahmp.a;
                        aihf aihfVarCreateBuilder = ahjh.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ((ahjh) aihfVarCreateBuilder.instance).c = 0;
                        ahji ahjiVarB = ahmp.b(ahltVar.a);
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar = (ahjh) aihfVarCreateBuilder.instance;
                        ahjiVarB.getClass();
                        ahjhVar.e = ahjiVarB;
                        ahjhVar.b |= 1;
                        aigj aigjVarV = aigj.v(ahltVar.b.c());
                        aihfVarCreateBuilder.copyOnWrite();
                        ahjh ahjhVar2 = (ahjh) aihfVarCreateBuilder.instance;
                        aigjVarV.getClass();
                        ahjhVar2.d = aigjVarV;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ((ahjh) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, ahmp.a(ahltVar.b().c), ahltVar.a());
                    case 7:
                        return ahma.a((ahjw) ahfvVar, ahgjVar);
                    case 8:
                        ahlu ahluVar = (ahlu) ahfvVar;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", ahmp.b(ahluVar).toByteString(), ahfz.d, ahmp.a(ahluVar.a.c), ahluVar.d);
                    case 9:
                        return ahmd.a((ahkd) ahfvVar, ahgjVar);
                    case 10:
                        ahjp ahjpVar = (ahjp) ahfvVar;
                        ahkj ahkjVar = ahjpVar.b;
                        ahhj ahhjVar = ahlv.a;
                        ahgb ahgbVarB = ahhjVar.b(ahkjVar, ahgjVar);
                        Object obj = ahgbVarB.d;
                        ahga ahgaVar = ahga.d;
                        if (!obj.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA private key.");
                        }
                        if (ahgbVarB.e != null) {
                            throw new GeneralSecurityException("ML-DSA private key cannot have ID requirement.");
                        }
                        ahip ahipVar = ahip.a;
                        aihf aihfVarCreateBuilder2 = ahipVar.createBuilder();
                        Object obj2 = ahgbVarB.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar2 = (ahip) aihfVarCreateBuilder2.instance;
                        obj2.getClass();
                        ahipVar2.b = (String) obj2;
                        int iT = agvp.t((ahfz) ahgbVarB.c);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder2.instance).d = iT - 2;
                        Object obj3 = ahgbVarB.b;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahip ahipVar3 = (ahip) aihfVarCreateBuilder2.instance;
                        obj3.getClass();
                        ahipVar3.c = (aigj) obj3;
                        ahip ahipVar4 = (ahip) aihfVarCreateBuilder2.build();
                        ahgb ahgbVarB2 = ahhjVar.b(ahjpVar.c, ahgjVar);
                        if (!ahgbVarB2.d.equals(ahgaVar)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical private key.");
                        }
                        if (ahgbVarB2.e != null) {
                            throw new GeneralSecurityException("Classical private key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder3 = ahipVar.createBuilder();
                        Object obj4 = ahgbVarB2.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar5 = (ahip) aihfVarCreateBuilder3.instance;
                        obj4.getClass();
                        ahipVar5.b = (String) obj4;
                        int iT2 = agvp.t((ahfz) ahgbVarB2.c);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder3.instance).d = iT2 - 2;
                        Object obj5 = ahgbVarB2.b;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahip ahipVar6 = (ahip) aihfVarCreateBuilder3.instance;
                        obj5.getClass();
                        ahipVar6.c = (aigj) obj5;
                        ahip ahipVar7 = (ahip) aihfVarCreateBuilder3.build();
                        aihf aihfVarCreateBuilder4 = ahih.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ((ahih) aihfVarCreateBuilder4.instance).c = 0;
                        ahig ahigVarB = ahlv.b(ahjpVar.b());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar = (ahih) aihfVarCreateBuilder4.instance;
                        ahigVarB.getClass();
                        ahihVar.f = ahigVarB;
                        ahihVar.b |= 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar2 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar4.getClass();
                        ahihVar2.d = ahipVar4;
                        ahihVar2.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahih ahihVar3 = (ahih) aihfVarCreateBuilder4.instance;
                        ahipVar7.getClass();
                        ahihVar3.e = ahipVar7;
                        ahihVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", ((ahih) aihfVarCreateBuilder4.build()).toByteString(), ahfz.c, ahlv.a(ahjpVar.b().c), ahjpVar.a());
                    case 11:
                        ahjq ahjqVar = (ahjq) ahfvVar;
                        ahkk ahkkVar = ahjqVar.c;
                        ahhj ahhjVar2 = ahlv.a;
                        ahgb ahgbVarB3 = ahhjVar2.b(ahkkVar, null);
                        Object obj6 = ahgbVarB3.d;
                        ahga ahgaVar2 = ahga.d;
                        if (!obj6.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for ML-DSA public key.");
                        }
                        if (ahgbVarB3.e != null) {
                            throw new GeneralSecurityException("ML-DSA public key cannot have ID requirement.");
                        }
                        ahip ahipVar8 = ahip.a;
                        aihf aihfVarCreateBuilder5 = ahipVar8.createBuilder();
                        Object obj7 = ahgbVarB3.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar9 = (ahip) aihfVarCreateBuilder5.instance;
                        obj7.getClass();
                        ahipVar9.b = (String) obj7;
                        int iT3 = agvp.t((ahfz) ahgbVarB3.c);
                        aihfVarCreateBuilder5.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder5.instance).d = iT3 - 2;
                        Object obj8 = ahgbVarB3.b;
                        aihfVarCreateBuilder5.copyOnWrite();
                        ahip ahipVar10 = (ahip) aihfVarCreateBuilder5.instance;
                        obj8.getClass();
                        ahipVar10.c = (aigj) obj8;
                        ahip ahipVar11 = (ahip) aihfVarCreateBuilder5.build();
                        ahgb ahgbVarB4 = ahhjVar2.b(ahjqVar.d, null);
                        if (!ahgbVarB4.d.equals(ahgaVar2)) {
                            throw new GeneralSecurityException("Require raw output prefix for classical public key.");
                        }
                        if (ahgbVarB4.e != null) {
                            throw new GeneralSecurityException("Classical public key cannot have ID requirement.");
                        }
                        aihf aihfVarCreateBuilder6 = ahipVar8.createBuilder();
                        Object obj9 = ahgbVarB4.a;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar12 = (ahip) aihfVarCreateBuilder6.instance;
                        obj9.getClass();
                        ahipVar12.b = (String) obj9;
                        int iT4 = agvp.t((ahfz) ahgbVarB4.c);
                        aihfVarCreateBuilder6.copyOnWrite();
                        ((ahip) aihfVarCreateBuilder6.instance).d = iT4 - 2;
                        Object obj10 = ahgbVarB4.b;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ahip ahipVar13 = (ahip) aihfVarCreateBuilder6.instance;
                        obj10.getClass();
                        ahipVar13.c = (aigj) obj10;
                        ahip ahipVar14 = (ahip) aihfVarCreateBuilder6.build();
                        aihf aihfVarCreateBuilder7 = ahii.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        ((ahii) aihfVarCreateBuilder7.instance).c = 0;
                        ahjo ahjoVar = ahjqVar.b;
                        ahig ahigVarB2 = ahlv.b(ahjoVar);
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar = (ahii) aihfVarCreateBuilder7.instance;
                        ahigVarB2.getClass();
                        ahiiVar.f = ahigVarB2;
                        ahiiVar.b |= 4;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar2 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar11.getClass();
                        ahiiVar2.d = ahipVar11;
                        ahiiVar2.b |= 1;
                        aihfVarCreateBuilder7.copyOnWrite();
                        ahii ahiiVar3 = (ahii) aihfVarCreateBuilder7.instance;
                        ahipVar14.getClass();
                        ahiiVar3.e = ahipVar14;
                        ahiiVar3.b |= 2;
                        return ahgb.a("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", ((ahii) aihfVarCreateBuilder7.build()).toByteString(), ahfz.d, ahlv.a(ahjoVar.c), ahjqVar.f);
                    case 12:
                        return ahma.e((ahjx) ahfvVar);
                    default:
                        return ahmd.e((ahkf) ahfvVar);
                }
            }
        }, map4);
        agvp.y(ahjo.class, new ahli(), map5);
        agvp.v("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i14) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i18 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i19 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i110 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i111 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        final int i18 = 9;
        agvp.v("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", new ahhs() { // from class: ahlg
            @Override // defpackage.ahhs
            public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
                ahfv ahltVar;
                switch (i18) {
                    case 0:
                        return ahmg.c(ahgbVar);
                    case 1:
                        return ahmg.b(ahgbVar, ahgjVar);
                    case 2:
                        return ahmj.b(ahgbVar, ahgjVar);
                    case 3:
                        return ahmj.d(ahgbVar);
                    case 4:
                        return ahmn.b(ahgbVar, ahgjVar);
                    case 5:
                        return ahmn.d(ahgbVar);
                    case 6:
                        int i19 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahjh ahjhVar = (ahjh) aihn.parseFrom(ahjh.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahjhVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            ahji ahjiVar = ahjhVar.e;
                            if (ahjiVar == null) {
                                ahjiVar = ahji.a;
                            }
                            ahlu ahluVarC = ahmp.c(ahgbVar, ahjiVar);
                            ahub ahubVarD = ahub.d(ahjhVar.d.G());
                            if (ahubVarD.b() != 64) {
                                throw new GeneralSecurityException("Incorrect private key size for SLH-DSA");
                            }
                            ahls ahlsVar = ahluVarC.a;
                            if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
                                throw new GeneralSecurityException("Unknown SKH-DSA instance; only SLH-DSA-SHA2-128S is currently supported");
                            }
                            ahltVar = new ahlt(ahluVarC, ahubVarD);
                        } catch (aiik unused) {
                            throw new GeneralSecurityException("Parsing SlhDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 7:
                        int i110 = ahmp.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to SlhDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for SlhDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            return ahmp.c(ahgbVar, (ahji) aihn.parseFrom(ahji.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a));
                        } catch (aiik unused2) {
                            throw new GeneralSecurityException("Parsing SlhDsaPublicKey failed");
                        }
                    case 8:
                        ahhj ahhjVar = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        Object obj = ahgbVar.c;
                        if (!obj.equals(ahfz.c)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPrivateKey: ".concat(((ahfz) obj).f));
                        }
                        try {
                            ahih ahihVar = (ahih) aihn.parseFrom(ahih.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahihVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i111 = ahjk.a;
                            ahtv ahtvVar = ahlv.b;
                            ahig ahigVar = ahihVar.f;
                            if (ahigVar == null) {
                                ahigVar = ahig.a;
                            }
                            ahiu ahiuVarA = ahiu.a(ahigVar.b);
                            if (ahiuVarA == null) {
                                ahiuVarA = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar = (ahjm) ahtvVar.d(ahiuVarA);
                            ahtv ahtvVar2 = ahlv.c;
                            ahig ahigVar2 = ahihVar.f;
                            if (ahigVar2 == null) {
                                ahigVar2 = ahig.a;
                            }
                            ahif ahifVarA = ahif.a(ahigVar2.c);
                            if (ahifVarA == null) {
                                ahifVarA = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA = ahjk.a(ahjmVar, (ahjl) ahtvVar2.d(ahifVarA), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar = ahihVar.d;
                            if (ahipVar == null) {
                                ahipVar = ahip.a;
                            }
                            String str = ahipVar.b;
                            ahip ahipVar2 = ahihVar.d;
                            aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
                            if (ahipVar2 == null) {
                                ahipVar2 = ahip.a;
                            }
                            int iBd = a.bd(ahipVar2.d);
                            if (iBd == 0) {
                                iBd = 1;
                            }
                            ahfz ahfzVarR = agvp.r(iBd);
                            ahga ahgaVar = ahga.d;
                            ahgb ahgbVarA = ahgb.a(str, aigjVar, ahfzVarR, ahgaVar, null);
                            ahhj ahhjVar2 = ahlv.a;
                            ahfv ahfvVarA = ahhjVar2.a(ahgbVarA, ahgjVar);
                            if (!(ahfvVarA instanceof ahkj)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPrivateKey");
                            }
                            ahip ahipVar3 = ahihVar.e;
                            String str2 = (ahipVar3 == null ? ahip.a : ahipVar3).b;
                            aigj aigjVar2 = (ahipVar3 == null ? ahip.a : ahipVar3).c;
                            if (ahipVar3 == null) {
                                ahipVar3 = ahip.a;
                            }
                            int iBd2 = a.bd(ahipVar3.d);
                            ahfv ahfvVarA2 = ahhjVar2.a(ahgb.a(str2, aigjVar2, agvp.r(iBd2 != 0 ? iBd2 : 1), ahgaVar, null), ahgjVar);
                            if (!(ahfvVarA2 instanceof ahln)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePrivateKey");
                            }
                            ahkj ahkjVar = (ahkj) ahfvVarA;
                            ahln ahlnVar = (ahln) ahfvVarA2;
                            Object obj2 = ahgbVar.e;
                            Object obj3 = obj2 != null ? obj2 : null;
                            if (ahjoVarA.S() && obj3 == null) {
                                throw new GeneralSecurityException("ID requirement is not set");
                            }
                            if (!ahjoVarA.S() && obj3 != null) {
                                throw new GeneralSecurityException("ID requirement is set");
                            }
                            Map map8 = ahjq.a;
                            ahltVar = new ahjp(agvp.l(ahjoVarA, ahkjVar.a, ahlnVar.d(), (Integer) obj3), ahkjVar, ahlnVar);
                        } catch (aiik unused3) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPrivateKey failed");
                        }
                        break;
                        break;
                    case 9:
                        ahhj ahhjVar3 = ahlv.a;
                        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey")) {
                            throw new IllegalArgumentException("Wrong type URL in call to CompositeMlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
                        }
                        if (!ahgbVar.c.equals(ahfz.d)) {
                            throw new GeneralSecurityException("Wrong KeyMaterialType for CompositeMlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
                        }
                        try {
                            ahii ahiiVar = (ahii) aihn.parseFrom(ahii.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
                            if (ahiiVar.c != 0) {
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            }
                            int i112 = ahjk.a;
                            ahtv ahtvVar3 = ahlv.b;
                            ahig ahigVar3 = ahiiVar.f;
                            if (ahigVar3 == null) {
                                ahigVar3 = ahig.a;
                            }
                            ahiu ahiuVarA2 = ahiu.a(ahigVar3.b);
                            if (ahiuVarA2 == null) {
                                ahiuVarA2 = ahiu.UNRECOGNIZED;
                            }
                            ahjm ahjmVar2 = (ahjm) ahtvVar3.d(ahiuVarA2);
                            ahtv ahtvVar4 = ahlv.c;
                            ahig ahigVar4 = ahiiVar.f;
                            if (ahigVar4 == null) {
                                ahigVar4 = ahig.a;
                            }
                            ahif ahifVarA2 = ahif.a(ahigVar4.c);
                            if (ahifVarA2 == null) {
                                ahifVarA2 = ahif.UNRECOGNIZED;
                            }
                            ahjo ahjoVarA2 = ahjk.a(ahjmVar2, (ahjl) ahtvVar4.d(ahifVarA2), ahlv.c((ahga) ahgbVar.d));
                            ahip ahipVar4 = ahiiVar.d;
                            if (ahipVar4 == null) {
                                ahipVar4 = ahip.a;
                            }
                            String str3 = ahipVar4.b;
                            ahip ahipVar5 = ahiiVar.d;
                            aigj aigjVar3 = (ahipVar5 == null ? ahip.a : ahipVar5).c;
                            if (ahipVar5 == null) {
                                ahipVar5 = ahip.a;
                            }
                            int iBd3 = a.bd(ahipVar5.d);
                            if (iBd3 == 0) {
                                iBd3 = 1;
                            }
                            ahfz ahfzVarR2 = agvp.r(iBd3);
                            ahga ahgaVar2 = ahga.d;
                            ahgb ahgbVarA2 = ahgb.a(str3, aigjVar3, ahfzVarR2, ahgaVar2, null);
                            ahhj ahhjVar4 = ahlv.a;
                            ahfv ahfvVarA3 = ahhjVar4.a(ahgbVarA2, null);
                            if (!(ahfvVarA3 instanceof ahkk)) {
                                throw new GeneralSecurityException("Parsed ML-DSA key is not an MlDsaPublicKey");
                            }
                            ahip ahipVar6 = ahiiVar.e;
                            String str4 = (ahipVar6 == null ? ahip.a : ahipVar6).b;
                            aigj aigjVar4 = (ahipVar6 == null ? ahip.a : ahipVar6).c;
                            if (ahipVar6 == null) {
                                ahipVar6 = ahip.a;
                            }
                            int iBd4 = a.bd(ahipVar6.d);
                            ahfv ahfvVarA4 = ahhjVar4.a(ahgb.a(str4, aigjVar4, agvp.r(iBd4 != 0 ? iBd4 : 1), ahgaVar2, null), null);
                            if (!(ahfvVarA4 instanceof ahlo)) {
                                throw new GeneralSecurityException("Parsed classical key is not a SignaturePublicKey");
                            }
                            Map map9 = ahjq.a;
                            ahkk ahkkVar = (ahkk) ahfvVarA3;
                            ahlo ahloVar = (ahlo) ahfvVarA4;
                            Object obj4 = ahgbVar.e;
                            return agvp.l(ahjoVarA2, ahkkVar, ahloVar, (Integer) (obj4 != null ? obj4 : null));
                        } catch (aiik e) {
                            throw new GeneralSecurityException("Parsing CompositeMlDsaPublicKey failed: ", e);
                        }
                    case 10:
                        return ahma.b(ahgbVar, ahgjVar);
                    case 11:
                        return ahma.d(ahgbVar);
                    case 12:
                        return ahmd.b(ahgbVar, ahgjVar);
                    default:
                        return ahmd.d(ahgbVar);
                }
                return ahltVar;
            }
        }, map6);
        agvp.x("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", new ahlh(), map7);
        agvp.u(ahjo.class, new ahjz(), map);
        new ahhr(map4, map5, map6, map7);
        a = new ahhq(map, map2, map3);
    }
}
