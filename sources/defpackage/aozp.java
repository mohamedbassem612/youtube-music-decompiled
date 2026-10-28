package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozp extends aihn implements aiis {
    public static final aozp a;
    public static final aihl b;
    public int c;
    public String d = "";
    public int e;

    static {
        aozp aozpVar = new aozp();
        a = aozpVar;
        aihn.registerDefaultInstance(aozp.class, aozpVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aozpVar, aozpVar, null, 314223858, aika.MESSAGE, aozp.class);
    }

    private aozp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aozp();
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
        return aihn.getParserForClass(aozp.class);
    }
}
