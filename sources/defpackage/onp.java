package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class onp {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public onp(Context context, ola olaVar, omn omnVar, ayq ayqVar, ong ongVar, qnl qnlVar, agev agevVar, Executor executor) {
        this.d = context;
        this.a = olaVar;
        this.b = omnVar;
        this.c = ayqVar;
        this.g = ongVar;
        this.h = qnlVar;
        this.e = agevVar;
        this.f = executor;
    }

    public static final String a(oiw oiwVar) {
        return oiwVar.c + '|' + oiwVar.d;
    }

    public static final Set b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }

    public onp(Optional optional, Optional optional2, Optional optional3, nvp nvpVar, mlc mlcVar, aigw aigwVar, Optional optional4, Optional optional5) {
        this.a = nvpVar;
        this.d = mlcVar;
        this.b = aigwVar;
        this.e = optional;
        this.f = optional2;
        this.h = optional3;
        this.g = optional4;
        this.c = optional5;
    }
}
