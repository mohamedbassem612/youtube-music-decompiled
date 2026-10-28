package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkt {
    public static final long a;
    public static final long b;
    public final avmb c;
    public final aebc d;
    public final aebc e;
    private final awmd f;
    private final trf g;
    private final aebc h;
    private final aebc i;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 40000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        b = 4000L;
    }

    public gkt(aerj aerjVar, awmd awmdVar, avmb avmbVar, trf trfVar) {
        this.f = awmdVar;
        this.c = avmbVar;
        this.g = trfVar;
        this.d = aerjVar.m("appCritical");
        this.h = aerjVar.m("homeCritical");
        this.i = aerjVar.m("watchCritical");
        this.e = aerjVar.m("nonCritical");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(trb[] trbVarArr, trb[] trbVarArr2, trb[] trbVarArr3, awlk awlkVar, awlk awlkVar2, avlh avlhVar, boolean z) {
        avpi avpiVar;
        Object avqlVar;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int i = 0;
        if (avlhVar != null) {
            awlk awlkVar3 = new awlk();
            awlk awlkVar4 = new awlk();
            avlhVar.x(new gkq(i)).au().D(new gkr(awlkVar3, awlkVar4, i), new gks(awlkVar4, i));
            avmb avmbVar = this.c;
            long j = b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeUnit.getClass();
            avmbVar.getClass();
            avqz avqzVar = new avqz(j, timeUnit, avmbVar);
            avnn avnnVar = atqp.p;
            avpi avpiVar2 = new avpi(new avle[]{awlkVar2, avqzVar});
            avnn avnnVar2 = atqp.p;
            avlb avlbVarC = awlkVar3.c(avpiVar2);
            long j2 = a;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            timeUnit2.getClass();
            avmbVar.getClass();
            avqz avqzVar2 = new avqz(j2, timeUnit2, avmbVar);
            avnn avnnVar3 = atqp.p;
            avpiVar = new avpi(new avle[]{avlbVarC, awlkVar4, avqzVar2});
            avnn avnnVar4 = atqp.p;
        } else {
            avpi avpiVar3 = new avpi(new avle[]{awlkVar, this.h.d});
            avnn avnnVar5 = atqp.p;
            avpiVar = avpiVar3;
        }
        aebc aebcVar = this.h;
        aebcVar.d(1, iAvailableProcessors > 4 ? 4 : 3);
        aebcVar.d(0, iAvailableProcessors > 4 ? 5 : 3);
        aebc aebcVar2 = this.i;
        aebcVar2.f(avpiVar, 2, 3);
        if (z) {
            avqlVar = new avql(new avle[]{aebcVar2.d, awlkVar2});
            avnn avnnVar6 = atqp.p;
            avmb avmbVar2 = this.c;
            long j3 = a;
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            timeUnit3.getClass();
            avmbVar2.getClass();
            avqz avqzVar3 = new avqz(j3, timeUnit3, avmbVar2);
            avnn avnnVar7 = atqp.p;
            avqzVar3.kp(awlkVar2);
        } else {
            avqlVar = aebcVar2.d;
        }
        aebc aebcVar3 = this.e;
        avlb avlbVar = (avlb) avqlVar;
        aebcVar3.f(avlbVar, 1, 2);
        if (iAvailableProcessors > 4) {
            aebcVar2.f(avpiVar, 2, 2);
            aebcVar3.f(avlbVar, 0, 2);
        }
        avmb avmbVar3 = this.c;
        long j4 = a;
        TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
        timeUnit4.getClass();
        avmbVar3.getClass();
        avqz avqzVar4 = new avqz(j4, timeUnit4, avmbVar3);
        avnn avnnVar8 = atqp.p;
        avqzVar4.kp(awlkVar);
        aebcVar.j(avmbVar3, trbVarArr);
        aebcVar2.j(avmbVar3, trbVarArr2);
        aebcVar3.j(avmbVar3, trbVarArr3);
        aebcVar.g();
        aebcVar2.g();
        aebcVar3.g();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:299:0x0653  */
    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    public final void b(Throwable th) {
        ?? r8;
        ?? N;
        agjz agjzVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        amjf amjfVar;
        boolean z;
        int i7;
        ActivityManager activityManager;
        List historicalProcessStartReasons;
        int i8;
        amjv amjvVarI;
        int i9;
        agke agkeVar;
        xki xkiVar = (xki) this.f.io();
        agke agkeVar2 = agpi.a;
        if (trj.b != 0) {
            trf trfVar = this.g;
            Duration durationA = trfVar.a();
            trfVar.b();
            long jA = ahbt.a(trfVar.c());
            trd trdVar = xkiVar.c.d;
            tqj tqjVar = xkiVar.d;
            int i10 = tqr.a;
            if (tqjVar.k(1073830959)) {
                agkeVar = trdVar.v;
                if (agkeVar.isEmpty()) {
                    N = agkeVar;
                    r8 = xkiVar.i.g;
                    N = r8;
                    if (xkiVar.g.l(215, 45646579L, false)) {
                        N = agke.n(r8);
                    }
                }
            } else {
                N = agkeVar;
                r8 = xkiVar.i.g;
                N = r8;
                if (xkiVar.g.l(215, 45646579L, false)) {
                    N = agke.n(r8);
                }
            }
            N = agkeVar;
            agjz agjzVar2 = new agjz(4);
            agjzVar2.j(agkeVar2);
            xkh xkhVar = new xkh(xkiVar.b);
            if (trj.e(SemanticState.Obscured)) {
                if (trdVar.a(SemanticState.Hidden) == 2) {
                    i = 4;
                    i2 = 2;
                    long j = (((long) trj.b) >> 23) & 3;
                    if (((((long) trj.b) >> 26) & 1) == 1) {
                        j = trj.c[(int) j];
                    }
                    if (j > ThreadLocalRandom.current().nextLong(256L)) {
                        agjzVar = agjzVar2;
                    } else {
                        agjzVar = agjzVar2;
                    }
                } else {
                    i = 4;
                    i2 = 2;
                    agjzVar = agjzVar2;
                }
                agjzVar.h(xkhVar);
            } else {
                agjzVar = agjzVar2;
                i = 4;
                i2 = 2;
            }
            xkg xkgVar = new xkg(agjzVar.g());
            xkgVar.b();
            xkgVar.e(durationA.toMillis());
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.b |= SemanticState.Focused;
            amiuVar.j = "cold";
            aihf aihfVarCreateBuilder2 = amjj.a.createBuilder();
            boolean z2 = trdVar.e;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar.b |= SemanticState.Hidden;
            amjjVar.j = z2;
            tqw tqwVar = trdVar.g;
            int i11 = tqwVar.a;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar2 = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar2.c = 0;
            amjjVar2.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar3 = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar3.b |= 2;
            amjjVar3.d = -1;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar4 = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar4.b |= 4;
            amjjVar4.e = -1;
            int i12 = tqwVar.b;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar5 = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar5.f = 0;
            amjjVar5.b |= 8;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar6 = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar6.b |= 16;
            amjjVar6.g = -1;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar7 = (amjj) aihfVarCreateBuilder2.instance;
            char c = ' ';
            amjjVar7.b |= 32;
            amjjVar7.h = false;
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar8 = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar8.b |= SemanticState.LiveRegion;
            amjjVar8.k = false;
            if (tqjVar.k(1073830456)) {
                boolean z3 = trdVar.j;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            amjj amjjVar9 = (amjj) aihfVarCreateBuilder2.instance;
            amjjVar9.b |= SemanticState.Focused;
            amjjVar9.i = false;
            if (tqjVar.k(1073830881)) {
                int i13 = trdVar.h;
            }
            amjj amjjVar10 = (amjj) aihfVarCreateBuilder2.build();
            aihf aihfVarCreateBuilder3 = amjk.a.createBuilder();
            int i14 = 13;
            switch (trdVar.a(260)) {
                case 1:
                    i3 = 10;
                    break;
                case 2:
                    i3 = i2;
                    break;
                case 3:
                    i3 = 3;
                    break;
                case 4:
                    i3 = i;
                    break;
                case 5:
                    i3 = 5;
                    break;
                case 6:
                    i3 = 6;
                    break;
                case 7:
                    i3 = 7;
                    break;
                case 8:
                    i3 = 8;
                    break;
                case 9:
                    i3 = 9;
                    break;
                case 10:
                    i3 = 11;
                    break;
                case 11:
                    i3 = 12;
                    break;
                case 12:
                    i3 = 13;
                    break;
                case 13:
                    i3 = 14;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar.g = i3 - 1;
            amjkVar.b |= 32;
            switch (trdVar.a(SemanticState.Hidden)) {
                case 1:
                    i4 = 10;
                    break;
                case 2:
                    i4 = i2;
                    break;
                case 3:
                    i4 = 3;
                    break;
                case 4:
                    i4 = i;
                    break;
                case 5:
                    i4 = 5;
                    break;
                case 6:
                    i4 = 6;
                    break;
                case 7:
                    i4 = 7;
                    break;
                case 8:
                    i4 = 8;
                    break;
                case 9:
                    i4 = 9;
                    break;
                case 10:
                    i4 = 11;
                    break;
                case 11:
                    i4 = 12;
                    break;
                case 12:
                    i4 = 13;
                    break;
                case 13:
                    i4 = 14;
                    break;
                default:
                    i4 = 1;
                    break;
            }
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar2 = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar2.d = i4 - 1;
            amjkVar2.b |= 2;
            switch (trdVar.a(264)) {
                case 1:
                    i5 = i2;
                    break;
                case 2:
                    i5 = 5;
                    break;
                case 3:
                    i5 = 3;
                    break;
                case 4:
                    i5 = i;
                    break;
                case 5:
                    i5 = 6;
                    break;
                case 6:
                    i5 = 7;
                    break;
                default:
                    i5 = 1;
                    break;
            }
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar3 = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar3.e = i5 - 1;
            amjkVar3.b |= 4;
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar4 = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar4.b |= 8;
            amjkVar4.f = false;
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar5 = (amjk) aihfVarCreateBuilder3.instance;
            amjjVar10.getClass();
            amjkVar5.c = amjjVar10;
            amjkVar5.b |= 1;
            boolean z4 = trdVar.f || (tqjVar.l(1074814102, 32) && trdVar.k());
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar6 = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar6.b |= 64;
            amjkVar6.i = z4;
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar7 = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar7.b |= SemanticState.Focused;
            amjkVar7.j = 1;
            boolean z5 = trdVar.a(148) != 3;
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar8 = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar8.b |= SemanticState.Hidden;
            amjkVar8.k = z5;
            int iB = trdVar.b();
            if (iB == 1) {
                i6 = 2;
            } else if (iB == i2) {
                i6 = 3;
            } else if (iB == 3) {
                i6 = 4;
            } else if (iB != i) {
                i6 = iB != 5 ? 1 : 6;
            } else {
                i6 = 5;
            }
            aihfVarCreateBuilder3.copyOnWrite();
            amjk amjkVar9 = (amjk) aihfVarCreateBuilder3.instance;
            amjkVar9.l = i6 - 1;
            amjkVar9.b |= SemanticState.LiveRegion;
            List list = trdVar.r;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    switch ((String) it.next()) {
                        case "forceViralAdResponseUrl":
                            i9 = 12;
                            break;
                        case "producerAssetRequestDataMusicParams":
                            i9 = 21;
                            break;
                        case "language":
                            i9 = 3;
                            break;
                        case "offline":
                            i9 = 9;
                            break;
                        case "forceBibliotecaAdId":
                            i9 = 14;
                            break;
                        case "params":
                            i9 = 7;
                            break;
                        case "forceAdUrls":
                            i9 = 10;
                            break;
                        case "forceAfsAdResponseUrl":
                            i9 = 13;
                            break;
                        case "continuation":
                            i9 = 4;
                            break;
                        case "filteredBrowseParamsFormData":
                            i9 = 6;
                            break;
                        case "liteClientState":
                            i9 = 17;
                            break;
                        case "query":
                            i9 = 8;
                            break;
                        case "browseNotificationsParams":
                            i9 = 18;
                            break;
                        case "rawDeviceId":
                            i9 = 19;
                            break;
                        case "browseId":
                            i9 = 2;
                            break;
                        case "formData":
                            i9 = 5;
                            break;
                        case "musicBrowseRequestDeepLinkUrl":
                            i9 = 20;
                            break;
                        case "forceAdKeyword":
                            i9 = 11;
                            break;
                        case "producerAssetRequestDataCategory":
                            i9 = 22;
                            break;
                        case "forcePresetAd":
                            i9 = 15;
                            break;
                        case "extendedPermissions":
                            i9 = 16;
                            break;
                        default:
                            i9 = 1;
                            break;
                    }
                    aihfVarCreateBuilder3.copyOnWrite();
                    amjk amjkVar10 = (amjk) aihfVarCreateBuilder3.instance;
                    char c2 = c;
                    aihv aihvVar = amjkVar10.h;
                    if (!aihvVar.c()) {
                        amjkVar10.h = aihn.mutableCopy(aihvVar);
                    }
                    amjkVar10.h.h(i9 - 1);
                    c = c2;
                }
            }
            tsv tsvVar = trdVar.w;
            if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) xkiVar.a.getSystemService("activity")) != null) {
                try {
                    historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
                } catch (RuntimeException unused) {
                    historicalProcessStartReasons = null;
                }
                if (historicalProcessStartReasons != null && !historicalProcessStartReasons.isEmpty()) {
                    ApplicationStartInfo applicationStartInfoM = qe$$ExternalSyntheticApiModelOutline1.m(historicalProcessStartReasons.get(0));
                    if (applicationStartInfoM.getReason() == 5) {
                        tqj tqjVar2 = xkiVar.d;
                        if (tqjVar2.k(1073830297) && trdVar.a(SemanticState.Hidden) == 2) {
                            Intent intent = applicationStartInfoM.getIntent();
                            ComponentName component = intent != null ? intent.getComponent() : null;
                            if (component == null || component.getClassName().isEmpty()) {
                                amjvVarI = amjv.WORK_MANAGER_TASK_TAG_UNSPECIFIED;
                            } else {
                                String className = component.getClassName();
                                boolean zK = tqjVar2.k(1073830958);
                                if (className.contains("SystemJobService")) {
                                    amjvVarI = ((rnj) xkiVar.f.io()).i();
                                    if (amjvVarI == null || amjvVarI == amjv.WORK_MANAGER_TASK_TAG_UNSPECIFIED) {
                                        amjvVarI = zK ? amjv.WORK_MANAGER_TASK_TAG_NO_WORKER_CREATED : amjv.WORK_MANAGER_TASK_TAG_OTHER_WORKER;
                                    }
                                } else if (className.contains("OfflineUserInitiatedDataTransferJobService")) {
                                    amjvVarI = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_OFFLINE_TRANSFER;
                                } else if (className.contains("AccountsChangedJobIntentService")) {
                                    amjvVarI = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_ACCOUNT_SYNC;
                                } else if (className.contains("AppMeasurementJobService")) {
                                    amjvVarI = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_GMS_MEASUREMENT;
                                } else {
                                    amjvVarI = (zK && (className.contains("ScheduledTaskService") || className.startsWith("com.google.android.libraries.notifications."))) ? amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_CHIME_SCHEDULED_TASK : amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_OTHER;
                                }
                            }
                            if (amjvVarI != amjv.WORK_MANAGER_TASK_TAG_UNSPECIFIED) {
                                aihfVarCreateBuilder3.copyOnWrite();
                                amjk amjkVar11 = (amjk) aihfVarCreateBuilder3.instance;
                                amjkVar11.p = amjvVarI.ay;
                                amjkVar11.b |= 32768;
                            }
                        }
                    }
                    switch (applicationStartInfoM.getReason()) {
                        case 0:
                            i14 = 2;
                            break;
                        case 1:
                            i14 = 3;
                            break;
                        case 2:
                            i14 = 4;
                            break;
                        case 3:
                            i14 = 5;
                            break;
                        case 4:
                            i14 = 6;
                            break;
                        case 5:
                            i14 = 7;
                            break;
                        case 6:
                            i14 = 8;
                            break;
                        case 7:
                        default:
                            i14 = 1;
                            break;
                        case 8:
                            i14 = 9;
                            break;
                        case 9:
                            i14 = 10;
                            break;
                        case 10:
                            i14 = 12;
                            break;
                        case 11:
                            break;
                    }
                    aihfVarCreateBuilder3.copyOnWrite();
                    amjk amjkVar12 = (amjk) aihfVarCreateBuilder3.instance;
                    amjkVar12.m = i14 - 1;
                    amjkVar12.b |= SemanticState.ReadOnly;
                    int startType = applicationStartInfoM.getStartType();
                    if (startType == 1) {
                        i8 = 2;
                    } else if (startType != 2) {
                        i8 = startType != 3 ? 1 : 4;
                    } else {
                        i8 = 3;
                    }
                    aihfVarCreateBuilder3.copyOnWrite();
                    amjk amjkVar13 = (amjk) aihfVarCreateBuilder3.instance;
                    amjkVar13.n = i8 - 1;
                    amjkVar13.b |= SemanticState.Modal;
                    if (xkiVar.d.k(1073830306) && trdVar.a(SemanticState.Hidden) == 2 && (applicationStartInfoM.getReason() == 3 || applicationStartInfoM.getReason() == 2)) {
                        Intent intent2 = applicationStartInfoM.getIntent();
                        int iE = intent2 != null ? nsi.e(intent2) : 1;
                        if (iE != 1) {
                            aihfVarCreateBuilder3.copyOnWrite();
                            amjk amjkVar14 = (amjk) aihfVarCreateBuilder3.instance;
                            amjkVar14.q = iE - 1;
                            amjkVar14.b |= 65536;
                        } else if (applicationStartInfoM.getReason() == 2) {
                            aihfVarCreateBuilder3.copyOnWrite();
                            amjk amjkVar15 = (amjk) aihfVarCreateBuilder3.instance;
                            amjkVar15.q = 3;
                            amjkVar15.b |= 65536;
                        }
                    }
                }
            }
            if (trdVar.a(SemanticState.Hidden) == 2) {
                int i15 = trdVar.i;
                if (i15 != -9999) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    amjk amjkVar16 = (amjk) aihfVarCreateBuilder3.instance;
                    amjkVar16.b |= 16384;
                    amjkVar16.o = i15;
                }
                if (xkiVar.d.k(1073830509)) {
                    aokm aokmVar = trdVar.s;
                    aokm aokmVar2 = trdVar.t;
                    aokm aokmVar3 = trdVar.u;
                }
            }
            if (xkiVar.d.k(1073830482)) {
                aihf aihfVarCreateBuilder4 = amip.a.createBuilder();
                if (trdVar.o != null) {
                    trdVar.o.isEmpty();
                }
                if (trdVar.p != null) {
                    trdVar.p.isEmpty();
                }
                aesp aespVar = xkiVar.h;
                if (aespVar != null) {
                    Object obj = ((AtomicReference) aespVar.a).get();
                    obj.getClass();
                    int iOrdinal = ((tqt) obj).ordinal();
                    if (iOrdinal == 0) {
                        i7 = 1;
                    } else if (iOrdinal != 1) {
                        i7 = 3;
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new RuntimeException(null, null);
                            }
                            i7 = 4;
                        }
                    } else {
                        i7 = 2;
                    }
                    if (i7 != 1) {
                        aihfVarCreateBuilder4.copyOnWrite();
                        amip amipVar = (amip) aihfVarCreateBuilder4.instance;
                        amipVar.c = i7 - 1;
                        amipVar.b |= 4;
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                Optional optionalOfNullable = Optional.ofNullable(trdVar.q);
                if (optionalOfNullable.isPresent()) {
                    boolean zBooleanValue = ((Boolean) optionalOfNullable.get()).booleanValue();
                    aihfVarCreateBuilder4.copyOnWrite();
                    amip amipVar2 = (amip) aihfVarCreateBuilder4.instance;
                    amipVar2.b |= 8;
                    amipVar2.d = zBooleanValue;
                } else if (z) {
                }
                aihfVarCreateBuilder3.copyOnWrite();
                amjk amjkVar17 = (amjk) aihfVarCreateBuilder3.instance;
                amip amipVar3 = (amip) aihfVarCreateBuilder4.build();
                amipVar3.getClass();
                amjkVar17.r = amipVar3;
                amjkVar17.b |= 131072;
            }
            amjk amjkVar18 = (amjk) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
            amjkVar18.getClass();
            amiuVar2.M = amjkVar18;
            amiuVar2.c |= Integer.MIN_VALUE;
            String str = trdVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar3 = (amiu) aihfVarCreateBuilder.instance;
            str.getClass();
            amiuVar3.b |= 32768;
            amiuVar3.n = str;
            String str2 = trdVar.l;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar4 = (amiu) aihfVarCreateBuilder.instance;
            str2.getClass();
            amiuVar4.b |= 262144;
            amiuVar4.p = str2;
            String str3 = trdVar.n;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar5 = (amiu) aihfVarCreateBuilder.instance;
            str3.getClass();
            amiuVar5.b |= 536870912;
            amiuVar5.w = str3;
            String str4 = trdVar.m;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar6 = (amiu) aihfVarCreateBuilder.instance;
            str4.getClass();
            amiuVar6.b |= Integer.MIN_VALUE;
            amiuVar6.y = str4;
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar7 = (amiu) aihfVarCreateBuilder.instance;
            amiuVar7.c |= SemanticState.Multiline;
            amiuVar7.G = iAvailableProcessors;
            String str5 = Build.VERSION.SDK;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar8 = (amiu) aihfVarCreateBuilder.instance;
            str5.getClass();
            amiuVar8.c |= 16384;
            amiuVar8.H = str5;
            apfp apfpVar = (apfp) ((AtomicReference) xkiVar.h.e).get();
            if (apfpVar == null) {
                amjfVar = null;
            } else {
                aihf aihfVarCreateBuilder5 = amjf.a.createBuilder();
                int iAV = a.aV(apfpVar.n);
                if (iAV == 0) {
                    iAV = 1;
                }
                aihfVarCreateBuilder5.copyOnWrite();
                amjf amjfVar2 = (amjf) aihfVarCreateBuilder5.instance;
                amjfVar2.g = iAV - 1;
                amjfVar2.b |= 16;
                if ((apfpVar.d & 4) != 0) {
                    int iH = atqp.H(apfpVar.L);
                    if (iH == 0) {
                        iH = 1;
                    }
                    aihfVarCreateBuilder5.copyOnWrite();
                    amjf amjfVar3 = (amjf) aihfVarCreateBuilder5.instance;
                    amjfVar3.h = iH - 1;
                    amjfVar3.b |= 32;
                }
                amjfVar = (amjf) aihfVarCreateBuilder5.build();
            }
            if (amjfVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar9 = (amiu) aihfVarCreateBuilder.instance;
                amiuVar9.S = amjfVar;
                amiuVar9.d |= 131072;
            }
            if (th != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar10 = (amiu) aihfVarCreateBuilder.instance;
                amiuVar10.J = 1;
                amiuVar10.c |= 524288;
                zvp.b(zvn.b, zvm.s, "SS wait for schedulers", th);
            }
            ajuf ajufVarA = ajuf.a(((tfq) xkiVar.e.io()).a());
            if (ajufVarA != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar11 = (amiu) aihfVarCreateBuilder.instance;
                amiuVar11.l = ajufVarA.p;
                amiuVar11.b |= SemanticState.Modal;
            }
            xkgVar.c((amiu) aihfVarCreateBuilder.build());
            ArrayList arrayList = new ArrayList(SemanticState.Hidden);
            for (aebc aebcVar : N) {
                for (int i16 = 0; i16 < 2; i16++) {
                    ((tqz[]) aebcVar.b)[i16].c(arrayList);
                }
                Iterator it2 = aebcVar.e.iterator();
                while (it2.hasNext()) {
                    zvp.b(zvn.b, zvm.s, "SS non fatal error", (Throwable) it2.next());
                }
            }
            HashSet hashSet = new HashSet();
            Object obj2 = xkiVar.i.f;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                String strC = ((tra) arrayList.get(i17)).g.c();
                if (!strC.equals("null")) {
                    hashSet.add(strC);
                }
            }
            abh abhVar = new abh((char[]) null);
            trh trhVar = tri.a;
            xki.d(trhVar, abhVar, 0, agea.a, new HashMap(), new agjq());
            xkiVar.c(trhVar, xkgVar, jA);
            trj trjVar = trdVar.b;
            if (trj.e(33554432)) {
                for (trh trhVar2 : new ArrayList(trjVar.h)) {
                    if (trhVar2 != null) {
                        xkgVar.d(xkiVar.a(xkiVar.b(trhVar2), trhVar2, jA));
                    }
                }
            }
            xkgVar.a();
            trdVar.h();
        }
    }
}
