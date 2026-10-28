package defpackage;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.SettableFuture;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbs extends gcr {
    private static final dov k = new dov((byte[]) null, (char[]) null);
    private final fxc h;
    private final Context i;
    private final ayq j;

    public gbs(gbg gbgVar, fxg fxgVar, int i, Context context, fxc fxcVar, ayq ayqVar) {
        super(gbgVar, "9OHw/fBIPh5YUitiAy+E7UaIungPM7W3DvDu20ziWmDkwtWt66PgGPPL9dk7S03M", "9PuGz9gV/tHA1XAj1YCdJFjSXebPqQ0T6NFbvcYJ/YI=", fxgVar, i, 27);
        this.i = context;
        this.h = fxcVar;
        this.j = ayqVar;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    private final fzr c() {
        String str;
        ?? r5;
        jwm jwmVar = jwp.n;
        int iIntValue = (((Integer) jwmVar.d()).intValue() <= 0 || ((Integer) jwmVar.d()).intValue() >= this.h.d) ? this.h.d : ((Integer) jwmVar.d()).intValue();
        fzr fzrVar = new fzr((String) this.e.invoke(null, this.i, Boolean.FALSE, ""));
        ayq ayqVar = this.j;
        if (ayqVar == null || (r5 = ayqVar.b) == 0) {
            str = "E";
        } else {
            try {
                str = (String) r5.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        fzrVar.a = str;
        return fzrVar;
    }

    private final String d() {
        try {
            gbg gbgVar = this.a;
            if (gbgVar.d() != null) {
                gbgVar.d().get();
            }
            fxl fxlVarB = gbgVar.b();
            if (fxlVarB != null && (fxlVarB.b & 4194304) != 0) {
                return fxlVarB.t;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    @Override // defpackage.gcr
    protected final void a() {
        fzr fzrVarC;
        fzr fzrVar;
        dov dovVar = k;
        Context context = this.i;
        AtomicReference atomicReferenceW = dovVar.w(context.getPackageName());
        synchronized (atomicReferenceW) {
            fzr fzrVar2 = (fzr) atomicReferenceW.get();
            if (fzrVar2 == null || gbj.a(fzrVar2.a) || fzrVar2.a.equals("E") || fzrVar2.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                char[] cArr = gbj.a;
                Boolean.FALSE.booleanValue();
                if (this.j != null) {
                    fzrVarC = c();
                } else {
                    Boolean boolValueOf = Boolean.valueOf(!this.h.c);
                    Boolean bool = (Boolean) jwp.e.d();
                    String strB = ((Boolean) jwp.d.d()).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.a.k && gbj.a(strB)) {
                        strB = d();
                    }
                    fzr fzrVar3 = new fzr((String) this.e.invoke(null, context, boolValueOf, strB));
                    String str = fzrVar3.a;
                    if (!gbj.a(str)) {
                        str.equals("E");
                    }
                    fzrVarC = fzrVar3;
                }
                atomicReferenceW.set(fzrVarC);
            }
            fzrVar = (fzr) atomicReferenceW.get();
        }
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            if (fzrVar != null) {
                String str2 = fzrVar.a;
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                str2.getClass();
                fxlVar.b |= 4194304;
                fxlVar.t = str2;
                long j = fzrVar.b;
                fxgVar.copyOnWrite();
                fxl fxlVar3 = (fxl) fxgVar.instance;
                fxlVar3.b |= 536870912;
                fxlVar3.z = j;
                String str3 = fzrVar.c;
                fxgVar.copyOnWrite();
                fxl fxlVar4 = (fxl) fxgVar.instance;
                str3.getClass();
                fxlVar4.b |= 268435456;
                fxlVar4.y = str3;
                String str4 = fzrVar.d;
                fxgVar.copyOnWrite();
                fxl fxlVar5 = (fxl) fxgVar.instance;
                str4.getClass();
                fxlVar5.c |= SemanticState.Focused;
                fxlVar5.I = str4;
                String str5 = fzrVar.e;
                fxgVar.copyOnWrite();
                fxl fxlVar6 = (fxl) fxgVar.instance;
                str5.getClass();
                fxlVar6.c |= SemanticState.Hidden;
                fxlVar6.J = str5;
            }
        }
    }

    protected final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrC = gbj.c((String) jwp.f.d());
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrC)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(gbj.c((String) jwp.g.d()))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.a.b;
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final SettableFuture settableFutureCreate = SettableFuture.create();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: gcs
                public final void onChecksumsReady(List list) {
                    SettableFuture settableFuture = settableFutureCreate;
                    if (list == null) {
                        settableFuture.set(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumM = qa$$ExternalSyntheticApiModelOutline0.m(list.get(i));
                            if (apkChecksumM.getType() == 8) {
                                byte[] value = apkChecksumM.getValue();
                                char[] cArr = gbj.a;
                                char[] cArr2 = new char[value.length << 1];
                                for (int i2 = 0; i2 < value.length; i2++) {
                                    byte b = value[i2];
                                    int i3 = i2 << 1;
                                    char[] cArr3 = gbj.a;
                                    cArr2[i3] = cArr3[(b & 255) >>> 4];
                                    cArr2[i3 + 1] = cArr3[b & 15];
                                }
                                settableFuture.set(new String(cArr2));
                                return;
                            }
                        }
                        settableFuture.set(null);
                    } catch (Throwable unused) {
                        settableFuture.set(null);
                    }
                }
            });
            return (String) settableFutureCreate.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
