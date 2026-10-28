package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.util.LongSparseArray;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.functions.Function0;
import libcore.io.Memory;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elq {
    public static elq b;
    public static elq c;
    public final Object a;

    public elq(Context context) throws Throwable {
        MemoryMappedBuffer memoryMappedBuffer = null;
        try {
            File file = new File(context.getFilesDir(), "delayed_events");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "des_payload_counters.bin");
            MemoryMappedBuffer memoryMappedBuffer2 = new MemoryMappedBuffer(file2, 8008);
            txb txbVarD = memoryMappedBuffer2.d();
            txb txbVar = txb.a;
            if (txbVarD != txbVar) {
                Log.w("DesCounters", "Initial buffer load failed, attempting to recreate file.");
                if (file2.exists()) {
                    file2.delete();
                }
                txbVarD = memoryMappedBuffer2.d();
            }
            if (txbVarD == txbVar) {
                if (Memory.peekLong(memoryMappedBuffer2.f, false) != memoryMappedBuffer2.a(8, 8000)) {
                    Log.w("DesCounters", "Checksum mismatch, zeroing counter data.");
                    memoryMappedBuffer2.n(0, 8008);
                }
                memoryMappedBuffer = memoryMappedBuffer2;
            } else {
                Log.e("DesCounters", "Unrecoverable: Failed to load MmapBuffer even after recreation attempt.");
            }
        } catch (RuntimeException e) {
            Log.e("DesCounters", "Unrecoverable exception during MmapBuffer initialization", e);
        }
        this.a = memoryMappedBuffer;
    }

    public static elq G(elr elrVar) {
        if (elrVar != null) {
            return new elq(elrVar);
        }
        return null;
    }

    public static final yno H(elq elqVar) {
        try {
            ((RequestFinishedInfo) elqVar.a).getMetrics();
        } catch (UnsupportedOperationException unused) {
        }
        return new yno((byte[]) null);
    }

    private static String I(String str, int i) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    private final List J(oys oysVar) {
        String str;
        int i;
        List listSingletonList;
        bwb bwbVar = new bwb((byte[]) oysVar.e);
        ?? arrayList = this.a;
        while (bwbVar.d() > 0) {
            int iN = bwbVar.n();
            int iN2 = bwbVar.c + bwbVar.n();
            if (iN == 134) {
                arrayList = new ArrayList();
                int iN3 = bwbVar.n() & 31;
                for (int i2 = 0; i2 < iN3; i2++) {
                    String strC = bwbVar.C(3);
                    int iN4 = bwbVar.n();
                    boolean z = (iN4 & SemanticState.Focused) != 0;
                    if (z) {
                        i = iN4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bA = bwbVar.a();
                    bwbVar.Q(1);
                    if (z) {
                        int i3 = bA & 64;
                        byte[] bArr = bvf.a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    bsd bsdVar = new bsd();
                    bsdVar.e(str);
                    bsdVar.d = strC;
                    bsdVar.M = i;
                    bsdVar.r = listSingletonList;
                    arrayList.add(new bse(bsdVar));
                }
            }
            bwbVar.P(iN2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public static String c(String str, elp elpVar, boolean z) {
        String strConcat = z ? ".temp".concat(String.valueOf(elpVar.d)) : elpVar.d;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = I(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strConcat;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void A(MessageLite messageLite) {
        this.a.put(messageLite, Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean B(MessageLite messageLite) {
        return this.a.containsKey(messageLite);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final agcg C() {
        Object objIo = this.a.io();
        objIo.getClass();
        return new agcg(objIo);
    }

    public final kwq D(oys oysVar) {
        return new kwq(J(oysVar));
    }

    public final elq E(String str, agkz agkzVar) {
        return G(((abxv) this.a).A(agkzVar, str, true));
    }

    public final elq F(String str, agkz agkzVar) {
        return G(((abxv) this.a).A(agkzVar, str, false));
    }

    public final File a() {
        File file = new File(((Context) ((qcb) this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, elp elpVar) throws IOException {
        File file = new File(a(), c(str, elpVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[SemanticState.ReadOnly];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void d(eqk eqkVar, equ equVar) {
        eqkVar.addMarker("post-error");
        this.a.execute(new eqb(eqkVar, new eqq(equVar), (Runnable) null, 0));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void e(eqk eqkVar, eqq eqqVar, Runnable runnable) {
        eqkVar.markDelivered();
        eqkVar.addMarker("post-response");
        this.a.execute(new eqb(eqkVar, eqqVar, runnable, 0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void f(fhx fhxVar) {
        this.a.add(fhxVar);
    }

    public final dep g(oys oysVar) {
        return new dep(J(oysVar));
    }

    public final void h(String str, Bundle bundle) {
        ldr ldrVar = (ldr) this.a;
        ldrVar.aT().k.b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
        bundle.putString("_cis", "referrer API v2");
        ldrVar.i().ag("_cmp", bundle, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    public final boolean i() {
        boolean z = false;
        try {
            Object obj = this.a;
            kjc kjcVarB = kte.b(((ldr) obj).a);
            if (kjcVarB == null) {
                ((ldr) obj).aT().k.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                this = this;
            } else {
                int i = kjcVarB.g("com.android.vending", SemanticState.Focused).versionCode;
                this = i;
                if (i >= 80837300) {
                    z = true;
                    this = i;
                }
            }
        } catch (Exception e) {
            ((ldr) this.a).aT().k.b("Failed to retrieve Play Store version for Install Referrer", e);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Class j(ktq ktqVar) {
        return (Class) this.a.get(ktqVar);
    }

    public final void k(int i) {
        Object obj = this.a;
        Object obj2 = ((kys) obj).b;
        synchronized (obj2) {
            long j = i;
            long[] jArr = (long[]) ((LongSparseArray) obj2).get(j);
            if (jArr == null) {
                return;
            }
            long j2 = jArr[0] - 1;
            jArr[0] = j2;
            if (j2 <= 0) {
                ((LongSparseArray) obj2).delete(j);
            } else {
                long j3 = ((kys) obj).a + 1;
                ((kys) obj).a = j3;
                jArr[1] = j3;
            }
        }
    }

    public final synchronized void l(alot alotVar) {
        Object obj = this.a;
        if (obj == null || alotVar == alot.PAYLOAD_NOT_SET) {
            return;
        }
        try {
            int i = alotVar.jH << 3;
            long j = ((MemoryMappedBuffer) obj).f;
            long j2 = ((long) (i + 8)) + j;
            long jPeekLong = Memory.peekLong(j2, false);
            long jPeekLong2 = Memory.peekLong(j, false);
            Memory.pokeLong(j2, jPeekLong + 1, false);
            Memory.pokeLong(((MemoryMappedBuffer) obj).f, jPeekLong2 + 1, false);
        } catch (RuntimeException unused) {
        }
    }

    public final void m(Function0 function0) {
        if (!a.x()) {
            ape.f(new dzx(this, function0, 5));
            return;
        }
        try {
            function0.invoke();
            ListenableFuture listenableFuture = aher.a;
        } catch (Throwable th) {
            ahng.m(th);
        }
    }

    public final int n(long j) {
        elr elrVar = (elr) this.a;
        boolean z = false;
        if (j < elrVar.H()[0]) {
            return 0;
        }
        int iAn = bwp.an(elrVar.H(), j, true);
        if (iAn >= 0 && iAn < elrVar.E()) {
            z = true;
        }
        zkf.c(z);
        return iAn + 1;
    }

    public final int o(long j) {
        elr elrVar = (elr) this.a;
        int iD = elrVar.D(j);
        boolean z = false;
        if (iD >= 0 && iD < elrVar.E()) {
            z = true;
        }
        zkf.c(z);
        return iD + 1;
    }

    public final int p() {
        return ((elr) this.a).E();
    }

    public final int q(int i) {
        boolean z = false;
        if (i > 0 && i <= p()) {
            z = true;
        }
        zkf.a(z);
        return ((elr) this.a).F()[i - 1];
    }

    public final long r(int i) {
        boolean z = false;
        if (i > 0 && i <= p()) {
            z = true;
        }
        zkf.a(z);
        return ((elr) this.a).G()[i - 1];
    }

    public final long s(int i) {
        boolean z = false;
        if (i > 0 && i <= p()) {
            z = true;
        }
        zkf.a(z);
        return ((elr) this.a).H()[i - 1];
    }

    public final long t(int i) {
        boolean z = false;
        if (i > 0 && i <= p()) {
            z = true;
        }
        zkf.a(z);
        return ((elr) this.a).I()[i - 1];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final twp u() {
        return (twp) this.a.get(0);
    }

    public final acip v(acip acipVar) {
        if (w()) {
            return acipVar;
        }
        return null;
    }

    public final boolean w() {
        return ((vxz) this.a).l(240, 45817480L, false);
    }

    public final acga x(acip acipVar) {
        acip acipVarV;
        if (acipVar == null || (acipVarV = v(acipVar)) == null) {
            return null;
        }
        return acipVarV.bq();
    }

    public final boolean y(String str, String str2) {
        if (str != null && str.length() > 100) {
            return false;
        }
        if (str2 != null) {
            if (str2.length() > 200) {
                return false;
            }
            if (str2.length() != 0 && !str2.equals(".*")) {
                if (str == null) {
                    return false;
                }
                if (!str.equals(str2)) {
                    Pattern patternCompile = (Pattern) ((HashMap) this.a).get(str2);
                    if (patternCompile == null) {
                        try {
                            patternCompile = Pattern.compile(str2);
                            ((HashMap) this.a).put(str2, patternCompile);
                        } catch (PatternSyntaxException unused) {
                            return false;
                        }
                    }
                    return patternCompile.matcher(str).matches();
                }
            }
        }
        return true;
    }

    public final void z(int i, int i2, boolean z, String str) {
        agrx agrxVar = agso.a;
        if (i2 == 0) {
            throw null;
        }
        aihf aihfVarCreateBuilder = amwv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amwv amwvVar = (amwv) aihfVarCreateBuilder.instance;
        amwvVar.c = i - 1;
        amwvVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amwv amwvVar2 = (amwv) aihfVarCreateBuilder.instance;
        amwvVar2.d = i2 - 1;
        amwvVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        amwv amwvVar3 = (amwv) aihfVarCreateBuilder.instance;
        amwvVar3.b |= 8;
        amwvVar3.e = z;
        aihfVarCreateBuilder.copyOnWrite();
        amwv amwvVar4 = (amwv) aihfVarCreateBuilder.instance;
        amwvVar4.b |= 16;
        amwvVar4.f = str;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MDX_BACKGROUND_PLAYBACK_REQUEST_COMPLETED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amwv amwvVar5 = (amwv) aihfVarCreateBuilder.build();
        amwvVar5.getClass();
        alouVar.d = amwvVar5;
        alouVar.c = 92;
        xeuVar.b((alou) alosVar.build());
    }

    public elq(Object obj) {
        this.a = obj;
    }

    public elq(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public elq(lfv lfvVar) {
        this.a = lfvVar.j;
    }

    public elq(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new aqv(6);
    }

    public elq() {
        this.a = new ArrayDeque();
    }

    public elq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public elq(short[] sArr) {
        this.a = new ArrayList();
    }

    public elq(aunn aunnVar, aunn aunnVar2) {
        aunnVar.getClass();
        aunnVar2.getClass();
        this.a = aunnVar;
    }

    public elq(fgy fgyVar) {
        this.a = new ArrayList();
        fgyVar.c();
        f(new fhx(System.currentTimeMillis(), 0L));
    }

    public elq(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public elq(Handler handler) {
        this.a = new cck(handler, 6, null);
    }

    public elq(vxz vxzVar) {
        vxzVar.getClass();
        this.a = vxzVar;
    }

    public elq(char[] cArr, byte[] bArr) {
        this.a = new kys();
    }

    public elq(char[] cArr) {
        this.a = new HashMap();
    }

    public elq(Class cls, Context context, Parcelable parcelable) throws ktp {
        try {
            this.a = cls.getDeclaredConstructor(Context.class, Parcelable.class).newInstance(context, parcelable);
        } catch (Exception e) {
            throw new ktp(e);
        }
    }

    public elq(RequestFinishedInfo requestFinishedInfo) {
        this.a = requestFinishedInfo;
        atqp.k(2, new zqe(this, 8));
        atqp.k(2, new zqe(this, 9));
    }

    public elq(UrlResponseInfo urlResponseInfo) {
        this.a = urlResponseInfo;
        atqp.k(2, new zqe(this, 10));
        atqp.k(2, new zqe(this, 11));
    }
}
