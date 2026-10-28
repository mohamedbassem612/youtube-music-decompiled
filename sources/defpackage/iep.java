package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class iep extends awrb implements awqg {
    public static final iep a = new iep();

    public iep() {
        super(1, Optional.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        return optional.get();
    }
}
