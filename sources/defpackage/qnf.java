package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qnf {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final agfr d;
    public final agfr e;
    public final agfr f;
    public final agfr g;
    public volatile qlf h;
    public final agfr i;
    public volatile qlg j;
    private final agfr k;

    public qnf(Context context, agfr agfrVar, agfr agfrVar2) {
        this.c = context;
        this.e = agfrVar;
        this.d = agfrVar2;
        int i = 8;
        this.g = aguu.al(new jxq(context, "storage-info.pb", i));
        int i2 = mef.a;
        this.i = aguu.al(new jxq(context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext(), "device-encrypted-storage-info.pb", i));
        this.f = aguu.al(new qhs(this, 9));
        this.k = aguu.al(new qhs(agfrVar, 10));
    }

    public static void e(String str, MessageLite messageLite, String str2) throws IOException {
        File file = new File(str);
        agyo.b(file);
        File fileCreateTempFile = File.createTempFile(str2, ".pb", file.getParentFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                messageLite.writeTo(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException(String.valueOf(fileCreateTempFile) + " could not be renamed to " + file.toString());
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            fileCreateTempFile.delete();
            throw e;
        }
    }

    public final qlf a() {
        qlf qlfVar;
        qlf qlfVar2 = this.h;
        if (qlfVar2 == null) {
            synchronized (a) {
                qlfVar2 = this.h;
                if (qlfVar2 == null) {
                    if (mef.h(this.c)) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        try {
                            try {
                                FileInputStream fileInputStream = new FileInputStream((String) this.g.io());
                                try {
                                    qlfVar = (qlf) aihn.parseFrom(qlf.b, fileInputStream, ExtensionRegistryLite.a);
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                                throw th3;
                            }
                        } catch (IOException | IllegalStateException unused) {
                            qlfVar = qlf.b;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        this.h = qlfVar;
                        qlfVar2 = qlfVar;
                    } else {
                        qlfVar2 = qlf.b;
                    }
                }
            }
        }
        return qlfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [qlg] */
    /* JADX WARN: Type inference failed for: r0v2, types: [qlg] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final qlg b() {
        qlg qlgVar;
        ?? r0;
        qlg qlgVar2 = this.j;
        ?? r1 = qlgVar2;
        if (qlgVar2 == null) {
            synchronized (b) {
                ?? AllowThreadDiskWrites = this.j;
                r0 = AllowThreadDiskWrites;
                if (AllowThreadDiskWrites == 0) {
                    try {
                        AllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        try {
                            FileInputStream fileInputStream = new FileInputStream((String) this.i.io());
                            try {
                                qlgVar = (qlg) aihn.parseFrom(qlg.b, fileInputStream, ExtensionRegistryLite.a);
                                fileInputStream.close();
                                StrictMode.setThreadPolicy(AllowThreadDiskWrites);
                                this.j = qlgVar;
                                r0 = qlgVar;
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException | IllegalStateException unused) {
                            qlgVar = qlg.b;
                        }
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(AllowThreadDiskWrites);
                        throw th3;
                    }
                }
            }
            r1 = r0;
        }
        return r1;
    }

    public final qmz c(boolean z) {
        boolean z2;
        agke agkeVarN;
        aigj aigjVar;
        String str;
        agke agkeVarN2;
        agke agkeVarN3;
        int i;
        boolean z3;
        boolean z4;
        qld qldVar;
        String str2 = "";
        if (z) {
            qlg qlgVarB = b();
            z2 = qlgVarB.e;
            agkeVarN = agke.n(new aihx(qlgVarB.i, qlg.a));
            aigjVar = qlgVarB.d;
            str = qlgVarB.f;
            agkeVarN2 = agke.n(qlgVarB.g);
            agkeVarN3 = agke.n(qlgVarB.h);
            if ((qlgVarB.c & 8) != 0) {
                qlh qlhVar = qlgVarB.j;
                if (qlhVar == null) {
                    qlhVar = qlh.a;
                }
                if (qlhVar.c == Build.VERSION.SDK_INT) {
                    qlh qlhVar2 = qlgVarB.j;
                    if (qlhVar2 == null) {
                        qlhVar2 = qlh.a;
                    }
                    str2 = qlhVar2.b;
                }
            }
            i = qlgVarB.c & 1;
            z3 = qlgVarB.l;
            z4 = qlgVarB.k;
            qldVar = qlgVarB.m;
            if (qldVar == null) {
                qldVar = qld.a;
            }
        } else {
            qlf qlfVarA = a();
            z2 = qlfVarA.e;
            agkeVarN = agke.n(new aihx(qlfVarA.j, qlf.a));
            aigjVar = qlfVarA.d;
            str = qlfVarA.f;
            agkeVarN2 = agke.n(qlfVarA.h);
            agkeVarN3 = agke.n(qlfVarA.i);
            if ((qlfVarA.c & 16) != 0) {
                qlh qlhVar3 = qlfVarA.k;
                if (qlhVar3 == null) {
                    qlhVar3 = qlh.a;
                }
                if (qlhVar3.c == Build.VERSION.SDK_INT) {
                    qlh qlhVar4 = qlfVarA.k;
                    if (qlhVar4 == null) {
                        qlhVar4 = qlh.a;
                    }
                    str2 = qlhVar4.b;
                }
            }
            i = qlfVarA.c & 1;
            z3 = qlfVarA.m;
            z4 = qlfVarA.l;
            qldVar = qlfVarA.n;
            if (qldVar == null) {
                qldVar = qld.a;
            }
        }
        qld qldVar2 = qldVar;
        int i2 = i;
        agke agkeVar = agkeVarN2;
        String str3 = str;
        return new qmz(z2, agkeVarN, aigjVar, str3, str2, agkeVar, agkeVarN3, 1 == i2, z3, z4, qldVar2);
    }

    public final ListenableFuture d(boolean z) {
        ahey aheyVar = (ahey) this.e.io();
        aheyVar.getClass();
        return aheo.p(z ? ahng.o((ListenableFuture) this.k.io()) : aher.a).r(new qmu(this, 3), aheyVar);
    }

    public final boolean f(boolean z, ahnm ahnmVar) {
        if (z) {
            qlg qlgVarB = b();
            if (qlgVarB.e && new aihx(qlgVarB.i, qlg.a).contains(ahnmVar)) {
                return true;
            }
        } else {
            qlf qlfVarA = a();
            if (qlfVarA.e && new aihx(qlfVarA.j, qlf.a).contains(ahnmVar)) {
                return true;
            }
        }
        return false;
    }
}
