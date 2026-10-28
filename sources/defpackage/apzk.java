package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apzk extends aihn implements aiis {
    public static final apzk a;
    public static final aihl b;
    public int c;
    public ajwo d;
    public ajwo e;
    public ajwo f;
    public boolean g;
    private byte h = 2;

    static {
        apzk apzkVar = new apzk();
        a = apzkVar;
        aihn.registerDefaultInstance(apzk.class, apzkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apzkVar, apzkVar, null, 1748, aika.MESSAGE, apzk.class);
    }

    private apzk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0005\t\u0004\u0000\u0000\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tဇ\b", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new apzk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzk.class);
            default:
                return null;
        }
    }
}
