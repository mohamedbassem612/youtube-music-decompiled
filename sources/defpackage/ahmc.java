package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmc implements ahge {
    static final ahtv a;
    static final ahtv b;
    static final ahtv c;
    private static final byte[] d = new byte[0];
    private static final byte[] e = {0};
    private final ECPublicKey f;
    private final String g;
    private final ahmw h;
    private final byte[] i;
    private final byte[] j;
    private final Provider k;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahna.c, ahjs.a, map, map2);
        agvp.B(ahna.d, ahjs.b, map, map2);
        agvp.B(ahna.e, ahjs.c, map, map2);
        a = agvp.C(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        agvp.B(ahmw.a, ahjt.a, map3, map4);
        agvp.B(ahmw.b, ahjt.b, map3, map4);
        b = agvp.C(map3, map4);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        agvp.B(ahmv.a, ahjr.a, map5, map6);
        agvp.B(ahmv.b, ahjr.b, map5, map6);
        agvp.B(ahmv.c, ahjr.c, map5, map6);
        c = agvp.C(map5, map6);
    }

    private ahmc(ECPublicKey eCPublicKey, ahna ahnaVar, ahmw ahmwVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!afyd.q(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.g = aedi.v(ahnaVar);
        this.f = eCPublicKey;
        this.h = ahmwVar;
        this.i = bArr;
        this.j = bArr2;
        this.k = provider;
    }

    public static ahge b(ahjx ahjxVar) {
        Provider providerA = ahgn.a();
        ahtv ahtvVar = c;
        ahjv ahjvVar = ahjxVar.a;
        return new ahmc((ECPublicKey) (providerA != null ? KeyFactory.getInstance("EC", providerA) : (KeyFactory) ahmx.c.a("EC")).generatePublic(new ECPublicKeySpec(ahjxVar.b, aedi.y((ahmv) ahtvVar.c(ahjvVar.b)))), (ahna) a.c(ahjvVar.c), (ahmw) b.c(ahjvVar.a), ahjxVar.c.c(), ahjvVar.d.equals(ahju.c) ? e : d, providerA);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125 A[RETURN] */
    private final void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b2;
        int i6;
        byte b3;
        String str;
        Provider provider;
        Signature signature;
        byte[] bArr4;
        int i7;
        if (this.h == ahmw.a) {
            EllipticCurve curve = this.f.getParams().getCurve();
            int length = bArr.length;
            if (length != (((aedi.x(curve) + 7) / 8) << 1)) {
                throw new GeneralSecurityException("Invalid signature");
            }
            if ((length & 1) != 0 || length == 0 || length > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            }
            int i8 = length >> 1;
            byte[] bArrZ = aedi.z(Arrays.copyOf(bArr, i8));
            byte[] bArrZ2 = aedi.z(Arrays.copyOfRange(bArr, i8, length));
            int length2 = bArrZ.length;
            int length3 = bArrZ2.length;
            int i9 = length2 + 4 + length3;
            if (i9 >= 128) {
                bArr3 = new byte[i9 + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) i9;
                i7 = 3;
            } else {
                bArr3 = new byte[i9 + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) i9;
                i7 = 2;
            }
            int i10 = i7 + 1;
            bArr3[i7] = 2;
            int i11 = i7 + 2;
            bArr3[i10] = (byte) length2;
            System.arraycopy(bArrZ, 0, bArr3, i11, length2);
            int i12 = i11 + length2;
            bArr3[i12] = 2;
            bArr3[i12 + 1] = (byte) length3;
            System.arraycopy(bArrZ2, 0, bArr3, i12 + 2, length3);
        } else {
            bArr3 = bArr;
        }
        int length4 = bArr3.length;
        if (length4 >= 8 && bArr3[0] == 48) {
            int i13 = bArr3[1] & 255;
            if (i13 == 129) {
                i13 = bArr3[2] & 255;
                if (i13 >= 128) {
                    i = 2;
                    if (i13 == (length4 - 1) - i && bArr3[i + 1] == 2 && (i5 = (i4 = (i3 = i + 3) + (i2 = bArr3[i + 2] & 255)) + 1) < length4 && i2 != 0) {
                        b2 = bArr3[i3];
                        if ((b2 & 255) < 128 && ((i2 <= 1 || b2 != 0 || (bArr3[i + 4] & 255) >= 128) && bArr3[i4] == 2)) {
                            i6 = bArr3[i5] & 255;
                            if (i4 + 2 + i6 == length4 && i6 != 0) {
                                b3 = bArr3[i + 5 + i2];
                                if ((b3 & 255) < 128 && (i6 <= 1 || b3 != 0 || (bArr3[i + 6 + i2] & 255) >= 128)) {
                                    str = this.g;
                                    provider = this.k;
                                    if (provider != null) {
                                        signature = Signature.getInstance(str, provider);
                                    } else {
                                        signature = (Signature) ahmx.a.a(str);
                                    }
                                    signature.initVerify(this.f);
                                    signature.update(bArr2);
                                    bArr4 = this.j;
                                    if (bArr4.length > 0) {
                                        signature.update(bArr4);
                                    }
                                    try {
                                        if (signature.verify(bArr3)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i13 != 128 && i13 <= 129) {
                i = 1;
                if (i13 == (length4 - 1) - i) {
                    b2 = bArr3[i3];
                    if ((b2 & 255) < 128) {
                        i6 = bArr3[i5] & 255;
                        if (i4 + 2 + i6 == length4) {
                            b3 = bArr3[i + 5 + i2];
                            if ((b3 & 255) < 128) {
                                str = this.g;
                                provider = this.k;
                                if (provider != null) {
                                    signature = Signature.getInstance(str, provider);
                                } else {
                                    signature = (Signature) ahmx.a.a(str);
                                }
                                signature.initVerify(this.f);
                                signature.update(bArr2);
                                bArr4 = this.j;
                                if (bArr4.length > 0) {
                                    signature.update(bArr4);
                                }
                                if (signature.verify(bArr3)) {
                                    return;
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.i;
        int length = bArr3.length;
        if (length == 0) {
            c(bArr, bArr2);
        } else {
            if (!ahie.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
