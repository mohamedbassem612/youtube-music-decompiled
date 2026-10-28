package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alcq extends aihn implements aiis {
    public static final alcq a;
    public static final aihl b;
    public String c = "";
    public String d = "";
    private int e;

    static {
        alcq alcqVar = new alcq();
        a = alcqVar;
        aihn.registerDefaultInstance(alcq.class, alcqVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), alcqVar, alcqVar, null, 421321174, aika.MESSAGE, alcq.class);
    }

    private alcq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new alcq();
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
        return aihn.getParserForClass(alcq.class);
    }
}
