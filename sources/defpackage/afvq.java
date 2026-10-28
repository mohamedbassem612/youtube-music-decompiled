package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afvq {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public afvq(int i) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = new IdentityHashMap();
        this.a = i;
    }

    @gdm
    public final afun a(int i, @gdn String str) {
        str.getClass();
        afuy afuyVar = afux.a;
        afuyVar.getClass();
        return b(i, str, afuyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    @gdm
    public final afun b(int i, @gdn String str, afuy afuyVar) {
        afuyVar.getClass();
        afuy afuyVarE = afuy.e((afuy) this.b.io(), afuyVar);
        afuyVarE.getClass();
        return ((afwd) this.d).b(str, afuyVarE, i);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    @gdm
    public final afvn c(int i, @gdn String str) {
        if (!ahno.aD()) {
            return new plg(5);
        }
        afuy afuyVar = afux.a;
        afuyVar.getClass();
        Object obj = this.d;
        afuy afuyVarE = afuy.e((afuy) this.b.io(), afuyVar);
        afuyVarE.getClass();
        return ((afwd) obj).d(str, afuyVarE, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    public final afun d(String str, int i) {
        Object objIo = this.b.io();
        objIo.getClass();
        return ((afwd) this.d).b(str, (afuy) objIo, i);
    }

    public afvq(afwd afwdVar, awmd awmdVar, Set set) {
        this.d = afwdVar;
        this.a = 2;
        afuy afuyVarD = afuy.d(set);
        afuyVarD.getClass();
        this.c = afuyVarD;
        this.b = new aeco(awmdVar, this, 2);
    }
}
