package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwz extends aihn implements aiis {
    public static final aiwz a;
    public static final aihl b;
    public int c;
    public aixa d;
    private byte e = 2;

    static {
        aiwz aiwzVar = new aiwz();
        a = aiwzVar;
        aihn.registerDefaultInstance(aiwz.class, aiwzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aiwzVar, aiwzVar, null, 76623563, aika.MESSAGE, aiwz.class);
    }

    private aiwz() {
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
                return new aiwz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiwz.class);
            default:
                return null;
        }
    }
}
