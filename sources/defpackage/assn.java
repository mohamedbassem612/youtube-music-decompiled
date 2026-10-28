package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class assn extends aihn implements aiis {
    public static final assn a;
    public static final aihl b;
    public int c;
    public boolean d;
    private int e;

    static {
        assn assnVar = new assn();
        a = assnVar;
        aihn.registerDefaultInstance(assn.class, assnVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), assnVar, assnVar, null, 445532692, aika.MESSAGE, assn.class);
    }

    private assn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"e", "c", assp.b, "d"});
        }
        if (iOrdinal == 3) {
            return new assn();
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
        return aihn.getParserForClass(assn.class);
    }
}
