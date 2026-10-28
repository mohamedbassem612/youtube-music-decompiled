package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class augn extends aihn implements aiis {
    public static final augn a;
    public static final aihl b;
    public int c;
    private int d;
    private auiq e;
    private argq f;
    private byte g = 2;

    static {
        augn augnVar = new augn();
        a = augnVar;
        aihn.registerDefaultInstance(augn.class, augnVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, augnVar, augnVar, null, 1010, aika.MESSAGE, augn.class);
    }

    private augn() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0001\u0002᠌\u0000\u0003ᐉ\u0001\u0005ဉ\u0003", new Object[]{"d", "c", audg.g, "e", "f"});
            case 3:
                return new augn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(augn.class);
            default:
                return null;
        }
    }
}
