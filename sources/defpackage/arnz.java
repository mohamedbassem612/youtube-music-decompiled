package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arnz extends aihn implements aiis {
    public static final arnz a;
    public static final aihl b;
    public int c;
    public aqgx d;
    private byte e = 2;

    static {
        arnz arnzVar = new arnz();
        a = arnzVar;
        aihn.registerDefaultInstance(arnz.class, arnzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arnzVar, arnzVar, null, 152893416, aika.MESSAGE, arnz.class);
    }

    private arnz() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new arnz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arnz.class);
            default:
                return null;
        }
    }
}
