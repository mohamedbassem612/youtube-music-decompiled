package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aibg extends aihn implements aiis {
    public static final aibg a;
    public int b;
    public int c;
    public aiby e;
    public aibw g;
    public aibm h;
    public aieu i;
    public String j;
    public int k;
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        aibg aibgVar = new aibg();
        a = aibgVar;
        aihn.registerDefaultInstance(aibg.class, aibgVar);
    }

    private aibg() {
        emptyProtobufList();
        this.j = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u000f\t\u0000\u0001\u0000\u0001ဈ\u0001\u0003\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\n᠌\u0000\fဉ\u0005\rဈ\u0006\u000fင\u0007", new Object[]{"b", "d", "f", "e", "g", "h", "c", aibu.d, "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new aibg();
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
        return aihn.getParserForClass(aibg.class);
    }
}
