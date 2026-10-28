package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class axcc extends awrb implements awql {
    public static final axcc a = new axcc();

    public axcc() {
        super(3, awzd.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object objEmit = ((awzd) obj).emit(obj2, (awoq) obj3);
        return objEmit != awox.a ? awmy.a : objEmit;
    }
}
