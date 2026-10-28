package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aulk extends aihi implements aihj {
    public static final aulk a;
    public int b;
    public aiou c;
    public int d;
    public ahxa e;
    private byte f = 2;

    static {
        aulk aulkVar = new aulk();
        a = aulkVar;
        aihn.registerDefaultInstance(aulk.class, aulkVar);
    }

    private aulk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", audg.i, "e"});
            case 3:
                return new aulk();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aulk.class);
            default:
                return null;
        }
    }
}
