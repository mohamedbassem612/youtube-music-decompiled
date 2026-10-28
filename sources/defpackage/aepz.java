package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepz extends qa implements Choreographer.FrameCallback {
    aeqg a;
    private final boolean b;
    private final mbc c;
    private final Choreographer d;
    private final aeqd e;
    private final aeqe f;
    private boolean g;
    private boolean h;
    private int i;
    private final vxz j;

    public aepz(vxz vxzVar, aeqe aeqeVar, mbc mbcVar, aeqd aeqdVar, boolean z) {
        super((byte[]) null);
        this.i = 0;
        this.b = z;
        this.c = mbcVar;
        this.d = Choreographer.getInstance();
        this.e = aeqdVar;
        this.f = aeqeVar;
        this.j = vxzVar;
        this.g = false;
        this.h = false;
    }

    private static xgn p(aeqg aeqgVar) {
        Supplier supplier = aeqgVar.b;
        return supplier != null ? (xgn) supplier.get() : aeqgVar.a;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.g) {
            this.d.postFrameCallback(this);
            aeqd aeqdVar = this.e;
            if (aeqdVar.h == 0) {
                aeqdVar.h = j;
                aeqdVar.g = j;
                return;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = (j - aeqdVar.g) / 1000000;
            if (j2 > 17) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long j3 = j / 1000000;
                for (int i = 0; i < 6 && aeqd.a[i] <= ((int) (j2 / 16.67d)); i++) {
                    long[] jArr = aeqdVar.d;
                    long j4 = jArr[i];
                    if (j4 != 0) {
                        long[] jArr2 = aeqdVar.e;
                        jArr2[i] = jArr2[i] + (j3 - j4);
                        int[] iArr = aeqdVar.f;
                        iArr[i] = iArr[i] + 1;
                    }
                    jArr[i] = j3;
                    int[] iArr2 = aeqdVar.c;
                    iArr2[i] = iArr2[i] + 1;
                }
            }
            aeqdVar.g = j;
        }
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        aeqd aeqdVar = this.e;
        if (i != 0) {
            aeqdVar.p = true;
            aeqdVar.x = 2;
        }
        if (i2 != 0) {
            aeqdVar.q = true;
            aeqdVar.x = 3;
        }
        aeqdVar.j += i2 + i;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02e4  */
    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) throws Throwable {
        qci qciVar;
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean zG;
        aerl aerlVar;
        String str3;
        int i2;
        xgt xgtVarA;
        tsa tsaVar = tsa.SEL_ON_SCROLL_STATE_CHANGED_PREFIX;
        if (i != 0) {
            qciVar = i != 1 ? new qci("SETTLING") : new qci("DRAGGING");
        } else {
            qciVar = new qci("IDLE");
        }
        if (tym.ab(tsaVar)) {
            String str4 = qciVar.a;
            str4.getClass();
            awrc.x(tsv.a(tsaVar, str4), 127);
        }
        Throwable th = null;
        if (i == 0) {
            if (this.g) {
                if (this.j.l(161, 45659323L, false)) {
                    aeqe aeqeVar = this.f;
                    if (aeqeVar.c == 2 && (aerlVar = aeqeVar.b) != null) {
                        aerlVar.b();
                        aeqeVar.b = null;
                        aeqeVar.c = 3;
                    }
                }
                final aeqd aeqdVar = this.e;
                final long epochMilli = this.c.f().toEpochMilli();
                final int i3 = this.i;
                this.i = i3 + 1;
                boolean z3 = aeqdVar.v;
                if (z3 && aeqdVar.p && aeqdVar.q) {
                    tsaVar = tsaVar;
                    z2 = false;
                } else {
                    long millis = z3 ? Duration.ofNanos(aeqdVar.g - aeqdVar.h).toMillis() : epochMilli - aeqdVar.i;
                    if (millis > 0) {
                        tsa tsaVar2 = tsa.DFL_ON_SCROLL_STOP_PREFIX;
                        tsv.c(tsaVar2, String.valueOf(aeqdVar.m));
                        aeqc aeqcVar = new aeqc(aeqdVar.c, aeqdVar.e, aeqdVar.f, millis);
                        int i4 = aeqdVar.j;
                        if (i4 < 0) {
                            aeqdVar.w = 3;
                        } else if (i4 > 0) {
                            aeqdVar.w = 2;
                        } else {
                            aeqdVar.w = 1;
                        }
                        if (aeqdVar.m != 0) {
                            aunn aunnVar = (aunn) aeqdVar.s.orElse(null);
                            if (aunnVar == null) {
                                th = null;
                                z = false;
                            } else {
                                Supplier supplier = new Supplier() { // from class: aeqa
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        aihf aihfVarCreateBuilder = axgl.a.createBuilder();
                                        aihf aihfVarCreateBuilder2 = axgk.a.createBuilder();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        axgk axgkVar = (axgk) aihfVarCreateBuilder2.instance;
                                        axgkVar.b |= 1;
                                        axgkVar.c = i3;
                                        axgk axgkVar2 = (axgk) aihfVarCreateBuilder2.build();
                                        aihfVarCreateBuilder.copyOnWrite();
                                        axgl axglVar = (axgl) aihfVarCreateBuilder.instance;
                                        axgkVar2.getClass();
                                        axglVar.e = axgkVar2;
                                        axglVar.c |= 2;
                                        aihf aihfVarCreateBuilder3 = axgi.a.createBuilder();
                                        String str5 = aeqdVar.n;
                                        aihfVarCreateBuilder3.copyOnWrite();
                                        axgi axgiVar = (axgi) aihfVarCreateBuilder3.instance;
                                        str5.getClass();
                                        axgiVar.b |= 16777216;
                                        axgiVar.C = str5;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        axgl axglVar2 = (axgl) aihfVarCreateBuilder.instance;
                                        axgi axgiVar2 = (axgi) aihfVarCreateBuilder3.build();
                                        axgiVar2.getClass();
                                        axglVar2.d = axgiVar2;
                                        axglVar2.c |= 1;
                                        aihf aihfVarCreateBuilder4 = aijp.a.createBuilder();
                                        aihfVarCreateBuilder4.copyOnWrite();
                                        ((aijp) aihfVarCreateBuilder4.instance).b = epochMilli;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        axgl axglVar3 = (axgl) aihfVarCreateBuilder.instance;
                                        aijp aijpVar = (aijp) aihfVarCreateBuilder4.build();
                                        aijpVar.getClass();
                                        axglVar3.f = aijpVar;
                                        axglVar3.c |= 4;
                                        axgl axglVar4 = (axgl) aihfVarCreateBuilder.build();
                                        aihh aihhVar = (aihh) axgh.a.createBuilder();
                                        aihhVar.e(axgl.b, axglVar4);
                                        return (axgh) aihhVar.build();
                                    }
                                };
                                apft apftVar = (apft) aeqdVar.o.orElse(null);
                                if (apftVar != null) {
                                    aeqt aeqtVar = (aeqt) aunnVar.io();
                                    int i5 = aeqdVar.m;
                                    if (aeqtVar.f(apftVar)) {
                                        aeqtVar.a.isPresent();
                                        aeqtVar.h(supplier, i5);
                                    }
                                    zG = ((aeqt) aunnVar.io()).f(apftVar);
                                } else {
                                    aeqt aeqtVar2 = (aeqt) aunnVar.io();
                                    int i6 = aeqdVar.m;
                                    if (aeqtVar2.g(i6)) {
                                        aeqtVar2.a.isPresent();
                                        aeqtVar2.h(supplier, i6);
                                    }
                                    zG = ((aeqt) aunnVar.io()).g(aeqdVar.m);
                                }
                                z = zG;
                            }
                        } else {
                            th = null;
                            z = false;
                        }
                        if (aeqdVar.n.isEmpty()) {
                            tsaVar = tsaVar;
                        } else {
                            String str5 = aeqdVar.n;
                            int i7 = aeqdVar.m;
                            DisplayMetrics displayMetrics = aeqdVar.u.getResources().getDisplayMetrics();
                            int iM = twm.m(displayMetrics, Math.abs(aeqdVar.j));
                            int i8 = aeqdVar.x;
                            int i9 = aeqdVar.w;
                            int iM2 = twm.m(displayMetrics, aeqdVar.k);
                            int iM3 = twm.m(displayMetrics, aeqdVar.l);
                            tsa tsaVar3 = tsa.DFL_ON_SCROLL_STOP_VERBOSE_PREFIX;
                            if (tym.ab(tsaVar3)) {
                                StringBuilder sb = new StringBuilder(tsaVar3.ag.a);
                                sb.append("p=");
                                sb.append(iM);
                                sb.append(",h=");
                                sb.append(iM2);
                                sb.append(",v=");
                                sb.append(iM3);
                                sb.append(",d=");
                                if (i9 == 1) {
                                    str = "SCROLL_DIRECTION_UNKNOWN";
                                } else if (i9 != 2) {
                                    str = i9 != 3 ? "null" : "SCROLL_DIRECTION_BACKWARDS";
                                } else {
                                    str = "SCROLL_DIRECTION_FORWARD";
                                }
                                if (i9 == 0) {
                                    throw th;
                                }
                                sb.append(str);
                                sb.append(",o=");
                                if (i8 == 1) {
                                    str2 = "SCROLL_ORIENTATION_UNKNOWN";
                                } else if (i8 != 2) {
                                    str2 = i8 != 3 ? "null" : "SCROLL_ORIENTATION_VERTICAL";
                                } else {
                                    str2 = "SCROLL_ORIENTATION_HORIZONTAL";
                                }
                                if (i8 == 0) {
                                    throw th;
                                }
                                sb.append(str2);
                                tsv.c(tsaVar3, sb.toString());
                                tym.ab(tsaVar3);
                            }
                            aeqdVar.t.execute(new aeqb(aeqdVar, str5, aeqcVar, iM, i8, i9, i7, iM2, iM3, i3, z, epochMilli));
                        }
                        tym.ab(tsaVar2);
                        z2 = false;
                    } else {
                        tsaVar = tsaVar;
                        z2 = false;
                    }
                }
                this.g = z2;
            }
            tym.ab(tsaVar);
        }
        if (i == 1 && !this.g) {
            if (this.b) {
                this.d.postFrameCallback(this);
            }
            this.g = true;
            aeqg aeqgVar = this.a;
            xgn xgnVarP = aeqgVar == null ? null : p(aeqgVar);
            if (xgnVarP == null || (xgtVarA = xgnVarP.a()) == null) {
                str3 = "";
                i2 = 0;
            } else {
                i2 = xgtVarA.f;
                str3 = xgtVarA.a;
            }
            if (this.j.l(161, 45659323L, false) && this.h) {
                aeqe aeqeVar2 = this.f;
                if (aeqeVar2.c == 1) {
                    akmm akmmVar = (akmm) aeqe.a.get(Integer.valueOf(i2));
                    aeqeVar2.b = akmmVar != null ? aeqeVar2.d.R(akmmVar) : null;
                    aerl aerlVar2 = aeqeVar2.b;
                    if (aerlVar2 != null && aerlVar2.e) {
                        aerlVar2.c();
                        aeqeVar2.c = 2;
                    }
                }
            }
            Optional optionalOfNullable = Optional.ofNullable(this.a);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = ((aeqg) optionalOfNullable.get()).c;
                optionalOfNullable.getClass();
            }
            aeqd aeqdVar2 = this.e;
            long epochMilli2 = this.c.f().toEpochMilli();
            tsa tsaVar4 = tsa.DFL_ON_SCROLL_START_PREFIX;
            tsv.c(tsaVar4, String.valueOf(i2));
            aeqdVar2.g = 0L;
            aeqdVar2.h = 0L;
            aeqdVar2.j = 0;
            int i10 = 6;
            if (aeqdVar2.v) {
                aeqdVar2.c = new int[6];
                aeqdVar2.d = new long[6];
                aeqdVar2.e = new long[6];
                aeqdVar2.f = new int[6];
            }
            aeqdVar2.p = false;
            aeqdVar2.q = false;
            aeqdVar2.w = 1;
            aeqdVar2.x = 1;
            aeqdVar2.i = epochMilli2;
            aeqdVar2.k = recyclerView.computeHorizontalScrollOffset();
            aeqdVar2.l = recyclerView.computeVerticalScrollOffset();
            aeqdVar2.m = i2;
            aeqdVar2.n = str3;
            aeqdVar2.o = optionalOfNullable;
            if (i2 != 0) {
                optionalOfNullable.ifPresentOrElse(new adsk(aeqdVar2, i10), new rir(aeqdVar2, i2, 20));
            }
            tym.ab(tsaVar4);
        }
        tsaVar = tsaVar;
        tym.ab(tsaVar);
    }

    public final void m(RecyclerView recyclerView, aeqg aeqgVar) {
        if (p(aeqgVar) == null || this.h) {
            return;
        }
        this.a = aeqgVar;
        recyclerView.aC(this);
        this.h = true;
        this.i = 0;
    }

    public final void o(RecyclerView recyclerView) {
        aerl aerlVar;
        if (this.h) {
            recyclerView.aE(this);
            this.h = false;
            if (this.j.l(161, 45659323L, false)) {
                aeqe aeqeVar = this.f;
                if (aeqeVar.c != 2 || (aerlVar = aeqeVar.b) == null) {
                    return;
                }
                aerlVar.a();
                aeqeVar.b = null;
                aeqeVar.c = 4;
            }
        }
    }
}
