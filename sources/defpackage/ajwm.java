package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajwm extends aihn implements aiis {
    public static final ajwm a;
    public static final aihl b;
    private byte d = 2;
    public aiie c = emptyProtobufList();

    static {
        ajwm ajwmVar = new ajwm();
        a = ajwmVar;
        aihn.registerDefaultInstance(ajwm.class, ajwmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajwmVar, ajwmVar, null, 174116574, aika.MESSAGE, ajwm.class);
    }

    private ajwm() {
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", ajwo.class});
            case 3:
                return new ajwm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajwm.class);
            default:
                return null;
        }
    }
}
