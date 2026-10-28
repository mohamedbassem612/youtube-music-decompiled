package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class yvu extends tas {
    public static final wiw[] a = yob.a;
    public static final yog b = yog.a;
    public final wgs c;
    public final wgs f;
    public final wiw[] g;
    public final wgo[] h;
    public final yog i;
    public final int j;
    public final long k;
    public final int l;
    public final yvt m;
    public final String n;
    public final String o;
    public final yvv p;
    public final yvy q;

    public yvu(wgs wgsVar, wgs wgsVar2, wgs wgsVar3, wiw[] wiwVarArr, wgo[] wgoVarArr, yog yogVar, int i, long j, int i2, yvt yvtVar, String str, String str2, yvv yvvVar, yvy yvyVar) {
        this.c = wgsVar;
        this.f = wgsVar2;
        zkf.d(wiwVarArr);
        this.g = wiwVarArr;
        zkf.d(wgoVarArr);
        this.h = wgoVarArr;
        this.i = yogVar;
        this.j = i;
        this.k = j;
        this.l = i2;
        this.m = yvtVar;
        this.n = str;
        this.o = str2;
        this.p = yvvVar;
        this.q = yvyVar;
    }

    public final boolean a() {
        return this.g.length > 1;
    }

    public final String toString() {
        Object obj;
        wgs wgsVar = this.c;
        Object obj2 = 0;
        if (wgsVar == null) {
            obj = obj2;
        } else {
            obj = wgsVar.e() + ' ' + wgsVar.C();
        }
        wgs wgsVar2 = this.f;
        String string = obj.toString();
        if (wgsVar2 != null) {
            obj2 = wgsVar2.e() + wgsVar2.C();
        }
        int i = this.j;
        long j = this.k;
        int i2 = this.l;
        return "currentVideoFormat=" + string + " currentAudioFormat=" + obj2.toString() + " bestVideoFormat=0 trigger=" + yno.cv(i) + " estimate=" + j + " source=" + i2;
    }

    public yvu(wgs wgsVar, wgs wgsVar2, wgs wgsVar3, wiw[] wiwVarArr, wgo[] wgoVarArr, yog yogVar, int i) {
        this(null, null, null, wiwVarArr, wgoVarArr, yogVar, 0, -1L, 0, null, null, null, null, null);
    }

    public yvu(wgs wgsVar, wgs wgsVar2, wgs wgsVar3, wiw[] wiwVarArr, wgo[] wgoVarArr, int i) {
        this(null, wgsVar2, null, wiwVarArr, wgoVarArr, b, 0, -1L, 0, null, null, null, null, null);
    }
}
