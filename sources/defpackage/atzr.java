package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atzr extends aihn implements aiis {
    public static final atzr a;
    private aiip b;
    private aiip c;
    private byte d;

    static {
        atzr atzrVar = new atzr();
        a = atzrVar;
        aihn.registerDefaultInstance(atzr.class, atzrVar);
    }

    private atzr() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
        this.d = (byte) 2;
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.UINT32;
                aika aikaVar2 = aika.MESSAGE;
                atzq atzqVar = atzq.a;
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0018\u0019\u0002\u0002\u0000\u0000\u00182\u00192", new Object[]{"b", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) atzqVar), "c", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) atzqVar)});
            case 3:
                return new atzr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atzr.class);
            default:
                return null;
        }
    }
}
