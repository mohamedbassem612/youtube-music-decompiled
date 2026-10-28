package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hfx {
    public static final agke a;
    public static final agkz b;
    public static final agkz c;
    public static final agkz d;
    public static final agkz e;
    private static final agrf k = agrf.h("com/google/android/apps/youtube/music/mediabrowser/AllowlistManager");
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    public final vyo f;
    public final vxz j;
    private final Context q;
    private final kmm r;
    private final vxz v;
    private final Set s = DesugarCollections.synchronizedSet(new HashSet());
    private final Set t = DesugarCollections.synchronizedSet(new HashSet());
    public final Set g = DesugarCollections.synchronizedSet(new HashSet());
    public final Set h = DesugarCollections.synchronizedSet(new HashSet());
    private final List u = DesugarCollections.synchronizedList(new ArrayList());
    public final avmm i = new avmm();

    static {
        byte[] bArr = {52, -33, 14, 122, -97, 28, -15, -119, 46, 69, -64, 86, -76, -105, 60, -40, 28, -49, 20, -118, 64, 80, -47, 26, -22, 74, -59, -90, 95, -112, 10, 66};
        l = bArr;
        byte[] bArr2 = {50, -111, -45, -59, -22, 28, 45, 42, -56, -113, 118, 66, -75, 56, 22, -120, -121, -43, 30, 126, -72, 78, -68, 69, -14, -86, 115, -110, -44, 12, -28, 59};
        m = bArr2;
        byte[] bArr3 = {10, 1, 33, 49, -79, -67, -7, -24, 14, -7, 125, 55, -13, -76, -125, 98, -66, 54, 58, 70, 76, -124, 69, -20, -8, 54, 39, -21, -24, 73, 58, 30};
        n = bArr3;
        byte[] bArr4 = {3, 99, 127, 108, 93, -113, 96, 78, 111, -37, 121, -90, -1, -65, -91, 120, -34, 78, 49, -113, -115, -94, 47, -58, 16, 102, 101, 36, 127, -120, 7, -41};
        o = bArr4;
        byte[] bArr5 = {-6, 106, 25, -120, 3, -86, -63, -109, -97, -19, 107, -85, -110, -107, -27, 24, 76, 0, -106, 107, -7, 18, -8, -59, -6, -1, 38, 87, 108, -57, 112, -1};
        p = bArr5;
        a = agke.u(bArr, bArr2, bArr3, bArr4, bArr5);
        agkz agkzVarU = agkz.u(zlv.a, zlw.a, zlz.a, zly.a, zlx.a, zma.a, zmb.a, zmc.a, zmd.a, zmm.a, zmn.a, zmq.a, zmp.a, zms.a, zmo.a, zmr.a, zmw.a, zmx.a, zna.a, zmu.a, znb.a, znd.a);
        b = agkzVarU;
        agkx agkxVar = new agkx();
        agkxVar.j(agkzVarU);
        agkxVar.c(zmt.a);
        agkxVar.c(znc.a);
        c = agkxVar.g();
        agkz.q(zog.a, znv.a);
        d = new agqj(zmw.a);
        e = new agqj(zoj.a);
    }

    public hfx(Context context, vyo vyoVar, vxz vxzVar, vxz vxzVar2) {
        this.q = context;
        this.f = vyoVar;
        this.j = vxzVar;
        this.v = vxzVar2;
        this.r = kmm.a(context);
        b(c);
        c(b);
        d(d);
        f(a);
        e(e);
    }

    public static agkz a(Collection collection) {
        return (agkz) j$.util.Collection.EL.stream(collection).map(new bwa(15)).collect(aghu.b);
    }

    public static final void l(agkz agkzVar, agkz agkzVar2, Consumer consumer) {
        if (agkzVar.isEmpty()) {
            consumer.r(agkzVar2);
        } else {
            consumer.r(agkzVar);
        }
    }

    private final boolean m(zot zotVar) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            Signature[] signatureArrO = o(zotVar);
            if (signatureArrO == null || (signatureArrO.length) == 0) {
                return false;
            }
            for (Signature signature : signatureArrO) {
                try {
                    try {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getEncoded());
                        List list = this.u;
                        synchronized (list) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (Arrays.equals((byte[]) it.next(), bArrDigest)) {
                                    return true;
                                }
                            }
                        }
                    } catch (NoSuchAlgorithmException | CertificateEncodingException e2) {
                        ((agrc) ((agrc) ((agrc) k.b()).j(e2)).k("com/google/android/apps/youtube/music/mediabrowser/AllowlistManager", "isPartnerSHAFingerprint", (char) 484, "AllowlistManager.java")).w("Failed to generate SHA-256 hash of cert for %s", zotVar);
                        return false;
                    }
                } catch (CertificateException e3) {
                    ((agrc) ((agrc) ((agrc) k.b()).j(e3)).k("com/google/android/apps/youtube/music/mediabrowser/AllowlistManager", "isPartnerSHAFingerprint", (char) 474, "AllowlistManager.java")).w("Failed to get X509 certificate from stream for '%s'", zotVar);
                    return false;
                }
            }
            ((agrc) ((agrc) k.c()).k("com/google/android/apps/youtube/music/mediabrowser/AllowlistManager", "isPartnerSHAFingerprint", 499, "AllowlistManager.java")).w("No matching SHA-256 digest found for %s", zotVar);
            return false;
        } catch (CertificateException e4) {
            ((agrc) ((agrc) ((agrc) k.b()).j(e4)).k("com/google/android/apps/youtube/music/mediabrowser/AllowlistManager", "isPartnerSHAFingerprint", (char) 458, "AllowlistManager.java")).w("Failed to get certificate for '%s'", zotVar);
            return false;
        }
    }

    private final boolean n(zot zotVar) {
        Signature[] signatureArrO;
        Signature[] signatureArrO2 = o(zno.a);
        return (signatureArrO2 == null || signatureArrO2.length == 0 || (signatureArrO = o(zotVar)) == null || signatureArrO.length <= 0 || !signatureArrO2[0].equals(signatureArrO[0])) ? false : true;
    }

    private final Signature[] o(zot zotVar) {
        if (!zotVar.b()) {
            try {
                PackageManager packageManager = this.q.getPackageManager();
                if (Build.VERSION.SDK_INT < 28) {
                    return packageManager.getPackageInfo(zotVar.b, 64).signatures;
                }
                PackageInfo packageInfo = packageManager.getPackageInfo(zotVar.b, 134217728);
                if (packageInfo.signingInfo != null) {
                    return packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
                }
            } catch (PackageManager.NameNotFoundException e2) {
                if (!txz.d(this.q)) {
                    ((agrc) ((agrc) ((agrc) k.b()).j(e2)).k("com/google/android/apps/youtube/music/mediabrowser/AllowlistManager", "getSignatures", (char) 529, "AllowlistManager.java")).w("Failed to get package info for '%s'", zotVar);
                }
            }
        }
        return null;
    }

    public final void b(agkz agkzVar) {
        Set set = this.s;
        synchronized (set) {
            set.clear();
            set.addAll(agkzVar);
        }
    }

    public final void c(agkz agkzVar) {
        Set set = this.t;
        synchronized (set) {
            set.clear();
            set.addAll(agkzVar);
        }
    }

    public final void d(agkz agkzVar) {
        Set set = this.g;
        synchronized (set) {
            set.clear();
            set.addAll(agkzVar);
        }
    }

    public final void e(agkz agkzVar) {
        Set set = this.h;
        synchronized (set) {
            set.clear();
            set.addAll(agkzVar);
        }
    }

    public final void f(agke agkeVar) {
        List list = this.u;
        synchronized (list) {
            list.clear();
            list.addAll(agkeVar);
        }
    }

    public final boolean g(zot zotVar, zne zneVar, int i) {
        boolean zContains;
        String[] packagesForUid;
        if (this.v.l(26, 45811789L, false)) {
            if (!zotVar.b() && (packagesForUid = this.q.getPackageManager().getPackagesForUid(i)) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < packagesForUid.length) {
                        if (zotVar.a(packagesForUid[i2])) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            ((agrc) ((agrc) k.c()).k("com/google/android/apps/youtube/music/mediabrowser/AllowlistManager", "isAllowlistedForMediaBrowser", 258, "AllowlistManager.java")).A("isAllowlistedForMediaBrowser failed UID check. Package: %s, UID: %d", zotVar, i);
            return false;
        }
        if (zotVar.b() || (!j(zotVar) && ((Build.VERSION.SDK_INT < 30 || !zotVar.equals(znp.a) || !n(zotVar)) && !zotVar.a(this.q.getPackageName())))) {
            Set set = this.s;
            synchronized (set) {
                zContains = set.contains(zneVar);
            }
            if (!zContains) {
                return false;
            }
            if ((zotVar.b() || (!awrc.c(zotVar, znl.a) && !awrc.c(zotVar, znm.a))) && !this.r.b(zotVar.b) && !m(zotVar)) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(zne zneVar) {
        return i(zneVar) || j(zneVar.b());
    }

    public final boolean i(zne zneVar) {
        boolean zContains;
        Set set = this.t;
        synchronized (set) {
            zContains = set.contains(zneVar);
        }
        return zContains;
    }

    public final boolean j(zot zotVar) {
        Context context = this.q;
        return (context.getResources().getConfiguration().uiMode & 15) == 3 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && n(zotVar);
    }

    public final boolean k(zot zotVar) {
        boolean zContains;
        if (zotVar.b()) {
            return false;
        }
        Set set = this.h;
        synchronized (set) {
            zContains = set.contains(zotVar);
        }
        return zContains;
    }
}
