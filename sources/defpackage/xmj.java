package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xmj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/castclient/CastSdkVersionHelper");
    public final Context b;
    public final klt c;

    public xmj(Context context, klt kltVar) {
        this.b = context;
        this.c = kltVar;
    }

    public final boolean a() {
        return this.c.m(this.b, 202100000) == 0;
    }
}
