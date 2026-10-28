package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.math.RoundingMode;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ahng {
    private ahng() {
    }

    public static void A(int i, Object obj) {
        if (i - 1 == 0 && ahdm.b) {
            Reference.reachabilityFence(obj);
        }
    }

    public static Duration B(int i) {
        return C(i);
    }

    public static Duration C(long j) {
        Duration durationOfMillis = Duration.ofMillis(j);
        durationOfMillis.getClass();
        return durationOfMillis;
    }

    public static Duration D(int i) {
        Duration durationOfMinutes = Duration.ofMinutes(i);
        durationOfMinutes.getClass();
        return durationOfMinutes;
    }

    public static Duration E(int i) {
        Duration durationOfSeconds = Duration.ofSeconds(i);
        durationOfSeconds.getClass();
        return durationOfSeconds;
    }

    public static ahbw F() {
        return ahbv.INSTANCE;
    }

    public static int G(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static long H(long... jArr) {
        long j = jArr[0];
        for (int i = 1; i < 3; i++) {
            long j2 = jArr[i];
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public static long[] I(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        long[] jArr3 = new long[afxw.N(length)];
        int i = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i, length2);
            i += length2;
        }
        return jArr3;
    }

    public static long[] J(Collection collection) {
        if (collection instanceof ahbs) {
            ahbs ahbsVar = (ahbs) collection;
            return Arrays.copyOfRange(ahbsVar.a, ahbsVar.b, ahbsVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }

    public static int K(long j) {
        int i = (int) j;
        ahno.J(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int L(int i, int i2, int i3) {
        ahno.L(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        ahno.L(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    public static int N(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int O(int... iArr) {
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int P(long j) {
        if (j > 2147483647L) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static List Q(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new ahbq(iArr, 0, length);
    }

    public static byte[] R(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int[] S(Collection collection) {
        if (collection instanceof ahbq) {
            ahbq ahbqVar = (ahbq) collection;
            return Arrays.copyOfRange(ahbqVar.a, ahbqVar.b, ahbqVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[EDGE_INSN: B:29:0x0068->B:30:0x0069 BREAK  A[LOOP:0: B:14:0x002c->B:23:0x0054]] */
    public static Integer T(String str) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i = cCharAt == '-' ? 1 : 0;
            if (i == str.length()) {
                lValueOf = null;
                break;
            }
            int i2 = i + 1;
            int iA = ahbr.a(str.charAt(i));
            if (iA >= 0 && iA < 10) {
                long j = -iA;
                while (true) {
                    if (i2 >= str.length()) {
                        if (cCharAt != '-') {
                            if (j != Long.MIN_VALUE) {
                                lValueOf = Long.valueOf(-j);
                                break;
                            }
                        } else {
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                    } else {
                        int i3 = i2 + 1;
                        int iA2 = ahbr.a(str.charAt(i2));
                        if (iA2 >= 0 && iA2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = iA2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                    }
                    lValueOf = null;
                    break;
                }
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static void U(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void V(String str, int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + i + ") must be >= 0");
    }

    public static void W(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static int X(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (ahbe.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (((roundingMode != RoundingMode.HALF_EVEN ? 0 : 1) & i3 & 1) == 0) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int Y(int i, int i2) {
        return P(((long) i) + ((long) i2));
    }

    public static /* synthetic */ int Z(int i) {
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
            case 7:
                return 9;
            default:
                return 0;
        }
    }

    public static MessageLite aA(Bundle bundle, String str, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return az(protoParsers$InternalDontUse, messageLite, extensionRegistryLite);
    }

    public static MessageLite aB(Parcel parcel, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        try {
            return ay(parcel, messageLite, extensionRegistryLite);
        } catch (aiik e) {
            throw new RuntimeException(e);
        }
    }

    public static MessageLite aC(Bundle bundle, String str, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        try {
            return aA(bundle, str, messageLite, extensionRegistryLite);
        } catch (aiik e) {
            throw new RuntimeException(e);
        }
    }

    public static List aD(Bundle bundle, String str, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        ArrayList parcelableArrayList;
        Object parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            parcelableArrayList = bundle2.getParcelableArrayList("protoparsers");
        } else {
            parcelableArrayList = (ArrayList) parcelable;
        }
        ArrayList arrayList = new ArrayList(parcelableArrayList.size());
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(az((ProtoParsers$InternalDontUse) it.next(), messageLite, extensionRegistryLite));
        }
        return arrayList;
    }

    public static void aE(Parcel parcel, MessageLite messageLite) {
        parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, messageLite), 0);
    }

    public static void aF(Intent intent, String str, MessageLite messageLite) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, messageLite));
        intent.putExtra(str, bundle);
    }

    public static void aG(Bundle bundle, String str, MessageLite messageLite) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, messageLite));
        bundle.putParcelable(str, bundle2);
    }

    public static void aH(Bundle bundle, String str, List list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProtoParsers$InternalDontUse(null, (MessageLite) it.next()));
        }
        bundle2.putParcelableArrayList("protoparsers", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    public static String aI(byte[] bArr, int i, int i2) {
        return i2 == 0 ? "" : aL(bArr, i, i2);
    }

    public static boolean aJ(byte[] bArr) {
        return aK(bArr, 0, bArr.length);
    }

    public static boolean aK(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (bArr[i] < 0) {
                return a.e(bArr, i, i2);
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[PHI: r4
      0x0097: PHI (r4v7 byte) = (r4v6 byte), (r4v12 byte) binds: [B:40:0x0092, B:42:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:82:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00af A[SYNTHETIC] */
    public static String aL(byte[] bArr, int i, int i2) throws aiik {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i < i4) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else {
                if (a.W(b2)) {
                    if (i6 >= i4) {
                        throw new aiik("Protocol message had invalid UTF-8.");
                    }
                    i3 = i5 + 1;
                    i += 2;
                    byte b4 = bArr[i6];
                    if (b2 < -62 || a.U(b4)) {
                        throw new aiik("Protocol message had invalid UTF-8.");
                    }
                    cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                } else {
                    if (a.V(b2)) {
                        if (i6 >= i4 - 1) {
                            throw new aiik("Protocol message had invalid UTF-8.");
                        }
                        i3 = i5 + 1;
                        int i7 = i + 2;
                        byte b5 = bArr[i6];
                        i += 3;
                        byte b6 = bArr[i7];
                        if (!a.U(b5)) {
                            if (b2 != -32) {
                                if (b2 != -19) {
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                } else if (b5 < -96) {
                                    b2 = -19;
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                }
                            } else if (b5 >= -96) {
                                b2 = -32;
                                if (b2 != -19) {
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                } else if (b5 < -96) {
                                    b2 = -19;
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                }
                            }
                        }
                        throw new aiik("Protocol message had invalid UTF-8.");
                    }
                    if (i6 >= i4 - 2) {
                        throw new aiik("Protocol message had invalid UTF-8.");
                    }
                    byte b7 = bArr[i6];
                    int i8 = i + 3;
                    byte b8 = bArr[i + 2];
                    i += 4;
                    byte b9 = bArr[i8];
                    if (a.U(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || a.U(b8) || a.U(b9)) {
                        throw new aiik("Protocol message had invalid UTF-8.");
                    }
                    int i9 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                    cArr[i5] = (char) ((i9 >>> 10) + 55232);
                    cArr[i5 + 1] = (char) ((i9 & 1023) + 56320);
                    i5 += 2;
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    protected static void aM(String str, ByteBuffer byteBuffer) {
        try {
            byteBuffer.put(str.getBytes(StandardCharsets.UTF_8));
        } catch (BufferOverflowException unused) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
    }

    public static int aN(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new aijz(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (aijz unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static void aO(String str, ByteBuffer byteBuffer) {
        int length = str.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = str.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        int i2 = iPosition + i;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(i2, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i3 = i2 + 1;
                byteBuffer.put(i2, (byte) ((cCharAt2 >>> 6) | 192));
                byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | SemanticState.Focused));
                i2 = i3;
            } else {
                if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                    i++;
                    if (i != length) {
                        char cCharAt3 = str.charAt(i);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            byteBuffer.put(i2, (byte) ((codePoint >>> 18) | 240));
                            int i4 = i2 + 2;
                            byteBuffer.put(i2 + 1, (byte) (((codePoint >>> 12) & 63) | SemanticState.Focused));
                            i2 += 3;
                            byteBuffer.put(i4, (byte) (((codePoint >>> 6) & 63) | SemanticState.Focused));
                            byteBuffer.put(i2, (byte) ((codePoint & 63) | SemanticState.Focused));
                        }
                    }
                    aM(str, byteBuffer);
                    return;
                }
                int i5 = i2 + 1;
                byteBuffer.put(i2, (byte) ((cCharAt2 >>> '\f') | 224));
                i2 = i5 + 1;
                byteBuffer.put(i5, (byte) (((cCharAt2 >>> 6) & 63) | SemanticState.Focused));
                byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | SemanticState.Focused));
            }
            i2++;
            i++;
        }
        byteBuffer.position(i2);
    }

    public static aiip aP(Object obj, Object obj2) {
        aiip aiipVarA = (aiip) obj;
        aiip aiipVar = (aiip) obj2;
        if (!aiipVar.isEmpty()) {
            if (!aiipVarA.b) {
                aiipVarA = aiipVarA.a();
            }
            aiipVarA.b();
            if (!aiipVar.isEmpty()) {
                aiipVarA.putAll(aiipVar);
            }
        }
        return aiipVarA;
    }

    public static boolean aQ(Object obj) {
        return !((aiip) obj).b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static List aR(Object obj, long j) {
        aijx aijxVar = aijy.a;
        aiie aiieVar = (aiie) aijxVar.i(obj, j);
        if (aiieVar.c()) {
            return aiieVar;
        }
        int size = aiieVar.size();
        aiie aiieVarE = aiieVar.e(size == 0 ? 10 : size << 1);
        aijxVar.l(obj, j, aiieVarE);
        return aiieVarE;
    }

    public static axqr aS(Object obj) {
        return (axqr) ((ahud) obj).b;
    }

    public static aiha aT(Object obj) {
        return ((aihi) obj).j;
    }

    public static void aU(aign aignVar, Object obj, ExtensionRegistryLite extensionRegistryLite, aiha aihaVar) {
        aihl aihlVar = (aihl) obj;
        aihaVar.m(aihlVar.d, aignVar.s(aihlVar.c.getClass(), extensionRegistryLite));
    }

    public static void aV(Object obj) {
        ((aihi) obj).j.f();
    }

    public static void aW(aiah aiahVar, aihf aihfVar) {
        aiahVar.getClass();
        aihfVar.copyOnWrite();
        aiby aibyVar = (aiby) aihfVar.instance;
        aiby aibyVar2 = aiby.a;
        aibyVar.d = aiahVar;
        aibyVar.b |= 2;
    }

    public static void aX(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiby aibyVar = (aiby) aihfVar.instance;
        aiby aibyVar2 = aiby.a;
        aibyVar.c = i - 1;
        aibyVar.b |= 1;
    }

    public static void aY(aibn aibnVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.u = aibnVar.j;
        aibvVar.b |= 65536;
    }

    public static void aZ(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= SemanticState.Hidden;
        aibvVar.k = i;
    }

    public static /* synthetic */ boolean aa(int i, agro agroVar, StringBuilder sb) {
        if (i - 1 != 0 || agroVar == agro.a) {
            return false;
        }
        sb.append(agroVar.b());
        sb.append('.');
        sb.append(agroVar.d());
        sb.append(':');
        sb.append(agroVar.a());
        return true;
    }

    public static int ab(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static agkz ac(Iterable iterable) {
        if (iterable instanceof Collection) {
            return iterable.isEmpty() ? agpr.a : agjy.a(EnumSet.copyOf((Collection) iterable));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return agpr.a;
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        aguu.F(enumSetOf, it);
        return agjy.a(enumSetOf);
    }

    public static agkz ad(Enum r0, Enum... enumArr) {
        return agjy.a(EnumSet.of(r0, enumArr));
    }

    public static agqh ae(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new agqb(set, set2);
    }

    public static agqh af(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new agpz(set, set2);
    }

    public static HashSet ag(int i) {
        return new HashSet(aguu.k(i));
    }

    public static NavigableSet ah(NavigableSet navigableSet) {
        return ((navigableSet instanceof agjw) || (navigableSet instanceof agqi)) ? navigableSet : new agqi(navigableSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set ai(Set set, agex agexVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof agqe)) {
                set.getClass();
                return new agqe(set, agexVar);
            }
            agqe agqeVar = (agqe) set;
            return new agqe((Set) agqeVar.a, afyd.b(agqeVar.b, agexVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof agqe)) {
            sortedSet.getClass();
            return new agqf(sortedSet, agexVar);
        }
        agqe agqeVar2 = (agqe) sortedSet;
        return new agqf((SortedSet) agqeVar2.a, afyd.b(agqeVar2.b, agexVar));
    }

    public static Set aj() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set ak() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean al(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean am(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof agow) {
            collection = ((agow) collection).i();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return an(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean an(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static int ao(int i) {
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
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
            case 130:
            default:
                return 0;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return R.styleable.AppCompatTheme_windowMinWidthMinor;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return SemanticState.Focused;
            case SemanticState.Focused /* 128 */:
                return 129;
            case 129:
                return 130;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
        }
    }

    public static /* synthetic */ String ap(int i) {
        if (i == 1) {
            return "GAIA_DELEGATION_TYPE_UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "GAIA_DELEGATION_TYPE_LATE" : "GAIA_DELEGATION_TYPE_EARLY";
        }
        return "GAIA_DELEGATION_TYPE_NONE";
    }

    public static int aq(int i) {
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
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            default:
                return 0;
        }
    }

    public static int ar(int i) {
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
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
            case 36:
            default:
                return 0;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
        }
    }

    public static int as(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 3 ? 0 : 5;
        }
        return 3;
    }

    public static /* synthetic */ String at(int i) {
        if (i == 1) {
            return "ACCESS_TYPE_UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "ACCESS_TYPE_HOT" : "ACCESS_TYPE_COLD";
        }
        return "ACCESS_TYPE_EMBEDDED";
    }

    public static aigu au(Duration duration) {
        return aikw.d(duration.getSeconds(), duration.getNano());
    }

    public static aijp av(Instant instant) {
        return aikz.c(instant.getEpochSecond(), instant.getNano());
    }

    public static Duration aw(aigu aiguVar) {
        aigu aiguVarD = aikw.d(aiguVar.b, aiguVar.c);
        return Duration.ofSeconds(aiguVarD.b, aiguVarD.c);
    }

    public static Instant ax(aijp aijpVar) {
        aijp aijpVarC = aikz.c(aijpVar.b, aijpVar.c);
        return Instant.ofEpochSecond(aijpVarC.b, aijpVarC.c);
    }

    public static MessageLite ay(Parcel parcel, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        return az((ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR), messageLite, extensionRegistryLite);
    }

    public static MessageLite az(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        return protoParsers$InternalDontUse.b(messageLite.getDefaultInstanceForType(), extensionRegistryLite);
    }

    public static Object b(Future future, long j, TimeUnit timeUnit) {
        Object obj;
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    obj = future.get(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static void ba(aibo aiboVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.p = aiboVar.d;
        aibvVar.b |= SemanticState.Modal;
    }

    public static void bb(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= 8;
        aibvVar.f = str;
    }

    public static void bc(String str, aihf aihfVar) {
        str.getClass();
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= 16;
        aibvVar.g = str;
    }

    public static void bd(boolean z, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= SemanticState.Obscured;
        aibvVar.q = z;
    }

    public static void be(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= SemanticState.Multiline;
        aibvVar.r = str;
    }

    public static void bf(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= SemanticState.LiveRegion;
        aibvVar.l = str;
    }

    public static void bg(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= SemanticState.ReadOnly;
        aibvVar.m = str;
    }

    public static void bh(float f, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= 1;
        aibvVar.c = f;
    }

    public static void bi(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= 64;
        aibvVar.i = str;
    }

    public static void bj(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= SemanticState.Focused;
        aibvVar.j = str;
    }

    public static void bk(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= 32;
        aibvVar.h = str;
    }

    public static /* synthetic */ void bl(Iterable iterable, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aiie aiieVar = aibvVar.n;
        if (!aiieVar.c()) {
            aibvVar.n = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aibvVar.n);
    }

    public static /* synthetic */ void bm(Iterable iterable, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aiie aiieVar = aibvVar.o;
        if (!aiieVar.c()) {
            aibvVar.o = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aibvVar.o);
    }

    public static /* synthetic */ void bn(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aibv) aihfVar.instance).n);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static /* synthetic */ void bo(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aibv) aihfVar.instance).o);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static void bp(aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.d = 3;
        aibvVar.b |= 2;
    }

    public static void bq(aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibv aibvVar = (aibv) aihfVar.instance;
        aibv aibvVar2 = aibv.a;
        aibvVar.b |= 4;
        aibvVar.e = "998460566";
    }

    public static void br(ahud ahudVar, Map.Entry entry) {
        aihk aihkVar = (aihk) entry.getKey();
        if (!aihkVar.d) {
            aika aikaVar = aika.DOUBLE;
            switch (aihkVar.c.ordinal()) {
                case 0:
                    ahudVar.x(aihkVar.b, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    ahudVar.B(aihkVar.b, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    ahudVar.E(aihkVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    ahudVar.N(aihkVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    ahudVar.D(aihkVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    ahudVar.A(aihkVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    ahudVar.z(aihkVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    ahudVar.v(aihkVar.b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    ahudVar.L(aihkVar.b, (String) entry.getValue());
                    break;
                case 9:
                    ahudVar.C(aihkVar.b, entry.getValue(), aiiz.a.b(((aihn) entry.getValue()).getClass()));
                    break;
                case 10:
                    ahudVar.F(aihkVar.b, entry.getValue(), aiiz.a.b(((aihn) entry.getValue()).getClass()));
                    break;
                case 11:
                    ahudVar.w(aihkVar.b, (aigj) entry.getValue());
                    break;
                case 12:
                    ahudVar.M(aihkVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    ahudVar.D(aihkVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    ahudVar.H(aihkVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    ahudVar.I(aihkVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    ahudVar.J(aihkVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    ahudVar.K(aihkVar.b, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        aika aikaVar2 = aika.DOUBLE;
        switch (aihkVar.c.ordinal()) {
            case 0:
                aijh.o(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 1:
                aijh.q(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 2:
                aijh.A(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 3:
                aijh.A(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 4:
                aijh.s(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 5:
                aijh.z(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 6:
                aijh.y(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 7:
                aijh.m(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 8:
                aijh.w(aihkVar.b, (List) entry.getValue(), ahudVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    aijh.r(aihkVar.b, (List) entry.getValue(), ahudVar, aiiz.a.b(((aihn) list.get(0)).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    aijh.t(aihkVar.b, (List) entry.getValue(), ahudVar, aiiz.a.b(((aihn) list2.get(0)).getClass()));
                    break;
                }
                break;
            case 11:
                aijh.n(aihkVar.b, (List) entry.getValue(), ahudVar);
                break;
            case 12:
                aijh.x(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 13:
                aijh.s(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 14:
                aijh.y(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 15:
                aijh.z(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 16:
                aijh.u(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
            case 17:
                aijh.v(aihkVar.b, (List) entry.getValue(), ahudVar, aihkVar.e);
                break;
        }
    }

    public static void c() {
        Thread.currentThread().interrupt();
    }

    public static void d(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void e(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static agke f(Iterable iterable) {
        ListenableFuture[] listenableFutureArr = (ListenableFuture[]) iterable.toArray(new ListenableFuture[0]);
        ahem ahemVar = new ahem(listenableFutureArr);
        agjz agjzVarF = agke.f(listenableFutureArr.length);
        for (int i = 0; i < listenableFutureArr.length; i++) {
            agjzVarF.h(new ahel(ahemVar));
        }
        agke agkeVarG = agjzVarF.g();
        for (int i2 = 0; i2 < listenableFutureArr.length; i2++) {
            listenableFutureArr[i2].addListener(new qd(ahemVar, agkeVarG, i2, 19), MoreExecutors.directExecutor());
        }
        return agkeVarG;
    }

    public static ahek g(Iterable iterable) {
        return new ahek(false, agke.j(iterable));
    }

    @SafeVarargs
    public static ahek h(ListenableFuture... listenableFutureArr) {
        return new ahek(false, agke.p(listenableFutureArr));
    }

    public static ahek i(Iterable iterable) {
        return new ahek(true, agke.j(iterable));
    }

    @SafeVarargs
    public static ahek j(ListenableFuture... listenableFutureArr) {
        return new ahek(true, agke.p(listenableFutureArr));
    }

    public static ListenableFuture k(Iterable iterable) {
        return new ahdn(agke.j(iterable), true);
    }

    public static ListenableFuture l() {
        ahep ahepVar = ahep.a;
        return ahepVar == null ? new ahep() : ahepVar;
    }

    public static ListenableFuture m(Throwable th) {
        th.getClass();
        return new aheq(th);
    }

    public static ListenableFuture n(Object obj) {
        return obj == null ? aher.a : new aher(obj);
    }

    public static ListenableFuture o(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ahen ahenVar = new ahen(listenableFuture);
        listenableFuture.addListener(ahenVar, MoreExecutors.directExecutor());
        return ahenVar;
    }

    public static ListenableFuture p(ahcx ahcxVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ahfo ahfoVar = new ahfo(ahcxVar);
        ahfoVar.addListener(new afjc(scheduledExecutorService.schedule(ahfoVar, j, timeUnit), 8), MoreExecutors.directExecutor());
        return ahfoVar;
    }

    public static ListenableFuture q(Runnable runnable, Executor executor) {
        ahfo ahfoVar = new ahfo(Executors.callable(runnable, null));
        executor.execute(ahfoVar);
        return ahfoVar;
    }

    public static ListenableFuture r(Callable callable, Executor executor) {
        ahfo ahfoVar = new ahfo(callable);
        executor.execute(ahfoVar);
        return ahfoVar;
    }

    public static ListenableFuture s(ahcx ahcxVar, Executor executor) {
        ahfo ahfoVar = new ahfo(ahcxVar);
        executor.execute(ahfoVar);
        return ahfoVar;
    }

    public static ListenableFuture t(Iterable iterable) {
        return new ahdn(agke.j(iterable), false);
    }

    public static ListenableFuture u(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        timeUnit.getClass();
        scheduledExecutorService.getClass();
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ahfl ahflVar = new ahfl(listenableFuture);
        ahfj ahfjVar = new ahfj(ahflVar);
        ahflVar.b = scheduledExecutorService.schedule(ahfjVar, j, timeUnit);
        listenableFuture.addListener(ahfjVar, MoreExecutors.directExecutor());
        return ahflVar;
    }

    public static Object v(Future future) {
        ahno.R(future.isDone(), "Future was expected to be done: %s", future);
        return a.i(future);
    }

    public static Object w(Future future) {
        future.getClass();
        try {
            return a.i(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new ahdu((Error) e.getCause());
            }
            throw new ahfp(e.getCause());
        }
    }

    public static void x(ListenableFuture listenableFuture, aheh ahehVar, Executor executor) {
        listenableFuture.addListener(new ahei(listenableFuture, ahehVar), executor);
    }

    public static void y(ListenableFuture listenableFuture, Future future) {
        if (listenableFuture instanceof ahch) {
            ((ahch) listenableFuture).l(future);
        } else {
            if (listenableFuture == null || !listenableFuture.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(ListenableFuture listenableFuture, Future future) {
        listenableFuture.getClass();
        if (future.isDone()) {
            return;
        }
        if (listenableFuture.isDone()) {
            y(listenableFuture, future);
            return;
        }
        ahej ahejVar = new ahej(listenableFuture, future, 0);
        listenableFuture.addListener(ahejVar, MoreExecutors.directExecutor());
        if (future instanceof ListenableFuture) {
            future.addListener(ahejVar, MoreExecutors.directExecutor());
        }
    }
}
