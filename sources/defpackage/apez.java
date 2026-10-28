package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apez extends aihn implements aiis {
    public static final apez a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        apez apezVar = new apez();
        a = apezVar;
        aihn.registerDefaultInstance(apez.class, apezVar);
    }

    private apez() {
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
                return newMessageInfo(a, "\u0004\u000e\u0001\u0000ϩﾹ\uf84a\u0007\u000e\u0000\u0000\u000eϩм\u0000Ҟм\u0000Եм\u0000ݼм\u0000ࠖм\u0000ॢм\u0000ਥм\u0000通м\u0000醁м\u0000\ue8ab䊾м\u0000ﭟ짥м\u0000\uf323\ue5a8\u0007м\u0000\uf0d9\uefac\u0007м\u0000ﾹ\uf84a\u0007м\u0000", new Object[]{"c", "b", apvk.class, apfj.class, apfv.class, anhe.class, apfz.class, aljo.class, apge.class, apgc.class, apga.class, apey.class, aljp.class, aqcf.class, apff.class, aljq.class});
            case 3:
                return new apez();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apez.class);
            default:
                return null;
        }
    }
}
