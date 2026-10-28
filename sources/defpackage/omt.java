package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class omt implements omw {
    private final omb a;
    private final oin b;
    private final String c;
    private final oiw d;
    private final int e;
    private final long f;
    private final String g;
    private final oii h;
    private final Executor i;
    private final int j;
    private final ong k;
    private final ayq l;

    public omt(omb ombVar, ayq ayqVar, oin oinVar, int i, ong ongVar, oiw oiwVar, int i2, long j, String str, oii oiiVar, Executor executor) {
        this.a = ombVar;
        this.l = ayqVar;
        this.b = oinVar;
        this.j = i;
        this.c = nsp.e(oinVar);
        this.k = ongVar;
        this.d = oiwVar;
        this.e = i2;
        this.f = j;
        this.g = str;
        this.h = oiiVar;
        this.i = executor;
    }

    public static ListenableFuture c(oiv oivVar, oin oinVar, int i, omb ombVar, Executor executor) {
        oiz oizVarA = nsj.a(oinVar, i);
        return ooi.d(e(ombVar, oizVarA, executor)).f(new okx((Object) oivVar, (Object) ombVar, (Object) oizVarA, 15, (short[]) null), executor).f(new oll(oizVarA, 14), executor);
    }

    static ListenableFuture d(omb ombVar, oin oinVar, int i, ayq ayqVar, Uri uri, String str, ong ongVar, oii oiiVar, Executor executor) {
        return ooi.d(e(ombVar, nsj.a(oinVar, i), executor)).f(new okm(oiiVar, str, ongVar, ayqVar, uri, 4), executor);
    }

    private static ListenableFuture e(omb ombVar, oiz oizVar, Executor executor) {
        return ahno.as(ombVar.e(oizVar), new oll(oizVar, 17), executor);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[LOOP:1: B:56:0x01ae->B:126:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0141 A[Catch: IllegalArgumentException -> 0x02a5, oig -> 0x02d0, TryCatch #4 {IllegalArgumentException -> 0x02a5, blocks: (B:36:0x0137, B:38:0x0141, B:39:0x0143), top: B:109:0x0137, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0194 A[Catch: all -> 0x027a, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x027a, blocks: (B:44:0x0173, B:47:0x0194, B:79:0x0279, B:78:0x0276, B:75:0x0271, B:45:0x0189), top: B:117:0x0173, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0199 A[Catch: IOException -> 0x0287, oig -> 0x02d0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0287, blocks: (B:42:0x0166, B:49:0x0199, B:87:0x0286, B:86:0x0283), top: B:108:0x0166, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a2 A[Catch: IOException -> 0x0243, oig -> 0x02d0, TryCatch #1 {oig -> 0x02d0, blocks: (B:6:0x0013, B:9:0x0020, B:12:0x002e, B:13:0x003a, B:14:0x0042, B:18:0x00cc, B:19:0x00e5, B:20:0x00e6, B:22:0x00f0, B:24:0x00f4, B:25:0x00f6, B:26:0x00fc, B:28:0x0102, B:30:0x010d, B:31:0x010f, B:34:0x011d, B:35:0x0136, B:36:0x0137, B:38:0x0141, B:39:0x0143, B:40:0x014f, B:42:0x0166, B:49:0x0199, B:50:0x019c, B:52:0x01a2, B:54:0x01a6, B:55:0x01a8, B:56:0x01ae, B:58:0x01b4, B:60:0x01bf, B:62:0x01cb, B:63:0x0240, B:64:0x0243, B:68:0x0251, B:70:0x025b, B:71:0x026c, B:87:0x0286, B:86:0x0283, B:89:0x0288, B:90:0x02a4, B:92:0x02a6, B:93:0x02c0), top: B:105:0x0013, inners: #0, #3, #4, #10 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6 A[Catch: IOException -> 0x0243, oig -> 0x02d0, TryCatch #1 {oig -> 0x02d0, blocks: (B:6:0x0013, B:9:0x0020, B:12:0x002e, B:13:0x003a, B:14:0x0042, B:18:0x00cc, B:19:0x00e5, B:20:0x00e6, B:22:0x00f0, B:24:0x00f4, B:25:0x00f6, B:26:0x00fc, B:28:0x0102, B:30:0x010d, B:31:0x010f, B:34:0x011d, B:35:0x0136, B:36:0x0137, B:38:0x0141, B:39:0x0143, B:40:0x014f, B:42:0x0166, B:49:0x0199, B:50:0x019c, B:52:0x01a2, B:54:0x01a6, B:55:0x01a8, B:56:0x01ae, B:58:0x01b4, B:60:0x01bf, B:62:0x01cb, B:63:0x0240, B:64:0x0243, B:68:0x0251, B:70:0x025b, B:71:0x026c, B:87:0x0286, B:86:0x0283, B:89:0x0288, B:90:0x02a4, B:92:0x02a6, B:93:0x02c0), top: B:105:0x0013, inners: #0, #3, #4, #10 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b4 A[Catch: IOException -> 0x0243, oig -> 0x02d0, TryCatch #1 {oig -> 0x02d0, blocks: (B:6:0x0013, B:9:0x0020, B:12:0x002e, B:13:0x003a, B:14:0x0042, B:18:0x00cc, B:19:0x00e5, B:20:0x00e6, B:22:0x00f0, B:24:0x00f4, B:25:0x00f6, B:26:0x00fc, B:28:0x0102, B:30:0x010d, B:31:0x010f, B:34:0x011d, B:35:0x0136, B:36:0x0137, B:38:0x0141, B:39:0x0143, B:40:0x014f, B:42:0x0166, B:49:0x0199, B:50:0x019c, B:52:0x01a2, B:54:0x01a6, B:55:0x01a8, B:56:0x01ae, B:58:0x01b4, B:60:0x01bf, B:62:0x01cb, B:63:0x0240, B:64:0x0243, B:68:0x0251, B:70:0x025b, B:71:0x026c, B:87:0x0286, B:86:0x0283, B:89:0x0288, B:90:0x02a4, B:92:0x02a6, B:93:0x02c0), top: B:105:0x0013, inners: #0, #3, #4, #10 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cb A[Catch: IOException -> 0x0243, oig -> 0x02d0, EDGE_INSN: B:62:0x01cb->B:63:0x0240 BREAK  A[LOOP:1: B:56:0x01ae->B:126:?], TryCatch #1 {oig -> 0x02d0, blocks: (B:6:0x0013, B:9:0x0020, B:12:0x002e, B:13:0x003a, B:14:0x0042, B:18:0x00cc, B:19:0x00e5, B:20:0x00e6, B:22:0x00f0, B:24:0x00f4, B:25:0x00f6, B:26:0x00fc, B:28:0x0102, B:30:0x010d, B:31:0x010f, B:34:0x011d, B:35:0x0136, B:36:0x0137, B:38:0x0141, B:39:0x0143, B:40:0x014f, B:42:0x0166, B:49:0x0199, B:50:0x019c, B:52:0x01a2, B:54:0x01a6, B:55:0x01a8, B:56:0x01ae, B:58:0x01b4, B:60:0x01bf, B:62:0x01cb, B:63:0x0240, B:64:0x0243, B:68:0x0251, B:70:0x025b, B:71:0x026c, B:87:0x0286, B:86:0x0283, B:89:0x0288, B:90:0x02a4, B:92:0x02a6, B:93:0x02c0), top: B:105:0x0013, inners: #0, #3, #4, #10 }] */
    @Override // defpackage.omw
    public final ListenableFuture a(Uri uri) {
        atyn atynVar;
        Uri uriBuild;
        ong ongVar;
        ayq ayqVar;
        oiw oiwVar;
        int i;
        long j;
        String str;
        oin oinVar;
        InputStream inputStream;
        OutputStream outputStream;
        int iAU;
        atyn atynVar2;
        Iterator it;
        long jV;
        long jV2;
        int i2 = onb.a;
        oin oinVar2 = this.b;
        String str2 = (oinVar2.b & 32) != 0 ? oinVar2.i : oinVar2.g;
        try {
            ayq ayqVar2 = this.l;
            omu.d(ayqVar2, oinVar2, uri, str2);
            int i3 = oinVar2.b & 32;
            if (i3 != 0 && i3 != 0) {
                Uri uriA = nsm.a(uri);
                if (nsp.f(oinVar2)) {
                    ong ongVar2 = this.k;
                    oiw oiwVar2 = this.d;
                    int i4 = this.e;
                    long j2 = this.f;
                    String str3 = this.g;
                    String str4 = oinVar2.c;
                    try {
                        ayqVar2.X(uri, new omx(uriA));
                        try {
                            aihf aihfVarCreateBuilder = ahai.a.createBuilder();
                            String str5 = oiwVar2.c;
                            aihfVarCreateBuilder.copyOnWrite();
                            ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
                            str5.getClass();
                            ahaiVar.b |= 1;
                            ahaiVar.c = str5;
                            aihfVarCreateBuilder.copyOnWrite();
                            ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
                            ahaiVar2.b |= 2;
                            ahaiVar2.d = i4;
                            aihfVarCreateBuilder.copyOnWrite();
                            ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
                            ahaiVar3.b |= 64;
                            ahaiVar3.i = j2;
                            aihfVarCreateBuilder.copyOnWrite();
                            ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
                            str3.getClass();
                            ahaiVar4.b |= SemanticState.Focused;
                            ahaiVar4.j = str3;
                            String str6 = oiwVar2.d;
                            aihfVarCreateBuilder.copyOnWrite();
                            ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.instance;
                            str6.getClass();
                            ahaiVar5.b |= 4;
                            ahaiVar5.e = str6;
                            ongVar2.m((ahai) aihfVarCreateBuilder.build(), 5, ((Long) ayqVar2.X(uriA, new qqp(5))).longValue(), ayqVar2.V(uri), str4, 0);
                            ayqVar2.aa(uri);
                        } catch (IOException unused) {
                        }
                    } catch (IOException e) {
                        onb.g(e, "%s: Failed to apply zip download transform for file %s.", "DownloaderCallbackImpl", uri);
                        acb acbVarA = oig.a();
                        acbVarA.b = oif.DOWNLOAD_TRANSFORM_IO_ERROR;
                        acbVarA.d = e;
                        throw acbVarA.a();
                    }
                } else {
                    oin oinVar3 = this.b;
                    if ((oinVar3.b & 32) != 0) {
                        atyn atynVar3 = oinVar3.h;
                        if (atynVar3 == null) {
                            atynVar3 = atyn.a;
                        }
                        Iterator it2 = atynVar3.b.iterator();
                        while (it2.hasNext()) {
                            if (((atym) it2.next()).b == 6) {
                                ayq ayqVar3 = this.l;
                                try {
                                    ayqVar3.X(uri, new qqp(2));
                                    ayqVar3.ab(uri, uriA);
                                } catch (IOException e2) {
                                    onb.g(e2, "%s: Failed to apply defrag download transform for file %s.", "DownloaderCallbackImpl", uri);
                                    acb acbVarA2 = oig.a();
                                    acbVarA2.b = oif.DOWNLOAD_TRANSFORM_IO_ERROR;
                                    acbVarA2.d = e2;
                                    throw acbVarA2.a();
                                }
                            }
                        }
                        Uri.Builder builderBuildUpon = uri.buildUpon();
                        atynVar = this.b.h;
                        if (atynVar == null) {
                            atynVar = atyn.a;
                        }
                        uriBuild = builderBuildUpon.encodedFragment(qra.a(atynVar)).build();
                        ongVar = this.k;
                        ayqVar = this.l;
                        oiwVar = this.d;
                        i = this.e;
                        j = this.f;
                        str = this.g;
                        oinVar = this.b;
                        oii oiiVar = this.h;
                        qpu qpuVar = new qpu();
                        inputStream = (InputStream) ayqVar.X(uriBuild, new qqs());
                        qqu qquVar = new qqu();
                        qquVar.a = new qpu[]{qpuVar};
                        outputStream = (OutputStream) ayqVar.X(uriA, qquVar);
                        agyi.a(inputStream, outputStream);
                        outputStream.flush();
                        oiiVar.k();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if ((oinVar.b & 32) != 0) {
                            atynVar2 = oinVar.h;
                            if (atynVar2 == null) {
                                atynVar2 = atyn.a;
                            }
                            it = atynVar2.b.iterator();
                            while (it.hasNext()) {
                                if (((atym) it.next()).b == 1) {
                                    jV = ayqVar.V(uriA);
                                    jV2 = ayqVar.V(uriBuild);
                                    if (jV > jV2) {
                                        break;
                                    }
                                    aihf aihfVarCreateBuilder2 = ahai.a.createBuilder();
                                    String str7 = oiwVar.c;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    ahai ahaiVar6 = (ahai) aihfVarCreateBuilder2.instance;
                                    str7.getClass();
                                    ahaiVar6.b |= 1;
                                    ahaiVar6.c = str7;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    ahai ahaiVar7 = (ahai) aihfVarCreateBuilder2.instance;
                                    ahaiVar7.b |= 2;
                                    ahaiVar7.d = i;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    ahai ahaiVar8 = (ahai) aihfVarCreateBuilder2.instance;
                                    ahaiVar8.b |= 64;
                                    ahaiVar8.i = j;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    ahai ahaiVar9 = (ahai) aihfVarCreateBuilder2.instance;
                                    str.getClass();
                                    ahaiVar9.b |= SemanticState.Focused;
                                    ahaiVar9.j = str;
                                    String str8 = oiwVar.d;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    ahai ahaiVar10 = (ahai) aihfVarCreateBuilder2.instance;
                                    str8.getClass();
                                    ahaiVar10.b |= 4;
                                    ahaiVar10.e = str8;
                                    ongVar.m((ahai) aihfVarCreateBuilder2.build(), 3, jV, jV2, oinVar.c, 0);
                                    break;
                                }
                            }
                        }
                        ayqVar.aa(uriBuild);
                        iAU = a.aU(this.b.f);
                        if (iAU != 0) {
                            onb.d("%s: Final file checksum verification failed. %s.", "DownloaderCallbackImpl", uriA);
                            acb acbVarA3 = oig.a();
                            acbVarA3.b = oif.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                            throw acbVarA3.a();
                        }
                        onb.d("%s: Final file checksum verification failed. %s.", "DownloaderCallbackImpl", uriA);
                        acb acbVarA4 = oig.a();
                        acbVarA4.b = oif.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                        throw acbVarA4.a();
                    }
                    try {
                        Uri.Builder builderBuildUpon2 = uri.buildUpon();
                        atynVar = this.b.h;
                        if (atynVar == null) {
                            atynVar = atyn.a;
                        }
                        uriBuild = builderBuildUpon2.encodedFragment(qra.a(atynVar)).build();
                        ongVar = this.k;
                        ayqVar = this.l;
                        oiwVar = this.d;
                        i = this.e;
                        j = this.f;
                        str = this.g;
                        oinVar = this.b;
                        oii oiiVar2 = this.h;
                        qpu qpuVar2 = new qpu();
                        try {
                            inputStream = (InputStream) ayqVar.X(uriBuild, new qqs());
                            try {
                                qqu qquVar2 = new qqu();
                                qquVar2.a = new qpu[]{qpuVar2};
                                outputStream = (OutputStream) ayqVar.X(uriA, qquVar2);
                                try {
                                    agyi.a(inputStream, outputStream);
                                    outputStream.flush();
                                    oiiVar2.k();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    try {
                                        if ((oinVar.b & 32) != 0) {
                                            atynVar2 = oinVar.h;
                                            if (atynVar2 == null) {
                                                atynVar2 = atyn.a;
                                            }
                                            it = atynVar2.b.iterator();
                                            while (it.hasNext()) {
                                                if (((atym) it.next()).b == 1) {
                                                    jV = ayqVar.V(uriA);
                                                    jV2 = ayqVar.V(uriBuild);
                                                    if (jV > jV2) {
                                                        break;
                                                    }
                                                    aihf aihfVarCreateBuilder3 = ahai.a.createBuilder();
                                                    String str9 = oiwVar.c;
                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                    ahai ahaiVar11 = (ahai) aihfVarCreateBuilder3.instance;
                                                    str9.getClass();
                                                    ahaiVar11.b |= 1;
                                                    ahaiVar11.c = str9;
                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                    ahai ahaiVar12 = (ahai) aihfVarCreateBuilder3.instance;
                                                    ahaiVar12.b |= 2;
                                                    ahaiVar12.d = i;
                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                    ahai ahaiVar13 = (ahai) aihfVarCreateBuilder3.instance;
                                                    ahaiVar13.b |= 64;
                                                    ahaiVar13.i = j;
                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                    ahai ahaiVar14 = (ahai) aihfVarCreateBuilder3.instance;
                                                    str.getClass();
                                                    ahaiVar14.b |= SemanticState.Focused;
                                                    ahaiVar14.j = str;
                                                    String str10 = oiwVar.d;
                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                    ahai ahaiVar15 = (ahai) aihfVarCreateBuilder3.instance;
                                                    str10.getClass();
                                                    ahaiVar15.b |= 4;
                                                    ahaiVar15.e = str10;
                                                    ongVar.m((ahai) aihfVarCreateBuilder3.build(), 3, jV, jV2, oinVar.c, 0);
                                                    break;
                                                }
                                            }
                                        }
                                        ayqVar.aa(uriBuild);
                                    } catch (IOException unused2) {
                                    }
                                    iAU = a.aU(this.b.f);
                                    if ((iAU != 0 || iAU != 2) && !omu.e(this.l, uriA, this.c)) {
                                        onb.d("%s: Final file checksum verification failed. %s.", "DownloaderCallbackImpl", uriA);
                                        acb acbVarA5 = oig.a();
                                        acbVarA5.b = oif.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                                        throw acbVarA5.a();
                                    }
                                } catch (Throwable th) {
                                    if (outputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        outputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                if (inputStream == null) {
                                    throw th3;
                                }
                                try {
                                    inputStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (IOException e3) {
                            onb.g(e3, "%s: Failed to apply download transform for file %s.", "DownloaderCallbackImpl", uriBuild);
                            acb acbVarA6 = oig.a();
                            acbVarA6.b = oif.DOWNLOAD_TRANSFORM_IO_ERROR;
                            acbVarA6.d = e3;
                            throw acbVarA6.a();
                        }
                    } catch (IllegalArgumentException e4) {
                        onb.g(e4, "%s: Exception while trying to serialize download transform", "DownloaderCallbackImpl");
                        acb acbVarA7 = oig.a();
                        acbVarA7.b = oif.UNABLE_TO_SERIALIZE_DOWNLOAD_TRANSFORM_ERROR;
                        acbVarA7.d = e4;
                        throw acbVarA7.a();
                    }
                }
            }
            return c(oiv.DOWNLOAD_COMPLETE, this.b, this.j, this.a, this.i);
        } catch (oig e5) {
            if (!e5.a.equals(oif.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
                return ahng.m(e5);
            }
            omb ombVar = this.a;
            oin oinVar4 = this.b;
            int i5 = this.j;
            ayq ayqVar4 = this.l;
            String str11 = this.c;
            ong ongVar3 = this.k;
            oii oiiVar3 = this.h;
            Executor executor = this.i;
            return ooi.d(d(ombVar, oinVar4, i5, ayqVar4, uri, str11, ongVar3, oiiVar3, executor)).c(IOException.class, new oll(e5, 15), executor).f(new oll(e5, 16), executor);
        }
    }

    @Override // defpackage.omw
    public final ListenableFuture b(oig oigVar) {
        int i = onb.a;
        boolean zEquals = oigVar.a.equals(oif.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR);
        oin oinVar = this.b;
        if (zEquals) {
            return c(oiv.CORRUPTED, oinVar, this.j, this.a, this.i);
        }
        return c(oiv.DOWNLOAD_FAILED, oinVar, this.j, this.a, this.i);
    }
}
