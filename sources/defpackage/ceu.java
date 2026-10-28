package defpackage;

import android.media.metrics.PlaybackMetrics;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ceu implements cfb {
    private static final Random d = new Random();
    public cfa c;
    private String g;
    public final btm a = new btm();
    public final btl b = new btl();
    private final HashMap e = new HashMap();
    private btn f = btn.a;
    private long h = -1;

    public static String b() {
        byte[] bArr = new byte[12];
        d.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0080 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final cet i(int i, cnm cnmVar) {
        long j;
        HashMap map = this.e;
        long j2 = Long.MAX_VALUE;
        cet cetVar = null;
        for (cet cetVar2 : map.values()) {
            if (cetVar2.c == -1 && i == cetVar2.b && cnmVar != null) {
                long jA = cetVar2.g.a();
                long j3 = cnmVar.d;
                if (j3 >= jA) {
                    cetVar2.c = j3;
                }
            }
            if (cnmVar != null) {
                long j4 = cnmVar.d;
                if (j4 != -1) {
                    cnm cnmVar2 = cetVar2.d;
                    if (cnmVar2 == null) {
                        if (!cnmVar.c() && j4 == cetVar2.c) {
                            j = cetVar2.c;
                            if (j != -1 || j < j2) {
                                cetVar = cetVar2;
                                j2 = j;
                            } else if (j == j2) {
                                int i2 = bwp.a;
                                if (cetVar.d != null && cetVar2.d != null) {
                                    cetVar = cetVar2;
                                }
                            }
                        }
                    } else if (j4 == cnmVar2.d && cnmVar.b == cnmVar2.b && cnmVar.c == cnmVar2.c) {
                        j = cetVar2.c;
                        if (j != -1) {
                        }
                        cetVar = cetVar2;
                        j2 = j;
                    }
                }
            }
            if (i == cetVar2.b) {
                j = cetVar2.c;
                if (j != -1) {
                }
                cetVar = cetVar2;
                j2 = j;
            }
        }
        if (cetVar != null) {
            return cetVar;
        }
        String strB = b();
        cet cetVar3 = new cet(this, strB, i, cnmVar);
        map.put(strB, cetVar3);
        return cetVar3;
    }

    private final void j(cet cetVar) {
        long j = cetVar.c;
        if (j != -1 && cetVar.e) {
            this.h = j;
        }
        this.g = null;
    }

    private final void k(cdy cdyVar) {
        cnm cnmVar;
        if (cdyVar.b.n()) {
            String str = this.g;
            if (str != null) {
                cet cetVar = (cet) this.e.get(str);
                cetVar.getClass();
                j(cetVar);
                return;
            }
            return;
        }
        cet cetVar2 = (cet) this.e.get(this.g);
        int i = cdyVar.c;
        cnm cnmVar2 = cdyVar.d;
        this.g = i(i, cnmVar2).a;
        f(cdyVar);
        if (cnmVar2 == null || !cnmVar2.c()) {
            return;
        }
        if (cetVar2 != null) {
            if (cetVar2.c == cnmVar2.d && (cnmVar = cetVar2.d) != null) {
                if (cnmVar.b == cnmVar2.b && cnmVar.c == cnmVar2.c) {
                    return;
                }
            }
        }
        i(i, new cnm(cnmVar2.a, -1, -1, cnmVar2.d, -1));
    }

    public final long a() {
        cet cetVar = (cet) this.e.get(this.g);
        if (cetVar != null) {
            long j = cetVar.c;
            if (j != -1) {
                return j;
            }
        }
        return this.h + 1;
    }

    @Override // defpackage.cfb
    public final synchronized String c() {
        return this.g;
    }

    @Override // defpackage.cfb
    public final synchronized String d(btn btnVar, cnm cnmVar) {
        return i(btnVar.m(cnmVar.a, this.b).c, cnmVar).a;
    }

    @Override // defpackage.cfb
    public final synchronized void e(cdy cdyVar) {
        cfa cfaVar;
        String str = this.g;
        if (str != null) {
            cet cetVar = (cet) this.e.get(str);
            cetVar.getClass();
            j(cetVar);
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            cet cetVar2 = (cet) it.next();
            it.remove();
            if (cetVar2.e && (cfaVar = this.c) != null) {
                cfaVar.c(cdyVar, cetVar2.a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:31:0x0086, B:33:0x008a, B:35:0x0091, B:37:0x0097, B:39:0x00b5, B:40:0x00be, B:42:0x00c7, B:43:0x00d7, B:45:0x00de, B:46:0x00ee), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:31:0x0086, B:33:0x008a, B:35:0x0091, B:37:0x0097, B:39:0x00b5, B:40:0x00be, B:42:0x00c7, B:43:0x00d7, B:45:0x00de, B:46:0x00ee), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:31:0x0086, B:33:0x008a, B:35:0x0091, B:37:0x0097, B:39:0x00b5, B:40:0x00be, B:42:0x00c7, B:43:0x00d7, B:45:0x00de, B:46:0x00ee), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:31:0x0086, B:33:0x008a, B:35:0x0091, B:37:0x0097, B:39:0x00b5, B:40:0x00be, B:42:0x00c7, B:43:0x00d7, B:45:0x00de, B:46:0x00ee), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:31:0x0086, B:33:0x008a, B:35:0x0091, B:37:0x0097, B:39:0x00b5, B:40:0x00be, B:42:0x00c7, B:43:0x00d7, B:45:0x00de, B:46:0x00ee), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: all -> 0x00f7, LOOP:0: B:41:0x00c5->B:42:0x00c7, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:31:0x0086, B:33:0x008a, B:35:0x0091, B:37:0x0097, B:39:0x00b5, B:40:0x00be, B:42:0x00c7, B:43:0x00d7, B:45:0x00de, B:46:0x00ee), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de A[Catch: all -> 0x00f7, LOOP:1: B:44:0x00dc->B:45:0x00de, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:31:0x0086, B:33:0x008a, B:35:0x0091, B:37:0x0097, B:39:0x00b5, B:40:0x00be, B:42:0x00c7, B:43:0x00d7, B:45:0x00de, B:46:0x00ee), top: B:55:0x0001 }] */
    @Override // defpackage.cfb
    public final synchronized void f(cdy cdyVar) {
        int i;
        cet cetVarI;
        String str;
        PlaybackMetrics.Builder builderAddExperimentId;
        int i2;
        int i3;
        Object obj;
        int i4;
        cet cetVarI2;
        cet cetVar;
        this.c.getClass();
        btn btnVar = cdyVar.b;
        if (!btnVar.n()) {
            cnm cnmVar = cdyVar.d;
            if (cnmVar != null) {
                long j = cnmVar.d;
                if ((j == -1 || j >= a()) && ((cetVar = (cet) this.e.get(this.g)) == null || cetVar.c != -1 || cetVar.b == cdyVar.c)) {
                    i = cdyVar.c;
                    cetVarI = i(i, cnmVar);
                    if (this.g == null) {
                        this.g = cetVarI.a;
                    }
                    if (cnmVar != null && cnmVar.c()) {
                        obj = cnmVar.a;
                        long j2 = cnmVar.d;
                        i4 = cnmVar.b;
                        cetVarI2 = i(i, new cnm(obj, -1, -1, j2, i4));
                        if (!cetVarI2.e) {
                            cetVarI2.e = true;
                            btl btlVar = this.b;
                            btnVar.m(obj, btlVar);
                            btlVar.l(i4);
                            int i5 = bwp.a;
                            btlVar.g();
                        }
                    }
                    if (!cetVarI.e) {
                        cetVarI.e = true;
                    }
                    str = cetVarI.a;
                    if (str.equals(this.g) && !cetVarI.f) {
                        cetVarI.f = true;
                        cfa cfaVar = this.c;
                        if (cnmVar != null || !cnmVar.c()) {
                            cfaVar.a();
                            cfaVar.b = str;
                            cfaVar.c = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
                            builderAddExperimentId = cfaVar.c;
                            if (!bsc.a) {
                                builderAddExperimentId = builderAddExperimentId.addExperimentId(7000000000000000000L);
                            }
                            for (int i6 : bsc.d(true)) {
                                builderAddExperimentId = builderAddExperimentId.addExperimentId(((long) i6) + 7001000000000000000L);
                            }
                            for (int i7 : bsc.d(false)) {
                                builderAddExperimentId = builderAddExperimentId.addExperimentId(((long) i7) + 7002000000000000000L);
                            }
                            cfaVar.b(btnVar, cnmVar);
                        }
                    }
                }
            } else {
                i = cdyVar.c;
                cetVarI = i(i, cnmVar);
                if (this.g == null) {
                    this.g = cetVarI.a;
                }
                if (cnmVar != null) {
                    obj = cnmVar.a;
                    long j3 = cnmVar.d;
                    i4 = cnmVar.b;
                    cetVarI2 = i(i, new cnm(obj, -1, -1, j3, i4));
                    if (!cetVarI2.e) {
                        cetVarI2.e = true;
                        btl btlVar2 = this.b;
                        btnVar.m(obj, btlVar2);
                        btlVar2.l(i4);
                        int i8 = bwp.a;
                        btlVar2.g();
                    }
                }
                if (!cetVarI.e) {
                    cetVarI.e = true;
                }
                str = cetVarI.a;
                if (str.equals(this.g)) {
                    cetVarI.f = true;
                    cfa cfaVar2 = this.c;
                    if (cnmVar != null) {
                    }
                    cfaVar2.a();
                    cfaVar2.b = str;
                    cfaVar2.c = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
                    builderAddExperimentId = cfaVar2.c;
                    if (!bsc.a) {
                        builderAddExperimentId = builderAddExperimentId.addExperimentId(7000000000000000000L);
                    }
                    while (i3 < r4) {
                        builderAddExperimentId = builderAddExperimentId.addExperimentId(((long) i6) + 7001000000000000000L);
                    }
                    while (i2 < r4) {
                        builderAddExperimentId = builderAddExperimentId.addExperimentId(((long) i7) + 7002000000000000000L);
                    }
                    cfaVar2.b(btnVar, cnmVar);
                }
            }
        }
    }

    @Override // defpackage.cfb
    public final synchronized void g(cdy cdyVar, int i) {
        this.c.getClass();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            cet cetVar = (cet) it.next();
            if (cetVar.a(cdyVar)) {
                it.remove();
                String str = cetVar.a;
                boolean zEquals = str.equals(this.g);
                if (zEquals) {
                    j(cetVar);
                }
                if (cetVar.e) {
                    if (i == 0 && zEquals) {
                        boolean z = cetVar.f;
                    }
                    this.c.c(cdyVar, str);
                }
            }
        }
        k(cdyVar);
    }

    @Override // defpackage.cfb
    public final synchronized void h(cdy cdyVar) {
        cnm cnmVar;
        this.c.getClass();
        btn btnVar = this.f;
        this.f = cdyVar.b;
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            cet cetVar = (cet) it.next();
            btn btnVar2 = this.f;
            int i = cetVar.b;
            if (i < btnVar.c()) {
                ceu ceuVar = cetVar.g;
                btm btmVar = ceuVar.a;
                btnVar.e(i, btmVar, 0L);
                int i2 = btmVar.o;
                while (true) {
                    if (i2 > btmVar.p) {
                        i = -1;
                        break;
                    }
                    int iA = btnVar2.a(btnVar.f(i2));
                    if (iA != -1) {
                        i = btnVar2.d(iA, ceuVar.b, false).c;
                        break;
                    }
                    i2++;
                }
            } else if (i >= btnVar2.c()) {
                i = -1;
                break;
            }
            cetVar.b = i;
            if (i == -1 || (((cnmVar = cetVar.d) != null && btnVar2.a(cnmVar.a) == -1) || cetVar.a(cdyVar))) {
                it.remove();
                String str = cetVar.a;
                if (str.equals(this.g)) {
                    j(cetVar);
                }
                if (cetVar.e) {
                    this.c.c(cdyVar, str);
                }
            }
        }
        k(cdyVar);
    }
}
