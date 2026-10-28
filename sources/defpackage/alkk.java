package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alkk extends aihn implements aiis {
    public static final alkk a;
    public static final aihl b;
    public int c;
    public ajwo d;
    public ajwo e;
    public ajwo f;
    public ajwo g;
    public apji h;
    public ajwo j;
    public aiip k = aiip.a;
    private byte l = 2;
    public aiie i = emptyProtobufList();

    static {
        alkk alkkVar = new alkk();
        a = alkkVar;
        aihn.registerDefaultInstance(alkk.class, alkkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, alkkVar, alkkVar, null, 196607391, aika.MESSAGE, alkk.class);
    }

    private alkk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0001\u0001\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005\bв", new Object[]{"c", "d", "e", "f", "g", "h", "i", apji.class, "j", "k", new ahud(aika.STRING, "", aika.MESSAGE, ajwo.a)});
            case 3:
                return new alkk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkk.class);
            default:
                return null;
        }
    }
}
