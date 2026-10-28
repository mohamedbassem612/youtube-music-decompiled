package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anin extends aihn implements aiis {
    public static final anin a;
    public boolean b;
    public ajmw c;
    public boolean d;
    public aihv e;
    public aoba f;
    public apnu g;
    public ambw h;
    public boolean i;
    private int j;
    private int k;

    static {
        anin aninVar = new anin();
        a = aninVar;
        aihn.registerDefaultInstance(anin.class, aninVar);
    }

    private anin() {
        emptyIntList();
        emptyProtobufList();
        this.e = emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0002\r6\b\u0000\u0001\u0000\rဇ\t#ဉ\u0017$ဇ\u0018%\u0016&ဉ\u0019+ဉ\u001d5ဉ!6ဇ\"", new Object[]{"j", "k", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new anin();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(anin.class);
    }
}
