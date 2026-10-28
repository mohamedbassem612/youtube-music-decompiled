package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqk implements aclq {
    public final ajwo a;
    public Optional b = Optional.empty();
    public boolean c = false;

    static {
        ahsk ahskVarB = abnt.b(abug.a);
        ahskVarB.e(0L);
        ahskVarB.f(abns.b().c());
        ahskVarB.d(3);
        ahskVarB.c();
        ahsk ahskVarB2 = abnt.b(abug.a);
        ahskVarB2.e(2000L);
        ahskVarB2.f(abns.b().c());
        ahskVarB2.d(3);
        ahskVarB2.c();
    }

    public acqk(ajwo ajwoVar) {
        this.a = ajwoVar;
    }

    public final void a() {
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acqk)) {
            return false;
        }
        acqk acqkVar = (acqk) obj;
        return this.b.equals(acqkVar.b) && Objects.equals(this.a, acqkVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
