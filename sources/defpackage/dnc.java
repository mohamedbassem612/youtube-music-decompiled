package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnc implements awzd {
    final /* synthetic */ awrm a;
    final /* synthetic */ awzd b;
    final /* synthetic */ String[] c;
    final /* synthetic */ int[] d;

    public dnc(awrm awrmVar, awzd awzdVar, String[] strArr, int[] iArr) {
        this.a = awrmVar;
        this.b = awzdVar;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.awzd
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(int[] iArr, awoq awoqVar) throws Throwable {
        dnb dnbVar;
        if (awoqVar instanceof dnb) {
            dnbVar = (dnb) awoqVar;
            int i = dnbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnbVar.c = i - Integer.MIN_VALUE;
            } else {
                dnbVar = new dnb(this, awoqVar);
            }
        } else {
            dnbVar = new dnb(this, awoqVar);
        }
        Object obj = dnbVar.a;
        awox awoxVar = awox.a;
        int i2 = dnbVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            awrm awrmVar = this.a;
            if (awrmVar.a == null) {
                awzd awzdVar = this.b;
                Set setAS = atqq.aS(this.c);
                dnbVar.d = iArr;
                dnbVar.c = 1;
                if (awzdVar.emit(setAS, dnbVar) == awoxVar) {
                    return awoxVar;
                }
            } else {
                String[] strArr = this.c;
                int[] iArr2 = this.d;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                int i4 = 0;
                while (i3 < strArr.length) {
                    String str = strArr[i3];
                    int i5 = i4 + 1;
                    Object obj2 = awrmVar.a;
                    if (obj2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    int i6 = iArr2[i4];
                    if (((int[]) obj2)[i6] != iArr[i6]) {
                        arrayList.add(str);
                    }
                    i3++;
                    i4 = i5;
                }
                if (!arrayList.isEmpty()) {
                    awzd awzdVar2 = this.b;
                    Set setAw = atqq.aw(arrayList);
                    dnbVar.d = iArr;
                    dnbVar.c = 2;
                    if (awzdVar2.emit(setAw, dnbVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iArr = dnbVar.d;
            atqp.j(obj);
        }
        this.a.a = iArr;
        return awmy.a;
    }
}
