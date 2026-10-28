package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atys extends aihn implements aiis {
    public static final atys a;
    public int b;
    public int c;
    public atyq d;
    public String e;
    public aiip f;
    private int g;
    private aiip h;

    static {
        atys atysVar = new atys();
        a = atysVar;
        aihn.registerDefaultInstance(atys.class, atysVar);
    }

    private atys() {
        aiip aiipVar = aiip.a;
        this.f = aiipVar;
        this.h = aiipVar;
        emptyProtobufList();
        this.e = "";
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.UINT32;
            aika aikaVar2 = aika.MESSAGE;
            atyr atyrVar = atyr.a;
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0019\u0006\u0002\u0000\u0000\u0001\f\u0006\u000b\nဉ\u0000\u000eȈ\u00102\u00192", new Object[]{"g", "b", "c", "d", "e", "f", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) atyrVar), "h", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) atyrVar)});
        }
        if (iOrdinal == 3) {
            return new atys();
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
        return aihn.getParserForClass(atys.class);
    }
}
