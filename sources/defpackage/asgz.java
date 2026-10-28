package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asgz extends aihn implements aiis {
    public static final asgz a;
    public int b;
    public int c;
    public asgy d;
    public asgy e;
    public aomc g;
    private byte h = 2;
    public aiie f = emptyProtobufList();

    static {
        asgz asgzVar = new asgz();
        a = asgzVar;
        aihn.registerDefaultInstance(asgz.class, asgzVar);
    }

    private asgz() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001᠌\u0000\u0002ဉ\u0002\u0003\u001b\u0004ᐉ\u0003\u0005ဉ\u0001", new Object[]{"b", "c", aqvi.c, "e", "f", asgy.class, "g", "d"});
            case 3:
                return new asgz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asgz.class);
            default:
                return null;
        }
    }
}
