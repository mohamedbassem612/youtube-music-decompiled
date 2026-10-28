package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aimj extends aihn implements aiis {
    public static final aimj a;
    public aiip b = aiip.a;
    private byte c = 2;

    static {
        aimj aimjVar = new aimj();
        a = aimjVar;
        aihn.registerDefaultInstance(aimj.class, aimjVar);
    }

    private aimj() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, aiml.a)});
            case 3:
                return new aimj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aimj.class);
            default:
                return null;
        }
    }
}
