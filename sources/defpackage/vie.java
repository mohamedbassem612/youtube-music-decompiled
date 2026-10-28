package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vie {
    public static final auag a;
    public static final agkz b;
    public static final agkj c;
    public final Activity d;
    public final viz e;
    public final xgm f;
    public final vhn g;
    public final zf h;

    static {
        auag auagVar = auag.DAY_OF_WEEK_NORMAL;
        a = auagVar;
        b = agkz.q(auagVar, auag.DAY_OF_WEEK_LIGHT);
        agkj.k(auag.DAY_OF_WEEK_NORMAL, "", auag.DAY_OF_WEEK_LIGHT, "_secondary");
        agkh agkhVar = new agkh(4);
        agkhVar.e(1, "sunday");
        agkhVar.e(2, "monday");
        agkhVar.e(3, "tuesday");
        agkhVar.e(4, "wednesday");
        agkhVar.e(5, "thursday");
        agkhVar.e(6, "friday");
        agkhVar.e(7, "saturday");
        c = agkhVar.d(true);
    }

    public vie(Activity activity, zf zfVar, viz vizVar, xgm xgmVar, vhn vhnVar) {
        this.d = activity;
        this.h = zfVar;
        this.e = vizVar;
        this.f = xgmVar;
        this.g = vhnVar;
    }
}
