package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afux extends afuy implements afuw {
    public static final afuy a = new afux(null, new aha(0)).f();
    static final afuy b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        afuw afuwVarB = afuy.b();
        afuwVarB.a(afuy.e, Boolean.TRUE);
        b = ((afuy) afuwVarB).f();
    }

    @Override // defpackage.afuw
    public final void a(aguu aguuVar, Object obj) {
        ahno.P(!this.d, "Can't mutate after handing to trace");
        obj.getClass();
        ahno.P(!i(aguuVar), "Key already present");
        this.c.put(aguuVar, obj);
    }
}
