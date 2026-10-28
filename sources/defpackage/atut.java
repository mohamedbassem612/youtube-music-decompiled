package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atut extends aihn implements aiis {
    public static final atut a;
    public atte b;
    private int d;
    public aiip c = aiip.a;
    private byte e = 2;

    static {
        atut atutVar = new atut();
        a = atutVar;
        aihn.registerDefaultInstance(atut.class, atutVar);
    }

    private atut() {
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
                aika aikaVar = aika.STRING;
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001ᐉ\u0000\u00022", new Object[]{"d", "b", "c", new ahud(aikaVar, "", aikaVar, "")});
            case 3:
                return new atut();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atut.class);
            default:
                return null;
        }
    }
}
