package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahnd implements ahge {
    public static final ahtv a;
    private static final byte[] b;
    private static final byte[] c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahna.c, ahkx.a, map, map2);
        agvp.B(ahna.d, ahkx.b, map, map2);
        agvp.B(ahna.e, ahkx.c, map, map2);
        a = agvp.C(map, map2);
        b = new byte[0];
        c = new byte[]{0};
    }

    public static ahge b(ahlb ahlbVar) throws NoSuchAlgorithmException {
        try {
            Provider providerC = ahmo.c();
            if (providerC == null) {
                throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
            }
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerC);
            BigInteger bigInteger = ahlbVar.b;
            ahkz ahkzVar = ahlbVar.a;
            return new ahmo((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ahkzVar.c)), ahkzVar.e, ahkzVar.f, ahkzVar.g, ahlbVar.c.c(), ahkzVar.d.equals(ahky.c) ? ahmo.b : ahmo.a, providerC);
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory2 = (KeyFactory) ahmx.c.a("RSA");
            BigInteger bigInteger2 = ahlbVar.b;
            ahkz ahkzVar2 = ahlbVar.a;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory2.generatePublic(new RSAPublicKeySpec(bigInteger2, ahkzVar2.c));
            ahtv ahtvVar = a;
            return new ahnc(rSAPublicKey, (ahna) ahtvVar.c(ahkzVar2.e), (ahna) ahtvVar.c(ahkzVar2.f), ahkzVar2.g, ahlbVar.c.c(), ahkzVar2.d.equals(ahky.c) ? c : b);
        }
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
