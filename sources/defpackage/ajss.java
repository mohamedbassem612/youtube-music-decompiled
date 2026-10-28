package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajss extends aihn implements aiis {
    public static final ajss a;
    public static final aihl b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;
    private int h;

    static {
        ajss ajssVar = new ajss();
        a = ajssVar;
        aihn.registerDefaultInstance(ajss.class, ajssVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), ajssVar, ajssVar, null, 398019128, aika.MESSAGE, ajss.class);
    }

    private ajss() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"h", "c", "d", "e", "f", "g", alre.a});
        }
        if (iOrdinal == 3) {
            return new ajss();
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
        return aihn.getParserForClass(ajss.class);
    }
}
