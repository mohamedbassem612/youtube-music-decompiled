package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class ieo extends awrb implements awqg {
    public static final ieo a = new ieo();

    public ieo() {
        super(1, Optional.class, "isPresent", "isPresent()Z", 0);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        return Boolean.valueOf(optional.isPresent());
    }
}
