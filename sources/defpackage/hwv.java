package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwv {
    public avmn a;
    private final abvn b;
    private final Optional c;
    private final avmn d;

    /* JADX WARN: Type inference failed for: r4v1, types: [abvn, java.lang.Object] */
    public hwv(abvn abvnVar, Optional optional) {
        this.b = abvnVar;
        this.c = optional;
        int i = 8;
        int i2 = 12;
        this.d = abvnVar.G().x(new hgu(i)).at().e().F(new hwu(0), new hpw(i2));
        hkp hkpVar = new hkp(this, 3);
        optional.isPresent();
        ((hwv) hkpVar.a).a = optional.get().G().x(new hgu(i)).at().e().F(new hwu(1), new hpw(i2));
    }

    public final boolean a() {
        if (this.d.f()) {
            return this.b.o().U();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [abvn, java.lang.Object] */
    public final boolean b() {
        if (this.a != null) {
            Optional optional = this.c;
            if (!optional.isEmpty() && this.a.f()) {
                optional.isPresent();
                return ((Boolean) Optional.ofNullable(Boolean.valueOf(optional.get().o().U())).orElse(Boolean.FALSE)).booleanValue();
            }
        }
        return false;
    }
}
