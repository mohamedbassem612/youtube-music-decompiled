package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wab implements waa {
    public static final agrf c = agrf.h("com/google/android/libraries/youtube/innertube/datapush/FileGroupReaderBase");
    private final ohp a;
    private final agfr b = aguu.al(new tpc(this, 12));
    public final agfr d;
    public final agfr e;

    protected wab(ohp ohpVar, awmd awmdVar) {
        this.a = ohpVar;
        this.d = aguu.al(new tpc(ohpVar, 11));
        this.e = aguu.al(new jxq(ohpVar, awmdVar, 10));
    }

    @Override // defpackage.waa
    public final asje c() {
        return (asje) this.e.io();
    }

    @Override // defpackage.waa
    public final String d() {
        return this.a.c;
    }

    @Override // defpackage.waa
    public final List e(aihl aihlVar) {
        return (List) Collection.EL.stream((agke) this.b.io()).filter(new hkn(aihlVar, 10)).map(new hpc(aihlVar, 3)).collect(aghu.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof waa) {
            waa waaVar = (waa) obj;
            if (h() == waaVar.h() && Objects.equals(d(), waaVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.waa
    public final boolean f(aihl aihlVar) {
        return Collection.EL.stream((agke) this.b.io()).anyMatch(new hkn(aihlVar, 11));
    }

    public final agkj g() {
        return (agkj) this.d.io();
    }

    @Override // defpackage.waa
    public long h() {
        return this.a.i;
    }

    public final int hashCode() {
        return Objects.hash(d(), Long.valueOf(h()));
    }
}
