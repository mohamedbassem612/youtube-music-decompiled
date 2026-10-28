package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axed {
    private final awtp a = new awtp(0, awts.a);
    public axee[] b;

    private final void h(int i, int i2) {
        axee[] axeeVarArr = this.b;
        axeeVarArr.getClass();
        axee axeeVar = axeeVarArr[i2];
        axeeVar.getClass();
        axee axeeVar2 = axeeVarArr[i];
        axeeVar2.getClass();
        axeeVarArr[i] = axeeVar;
        axeeVarArr[i2] = axeeVar2;
        axeeVar.e(i);
        axeeVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final axee b() {
        axee[] axeeVarArr = this.b;
        if (axeeVarArr != null) {
            return axeeVarArr[0];
        }
        return null;
    }

    public final axee c() {
        axee axeeVarB;
        synchronized (this) {
            axeeVarB = b();
        }
        return axeeVarB;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[LOOP:0: B:9:0x003c->B:18:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[EDGE_INSN: B:21:0x007d->B:19:0x007d BREAK  A[LOOP:0: B:9:0x003c->B:18:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x007d A[EDGE_INSN: B:22:0x007d->B:19:0x007d BREAK  A[LOOP:0: B:9:0x003c->B:18:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[SYNTHETIC] */
    public final axee d(int i) {
        int i2;
        int i3;
        axee[] axeeVarArr;
        int i4;
        axee axeeVar;
        axee axeeVar2;
        axee axeeVar3;
        axee axeeVar4;
        boolean z = awuv.a;
        axee[] axeeVarArr2 = this.b;
        axeeVarArr2.getClass();
        e(a() - 1);
        if (i < a()) {
            h(i, a());
            int i5 = i - 1;
            if (i <= 0) {
                while (true) {
                    i2 = i << 1;
                    i3 = i2 + 1;
                    if (i3 < a()) {
                        break;
                        break;
                    }
                    axeeVarArr = this.b;
                    axeeVarArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < a()) {
                        axeeVar3 = axeeVarArr[i4];
                        axeeVar3.getClass();
                        axeeVar4 = axeeVarArr[i3];
                        axeeVar4.getClass();
                        if (((Comparable) axeeVar3).compareTo(axeeVar4) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    axeeVar = axeeVarArr[i];
                    axeeVar.getClass();
                    axeeVar2 = axeeVarArr[i4];
                    axeeVar2.getClass();
                    if (((Comparable) axeeVar).compareTo(axeeVar2) > 0) {
                        break;
                        break;
                    }
                    h(i, i4);
                    i = i4;
                }
            } else {
                int i6 = i5 / 2;
                axee axeeVar5 = axeeVarArr2[i];
                axeeVar5.getClass();
                axee axeeVar6 = axeeVarArr2[i6];
                axeeVar6.getClass();
                if (((Comparable) axeeVar5).compareTo(axeeVar6) >= 0) {
                    while (true) {
                        i2 = i << 1;
                        i3 = i2 + 1;
                        if (i3 < a()) {
                            break;
                        }
                        axeeVarArr = this.b;
                        axeeVarArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < a()) {
                            axeeVar3 = axeeVarArr[i4];
                            axeeVar3.getClass();
                            axeeVar4 = axeeVarArr[i3];
                            axeeVar4.getClass();
                            if (((Comparable) axeeVar3).compareTo(axeeVar4) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        axeeVar = axeeVarArr[i];
                        axeeVar.getClass();
                        axeeVar2 = axeeVarArr[i4];
                        axeeVar2.getClass();
                        if (((Comparable) axeeVar).compareTo(axeeVar2) > 0) {
                            break;
                        }
                        h(i, i4);
                        i = i4;
                    }
                } else {
                    h(i, i6);
                    f(i6);
                }
            }
        }
        axee axeeVar7 = axeeVarArr2[a()];
        axeeVar7.getClass();
        axeeVar7.d(null);
        axeeVar7.e(-1);
        axeeVarArr2[a()] = null;
        return axeeVar7;
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            axee[] axeeVarArr = this.b;
            axeeVarArr.getClass();
            int i2 = (i - 1) >> 1;
            axee axeeVar = axeeVarArr[i2];
            axeeVar.getClass();
            axee axeeVar2 = axeeVarArr[i];
            axeeVar2.getClass();
            if (((Comparable) axeeVar).compareTo(axeeVar2) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}
