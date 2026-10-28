package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyv extends aihn implements aiis {
    public static final akyv a;
    public static final aihl b;
    public int c;
    public apji d;
    private byte f = 2;
    public String e = "";

    static {
        akyv akyvVar = new akyv();
        a = akyvVar;
        aihn.registerDefaultInstance(akyv.class, akyvVar);
        b = aihn.newSingularGeneratedExtension(apji.a, akyvVar, akyvVar, null, 420115721, aika.MESSAGE, akyv.class);
    }

    private akyv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new akyv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyv.class);
            default:
                return null;
        }
    }
}
