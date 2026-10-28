package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteFullException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatr {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil");
    public final Context b;
    public final wco c;
    public final awmd d;
    public final abqq e;
    private final mbc f;
    private final wuo g;
    private final wup h;
    private final aaek i;
    private final awmd j;
    private final vxu k;
    private final vxz l;
    private final aazo m;

    public aatr(Context context, mbc mbcVar, abqq abqqVar, vxu vxuVar, wuo wuoVar, wup wupVar, aaek aaekVar, aazo aazoVar, awmd awmdVar, wco wcoVar, awmd awmdVar2, vxz vxzVar) {
        this.b = context;
        this.f = mbcVar;
        this.e = abqqVar;
        this.k = vxuVar;
        this.g = wuoVar;
        this.h = wupVar;
        this.i = aaekVar;
        this.m = aazoVar;
        this.j = awmdVar;
        this.c = wcoVar;
        this.d = awmdVar2;
        this.l = vxzVar;
    }

    public static String c(String str) {
        return wfs.g(120, str);
    }

    private final wgs h(wgs wgsVar, wja wjaVar) {
        wgs wgsVarF = wjaVar.f(wgsVar.e(), wgsVar.C());
        if (wgsVarF != null) {
            return this.e.d(wgsVarF);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    private final aaml i(aaml aamlVar, wgs wgsVar, aafu aafuVar, String str, boolean z) {
        wgs wgsVar2;
        if (aamlVar == null) {
            wgsVar2 = wgsVar;
        } else {
            if (wgsVar != null) {
                wgs wgsVar3 = aamlVar.c;
                if (wgsVar.j() == wgsVar3.j() && wgsVar.k() == wgsVar3.k() && wgsVar.e() == wgsVar3.e() && TextUtils.equals(wgsVar.C(), wgsVar3.C())) {
                    wgsVar2 = wgsVar;
                } else {
                    wgsVar2 = wgsVar;
                }
            } else {
                wgsVar2 = null;
            }
            if (!aafuVar.c(str, aamlVar.a()) && this.l.l(215, 45817496L, false)) {
                throw new aarx(false, "Failed to delete offline stream, itag = " + aamlVar.a(), null, aamg.DISK_IO_ERROR, aogv.OFFLINE_DATABASE_ERROR);
            }
            aamlVar = null;
        }
        if (wgsVar == null) {
            return aamlVar;
        }
        if (aamlVar != null) {
            aamk aamkVarD = aamlVar.d();
            aamkVarD.e(wgsVar2);
            return aamkVarD.a();
        }
        boolean zContains = wir.b().contains(Integer.valueOf(wgsVar2.e()));
        long epochMilli = this.f.f().toEpochMilli();
        aamk aamkVarE = aaml.e();
        aamkVarE.e(wgsVar2);
        aamkVarE.b(zContains);
        aamkVarE.c(0L);
        aamkVarE.h(0);
        aamkVarE.i(epochMilli);
        aamkVarE.d(z);
        aaml aamlVarA = aamkVarE.a();
        if (aafuVar.d(aamlVarA) || !this.l.l(215, 45817496L, false)) {
            return aamlVarA;
        }
        throw new aarx(false, "Failed to insert offline stream, itag = " + aamlVarA.a(), null, aamg.DISK_IO_ERROR, aogv.OFFLINE_DATABASE_ERROR);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    final aamm a(int i, aodp aodpVar, String str, String str2, wja wjaVar, wiu wiuVar, aafu aafuVar, boolean z) throws IOException {
        aazo aazoVarP;
        wgs wgsVarH;
        wgs wgsVarH2;
        aaml aamlVar;
        aamm aammVarG = aafuVar.g(str2, null);
        boolean zI = abqq.i(i);
        if (aammVarG == null || ((aammVarG.b == null && ((aamlVar = aammVarG.a) == null || !wir.y().contains(Integer.valueOf(aamlVar.a())))) || (!zI && aammVarG.a == null))) {
            aazoVarP = null;
        } else {
            wgs wgsVarC = aammVarG.c();
            if (wgsVarC != null) {
                wgsVarH = h(wgsVarC, wjaVar);
                if (wgsVarH == null) {
                    aazoVarP = null;
                }
            } else {
                wgsVarH = null;
            }
            wgs wgsVarA = aammVarG.a();
            if (wgsVarA != null) {
                wgsVarH2 = h(wgsVarA, wjaVar);
                if (wgsVarH2 == null) {
                    aazoVarP = null;
                }
            } else {
                wgsVarH2 = null;
            }
            aazoVarP = new aazo(wgsVarH, wgsVarH2);
        }
        boolean z2 = wjaVar.A;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        if (z2) {
            String str3 = wjaVar.g;
            if (!yvf.b()) {
                i2 = 480;
            }
        }
        int i3 = i2;
        if (aazoVarP == null) {
            aazoVarP = this.m.p(wjaVar, wiuVar, i, i3, aodpVar, zI, str);
        }
        if (aazoVarP == null && !zI && this.i.f) {
            aazoVarP = this.m.p(wjaVar, wiuVar, i, i3, aodpVar, true, str);
            zI = true;
        }
        if (aazoVarP == null) {
            throw new aarx(true, "Stream pair could not be found.", null, aamg.CANNOT_OFFLINE, aogv.NO_VIDEO_STREAM);
        }
        if (!zI && aazoVarP.a == null) {
            throw new aarx(true, "Video stream not found.", null, aamg.CANNOT_OFFLINE, aogv.NO_VIDEO_STREAM);
        }
        Object obj = aazoVarP.a;
        if ((obj == null || !wir.y().contains(Integer.valueOf(((wgs) obj).e()))) && aazoVarP.b == null) {
            throw new aarx(true, "Audio stream not found.", null, aamg.CANNOT_OFFLINE, aogv.NO_AUDIO_STREAM);
        }
        wgs wgsVarD = obj != null ? this.e.d((wgs) obj) : null;
        Object objD = aazoVarP.b;
        if (objD != null) {
            objD = this.e.d((wgs) objD);
        }
        aazo aazoVar = new aazo(wgsVarD, (wgs) objD);
        return new aamm(i(aammVarG != null ? aammVarG.a : null, (wgs) aazoVar.a, aafuVar, str2, z), i(aammVarG != null ? aammVarG.b : null, (wgs) aazoVar.b, aafuVar, str2, z), true, false);
    }

    public final aarx b(IOException iOException) {
        if (iOException instanceof yoa) {
            return new aarx(false, "Error network timed out", iOException, aamg.NETWORK_READ_ERROR, aogv.OFFLINE_NETWORK_ERROR);
        }
        if ((iOException instanceof byt) || (iOException instanceof SocketTimeoutException)) {
            return new aarx(false, "Error reading from network", iOException, aamg.NETWORK_READ_ERROR, aogv.OFFLINE_NETWORK_ERROR);
        }
        if ((iOException instanceof byp) || (iOException instanceof jsw)) {
            return new aarx(true, "Error trying to read from or write to local disk.", iOException, aamg.DISK_IO_ERROR, aogv.OFFLINE_DISK_ERROR);
        }
        if (iOException instanceof jsl) {
            return new aarx(true, "Error trying to read from or write to local disk.", iOException, aamg.DISK_IO_ERROR, aogv.OFFLINE_DISK_ERROR);
        }
        if (iOException instanceof aarr) {
            return new aarx(false, "Out of storage error.", iOException, aamg.NO_STORAGE_ERROR, aogv.NO_OFFLINE_STORAGE);
        }
        if (iOException instanceof aaru) {
            return ((aaru) iOException).a();
        }
        if (iOException instanceof jsi) {
            return new aarx(true, "Error trying to read from or write to local disk.", iOException, aamg.DISK_IO_ERROR, aogv.OFFLINE_DISK_ERROR);
        }
        ((agrc) ((agrc) ((agrc) a.b()).j(iOException)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "convertDownloadIOException", (char) 616, "TransferTaskUtil.java")).t("[Offline] unknown pudl error");
        return new aarx(false, "Error trying to download video for offline.", iOException, aamg.DISK_IO_ERROR, aogv.OFFLINE_DISK_ERROR);
    }

    public final void d(String str, String str2, wjf wjfVar, aaew aaewVar, long j, wjb wjbVar) {
        if (aaewVar.f(str2) == null) {
            throw new aarx(true, "Video not found in database", null, aamg.FAILED_UNKNOWN, aogv.OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE);
        }
        try {
            if (aaewVar.B(str2, wjfVar, j, true, wjbVar)) {
                return;
            }
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoPlayerResponse", 825, "TransferTaskUtil.java")).w("[Offline] pudl task[%s] failed to save player response.", str);
            throw new aarx(false, "Fail to save playerResponse", null, aamg.FAILED_UNKNOWN, aogv.OFFLINE_DATABASE_ERROR);
        } catch (SQLiteFullException e) {
            throw new aarx(false, "Error trying to write to local disk.", e, aamg.DISK_IO_ERROR, aogv.OFFLINE_DATABASE_ERROR);
        }
    }

    public final void e(String str, String str2, aaew aaewVar, aarv aarvVar) {
        if (aauk.L(this.k).b) {
            try {
                wuq wuqVarA = this.h.a(str2);
                wuqVarA.m();
                wgi wgiVarG = this.g.g(wuqVarA);
                if (aaewVar.f(str2) == null) {
                    throw new aarx(true, "Video not found in database", null, aamg.FAILED_UNKNOWN, aogv.OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE);
                }
                try {
                    if (!aaewVar.H(str2, wgiVarG)) {
                        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveWatchNextResponseIfSupported", 881, "TransferTaskUtil.java")).w("[Offline] pudl task[%s] failed to save watchNextResponse.", str);
                        throw new aarx(false, "Fail to save watchNextResponse", null, aamg.FAILED_UNKNOWN, aogv.OFFLINE_DATABASE_ERROR);
                    }
                    aasi aasiVarA = aasj.a(15);
                    aasiVarA.f(str);
                    ((aask) aarvVar).f(aasiVarA.a());
                } catch (SQLiteFullException e) {
                    throw new aarx(false, "Error trying to write to local disk.", e, aamg.DISK_IO_ERROR, aogv.OFFLINE_DATABASE_ERROR);
                }
            } catch (wno e2) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveWatchNextResponseIfSupported", (char) 854, "TransferTaskUtil.java")).w("[Offline] pudl task[%s] failed to retrieve watch next response", str);
                throw new aarx(false, "Cannot retrieve watch next response from the server.", e2, aamg.NETWORK_READ_ERROR, aogv.OFFLINE_NETWORK_ERROR);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.List] */
    public final void f(aaew aaewVar, aalf aalfVar, aamw aamwVar) {
        aamo aamoVarC;
        Object obj;
        aamb aambVar = aamwVar.f;
        String strE = aarq.e(aambVar);
        aamo aamoVarAj = aaewVar.aj(strE);
        if (aamoVarAj != null) {
            try {
                if (aambVar.m("triggered_by_refresh", false)) {
                    Object obj2 = aamoVarAj.e;
                    taq.c();
                    aqmh aqmhVar = ((aohb) obj2).d;
                    if (aqmhVar == null) {
                        aqmhVar = aqmh.a;
                    }
                    abuz abuzVar = new abuz(aajg.f(aqmhVar, agke.r(240, 480)));
                    String strD = aamoVarAj.d();
                    for (wgg wggVar : abuzVar.b) {
                        try {
                            aalfVar.n(wggVar.a(), aalfVar.e(strD, wggVar.a()));
                        } catch (IOException | ExecutionException unused) {
                            aalfVar.l(aalfVar.i(strD));
                        }
                    }
                    aalfVar.l(aalfVar.g(strD));
                    try {
                        for (wgg wggVar2 : abuzVar.b) {
                            File fileE = aalfVar.e(strD, wggVar2.a());
                            File fileH = aalfVar.h(strD, wggVar2.a());
                            agyo.b(fileH);
                            agyo.c(fileE, fileH);
                        }
                        aalfVar.l(aalfVar.i(strD));
                    } catch (Throwable th) {
                        aalfVar.l(aalfVar.i(strD));
                        throw th;
                    }
                } else {
                    Object obj3 = aamoVarAj.e;
                    String strD2 = aamoVarAj.d();
                    aqmh aqmhVar2 = ((aohb) obj3).d;
                    if (aqmhVar2 == null) {
                        aqmhVar2 = aqmh.a;
                    }
                    taq.c();
                    for (wgg wggVar3 : new abuz(aajg.f(aqmhVar2, agke.r(240, 480))).b) {
                        aalfVar.n(wggVar3.a(), aalfVar.h(strD2, wggVar3.a()));
                    }
                }
                Object obj4 = aamoVarAj.b;
                if (obj4 != null) {
                    ?? r2 = ((aaok) obj4).b;
                    if (TextUtils.isEmpty(r2)) {
                        return;
                    }
                    aaok aaokVarAv = aaewVar.av((String) r2);
                    if (aaokVarAv != null) {
                        aalfVar.x(aaokVarAv);
                    }
                }
                aagl aaglVarS = aaewVar.b.s(strE);
                if (aaglVarS != null && (obj = (aamoVarC = aaglVarS.c()).c) != null) {
                    aaglVarS.n(new aamo((aohb) aamoVarC.e, aamoVarC.a, aaewVar.c.w(strE, (abuz) obj), (aaok) aamoVarC.b));
                }
                try {
                    aaewVar.s(strE);
                } catch (SQLiteFullException e) {
                    throw new aarx(true, "Out of storage error; couldn't sync player response in db", e, aamg.NO_STORAGE_ERROR, aogv.NO_OFFLINE_STORAGE);
                }
            } catch (aarr e2) {
                throw new aarx(true, "Out of storage error.", e2, aamg.NO_STORAGE_ERROR, aogv.NO_OFFLINE_STORAGE);
            } catch (byt e3) {
                e = e3;
                Exception exc = e;
                ((agrc) ((agrc) ((agrc) a.c()).j(exc)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoThumbnails", (char) 672, "TransferTaskUtil.java")).w("[Offline] Nonfatal exception for saving thumbnails for %s", strE);
                throw new aarx(false, "Non-fatal thumbnail saving error", exc, aamg.NETWORK_READ_ERROR, aogv.OFFLINE_NETWORK_ERROR);
            } catch (SocketTimeoutException e4) {
                e = e4;
                Exception exc2 = e;
                ((agrc) ((agrc) ((agrc) a.c()).j(exc2)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoThumbnails", (char) 672, "TransferTaskUtil.java")).w("[Offline] Nonfatal exception for saving thumbnails for %s", strE);
                throw new aarx(false, "Non-fatal thumbnail saving error", exc2, aamg.NETWORK_READ_ERROR, aogv.OFFLINE_NETWORK_ERROR);
            } catch (yoa e5) {
                e = e5;
                Exception exc3 = e;
                ((agrc) ((agrc) ((agrc) a.c()).j(exc3)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoThumbnails", (char) 672, "TransferTaskUtil.java")).w("[Offline] Nonfatal exception for saving thumbnails for %s", strE);
                throw new aarx(false, "Non-fatal thumbnail saving error", exc3, aamg.NETWORK_READ_ERROR, aogv.OFFLINE_NETWORK_ERROR);
            } catch (IOException e6) {
                e = e6;
                Exception exc4 = e;
                ((agrc) ((agrc) ((agrc) a.c()).j(exc4)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoThumbnails", (char) 680, "TransferTaskUtil.java")).w("[Offline] Failed saving thumbnails for %s", strE);
                throw new aarx(true, "Fatal thumbnail saving error", exc4, aamg.DISK_IO_ERROR, aogv.OFFLINE_DISK_ERROR);
            } catch (ExecutionException e7) {
                e = e7;
                Exception exc5 = e;
                ((agrc) ((agrc) ((agrc) a.c()).j(exc5)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoThumbnails", (char) 680, "TransferTaskUtil.java")).w("[Offline] Failed saving thumbnails for %s", strE);
                throw new aarx(true, "Fatal thumbnail saving error", exc5, aamg.DISK_IO_ERROR, aogv.OFFLINE_DISK_ERROR);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [awmd, java.lang.Object] */
    public final void g(String str, String str2, ynw ynwVar, aaml aamlVar, long j, aafu aafuVar, String str3, zgx zgxVar, zgx zgxVar2, abxv abxvVar) throws Throwable {
        long jB;
        if (aamlVar.i()) {
            zgxVar2.c(j);
            return;
        }
        long jB2 = aamlVar.b() - aamlVar.e;
        if (str3 != null) {
            aadc aadcVarC = ((aanb) abxvVar.c.io()).b().c();
            if (aadcVarC == null) {
                jB = 0;
            } else {
                File fileG = aadcVarC.g(str3);
                jB = fileG == null ? abxvVar.b() : abxvVar.c(fileG);
            }
        } else {
            jB = abxvVar.b();
        }
        if (jB <= jB2) {
            throw new aarr(jB2);
        }
        aamlVar.a();
        wgs wgsVar = aamlVar.c;
        Uri uri = wgsVar.e;
        if (str3 != null) {
            aafuVar.f(str, aamlVar.a(), str3);
        }
        try {
            ynwVar.b(wgsVar, 0L, j, null, str2, zgxVar, zgxVar2);
        } catch (byv e) {
            if (e.d != 403) {
                throw e;
            }
            throw new aato();
        }
    }
}
