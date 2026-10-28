package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asbq extends aihi implements aihj {
    public static final asbq a;
    public int b;
    public boolean c;
    public boolean e;
    public boolean f;
    public aiip d = aiip.a;
    private byte g = 2;

    static {
        asbq asbqVar = new asbq();
        a = asbqVar;
        aihn.registerDefaultInstance(asbq.class, asbqVar);
    }

    private asbq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.INT32;
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0001\u0000\u0000\u0001ဇ\u0000\u00022\u0004ဇ\u0002\u0006ဇ\u0003", new Object[]{"b", "c", "d", new ahud(aikaVar, (Object) 0, aikaVar, (Object) 0), "e", "f"});
            case 3:
                return new asbq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asbq.class);
            default:
                return null;
        }
    }
}
