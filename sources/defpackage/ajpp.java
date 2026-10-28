package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajpp extends aihn implements aiis {
    public static final ajpp a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private askp g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private apji l;
    private byte m = 2;

    static {
        ajpp ajppVar = new ajpp();
        a = ajppVar;
        aihn.registerDefaultInstance(ajpp.class, ajppVar);
    }

    private ajpp() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\n\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\t\bᐉ\u0003\tᐉ\u0004\nᐉ\u0000", new Object[]{"b", "d", "e", "h", "i", "j", "k", "l", "f", "g", "c"});
            case 3:
                return new ajpp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajpp.class);
            default:
                return null;
        }
    }
}
