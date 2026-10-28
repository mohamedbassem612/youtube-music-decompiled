package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxk implements uxi {
    public final augy a;
    public final Optional b;
    public Optional c;

    public uxk(augy augyVar, Optional optional, Optional optional2) {
        this.c = Optional.empty();
        this.a = augyVar;
        this.b = optional;
        if (augyVar.c == 110) {
            sda sdaVar = new sda(this, augyVar, 11);
            if (true == optional2.isPresent()) {
                Object obj = optional2.get();
                Object obj2 = sdaVar.a;
                ((uxk) obj2).c = Collection.EL.stream(((augj) obj).c).filter(new uso(sdaVar.b, 9)).findFirst();
            }
            if (this.c.isEmpty()) {
                throw new IllegalArgumentException("No corresponding text sticker mixin");
            }
        }
    }

    @Override // defpackage.uxi
    public final long a() {
        return this.a.e;
    }

    @Override // defpackage.uxi
    public final augy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uxk) {
            uxk uxkVar = (uxk) obj;
            if (Objects.equals(this.a, uxkVar.a) && Objects.equals(this.b, uxkVar.b) && Objects.equals(this.c, uxkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public uxk(augy augyVar, Optional optional) {
        this(augyVar, optional, Optional.empty());
    }

    public uxk(augy augyVar) {
        this(augyVar, Optional.empty());
    }
}
