package com.google.android.libraries.multiplatform.elements.uibuilder;

import com.google.android.libraries.elements.adl.UpbMessage;
import dalvik.annotation.optimization.CriticalNative;
import defpackage.ateu;
import defpackage.atey;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DimensionUnitConverter {
    private DimensionUnitConverter() {
    }

    public static int a(float f, atey ateyVar) {
        if (ateyVar == null || !c(ateyVar) || ateyVar.aT() == 3 || Float.intBitsToFloat(Memory.peekInt(ateyVar.c + 12, false)) <= 0.0f) {
            return -1;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(ateyVar.c + 12, false)) * f;
        return (int) (((double) fIntBitsToFloat) + (fIntBitsToFloat > 0.0f ? 0.5d : -0.5d));
    }

    public static void b(ateu ateuVar, float f, int i, int[] iArr) {
        UpbMessage upbMessage = ateuVar.b;
        long jJniResolveDimensionEdges = jniResolveDimensionEdges(upbMessage.a, upbMessage.c.a, f, i);
        if (jJniResolveDimensionEdges == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            return;
        }
        long jPeekLong = Memory.peekLong(jJniResolveDimensionEdges, false);
        long jPeekLong2 = Memory.peekLong(jJniResolveDimensionEdges + 8, false);
        iArr[0] = (int) (jPeekLong & 4294967295L);
        iArr[1] = (int) (jPeekLong >>> 32);
        iArr[2] = (int) (4294967295L & jPeekLong2);
        iArr[3] = (int) (jPeekLong2 >>> 32);
    }

    public static boolean c(atey ateyVar) {
        long j = ateyVar.c + 8;
        return ((Memory.peekByte(j) & 1) == 0 && (Memory.peekByte(j) & 2) == 0) ? false : true;
    }

    @CriticalNative
    public static native int jniGetDimensionInPixel(long j, long j2, float f);

    @CriticalNative
    private static native long jniResolveDimensionEdges(long j, long j2, float f, int i);
}
