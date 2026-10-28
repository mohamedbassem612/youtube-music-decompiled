package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afiu extends aihn implements aiis {
    public static final afiu a;
    public int b;
    public aiip d = aiip.a;
    private byte e = 2;
    public int c = 1;

    static {
        afiu afiuVar = new afiu();
        a = afiuVar;
        aihn.registerDefaultInstance(afiu.class, afiuVar);
    }

    private afiu() {
    }

    public final aiip a() {
        aiip aiipVar = this.d;
        if (!aiipVar.b) {
            this.d = aiipVar.a();
        }
        return this.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new Object[]{"b", "c", "d", new ahud(aika.INT32, (Object) 0, aika.MESSAGE, (Object) afiw.a)});
            case 3:
                return new afiu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(afiu.class);
            default:
                return null;
        }
    }
}
