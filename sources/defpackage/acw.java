package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class acw {
    public static final bhy c(bih bihVar, byte[] bArr) {
        if (bihVar.b() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (bihVar.b() >= 0) {
            return new bhw(bArr);
        }
        throw new IllegalStateException("Wrote more data than expected.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(awoq awoqVar) throws Throwable {
        amk amkVar;
        if (awoqVar instanceof amk) {
            amkVar = (amk) awoqVar;
            int i = amkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                amkVar.b = i - Integer.MIN_VALUE;
            } else {
                amkVar = new amk(this, awoqVar);
            }
        } else {
            amkVar = new amk(this, awoqVar);
        }
        Object obj = amkVar.a;
        int i2 = amkVar.b;
        if (i2 == 0) {
            atqp.j(obj);
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            long j = ((apk) obj).a;
        }
        return new apk();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(awoq awoqVar) throws Throwable {
        aml amlVar;
        if (awoqVar instanceof aml) {
            amlVar = (aml) awoqVar;
            int i = amlVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                amlVar.b = i - Integer.MIN_VALUE;
            } else {
                amlVar = new aml(this, awoqVar);
            }
        } else {
            amlVar = new aml(this, awoqVar);
        }
        Object obj = amlVar.a;
        int i2 = amlVar.b;
        if (i2 == 0) {
            atqp.j(obj);
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            long j = ((apk) obj).a;
        }
        return new apk();
    }
}
