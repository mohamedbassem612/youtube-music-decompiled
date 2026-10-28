package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ajig extends aihn implements aiis {
    public static final ajig a;
    public static final aihl b;
    private int c;
    private ajwo d;
    private byte e = 2;

    static {
        ajig ajigVar = new ajig();
        a = ajigVar;
        aihn.registerDefaultInstance(ajig.class, ajigVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajigVar, ajigVar, null, 354181190, aika.MESSAGE, ajig.class);
    }

    private ajig() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐉ\t", new Object[]{"c", "d"});
            case 3:
                return new ajig();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajig.class);
            default:
                return null;
        }
    }
}
