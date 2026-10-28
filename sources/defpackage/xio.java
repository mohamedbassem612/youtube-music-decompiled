package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xio {
    public final boolean a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public xio(boolean z, mbc mbcVar) {
        this.a = z;
        this.c = mbcVar;
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.b = false;
    }

    public xio(Context context, String str, dpe dpeVar, boolean z, boolean z2) {
        this.c = context;
        this.e = str;
        this.d = dpeVar;
        this.a = z;
        this.b = z2;
    }

    public static final void a(long j, long j2) {
    }
}
