package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmg {
    private static final ahtv g;
    public static final ahub e = new ahub(ahki.class);
    public static final ahub f = new ahub("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey");
    public static final ahha a = new ahha(ahkk.class, new ahly(5));
    public static final ahha c = new ahha("type.googleapis.com/google.crypto.tink.MlDsaPublicKey", new ahlz(4));
    public static final ahha b = new ahha(ahkj.class, new ahly(6));
    public static final ahha d = new ahha("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey", new ahlz(5));

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahiu.ML_DSA_44, ahkg.a, map, map2);
        agvp.B(ahiu.ML_DSA_65, ahkg.b, map, map2);
        agvp.B(ahiu.ML_DSA_87, ahkg.c, map, map2);
        g = agvp.C(map, map2);
    }

    public static ahgb a(ahkj ahkjVar, ahgj ahgjVar) throws GeneralSecurityException {
        aihf aihfVarCreateBuilder = ahiw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((ahiw) aihfVarCreateBuilder.instance).c = 0;
        ahix ahixVarF = f(ahkjVar.a);
        aihfVarCreateBuilder.copyOnWrite();
        ahiw ahiwVar = (ahiw) aihfVarCreateBuilder.instance;
        ahixVarF.getClass();
        ahiwVar.e = ahixVarF;
        ahiwVar.b |= 1;
        ahgj.a(ahgjVar);
        aigj aigjVarV = aigj.v(ahkjVar.b.c());
        aihfVarCreateBuilder.copyOnWrite();
        ahiw ahiwVar2 = (ahiw) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        ahiwVar2.d = aigjVarV;
        return ahgb.a("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey", ((ahiw) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, e(ahkjVar.b().b), ahkjVar.a());
    }

    public static ahkj b(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to MlDsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        if (!ahgbVar.c.equals(ahfz.c)) {
            throw new GeneralSecurityException("Wrong KeyMaterialType for MlDsaPrivateKey: ".concat(((ahfz) ahgbVar.c).f));
        }
        try {
            Object obj = ahgbVar.b;
            ahiw ahiwVar = (ahiw) aihn.parseFrom(ahiw.a, (aigj) obj, ExtensionRegistryLite.a);
            if (ahiwVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahix ahixVar = ahiwVar.e;
            if (ahixVar == null) {
                ahixVar = ahix.a;
            }
            if (ahixVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahtv ahtvVar = g;
            ahiv ahivVar = ahixVar.e;
            if (ahivVar == null) {
                ahivVar = ahiv.a;
            }
            ahiu ahiuVarA = ahiu.a(ahivVar.b);
            if (ahiuVarA == null) {
                ahiuVarA = ahiu.UNRECOGNIZED;
            }
            ahki ahkiVar = new ahki((ahkg) ahtvVar.d(ahiuVarA), g((ahga) ahgbVar.d));
            ahnf ahnfVarB = ahnf.b(ahixVar.d.G());
            Object obj2 = ahgbVar.e;
            if (obj2 == null) {
                obj2 = null;
            }
            ahkk ahkkVarG = aedi.G(ahkiVar, ahnfVarB, (Integer) obj2);
            byte[] bArrG = ahiwVar.d.G();
            ahgj.a(ahgjVar);
            ahub ahubVarD = ahub.d(bArrG);
            if (ahubVarD.b() != 32) {
                throw new GeneralSecurityException("Incorrect private seed size for ML-DSA");
            }
            ahkg ahkgVar = ahkkVarG.a.a;
            if (ahkgVar == ahkg.a || ahkgVar == ahkg.b || ahkgVar == ahkg.c) {
                return new ahkj(ahkkVarG, ahubVarD);
            }
            throw new GeneralSecurityException(a.bT(ahkgVar.d, "Unknown ML-DSA instance: ", ", only ML-DSA-{44,65,87} are supported"));
        } catch (aiik unused) {
            throw new GeneralSecurityException("Parsing MlDsaPrivateKey failed");
        }
    }

    public static ahkk c(ahgb ahgbVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.MlDsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to MlDsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        if (!ahgbVar.c.equals(ahfz.d)) {
            throw new GeneralSecurityException("Wrong KeyMaterialType for MlDsaPublicKey: ".concat(((ahfz) ahgbVar.c).f));
        }
        try {
            Object obj = ahgbVar.b;
            ahix ahixVar = (ahix) aihn.parseFrom(ahix.a, (aigj) obj, ExtensionRegistryLite.a);
            if (ahixVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahtv ahtvVar = g;
            ahiv ahivVar = ahixVar.e;
            if (ahivVar == null) {
                ahivVar = ahiv.a;
            }
            ahiu ahiuVarA = ahiu.a(ahivVar.b);
            if (ahiuVarA == null) {
                ahiuVarA = ahiu.UNRECOGNIZED;
            }
            ahki ahkiVar = new ahki((ahkg) ahtvVar.d(ahiuVarA), g((ahga) ahgbVar.d));
            ahnf ahnfVarB = ahnf.b(ahixVar.d.G());
            Object obj2 = ahgbVar.e;
            if (obj2 == null) {
                obj2 = null;
            }
            return aedi.G(ahkiVar, ahnfVarB, (Integer) obj2);
        } catch (aiik unused) {
            throw new GeneralSecurityException("Parsing MlDsaPublicKey failed");
        }
    }

    public static ahgb d(ahkk ahkkVar) {
        return ahgb.a("type.googleapis.com/google.crypto.tink.MlDsaPublicKey", f(ahkkVar).toByteString(), ahfz.d, e(ahkkVar.a.b), ahkkVar.d);
    }

    private static ahga e(ahkh ahkhVar) throws GeneralSecurityException {
        if (ahkhVar.equals(ahkh.b)) {
            return ahga.d;
        }
        if (ahkhVar.equals(ahkh.a)) {
            return ahga.b;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(ahkhVar.c));
    }

    private static ahix f(ahkk ahkkVar) {
        aihf aihfVarCreateBuilder = ahix.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((ahix) aihfVarCreateBuilder.instance).c = 0;
        aihf aihfVarCreateBuilder2 = ahiv.a.createBuilder();
        ahiu ahiuVar = (ahiu) g.c(ahkkVar.a.a);
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahiv) aihfVarCreateBuilder2.instance).b = ahiuVar.getNumber();
        ahiv ahivVar = (ahiv) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ahix ahixVar = (ahix) aihfVarCreateBuilder.instance;
        ahivVar.getClass();
        ahixVar.e = ahivVar;
        ahixVar.b |= 1;
        aigj aigjVarV = aigj.v(ahkkVar.b.c());
        aihfVarCreateBuilder.copyOnWrite();
        ahix ahixVar2 = (ahix) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        ahixVar2.d = aigjVarV;
        return (ahix) aihfVarCreateBuilder.build();
    }

    private static ahkh g(ahga ahgaVar) throws GeneralSecurityException {
        if (ahgaVar.equals(ahga.d)) {
            return ahkh.b;
        }
        if (ahgaVar.equals(ahga.b)) {
            return ahkh.a;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(ahgaVar.g));
    }
}
