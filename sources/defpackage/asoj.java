package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asoj extends aihn implements aiis {
    public static final asoj a;
    public static final aihl b;
    public int c;
    public long d;
    public String e = "";

    static {
        asoj asojVar = new asoj();
        a = asojVar;
        aihn.registerDefaultInstance(asoj.class, asojVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asojVar, asojVar, null, 428067722, aika.MESSAGE, asoj.class);
    }

    private asoj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new asoj();
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
        return aihn.getParserForClass(asoj.class);
    }
}
