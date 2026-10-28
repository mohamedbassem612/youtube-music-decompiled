package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class szq implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ szq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191 A[Catch: all -> 0x01a9, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {, blocks: (B:71:0x015d, B:73:0x0164, B:75:0x016f, B:76:0x018f, B:78:0x0191), top: B:113:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x019a  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        MotionEvent motionEvent;
        int i = 1;
        switch (this.$cid) {
            case 0:
                throw new RuntimeException("Crashing on uncaught exception", (Throwable) this.a);
            case 1:
                throw ((Throwable) this.a);
            case 2:
                Object obj = this.a;
                tko tkoVar = (tko) obj;
                Object obj2 = tkoVar.b;
                tkq tkqVarC = tkoVar.c();
                synchronized (obj2) {
                    if (((tko) obj).c == null) {
                        ((tko) obj).c = tkqVarC;
                    }
                    ((tko) obj).e = true;
                }
                return;
            case 3:
                tlh tlhVar = (tlh) this.a;
                tlhVar.b.a(thf.a(tlhVar.e, tlhVar.d, tlhVar.f));
                return;
            case 4:
                tlk tlkVar = (tlk) this.a;
                tlkVar.c.getClass();
                tlkVar.b = tlkVar.a == 2 ? 2 : 1;
                tlkVar.a = 3;
                tlkVar.c.a(tlkVar.b);
                return;
            case 5:
                Object obj3 = this.a;
                ((tlp) obj3).e.getClass();
                synchronized (obj3) {
                    if (((tlp) obj3).c == 2) {
                        long j = ((tlp) obj3).g;
                        if (j != 0) {
                            ((tlp) obj3).f = ((tlp) obj3).a.schedule(((tlp) obj3).h, ((tlp) obj3).b - j, TimeUnit.MILLISECONDS);
                            ((tlp) obj3).g = 0L;
                        } else {
                            tlp tlpVar = (tlp) this.a;
                            tlpVar.d = tlpVar.c == 2 ? 2 : 1;
                            tlpVar.c = 3;
                            tlpVar.e.a(tlpVar.d);
                        }
                    } else {
                        tlp tlpVar2 = (tlp) this.a;
                        tlpVar2.d = tlpVar2.c == 2 ? 2 : 1;
                        tlpVar2.c = 3;
                        tlpVar2.e.a(tlpVar2.d);
                    }
                }
                return;
            case 6:
                tmb tmbVar = (tmb) this.a;
                tmbVar.d.a();
                tmbVar.e.a(tmbVar.b.t());
                tmbVar.f.a();
                return;
            case 7:
                ((toq) this.a).e();
                return;
            case 8:
                ((tpb) this.a).e();
                return;
            case 9:
                int i2 = tqr.a;
                tre treVar = (tre) this.a;
                tqj tqjVar = treVar.c;
                boolean zK = tqjVar.k(1073830237);
                if ((tqjVar.a(1074142114) & 8) == 0 && (tqjVar.a(1074004911) & 2) == 0) {
                    i = 0;
                }
                if (zK) {
                    if (i != 0) {
                        int i3 = trd.x;
                        if (treVar.a(260) == 0) {
                            if (trd.m(treVar.h.a(264))) {
                                ((tqv) treVar.b.io()).b(130, 0, new snm(7));
                                return;
                            }
                        }
                    }
                } else if (trd.m(treVar.h.a(264)) && (treVar.g(260, 2) || treVar.a(260) == 2)) {
                    ((tqv) treVar.b.io()).b(130, 0, new snm(7));
                    return;
                }
                if (tqjVar.a(1073879960) == 0) {
                    int i4 = trd.x;
                    if (treVar.a(87) == 0) {
                        treVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                Object obj4 = this.a;
                ((tsl) obj4).d.execute(afwl.i(new szq(obj4, 11)));
                return;
            case 11:
                ((tsl) this.a).f(false);
                return;
            case 12:
                Object obj5 = this.a;
                ((tsl) obj5).d.execute(afwl.i(new szq(obj5, 13)));
                return;
            case 13:
                ((tsl) this.a).f(true);
                return;
            case 14:
                Object obj6 = this.a;
                synchronized (obj6) {
                    ((tsi) obj6).f();
                }
                return;
            case 15:
                Object obj7 = this.a;
                tvf tvfVar = (tvf) obj7;
                hwc hwcVar = tvfVar.a;
                if (hwcVar != null && (motionEvent = tvfVar.b) != null) {
                    hwcVar.k(motionEvent);
                }
                ((tve) obj7).a();
                return;
            case 16:
                ((tyw) this.a).a();
                return;
            case 17:
                ((tyw) this.a).d();
                return;
            case 18:
                View view = ((uhy) this.a).a;
                if (view != null) {
                    nuo.t(4, view);
                    return;
                }
                return;
            case 19:
                ((uiv) this.a).i();
                return;
            default:
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 40;
                zvjVarA.d("EditorDraftInitializer load longer than 5 seconds");
                ((ukz) this.a).c.a(zvjVarA.a());
                return;
        }
    }

    public szq(tlp tlpVar, int i) {
        this.$cid = i;
        this.a = tlpVar;
    }
}
