package com.google.research.xeno.effect;

import android.os.Handler;
import android.os.Looper;
import defpackage.aihn;
import defpackage.atqo;
import defpackage.atvg;
import defpackage.atvl;
import defpackage.atwj;
import defpackage.atwk;
import defpackage.atxd;
import defpackage.atxk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class UserInteractionManager implements atwj {
    public static final String c = "UserInteractionManager";
    private atvg a;
    public long d;

    protected UserInteractionManager() {
        new atwk(this);
        new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    static void e(atvg atvgVar, long j) {
        new UserInteractionManager().d(atvgVar, j);
    }

    public static native long nativeCreateHandle();

    public static native void nativeDestroyHandle(long j);

    protected static native long nativeGetUserInteractionManager(long j);

    public static native void nativeSendGestureEvent(long j, byte[] bArr);

    public static native void nativeSendTouchEvent(long j, byte[] bArr);

    @Override // defpackage.atwj
    public final void b(atxd atxdVar) {
        atqo.a(this.a, new atvl(this, (aihn) atxdVar, 3));
    }

    @Override // defpackage.atwj
    public final void c(atxk atxkVar) {
        atqo.a(this.a, new atvl(this, (aihn) atxkVar, 2));
    }

    public final void d(atvg atvgVar, long j) {
        this.a = atvgVar;
        this.d = j;
    }
}
