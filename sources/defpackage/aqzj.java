package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqzj extends aihn implements aiis {
    public static final aqzj a;
    public static final aihl b;
    public apji c;
    private int d;
    private apji e;
    private byte f = 2;

    static {
        aqzj aqzjVar = new aqzj();
        a = aqzjVar;
        aihn.registerDefaultInstance(aqzj.class, aqzjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzjVar, aqzjVar, null, 219123099, aika.MESSAGE, aqzj.class);
    }

    private aqzj() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "c", "e"});
            case 3:
                return new aqzj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzj.class);
            default:
                return null;
        }
    }
}
