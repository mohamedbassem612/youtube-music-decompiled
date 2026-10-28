package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiww extends aihn implements aiis {
    public static final aiww a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aiww aiwwVar = new aiww();
        a = aiwwVar;
        aihn.registerDefaultInstance(aiww.class, aiwwVar);
    }

    private aiww() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000ﻊ⍒\uf28e園\u0002\u0000\u0000\u0002ﻊ⍒м\u0000\uf28e園м\u0000", new Object[]{"c", "b", aosu.class, anwb.class});
            case 3:
                return new aiww();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiww.class);
            default:
                return null;
        }
    }
}
