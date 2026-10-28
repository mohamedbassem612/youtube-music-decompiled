package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asqw extends aihn implements aiis {
    public static final asqw a;
    public static final aihl b;
    public int c;
    public String d = "";

    static {
        asqw asqwVar = new asqw();
        a = asqwVar;
        aihn.registerDefaultInstance(asqw.class, asqwVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asqwVar, asqwVar, null, 455760642, aika.MESSAGE, asqw.class);
    }

    private asqw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new asqw();
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
        return aihn.getParserForClass(asqw.class);
    }
}
