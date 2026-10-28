package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apqf extends aihn implements aiis {
    public static final apqf a;
    public static final aihl b;
    public int c;
    public Object e;
    public int d = 0;
    private byte h = 2;
    public String f = "";
    public aiie g = emptyProtobufList();

    static {
        apqf apqfVar = new apqf();
        a = apqfVar;
        aihn.registerDefaultInstance(apqf.class, apqfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apqfVar, apqfVar, null, 77872990, aika.MESSAGE, apqf.class);
    }

    private apqf() {
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
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002;\u0000\u0003:\u0000\u00045\u0000\u0005Л", new Object[]{"e", "d", "c", "f", "g", ajwo.class});
            case 3:
                return new apqf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqf.class);
            default:
                return null;
        }
    }
}
