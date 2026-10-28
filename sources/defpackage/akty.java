package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akty extends aihn implements aiis {
    public static final akty a;
    private int b;
    private askp c;
    private askp d;
    private ajnq e;
    private ajnq f;
    private ajnq g;
    private askp h;
    private askp i;
    private byte j = 2;

    static {
        akty aktyVar = new akty();
        a = aktyVar;
        aihn.registerDefaultInstance(akty.class, aktyVar);
    }

    private akty() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0011\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005\u0007ᐉ\u0006\u0011ᐉ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new akty();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akty.class);
            default:
                return null;
        }
    }
}
