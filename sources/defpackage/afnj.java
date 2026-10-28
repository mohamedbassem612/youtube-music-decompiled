package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afnj {
    public final Context a;
    public final Map b;
    public final awmd c;
    public final awmd d;
    public final ahex e;
    public final aunn f;
    public final awmd g;
    public final awmd h;
    public final boolean i;
    public final Map j;
    public final omr k;
    public final ahpu l;
    private final Map m;

    public afnj(Context context, omr omrVar, Map map, Map map2, awmd awmdVar, awmd awmdVar2, ahex ahexVar, aunn aunnVar, awmd awmdVar3, ahpu ahpuVar, awmd awmdVar4) {
        context.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        ahexVar.getClass();
        aunnVar.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        this.a = context;
        this.k = omrVar;
        this.m = map;
        this.b = map2;
        this.c = awmdVar;
        this.d = awmdVar2;
        this.e = ahexVar;
        this.f = aunnVar;
        this.g = awmdVar3;
        this.l = ahpuVar;
        this.h = awmdVar4;
        if (!atqq.at(((agpn) map).keySet(), ((agpn) map2).keySet()).isEmpty()) {
            Set setAt = atqq.at(((agpn) map).keySet(), ((agpn) map2).keySet());
            Objects.toString(setAt);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setAt.toString()));
        }
        Boolean.FALSE.booleanValue();
        this.i = false;
        if (omrVar.m()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(map2);
            map2 = linkedHashMap;
        }
        this.j = map2;
    }

    public static final int b(RandomAccessFile randomAccessFile) throws IOException {
        int i;
        try {
            i = randomAccessFile.readInt();
        } catch (EOFException unused) {
            i = -1;
        } finally {
            randomAccessFile.seek(0L);
        }
        return i;
    }

    public final void a(final boolean z) {
        afuu afuuVarD = afwt.d(133, "StartupAfterPackageReplaced", afux.a, true);
        try {
            ahcx ahcxVar = new ahcx() { // from class: afnf
                /* JADX WARN: Code duplicated, block: B:24:0x0078  */
                @Override // defpackage.ahcx
                public final ListenableFuture a() {
                    String str;
                    afnh afnhVar;
                    String strL;
                    afnj afnjVar = this.a;
                    try {
                        Object objIo = afnjVar.h.io();
                        objIo.getClass();
                        PackageInfo packageInfo = (PackageInfo) objIo;
                        int i = packageInfo.versionCode;
                        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                        if (applicationInfo == null || (str = applicationInfo.dataDir) == null) {
                            throw new IllegalStateException("PackageInfo was invalid.");
                        }
                        File file = new File(new File(str, "files"), "tiktok");
                        file.mkdirs();
                        String strConcat = "103243289";
                        if (!afnjVar.k.m() && (strL = qnl.l(afnjVar.a)) != null) {
                            strConcat = "103243289_".concat(new awtk("[^A-Za-z0-9\\-_:]").a(strL, "_"));
                        }
                        File file2 = new File(file, strConcat);
                        boolean zCreateNewFile = file2.createNewFile();
                        if (!file2.exists() || !file2.isFile()) {
                            throw new IOException("Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup.");
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                        int i2 = 0;
                        if (zCreateNewFile) {
                            randomAccessFile.writeInt(-1);
                            randomAccessFile.seek(0L);
                            afnhVar = new afnh(randomAccessFile, afnjVar, i, i2);
                        } else {
                            try {
                                if (i == afnj.b(randomAccessFile)) {
                                    randomAccessFile.close();
                                    afnhVar = null;
                                } else {
                                    randomAccessFile.writeInt(-1);
                                    randomAccessFile.seek(0L);
                                    afnhVar = new afnh(randomAccessFile, afnjVar, i, i2);
                                }
                            } catch (Throwable th) {
                                randomAccessFile.close();
                                throw th;
                            }
                        }
                        if (afnhVar == null) {
                            Object obj = ((aupo) afnjVar.d).b;
                            obj.getClass();
                            Iterable iterable = (Iterable) obj;
                            ArrayList arrayList = new ArrayList(atqq.N(iterable, 10));
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                afgi afgiVar = new afgi((afna) it.next(), 6);
                                long j = afwl.a;
                                afwh afwhVar = new afwh(afty.c(false), afgiVar, 0);
                                ahex ahexVar = afnjVar.e;
                                ahfo ahfoVar = new ahfo(new afwh(afty.c(false), afwhVar, 0));
                                ahexVar.execute(ahfoVar);
                                arrayList.add(ahfoVar);
                            }
                            return new ahud(new ahek(false, agke.j(arrayList)), (byte[]) null).k(new okp(11), MoreExecutors.directExecutor());
                        }
                        Object obj2 = ((aupo) afnjVar.d).b;
                        obj2.getClass();
                        Iterable iterable2 = (Iterable) obj2;
                        ArrayList arrayList2 = new ArrayList(atqq.N(iterable2, 10));
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new afni((afna) it2.next(), 0));
                        }
                        agkz agkzVarN = agkz.n(arrayList2);
                        agkzVarN.getClass();
                        afng afngVar = new afng(afnjVar, agkzVarN, afnhVar, i2);
                        afjn afjnVar = (afjn) afnjVar.f.io();
                        ahex ahexVar2 = afnjVar.e;
                        long j2 = afwl.a;
                        ahfo ahfoVar2 = new ahfo(new afwh(afty.c(false), afngVar, 0));
                        ahexVar2.execute(ahfoVar2);
                        afvl afvlVar = ((afvh) afty.d.get()).c;
                        afjnVar.b(ahfoVar2, afvlVar == null ? "<no trace>" : afty.i(afvlVar));
                        return ahfoVar2;
                    } catch (IOException e) {
                        if (z) {
                            Context context = afnjVar.a;
                            if (!mef.h(context)) {
                                Log.w("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, device was locked. Will reschedule.", e);
                            }
                            mef.d(context, new afjc(afnjVar, 3));
                        } else {
                            Log.e("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, will try again next startup: ", e);
                        }
                        return aher.a;
                    }
                }
            };
            ahex ahexVar = this.e;
            long j = afwl.a;
            ahfo ahfoVar = new ahfo(new afwh(afty.c(false), ahcxVar, 0));
            ahexVar.execute(ahfoVar);
            afjn afjnVar = (afjn) this.f.io();
            afuuVarD.a(ahfoVar);
            afjnVar.c(ahfoVar, 30L, TimeUnit.SECONDS);
            afuuVarD.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afuuVarD.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }
}
