package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awyx extends awyy {
    private final awqk d;

    public /* synthetic */ awyx(awqk awqkVar) {
        this(awqkVar, awov.a, -2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [awyp] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // defpackage.awyy, defpackage.axbi
    public final Object a(awyp awypVar, awoq awoqVar) throws Throwable {
        awyw awywVar;
        ?? r5;
        if (awoqVar instanceof awyw) {
            awywVar = (awyw) awoqVar;
            int i = awywVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                awywVar.d = i - Integer.MIN_VALUE;
            } else {
                awywVar = new awyw(this, awoqVar);
            }
        } else {
            awywVar = new awyw(this, awoqVar);
        }
        Object obj = awywVar.b;
        awox awoxVar = awox.a;
        int i2 = awywVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            awywVar.a = awypVar;
            awywVar.d = 1;
            if (awyy.c(this, awypVar, awywVar) == awoxVar) {
                r5 = awypVar;
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = awywVar.a;
            atqp.j(obj);
            r5 = obj2;
        }
        r5 = awypVar;
        if (r5.y()) {
            return awmy.a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // defpackage.awyy, defpackage.axbi
    protected final axbi b(awou awouVar, int i, int i2) {
        return new awyx(this.d, awouVar, i, i2);
    }

    public awyx(awqk awqkVar, awou awouVar, int i, int i2) {
        super(awqkVar, awouVar, i, i2);
        this.d = awqkVar;
    }
}
