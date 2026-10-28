package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqkw extends aihn implements aiis {
    public static final aqkw a;
    public static final aihl b;
    public int c;
    public boolean d;
    public int h;
    public int j;
    public int k;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aihp i = emptyBooleanList();

    static {
        aqkw aqkwVar = new aqkw();
        a = aqkwVar;
        aihn.registerDefaultInstance(aqkw.class, aqkwVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aqkwVar, aqkwVar, null, 368511790, aika.MESSAGE, aqkw.class);
    }

    private aqkw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0004\u0000\u0001ဇ\u0000\u0002\u001a\u0004\u001a\u0005\u001b\u0006᠌\u0001\u0007\u0019\b᠌\u0002\t᠌\u0003", new Object[]{"c", "d", "e", "g", "f", aigu.class, "h", aram.j, "i", "j", aqkp.d, "k", aqkp.c});
        }
        if (iOrdinal == 3) {
            return new aqkw();
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
        return aihn.getParserForClass(aqkw.class);
    }
}
