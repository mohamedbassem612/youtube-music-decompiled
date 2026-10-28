package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoej extends aihn implements aiis {
    public static final aoej a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private int i;
    private int j;

    static {
        aoej aoejVar = new aoej();
        a = aoejVar;
        aihn.registerDefaultInstance(aoej.class, aoejVar);
    }

    private aoej() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0002\u0004D\u0007\u0000\u0000\u0000\u0004ဇ\u0003\tင\u0007\u0016ဇ\u0014\u001fဇ\u001f?ဇ;Bဇ=Dဇ?", new Object[]{"i", "j", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aoej();
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
        return aihn.getParserForClass(aoej.class);
    }
}
