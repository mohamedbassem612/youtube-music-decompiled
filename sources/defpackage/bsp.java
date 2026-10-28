package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsp {
    public final Uri a;
    public final String b;
    public final bsm c;
    public final bsh d = null;
    public final List e;
    public final String f;
    public final agke g;
    public final Object h;
    public final long i;

    static {
        bwp.a;
    }

    public bsp(Uri uri, String str, bsm bsmVar, List list, String str2, agke agkeVar, Object obj, long j) {
        this.a = uri;
        this.b = bsy.g(str);
        this.c = bsmVar;
        this.e = list;
        this.f = str2;
        this.g = agkeVar;
        agjz agjzVar = new agjz(4);
        if (((agpi) agkeVar).d > 0) {
            throw null;
        }
        agjzVar.g();
        this.h = obj;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsp) {
            bsp bspVar = (bsp) obj;
            if (this.a.equals(bspVar.a) && Objects.equals(this.b, bspVar.b) && Objects.equals(this.c, bspVar.c)) {
                bsh bshVar = bspVar.d;
                if (Objects.equals(null, null) && this.e.equals(bspVar.e) && Objects.equals(this.f, bspVar.f) && aguu.v(this.g, bspVar.g) && Objects.equals(this.h, bspVar.h) && this.i == bspVar.i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        bsm bsmVar = this.c;
        int iHashCode3 = (((iHashCode2 + (bsmVar == null ? 0 : bsmVar.hashCode())) * 961) + this.e.hashCode()) * 31;
        String str2 = this.f;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.g.hashCode()) * 31;
        Object obj = this.h;
        return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.i);
    }
}
