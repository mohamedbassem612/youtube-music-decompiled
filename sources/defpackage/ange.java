package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ange extends aihn implements aiis {
    public static final ange a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ange angeVar = new ange();
        a = angeVar;
        aihn.registerDefaultInstance(ange.class, angeVar);
    }

    private ange() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000陋⊅\uef56\u2cf8\u0003\u0000\u0000\u0003陋⊅м\u0000\ue97d✹м\u0000\uef56\u2cf8м\u0000", new Object[]{"c", "b", anrp.class, angd.class, akdh.class});
            case 3:
                return new ange();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ange.class);
            default:
                return null;
        }
    }
}
