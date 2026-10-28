package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammy extends aihn implements aiis {
    public static final ammy a;
    public static final aihl b;
    public int c;
    public apji d;
    public int e;
    private byte f = 2;

    static {
        ammy ammyVar = new ammy();
        a = ammyVar;
        aihn.registerDefaultInstance(ammy.class, ammyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammyVar, ammyVar, null, 238110852, aika.MESSAGE, ammy.class);
    }

    private ammy() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new ammy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammy.class);
            default:
                return null;
        }
    }
}
