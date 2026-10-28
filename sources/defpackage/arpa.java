package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arpa extends aihn implements aiis {
    public static final arpa a;
    public static final aihl b;
    private int c;
    private arpb d;
    private ajwo e;
    private ajwn f;
    private byte g = 2;

    static {
        arpa arpaVar = new arpa();
        a = arpaVar;
        aihn.registerDefaultInstance(arpa.class, arpaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arpaVar, arpaVar, null, 64681250, aika.MESSAGE, arpa.class);
    }

    private arpa() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\uf70f⩻\u0003\u0000\u0000\u0003\u0002ᐉ\u0002\u0006ᐉ\u0006\uf70f⩻ᐉ\u0001", new Object[]{"c", "e", "f", "d"});
            case 3:
                return new arpa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arpa.class);
            default:
                return null;
        }
    }
}
