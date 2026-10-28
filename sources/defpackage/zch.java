package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zch {
    public static final zch a = new zch(null, null);
    public final zbx b;
    public final zcp c;
    public final agke d;

    public zch(zbx zbxVar, zcp zcpVar) {
        this.b = zbxVar;
        this.c = zcpVar;
        agjz agjzVarF = agke.f(2);
        if (zbxVar != null) {
            agjzVarF.h(jqz.TRACK_TYPE_AUDIO);
        }
        if (zcpVar != null) {
            agjzVarF.h(jqz.TRACK_TYPE_VIDEO);
        }
        this.d = agjzVarF.g();
    }

    public final cqs a(jqz jqzVar) {
        zcp zcpVar;
        zbx zbxVar;
        if (jqzVar == jqz.TRACK_TYPE_AUDIO && (zbxVar = this.b) != null) {
            return zbxVar.i();
        }
        if (jqzVar != jqz.TRACK_TYPE_VIDEO || (zcpVar = this.c) == null) {
            return null;
        }
        return zcpVar.f();
    }
}
