package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.JniZero;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afnm implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ afnp a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ afnm(afnp afnpVar, boolean z, int i) {
        this.$cid = i;
        this.a = afnpVar;
        this.b = z;
    }

    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        File fileA;
        int i = this.$cid;
        afnp afnpVar = this.a;
        int i2 = 0;
        if (i != 0) {
            afnpVar.b();
            return mef.b(afnpVar.a, afwl.c(new afnm(afnpVar, this.b, i2)), afnpVar.c);
        }
        afnpVar.b();
        boolean z = this.b;
        if (z && (fileA = afnpVar.a()) != null && fileA.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileA, "r");
                try {
                    int i3 = randomAccessFile.readInt();
                    int i4 = afnpVar.d;
                    JniZero.l(randomAccessFile, null);
                    if (i3 == i4) {
                        return afnpVar.c();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        JniZero.l(randomAccessFile, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                ((agrc) ((agrc) afnpVar.h.c()).j(e).k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceedFileBacked", 553, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("Failed to read package version from file");
            }
        }
        int i5 = afnpVar.d;
        omj omjVarD = afnpVar.d();
        omr omrVar = new omr();
        omrVar.i("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
        omrVar.j(Long.valueOf(i5));
        afxc afxcVar = new afxc(omjVarD.Z(omrVar.p()));
        itx itxVar = new itx(new akm(11), 6);
        ExecutorService executorService = afnpVar.b;
        return ahno.as(afxcVar.a(itxVar, executorService).b().b(Exception.class, new aeqk(new acsc(afnpVar, 18), 16), MoreExecutors.directExecutor()), new aekb(new afnl(afnpVar, z, 0), 8), executorService);
    }
}
