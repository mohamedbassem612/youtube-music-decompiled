package com.google.android.libraries.jni;

import android.os.Process;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class UnsafeMemory {
    public static final boolean a;
    public static final int b;
    public static final boolean c;

    static {
        a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        boolean zIs64Bit = Process.is64Bit();
        c = zIs64Bit;
        b = true != zIs64Bit ? 4 : 8;
    }

    private UnsafeMemory() {
    }
}
