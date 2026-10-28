package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apqc extends aihn implements aiis {
    public static final apqc a;
    public int b;
    public int c = 0;
    public Object d;
    public apru e;

    static {
        apqc apqcVar = new apqc();
        a = apqcVar;
        aihn.registerDefaultInstance(apqc.class, apqcVar);
    }

    private apqc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002;\u0000\u0003:\u0000\u00045\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new apqc();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(apqc.class);
    }
}
