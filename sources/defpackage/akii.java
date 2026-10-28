package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akii extends aihn implements aiis {
    public static final akii a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private askp f;
    private askp g;
    private askp h;
    private apji i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        akii akiiVar = new akii();
        a = akiiVar;
        aihn.registerDefaultInstance(akii.class, akiiVar);
    }

    private akii() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u000b\t\u0000\u0000\t\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\u0007\u0005ᐉ\b\u0007ᐉ\u0000\bᐉ\u0001\tᐉ\u0002\nᐉ\u0003\u000bᐉ\u0004", new Object[]{"b", "h", "i", "j", "k", "c", "d", "e", "f", "g"});
            case 3:
                return new akii();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akii.class);
            default:
                return null;
        }
    }
}
