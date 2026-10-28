package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajdb extends aihn implements aiis {
    public static final ajdb a;
    public static final aihl b;
    public int c;
    public Object e;
    public aqmh f;
    public int g;
    public boolean h;
    public int i;
    public int d = 0;
    private byte j = 2;

    static {
        ajdb ajdbVar = new ajdb();
        a = ajdbVar;
        aihn.registerDefaultInstance(ajdb.class, ajdbVar);
        b = aihn.newSingularGeneratedExtension(apji.a, ajdbVar, ajdbVar, null, 179869979, aika.MESSAGE, ajdb.class);
    }

    private ajdb() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003>\u0000\u0004᠌\u0003\u0005ဇ\u0002\u0006:\u0000\u0007:\u0000", new Object[]{"e", "d", "c", "f", "g", aobf.d, "i", aobf.e, "h"});
            case 3:
                return new ajdb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajdb.class);
            default:
                return null;
        }
    }
}
