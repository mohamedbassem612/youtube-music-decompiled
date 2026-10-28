package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class awyb extends awrb implements awqk {
    public static final awyb a = new awyb();

    public awyb() {
        super(2, awyc.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        awyj awyjVar = (awyj) obj2;
        awyj awyjVar2 = awyc.a;
        return new awyj(jLongValue, awyjVar, awyjVar.f(), 0);
    }
}
