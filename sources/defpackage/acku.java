package defpackage;

import android.content.Context;
import android.util.TypedValue;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acku extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ axlj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acku(axlj axljVar, Context context, int i, awoq awoqVar, int i2) {
        super(2, awoqVar);
        this.$cid = i2;
        this.c = axljVar;
        this.a = context;
        this.b = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new acku(this.c, this.a, this.b, awoqVar, 1, null) : new acku(this.c, this.a, this.b, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((acku) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((acku) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        if (this.$cid != 0) {
            atqp.j(obj);
            try {
                return axlj.H(this.a, this.b);
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
                return null;
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }
        atqp.j(obj);
        Context context = this.a;
        context.getClass();
        int i = this.b;
        boolean zBooleanValue = false;
        int i2 = 0;
        if (i != 0) {
            long j = i;
            Object obj2 = this.c.b;
            acla aclaVar = (acla) obj2;
            Object objA = aclaVar.a(j);
            if (objA == null) {
                boolean z = true;
                try {
                    TypedValue typedValue = new TypedValue();
                    context.getResources().getValue(i, typedValue, true);
                    CharSequence charSequence = typedValue.string;
                    if (charSequence == null || !awrc.w(charSequence, charSequence.length() - ".xml".length(), ".xml", 0, ".xml".length(), true)) {
                        z = false;
                    }
                } catch (Exception unused2) {
                }
                Object obj3 = aclaVar.a;
                Boolean boolValueOf = Boolean.valueOf(z);
                synchronized (obj3) {
                    axmq[] axmqVarArr = ((acla) obj2).b;
                    int length = axmqVarArr.length;
                    while (true) {
                        if (i2 >= length) {
                            ((acla) obj2).b = ((acla) obj2).c(axmqVarArr, new axmq(j, boolValueOf));
                            objA = boolValueOf;
                            break;
                        }
                        axmq axmqVar = axmqVarArr[i2];
                        if (axmqVar.a == j) {
                            objA = axmqVar.b;
                            break;
                        }
                        i2++;
                    }
                }
            }
            zBooleanValue = ((Boolean) objA).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acku(axlj axljVar, Context context, int i, awoq awoqVar, int i2, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i2;
        this.c = axljVar;
        this.a = context;
        this.b = i;
    }
}
