package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class achg extends awrb implements awqk {
    public static final achg a = new achg();

    public achg() {
        super(2, awml.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Optional optional = (Optional) obj;
        Optional optional2 = (Optional) obj2;
        optional.getClass();
        optional2.getClass();
        return new awml(optional, optional2);
    }
}
