package com.google.android.libraries.multiplatform.elements;

import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.multiplatform.elements.runtime.NativeLibraryInitializer;
import defpackage.ainh;
import defpackage.mew;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FlagServices {
    public static volatile mew a;

    private FlagServices() {
    }

    public static synchronized mew a() {
        mew mewVar;
        mewVar = a;
        if (mewVar == null) {
            NativeLibraryInitializer.a();
            long[] jArrJniGetRenderConfig = jniGetRenderConfig();
            mewVar = new mew(new UpbMessage(jArrJniGetRenderConfig[1], ainh.a, UpbArena.a(jArrJniGetRenderConfig[0])), (char[]) null);
            a = mewVar;
        }
        return mewVar;
    }

    public static mew b() {
        mew mewVar = a;
        return mewVar == null ? a() : mewVar;
    }

    public static synchronized void c(mew mewVar) {
        NativeLibraryInitializer.a();
        if (Objects.equals(a, mewVar)) {
            return;
        }
        UpbMessage upbMessage = mewVar.b;
        jniSetRenderConfig(upbMessage.a, upbMessage.c.a);
        a = mewVar;
    }

    public static synchronized void d(mew mewVar) {
        if (a == null) {
            c(mewVar);
        }
    }

    private static native long[] jniGetRenderConfig();

    private static native void jniSetRenderConfig(long j, long j2);
}
