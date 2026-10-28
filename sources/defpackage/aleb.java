package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aleb extends aihn implements aiis {
    public static final aleb a;
    public static final aihl b;
    public int c;
    public apvn f;
    public apww h;
    public String d = "";
    public String e = "";
    public aiie g = emptyProtobufList();

    static {
        aleb alebVar = new aleb();
        a = alebVar;
        aihn.registerDefaultInstance(aleb.class, alebVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, alebVar, alebVar, null, 359870813, aika.MESSAGE, aleb.class);
    }

    private aleb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0006ဉ\u0003", new Object[]{"c", "d", "e", "f", "g", apwy.class, "h"});
        }
        if (iOrdinal == 3) {
            return new aleb();
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
        return aihn.getParserForClass(aleb.class);
    }
}
