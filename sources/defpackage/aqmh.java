package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqmh extends aihi implements aihj {
    public static final aqmh a;
    public int b;
    public int d;
    public aiqe e;
    public boolean f;
    public aqmf g;
    private byte h = 2;
    public aiie c = emptyProtobufList();

    static {
        aqmh aqmhVar = new aqmh();
        a = aqmhVar;
        aihn.registerDefaultInstance(aqmh.class, aqmhVar);
    }

    private aqmh() {
        aigj aigjVar = aigj.d;
    }

    public final void d() {
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
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဋ\u0001\u0004ဉ\u0003\u000bဇ\b\fဉ\t", new Object[]{"b", "c", aqmg.class, "d", "e", "f", "g"});
            case 3:
                return new aqmh();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmh.class);
            default:
                return null;
        }
    }
}
