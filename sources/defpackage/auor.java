package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auor {
    public Object a;
    public final Object b;

    public auor(String str, String str2) {
        HashMap map = new HashMap();
        this.b = map;
        if (str != null) {
            n(map, str);
        }
        if (str2 == null || str2.equals(str)) {
            return;
        }
        n(map, str2);
    }

    public static void n(Map map, String str) {
        map.put(str, Integer.valueOf(((Integer) j$.util.Map.EL.getOrDefault(map, str, 0)).intValue() + 1));
    }

    private final synchronized Context o() {
        if (this.a == null) {
            Object obj = this.b;
            Context contextCreateDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
            if (contextCreateDeviceProtectedStorageContext != null) {
                this.a = contextCreateDeviceProtectedStorageContext;
            } else {
                this.a = obj;
            }
        }
        return (Context) this.a;
    }

    private final File p(int i, int i2) {
        Object objO = i2 == 1 ? o() : this.b;
        return i + (-1) != 0 ? ((Context) objO).getCacheDir() : ((Context) objO).getFilesDir();
    }

    public final void a() {
        this.a = null;
    }

    public final void b(bpt bptVar) {
        bpv bpvVar = new bpv(bptVar);
        bpvVar.b(bpm.d, this.b);
        this.a = bpvVar;
    }

    public final boolean c() {
        return this.a == null;
    }

    public final ListenableFuture d(ahcx ahcxVar, Executor executor) {
        executor.getClass();
        final ahdz ahdzVar = new ahdz(executor, this);
        afwh afwhVar = new afwh(ahdzVar, ahcxVar, 2);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        final ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.b).getAndSet(settableFutureCreate);
        final ahfo ahfoVar = new ahfo(afwhVar);
        listenableFuture.addListener(ahfoVar, ahdzVar);
        final ListenableFuture listenableFutureO = ahng.o(ahfoVar);
        Runnable runnable = new Runnable() { // from class: ahdw
            @Override // java.lang.Runnable
            public final void run() {
                ahfo ahfoVar2 = ahfoVar;
                if (ahfoVar2.isDone()) {
                    settableFutureCreate.setFuture(listenableFuture);
                } else if (listenableFutureO.isCancelled() && ahdzVar.a()) {
                    ahfoVar2.cancel(false);
                }
            }
        };
        listenableFutureO.addListener(runnable, MoreExecutors.directExecutor());
        ahfoVar.addListener(runnable, MoreExecutors.directExecutor());
        return listenableFutureO;
    }

    public final ahsg e() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(f());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        ahsf ahsfVarA = ahsg.a();
        ahsfVarA.a = strOptString;
        ahsfVarA.c(new int[]{1, 2, 3, 4, 5}[iOptInt]);
        ahsfVarA.b = strOptString2;
        ahsfVarA.c = strOptString3;
        ahsfVarA.d(jOptLong);
        ahsfVarA.b(jOptLong2);
        ahsfVarA.d = strOptString4;
        return ahsfVarA.a();
    }

    public final File f() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b;
                    String str = "PersistedInstallation." + ((ahnr) obj).h() + ".json";
                    File file = new File(((ahnr) obj).a().getNoBackupFilesDir(), str);
                    this.a = file;
                    if (file.exists()) {
                        return (File) this.a;
                    }
                    File file2 = new File(((ahnr) obj).a().getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo((File) this.a)) {
                        Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                        return file2;
                    }
                }
            }
        }
        return (File) this.a;
    }

    public final void g(ahsg ahsgVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ahsgVar.a);
            int i = ahsgVar.g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            jSONObject.put("Status", i2);
            jSONObject.put("AuthToken", ahsgVar.b);
            jSONObject.put("RefreshToken", ahsgVar.c);
            jSONObject.put("TokenCreationEpochInSecs", ahsgVar.e);
            jSONObject.put("ExpiresInSecs", ahsgVar.d);
            jSONObject.put("FisError", ahsgVar.f);
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", ((ahnr) this.b).a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(f())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final agkz h() {
        return agkz.s(p(1, 2), p(1, 1), p(2, 2), p(2, 1));
    }

    public final File i(afqw afqwVar) {
        return p(afqwVar.a, afqwVar.b);
    }

    public final Uri j(afqw afqwVar, String str) {
        int i = afqwVar.a - 1;
        String str2 = afqwVar.b == 1 ? "directboot-" : "";
        String strConcat = i != 0 ? str2.concat("cache") : str2.concat("files");
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return new Uri.Builder().scheme("android").authority(((Context) this.b).getPackageName()).path("/" + strConcat + '/' + str).build();
    }

    public final void k() {
        ((Handler) this.b).removeMessages(153535);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void l(aclo acloVar) {
        this.b.add(acloVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void m(aclp aclpVar) {
        if (Objects.equals(aclpVar, this.a)) {
            return;
        }
        if (this.a != null) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((aclo) it.next()).af();
            }
        }
        this.a = aclpVar;
        if (aclpVar != null) {
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((aclo) it2.next()).ag();
            }
        }
    }

    public auor() {
        this.b = new AtomicReference(aher.a);
        this.a = new ahea();
    }

    public auor(Object obj) {
        this.b = obj;
    }

    public auor(bpt bptVar) {
        this.a = bptVar;
        this.b = (String) bptVar.a(bpm.d);
    }

    public auor(byte[] bArr, byte[] bArr2) {
        this.b = new HashSet();
    }

    public auor(byte[] bArr) {
        this.b = new adbl(this, Looper.getMainLooper());
    }
}
