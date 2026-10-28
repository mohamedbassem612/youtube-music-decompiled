package defpackage;

import android.os.Environment;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aada implements aadc {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/offline/cache/DefaultOfflineCacheSupplier");
    public final tqa a;
    public final aaqg b;
    private final aalf d;
    private volatile aamc f;
    private volatile aamc g;
    private File j;
    private final axfd k;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final Map h = new HashMap();
    private final List i = new ArrayList();

    public aada(axfd axfdVar, aalf aalfVar, aaqg aaqgVar, tqa tqaVar) {
        this.k = axfdVar;
        this.d = aalfVar;
        this.b = aaqgVar;
        this.a = tqaVar;
    }

    private final aamc n(File file, String str) {
        return new aamc(this.k.y(file), str);
    }

    @Override // defpackage.yfp
    public final List b() {
        agke agkeVarN;
        if (!this.e.get()) {
            return null;
        }
        synchronized (this) {
            agkeVarN = agke.n(this.i);
        }
        return agkeVarN;
    }

    @Override // defpackage.aadc
    public final synchronized aamc c() {
        return (this.g == null || !this.d.q()) ? this.f : this.g;
    }

    @Override // defpackage.aadc
    public final synchronized aamc d() {
        return this.f;
    }

    @Override // defpackage.aadc
    public final synchronized aamc e() {
        return this.g;
    }

    @Override // defpackage.aadc
    public final synchronized File f() {
        File file;
        file = this.j;
        if (file == null) {
            aamc aamcVarC = c();
            String str = aamcVarC != null ? aamcVarC.a : null;
            file = str != null ? (File) this.h.get(str) : null;
            this.j = file;
        }
        return file;
    }

    @Override // defpackage.aadc
    public final synchronized File g(String str) {
        return (File) this.h.get(str);
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized List io() {
        return agke.n(this.i);
    }

    @Override // defpackage.aadc
    public final synchronized List i() {
        return agke.n(this.i);
    }

    public final void j() {
        this.d.g = this;
        this.b.f.add(this);
        k();
    }

    public final synchronized void k() {
        File fileJ;
        agkj agkjVarH;
        Map map;
        boolean z = false;
        this.e.set(false);
        this.k.z();
        l();
        this.f = null;
        this.g = null;
        this.h.clear();
        this.i.clear();
        File fileJ2 = this.d.j(true, null);
        if (fileJ2 != null) {
            fileJ2.getAbsolutePath();
            try {
                zhj.a(fileJ2);
            } catch (RuntimeException e) {
                ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/offline/cache/DefaultOfflineCacheSupplier", "refreshCaches", (char) 146, "DefaultOfflineCacheSupplier.java")).t("[Offline] Failed to execute ExoCacheFullDiskUpgradeTool for primary cache");
            }
            String strI = tqa.i("0000-0000", 1);
            try {
                aamc aamcVarN = n(fileJ2, strI);
                if (aamcVarN.r()) {
                    this.h.put(strI, fileJ2);
                    this.i.add(aamcVarN);
                    this.f = aamcVarN;
                }
            } catch (RuntimeException e2) {
                ((agrc) ((agrc) ((agrc) c.b()).j(e2)).k("com/google/android/libraries/youtube/offline/cache/DefaultOfflineCacheSupplier", "refreshCaches", (char) 158, "DefaultOfflineCacheSupplier.java")).t("[Offline] Exception while creating cache");
                zvp.b(zvn.b, zvm.C, "[Offline] Error creating offlineCache", e2);
            }
            throw th;
        }
        zvp.a(zvn.b, zvm.C, "Missing primaryStorageCacheDir with storageState: ".concat(String.valueOf(Environment.getExternalStorageState())));
        aaqg aaqgVar = this.b;
        tqa tqaVar = this.a;
        String strD = aaqgVar.D(tqaVar);
        for (Map.Entry entry : tqaVar.e().entrySet()) {
            String str = (String) entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue() && (fileJ = this.d.j(z, str)) != null) {
                fileJ.getAbsolutePath();
                try {
                    zhj.a(fileJ);
                } catch (RuntimeException e3) {
                    ((agrc) ((agrc) ((agrc) c.b()).j(e3)).k("com/google/android/libraries/youtube/offline/cache/DefaultOfflineCacheSupplier", "refreshCaches", (char) 184, "DefaultOfflineCacheSupplier.java")).t("[Offline] Failed to execute ExoCacheFullDiskUpgradeTool for sd card cache");
                }
                tqa tqaVar2 = this.a;
                synchronized (tqaVar2.e) {
                    try {
                        Map map2 = tqaVar2.d;
                        if (map2 != null) {
                            agkjVarH = agkj.h(map2);
                        } else {
                            tqaVar2.d = new HashMap();
                            List listD = tqaVar2.d();
                            Map mapE = tqaVar2.e();
                            Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                File file = (File) it.next();
                                if (Boolean.TRUE.equals(mapE.get(tqaVar2.c(file)))) {
                                    File file2 = new File(file, "sdcard");
                                    StringBuilder sb = new StringBuilder();
                                    agyk agykVar = new agyk();
                                    try {
                                        try {
                                            map = mapE;
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
                                                agykVar.b(bufferedReader);
                                                while (true) {
                                                    String line = bufferedReader.readLine();
                                                    if (line != null) {
                                                        sb.append(line);
                                                    } else {
                                                        try {
                                                            break;
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                }
                                                agykVar.close();
                                                sb = sb;
                                                it = it;
                                            } catch (FileNotFoundException unused2) {
                                                try {
                                                    agykVar.close();
                                                } catch (Exception unused3) {
                                                }
                                            } catch (IOException e4) {
                                                e = e4;
                                                sb = sb;
                                                ((agrc) ((agrc) ((agrc) tqa.a.b()).j(e)).k("com/google/android/libraries/youtube/common/sdcard/DefaultSdCardSlotsManager", "getSdCardsUniqueId", 294, "DefaultSdCardSlotsManager.java")).t("Error getting sdcard id from sdcard file");
                                                agykVar.close();
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                agykVar.close();
                                            } catch (Exception unused4) {
                                            }
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused5) {
                                        map = mapE;
                                    } catch (IOException e5) {
                                        e = e5;
                                        map = mapE;
                                    }
                                    String string = sb.toString();
                                    if (TextUtils.isEmpty(string)) {
                                        StorageVolume storageVolume = tqaVar2.c.getStorageVolume(file2);
                                        if (storageVolume != null) {
                                            String uuid = storageVolume.getUuid();
                                            if (!TextUtils.isEmpty(uuid)) {
                                                string = tqa.i(uuid, 3);
                                            }
                                        }
                                        if (TextUtils.isEmpty(string)) {
                                            string = tqa.i(UUID.randomUUID().toString(), 2);
                                            agyk agykVar2 = new agyk();
                                            try {
                                                try {
                                                    FileWriter fileWriter = new FileWriter(file2);
                                                    agykVar2.b(fileWriter);
                                                    fileWriter.write(string);
                                                    try {
                                                        agykVar2.close();
                                                    } catch (Exception unused6) {
                                                    }
                                                } catch (Throwable th2) {
                                                    try {
                                                        agykVar2.close();
                                                    } catch (Exception unused7) {
                                                    }
                                                    throw th2;
                                                }
                                            } catch (IOException e6) {
                                                ((agrc) ((agrc) ((agrc) tqa.a.b()).j(e6)).k("com/google/android/libraries/youtube/common/sdcard/DefaultSdCardSlotsManager", "getGeneratedUUIDAndWriteToFile", 382, "DefaultSdCardSlotsManager.java")).t("Error writing sdcard id");
                                                try {
                                                    agykVar2.close();
                                                } catch (Exception unused8) {
                                                }
                                                string = null;
                                            }
                                        }
                                    }
                                    if (!TextUtils.isEmpty(string)) {
                                        tqaVar2.d.put(tqaVar2.c(file), string);
                                    }
                                    mapE = map;
                                    it = it;
                                }
                            }
                            agkjVarH = agkj.h(tqaVar2.d);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                String str2 = (String) agkjVarH.get(str);
                try {
                    aamc aamcVarN2 = n(fileJ, str2);
                    if (aamcVarN2.r()) {
                        this.i.add(aamcVarN2);
                        if (str.equals(strD)) {
                            this.g = aamcVarN2;
                        }
                        if (str2 != null) {
                            this.h.put(str2, fileJ);
                        }
                    }
                } catch (RuntimeException e7) {
                    ((agrc) ((agrc) ((agrc) c.b()).j(e7)).k("com/google/android/libraries/youtube/offline/cache/DefaultOfflineCacheSupplier", "refreshCaches", (char) 203, "DefaultOfflineCacheSupplier.java")).t("[Offline] Exception while creating SD cache");
                    zvp.b(zvn.b, zvm.C, "Error creating sdCardOfflineCache", e7);
                }
                z = false;
            }
        }
        this.e.set(true);
    }

    public final synchronized void l() {
        this.j = null;
    }

    public final boolean m() {
        return (c() == null && f() == null) ? false : true;
    }
}
