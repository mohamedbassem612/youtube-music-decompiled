package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmd {
    private static final ahha a;
    private static final ahha d;
    private static final ahub e = new ahub(ahkc.class);
    private static final ahub f = new ahub("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
    private static final ahha c = new ahha("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", new ahlz(2));
    private static final ahha b = new ahha(ahkd.class, new ahly(4));

    static {
        int i = 3;
        a = new ahha(ahkf.class, new ahly(i));
        d = new ahha("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", new ahlz(i));
    }

    public static ahgb a(ahkd ahkdVar, ahgj ahgjVar) throws GeneralSecurityException {
        aihf aihfVarCreateBuilder = ahim.a.createBuilder();
        ahin ahinVarG = g(ahkdVar.a);
        aihfVarCreateBuilder.copyOnWrite();
        ahim ahimVar = (ahim) aihfVarCreateBuilder.instance;
        ahinVarG.getClass();
        ahimVar.e = ahinVarG;
        ahimVar.b |= 1;
        ahgj.a(ahgjVar);
        aigj aigjVarV = aigj.v(ahkdVar.b.c());
        aihfVarCreateBuilder.copyOnWrite();
        ahim ahimVar2 = (ahim) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        ahimVar2.d = aigjVarV;
        return ahgb.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((ahim) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, f(ahkdVar.b().a), ahkdVar.a());
    }

    public static ahkd b(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            ahim ahimVar = (ahim) aihn.parseFrom(ahim.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
            if (ahimVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahin ahinVar = ahimVar.e;
            if (ahinVar == null) {
                ahinVar = ahin.a;
            }
            if (ahinVar.b != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahkf ahkfVarE = ahkf.e(h((ahga) ahgbVar.d), ahnf.b(ahinVar.c.G()), (Integer) ahgbVar.e);
            byte[] bArrG = ahimVar.d.G();
            ahgj.a(ahgjVar);
            ahub ahubVarD = ahub.d(bArrG);
            if (ahubVarD.b() == 32) {
                if (Arrays.equals(ahkfVarE.b.c(), ahgq.h(ahgq.g(ahubVarD.c())))) {
                    return new ahkd(ahkfVarE, ahubVarD);
                }
                throw new GeneralSecurityException("Ed25519 keys mismatch");
            }
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + ahubVarD.b());
        } catch (aiik unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    public static void c(ahhj ahhjVar) {
        ahhjVar.e(e);
        ahhjVar.f(f);
        ahhjVar.c(a);
        ahhjVar.d(c);
        ahhjVar.c(b);
        ahhjVar.d(d);
    }

    public static ahkf d(ahgb ahgbVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            Object obj = ahgbVar.b;
            ahin ahinVar = (ahin) aihn.parseFrom(ahin.a, (aigj) obj, ExtensionRegistryLite.a);
            if (ahinVar.b == 0) {
                return ahkf.e(h((ahga) ahgbVar.d), ahnf.b(ahinVar.c.G()), (Integer) ahgbVar.e);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (aiik unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static ahgb e(ahkf ahkfVar) {
        return ahgb.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", g(ahkfVar).toByteString(), ahfz.d, f(ahkfVar.a.a), ahkfVar.d);
    }

    private static ahga f(ahkb ahkbVar) throws GeneralSecurityException {
        if (ahkbVar.equals(ahkb.d)) {
            return ahga.d;
        }
        if (ahkbVar.equals(ahkb.a)) {
            return ahga.b;
        }
        if (ahkbVar.equals(ahkb.b)) {
            return ahga.e;
        }
        if (ahkbVar.equals(ahkb.c)) {
            return ahga.c;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ahkbVar.e));
    }

    private static ahin g(ahkf ahkfVar) {
        aihf aihfVarCreateBuilder = ahin.a.createBuilder();
        aigj aigjVarV = aigj.v(ahkfVar.b.c());
        aihfVarCreateBuilder.copyOnWrite();
        ahin ahinVar = (ahin) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        ahinVar.c = aigjVarV;
        return (ahin) aihfVarCreateBuilder.build();
    }

    private static ahkb h(ahga ahgaVar) throws GeneralSecurityException {
        if (ahgaVar == ahga.d) {
            return ahkb.d;
        }
        if (ahgaVar == ahga.b) {
            return ahkb.a;
        }
        if (ahgaVar == ahga.e) {
            return ahkb.b;
        }
        if (ahgaVar == ahga.c) {
            return ahkb.c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(ahgaVar.g));
    }
}
