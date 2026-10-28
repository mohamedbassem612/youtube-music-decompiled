package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ambp extends aihi implements aihj {
    public static final ambp a;
    private int b;
    private ajwo c;
    private apji d;
    private apji e;
    private byte f = 2;

    static {
        ambp ambpVar = new ambp();
        a = ambpVar;
        aihn.registerDefaultInstance(ambp.class, ambpVar);
    }

    private ambp() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\b \u0003\u0000\u0000\u0003\bᐉ\u0006\u001eᐉ\t ᐉ\u0014", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ambp();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ambp.class);
            default:
                return null;
        }
    }
}
