package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbx extends aihn implements aiis {
    public static final ajbx a;
    public int b;
    public aiie c = emptyProtobufList();
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        ajbx ajbxVar = new ajbx();
        a = ajbxVar;
        aihn.registerDefaultInstance(ajbx.class, ajbxVar);
    }

    private ajbx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\t\u001a\t\u0000\u0001\u0000\t\u001b\nဇ\b\fခ\n\u0012ဇ\u0011\u0015ဇ\u0014\u0017ဇ\u0015\u0018ခ\u000b\u0019ဇ\u0016\u001aဇ\u0017", new Object[]{"b", "c", ajbw.class, "d", "e", "g", "h", "i", "f", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new ajbx();
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
        return aihn.getParserForClass(ajbx.class);
    }
}
