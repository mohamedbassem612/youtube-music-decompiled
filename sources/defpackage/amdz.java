package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdz extends aihn implements aiis {
    public static final amdz a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public float h;
    public boolean i;

    static {
        amdz amdzVar = new amdz();
        a = amdzVar;
        aihn.registerDefaultInstance(amdz.class, amdzVar);
    }

    private amdz() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001 \u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0019ဇ\u0016\u001aဇ\u0017\u001cဇ\u0019\u001dဇ\u001a\u001eခ\u001b ဇ\u001d", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new amdz();
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
        return aihn.getParserForClass(amdz.class);
    }
}
