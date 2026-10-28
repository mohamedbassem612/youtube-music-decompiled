package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kju implements kiv {
    public static final ConcurrentHashMap a;
    static Boolean b;
    static Long c;
    public static final ayq e;
    public final Context d;

    static {
        khn khnVar = lll.a;
        ayq ayqVar = new ayq(qke.a("com.google.android.gms.clearcut.public"), "", "", (byte[]) null);
        ayq ayqVar2 = new ayq(ayqVar.b, "gms:playlog:service:samplingrules_", ayqVar.c, (byte[]) null);
        e = new ayq(ayqVar2.b, ayqVar2.a, "LogSamplingRulesV2__", (byte[]) null);
        a = new ConcurrentHashMap();
        b = null;
        c = null;
    }

    public kju(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        if (applicationContext != null) {
            qkm.f(applicationContext);
        }
    }
}
