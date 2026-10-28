package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmo extends aihn implements aiis {
    public static final ajmo a;
    public static final aihl b;
    public int c;
    public ajmv d;
    private byte f = 2;
    public String e = "";

    static {
        ajmo ajmoVar = new ajmo();
        a = ajmoVar;
        aihn.registerDefaultInstance(ajmo.class, ajmoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajmoVar, ajmoVar, null, 1333, aika.MESSAGE, ajmo.class);
    }

    private ajmo() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new ajmo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmo.class);
            default:
                return null;
        }
    }
}
