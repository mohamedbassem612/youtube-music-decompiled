package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pss {
    public static final pss a = new pss();

    public static final plv a(agev agevVar, awmd awmdVar) {
        return (!((Boolean) awmdVar.io()).booleanValue() || ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue()) ? plv.a : plv.b;
    }

    public final Object b(pqg pqgVar, String str, boolean z) {
        return z ? new pla(Boolean.TRUE) : new pla(Boolean.valueOf(awrc.c(pqgVar.b(), str)));
    }
}
