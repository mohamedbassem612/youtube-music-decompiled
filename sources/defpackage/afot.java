package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class afot extends afos implements afov {
    private Boolean a;
    public afvq n;
    public awmd o;

    static {
        SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0034. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    @Override // android.app.Application
    public void onCreate() {
        String strL;
        boolean z;
        boolean zContains = false;
        if (rmp.c == null) {
            if (!Process.isIsolated()) {
                String str = rmp.b;
                if (str == null) {
                    String strL2 = qnl.l(this);
                    if (strL2 == null) {
                        str = null;
                    } else {
                        int iIndexOf = strL2.indexOf(58);
                        if (iIndexOf == -1) {
                            rmp.b = "";
                        } else {
                            rmp.b = strL2.substring(iIndexOf);
                        }
                        str = rmp.b;
                    }
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -737791795:
                            if (!str.equals(":primes_lifeboat")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        case -733923188:
                            if (!str.equals(":learning_bg")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        case 1771111950:
                            if (!str.equals(":train")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        case 1892872565:
                            if (!str.equals(":leakcanary")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        default:
                            z = str.startsWith(":privileged_process");
                            break;
                    }
                }
            }
            rmp.c = Boolean.valueOf(z);
        }
        if (!rmp.c.booleanValue()) {
            Boolean boolValueOf = this.a;
            if (boolValueOf == null) {
                agpr agprVar = agpr.a;
                agprVar.getClass();
                if (!agprVar.isEmpty() && (strL = qnl.l(this)) != null) {
                    zContains = agprVar.contains(strL);
                }
                boolValueOf = Boolean.valueOf(zContains);
                this.a = boolValueOf;
            }
            if (!boolValueOf.booleanValue()) {
                if (afty.o()) {
                    ((heg) this.o.io()).s();
                    super.onCreate();
                    return;
                }
                agev agevVarA = qik.a;
                if (agevVarA == null) {
                    agevVarA = qik.a();
                    qik.a = agevVarA;
                }
                long jLongValue = agevVarA.g() ? ((Long) agevVarA.c()).longValue() : Process.getStartElapsedRealtime();
                long jMax = Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - jLongValue));
                afwn afwnVar = new afwn(afty.k);
                if (afwnVar.a == null) {
                    afvq afvqVar = this.n;
                    long j = 1000000 * jLongValue;
                    Object obj = afvqVar.d;
                    Object objIo = afvqVar.b.io();
                    objIo.getClass();
                    int i = afvqVar.a;
                    afun afunVarC = ((afwd) obj).c((afuy) objIo, jMax, j);
                    try {
                        afty.k = ((afvh) afty.d.get()).c;
                        qpj.a().post(new gkz(11));
                        afuu afuuVarD = afwt.d(141, "Application.onCreate", afux.a, true);
                        try {
                            ((heg) this.o.io()).s();
                            super.onCreate();
                            afuuVarD.close();
                            afunVarC.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                afuuVarD.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            afunVarC.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                afvn afvnVarA = afwnVar.a();
                try {
                    afuy afuyVar = afux.a;
                    afuu afuuVarD2 = afwt.d(138, "Application creation", afuyVar, true);
                    try {
                        afuu afuuVarD3 = afwt.d(139, "Application.onCreate", afuyVar, true);
                        try {
                            ((heg) this.o.io()).s();
                            super.onCreate();
                            afuuVarD3.close();
                            afuuVarD2.close();
                            afvnVarA.close();
                            return;
                        } catch (Throwable th5) {
                            try {
                                afuuVarD3.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            afuuVarD2.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                } catch (Throwable th9) {
                    try {
                        afvnVarA.close();
                        throw th9;
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                        throw th9;
                    }
                }
            }
        }
        super.onCreate();
    }
}
