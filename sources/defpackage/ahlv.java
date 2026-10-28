package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahlv {
    public static final ahhj a = d();
    public static final ahtv b;
    public static final ahtv c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahiu.ML_DSA_44, ahjm.a, map, map2);
        agvp.B(ahiu.ML_DSA_65, ahjm.b, map, map2);
        agvp.B(ahiu.ML_DSA_87, ahjm.c, map, map2);
        b = agvp.C(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        agvp.B(ahif.CLASSICAL_ALGORITHM_ED25519, ahjl.a, map3, map4);
        agvp.B(ahif.CLASSICAL_ALGORITHM_ECDSA_P256, ahjl.b, map3, map4);
        agvp.B(ahif.CLASSICAL_ALGORITHM_ECDSA_P384, ahjl.c, map3, map4);
        agvp.B(ahif.CLASSICAL_ALGORITHM_ECDSA_P521, ahjl.d, map3, map4);
        agvp.B(ahif.CLASSICAL_ALGORITHM_RSA3072_PSS, ahjl.f, map3, map4);
        agvp.B(ahif.CLASSICAL_ALGORITHM_RSA4096_PSS, ahjl.g, map3, map4);
        agvp.B(ahif.CLASSICAL_ALGORITHM_RSA3072_PKCS1, ahjl.i, map3, map4);
        agvp.B(ahif.CLASSICAL_ALGORITHM_RSA4096_PKCS1, ahjl.j, map3, map4);
        c = agvp.C(map3, map4);
    }

    public static ahga a(ahjn ahjnVar) throws GeneralSecurityException {
        if (ahjnVar == ahjn.b) {
            return ahga.d;
        }
        if (ahjnVar == ahjn.a) {
            return ahga.b;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ahjnVar.c));
    }

    public static ahig b(ahjo ahjoVar) {
        aihf aihfVarCreateBuilder = ahig.a.createBuilder();
        ahiu ahiuVar = (ahiu) b.c(ahjoVar.a);
        aihfVarCreateBuilder.copyOnWrite();
        ((ahig) aihfVarCreateBuilder.instance).b = ahiuVar.getNumber();
        ahif ahifVar = (ahif) c.c(ahjoVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        ((ahig) aihfVarCreateBuilder.instance).c = ahifVar.getNumber();
        return (ahig) aihfVarCreateBuilder.build();
    }

    public static ahjn c(ahga ahgaVar) throws GeneralSecurityException {
        if (ahgaVar.equals(ahga.d)) {
            return ahjn.b;
        }
        if (ahgaVar.equals(ahga.b)) {
            return ahjn.a;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(ahgaVar.g));
    }

    private static ahhj d() {
        try {
            ahhj ahhjVar = new ahhj();
            ahhjVar.e(ahmg.e);
            ahhjVar.f(ahmg.f);
            ahhjVar.c(ahmg.a);
            ahhjVar.d(ahmg.c);
            ahhjVar.c(ahmg.b);
            ahhjVar.d(ahmg.d);
            ahmd.c(ahhjVar);
            ahmj.c(ahhjVar);
            ahmn.c(ahhjVar);
            ahma.c(ahhjVar);
            return ahhjVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Could not create serialization registry", e);
        }
    }
}
