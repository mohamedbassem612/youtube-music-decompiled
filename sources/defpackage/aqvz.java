package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqvz extends aihn implements aiis {
    public static final aqvz a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private angb f;
    private apup g;
    private ajng h;
    private apji i;
    private apji j;
    private ajwo k;
    private byte l = 2;

    static {
        aqvz aqvzVar = new aqvz();
        a = aqvzVar;
        aihn.registerDefaultInstance(aqvz.class, aqvzVar);
    }

    private aqvz() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005\tᐉ\b\nᐉ\t\fᐉ\n\u000eᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new aqvz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvz.class);
            default:
                return null;
        }
    }
}
