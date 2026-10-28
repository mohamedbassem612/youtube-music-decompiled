package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class airh extends aihn implements aiis {
    public static final airh a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        airh airhVar = new airh();
        a = airhVar;
        aihn.registerDefaultInstance(airh.class, airhVar);
    }

    private airh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000࡚\uf2ebⲋ\u0002\u0000\u0000\u0002࡚м\u0000\uf2ebⲋм\u0000", new Object[]{"c", "b", airn.class, aira.class});
            case 3:
                return new airh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airh.class);
            default:
                return null;
        }
    }
}
