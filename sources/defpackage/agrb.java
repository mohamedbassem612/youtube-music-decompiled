package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agrb extends agrl implements agru {
    protected agrb(Level level) {
        super(level);
    }

    @Override // defpackage.agrl
    protected final agvi a() {
        return agvg.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [agsc] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [agsc] */
    /* JADX WARN: Type inference failed for: r15v9, types: [agsf] */
    @Override // defpackage.agrl
    protected final boolean b(agrp agrpVar) {
        int iA;
        int i;
        agsc agscVar;
        agqx agqxVar;
        agsc agscVar2;
        ?? r15;
        agta agtaVarM = m();
        int iB = agtaVarM.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if (agtaVarM.c(i2).a == "eye3tag") {
                if (agtaVarM.d(agrj.a) != null) {
                    break;
                }
                agrx agrxVar = agrj.i;
                if (agtaVarM.d(agrxVar) != null) {
                    break;
                }
                r(agrxVar, agsi.SMALL);
                break;
            }
        }
        agrk agrkVar = this.c;
        if (agrkVar != null) {
            if (agrpVar != null) {
                long j = this.b;
                agrr agrrVar = agra.a;
                agqz agqzVar = (agqz) agrkVar.d(agrj.d);
                if (agqzVar == null) {
                    agscVar = null;
                } else {
                    agra agraVar = (agra) agra.a.b(agrpVar, agrkVar);
                    if (j < 0) {
                        throw new IllegalArgumentException("timestamp cannot be negative");
                    }
                    AtomicLong atomicLong = agraVar.b;
                    long j2 = atomicLong.get();
                    if (j2 >= 0) {
                        long nanos = agqzVar.b.toNanos(agqzVar.a) + j2;
                        if (nanos < 0 || j < nanos) {
                            agscVar = agra.c;
                        } else {
                            atomicLong.compareAndSet(j2, -j);
                            agscVar = agraVar;
                        }
                    } else {
                        atomicLong.compareAndSet(j2, -j);
                        agscVar = agraVar;
                    }
                }
                agrk agrkVar2 = this.c;
                agrr agrrVar2 = agqx.a;
                Integer num = (Integer) agrkVar2.d(agrj.b);
                if (num == null) {
                    agscVar2 = null;
                } else {
                    agqxVar = (agqx) agqx.a.b(agrpVar, agrkVar2);
                    if (agqxVar.b.incrementAndGet() < num.intValue()) {
                        agscVar2 = agqxVar;
                        agscVar2 = agqx.c;
                    }
                }
                agscVar2 = agqxVar;
                agsc agscVarB = agsc.b(agscVar, agscVar2);
                agrk agrkVar3 = this.c;
                agrr agrrVar3 = agsf.a;
                Integer num2 = (Integer) agrkVar3.d(agrj.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r15 = 0;
                } else {
                    r15 = (agsf) agsf.a.b(agrpVar, agrkVar3);
                    if ((((Random) agsf.b.get()).nextInt(num2.intValue()) == 0 ? r15.e.incrementAndGet() : r15.e.get()) <= 0) {
                        r15 = agsf.c;
                    }
                }
                agsc agscVarB2 = agsc.b(agscVarB, r15);
                this.d = agscVarB2;
                if (agscVarB2 == agsc.c) {
                    return false;
                }
            }
            agrk agrkVar4 = this.c;
            agrx agrxVar2 = agrj.i;
            agsi agsiVar = (agsi) agrkVar4.d(agrxVar2);
            if (agsiVar != null) {
                agrk agrkVar5 = this.c;
                if (agrkVar5 != null && (iA = agrkVar5.a(agrxVar2)) >= 0) {
                    int i3 = iA << 1;
                    int i4 = i3 + 2;
                    while (true) {
                        i = agrkVar5.b;
                        if (i4 >= (i << 1)) {
                            break;
                        }
                        Object obj = agrkVar5.a[i4];
                        if (!obj.equals(agrxVar2)) {
                            Object[] objArr = agrkVar5.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    agrkVar5.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        agrkVar5.a[i3] = null;
                        i3++;
                    }
                }
                agta agtaVarM2 = m();
                agrx agrxVar3 = agrj.a;
                r(agrxVar3, new agrs((Throwable) agtaVarM2.d(agrxVar3), agsiVar, agvl.b(agrl.class, agsiVar.f, 1)));
            }
        }
        return true;
    }
}
