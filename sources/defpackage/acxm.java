package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acxm {
    public final akrn a;
    public fkz b;
    public final byte[] c;
    private mlf d;

    public acxm(akrn akrnVar) {
        akrnVar.getClass();
        this.a = akrnVar;
        int i = acxu.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arrj.a);
        akrnVar.c(aihlVarCheckIsLite);
        Object objK = akrnVar.j.k(aihlVarCheckIsLite.d);
        this.c = acxu.a((aigj) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        this.d = null;
    }

    public static void c(Object obj) {
        if (obj instanceof acxm) {
            ((acxm) obj).e();
        }
    }

    public final synchronized mlf a() {
        mlf mlfVar;
        mlfVar = this.d;
        if (mlfVar == null) {
            mlfVar = new mlf();
            this.d = mlfVar;
        }
        return mlfVar;
    }

    public final akro b() {
        akro akroVar = this.a.c;
        return akroVar == null ? akro.a : akroVar;
    }

    public void d() {
        mlf mlfVar;
        synchronized (this) {
            mlfVar = this.d;
            this.d = null;
        }
        if (mlfVar != null) {
            mlfVar.dispose();
        }
    }

    public void e() {
        synchronized (this) {
            mlf mlfVar = this.d;
            if (mlfVar != null && mlfVar.g()) {
                this.d = null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acxm) {
            return Objects.equals(this.a, ((acxm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
