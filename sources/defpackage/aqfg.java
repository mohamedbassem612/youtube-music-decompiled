package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqfg extends aihn implements aiis {
    public static final aqfg a;
    public static final aihl b;
    public int c;
    public Object e;
    public int g;
    public boolean h;
    public boolean i;
    public int d = 0;
    private byte j = 2;
    public String f = "";

    static {
        aqfg aqfgVar = new aqfg();
        a = aqfgVar;
        aihn.registerDefaultInstance(aqfg.class, aqfgVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, aqfgVar, aqfgVar, null, SemanticState.Hidden, aika.MESSAGE, aqfg.class);
    }

    private aqfg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002;\u0000\u0003м\u0000\u0004᠌\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"e", "d", "c", "f", aktj.class, "g", aqcj.r, "h", "i"});
            case 3:
                return new aqfg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqfg.class);
            default:
                return null;
        }
    }
}
