package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ryw implements ryy {
    private final /* synthetic */ int $cid;
    private final rud a;

    public ryw(rud rudVar, int i) {
        this.$cid = i;
        this.a = rudVar;
    }

    @Override // defpackage.ryy
    public final String a() {
        return "";
    }

    @Override // defpackage.ryy
    public final String b(shh shhVar) {
        if (this.$cid != 0) {
            Optional optionalOf = shhVar.e(shi.class) ? Optional.of((ofg) shhVar.d(shi.class)) : this.a.c();
            if (true == optionalOf.isPresent()) {
                optionalOf = Optional.ofNullable(((ofg) optionalOf.get()).a);
            }
            return (String) optionalOf.orElse("");
        }
        Optional optionalOf2 = shhVar.e(shi.class) ? Optional.of((ofg) shhVar.d(shi.class)) : this.a.c();
        if (true == optionalOf2.isPresent()) {
            optionalOf2 = Optional.ofNullable(((ofg) optionalOf2.get()).b);
        }
        return (String) optionalOf2.orElse("");
    }
}
