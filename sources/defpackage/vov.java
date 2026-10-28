package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vov {
    public final Map a;
    public final aunn b;
    public final boolean c;
    public vor d;
    public final vxz e;
    public final vwt f;
    public final dov g;

    public vov(dov dovVar, vwt vwtVar, vxz vxzVar, aunn aunnVar, boolean z) {
        this.g = dovVar;
        this.f = vwtVar;
        this.e = vxzVar;
        aunnVar.getClass();
        this.b = aunnVar;
        this.c = z;
        this.a = new HashMap();
    }

    public final vot a(String str) {
        return (vot) this.a.get(str);
    }

    public final boolean b(String str, vob vobVar) {
        vot votVarA = a(str);
        return c(str) && votVarA != null && vobVar.equals(votVarA.b);
    }

    public final boolean c(String str) {
        return a(str) != null;
    }
}
