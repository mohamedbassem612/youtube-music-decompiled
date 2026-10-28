package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class astd extends aihn implements aiis {
    public static final astd a;
    public static final aihl b;
    public String c = "";
    public ason d;
    public int e;
    private int f;

    static {
        astd astdVar = new astd();
        a = astdVar;
        aihn.registerDefaultInstance(astd.class, astdVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), astdVar, astdVar, null, 525000057, aika.MESSAGE, astd.class);
    }

    private astd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"f", "c", "d", "e", asmm.t});
        }
        if (iOrdinal == 3) {
            return new astd();
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
        return aihn.getParserForClass(astd.class);
    }
}
