package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asrb extends aihn implements aiis {
    public static final asrb a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        asrb asrbVar = new asrb();
        a = asrbVar;
        aihn.registerDefaultInstance(asrb.class, asrbVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asrbVar, asrbVar, null, 525000117, aika.MESSAGE, asrb.class);
    }

    private asrb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new asrb();
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
        return aihn.getParserForClass(asrb.class);
    }
}
