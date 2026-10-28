package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aimh extends aihn implements aiis {
    public static final aimh a;
    public aiip b = aiip.a;
    private byte c = 2;

    static {
        aimh aimhVar = new aimh();
        a = aimhVar;
        aihn.registerDefaultInstance(aimh.class, aimhVar);
    }

    private aimh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, aima.a)});
            case 3:
                return new aimh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aimh.class);
            default:
                return null;
        }
    }
}
