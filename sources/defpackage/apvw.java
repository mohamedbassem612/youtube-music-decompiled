package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apvw extends aihn implements aiis {
    public static final apvw a;
    public static final aihl b;
    private byte c = 2;

    static {
        apvw apvwVar = new apvw();
        a = apvwVar;
        aihn.registerDefaultInstance(apvw.class, apvwVar);
        b = aihn.newSingularGeneratedExtension(apji.a, apvwVar, apvwVar, null, 1140, aika.MESSAGE, apvw.class);
    }

    private apvw() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new apvw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvw.class);
            default:
                return null;
        }
    }
}
