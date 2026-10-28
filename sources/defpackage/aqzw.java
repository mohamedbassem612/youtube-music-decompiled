package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqzw extends aihn implements aiis {
    public static final aqzw a;
    public static final aihl b;
    public int c;
    public alay d;
    public alay e;
    public int f;
    private byte g = 2;

    static {
        aqzw aqzwVar = new aqzw();
        a = aqzwVar;
        aihn.registerDefaultInstance(aqzw.class, aqzwVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzwVar, aqzwVar, null, 136527603, aika.MESSAGE, aqzw.class);
    }

    private aqzw() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"c", "d", "e", "f", aqkp.j});
            case 3:
                return new aqzw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzw.class);
            default:
                return null;
        }
    }
}
