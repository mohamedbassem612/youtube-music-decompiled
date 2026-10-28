package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.StrictMode;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static /* synthetic */ int A(Object obj, Object obj2, Object obj3) {
        return (((Objects.hashCode(obj) * 31) + Objects.hashCode(obj2)) * 31) + Objects.hashCode(obj3);
    }

    public static /* synthetic */ int B(Object obj, Object obj2) {
        return (Objects.hashCode(obj) * 31) + Objects.hashCode(obj2);
    }

    public static /* synthetic */ int C(Object obj) {
        Objects.checkIndex(0, 4);
        if (obj instanceof pla) {
            return 0;
        }
        if (obj instanceof pld) {
            return 1;
        }
        return obj instanceof pkz ? 2 : -2;
    }

    public static /* synthetic */ int D(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj instanceof pla) {
            return 0;
        }
        return obj instanceof pku ? 1 : -2;
    }

    public static /* synthetic */ int E(acvm acvmVar) {
        Objects.checkIndex(0, 6);
        if (acvmVar instanceof acvh) {
            return 0;
        }
        if (acvmVar instanceof acvi) {
            return 1;
        }
        if (acvmVar instanceof acvl) {
            return 2;
        }
        if (acvmVar instanceof acvj) {
            return 3;
        }
        return acvmVar instanceof acvk ? 4 : -2;
    }

    public static /* synthetic */ Boolean F(Boolean bool, Boolean bool2) {
        boolean z = true;
        if (!bool.booleanValue() && !bool2.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ Boolean G(Boolean bool, Boolean bool2) {
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ int H(Object obj) {
        Objects.checkIndex(0, 5);
        if (obj instanceof abxk) {
            return 0;
        }
        if (obj instanceof abxo) {
            return 1;
        }
        if (obj instanceof abxj) {
            return 2;
        }
        return obj instanceof abxi ? 3 : -2;
    }

    public static /* synthetic */ aalx I(aaqk aaqkVar, abnl abnlVar) {
        int iA = abnlVar.a() != -1 ? abnlVar.a() : 0;
        List listB = aaqkVar.b(abnlVar);
        if (tym.C(iA, listB.size())) {
            return (aalx) listB.get(iA);
        }
        return null;
    }

    public static /* synthetic */ aahb J(weo weoVar) {
        wfn wfnVarC = wfs.c(weoVar.a);
        String str = wfnVarC.a;
        aaha aahaVarE = aahb.e();
        aahaVarE.b(str);
        aahaVarE.c(wfnVarC.b);
        aahaVarE.a = aahc.a(weoVar);
        aahaVarE.b = weoVar;
        return aahaVarE.a();
    }

    public static /* synthetic */ boolean K(List list) {
        return !list.isEmpty();
    }

    public static /* synthetic */ boolean L(akxc akxcVar) {
        int i = akxcVar.c;
        if (i > 0 && akxcVar.e >= i && akxcVar.d >= 1.0f) {
            float f = akxcVar.f;
            if (f >= 0.0f && f < 1.0f) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void M(CharSequence charSequence) {
        if (charSequence instanceof SpannableString) {
            SpannableString spannableString = (SpannableString) charSequence;
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class)) {
                spannableString.removeSpan(foregroundColorSpan);
            }
        }
    }

    public static /* synthetic */ String N(String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : agfm.d("[\\r\\n]+").f(str)) {
            if (str2.contains("Crypto-Period-Index") || str2.contains("Crypto-Period-Seconds")) {
                sb.append(str2);
                sb.append(';');
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ void O(View view) {
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public static /* synthetic */ int P(Class cls) {
        if (cls == OutOfMemoryError.class) {
            return 3;
        }
        if (NullPointerException.class.isAssignableFrom(cls)) {
            return 2;
        }
        if (RuntimeException.class.isAssignableFrom(cls)) {
            return 4;
        }
        return Error.class.isAssignableFrom(cls) ? 5 : 1;
    }

    public static /* synthetic */ agke Q(int i, int i2) {
        agjz agjzVar = new agjz(4);
        for (int i3 = 0; i3 < i; i3++) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = i2;
            agjzVar.h(aanoVar.a());
        }
        return agjzVar.g();
    }

    public static /* synthetic */ String R(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ",");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String S(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ", ");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ int T(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    public static /* synthetic */ boolean U(byte b) {
        return b > -65;
    }

    public static /* synthetic */ boolean V(byte b) {
        return b < -16;
    }

    public static /* synthetic */ boolean W(byte b) {
        return b < -32;
    }

    public static /* synthetic */ Field X(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Unsafe Y() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    public static /* synthetic */ int Z(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "SIMPLE";
            case 3:
                return "CHOICE";
            case 4:
                return "PLURAL";
            case 5:
                return "SELECT";
            case 6:
                return "SELECTORDINAL";
            default:
                return "null";
        }
    }

    public static /* synthetic */ boolean aA(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean aB(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ boolean aC() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean aD() {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static /* synthetic */ boolean aE() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void aF() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean aG(long j, int i) {
        if (j < -315576000000L || j > 315576000000L || i < -999999999 || i >= 1000000000) {
            return false;
        }
        return (j >= 0 && i >= 0) || (j <= 0 && i <= 0);
    }

    public static /* synthetic */ String aH(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static /* synthetic */ String aI(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "QUEUING";
        }
        if (i != 3) {
            return i != 4 ? "null" : "RUNNING";
        }
        return "QUEUED";
    }

    public static /* synthetic */ Application aJ(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(context))));
    }

    public static /* synthetic */ boolean aK() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static /* synthetic */ boolean aL() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static /* synthetic */ boolean aM() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static /* synthetic */ boolean aN() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static /* synthetic */ boolean aO() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static /* synthetic */ void aP(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ boolean aQ(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        ao(i, i4, bArr.length);
        ao(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static /* synthetic */ int aR(int i) {
        return (640 - (Long.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static /* synthetic */ int aS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int aT(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int aU(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int aV(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int aW(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int aX(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aY(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aZ(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (i != 5) {
                    return i != 7 ? 0 : 8;
                }
                return 6;
            }
        }
        return i2;
    }

    public static /* synthetic */ int aa(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static /* synthetic */ boolean ab(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean ac(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String ad(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean ae(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ Field af(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    public static /* synthetic */ boolean ag(int i) {
        return (i & 268435456) != 0;
    }

    public static /* synthetic */ String ah(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append('_');
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean ai(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static /* synthetic */ int aj(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ int ak(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ int al(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static /* synthetic */ Object am(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static /* synthetic */ boolean an(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    public static /* synthetic */ int ao(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(bP(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(bQ(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(bQ(i3, i2, "End index: ", " >= "));
    }

    public static /* synthetic */ boolean ap(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean aq(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void ar(ExecutorService executorService) {
        if (executorService == ForkJoinPool.commonPool() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void as(ExecutorService executorService) {
        if (executorService == ForkJoinPool.commonPool() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ int at() {
        return Build.VERSION.SDK_INT < 36 ? Build.VERSION.SDK_INT * 100000 : Build.VERSION.SDK_INT_FULL;
    }

    public static /* synthetic */ int au(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof pla) {
            return 0;
        }
        return obj instanceof pku ? 1 : -2;
    }

    public static /* synthetic */ boolean av(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void aw() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ int ax(Object obj) {
        Objects.checkIndex(0, 4);
        if (obj instanceof pxo) {
            return 0;
        }
        if (obj instanceof pxl) {
            return 1;
        }
        return obj instanceof pxn ? 2 : -2;
    }

    public static /* synthetic */ int ay(Object obj) {
        Objects.checkIndex(0, 5);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof abxk) {
            return 0;
        }
        if (obj instanceof abxo) {
            return 1;
        }
        if (obj instanceof abxj) {
            return 2;
        }
        return obj instanceof abxi ? 3 : -2;
    }

    public static /* synthetic */ boolean az(int i) {
        return i == 1 || i == 2;
    }

    public static boolean b(int i) {
        return i == 4 || i == 6;
    }

    static us bA(lvf lvfVar) {
        azs.l(lvfVar);
        ur urVar = new ur();
        urVar.a = lvfVar.queryLength_;
        urVar.b = lvfVar.numTerms_;
        urVar.c = lvfVar.numNamespacesFiltered_;
        urVar.d = lvfVar.numSchemaTypesFiltered_;
        int iBe = be(lvfVar.rankingStrategy_);
        if (iBe == 0) {
            iBe = 1;
        }
        urVar.e = iBe - 1;
        urVar.f = lvfVar.numDocumentsScored_;
        urVar.g = lvfVar.parseQueryLatencyMs_;
        urVar.h = lvfVar.scoringLatencyMs_;
        urVar.i = lvfVar.isNumericQuery_;
        urVar.j = lvfVar.numFetchedHitsLiteIndex_;
        urVar.k = lvfVar.numFetchedHitsMainIndex_;
        urVar.l = lvfVar.numFetchedHitsIntegerIndex_;
        urVar.m = lvfVar.queryProcessorLexerExtractTokenLatencyMs_;
        urVar.n = lvfVar.queryProcessorParserConsumeQueryLatencyMs_;
        urVar.o = lvfVar.queryProcessorQueryVisitorLatencyMs_;
        urVar.p = lvfVar.numUnquantizedEmbeddingsScored_;
        urVar.q = lvfVar.numQuantizedEmbeddingsScored_;
        urVar.r = lvfVar.numEmbeddingShardsRead_;
        urVar.s = lvfVar.numEmbeddingBytesRead_;
        urVar.t = lvfVar.numAnnEmbeddingsScored_;
        return new us(urVar);
    }

    public static void bB(lvg lvgVar, un unVar) {
        azs.l(lvgVar);
        unVar.h = lvgVar.isFirstPage_;
        unVar.j = lvgVar.requestedPageSize_;
        unVar.k = lvgVar.numResultsReturnedCurrentPage_;
        unVar.m = lvgVar.latencyMs_;
        unVar.p = lvgVar.rankingLatencyMs_;
        unVar.q = lvgVar.documentRetrievalLatencyMs_;
        unVar.r = lvgVar.numResultsWithSnippets_;
        unVar.s = lvgVar.lockAcquisitionLatencyMs_;
        unVar.t = lvgVar.javaToNativeJniLatencyMs_;
        unVar.u = lvgVar.nativeToJavaJniLatencyMs_;
        unVar.v = lvgVar.joinLatencyMs_;
        unVar.w = lvgVar.numJoinedResultsReturnedCurrentPage_;
        lvf lvfVar = lvgVar.parentSearchStats_;
        if (lvfVar == null) {
            lvfVar = lvf.DEFAULT_INSTANCE;
        }
        unVar.y = bA(lvfVar);
        lvf lvfVar2 = lvgVar.childSearchStats_;
        if (lvfVar2 == null) {
            lvfVar2 = lvf.DEFAULT_INSTANCE;
        }
        unVar.z = bA(lvfVar2);
        unVar.A = lvgVar.liteIndexHitBufferByteSize_;
        unVar.B = lvgVar.liteIndexHitBufferUnsortedByteSize_;
        unVar.C = lvgVar.b() - 1;
        unVar.D = lvgVar.numResultStatesEvicted_;
    }

    public static ListenableFuture bC(esn esnVar) {
        etf etfVar = new etf();
        try {
            fea feaVarP = esnVar.a(etfVar).p();
            synchronized (etfVar) {
                etfVar.a = feaVarP;
            }
            if (etfVar.isCancelled()) {
                feaVarP.cancel(etfVar.m());
            }
        } catch (RuntimeException e) {
            etfVar.setException(e);
        }
        return ahcs.e(etfVar, new vem(1), ffk.b);
    }

    public static eqn bD(Context context) {
        eqn eqnVar = new eqn(new und(new ere(context.getApplicationContext())), new kyr(new a()));
        epy epyVar = eqnVar.e;
        if (epyVar != null) {
            epyVar.a();
        }
        eqd[] eqdVarArr = eqnVar.d;
        for (int i = 0; i < 4; i++) {
            eqd eqdVar = eqdVarArr[i];
            if (eqdVar != null) {
                eqdVar.a = true;
                eqdVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = eqnVar.b;
        PriorityBlockingQueue priorityBlockingQueue2 = eqnVar.c;
        und undVar = eqnVar.g;
        elq elqVar = eqnVar.h;
        eqnVar.e = new epy(priorityBlockingQueue, priorityBlockingQueue2, undVar, elqVar);
        eqnVar.e.start();
        for (int i2 = 0; i2 < 4; i2++) {
            eqd eqdVar2 = new eqd(priorityBlockingQueue2, eqnVar.i, undVar, elqVar);
            eqdVarArr[i2] = eqdVar2;
            eqdVar2.start();
        }
        return eqnVar;
    }

    public static long bE(String str) {
        try {
            return bG("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                String str2 = eqw.a;
            } else {
                eqw.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static epx bF(eqf eqfVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r3 = eqfVar.c;
        if (r3 != 0) {
            String str = (String) r3.get("Date");
            long jBE = str != null ? bE(str) : 0L;
            String str2 = (String) r3.get("Cache-Control");
            int i = 0;
            if (str2 != null) {
                String[] strArrSplit = str2.split(",", 0);
                z = false;
                j2 = 0;
                j3 = 0;
                while (i < strArrSplit.length) {
                    String strTrim = strArrSplit[i].trim();
                    if (!strTrim.equals("no-cache") && !strTrim.equals("no-store")) {
                        if (strTrim.startsWith("max-age=")) {
                            try {
                                j3 = Long.parseLong(strTrim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (strTrim.startsWith("stale-while-revalidate=")) {
                            j2 = Long.parseLong(strTrim.substring(23));
                        } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                            z = true;
                        }
                        i++;
                    }
                }
                j = 0;
                i = 1;
            } else {
                j = 0;
                z = false;
                j2 = 0;
                j3 = 0;
            }
            String str3 = (String) r3.get("Expires");
            long jBE2 = str3 != null ? bE(str3) : j;
            String str4 = (String) r3.get("Last-Modified");
            long jBE3 = str4 != null ? bE(str4) : j;
            String str5 = (String) r3.get("ETag");
            if (i != 0) {
                long j6 = (j3 * 1000) + jCurrentTimeMillis;
                if (z) {
                    j5 = j6;
                } else {
                    Long.signum(j2);
                    j5 = (j2 * 1000) + j6;
                }
                j4 = j6;
            } else {
                j4 = (jBE <= j || jBE2 < jBE) ? j : (jBE2 - jBE) + jCurrentTimeMillis;
                j5 = j4;
            }
            epx epxVar = new epx();
            epxVar.a = (byte[]) eqfVar.b;
            epxVar.b = str5;
            epxVar.f = j4;
            epxVar.e = j5;
            epxVar.c = jBE;
            epxVar.d = jBE3;
            epxVar.g = r3;
            epxVar.h = eqfVar.d;
            return epxVar;
        }
        return null;
    }

    public static SimpleDateFormat bG(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static List bH(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new eqc((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void bI(HttpURLConnection httpURLConnection, eqk eqkVar, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", eqkVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static final void bJ(HttpURLConnection httpURLConnection, eqk eqkVar) {
        byte[] body = eqkVar.getBody();
        if (body != null) {
            bI(httpURLConnection, eqkVar, body);
        }
    }

    public static long bK(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    public static Pair bL(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            long jCapacity = length - ((long) byteBufferAllocate.capacity());
            randomAccessFile.seek(jCapacity);
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            hmy.d(byteBufferAllocate);
            int iCapacity = byteBufferAllocate.capacity();
            if (iCapacity < 22) {
                i2 = -1;
                break;
            }
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= iMin) {
                    i2 = -1;
                    break;
                }
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
            if (i2 != -1) {
                byteBufferAllocate.position(i2);
                ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i2)));
            }
        }
        return null;
    }

    public static X509Certificate[][] bM(FileChannel fileChannel, epp eppVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferCx = cx(eppVar.a);
                int i = 0;
                while (byteBufferCx.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(cA(cx(byteBufferCx), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(bP(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                cy(map, fileChannel, eppVar.b, eppVar.c, eppVar.d, eppVar.e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    public static final String bN(Context context, int i, Object... objArr) {
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(i);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i2 = l.d;
            StringBuilder sb = new StringBuilder(string.length());
            new l(string, locale).b(0, null, null, null, objArr, new avju(sb), null);
            return sb.toString();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static ListenableFuture bO(epi epiVar) {
        epg epgVar = new epg();
        epk epkVar = new epk(epgVar);
        epgVar.b = epkVar;
        epgVar.a = epiVar.getClass();
        try {
            epgVar.a = epiVar.a(epgVar);
        } catch (Exception e) {
            epkVar.a(e);
        }
        return epkVar;
    }

    public static /* synthetic */ String bP(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String bQ(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String bR(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String bS(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String bT(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String bU(byte b, String str, String str2) {
        return str2 + str + ((char) b);
    }

    public static /* synthetic */ String bV(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String bW(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String bX(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static /* synthetic */ String bY(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String bZ(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ int ba(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static /* synthetic */ int bb(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        int i2 = 4;
        if (i != 3) {
            if (i == 4) {
                return 5;
            }
            i2 = 6;
            if (i != 5) {
                return i != 6 ? 0 : 7;
            }
        }
        return i2;
    }

    public static /* synthetic */ int bc(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                return i != 4 ? 0 : 5;
            }
        }
        return i2;
    }

    public static /* synthetic */ int bd(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int be(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bf(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bg(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bh(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bi(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void bj(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int bk(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 4) * size;
    }

    public static /* synthetic */ int bl(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 8) * size;
    }

    public static /* synthetic */ int bm(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static /* synthetic */ int bn(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + aR(i2);
    }

    public static /* synthetic */ int bo(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros((i2 << 1) ^ (i2 >> 31)) * 9)) >>> 6);
    }

    public static /* synthetic */ int bp(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros((j << 1) ^ (j >> 63)) * 9)) >>> 6);
    }

    public static /* synthetic */ int bq(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6);
    }

    public static /* synthetic */ int br(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static /* synthetic */ Object bs() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ int bt(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i != 4) {
                    return i != 5 ? 0 : 6;
                }
                return 5;
            }
        }
        return i2;
    }

    public static /* synthetic */ Object bu(Object obj) {
        audc audcVar = (audc) obj;
        switch (audcVar.ordinal()) {
            case 0:
                return apsd.SFV_EFFECT_SURFACE_UNKNOWN;
            case 1:
                return apsd.SFV_EFFECT_SURFACE_CAMERA;
            case 2:
                return apsd.SFV_EFFECT_SURFACE_EDITOR;
            case 3:
                return apsd.SFV_EFFECT_SURFACE_RECOMPOSITION;
            case 4:
                return apsd.SFV_EFFECT_SURFACE_EXPORT_SESSION;
            case 5:
                return apsd.SFV_EFFECT_SURFACE_UPLOAD_TRANSCODE;
            case 6:
                return apsd.SFV_EFFECT_SURFACE_AUDIO_UPLOAD_TRANSCODE;
            case 7:
                return apsd.SFV_EFFECT_SURFACE_CLIP_TRIM;
            case 8:
                return apsd.SFV_EFFECT_SURFACE_DENOISE;
            case 9:
                return apsd.SFV_EFFECT_SURFACE_MEDIAGEN;
            case 10:
                return apsd.SFV_EFFECT_SURFACE_LICENSED_MUSIC_TRANSMUX;
            case 11:
                return apsd.SFV_EFFECT_SURFACE_VIDEO_REVERSE;
            case 12:
                return apsd.SFV_EFFECT_SURFACE_IMPORT;
            case 13:
                return apsd.SFV_EFFECT_SURFACE_EDITOR_SAVE_TO_DEVICE;
            case 14:
                return apsd.SFV_EFFECT_SURFACE_AI_MONTAGE_PREPROCESS;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(audcVar.toString()));
        }
    }

    public static /* synthetic */ Object bv(Object obj) {
        audb audbVar = (audb) obj;
        switch (audbVar.ordinal()) {
            case 0:
                return apsc.SFV_EFFECT_CLIENT_UNKNOWN;
            case 1:
                return apsc.SFV_EFFECT_CLIENT_MDE_SHORTS_EFFECTS;
            case 2:
                return apsc.SFV_EFFECT_CLIENT_MDE_XENO_IN_EDITOR;
            case 3:
                return apsc.SFV_EFFECT_CLIENT_MDE_AUDIO;
            case 4:
                return apsc.SFV_EFFECT_CLIENT_MDE_PRODUCER;
            case 5:
                return apsc.SFV_EFFECT_CLIENT_MDE_SHORTS_CREATION;
            case 6:
                return apsc.SFV_EFFECT_CLIENT_MDE_LIVE;
            case 7:
                return apsc.SFV_EFFECT_CLIENT_MDE_IMAGE_EDITOR;
            case 8:
                return apsc.SFV_EFFECT_CLIENT_MDE_IMAGE_EDITOR_ON_MUSIC;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(audbVar.toString()));
        }
    }

    public static /* synthetic */ anmd bw(auiu auiuVar) {
        aihf aihfVarCreateBuilder = anmd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar = (anmd) aihfVarCreateBuilder.instance;
        anmdVar.b |= 1;
        anmdVar.c = auiuVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar2 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar2.b |= 2;
        anmdVar2.d = auiuVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar3 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar3.b |= 4;
        anmdVar3.e = auiuVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar4 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar4.b |= 8;
        anmdVar4.f = auiuVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar5 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar5.b |= 16;
        anmdVar5.g = auiuVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar6 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar6.b |= 32;
        anmdVar6.h = auiuVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar7 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar7.b |= 64;
        anmdVar7.i = auiuVar.g;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar8 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar8.b |= SemanticState.Focused;
        anmdVar8.j = auiuVar.h;
        return (anmd) aihfVarCreateBuilder.build();
    }

    public static /* synthetic */ int bx(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | SemanticState.Focused);
                i7 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 <= i3 - 4) {
                        i6++;
                        if (i6 != str.length()) {
                            char cCharAt3 = str.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i8 = i7 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | SemanticState.Focused);
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | SemanticState.Focused);
                                i7 += 4;
                                bArr[i8] = (byte) ((codePoint & 63) | SemanticState.Focused);
                            }
                        }
                    } else if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i4 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                        throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                    }
                    return T(str, bArr, i, i2);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | SemanticState.Focused);
                bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | SemanticState.Focused);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    public static /* synthetic */ void by(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static int bz(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 4) {
            return 6;
        }
        switch (i2) {
            case 7:
                return 2;
            case 8:
                return 5;
            case 9:
                return 12;
            case 10:
                return 14;
            default:
                Log.e("AppSearchResultCodeToPr", "Cannot convert IcingSearchEngine status code: " + ((Object) ixt.P(i)) + " to AppSearchResultCode.");
                return 2;
        }
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    private static X509Certificate[] cA(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferCx = cx(byteBuffer);
        ByteBuffer byteBufferCx2 = cx(byteBuffer);
        byte[] bArrCz = cz(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrCz2 = null;
        byte[] bArrCz3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferCx2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferCx3 = cx(byteBufferCx2);
                if (byteBufferCx3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferCx3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iCv = cv(i3);
                    int iCv2 = cv(i);
                    if (iCv == 1 || iCv2 != 1) {
                    }
                }
                bArrCz3 = cz(byteBufferCx3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(bR(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrCz));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferCx);
            if (!signature.verify(bArrCz3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferCx.clear();
            ByteBuffer byteBufferCx4 = cx(byteBufferCx);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferCx4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferCx5 = cx(byteBufferCx4);
                    if (byteBufferCx5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferCx5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrCz2 = cz(byteBufferCx5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(bR(i4, "Failed to parse digest record #"), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iCv3 = cv(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iCv3), bArrCz2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrCz2)) {
                throw new SecurityException(cw(iCv3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferCx6 = cx(byteBufferCx);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferCx6.hasRemaining()) {
                i6++;
                byte[] bArrCz4 = cz(byteBufferCx6);
                try {
                    arrayList3.add(new epr((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrCz4)), bArrCz4));
                } catch (CertificateException e3) {
                    throw new SecurityException(bR(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrCz, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(bT(str2, "Failed to verify ", " signature"), e4);
        }
    }

    private static byte[][] cB(int[] iArr, epn[] epnVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2 = 0;
        long jA = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            jA += (epnVarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (jA >= 2097151) {
            throw new DigestException(bS(jA, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) jA;
            byte[] bArr2 = new byte[(cu(iArr[i3]) * i4) + 5];
            bArr2[0] = 90;
            cC(i4, bArr2);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String strCw = cw(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(strCw);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strCw.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            epn epnVar = epnVarArr[i6];
            int i9 = i6;
            long jA2 = epnVar.a();
            long j2 = 0;
            while (jA2 > 0) {
                char c2 = c;
                int i10 = i7;
                int iMin = (int) Math.min(jA2, j);
                cC(iMin, bArr3);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                try {
                    epnVar.b(messageDigestArr, j2, iMin);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int iCu = cu(i13);
                        epn epnVar2 = epnVar;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        long j3 = jA2;
                        int iDigest = messageDigest.digest(bArr4, (i10 * iCu) + 5, iCu);
                        if (iDigest != iCu) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i12++;
                        epnVar = epnVar2;
                        jA2 = j3;
                    }
                    epn epnVar3 = epnVar;
                    long j4 = iMin;
                    j2 += j4;
                    i7 = i10 + 1;
                    jA2 -= j4;
                    c = c2;
                    epnVar = epnVar3;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(bQ(i8, i10, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr6 = bArr[i14];
            String strCw2 = cw(i15);
            try {
                bArr5[i14] = MessageDigest.getInstance(strCw2).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strCw2.concat(" digest not supported"), e3);
            }
        }
        return bArr5;
    }

    private static void cC(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static /* synthetic */ String ca(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String cc(Object obj, Object obj2, String str, String str2) {
        return str + obj2.toString() + str2 + obj.toString();
    }

    public static /* synthetic */ String cd(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String ce(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String cf(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ String cg(int i, String str, String str2, String str3) {
        return str2 + str + str3 + i;
    }

    public static /* synthetic */ String ch(byte b, String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str + ((char) b);
    }

    public static /* synthetic */ String ci(byte b, int i, String str) {
        return str + i + ((char) b);
    }

    public static /* synthetic */ String cj(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String ck(int i, int i2, String str, String str2, byte b) {
        return str + i2 + str2 + i + ((char) b);
    }

    public static /* synthetic */ String cl(String str, byte b, String str2) {
        return str2 + ((char) b) + str;
    }

    public static /* synthetic */ String cn(byte b, Object obj, String str) {
        return str + obj.toString() + ((char) b);
    }

    public static /* synthetic */ String co(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String cp(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String cr(long j, long j2, String str, String str2) {
        return str + j2 + str2 + j;
    }

    public static /* synthetic */ String cs(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String ct(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    private static int cu(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(bR(i, "Unknown content digest algorthm: "));
    }

    private static int cv(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            break;
                        case 258:
                        case 260:
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    private static String cw(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(bR(i, "Unknown content digest algorthm: "));
    }

    private static ByteBuffer cx(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return hmy.e(byteBuffer, i);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    private static void cy(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        epo epoVar = new epo(fileChannel, 0L, j);
        epo epoVar2 = new epo(fileChannel, j2, j3 - j2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        hmy.d(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(bS(j, "uint32 value of out range: "));
        }
        byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
        epm epmVar = new epm(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrCB = cB(iArr, new epn[]{epoVar, epoVar2, epmVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bArrCB[i2])) {
                    throw new SecurityException(cw(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] cz(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    public static /* synthetic */ long d(long j, long j2) {
        int i = ((j ^ j2) > 0L ? 1 : ((j ^ j2) == 0L ? 0 : -1));
        long j3 = j2 + j;
        if ((i | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ boolean e(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 < i2 && b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b >= -16) {
                    if (i3 < i2 - 2) {
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i + 3;
                            if (bArr[i4] <= -65) {
                                i += 4;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i3 < i2 - 1) {
                    int i6 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i += 3;
                        if (bArr[i6] > -65) {
                        }
                    }
                }
                return false;
            }
            i = i3;
        }
        return true;
    }

    public static /* synthetic */ long f(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static /* synthetic */ String g(ahnr ahnrVar) {
        String str = ahnrVar.e().c;
        if (str != null) {
            return str;
        }
        String str2 = ahnrVar.e().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length >= 2) {
            String str3 = strArrSplit[1];
            if (!str3.isEmpty()) {
                return str3;
            }
        }
        return null;
    }

    public static /* synthetic */ byte[] h(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
            i2 -= iMin;
        }
        return bArrCopyOf;
    }

    public static /* synthetic */ Object i(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ Unsafe j() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static /* synthetic */ ListenableFuture k(awqg awqgVar, Object obj) {
        return (ListenableFuture) awqgVar.invoke(obj);
    }

    public static /* synthetic */ PorterDuff.Mode l(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ Boolean m(awqg awqgVar, Object obj) {
        obj.getClass();
        return (Boolean) awqgVar.invoke(obj);
    }

    public static /* synthetic */ boolean n(awqg awqgVar, Object obj) {
        obj.getClass();
        return ((Boolean) awqgVar.invoke(obj)).booleanValue();
    }

    public static /* synthetic */ int p(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ List q(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            arrayList.add(Pair.create(str, bundle.getString(str, "")));
        }
        return arrayList;
    }

    public static /* synthetic */ aslz r() {
        aihf aihfVarCreateBuilder = aslz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aslz aslzVar = (aslz) aihfVarCreateBuilder.instance;
        aslzVar.c = 0;
        aslzVar.b |= 1;
        return (aslz) aihfVarCreateBuilder.build();
    }

    public static /* synthetic */ Activity t(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static /* synthetic */ String u(Object[] objArr, Class cls) {
        return cls.getSimpleName() + "[]";
    }

    public static /* synthetic */ int v(Object obj) {
        Objects.checkIndex(0, 6);
        if (obj instanceof pxo) {
            return 0;
        }
        if (obj instanceof pxl) {
            return 1;
        }
        if (obj instanceof pxn) {
            return 2;
        }
        if (obj instanceof pyd) {
            return 3;
        }
        return obj instanceof pyb ? 4 : -2;
    }

    public static /* synthetic */ boolean w(weo weoVar) {
        return weoVar.c != null;
    }

    public static /* synthetic */ boolean x() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static /* synthetic */ boolean y(Duration duration) {
        return (duration.isZero() || duration.isNegative()) ? false : true;
    }

    public static /* synthetic */ axso z(awqg awqgVar, Object obj) {
        obj.getClass();
        return (axso) awqgVar.invoke(obj);
    }
}
