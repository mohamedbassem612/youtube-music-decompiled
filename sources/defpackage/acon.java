package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acon implements acpo {
    private final acnm a;

    public acon(acnm acnmVar) {
        this.a = acnmVar;
    }

    @Override // defpackage.acpo
    public final apfu hx() {
        Optional optionalA = this.a.a();
        if (true == optionalA.isPresent()) {
            optionalA = Optional.ofNullable(((acoi) optionalA.get()).br);
        }
        return (apfu) optionalA.orElse(apfu.a);
    }
}
