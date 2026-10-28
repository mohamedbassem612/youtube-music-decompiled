package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aplt extends aihn implements aiis {
    public static final aplt a;
    public static final aihl b;
    public int c;
    public long e;
    public float g;
    public asqm h;
    public int i;
    public boolean j;
    public apls k;
    public long m;
    private byte n = 2;
    public String d = "";
    public String f = "";
    public String l = "";

    static {
        aplt apltVar = new aplt();
        a = apltVar;
        aihn.registerDefaultInstance(aplt.class, apltVar);
        b = aihn.newSingularGeneratedExtension(asow.a, apltVar, apltVar, null, 525000000, aika.MESSAGE, aplt.class);
    }

    private aplt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0004\u0004ခ\u0005\u0005ဋ\b\u0007ဇ\t\bဂ\u0001\tᐉ\n\fဈ\u000b\rဂ\f\u000eဉ\u0006", new Object[]{"c", "d", "f", "g", "i", "j", "e", "k", "l", "m", "h"});
            case 3:
                return new aplt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aplt.class);
            default:
                return null;
        }
    }
}
