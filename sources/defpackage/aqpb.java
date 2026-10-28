package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqpb extends aihn implements aiis {
    public static final aqpb a;
    public static final aihl b;
    public int c;
    public int d;
    public String e;
    public boolean f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;
    public int o;

    static {
        aqpb aqpbVar = new aqpb();
        a = aqpbVar;
        aihn.registerDefaultInstance(aqpb.class, aqpbVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, aqpbVar, aqpbVar, null, 330586086, aika.MESSAGE, aqpb.class);
    }

    private aqpb() {
        emptyProtobufList();
        this.e = "";
        this.g = "";
        this.l = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0001\u0002\u0011\f\u0000\u0000\u0000\u0002᠌\u0000\u0003ဈ\u0001\u0005ဇ\u0002\u0006ဈ\u0003\t᠌\u0005\u000b᠌\u0007\f᠌\b\r᠌\t\u000eဈ\n\u000fဇ\u000b\u0010ဇ\f\u0011᠌\r", new Object[]{"c", "d", aofw.n, "e", "f", "g", "h", akjs.j, "i", aobi.f, "j", aqkp.u, "k", aqkp.r, "l", "m", "n", "o", aqkp.t});
        }
        if (iOrdinal == 3) {
            return new aqpb();
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
        return aihn.getParserForClass(aqpb.class);
    }
}
