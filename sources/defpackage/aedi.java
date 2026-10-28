package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class aedi {
    public aedi() {
    }

    public static byte[] A(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int length = bArr[i2].length;
            if (i > Alert.DURATION_SHOW_INDEFINITELY - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            byte[] bArr3 = bArr[i4];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }

    public static int B(ahjo ahjoVar) throws GeneralSecurityException {
        int i;
        ahjm ahjmVar = ahjoVar.a;
        boolean zEquals = ahjmVar.equals(ahjm.a);
        ahjl ahjlVar = ahjoVar.b;
        if (zEquals) {
            if (ahjlVar.equals(ahjl.a)) {
                return 2484;
            }
            i = 2676;
            if (!ahjlVar.equals(ahjl.e) && !ahjlVar.equals(ahjl.h)) {
                throw new GeneralSecurityException("No known signature length for ".concat(ahjlVar.k));
            }
        } else {
            if (!ahjmVar.equals(ahjm.b)) {
                if (!ahjmVar.equals(ahjm.c)) {
                    throw new GeneralSecurityException("Unsupported ML-DSA instance: ".concat(ahjmVar.d));
                }
                if (ahjlVar.equals(ahjl.f)) {
                    return 5011;
                }
                if (ahjlVar.equals(ahjl.g)) {
                    return 5139;
                }
                throw new GeneralSecurityException("No known signature length for ".concat(ahjlVar.k));
            }
            if (ahjlVar.equals(ahjl.a)) {
                return 3373;
            }
            i = 3693;
            if (!ahjlVar.equals(ahjl.f)) {
                if (!ahjlVar.equals(ahjl.g)) {
                    if (!ahjlVar.equals(ahjl.i)) {
                        if (!ahjlVar.equals(ahjl.j)) {
                            throw new GeneralSecurityException("No known signature length for ".concat(ahjlVar.k));
                        }
                    }
                }
                return 3821;
            }
        }
        return i;
    }

    public static String C(ahjo ahjoVar) throws GeneralSecurityException {
        ahjm ahjmVar = ahjoVar.a;
        boolean zEquals = ahjmVar.equals(ahjm.a);
        ahjl ahjlVar = ahjoVar.b;
        if (zEquals) {
            if (ahjlVar.equals(ahjl.a)) {
                return "MLDSA44-Ed25519-SHA512";
            }
            if (ahjlVar.equals(ahjl.b)) {
                return "MLDSA44-ECDSA-P256-SHA256";
            }
            if (ahjlVar.equals(ahjl.e)) {
                return "MLDSA44-RSA2048-PSS-SHA256";
            }
            if (ahjlVar.equals(ahjl.h)) {
                return "MLDSA44-RSA2048-PKCS15-SHA256";
            }
            throw new GeneralSecurityException("Unsupported classical algorithm for ML-DSA-44: ".concat(ahjlVar.k));
        }
        if (!ahjmVar.equals(ahjm.b)) {
            if (!ahjmVar.equals(ahjm.c)) {
                throw new GeneralSecurityException("Unsupported ML-DSA instance: ".concat(ahjmVar.d));
            }
            if (ahjlVar.equals(ahjl.c)) {
                return "MLDSA87-ECDSA-P384-SHA512";
            }
            if (ahjlVar.equals(ahjl.d)) {
                return "MLDSA87-ECDSA-P521-SHA512";
            }
            if (ahjlVar.equals(ahjl.f)) {
                return "MLDSA87-RSA3072-PSS-SHA512";
            }
            if (ahjlVar.equals(ahjl.g)) {
                return "MLDSA87-RSA4096-PSS-SHA512";
            }
            throw new GeneralSecurityException("Unsupported classical algorithm for ML-DSA-87: ".concat(ahjlVar.k));
        }
        if (ahjlVar.equals(ahjl.a)) {
            return "MLDSA65-Ed25519-SHA512";
        }
        if (ahjlVar.equals(ahjl.b)) {
            return "MLDSA65-ECDSA-P256-SHA512";
        }
        if (ahjlVar.equals(ahjl.c)) {
            return "MLDSA65-ECDSA-P384-SHA512";
        }
        if (ahjlVar.equals(ahjl.f)) {
            return "MLDSA65-RSA3072-PSS-SHA512";
        }
        if (ahjlVar.equals(ahjl.g)) {
            return "MLDSA65-RSA4096-PSS-SHA512";
        }
        if (ahjlVar.equals(ahjl.i)) {
            return "MLDSA65-RSA3072-PKCS15-SHA512";
        }
        if (ahjlVar.equals(ahjl.j)) {
            return "MLDSA65-RSA4096-PKCS15-SHA512";
        }
        throw new GeneralSecurityException("Unsupported classical algorithm for ML-DSA-65: ".concat(ahjlVar.k));
    }

    public static boolean D(String str) {
        return str.equals("MLDSA44-ECDSA-P256-SHA256") || str.equals("MLDSA65-ECDSA-P256-SHA512") || str.equals("MLDSA65-ECDSA-P384-SHA512") || str.equals("MLDSA87-ECDSA-P384-SHA512") || str.equals("MLDSA87-ECDSA-P521-SHA512");
    }

    public static ahlb E(ahkz ahkzVar, BigInteger bigInteger, Integer num) throws GeneralSecurityException {
        ahnf ahnfVarA;
        int iBitLength = bigInteger.bitLength();
        int i = ahkzVar.b;
        if (iBitLength != i) {
            throw new GeneralSecurityException(a.bQ(i, iBitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (ahkzVar.S() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ahkzVar.S() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ahky ahkyVar = ahkzVar.d;
        if (ahkyVar == ahky.d) {
            ahnfVarA = ahhk.a;
        } else if (ahkyVar == ahky.c || ahkyVar == ahky.b) {
            ahnfVarA = ahhk.a(num.intValue());
        } else {
            if (ahkyVar != ahky.a) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(String.valueOf(ahkyVar))));
            }
            ahnfVarA = ahhk.b(num.intValue());
        }
        return new ahlb(ahkzVar, bigInteger, ahnfVarA, num);
    }

    public static ahku F(ahks ahksVar, BigInteger bigInteger, Integer num) throws GeneralSecurityException {
        ahnf ahnfVarA;
        int iBitLength = bigInteger.bitLength();
        int i = ahksVar.b;
        if (iBitLength != i) {
            throw new GeneralSecurityException(a.bQ(i, iBitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (ahksVar.S() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ahksVar.S() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ahkr ahkrVar = ahksVar.d;
        if (ahkrVar == ahkr.d) {
            ahnfVarA = ahhk.a;
        } else if (ahkrVar == ahkr.c || ahkrVar == ahkr.b) {
            ahnfVarA = ahhk.a(num.intValue());
        } else {
            if (ahkrVar != ahkr.a) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(String.valueOf(ahkrVar))));
            }
            ahnfVarA = ahhk.b(num.intValue());
        }
        return new ahku(ahksVar, bigInteger, ahnfVarA, num);
    }

    public static ahkk G(ahki ahkiVar, ahnf ahnfVar, Integer num) throws GeneralSecurityException {
        ahnf ahnfVarB;
        ahkh ahkhVar = ahkiVar.b;
        ahkh ahkhVar2 = ahkh.b;
        if (ahkhVar == ahkhVar2 && num != null) {
            throw new GeneralSecurityException("Id requirement present for parameters' variant NO_PREFIX");
        }
        ahkh ahkhVar3 = ahkh.a;
        if (ahkhVar == ahkhVar3 && num == null) {
            throw new GeneralSecurityException("Id requirement missing for parameters' variant TINK");
        }
        ahkg ahkgVar = ahkiVar.a;
        ahkg ahkgVar2 = ahkg.a;
        if (ahkgVar != ahkgVar2 && ahkgVar != ahkg.b && ahkgVar != ahkg.c) {
            throw new GeneralSecurityException("Unknown ML-DSA instance: " + ahkgVar.d + ", only ML-DSA-{44,65,87} are supported");
        }
        if (ahkgVar == ahkgVar2 && ahnfVar.a() != 1312) {
            throw new GeneralSecurityException("Incorrect public key size for ML-DSA-44");
        }
        if (ahkgVar == ahkg.b && ahnfVar.a() != 1952) {
            throw new GeneralSecurityException("Incorrect public key size for ML-DSA-65");
        }
        if (ahkgVar == ahkg.c && ahnfVar.a() != 2592) {
            throw new GeneralSecurityException("Incorrect public key size for ML-DSA-87");
        }
        if (ahkhVar == ahkhVar2) {
            ahnfVarB = ahhk.a;
        } else {
            if (ahkhVar != ahkhVar3) {
                throw new IllegalStateException("Unknown MlDsaParameters.Variant: ".concat(ahkhVar.c));
            }
            ahnfVarB = ahhk.b(num.intValue());
        }
        return new ahkk(ahkiVar, ahnfVar, ahnfVarB, num);
    }

    public static ahjx H(ahjv ahjvVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        ahnf ahnfVarA;
        ahgu.e(eCPoint, ahjvVar.b.e.getCurve());
        if (ahjvVar.S() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ahjvVar.S() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ahju ahjuVar = ahjvVar.d;
        if (ahjuVar == ahju.d) {
            ahnfVarA = ahhk.a;
        } else if (ahjuVar == ahju.c || ahjuVar == ahju.b) {
            ahnfVarA = ahhk.a(num.intValue());
        } else {
            if (ahjuVar != ahju.a) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(ahjuVar.e));
            }
            ahnfVarA = ahhk.b(num.intValue());
        }
        return new ahjx(ahjvVar, eCPoint, ahnfVarA, num);
    }

    public static ahjv I(ahjt ahjtVar, ahjr ahjrVar, ahjs ahjsVar, ahju ahjuVar) throws GeneralSecurityException {
        if (ahjrVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        if (ahjrVar == ahjr.a && ahjsVar != ahjs.a) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (ahjrVar == ahjr.b && ahjsVar != ahjs.b && ahjsVar != ahjs.c) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (ahjrVar != ahjr.c || ahjsVar == ahjs.c) {
            return new ahjv(ahjtVar, ahjrVar, ahjsVar, ahjuVar);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public static aedr a(aedv aedvVar) {
        aedr aedrVar;
        int i = aedvVar.a;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            int i3 = aedvVar.b;
            if (i3 == 0) {
                return null;
            }
            int i4 = i3 - 1;
            if (i4 == 0) {
                int i5 = aedvVar.d;
                if (i5 == 0) {
                    throw new awmj();
                }
                if (i5 - 1 != 0) {
                    int i6 = aedvVar.c;
                    if (i6 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i6 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_xs_heavy_tall, 18, 26, true, true, 900, 600, "'opsz' 18, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_xs_heavy, 18, 22, true, false, 900, 600, "'opsz' 18, 'wdth' 25, 'wght' 600");
                } else {
                    int i7 = aedvVar.c;
                    if (i7 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i7 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_xs_tall, 18, 26, false, true, 700, 600, "'opsz' 18, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_xs_default, 18, 22, false, false, 700, 600, "'opsz' 18, 'wdth' 25, 'wght' 600");
                }
            } else if (i4 == 1) {
                int i8 = aedvVar.d;
                if (i8 == 0) {
                    throw new awmj();
                }
                if (i8 - 1 != 0) {
                    int i9 = aedvVar.c;
                    if (i9 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i9 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_s_heavy_tall, 20, 28, true, true, 900, 600, "'opsz' 20, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_s_heavy, 20, 24, true, false, 900, 600, "'opsz' 20, 'wdth' 25, 'wght' 600");
                } else {
                    int i10 = aedvVar.c;
                    if (i10 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i10 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_s_tall, 20, 28, false, true, 700, 600, "'opsz' 20, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_s_default, 20, 24, false, false, 700, 600, "'opsz' 20, 'wdth' 25, 'wght' 600");
                }
            } else if (i4 == 2) {
                int i11 = aedvVar.d;
                if (i11 == 0) {
                    throw new awmj();
                }
                if (i11 - 1 != 0) {
                    int i12 = aedvVar.c;
                    if (i12 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i12 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_m_heavy_tall, 24, 32, true, true, 900, 600, "'opsz' 24, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_m_heavy, 24, 30, true, false, 900, 600, "'opsz' 24, 'wdth' 25, 'wght' 600");
                } else {
                    int i13 = aedvVar.c;
                    if (i13 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i13 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_m_tall, 24, 32, false, true, 700, 600, "'opsz' 24, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_m_default, 24, 30, false, false, 700, 600, "'opsz' 24, 'wdth' 25, 'wght' 600");
                }
            } else {
                if (i4 != 3) {
                    int i14 = aedvVar.d;
                    if (i14 == 0) {
                        throw new awmj();
                    }
                    if (i14 - 1 != 0) {
                        if (aedvVar.c == 0) {
                            throw new awmj();
                        }
                        return null;
                    }
                    if (aedvVar.c == 0) {
                        throw new awmj();
                    }
                    return null;
                }
                int i15 = aedvVar.d;
                if (i15 == 0) {
                    throw new awmj();
                }
                if (i15 - 1 != 0) {
                    int i16 = aedvVar.c;
                    if (i16 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i16 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_l_heavy_tall, 32, 44, true, true, 900, 600, "'opsz' 32, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_l_heavy, 32, 38, true, false, 900, 600, "'opsz' 32, 'wdth' 25, 'wght' 600");
                } else {
                    int i17 = aedvVar.c;
                    if (i17 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i17 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_headline_l_tall, 32, 44, false, true, 700, 600, "'opsz' 32, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_headline_l_default, 32, 38, false, false, 700, 600, "'opsz' 32, 'wdth' 25, 'wght' 600");
                }
            }
        } else if (i2 == 2) {
            int i18 = aedvVar.b;
            if (i18 == 0) {
                return null;
            }
            int i19 = i18 - 1;
            if (i19 == 0) {
                int i20 = aedvVar.d;
                if (i20 == 0) {
                    throw new awmj();
                }
                if (i20 - 1 != 0) {
                    int i21 = aedvVar.c;
                    if (i21 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i21 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_xs_heavy_tall, 10, 16, true, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_xs_heavy, 10, 14, true, false, 500, 0, null);
                } else {
                    int i22 = aedvVar.c;
                    if (i22 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i22 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_xs_tall, 10, 16, false, true, 400, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_xs_default, 10, 14, false, false, 400, 0, null);
                }
            } else if (i19 == 1) {
                int i23 = aedvVar.d;
                if (i23 == 0) {
                    throw new awmj();
                }
                if (i23 - 1 != 0) {
                    int i24 = aedvVar.c;
                    if (i24 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i24 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_s_heavy_tall, 12, 18, true, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_s_heavy, 12, 16, true, false, 500, 0, null);
                } else {
                    int i25 = aedvVar.c;
                    if (i25 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i25 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_s_tall, 12, 18, false, true, 400, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_s_default, 12, 16, false, false, 400, 0, null);
                }
            } else if (i19 == 2) {
                int i26 = aedvVar.d;
                if (i26 == 0) {
                    throw new awmj();
                }
                if (i26 - 1 != 0) {
                    int i27 = aedvVar.c;
                    if (i27 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i27 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_m_heavy_tall, 14, 20, true, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_m_heavy, 14, 18, true, false, 500, 0, null);
                } else {
                    int i28 = aedvVar.c;
                    if (i28 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i28 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_m_tall, 14, 20, false, true, 400, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_m_default, 14, 18, false, false, 400, 0, null);
                }
            } else if (i19 != 3) {
                int i29 = aedvVar.d;
                if (i29 == 0) {
                    throw new awmj();
                }
                if (i29 - 1 != 0) {
                    int i30 = aedvVar.c;
                    if (i30 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i30 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_xl_heavy_tall, 18, 26, true, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_xl_heavy, 18, 22, true, false, 500, 0, null);
                } else {
                    int i31 = aedvVar.c;
                    if (i31 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i31 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_xl_tall, 18, 26, false, true, 400, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_xl_default, 18, 22, false, false, 400, 0, null);
                }
            } else {
                int i32 = aedvVar.d;
                if (i32 == 0) {
                    throw new awmj();
                }
                if (i32 - 1 != 0) {
                    int i33 = aedvVar.c;
                    if (i33 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i33 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_l_heavy_tall, 16, 22, true, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_l_heavy, 16, 20, true, false, 500, 0, null);
                } else {
                    int i34 = aedvVar.c;
                    if (i34 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i34 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_body_l_tall, 16, 22, false, true, 400, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_body_l_default, 16, 20, false, false, 400, 0, null);
                }
            }
        } else if (i2 != 3) {
            int i35 = aedvVar.b;
            if (i35 == 0) {
                return null;
            }
            int i36 = i35 - 1;
            if (i36 == 0) {
                int i37 = aedvVar.d;
                if (i37 == 0) {
                    throw new awmj();
                }
                if (i37 - 1 != 0) {
                    int i38 = aedvVar.c;
                    if (i38 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i38 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_xs_heavy_tall, 24, 32, true, true, 700, 600, "'opsz' 24, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_display_xs_heavy, 24, 30, true, false, 700, 600, "'opsz' 24, 'wdth' 25, 'wght' 600");
                } else {
                    int i39 = aedvVar.c;
                    if (i39 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i39 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_xs_tall, 24, 32, false, true, 300, 400, "'opsz' 24, 'wdth' 100, 'wght' 400") : new aedr(R.attr.yt_sys_typography_typestack_display_xs_default, 24, 30, false, false, 300, 400, "'opsz' 24, 'wdth' 100, 'wght' 400");
                }
            } else if (i36 == 1) {
                int i40 = aedvVar.d;
                if (i40 == 0) {
                    throw new awmj();
                }
                if (i40 - 1 != 0) {
                    int i41 = aedvVar.c;
                    if (i41 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i41 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_s_heavy_tall, 32, 44, true, true, 700, 600, "'opsz' 32, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_display_s_heavy, 32, 38, true, false, 700, 600, "'opsz' 32, 'wdth' 25, 'wght' 600");
                } else {
                    int i42 = aedvVar.c;
                    if (i42 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i42 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_s_tall, 32, 44, false, true, 300, 400, "'opsz' 32, 'wdth' 100, 'wght' 400") : new aedr(R.attr.yt_sys_typography_typestack_display_s_default, 32, 38, false, false, 300, 400, "'opsz' 32, 'wdth' 100, 'wght' 400");
                }
            } else if (i36 == 2) {
                int i43 = aedvVar.d;
                if (i43 == 0) {
                    throw new awmj();
                }
                if (i43 - 1 != 0) {
                    int i44 = aedvVar.c;
                    if (i44 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i44 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_m_heavy_tall, 40, 54, true, true, 700, 600, "'opsz' 40, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_display_m_heavy, 40, 48, true, false, 700, 600, "'opsz' 40, 'wdth' 25, 'wght' 600");
                } else {
                    int i45 = aedvVar.c;
                    if (i45 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i45 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_m_tall, 40, 54, false, true, 300, 400, "'opsz' 40, 'wdth' 100, 'wght' 400") : new aedr(R.attr.yt_sys_typography_typestack_display_m_default, 40, 48, false, false, 300, 400, "'opsz' 40, 'wdth' 100, 'wght' 400");
                }
            } else {
                if (i36 != 3) {
                    int i46 = aedvVar.d;
                    if (i46 == 0) {
                        throw new awmj();
                    }
                    if (i46 - 1 != 0) {
                        if (aedvVar.c == 0) {
                            throw new awmj();
                        }
                        return null;
                    }
                    if (aedvVar.c == 0) {
                        throw new awmj();
                    }
                    return null;
                }
                int i47 = aedvVar.d;
                if (i47 == 0) {
                    throw new awmj();
                }
                if (i47 - 1 != 0) {
                    int i48 = aedvVar.c;
                    if (i48 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i48 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_l_heavy_tall, 56, 78, true, true, 700, 600, "'opsz' 56, 'wdth' 25, 'wght' 600") : new aedr(R.attr.yt_sys_typography_typestack_display_l_heavy, 56, 68, true, false, 700, 600, "'opsz' 56, 'wdth' 25, 'wght' 600");
                } else {
                    int i49 = aedvVar.c;
                    if (i49 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i49 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_display_l_tall, 56, 78, false, true, 300, 400, "'opsz' 56, 'wdth' 100, 'wght' 400") : new aedr(R.attr.yt_sys_typography_typestack_display_l_default, 56, 68, false, false, 300, 400, "'opsz' 56, 'wdth' 100, 'wght' 400");
                }
            }
        } else {
            int i50 = aedvVar.b;
            if (i50 == 0) {
                return null;
            }
            int i51 = i50 - 1;
            if (i51 == 0) {
                int i52 = aedvVar.d;
                if (i52 == 0) {
                    throw new awmj();
                }
                if (i52 - 1 != 0) {
                    int i53 = aedvVar.c;
                    if (i53 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i53 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_xs_heavy_tall, 10, 16, true, true, 700, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_xs_heavy, 10, 14, true, false, 700, 0, null);
                } else {
                    int i54 = aedvVar.c;
                    if (i54 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i54 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_xs_tall, 10, 16, false, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_xs_default, 10, 14, false, false, 500, 0, null);
                }
            } else if (i51 == 1) {
                int i55 = aedvVar.d;
                if (i55 == 0) {
                    throw new awmj();
                }
                if (i55 - 1 != 0) {
                    int i56 = aedvVar.c;
                    if (i56 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i56 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_s_heavy_tall, 12, 18, true, true, 700, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_s_heavy, 12, 16, true, false, 700, 0, null);
                } else {
                    int i57 = aedvVar.c;
                    if (i57 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i57 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_s_tall, 12, 18, false, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_s_default, 12, 16, false, false, 500, 0, null);
                }
            } else if (i51 == 2) {
                int i58 = aedvVar.d;
                if (i58 == 0) {
                    throw new awmj();
                }
                if (i58 - 1 != 0) {
                    int i59 = aedvVar.c;
                    if (i59 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i59 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_m_heavy_tall, 14, 20, true, true, 700, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_m_heavy, 14, 18, true, false, 700, 0, null);
                } else {
                    int i60 = aedvVar.c;
                    if (i60 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i60 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_m_tall, 14, 20, false, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_m_default, 14, 18, false, false, 500, 0, null);
                }
            } else if (i51 != 3) {
                int i61 = aedvVar.d;
                if (i61 == 0) {
                    throw new awmj();
                }
                if (i61 - 1 != 0) {
                    int i62 = aedvVar.c;
                    if (i62 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i62 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_xl_heavy_tall, 18, 26, true, true, 700, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_xl_heavy, 18, 22, true, false, 700, 0, null);
                } else {
                    int i63 = aedvVar.c;
                    if (i63 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i63 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_xl_tall, 18, 26, false, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_xl_default, 18, 22, false, false, 500, 0, null);
                }
            } else {
                int i64 = aedvVar.d;
                if (i64 == 0) {
                    throw new awmj();
                }
                if (i64 - 1 != 0) {
                    int i65 = aedvVar.c;
                    if (i65 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i65 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_l_heavy_tall, 16, 22, true, true, 700, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_l_heavy, 16, 20, true, false, 700, 0, null);
                } else {
                    int i66 = aedvVar.c;
                    if (i66 == 0) {
                        throw new awmj();
                    }
                    aedrVar = i66 + (-1) != 0 ? new aedr(R.attr.yt_sys_typography_typestack_action_l_tall, 16, 22, false, true, 500, 0, null) : new aedr(R.attr.yt_sys_typography_typestack_action_l_default, 16, 20, false, false, 500, 0, null);
                }
            }
        }
        return aedrVar;
    }

    public static int b(int i) {
        return i == 0 ? 111 : 0;
    }

    public static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean d(int i) {
        return i == 0;
    }

    public static boolean e(int i) {
        return (i & 28) == 28;
    }

    public static PackageInfo f(Context context) {
        int i = dva.a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage != null) {
            return currentWebViewPackage;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface] */
    public static void g(WebView webView, boolean z) {
        int i = dva.a;
        if (!dvy.f.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        dva.b(webView).a.setAudioMuted(z);
    }

    public static void h(TextView textView, aekm aekmVar) {
        if (aekmVar != null) {
            Resources resources = textView.getResources();
            textView.setTextColor(aekmVar.a);
            int i = aekmVar.b;
            tuk.k(textView, i == 0 ? null : resources.getDrawable(i), 0);
        }
    }

    public static void i(View view) {
        ttt tttVar;
        View viewFindViewById = view.findViewById(R.id.new_content_indicator);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        if (((ViewStub) view.findViewById(R.id.new_content_indicator_stub)) == null) {
            Drawable background = view.getBackground();
            if (background instanceof ttt) {
                tttVar = (ttt) background;
            } else {
                view.setBackground(null);
                ttt tttVar2 = new ttt(view.getContext(), background);
                tym.Z(view, tttVar2);
                tttVar = tttVar2;
            }
            tttVar.getDrawable(1).setAlpha(0);
            tttVar.invalidateSelf();
        }
    }

    public static void j(View view, View.OnClickListener onClickListener, addn addnVar) {
        view.setOnClickListener(new vqd(onClickListener, addnVar, 20));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface] */
    public static void k(WebView webView, String str, Set set, aedi aediVar) {
        int i = dva.a;
        if (!dvy.c.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        elq elqVarB = dva.b(webView);
        elqVarB.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new axsm(new dvq(aediVar)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public static Uri l(Activity activity, File file) {
        String str;
        String packageName = activity.getPackageName();
        int iHashCode = packageName.hashCode();
        if (iHashCode != 66280549) {
            if (iHashCode != 1252744364) {
                if (iHashCode == 1713433253 && packageName.equals("com.google.android.apps.youtube.music")) {
                    str = "com.google.android.apps.youtube.music.fileprovider";
                } else {
                    str = "com.google.android.youtube.fileprovider";
                }
            } else if (packageName.equals("com.google.android.apps.youtube.creator")) {
                str = "com.google.android.apps.youtube.creator.fileprovider";
            } else {
                str = "com.google.android.youtube.fileprovider";
            }
        } else if (packageName.equals("com.google.android.youtube.oem")) {
            str = "com.google.android.youtube.oem.fileprovider";
        } else {
            str = "com.google.android.youtube.fileprovider";
        }
        return avh.a(activity, str, file);
    }

    public static File m(Activity activity, Bitmap bitmap, String str) {
        File file = new File(activity.getCacheDir(), "story_share");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return file2;
    }

    public static String n() {
        String language = Locale.getDefault().getLanguage();
        return (language == null || language.length() != 2) ? "en" : language;
    }

    public static String o() {
        String country = Locale.getDefault().getCountry();
        if (country == null || country.length() != 2) {
            country = "us";
        }
        return country.toLowerCase(Locale.ENGLISH);
    }

    public static void p(xgn xgnVar, arkm arkmVar, int i, Integer num) {
        amud amudVar = arkmVar.A;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        xgj xgjVar = new xgj(amudVar.d, (amud) null);
        aihf aihfVarCreateBuilder = amcr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amcr amcrVar = (amcr) aihfVarCreateBuilder.instance;
        amcrVar.c = i - 1;
        amcrVar.b |= 1;
        if (num != null) {
            aihf aihfVarCreateBuilder2 = amcs.a.createBuilder();
            int iIntValue = num.intValue();
            aihfVarCreateBuilder2.copyOnWrite();
            amcs amcsVar = (amcs) aihfVarCreateBuilder2.instance;
            amcsVar.b |= 1;
            amcsVar.c = iIntValue;
            aihfVarCreateBuilder.copyOnWrite();
            amcr amcrVar2 = (amcr) aihfVarCreateBuilder.instance;
            amcs amcsVar2 = (amcs) aihfVarCreateBuilder2.build();
            amcsVar2.getClass();
            amcrVar2.d = amcsVar2;
            amcrVar2.b |= 2;
        }
        aihf aihfVarCreateBuilder3 = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder4 = amco.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        amco amcoVar = (amco) aihfVarCreateBuilder4.instance;
        amcr amcrVar3 = (amcr) aihfVarCreateBuilder.build();
        amcrVar3.getClass();
        amcoVar.d = amcrVar3;
        amcoVar.c = 16;
        aihfVarCreateBuilder3.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder3.instance;
        amco amcoVar2 = (amco) aihfVarCreateBuilder4.build();
        amcoVar2.getClass();
        amddVar.q = amcoVar2;
        amddVar.c |= SemanticState.ReadOnly;
        xgnVar.A(xgjVar, (amdd) aihfVarCreateBuilder3.build());
    }

    public static qrx q(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("settings");
        qpqVar.d("settings.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.e(aeje.a);
        qrlVarA.f(uriA);
        return rrqVar.c(qrlVarA.a());
    }

    public static void r(atr atrVar, ahte ahteVar) {
        if (ahteVar != null) {
            try {
                lpa lpaVar = ahteVar.c;
                kro.l(lpaVar);
                Bitmap bitmap = (Bitmap) mda.o(lpaVar, 5L, TimeUnit.SECONDS);
                atrVar.o(bitmap);
                atp atpVar = new atp();
                atpVar.d(bitmap);
                atpVar.c(null);
                atrVar.r(atpVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                ahteVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e.getCause()))));
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                ahteVar.close();
            }
        }
    }

    public static void s(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    public static Long t(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return Long.valueOf(ByteBuffer.wrap(messageDigest.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String u(ahna ahnaVar) throws GeneralSecurityException {
        int iOrdinal = ahnaVar.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(ahnaVar.toString()));
    }

    public static String v(ahna ahnaVar) throws GeneralSecurityException {
        ahne.c(ahnaVar);
        return ahnaVar.toString().concat("withECDSA");
    }

    public static byte[] w(String str) {
        byte[] bArr = new byte[19];
        for (int i = 0; i < 19; i++) {
            int i2 = i << 1;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    public static int x(EllipticCurve ellipticCurve) {
        return ahgu.d(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    public static ECParameterSpec y(ahmv ahmvVar) throws NoSuchAlgorithmException {
        int iOrdinal = ahmvVar.ordinal();
        if (iOrdinal == 0) {
            return ahgu.a;
        }
        if (iOrdinal == 1) {
            return ahgu.b;
        }
        if (iOrdinal == 2) {
            return ahgu.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(ahmvVar.toString()));
    }

    public static byte[] z(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }

    public aedi(byte[] bArr) {
    }

    public void J(aami aamiVar, Uri uri) {
    }
}
