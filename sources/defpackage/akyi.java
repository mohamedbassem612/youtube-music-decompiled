package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyi extends aihn implements aiis {
    public static final akyi a;
    private int b;
    private ajwo c;
    private apji d;
    private apji e;
    private apji f;
    private ajwo g;
    private byte h = 2;

    static {
        akyi akyiVar = new akyi();
        a = akyiVar;
        aihn.registerDefaultInstance(akyi.class, akyiVar);
    }

    private akyi() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\f\u0005\u0000\u0000\u0005\u0002ᐉ\u0000\u0007ᐉ\u0004\bᐉ\u0005\u000bᐉ\t\fᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new akyi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyi.class);
            default:
                return null;
        }
    }
}
