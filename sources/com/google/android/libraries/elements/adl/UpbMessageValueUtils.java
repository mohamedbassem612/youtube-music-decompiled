package com.google.android.libraries.elements.adl;

import android.os.Build;
import android.util.Log;
import dalvik.annotation.optimization.CriticalNative;
import dalvik.annotation.optimization.FastNative;
import defpackage.mev;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class UpbMessageValueUtils {
    public static boolean a;
    private static final boolean b;
    private static final Field c;
    private static final ByteBuffer d;

    static {
        b = Build.VERSION.SDK_INT < 27 && !Objects.equals(Build.FINGERPRINT, "robolectric");
        c = b();
        d = ByteBuffer.allocate(0);
        a = false;
    }

    private UpbMessageValueUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031 A[PHI: r1
      0x0031: PHI (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:8:0x0015, B:14:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static ByteBuffer a(Object obj, UpbArena upbArena) {
        Object obj2;
        if (obj == null) {
            return d;
        }
        if (obj instanceof byte[]) {
            return ByteBuffer.wrap((byte[]) obj);
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        boolean z = false;
        if (b) {
            Field field = c;
            if (field != null) {
                try {
                    obj2 = field.get(byteBuffer);
                    z = obj2 == null;
                    if (obj2 == null) {
                        obj2 = byteBuffer;
                    }
                } catch (IllegalAccessException e) {
                    Log.e("UpbMessageValueUtils", "Failed to get workaround field", e);
                    obj2 = byteBuffer;
                    z = true;
                }
            } else {
                obj2 = byteBuffer;
                z = true;
            }
        } else {
            obj2 = byteBuffer;
        }
        if (z) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            byteBufferAllocate.put(byteBuffer).rewind();
            return byteBufferAllocate;
        }
        long j = upbArena.a;
        UpbArena.jniIncrementReferenceCount(j);
        mev.a(obj2, j);
        return byteBuffer;
    }

    private static Field b() {
        if (!b) {
            return null;
        }
        try {
            Field declaredField = Class.forName("java.nio.DirectByteBuffer").getDeclaredField("memoryRef");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            try {
                Field declaredField2 = MappedByteBuffer.class.getDeclaredField("block");
                declaredField2.setAccessible(true);
                return declaredField2;
            } catch (NoSuchFieldException e2) {
                RuntimeException runtimeException = new RuntimeException(e2);
                runtimeException.addSuppressed(e);
                Log.e("UpbMessageValueUtils", "Could not obtain memory block reference for workaround", runtimeException);
                return null;
            }
        }
    }

    @FastNative
    public static native Object jniByteBufferFromStringView(long j);

    public static native String jniConvertToLongString(long j);

    @FastNative
    public static native String jniConvertToShortString(long j);

    public static native void jniCopyAndWriteByteArray(long j, byte[] bArr, int i, long j2);

    private static native boolean[] jniRetrieveBooleanArray(long j);

    private static native double[] jniRetrieveDoubleArray(long j);

    public static native float[] jniRetrieveFloatArray(long j);

    public static native int[] jniRetrieveIntArray(long j);

    private static native long[] jniRetrieveLongArray(long j);

    public static native long[] jniRetrieveMap(long j, long j2, long j3);

    public static native long[] jniRetrievePointerArray(long j);

    @CriticalNative
    public static native void jniSetUseZeroCopyDirectBuffers(boolean z);

    public static native String jniToDebugString(long j, long j2);
}
