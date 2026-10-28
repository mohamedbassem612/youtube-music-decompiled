package defpackage;

import android.content.res.Resources;
import android.graphics.Insets;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.ScrollView;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rhz implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rhz(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0242  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v73, types: [android.text.Editable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int iHeight;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int iMin;
        switch (this.$cid) {
            case 0:
                ria riaVar = (ria) this.a;
                Handler handler = ((riz) riaVar.a).a.m;
                handler.getClass();
                riaVar.b = ((rfn) this.b).c(handler, 0, 0);
                return;
            case 1:
                Object obj = this.b;
                Object obj2 = this.a;
                synchronized (obj2) {
                    rft rftVar = ((ria) obj2).c;
                    if (rftVar != null) {
                        rftVar.a((rfs) obj);
                    }
                    break;
                }
                return;
            case 2:
                final rie rieVar = (rie) this.a;
                rgh rghVar = rieVar.i;
                Object obj3 = this.b;
                if (rghVar == null) {
                    rieVar.i = new rgh(rieVar.c, rieVar.g, true);
                    rieVar.i.d(((rfn) obj3).a());
                }
                rjc rjcVar = rieVar.e;
                Handler handler2 = ((riz) rjcVar).a.m;
                handler2.getClass();
                rieVar.h = ((rfn) obj3).c(handler2, 1, 1);
                rjcVar.d(new Runnable() { // from class: ric
                    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[Catch: all -> 0x0419, TryCatch #1 {, blocks: (B:6:0x0011, B:8:0x0016, B:9:0x0018, B:11:0x001b, B:13:0x001f, B:15:0x0023, B:17:0x0029, B:19:0x0031, B:21:0x004f, B:23:0x0053, B:36:0x00f5, B:38:0x010b, B:39:0x011d, B:41:0x013b, B:42:0x014d, B:43:0x0153, B:45:0x015e, B:47:0x0164, B:65:0x01e1, B:67:0x01e9, B:69:0x01f1, B:71:0x01f7, B:74:0x0202, B:78:0x0236, B:80:0x023c, B:150:0x03d7, B:156:0x03e2, B:158:0x03ea, B:159:0x03ed, B:160:0x03f2, B:81:0x0245, B:83:0x025c, B:84:0x026e, B:86:0x028f, B:87:0x02a1, B:91:0x02be, B:93:0x02c8, B:96:0x02d2, B:98:0x02dc, B:100:0x02e4, B:102:0x02ea, B:104:0x02f2, B:107:0x0302, B:109:0x0310, B:142:0x0398, B:144:0x039e, B:145:0x03a7, B:147:0x03af, B:148:0x03cb, B:110:0x0321, B:117:0x032f, B:120:0x0339, B:132:0x0355, B:134:0x0368, B:135:0x036f, B:137:0x037a, B:138:0x0383, B:140:0x038e, B:152:0x03da, B:76:0x0215, B:77:0x0226, B:154:0x03dd, B:48:0x0179, B:50:0x0181, B:52:0x0187, B:54:0x0191, B:56:0x0197, B:58:0x01a1, B:62:0x01ab, B:63:0x01d7, B:64:0x01dd, B:25:0x0068, B:27:0x006f, B:29:0x0076, B:31:0x0085, B:32:0x00ae, B:34:0x00cb, B:35:0x00ee, B:163:0x03f6), top: B:189:0x0011 }] */
                    /* JADX WARN: Code duplicated, block: B:36:0x00f5 A[Catch: all -> 0x0419, TryCatch #1 {, blocks: (B:6:0x0011, B:8:0x0016, B:9:0x0018, B:11:0x001b, B:13:0x001f, B:15:0x0023, B:17:0x0029, B:19:0x0031, B:21:0x004f, B:23:0x0053, B:36:0x00f5, B:38:0x010b, B:39:0x011d, B:41:0x013b, B:42:0x014d, B:43:0x0153, B:45:0x015e, B:47:0x0164, B:65:0x01e1, B:67:0x01e9, B:69:0x01f1, B:71:0x01f7, B:74:0x0202, B:78:0x0236, B:80:0x023c, B:150:0x03d7, B:156:0x03e2, B:158:0x03ea, B:159:0x03ed, B:160:0x03f2, B:81:0x0245, B:83:0x025c, B:84:0x026e, B:86:0x028f, B:87:0x02a1, B:91:0x02be, B:93:0x02c8, B:96:0x02d2, B:98:0x02dc, B:100:0x02e4, B:102:0x02ea, B:104:0x02f2, B:107:0x0302, B:109:0x0310, B:142:0x0398, B:144:0x039e, B:145:0x03a7, B:147:0x03af, B:148:0x03cb, B:110:0x0321, B:117:0x032f, B:120:0x0339, B:132:0x0355, B:134:0x0368, B:135:0x036f, B:137:0x037a, B:138:0x0383, B:140:0x038e, B:152:0x03da, B:76:0x0215, B:77:0x0226, B:154:0x03dd, B:48:0x0179, B:50:0x0181, B:52:0x0187, B:54:0x0191, B:56:0x0197, B:58:0x01a1, B:62:0x01ab, B:63:0x01d7, B:64:0x01dd, B:25:0x0068, B:27:0x006f, B:29:0x0076, B:31:0x0085, B:32:0x00ae, B:34:0x00cb, B:35:0x00ee, B:163:0x03f6), top: B:189:0x0011 }] */
                    /* JADX WARN: Code duplicated, block: B:38:0x010b A[Catch: all -> 0x0419, TryCatch #1 {, blocks: (B:6:0x0011, B:8:0x0016, B:9:0x0018, B:11:0x001b, B:13:0x001f, B:15:0x0023, B:17:0x0029, B:19:0x0031, B:21:0x004f, B:23:0x0053, B:36:0x00f5, B:38:0x010b, B:39:0x011d, B:41:0x013b, B:42:0x014d, B:43:0x0153, B:45:0x015e, B:47:0x0164, B:65:0x01e1, B:67:0x01e9, B:69:0x01f1, B:71:0x01f7, B:74:0x0202, B:78:0x0236, B:80:0x023c, B:150:0x03d7, B:156:0x03e2, B:158:0x03ea, B:159:0x03ed, B:160:0x03f2, B:81:0x0245, B:83:0x025c, B:84:0x026e, B:86:0x028f, B:87:0x02a1, B:91:0x02be, B:93:0x02c8, B:96:0x02d2, B:98:0x02dc, B:100:0x02e4, B:102:0x02ea, B:104:0x02f2, B:107:0x0302, B:109:0x0310, B:142:0x0398, B:144:0x039e, B:145:0x03a7, B:147:0x03af, B:148:0x03cb, B:110:0x0321, B:117:0x032f, B:120:0x0339, B:132:0x0355, B:134:0x0368, B:135:0x036f, B:137:0x037a, B:138:0x0383, B:140:0x038e, B:152:0x03da, B:76:0x0215, B:77:0x0226, B:154:0x03dd, B:48:0x0179, B:50:0x0181, B:52:0x0187, B:54:0x0191, B:56:0x0197, B:58:0x01a1, B:62:0x01ab, B:63:0x01d7, B:64:0x01dd, B:25:0x0068, B:27:0x006f, B:29:0x0076, B:31:0x0085, B:32:0x00ae, B:34:0x00cb, B:35:0x00ee, B:163:0x03f6), top: B:189:0x0011 }] */
                    /* JADX WARN: Code duplicated, block: B:41:0x013b A[Catch: all -> 0x0419, TryCatch #1 {, blocks: (B:6:0x0011, B:8:0x0016, B:9:0x0018, B:11:0x001b, B:13:0x001f, B:15:0x0023, B:17:0x0029, B:19:0x0031, B:21:0x004f, B:23:0x0053, B:36:0x00f5, B:38:0x010b, B:39:0x011d, B:41:0x013b, B:42:0x014d, B:43:0x0153, B:45:0x015e, B:47:0x0164, B:65:0x01e1, B:67:0x01e9, B:69:0x01f1, B:71:0x01f7, B:74:0x0202, B:78:0x0236, B:80:0x023c, B:150:0x03d7, B:156:0x03e2, B:158:0x03ea, B:159:0x03ed, B:160:0x03f2, B:81:0x0245, B:83:0x025c, B:84:0x026e, B:86:0x028f, B:87:0x02a1, B:91:0x02be, B:93:0x02c8, B:96:0x02d2, B:98:0x02dc, B:100:0x02e4, B:102:0x02ea, B:104:0x02f2, B:107:0x0302, B:109:0x0310, B:142:0x0398, B:144:0x039e, B:145:0x03a7, B:147:0x03af, B:148:0x03cb, B:110:0x0321, B:117:0x032f, B:120:0x0339, B:132:0x0355, B:134:0x0368, B:135:0x036f, B:137:0x037a, B:138:0x0383, B:140:0x038e, B:152:0x03da, B:76:0x0215, B:77:0x0226, B:154:0x03dd, B:48:0x0179, B:50:0x0181, B:52:0x0187, B:54:0x0191, B:56:0x0197, B:58:0x01a1, B:62:0x01ab, B:63:0x01d7, B:64:0x01dd, B:25:0x0068, B:27:0x006f, B:29:0x0076, B:31:0x0085, B:32:0x00ae, B:34:0x00cb, B:35:0x00ee, B:163:0x03f6), top: B:189:0x0011 }] */
                    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Comparable, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Comparable, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        rfs rfsVar;
                        rfs rfsVar2;
                        reo reoVar;
                        ren renVar;
                        ren renVar2;
                        boolean z;
                        rhf rhfVar;
                        rih rihVar;
                        rfs rfsVar3;
                        rfs rfsVarH;
                        rfs rfsVarH2;
                        rhf rhfVar2;
                        Optional optionalOfNullable;
                        hlx hlxVar;
                        Optional optionalOfNullable2;
                        hlx hlxVar2;
                        while (!Thread.currentThread().isInterrupted()) {
                            rie rieVar2 = rieVar;
                            synchronized (rieVar2.b) {
                                rfsVar = rieVar2.p;
                                rfq rfqVar = null;
                                if (rfsVar != null) {
                                    rieVar2.p = null;
                                } else {
                                    if (!rieVar2.k || rieVar2.l || rieVar2.g() || !rieVar2.j.tryAcquire()) {
                                        rfsVar2 = null;
                                    } else {
                                        rid ridVar = rieVar2.f;
                                        rih rihVar2 = rieVar2.d;
                                        Duration durationA = rihVar2.a();
                                        Duration durationPlus = durationA.plus(((rec) ridVar).d);
                                        ren renVar3 = ren.a;
                                        qxj qxjVar = ((rec) ridVar).f;
                                        qvu qvuVar = qxjVar.e;
                                        int i = 5;
                                        if (qvuVar == null || qxjVar.f == null) {
                                            reoVar = ((rec) ridVar).h;
                                            if (reoVar != null || ((rec) ridVar).i == null) {
                                                optionalOfNullable = Optional.ofNullable(((rec) ridVar).h);
                                                hlxVar = new hlx(durationPlus, 18);
                                                if (true == optionalOfNullable.isPresent()) {
                                                    optionalOfNullable = Optional.ofNullable(((reo) optionalOfNullable.get()).iw((Duration) hlxVar.a));
                                                }
                                                ren renVar4 = ren.c;
                                                renVar = (ren) optionalOfNullable.orElse(renVar4);
                                                optionalOfNullable2 = Optional.ofNullable(((rec) ridVar).i);
                                                hlxVar2 = new hlx(durationPlus, 19);
                                                if (true == optionalOfNullable2.isPresent()) {
                                                    optionalOfNullable2 = Optional.ofNullable(((reo) optionalOfNullable2.get()).iw((Duration) hlxVar2.a));
                                                }
                                                renVar2 = (ren) optionalOfNullable2.orElse(renVar4);
                                            } else {
                                                Optional optionalOfNullable3 = Optional.ofNullable(reoVar);
                                                hqb hqbVar = new hqb(ridVar, durationPlus, i);
                                                if (true == optionalOfNullable3.isPresent()) {
                                                    Object obj4 = optionalOfNullable3.get();
                                                    Object obj5 = hqbVar.a;
                                                    ?? r9 = hqbVar.b;
                                                    reo reoVar2 = ((rec) obj5).h;
                                                    reoVar2.getClass();
                                                    optionalOfNullable3 = Optional.ofNullable(((reo) obj4).iw((Duration) afyd.f(r9, reoVar2.ix().minus(rec.b))));
                                                }
                                                ren renVar5 = ren.c;
                                                renVar = (ren) optionalOfNullable3.orElse(renVar5);
                                                Optional optionalOfNullable4 = Optional.ofNullable(((rec) ridVar).i);
                                                hqb hqbVar2 = new hqb(ridVar, durationPlus, 6);
                                                if (true == optionalOfNullable4.isPresent()) {
                                                    Object obj6 = optionalOfNullable4.get();
                                                    Object obj7 = hqbVar2.a;
                                                    ?? r13 = hqbVar2.b;
                                                    reo reoVar3 = ((rec) obj7).i;
                                                    reoVar3.getClass();
                                                    optionalOfNullable4 = Optional.ofNullable(((reo) obj6).iw((Duration) afyd.e(r13, reoVar3.iy())));
                                                }
                                                renVar2 = (ren) optionalOfNullable4.orElse(renVar5);
                                            }
                                        } else {
                                            Duration durationP = qvuVar.p();
                                            qvu qvuVar2 = qxjVar.f;
                                            qvuVar2.getClass();
                                            if (a.y(durationP.minus(qvuVar2.p))) {
                                                optionalOfNullable = Optional.ofNullable(((rec) ridVar).h);
                                                hlxVar = new hlx(durationPlus, 18);
                                                if (true == optionalOfNullable.isPresent()) {
                                                    optionalOfNullable = Optional.ofNullable(((reo) optionalOfNullable.get()).iw((Duration) hlxVar.a));
                                                }
                                                ren renVar6 = ren.c;
                                                renVar = (ren) optionalOfNullable.orElse(renVar6);
                                                optionalOfNullable2 = Optional.ofNullable(((rec) ridVar).i);
                                                hlxVar2 = new hlx(durationPlus, 19);
                                                if (true == optionalOfNullable2.isPresent()) {
                                                    optionalOfNullable2 = Optional.ofNullable(((reo) optionalOfNullable2.get()).iw((Duration) hlxVar2.a));
                                                }
                                                renVar2 = (ren) optionalOfNullable2.orElse(renVar6);
                                            } else {
                                                reoVar = ((rec) ridVar).h;
                                                if (reoVar != null) {
                                                    optionalOfNullable = Optional.ofNullable(((rec) ridVar).h);
                                                    hlxVar = new hlx(durationPlus, 18);
                                                    if (true == optionalOfNullable.isPresent()) {
                                                        optionalOfNullable = Optional.ofNullable(((reo) optionalOfNullable.get()).iw((Duration) hlxVar.a));
                                                    }
                                                    ren renVar7 = ren.c;
                                                    renVar = (ren) optionalOfNullable.orElse(renVar7);
                                                    optionalOfNullable2 = Optional.ofNullable(((rec) ridVar).i);
                                                    hlxVar2 = new hlx(durationPlus, 19);
                                                    if (true == optionalOfNullable2.isPresent()) {
                                                        optionalOfNullable2 = Optional.ofNullable(((reo) optionalOfNullable2.get()).iw((Duration) hlxVar2.a));
                                                    }
                                                    renVar2 = (ren) optionalOfNullable2.orElse(renVar7);
                                                } else {
                                                    optionalOfNullable = Optional.ofNullable(((rec) ridVar).h);
                                                    hlxVar = new hlx(durationPlus, 18);
                                                    if (true == optionalOfNullable.isPresent()) {
                                                        optionalOfNullable = Optional.ofNullable(((reo) optionalOfNullable.get()).iw((Duration) hlxVar.a));
                                                    }
                                                    ren renVar8 = ren.c;
                                                    renVar = (ren) optionalOfNullable.orElse(renVar8);
                                                    optionalOfNullable2 = Optional.ofNullable(((rec) ridVar).i);
                                                    hlxVar2 = new hlx(durationPlus, 19);
                                                    if (true == optionalOfNullable2.isPresent()) {
                                                        optionalOfNullable2 = Optional.ofNullable(((reo) optionalOfNullable2.get()).iw((Duration) hlxVar2.a));
                                                    }
                                                    renVar2 = (ren) optionalOfNullable2.orElse(renVar8);
                                                }
                                            }
                                        }
                                        ren renVar9 = ren.c;
                                        if (renVar.equals(renVar9) && renVar2.equals(renVar9)) {
                                            new rbc(rec.l, rbd.a).a("GraphicalTransitionRenderer: Both incoming and outgoing render results are SKIP.", new Object[0]);
                                            rhfVar = rhf.b;
                                            z = false;
                                        } else {
                                            ren renVar10 = ren.a;
                                            if (renVar.equals(renVar10) || renVar2.equals(renVar10)) {
                                                z = false;
                                                rhfVar = rhf.a;
                                            } else {
                                                rel relVar = renVar.d;
                                                rel relVar2 = rel.a;
                                                rfs rfsVarA = relVar.equals(relVar2) ? renVar.a() : null;
                                                z = false;
                                                rel relVar3 = renVar2.d;
                                                rfs rfsVarA2 = relVar3.equals(relVar2) ? renVar2.a() : null;
                                                if (rfsVarA == null && rfsVarA2 == null) {
                                                    rbc rbcVar = new rbc(rec.l, rbd.e);
                                                    rbcVar.c();
                                                    rbcVar.a("GraphicalTransitionRenderer: incoming render result is %s and outgoing render render result is %s. Transition start time is %s duration is %s playback position is %s", relVar, relVar3, ((rec) ridVar).d, ((rec) ridVar).f.c, durationA);
                                                    rhfVar = rhf.b;
                                                } else {
                                                    rhfVar = new rhf(rfsVarA, rfsVarA2, null);
                                                }
                                            }
                                        }
                                        rhf rhfVar3 = rhf.a;
                                        if (rhfVar.equals(rhfVar3) || rhfVar.equals(rhf.b) || !rhfVar.b()) {
                                            rfsVar2 = null;
                                            rihVar = rihVar2;
                                        } else {
                                            rgf rgfVar = rieVar2.h;
                                            rgfVar.getClass();
                                            int i2 = rieVar2.r;
                                            if (i2 == 0) {
                                                throw null;
                                            }
                                            if (i2 == 2) {
                                                rfsVar3 = rhfVar.c;
                                                rfsVar3.getClass();
                                                rgfVar.d(rfsVar3.getWidth(), rfsVar3.getHeight());
                                            } else if (i2 == 3) {
                                                rfsVar3 = rhfVar.d;
                                                rfsVar3.getClass();
                                                rgfVar.d(rfsVar3.getWidth(), rfsVar3.getHeight());
                                            } else {
                                                rgfVar.d(rieVar2.o.getWidth(), rieVar2.o.getHeight());
                                                rfsVar3 = null;
                                            }
                                            rfq rfqVarF = rieVar2.f();
                                            if (rfqVarF == null) {
                                                rhfVar.a();
                                                rfsVar2 = null;
                                                rihVar = rihVar2;
                                            } else {
                                                rfqVarF.a(ahbt.a(rihVar2.a()));
                                                rfs rfsVar4 = rhfVar.c;
                                                Optional optionalOfNullable5 = Optional.ofNullable(rfsVar4);
                                                if (true == optionalOfNullable5.isPresent()) {
                                                    optionalOfNullable5 = Optional.ofNullable(Long.valueOf(((rfs) optionalOfNullable5.get()).d()));
                                                }
                                                rihVar = rihVar2;
                                                long jLongValue = ((Long) optionalOfNullable5.orElse(0L)).longValue();
                                                rfs rfsVar5 = rhfVar.d;
                                                Optional optionalOfNullable6 = Optional.ofNullable(rfsVar5);
                                                rfsVar2 = null;
                                                if (true == optionalOfNullable6.isPresent()) {
                                                    optionalOfNullable6 = Optional.ofNullable(Long.valueOf(((rfs) optionalOfNullable6.get()).d()));
                                                }
                                                rfqVarF.s(Math.max(jLongValue, ((Long) optionalOfNullable6.orElse(0L)).longValue()));
                                                boolean z2 = rieVar2.g.F;
                                                if (!z2 || ((rfsVar4 != null && (!rfsVar4.f().isIdentity() || rfsVar4.b() != 1.0f)) || (rfsVar5 != null && (!rfsVar5.f().isIdentity() || rfsVar5.b() != 1.0f)))) {
                                                    int i3 = rieVar2.r;
                                                    if (i3 == 0) {
                                                        throw null;
                                                    }
                                                    boolean z3 = (i3 == 2 || i3 == 3) ? true : z;
                                                    if (rfsVar4 != null) {
                                                        rfsVarH = rieVar2.h(rfsVar4, z3);
                                                    } else {
                                                        rfsVar4 = null;
                                                        rfsVarH = null;
                                                    }
                                                    if (rfsVar5 != null) {
                                                        rfsVarH2 = rieVar2.h(rfsVar5, z3);
                                                    } else {
                                                        rfsVarH2 = null;
                                                        rfsVar5 = null;
                                                    }
                                                    boolean z4 = (rfsVar4 == null || rfsVarH != null) ? z : true;
                                                    if (rfsVar5 != null && rfsVarH2 == null) {
                                                        z = true;
                                                    }
                                                    if (z4 || z) {
                                                        Optional optionalOfNullable7 = Optional.ofNullable(rfsVarH);
                                                        if (true == optionalOfNullable7.isPresent()) {
                                                            ((rfs) optionalOfNullable7.get()).release();
                                                        }
                                                        Optional optionalOfNullable8 = Optional.ofNullable(rfsVarH2);
                                                        if (true == optionalOfNullable8.isPresent()) {
                                                            ((rfs) optionalOfNullable8.get()).release();
                                                        }
                                                        rhfVar2 = rhfVar3;
                                                    } else {
                                                        rhfVar2 = new rhf(rfsVarH, rfsVarH2, z2 ? rie.i((atqs) rie.m(rieVar2.n).build()) : null);
                                                    }
                                                } else if (rhfVar.b()) {
                                                    jrr jrrVarM = rie.m(rieVar2.n);
                                                    if (rfsVar4 != null) {
                                                        jrrVarM.c(rie.l(rfsVar4, "image_0", rieVar2.r));
                                                    } else {
                                                        rfsVar4 = null;
                                                    }
                                                    if (rfsVar5 != null) {
                                                        jrrVarM.c(rie.l(rfsVar5, "image_1", rieVar2.r));
                                                    } else {
                                                        rfsVar5 = null;
                                                    }
                                                    rhfVar2 = new rhf(rfsVar4, rfsVar5, rie.i((atqs) jrrVarM.build()));
                                                } else {
                                                    rhfVar2 = rhfVar3;
                                                }
                                                if (rhfVar2.equals(rhfVar3)) {
                                                    rfqVarF.release();
                                                    rhfVar.a();
                                                    rfqVar = null;
                                                } else {
                                                    rfqVarF.C(rhfVar2);
                                                    rieVar2.j(rfqVarF);
                                                    if (rfsVar3 != null) {
                                                        rfqVarF.v(rfsVar3.m());
                                                        rfqVarF.w(rfsVar3.g());
                                                        rfqVarF.x(rfsVar3.n());
                                                        rfqVarF.y(rfsVar3.c());
                                                    }
                                                    rhfVar.a();
                                                    GLES20.glFinish();
                                                    rihVar.f();
                                                    rfqVar = rfqVarF;
                                                }
                                            }
                                            if (rfqVar != null) {
                                                rfsVar = rfqVar;
                                            }
                                        }
                                        if (rhfVar.equals(rhf.b)) {
                                            rihVar.f();
                                        }
                                        rieVar2.j.release();
                                    }
                                    rfsVar = rfsVar2;
                                }
                            }
                            if (rfsVar == null) {
                                return;
                            }
                            synchronized (rieVar2.a) {
                                rft rftVar2 = rieVar2.q;
                                if (rftVar2 == null) {
                                    if (!rfsVar.B()) {
                                        rfsVar.release();
                                    }
                                    return;
                                }
                                rftVar2.a(rfsVar);
                            }
                        }
                    }
                });
                return;
            case 3:
                ((riv) this.b).F((agke) this.a);
                return;
            case 4:
                ((riv) this.b).x = ahbt.a((Duration) this.a);
                return;
            case 5:
                riv rivVar = (riv) this.b;
                bth bthVar = rivVar.f;
                Object obj4 = this.a;
                boolean zG = bthVar.g();
                rivVar.F((agke) obj4);
                if (rivVar.w) {
                    bthVar.z();
                }
                if (zG) {
                    ((brs) bthVar).A(true);
                    return;
                }
                return;
            case 6:
                rbm rbmVar = riv.z;
                this.b.run();
                ((Semaphore) this.a).release();
                return;
            case 7:
                try {
                    this.a.run();
                    return;
                } catch (RuntimeException e) {
                    Object obj5 = this.b;
                    rbc rbcVar = new rbc(rix.d, rbd.e);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Failed execute the posted runnable on dedicated gl thread %s.", ((rix) obj5).b.getName());
                    return;
                }
            case 8:
                Object obj6 = ((riy) this.b).a;
                ?? r14 = this.a;
                synchronized (obj6) {
                    riy.e(r14);
                    break;
                }
                return;
            case 9:
                tnh tnhVar = (tnh) ((WeakReference) this.a).get();
                if (tnhVar != null) {
                    tnhVar.a(this.b);
                    return;
                }
                return;
            case 10:
                ((rmj) this.b).r((rmv) this.a);
                return;
            case 11:
                ((rmo) this.b).r((rmv) this.a);
                return;
            case 12:
                Object obj7 = this.b;
                if (obj7 == null || !((View) obj7).isAttachedToWindow()) {
                    return;
                }
                roe roeVar = (roe) this.a;
                View view = roeVar.h;
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && layoutParams2.width != (iMin = Math.min(view.getContext().getResources().getDimensionPixelSize(R.dimen.dialog_width), twm.i(view.getContext()) - (view.getContext().getResources().getDimensionPixelSize(R.dimen.dialog_outside_padding_port) << 1)))) {
                    layoutParams2.width = iMin;
                    view.requestLayout();
                }
                if (view == null || view.getLayoutParams() == null) {
                    return;
                }
                Resources resources = view.getContext().getResources();
                View viewFindViewById = view.findViewById(R.id.button_container);
                ScrollView scrollView = (ScrollView) view.findViewById(R.id.unicorn_password_auth_scroll_view);
                int height = viewFindViewById != null ? viewFindViewById.getHeight() : 0;
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dialog_outside_padding_port) << 1;
                WindowManager windowManager = roeVar.m.getWindowManager();
                agrf agrfVar = twm.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
                    iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    iHeight = displayMetrics.heightPixels;
                }
                int iMax = Math.max(0, (iHeight - dimensionPixelSize) - height);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dialog_maximum_height);
                if (scrollView == null || (layoutParams = scrollView.getLayoutParams()) == null) {
                    return;
                }
                if (iMax >= dimensionPixelSize2) {
                    iMax = -2;
                } else {
                    if ((scrollView.getChildCount() > 0 ? scrollView.getChildAt(0).getHeight() : 0) <= iMax) {
                        iMax = -2;
                    }
                }
                if (layoutParams.height != iMax) {
                    layoutParams.height = iMax;
                    scrollView.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 13:
                CopyOnWriteArraySet copyOnWriteArraySet = ((rqa) this.b).k;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((zws) it.next()).e((Exception) this.a);
                }
                copyOnWriteArraySet.clear();
                return;
            case 14:
                ((abzo) this.b).t((String) this.a);
                return;
            case 15:
                ((acjb) this.a).e(false, acjc.QUEUE_SEGMENTS);
                acm acmVar = (acm) ((sdo) this.b).d;
                if (acmVar.f()) {
                    acmVar.d();
                    return;
                }
                return;
            case 16:
                ((acjb) this.a).e(false, acjc.QUEUE_SEGMENTS);
                acm acmVar2 = (acm) ((sdo) this.b).d;
                if (acmVar2.f()) {
                    acmVar2.d();
                    return;
                }
                return;
            case 17:
                rxu rxuVar = (rxu) this.b;
                slc slcVar = rxuVar.d;
                String str = slcVar instanceof sgt ? ((sgt) slcVar).c.o : null;
                Object obj8 = this.a;
                String str2 = slcVar.o;
                String str3 = ((aazp) obj8).a;
                if (TextUtils.equals(str3, str2) || (str != null && TextUtils.equals(str3, str))) {
                    rxuVar.i = true;
                    if (!rxuVar.j || rxuVar.h || rxuVar.k || rxuVar.l == 2) {
                        return;
                    }
                    rxuVar.k = true;
                    rxuVar.u();
                    return;
                }
                return;
            case 18:
                aizs aizsVar = (aizs) this.a;
                String str4 = aizsVar.d;
                Object obj9 = this.b;
                ((scq) obj9).b.remove(str4);
                ((scr) obj9).s(aizsVar);
                return;
            case 19:
                taq taqVar = ((srd) this.b).k;
                if (taqVar.R().booleanValue()) {
                    return;
                }
                long millis = (Duration.ofMillis(taqVar.S().longValue()).toMillis() + 500) / 1000;
                long j = millis / 3600;
                long j2 = millis % 60;
                long j3 = (millis % 3600) / 60;
                ((ssv) this.a).f.append(String.valueOf(j > 0 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j2)) : String.format(Locale.getDefault(), "%d:%02d", Long.valueOf(j3), Long.valueOf(j2))).concat(" "));
                return;
            default:
                Object obj10 = this.a;
                ?? r15 = this.b;
                int spanStart = r15.getSpanStart(obj10);
                int spanEnd = r15.getSpanEnd(obj10);
                if (spanStart == -1 || spanEnd == -1 || spanStart >= spanEnd) {
                    return;
                }
                r15.removeSpan(obj10);
                r15.delete(spanStart, spanEnd);
                return;
        }
    }

    public /* synthetic */ rhz(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public rhz(WeakReference weakReference, xsc xscVar, int i) {
        this.$cid = i;
        this.a = weakReference;
        this.b = xscVar;
    }
}
