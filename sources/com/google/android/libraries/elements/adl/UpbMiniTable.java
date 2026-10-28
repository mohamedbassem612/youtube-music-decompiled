package com.google.android.libraries.elements.adl;

import defpackage.mey;
import defpackage.mez;
import defpackage.mfa;
import defpackage.mfb;
import defpackage.mfc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class UpbMiniTable {
    private static final UpbArena b = new UpbArena();
    public final long a;

    public UpbMiniTable(long j) {
        this.a = j;
    }

    public static UpbMiniTable b(String str) {
        UpbMiniTable upbMiniTable;
        UpbArena upbArena = b;
        synchronized (upbArena) {
            upbMiniTable = new UpbMiniTable(jniDecode(str, upbArena.a));
        }
        return upbMiniTable;
    }

    public static UpbMiniTable c(String str) {
        UpbMiniTable upbMiniTable;
        UpbArena upbArena = b;
        synchronized (upbArena) {
            upbMiniTable = new UpbMiniTable(jniDecodeEnum(str, upbArena.a));
        }
        return upbMiniTable;
    }

    private static native long jniDecode(String str, long j);

    private static native long jniDecodeDbg(String str, long j, String str2);

    private static native long jniDecodeEnum(String str, long j);

    private native long jniDecodeExtension(String str, long j, long j2, long j3);

    private native int[] jniGetField(long j, int i);

    private native void jniRegisterLinks(long j, long[] jArr);

    public final long a(String str, UpbMiniTable upbMiniTable) {
        long jJniDecodeExtension;
        UpbArena upbArena = b;
        synchronized (upbArena) {
            jJniDecodeExtension = jniDecodeExtension(str, this.a, upbMiniTable.a, upbArena.a);
        }
        return jJniDecodeExtension;
    }

    public final mfc d(int i) {
        mfc mfaVar;
        mfc mfbVar;
        int[] iArrJniGetField = jniGetField(this.a, i);
        int length = iArrJniGetField.length;
        if (length < 2 || length > 4) {
            throw new InternalError("Upb internal error: C++ failed to return a valid mini table field.");
        }
        int i2 = iArrJniGetField[0];
        int i3 = iArrJniGetField[1];
        if (length == 2) {
            mfbVar = new mey(i2, i3);
        } else {
            if (length == 3) {
                int i4 = iArrJniGetField[2];
                if (i4 == -1) {
                    mfbVar = new mfb(i2, i3);
                } else {
                    mfaVar = new mez(i2, i3, i4);
                }
            } else {
                mfaVar = new mfa(i2, i3, iArrJniGetField[2], iArrJniGetField[3]);
            }
            mfbVar = mfaVar;
        }
        if (mfbVar.a == i) {
            return mfbVar;
        }
        throw new InternalError("Upb internal error: inconsistent field number returned from C++");
    }

    public final void e(UpbMiniTable... upbMiniTableArr) {
        long[] jArr = new long[upbMiniTableArr.length];
        for (int i = 0; i < upbMiniTableArr.length; i++) {
            jArr[i] = upbMiniTableArr[i].a;
        }
        jniRegisterLinks(this.a, jArr);
    }
}
