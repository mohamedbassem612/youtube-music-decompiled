package defpackage;

import android.content.pm.ApplicationInfo;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qnc {
    public final qkh a;
    public final agfr b;
    public final String c;
    public final boolean d;
    private final String e;

    public qnc(qkh qkhVar, String str, String str2, boolean z) {
        this.a = qkhVar;
        this.c = str;
        this.e = str2;
        this.d = z;
        this.b = aguu.al(new rrv(z, qkhVar, str2, str, 1));
    }

    public static qnd a(qkr qkrVar) {
        aihf aihfVarCreateBuilder = qnd.a.createBuilder();
        if (qkrVar == null) {
            return (qnd) aihfVarCreateBuilder.build();
        }
        for (qks qksVar : qkrVar.f) {
            aihf aihfVarCreateBuilder2 = qne.a.createBuilder();
            String str = qksVar.e;
            aihfVarCreateBuilder2.copyOnWrite();
            qne qneVar = (qne) aihfVarCreateBuilder2.instance;
            str.getClass();
            qneVar.b |= 1;
            qneVar.e = str;
            int i = qksVar.c;
            int iP = qnl.p(i);
            if (iP == 0) {
                throw null;
            }
            int i2 = iP - 1;
            if (i2 == 0) {
                long jLongValue = i == 1 ? ((Long) qksVar.d).longValue() : 0L;
                aihfVarCreateBuilder2.copyOnWrite();
                qne qneVar2 = (qne) aihfVarCreateBuilder2.instance;
                qneVar2.c = 2;
                qneVar2.d = Long.valueOf(jLongValue);
            } else if (i2 == 1) {
                boolean zBooleanValue = i == 2 ? ((Boolean) qksVar.d).booleanValue() : false;
                aihfVarCreateBuilder2.copyOnWrite();
                qne qneVar3 = (qne) aihfVarCreateBuilder2.instance;
                qneVar3.c = 3;
                qneVar3.d = Boolean.valueOf(zBooleanValue);
            } else if (i2 == 2) {
                double dDoubleValue = i == 3 ? ((Double) qksVar.d).doubleValue() : 0.0d;
                aihfVarCreateBuilder2.copyOnWrite();
                qne qneVar4 = (qne) aihfVarCreateBuilder2.instance;
                qneVar4.c = 4;
                qneVar4.d = Double.valueOf(dDoubleValue);
            } else if (i2 == 3) {
                String str2 = i == 4 ? (String) qksVar.d : "";
                aihfVarCreateBuilder2.copyOnWrite();
                qne qneVar5 = (qne) aihfVarCreateBuilder2.instance;
                str2.getClass();
                qneVar5.c = 5;
                qneVar5.d = str2;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("No known flag type");
                }
                aigj aigjVar = i == 5 ? (aigj) qksVar.d : aigj.d;
                aihfVarCreateBuilder2.copyOnWrite();
                qne qneVar6 = (qne) aihfVarCreateBuilder2.instance;
                aigjVar.getClass();
                qneVar6.c = 6;
                qneVar6.d = aigjVar;
            }
            qne qneVar7 = (qne) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            qnd qndVar = (qnd) aihfVarCreateBuilder.instance;
            qneVar7.getClass();
            aiie aiieVar = qndVar.g;
            if (!aiieVar.c()) {
                qndVar.g = aihn.mutableCopy(aiieVar);
            }
            qndVar.g.add(qneVar7);
        }
        String str3 = qkrVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        qnd qndVar2 = (qnd) aihfVarCreateBuilder.instance;
        str3.getClass();
        qndVar2.b |= 4;
        qndVar2.e = str3;
        String str4 = qkrVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        qnd qndVar3 = (qnd) aihfVarCreateBuilder.instance;
        str4.getClass();
        qndVar3.b |= 1;
        qndVar3.c = str4;
        long j = qkrVar.i;
        aihfVarCreateBuilder.copyOnWrite();
        qnd qndVar4 = (qnd) aihfVarCreateBuilder.instance;
        qndVar4.b |= 8;
        qndVar4.f = j;
        if ((qkrVar.b & 2) != 0) {
            aigj aigjVar2 = qkrVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            qnd qndVar5 = (qnd) aihfVarCreateBuilder.instance;
            aigjVar2.getClass();
            qndVar5.b |= 2;
            qndVar5.d = aigjVar2;
        }
        return (qnd) aihfVarCreateBuilder.build();
    }

    public final ListenableFuture b(String str) {
        qkh qkhVar = this.a;
        kjc kjcVarE = qkhVar.e();
        String str2 = this.c;
        str2.getClass();
        str.getClass();
        return ahcs.e(kjc.A(((llq) kjcVarE.a).e(str2, str).a(MoreExecutors.directExecutor(), new qku())), new one(15), qkhVar.b());
    }

    public final ListenableFuture c(qnd qndVar) {
        return ahng.r(new jkb(this, qndVar, 11), this.a.b());
    }

    public final boolean d() {
        return this.a.f.f(this.d, ahnm.FILE);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [agfr, java.lang.Object] */
    public final web e() {
        int i;
        qna qnaVar;
        qna qnaVar2;
        qla qlaVarA;
        boolean z = this.d;
        if (!z && !mef.h(this.a.c)) {
            return new web(qnd.a, new qnb(3, 17, false));
        }
        if (qke.d()) {
            return new web(qnd.a, new qnb(3, 18, false));
        }
        qkh qkhVar = this.a;
        qmz qmzVarC = qkhVar.f.c(z);
        String str = this.c;
        ahnm ahnmVar = ahnm.FILE;
        String strC = qke.c(str);
        strC.getClass();
        if (!qmzVarC.h) {
            i = 14;
        } else if (!qmzVarC.a || !qmzVarC.b.contains(ahnmVar)) {
            i = 3;
        } else if (qmzVarC.c.E()) {
            i = 4;
        } else {
            List list = qmzVarC.f;
            if (list.isEmpty() || list.contains(strC)) {
                i = qmzVarC.g.contains(strC) ? 6 : 0;
            } else {
                i = 5;
            }
        }
        if (i != 0) {
            qnaVar2 = new qna(null, new qnb(i, true));
        } else {
            try {
                String str2 = qmzVarC.e;
                if (str2.isEmpty()) {
                    agev agevVar = (agev) qkhVar.g.io();
                    if (!agevVar.g()) {
                        qnl.q(Level.WARNING, qkhVar.b(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        qnaVar = new qna(qlc.a, new qnb(3, 7, false));
                        qnaVar2 = qnaVar;
                    } else if (z) {
                        int i2 = mef.a;
                        str2 = ((ApplicationInfo) agevVar.c()).deviceProtectedDataDir;
                    } else {
                        str2 = ((ApplicationInfo) agevVar.c()).dataDir;
                    }
                }
                ayq ayqVar = new ayq(qmzVarC.c, str, this.e);
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(str2 + File.separator + qmzVarC.d + File.separator + new File(((String) ayqVar.a.io()) + '/' + ((String) ayqVar.b.io()) + ".pb").toString());
                        try {
                            int i3 = aigm.l;
                            aigl aiglVar = new aigl(fileInputStream, SemanticState.Obscured);
                            qlc qlcVar = qlc.a;
                            int iR = aiglVar.r();
                            if (iR > 1) {
                                throw new aiik("Unsupported version: " + iR + ". Current version is: 1");
                            }
                            aiglVar.r();
                            int iF = aiglVar.f(aiglVar.k());
                            qkv qkvVar = (qkv) aihn.parseFrom(qkv.a, aiglVar, ExtensionRegistryLite.a);
                            aiglVar.A(iF);
                            qky qkyVar = new qky();
                            try {
                                int iK = aiglVar.k();
                                if (iK > 12288) {
                                    int iF2 = aiglVar.f(iK);
                                    try {
                                        qlaVarA = qla.a(new aigl(new InflaterInputStream(new qkx(aiglVar), qkyVar.a, SemanticState.Obscured), SemanticState.Obscured));
                                        qkyVar.a.reset();
                                        int iD = aiglVar.d();
                                        if (iD > 0) {
                                            aiglVar.C(iD);
                                        }
                                        aiglVar.A(iF2);
                                    } catch (Throwable th) {
                                        qkyVar.a.reset();
                                        throw th;
                                    }
                                } else {
                                    qkyVar.a.setInput(aiglVar.H(iK));
                                    try {
                                        qlaVarA = qla.a(new aigl(new qkw(qkyVar), SemanticState.Obscured));
                                        qkyVar.a.reset();
                                    } catch (Throwable th2) {
                                        qkyVar.a.reset();
                                        throw th2;
                                    }
                                }
                                qkyVar.close();
                                qna qnaVar3 = new qna(new qlc(qlaVarA, qkvVar), new qnb(5, 2, false));
                                fileInputStream.close();
                                qnaVar2 = qnaVar3;
                            } catch (Throwable th3) {
                                try {
                                    qkyVar.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (aiik e) {
                        qnl.q(Level.SEVERE, this.a.b(), e, "Failed to parse snapshot from shared storage for %s", this.c);
                        qnaVar2 = new qna(null, new qnb(9, false));
                    }
                } catch (FileNotFoundException unused) {
                    qnl.q(Level.INFO, this.a.b(), null, "Shared storage file not found for %s", this.c);
                    qnaVar2 = new qna(null, new qnb(8, false));
                }
            } catch (Exception e2) {
                qnl.q(Level.WARNING, this.a.b(), e2, "Failed to read shared file for %s", this.c);
                qnaVar = new qna(qlc.a, new qnb(3, 10, false));
            }
        }
        if (qnaVar2.a != null) {
            qlc qlcVar2 = qnaVar2.a;
            qlcVar2.getClass();
            return new web(qlcVar2, qnaVar2.b);
        }
        qnb qnbVar = qnaVar2.b;
        try {
            FileInputStream fileInputStream2 = new FileInputStream((String) this.b.io());
            try {
                web webVar = new web((qnd) aihn.parseFrom(qnd.a, fileInputStream2, ExtensionRegistryLite.a), new qnb(4, qnbVar.c, qnbVar.a));
                fileInputStream2.close();
                return webVar;
            } catch (Throwable th7) {
                try {
                    fileInputStream2.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (IOException | RuntimeException unused2) {
            qnl.q(Level.INFO, this.a.b(), null, "Unable to retrieve flag snapshot for %s, using defaults.", this.c);
            return qnbVar.a ? new web(qnd.a, new qnb(3, 11, true)) : new web(qlc.a, new qnb(3, 16, false));
        }
    }
}
