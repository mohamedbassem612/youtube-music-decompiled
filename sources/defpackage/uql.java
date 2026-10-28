package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.File;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uql implements urc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController");
    public static final auhp b;
    public final awmd c;
    public final uli d;
    public final ahey e;
    public final usd f;
    public final uqx g;
    public final Executor h;
    public final awly i;
    public final awly j;
    public final Size k;
    public final ujl l;
    public final zf m;
    public final aaok n;
    public final zf o;
    private final awmd p;
    private final ule q;
    private final awmd r;
    private final boolean s;
    private boolean t = false;

    static {
        aihf aihfVarCreateBuilder = auhp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auhp auhpVar = (auhp) aihfVarCreateBuilder.instance;
        auhpVar.b |= 1;
        auhpVar.c = 0.0f;
        aihfVarCreateBuilder.copyOnWrite();
        auhp auhpVar2 = (auhp) aihfVarCreateBuilder.instance;
        auhpVar2.b |= 2;
        auhpVar2.d = 0.0f;
        b = (auhp) aihfVarCreateBuilder.build();
    }

    public uql(Context context, zf zfVar, awmd awmdVar, aaok aaokVar, awmd awmdVar2, Executor executor, ahey aheyVar, uli uliVar, ule uleVar, awmd awmdVar3, zf zfVar2, usd usdVar, Size size) {
        this.m = zfVar;
        this.c = awmdVar;
        this.n = aaokVar;
        this.o = zfVar2;
        this.s = aaokVar.I();
        this.d = uliVar;
        this.q = uleVar;
        this.p = awmdVar3;
        this.e = aheyVar;
        this.f = usdVar;
        this.l = new ujl(executor);
        this.h = executor;
        this.r = awmdVar2;
        this.k = size;
        aaokVar.D();
        this.g = new uqx(usdVar, uliVar, context.getResources().getDisplayMetrics());
        Boolean bool = Boolean.TRUE;
        this.i = new awli(bool).az();
        this.j = new awli(bool).az();
    }

    public static void g(String str, Throwable th) {
        agrf agrfVar = a;
        if (th == null) {
            ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "logToEcatcherAndLogcat", 1514, "MediaEngineEffectsController.java")).w("%s", str);
            zvp.a(zvn.b, zvm.M, "[ShortsCreation][Android][Edit] [MediaEngineEffectsController] ".concat(str));
        } else {
            ((agrc) ((agrc) ((agrc) agrfVar.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "logToEcatcherAndLogcat", (char) 1520, "MediaEngineEffectsController.java")).w("%s", str);
            zvp.b(zvn.b, zvm.M, "[ShortsCreation][Android][Edit] [MediaEngineEffectsController] ".concat(str), th);
        }
    }

    private static auho u(auho auhoVar, Range range) {
        aihf aihfVarCreateBuilder = auho.a.createBuilder();
        float fFloatValue = ((Float) range.clamp(Float.valueOf(auhoVar.c))).floatValue();
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar2 = (auho) aihfVarCreateBuilder.instance;
        auhoVar2.b |= 1;
        auhoVar2.c = fFloatValue;
        float fFloatValue2 = ((Float) range.clamp(Float.valueOf(auhoVar.d))).floatValue();
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar3 = (auho) aihfVarCreateBuilder.instance;
        auhoVar3.b |= 2;
        auhoVar3.d = fFloatValue2;
        return (auho) aihfVarCreateBuilder.build();
    }

    private final augy v(ahgb ahgbVar, augy augyVar, auho auhoVar, Size size, double d) {
        aigu aiguVar;
        aigu aiguVarAu;
        auhp auhpVar;
        Optional optionalOf;
        if (augyVar.c == 103) {
            jrr jrrVar = (jrr) augyVar.toBuilder();
            jrrVar.copyOnWrite();
            augy augyVar2 = (augy) jrrVar.instance;
            augyVar2.j = null;
            augyVar2.b &= -33;
            jrrVar.copyOnWrite();
            augy augyVar3 = (augy) jrrVar.instance;
            augyVar3.i = null;
            augyVar3.b &= -17;
            augyVar = (augy) jrrVar.build();
        }
        jrr jrrVarQ = ahgbVar.q();
        jrrVarQ.copyOnWrite();
        augy augyVar4 = (augy) jrrVarQ.instance;
        augyVar4.b &= -2;
        augyVar4.e = 0L;
        if ((augyVar.b & 16) != 0) {
            aiguVar = augyVar.i;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
        } else {
            aiguVar = aikw.a;
        }
        jrrVarQ.copyOnWrite();
        augy augyVar5 = (augy) jrrVarQ.instance;
        aiguVar.getClass();
        augyVar5.i = aiguVar;
        augyVar5.b |= 16;
        if ((augyVar.b & 32) != 0) {
            aiguVarAu = augyVar.j;
            if (aiguVarAu == null) {
                aiguVarAu = aigu.a;
            }
        } else {
            aiguVarAu = ahng.au(this.f.d());
        }
        jrrVarQ.copyOnWrite();
        augy augyVar6 = (augy) jrrVarQ.instance;
        aiguVarAu.getClass();
        augyVar6.j = aiguVarAu;
        augyVar6.b |= 32;
        if ((augyVar.b & 64) != 0) {
            auhpVar = augyVar.k;
            if (auhpVar == null) {
                auhpVar = auhp.a;
            }
        } else {
            Optional optionalN = ahgbVar.n();
            sla slaVar = new sla(this, 11);
            if (true == optionalN.isPresent()) {
                Object obj = optionalN.get();
                Object obj2 = slaVar.a;
                Optional optionalF = ujt.f((aimy) obj);
                if (optionalF.isEmpty()) {
                    optionalOf = Optional.empty();
                } else {
                    Size size2 = ((uql) obj2).k;
                    Matrix matrix = (Matrix) optionalF.get();
                    SizeF sizeFE = ujt.e(matrix);
                    float fB = ujt.b(matrix);
                    if (matrix.postScale(size2.getWidth(), size2.getHeight())) {
                        RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                        matrix.mapRect(rectF);
                        double dC = ujt.c(size2, Math.round(rectF.centerX()));
                        double d2 = ujt.d(size2, Math.round(rectF.centerY()));
                        aihf aihfVarCreateBuilder = auhp.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        auhp auhpVar2 = (auhp) aihfVarCreateBuilder.instance;
                        auhpVar2.b |= 1;
                        auhpVar2.c = (float) dC;
                        aihfVarCreateBuilder.copyOnWrite();
                        auhp auhpVar3 = (auhp) aihfVarCreateBuilder.instance;
                        auhpVar3.b |= 2;
                        auhpVar3.d = (float) d2;
                        auhp auhpVar4 = (auhp) aihfVarCreateBuilder.build();
                        aihf aihfVarCreateBuilder2 = auho.a.createBuilder();
                        float width = sizeFE.getWidth();
                        aihfVarCreateBuilder2.copyOnWrite();
                        auho auhoVar2 = (auho) aihfVarCreateBuilder2.instance;
                        auhoVar2.b |= 1;
                        auhoVar2.c = width;
                        float height = sizeFE.getHeight();
                        aihfVarCreateBuilder2.copyOnWrite();
                        auho auhoVar3 = (auho) aihfVarCreateBuilder2.instance;
                        auhoVar3.b |= 2;
                        auhoVar3.d = height;
                        optionalOf = Optional.of(new ujs(auhpVar4, (auho) aihfVarCreateBuilder2.build(), fB));
                    } else {
                        optionalOf = Optional.empty();
                    }
                }
                optionalN = optionalOf;
                if (true == optionalN.isPresent()) {
                    optionalN = Optional.ofNullable(((ujs) optionalN.get()).a);
                }
            }
            auhpVar = (auhp) optionalN.orElse(b);
        }
        jrrVarQ.copyOnWrite();
        augy augyVar7 = (augy) jrrVarQ.instance;
        auhpVar.getClass();
        augyVar7.k = auhpVar;
        augyVar7.b |= 64;
        jrrVarQ.copyOnWrite();
        augy augyVar8 = (augy) jrrVarQ.instance;
        auhoVar.getClass();
        augyVar8.l = auhoVar;
        augyVar8.b |= SemanticState.Focused;
        jrrVarQ.copyOnWrite();
        augy augyVar9 = (augy) jrrVarQ.instance;
        augyVar9.b |= SemanticState.ReadOnly;
        augyVar9.o = d;
        aihf aihfVarCreateBuilder3 = auhn.a.createBuilder();
        int width2 = size.getWidth();
        aihfVarCreateBuilder3.copyOnWrite();
        auhn auhnVar = (auhn) aihfVarCreateBuilder3.instance;
        auhnVar.b |= 1;
        auhnVar.c = width2;
        int height2 = size.getHeight();
        aihfVarCreateBuilder3.copyOnWrite();
        auhn auhnVar2 = (auhn) aihfVarCreateBuilder3.instance;
        auhnVar2.b |= 2;
        auhnVar2.d = height2;
        jrrVarQ.copyOnWrite();
        augy augyVar10 = (augy) jrrVarQ.instance;
        auhn auhnVar3 = (auhn) aihfVarCreateBuilder3.build();
        auhnVar3.getClass();
        augyVar10.r = auhnVar3;
        augyVar10.b |= SemanticState.Obscured;
        return (augy) jrrVarQ.build();
    }

    public final long a(augy augyVar) {
        if ((augyVar.b & 1) != 0) {
            f(augyVar.e, false);
        }
        long jA = (augyVar.b & 1) != 0 ? augyVar.e : this.f.a();
        usd usdVar = this.f;
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        augyVar2.b |= 1;
        augyVar2.e = jA;
        if (!usdVar.h(new utl((augy) jrrVar.build(), usdVar.b))) {
            return -1L;
        }
        if (!this.n.K()) {
            return jA;
        }
        urt urtVar = (urt) this.p.io();
        aigu aiguVar = augyVar.i;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        urtVar.m(ahng.aw(aiguVar));
        return jA;
    }

    public final auho b(Size size) {
        float fGD = yno.gD(this.k, size);
        aihf aihfVarCreateBuilder = auho.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar = (auho) aihfVarCreateBuilder.instance;
        auhoVar.b |= 1;
        auhoVar.c = fGD;
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar2 = (auho) aihfVarCreateBuilder.instance;
        auhoVar2.b |= 2;
        auhoVar2.d = fGD;
        return (auho) aihfVarCreateBuilder.build();
    }

    public final auho c(auhn auhnVar, auhn auhnVar2, auho auhoVar) {
        Size size = this.k;
        float fGD = yno.gD(size, usj.c(auhnVar2)) / yno.gD(size, usj.c(auhnVar));
        aihf aihfVarCreateBuilder = auho.a.createBuilder();
        float f = auhoVar.c * fGD;
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar2 = (auho) aihfVarCreateBuilder.instance;
        auhoVar2.b |= 1;
        auhoVar2.c = f;
        float f2 = auhoVar.d * fGD;
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar3 = (auho) aihfVarCreateBuilder.instance;
        auhoVar3.b |= 2;
        auhoVar3.d = f2;
        return (auho) aihfVarCreateBuilder.build();
    }

    public final auhs d() {
        return this.f.c();
    }

    public final /* synthetic */ Optional e(augy augyVar) {
        Optional optionalC;
        long j = augyVar.e;
        usd usdVar = this.f;
        usdVar.g();
        synchronized (usdVar.a) {
            optionalC = usdVar.d.c(j);
        }
        sla slaVar = new sla(this, 10);
        if (true == optionalC.isPresent()) {
            Object obj = optionalC.get();
            uql uqlVar = (uql) slaVar.a;
            Size size = uqlVar.k;
            optionalC = uqlVar.d.n((UUID) obj, size);
            optionalC.getClass();
        }
        hqb hqbVar = new hqb(this, augyVar, 8);
        if (true != optionalC.isPresent()) {
            return optionalC;
        }
        Object obj2 = optionalC.get();
        Object obj3 = hqbVar.a;
        Object obj4 = hqbVar.b;
        augy augyVar2 = (augy) obj4;
        return Optional.ofNullable(new uvv(augyVar2.e, ((qub) obj2).b, ((uql) obj3).o.O(augyVar2), zf.P(augyVar2)));
    }

    public final void f(long j, boolean z) {
        File file;
        usd usdVar = this.f;
        Optional optionalE = usdVar.e(j);
        if (optionalE.isEmpty()) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "deleteSticker", 876, "MediaEngineEffectsController.java")).v("Attempted to delete segment with invalid ID %d", j);
            return;
        }
        augy augyVar = (augy) optionalE.get();
        if (augyVar.c == 110) {
            if (!this.f.h(new uty(j, 0))) {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "deleteSticker", 883, "MediaEngineEffectsController.java")).v("Failed to delete text segment with ID %d", j);
            }
            this.h.execute(afwl.i(new tpo(2)));
            this.l.A(augyVar);
            if (z && this.n.K()) {
                urt urtVar = (urt) this.p.io();
                aigu aiguVar = augyVar.i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                urtVar.m(ahng.aw(aiguVar));
                return;
            }
            return;
        }
        if (!usdVar.h(new uty(j, 0))) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "deleteSticker", 902, "MediaEngineEffectsController.java")).v("Failed to delete segment with ID %d", j);
            return;
        }
        this.l.A(augyVar);
        if (z && this.n.K()) {
            urt urtVar2 = (urt) this.p.io();
            aigu aiguVar2 = augyVar.i;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            urtVar2.m(ahng.aw(aiguVar2));
        }
        if (((augyVar.c == 101 ? (augu) augyVar.d : augu.a).b & 16) != 0) {
            synchronized (usdVar.a) {
                file = usdVar.d.b;
            }
            File file2 = new File(file, (augyVar.c == 101 ? (augu) augyVar.d : augu.a).g);
            if (this.n.K()) {
                return;
            }
            ahey aheyVar = this.e;
            taf.i(aheyVar.submit(afwl.j(new tsp(file2, 8))), aheyVar, new roc(file2, 7), new itt(this, file2, 14), null);
        }
    }

    public final void h(atzv atzvVar) {
        Optional optionalEmpty;
        boolean z = this.s;
        if (!z || (atzvVar.b & 8) == 0) {
            int i = atzvVar.b & 1;
            uqx uqxVar = this.g;
            if (i != 0) {
                atzw atzwVar = atzvVar.c;
                if (atzwVar == null) {
                    atzwVar = atzw.a;
                }
                uqxVar.e = Optional.of(atzwVar);
            } else {
                uqxVar.e = Optional.empty();
            }
        } else {
            uqx uqxVar2 = this.g;
            akgx akgxVar = atzvVar.e;
            if (akgxVar == null) {
                akgxVar = akgx.a;
            }
            uqxVar2.d = Optional.of(akgxVar);
        }
        if (z) {
            int i2 = atzvVar.b;
            if ((i2 & 8) != 0) {
                uqx uqxVar3 = this.g;
                if ((i2 & 16) != 0) {
                    akgs akgsVar = atzvVar.f;
                    if (akgsVar == null) {
                        akgsVar = akgs.a;
                    }
                    optionalEmpty = Optional.of(akgsVar);
                } else {
                    optionalEmpty = Optional.empty();
                }
                uqxVar3.f = optionalEmpty;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x044f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0086  */
    /* JADX WARN: Code duplicated, block: B:151:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:223:0x0886  */
    public final boolean i(View view, MotionEvent motionEvent, View view2, boolean z) {
        boolean z2;
        boolean z3;
        urn urnVarA;
        Optional optionalEmpty;
        uqp uqpVar;
        Rect rect;
        Optional optionalEmpty2;
        Rect rect2;
        int i;
        int i2;
        Optional optionalEmpty3;
        Optional optionalEmpty4;
        Boolean bool;
        Size size = new Size(view.getWidth(), view.getHeight());
        PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        int i3 = 0;
        PointF pointFA = uro.a(new PointF(motionEvent.getX(0), motionEvent.getY(0)), view);
        Optional optionalEmpty5 = Optional.empty();
        if (motionEvent.getPointerCount() >= 2) {
            optionalEmpty5 = Optional.of(uro.a(new PointF(motionEvent.getX(1), motionEvent.getY(1)), view));
        }
        if (view2 != null) {
            Rect rect3 = new Rect();
            view2.getGlobalVisibleRect(rect3);
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            rect3.offsetTo(iArr[0], iArr[1]);
            if (optionalEmpty5.isEmpty() && view2.getVisibility() == 0 && rect3.contains((int) pointF.x, (int) pointF.y)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        uqx uqxVar = this.g;
        uro uroVar = new uro(motionEvent.getPointerCount(), pointFA, optionalEmpty5, motionEvent.getAction(), z2, size);
        int i4 = uroVar.d;
        if (i4 == 0) {
            if (uqxVar.b.isPresent()) {
                return false;
            }
            uqxVar.b = uqxVar.b(uroVar.b, uroVar.f).or(new uqq(uqxVar, uroVar, i3));
            if (uqxVar.b.isEmpty()) {
                return false;
            }
            if (uroVar.a == 1) {
                uqxVar.j.q();
            }
            return true;
        }
        if (i4 == 1) {
            Optional optionalOfNullable = uqxVar.b;
            uqs uqsVar = new uqs(uqxVar, uroVar);
            if (true == optionalOfNullable.isPresent()) {
                Object obj = optionalOfNullable.get();
                uqx uqxVar2 = uqsVar.a;
                uro uroVar2 = uqsVar.b;
                uqv uqvVar = (uqv) obj;
                if (uroVar2.c.isPresent()) {
                    bool = Boolean.TRUE;
                } else {
                    if (uqvVar.e) {
                        ujl ujlVar = uqxVar2.j;
                        augy augyVar = uqvVar.c;
                        UUID uuid = uqvVar.a;
                        Size size2 = uqvVar.k;
                        uli uliVar = uqxVar2.h;
                        long j = augyVar.e;
                        Optional optionalN = uliVar.n(uuid, size2);
                        sla slaVar = new sla(size2, 16);
                        if (true == optionalN.isPresent()) {
                            Object obj2 = optionalN.get();
                            Object obj3 = slaVar.a;
                            qub qubVar = (qub) obj2;
                            Rect rect4 = qubVar.c;
                            Matrix matrix = qubVar.d;
                            RectF rectF = new RectF(rect4);
                            Matrix matrix2 = new Matrix();
                            if (!matrix.invert(matrix2)) {
                                ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 261, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to invert matrix");
                                optionalN = Optional.empty();
                            } else if (!matrix2.preTranslate(rectF.left, rectF.top)) {
                                ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 266, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to translate matrix to local top left");
                                optionalN = Optional.empty();
                            } else if (matrix2.preScale(rectF.width(), rectF.height())) {
                                Size size3 = (Size) obj3;
                                if (matrix2.postScale(1.0f / size3.getWidth(), 1.0f / size3.getHeight())) {
                                    optionalN = Optional.of(matrix2);
                                } else {
                                    ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 278, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to scale down matrix to normalized video frame");
                                    optionalN = Optional.empty();
                                }
                            } else {
                                ((agrc) ((agrc) ujt.a.b()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "calculateVideoRelativeMatrix", 272, "VideoInteractionRegionMatrixUtil.java")).t("calculateVideoRelativeMatrix: Failed to scale up matrix from unit rect to local bounds");
                                optionalN = Optional.empty();
                            }
                        }
                        if (true == optionalN.isPresent()) {
                            Object obj4 = optionalN.get();
                            float[] fArr = new float[9];
                            ((Matrix) obj4).getValues(fArr);
                            aihf aihfVarCreateBuilder = aimy.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            aimy aimyVar = (aimy) aihfVarCreateBuilder.instance;
                            aimyVar.b |= 2;
                            aimyVar.d = 3;
                            aihfVarCreateBuilder.copyOnWrite();
                            aimy aimyVar2 = (aimy) aihfVarCreateBuilder.instance;
                            aimyVar2.b |= 1;
                            aimyVar2.c = 3;
                            aihfVarCreateBuilder.copyOnWrite();
                            aimy aimyVar3 = (aimy) aihfVarCreateBuilder.instance;
                            aimyVar3.f = 1;
                            aimyVar3.b |= 4;
                            aihfVarCreateBuilder.az(new ahbm(fArr, 0, 9));
                            optionalN = Optional.ofNullable((aimy) aihfVarCreateBuilder.build());
                        }
                        ujlVar.n(j, optionalN);
                        ujlVar.s(1);
                    } else {
                        augy augyVar2 = uqvVar.c;
                        aigu aiguVar = augyVar2.i;
                        if (aiguVar == null) {
                            aiguVar = aigu.a;
                        }
                        ujl ujlVar2 = uqxVar2.j;
                        Duration durationAw = ahng.aw(aiguVar);
                        long j2 = augyVar2.e;
                        aigu aiguVar2 = augyVar2.j;
                        if (aiguVar2 == null) {
                            aiguVar2 = aigu.a;
                        }
                        ujlVar2.o(j2, durationAw, durationAw.plus(ahng.aw(aiguVar2)));
                        ujlVar2.m(augyVar2.e, false, uroVar2.e);
                        ujlVar2.s(2);
                    }
                    if (!uqvVar.g.isEmpty()) {
                        uqxVar2.j.l(auan.a);
                    }
                    if (uqvVar.h.isPresent()) {
                        uqxVar2.j.k(auaj.a);
                    }
                    uqxVar2.b = Optional.empty();
                    bool = Boolean.TRUE;
                }
                optionalOfNullable = Optional.ofNullable(bool);
            }
            boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
            uqxVar.c = Optional.empty();
            return zBooleanValue;
        }
        if (i4 != 2 || uqxVar.b.isEmpty()) {
            return false;
        }
        Optional optional = uqxVar.c;
        uqt uqtVar = new uqt(uqxVar, uroVar, z);
        if (true == optional.isPresent()) {
            Object obj5 = optional.get();
            uqx uqxVar3 = uqtVar.a;
            uro uroVar3 = uqtVar.b;
            boolean z4 = uqtVar.c;
            uqv uqvVar2 = (uqv) uqxVar3.b.get();
            uro uroVar4 = (uro) obj5;
            byte[] bArr = null;
            if (uroVar4.a != uroVar3.a) {
                Optional optionalN2 = uqxVar3.h.n(uqvVar2.a, uqvVar2.k);
                hqb hqbVar = new hqb(uqxVar3, uqvVar2, 11, bArr);
                if (true == optionalN2.isPresent()) {
                    optionalN2 = ((uqx) hqbVar.b).a((qub) optionalN2.get(), ((uqv) hqbVar.a).a());
                }
                sla slaVar2 = new sla(uqvVar2, 14);
                if (true == optionalN2.isPresent()) {
                    Object obj6 = optionalN2.get();
                    Object obj7 = slaVar2.a;
                    uqv uqvVar3 = (uqv) obj6;
                    uqu uquVar = new uqu(uqvVar3);
                    uqv uqvVar4 = (uqv) obj7;
                    uquVar.f(uqvVar4.e);
                    uquVar.d(uqvVar4.f);
                    jrr jrrVar = (jrr) uqvVar3.c.toBuilder();
                    augy augyVar3 = uqvVar4.c;
                    aigu aiguVar3 = augyVar3.i;
                    if (aiguVar3 == null) {
                        aiguVar3 = aigu.a;
                    }
                    jrrVar.copyOnWrite();
                    augy augyVar4 = (augy) jrrVar.instance;
                    aiguVar3.getClass();
                    augyVar4.i = aiguVar3;
                    augyVar4.b |= 16;
                    aigu aiguVar4 = augyVar3.j;
                    if (aiguVar4 == null) {
                        aiguVar4 = aigu.a;
                    }
                    jrrVar.copyOnWrite();
                    augy augyVar5 = (augy) jrrVar.instance;
                    aiguVar4.getClass();
                    augyVar5.j = aiguVar4;
                    augyVar5.b |= 32;
                    uquVar.e((augy) jrrVar.build());
                    optionalN2 = Optional.ofNullable(uquVar.a());
                }
                if (optionalN2.isPresent()) {
                    uqxVar3.b = optionalN2;
                    if (!uqvVar2.g.isEmpty()) {
                        uqxVar3.j.l(auan.a);
                    }
                    if (uqvVar2.h.isPresent()) {
                        uqxVar3.j.k(auaj.a);
                    }
                } else {
                    ((agrc) ((agrc) uqx.a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/MediaEngineGestureController", "handleMoveWithPrevious", 367, "MediaEngineGestureController.java")).t("Failed to reset focused state on pointer count change.");
                }
                z3 = true;
            } else {
                Optional optional2 = uroVar4.c;
                ujr ujrVar = urn.a;
                if (optional2.isEmpty() && uroVar3.c.isEmpty()) {
                    urnVarA = new urn(Optional.of(ujr.a(uroVar4.b, uroVar3.b)), Optional.empty(), Optional.empty());
                } else if (optional2.isPresent()) {
                    Optional optional3 = uroVar3.c;
                    if (optional3.isPresent()) {
                        Object obj8 = optional2.get();
                        Object obj9 = optional3.get();
                        PointF pointF2 = uroVar4.b;
                        PointF pointF3 = (PointF) obj8;
                        PointF pointFQ = nuo.q(pointF2, pointF3);
                        PointF pointF4 = uroVar3.b;
                        PointF pointF5 = (PointF) obj9;
                        ujr ujrVarA = ujr.a(pointFQ, nuo.q(pointF4, pointF5));
                        double degrees = Math.toDegrees(nuo.o(pointF4, pointF5) - nuo.o(pointF2, pointF3));
                        float fP = nuo.p(pointF4, pointF5);
                        float fP2 = nuo.p(pointF2, pointF3);
                        float f = fP2 == 0.0f ? 1.0f : fP / fP2;
                        urnVarA = new urn(Optional.of(ujrVarA), Optional.of(Double.valueOf(degrees)), Optional.of(new SizeF(f, f)));
                    } else {
                        urnVarA = urn.a();
                    }
                } else {
                    urnVarA = urn.a();
                }
                uqu uquVar2 = new uqu(uqvVar2);
                urn urnVar = uqvVar2.d;
                Optional optional4 = urnVar.c;
                ujr ujrVar2 = urn.a;
                ujr ujrVar3 = (ujr) optional4.orElse(ujrVar2);
                ujr ujrVar4 = (ujr) urnVarA.c.orElse(ujrVar2);
                ujr ujrVar5 = new ujr(ujrVar4.a + ujrVar3.a, ujrVar4.b + ujrVar3.b);
                Optional optional5 = urnVar.d;
                Double dValueOf = Double.valueOf(0.0d);
                double dDoubleValue = ((Double) optional5.orElse(dValueOf)).doubleValue() + ((Double) urnVarA.d.orElse(dValueOf)).doubleValue();
                Optional optional6 = urnVar.e;
                SizeF sizeF = urn.b;
                SizeF sizeF2 = (SizeF) optional6.orElse(sizeF);
                SizeF sizeF3 = (SizeF) urnVarA.e.orElse(sizeF);
                SizeF sizeF4 = new SizeF(sizeF2.getWidth() * sizeF3.getWidth(), sizeF3.getHeight() * sizeF2.getHeight());
                double d = dDoubleValue % 360.0d;
                uquVar2.c = new urn(ujrVar5.equals(ujrVar2) ? Optional.empty() : Optional.of(ujrVar5), d == 0.0d ? Optional.empty() : Optional.of(Double.valueOf(d)), sizeF4.equals(sizeF) ? Optional.empty() : Optional.of(sizeF4));
                uqv uqvVarA = uquVar2.a();
                if (uqvVarA.e) {
                    urn urnVar2 = uqvVarA.d;
                    if (uroVar3.c.isEmpty()) {
                        Optional optionalOfNullable2 = urnVar2.c;
                        if (true == optionalOfNullable2.isPresent()) {
                            ujr ujrVar6 = (ujr) optionalOfNullable2.get();
                            optionalOfNullable2 = Optional.ofNullable(Double.valueOf(Math.hypot(ujrVar6.b(), ujrVar6.c())));
                        }
                        if (((Double) optionalOfNullable2.orElse(dValueOf)).doubleValue() <= 20.0d) {
                            Optional optionalOfNullable3 = urnVar2.e;
                            if (true == optionalOfNullable3.isPresent()) {
                                optionalOfNullable3 = Optional.ofNullable(Boolean.valueOf(!((SizeF) optionalOfNullable3.get()).equals(sizeF)));
                            }
                            Boolean bool2 = Boolean.FALSE;
                            if (((Boolean) optionalOfNullable3.orElse(bool2)).booleanValue()) {
                                uqu uquVar3 = new uqu(uqvVarA);
                                uquVar3.f(false);
                                uqvVarA = uquVar3.a();
                                augy augyVar6 = uqvVarA.c;
                                ujl ujlVar3 = uqxVar3.j;
                                usd usdVar = uqxVar3.g;
                                long j3 = augyVar6.e;
                                ujlVar3.o(j3, Duration.ZERO, usdVar.d());
                                ujlVar3.m(j3, true, uroVar3.e);
                            } else {
                                Optional optionalOfNullable4 = urnVar2.d;
                                if (true == optionalOfNullable4.isPresent()) {
                                    optionalOfNullable4 = Optional.ofNullable(Boolean.valueOf(((Double) optionalOfNullable4.get()).doubleValue() != 0.0d));
                                }
                                if (((Boolean) optionalOfNullable4.orElse(bool2)).booleanValue()) {
                                    uqu uquVar4 = new uqu(uqvVarA);
                                    uquVar4.f(false);
                                    uqvVarA = uquVar4.a();
                                    augy augyVar7 = uqvVarA.c;
                                    ujl ujlVar4 = uqxVar3.j;
                                    usd usdVar2 = uqxVar3.g;
                                    long j4 = augyVar7.e;
                                    ujlVar4.o(j4, Duration.ZERO, usdVar2.d());
                                    ujlVar4.m(j4, true, uroVar3.e);
                                }
                            }
                        } else {
                            uqu uquVar5 = new uqu(uqvVarA);
                            uquVar5.f(false);
                            uqvVarA = uquVar5.a();
                            augy augyVar8 = uqvVarA.c;
                            ujl ujlVar5 = uqxVar3.j;
                            usd usdVar3 = uqxVar3.g;
                            long j5 = augyVar8.e;
                            ujlVar5.o(j5, Duration.ZERO, usdVar3.d());
                            ujlVar5.m(j5, true, uroVar3.e);
                        }
                    } else {
                        uqu uquVar6 = new uqu(uqvVarA);
                        uquVar6.f(false);
                        uqvVarA = uquVar6.a();
                        augy augyVar9 = uqvVarA.c;
                        ujl ujlVar6 = uqxVar3.j;
                        usd usdVar4 = uqxVar3.g;
                        long j6 = augyVar9.e;
                        ujlVar6.o(j6, Duration.ZERO, usdVar4.d());
                        ujlVar6.m(j6, true, uroVar3.e);
                    }
                }
                if (uqvVarA.e) {
                    z3 = true;
                } else {
                    boolean z5 = uroVar3.e;
                    if (z5 != uqvVarA.f) {
                        uqxVar3.j.r(z5);
                        uqu uquVar7 = new uqu(uqvVarA);
                        uquVar7.d(z5);
                        uqvVarA = uquVar7.a();
                    }
                    urd urdVar = (urd) uqvVarA.j.orElse(null);
                    Size size4 = uqvVarA.b;
                    if (urdVar != null) {
                        Optional optionalM = uqxVar3.h.m(uqvVarA.a);
                        if (optionalM.isPresent()) {
                            size4 = new Size(((qub) optionalM.get()).b.width(), ((qub) optionalM.get()).b.height());
                        } else {
                            ((agrc) ((agrc) uqx.a.c()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/MediaEngineGestureController", "handleMoveWithPrevious", 405, "MediaEngineGestureController.java")).t("Unable to find the focused segment ");
                        }
                    }
                    Size size5 = size4;
                    Size size6 = uqvVarA.k;
                    agkz agkzVar = uqvVar2.g;
                    int i5 = true != uroVar3.c.isEmpty() ? 2 : 1;
                    urn urnVar3 = uqvVarA.d;
                    augy augyVar10 = uqvVarA.c;
                    urm urmVarE = uqxVar3.e(agkzVar, i5, urnVar3, augyVar10, uqvVarA.i, size5, size6, uqvVar2.l);
                    if (urdVar != null) {
                        hqb hqbVar2 = new hqb(augyVar10, size6, 14, null);
                        Optional optionalOfNullable5 = urnVar3.c;
                        if (true == optionalOfNullable5.isPresent()) {
                            Object obj10 = optionalOfNullable5.get();
                            Object obj11 = hqbVar2.b;
                            Object obj12 = hqbVar2.a;
                            auhp auhpVar = auhp.a;
                            aihf aihfVarCreateBuilder2 = auhpVar.createBuilder();
                            augy augyVar11 = (augy) obj11;
                            auhp auhpVar2 = augyVar11.k;
                            if (auhpVar2 == null) {
                                auhpVar2 = auhpVar;
                            }
                            ujr ujrVar7 = (ujr) obj10;
                            Size size7 = (Size) obj12;
                            float fC = auhpVar2.c + uqx.c(ujrVar7.a, size7);
                            aihfVarCreateBuilder2.copyOnWrite();
                            auhp auhpVar3 = (auhp) aihfVarCreateBuilder2.instance;
                            auhpVar3.b |= 1;
                            auhpVar3.c = fC;
                            auhp auhpVar4 = augyVar11.k;
                            float fC2 = (auhpVar4 == null ? auhpVar : auhpVar4).d + uqx.c(ujrVar7.b, size7);
                            aihfVarCreateBuilder2.copyOnWrite();
                            auhp auhpVar5 = (auhp) aihfVarCreateBuilder2.instance;
                            auhpVar5.b |= 2;
                            auhpVar5.d = fC2;
                            optionalOfNullable5 = Optional.ofNullable((auhp) aihfVarCreateBuilder2.build());
                        }
                        auhp auhpVar6 = augyVar10.k;
                        if (auhpVar6 == null) {
                            auhpVar6 = auhp.a;
                        }
                        Rect rectD = uqx.d(size5, (auhp) optionalOfNullable5.orElse(auhpVar6), size6);
                        aihf aihfVarCreateBuilder3 = auaj.a.createBuilder();
                        HashSet hashSet = new HashSet();
                        uqp uqpVar2 = urdVar.h;
                        akgx akgxVar = uqpVar2.a;
                        if ((akgxVar.b & 1) != 0) {
                            akgv akgvVar = akgxVar.c;
                            if (akgvVar == null) {
                                akgvVar = akgv.a;
                            }
                            optionalEmpty = Optional.of(Float.valueOf(akgvVar.c));
                        } else {
                            optionalEmpty = Optional.empty();
                        }
                        if (optionalEmpty.isPresent()) {
                            uqpVar = uqpVar2;
                            rect = rectD;
                            if (uqo.c(uqpVar, rectD.left, ((Float) optionalEmpty.get()).floatValue(), urdVar.i.getWidth(), urdVar.g, Range.create(Integer.valueOf(-urdVar.f), Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)), 6, rectD, true).isPresent()) {
                                hashSet.add(urd.a);
                            }
                        } else {
                            uqpVar = uqpVar2;
                            rect = rectD;
                        }
                        if ((akgxVar.b & 2) != 0) {
                            akgv akgvVar2 = akgxVar.d;
                            if (akgvVar2 == null) {
                                akgvVar2 = akgv.a;
                            }
                            optionalEmpty2 = Optional.of(Float.valueOf(akgvVar2.c));
                        } else {
                            optionalEmpty2 = Optional.empty();
                        }
                        if (optionalEmpty2.isPresent()) {
                            int i6 = rect.right;
                            float fFloatValue = 1.0f - ((Float) optionalEmpty2.get()).floatValue();
                            Size size8 = urdVar.i;
                            int i7 = urdVar.g;
                            i2 = Integer.MIN_VALUE;
                            i = Integer.MAX_VALUE;
                            Rect rect5 = rect;
                            Optional optionalC = uqo.c(uqpVar, i6, fFloatValue, size8.getWidth(), i7, Range.create(Integer.MIN_VALUE, Integer.valueOf(urdVar.f)), 7, rect5, true);
                            rect2 = rect5;
                            Optional optionalC2 = uqo.c(uqpVar, rect2.right, 1.0f - ((Float) optionalEmpty2.get()).floatValue(), size8.getWidth(), i7, Range.create(Integer.MIN_VALUE, Integer.valueOf(urdVar.e)), 7, rect5, true);
                            if (optionalC.isPresent() || optionalC2.isPresent()) {
                                hashSet.add(urd.a);
                                hashSet.add(urd.b);
                                hashSet.add(urd.c);
                                hashSet.add(urd.d);
                            }
                        } else {
                            rect2 = rect;
                            i = Integer.MAX_VALUE;
                            i2 = Integer.MIN_VALUE;
                        }
                        if ((akgxVar.b & 4) != 0) {
                            akgv akgvVar3 = akgxVar.e;
                            if (akgvVar3 == null) {
                                akgvVar3 = akgv.a;
                            }
                            optionalEmpty3 = Optional.of(Float.valueOf(akgvVar3.c));
                        } else {
                            optionalEmpty3 = Optional.empty();
                        }
                        if (optionalEmpty3.isPresent()) {
                            if (uqo.c(uqpVar, rect2.top, ((Float) optionalEmpty3.get()).floatValue(), urdVar.i.getHeight(), urdVar.g, Range.create(Integer.valueOf(-urdVar.e), Integer.valueOf(i)), 4, rect2, true).isPresent()) {
                                aihf aihfVarCreateBuilder4 = auai.a.createBuilder();
                                aihfVarCreateBuilder4.copyOnWrite();
                                auai auaiVar = (auai) aihfVarCreateBuilder4.instance;
                                z3 = true;
                                auaiVar.c = 1;
                                auaiVar.b |= 1;
                                hashSet.add((auai) aihfVarCreateBuilder4.build());
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = true;
                        }
                        if ((akgxVar.b & 8) != 0) {
                            akgv akgvVar4 = akgxVar.f;
                            if (akgvVar4 == null) {
                                akgvVar4 = akgv.a;
                            }
                            optionalEmpty4 = Optional.of(Float.valueOf(akgvVar4.c));
                        } else {
                            optionalEmpty4 = Optional.empty();
                        }
                        if (optionalEmpty4.isPresent()) {
                            if (uqo.c(uqpVar, rect2.bottom, 1.0f - ((Float) optionalEmpty4.get()).floatValue(), urdVar.i.getHeight(), urdVar.g, Range.create(Integer.valueOf(i2), Integer.valueOf(urdVar.e)), 5, rect2, true).isPresent()) {
                                hashSet.add(urd.c);
                                hashSet.add(urd.d);
                                hashSet.add(urd.a);
                                hashSet.add(urd.b);
                            }
                        }
                        aihfVarCreateBuilder3.copyOnWrite();
                        auaj auajVar = (auaj) aihfVarCreateBuilder3.instance;
                        aiie aiieVar = auajVar.b;
                        if (!aiieVar.c()) {
                            auajVar.b = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(hashSet, auajVar.b);
                        auaj auajVar2 = (auaj) aihfVarCreateBuilder3.build();
                        uqxVar3.j.k(auajVar2);
                        uqu uquVar8 = new uqu(uqvVarA);
                        uquVar8.b(auajVar2);
                        uqvVarA = uquVar8.a();
                    } else {
                        z3 = true;
                    }
                    usd usdVar5 = uqxVar3.g;
                    augy augyVar12 = uqvVarA.c;
                    if (usj.r(augyVar12.e, usdVar5.c())) {
                        uqxVar3.j.j(urmVarE.a, urmVarE.b, urmVarE.c, z4);
                    } else {
                        uqxVar3.j.p(augyVar12, urmVarE.a, urmVarE.b, urmVarE.c);
                    }
                    agkz agkzVar2 = urmVarE.d;
                    if (!agkzVar2.equals(uqvVarA.g)) {
                        ujl ujlVar7 = uqxVar3.j;
                        aihf aihfVarCreateBuilder5 = auan.a.createBuilder();
                        aihfVarCreateBuilder5.copyOnWrite();
                        auan auanVar = (auan) aihfVarCreateBuilder5.instance;
                        aiie aiieVar2 = auanVar.b;
                        if (!aiieVar2.c()) {
                            auanVar.b = aihn.mutableCopy(aiieVar2);
                        }
                        aifs.addAll(agkzVar2, auanVar.b);
                        ujlVar7.l((auan) aihfVarCreateBuilder5.build());
                        uqu uquVar9 = new uqu(uqvVarA);
                        uquVar9.c(agkzVar2);
                        uqvVarA = uquVar9.a();
                    }
                }
                uqxVar3.b = Optional.of(uqvVarA);
            }
        } else {
            z3 = true;
        }
        uqxVar.c = Optional.of(uroVar);
        return z3;
    }

    @Override // defpackage.urc
    public final void j(Optional optional, Optional optional2, Optional optional3, boolean z) {
        usd usdVar = this.f;
        auhs auhsVarC = usdVar.c();
        agrf agrfVar = usj.a;
        Stream map = Collection.EL.stream(((augj) yno.gx(auhsVarC, augj.b)).c).filter(new sde(18)).map(new ush(0));
        Collector collector = aghu.a;
        usdVar.l(new utt((agke) Collection.EL.stream((agke) map.collect(collector)).map(new hpm(optional, optional2, optional3, 8)).collect(collector)));
    }

    @Override // defpackage.urc
    public final void k(auaj auajVar) {
        this.l.u(auajVar);
    }

    @Override // defpackage.urc
    public final void l(auan auanVar) {
        this.l.v(auanVar);
    }

    @Override // defpackage.urc
    public final void m(long j, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (!z && z2) {
            if (usj.r(j, this.f.c())) {
            } else {
                f(j, true);
            }
            r(false);
        }
        usd usdVar = this.f;
        auhs auhsVarC = usdVar.c();
        aiie aiieVar = auhsVarC.d;
        if (z) {
            Optional optionalO = usj.o(aiieVar, j);
            if (optionalO.isPresent()) {
                usdVar.h(new uue(j, ((Integer) usj.p(auhsVarC, usj.a((augy) optionalO.get())).orElse(1)).intValue()));
            } else {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "setOpacityForNonFocusedSegments", 1463, "MediaEngineEffectsController.java")).v("Can't find segment for given id %d", j);
            }
            z3 = true;
        } else {
            z3 = false;
        }
        usdVar.h(new uup(z3 ? Long.valueOf(j) : null, 1));
        Optional optionalE = usdVar.e(j);
        if (true == optionalE.isPresent()) {
            optionalE = Optional.ofNullable(Boolean.valueOf(((augy) optionalE.get()).c != 103));
        }
        boolean zBooleanValue = ((Boolean) optionalE.orElse(Boolean.TRUE)).booleanValue();
        ujl ujlVar = this.l;
        if (zBooleanValue && z) {
            z4 = true;
        }
        ujlVar.z(z, z4);
    }

    @Override // defpackage.urc
    public final void n(long j, Optional optional) {
        this.f.e(j).ifPresentOrElse(new rew(this, optional, 12, null), new tpo(3));
    }

    @Override // defpackage.urc
    public final void o(long j, Duration duration, Duration duration2) {
        this.f.i(new uuj(j, duration, duration2));
    }

    @Override // defpackage.urc
    public final void p(augy augyVar, Optional optional, Optional optional2, Optional optional3) {
        this.f.i(new uul(augyVar.e, optional, optional2, optional3));
    }

    @Override // defpackage.urc
    public final void q() {
        this.l.x();
        boolean zB = this.d.B();
        this.t = zB;
        if (zB) {
            this.q.u();
        }
    }

    @Override // defpackage.urc
    public final void r(boolean z) {
        this.l.y(z);
    }

    @Override // defpackage.urc
    public final void s(int i) {
        if (this.t) {
            this.q.v();
            this.t = false;
        }
        if (this.n.K() && i == 2) {
            ((urt) this.p.io()).m(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x0200  */
    /* JADX WARN: Code duplicated, block: B:77:0x020e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0212  */
    public final void t(ahgb ahgbVar) {
        double dB;
        boolean z;
        auho auhoVarB;
        auhn auhnVar;
        Size sizeL = ahgbVar.l();
        augy augyVar = (augy) ahgbVar.q().build();
        Optional optionalO = ahgbVar.o();
        Optional optionalM = ahgbVar.m();
        Range rangeB = usj.b((auga) optionalO.orElse(auga.a));
        auhv auhvVar = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
        ameh amehVar = (auhvVar.c == 2 ? (auih) auhvVar.d : auih.a).e;
        if (amehVar == null) {
            amehVar = ameh.a;
        }
        int iBi = a.bi(amehVar.g);
        boolean z2 = false;
        if (iBi != 0 && iBi == 6) {
            z2 = true;
        }
        Optional optionalN = ahgbVar.n();
        if (true == optionalN.isPresent()) {
            optionalN = ujt.f((aimy) optionalN.get());
        }
        if ((augyVar.b & SemanticState.ReadOnly) != 0) {
            dB = augyVar.o;
        } else {
            dB = 0.0d;
            if (z2 && optionalN.isPresent()) {
                Object obj = optionalN.get();
                Size size = this.k;
                Matrix matrix = new Matrix((Matrix) obj);
                matrix.postScale(size.getWidth(), size.getHeight());
                dB = ujt.b(matrix);
            }
        }
        int i = augyVar.c;
        if ((i == 107 ? (auhv) augyVar.d : auhv.a).c == 2 || i == 102) {
            int i2 = augyVar.b;
            if ((i2 & SemanticState.Focused) == 0 || (i2 & SemanticState.Obscured) == 0) {
                double d = dB;
                z = z2;
                if ((augyVar.b & SemanticState.Focused) != 0) {
                    auhoVarB = augyVar.l;
                    if (auhoVarB == null) {
                        auhoVarB = auho.a;
                    }
                } else if (ahgbVar.p().isPresent()) {
                    float fFloatValue = ((Float) ahgbVar.p().get()).floatValue();
                    aihf aihfVarCreateBuilder = auho.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    auho auhoVar = (auho) aihfVarCreateBuilder.instance;
                    auhoVar.b |= 1;
                    auhoVar.c = fFloatValue;
                    aihfVarCreateBuilder.copyOnWrite();
                    auho auhoVar2 = (auho) aihfVarCreateBuilder.instance;
                    auhoVar2.b |= 2;
                    auhoVar2.d = fFloatValue;
                    auhoVarB = (auho) aihfVarCreateBuilder.build();
                } else if (z || !optionalN.isPresent()) {
                    auhoVarB = b(sizeL);
                } else {
                    Object obj2 = optionalN.get();
                    Size size2 = this.k;
                    Matrix matrix2 = new Matrix((Matrix) obj2);
                    matrix2.postScale(size2.getWidth(), size2.getHeight());
                    matrix2.postRotate(-ujt.b(matrix2));
                    matrix2.postScale(1.0f / size2.getWidth(), 1.0f / size2.getHeight());
                    SizeF sizeFE = ujt.e(matrix2);
                    float width = ((float) sizeL.getWidth()) / ((float) sizeL.getHeight()) > ((float) size2.getWidth()) / ((float) size2.getHeight()) ? sizeFE.getWidth() : sizeFE.getHeight();
                    aihf aihfVarCreateBuilder2 = auho.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    auho auhoVar3 = (auho) aihfVarCreateBuilder2.instance;
                    auhoVar3.b |= 1;
                    auhoVar3.c = width;
                    aihfVarCreateBuilder2.copyOnWrite();
                    auho auhoVar4 = (auho) aihfVarCreateBuilder2.instance;
                    auhoVar4.b |= 2;
                    auhoVar4.d = width;
                    auhoVarB = (auho) aihfVarCreateBuilder2.build();
                }
                auho auhoVarU = u(auhoVarB, rangeB);
                if ((augyVar.b & SemanticState.Obscured) != 0) {
                    auhnVar = augyVar.r;
                    if (auhnVar == null) {
                        auhnVar = auhn.a;
                    }
                    sizeL = usj.c(auhnVar);
                }
                a(v(ahgbVar, augyVar, auhoVarU, sizeL, d));
            } else {
                auhn auhnVar2 = augyVar.r;
                if (auhnVar2 == null) {
                    auhnVar2 = auhn.a;
                }
                if (auhnVar2.d == sizeL.getHeight()) {
                    auhn auhnVar3 = augyVar.r;
                    if (auhnVar3 == null) {
                        auhnVar3 = auhn.a;
                    }
                    if (auhnVar3.c == sizeL.getWidth()) {
                        double d2 = dB;
                        z = z2;
                        if ((augyVar.b & SemanticState.Focused) != 0) {
                            auhoVarB = augyVar.l;
                            if (auhoVarB == null) {
                                auhoVarB = auho.a;
                            }
                        } else if (ahgbVar.p().isPresent()) {
                            float fFloatValue2 = ((Float) ahgbVar.p().get()).floatValue();
                            aihf aihfVarCreateBuilder3 = auho.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            auho auhoVar5 = (auho) aihfVarCreateBuilder3.instance;
                            auhoVar5.b |= 1;
                            auhoVar5.c = fFloatValue2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            auho auhoVar6 = (auho) aihfVarCreateBuilder3.instance;
                            auhoVar6.b |= 2;
                            auhoVar6.d = fFloatValue2;
                            auhoVarB = (auho) aihfVarCreateBuilder3.build();
                        } else if (z) {
                            auhoVarB = b(sizeL);
                        } else {
                            auhoVarB = b(sizeL);
                        }
                        auho auhoVarU2 = u(auhoVarB, rangeB);
                        if ((augyVar.b & SemanticState.Obscured) != 0) {
                            auhnVar = augyVar.r;
                            if (auhnVar == null) {
                                auhnVar = auhn.a;
                            }
                            sizeL = usj.c(auhnVar);
                        }
                        a(v(ahgbVar, augyVar, auhoVarU2, sizeL, d2));
                    }
                }
                auhn auhnVar4 = augyVar.r;
                if (auhnVar4 == null) {
                    auhnVar4 = auhn.a;
                }
                aihf aihfVarCreateBuilder4 = auhn.a.createBuilder();
                int width2 = sizeL.getWidth();
                aihfVarCreateBuilder4.copyOnWrite();
                auhn auhnVar5 = (auhn) aihfVarCreateBuilder4.instance;
                auhnVar5.b |= 1;
                auhnVar5.c = width2;
                int height = sizeL.getHeight();
                aihfVarCreateBuilder4.copyOnWrite();
                auhn auhnVar6 = (auhn) aihfVarCreateBuilder4.instance;
                auhnVar6.b |= 2;
                auhnVar6.d = height;
                auhn auhnVar7 = (auhn) aihfVarCreateBuilder4.build();
                auho auhoVar7 = augyVar.l;
                if (auhoVar7 == null) {
                    auhoVar7 = auho.a;
                }
                a(v(ahgbVar, augyVar, u(c(auhnVar4, auhnVar7, auhoVar7), rangeB), sizeL, dB));
            }
        } else {
            double d3 = dB;
            z = z2;
            if ((augyVar.b & SemanticState.Focused) != 0) {
                auhoVarB = augyVar.l;
                if (auhoVarB == null) {
                    auhoVarB = auho.a;
                }
            } else if (ahgbVar.p().isPresent()) {
                float fFloatValue3 = ((Float) ahgbVar.p().get()).floatValue();
                aihf aihfVarCreateBuilder5 = auho.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                auho auhoVar8 = (auho) aihfVarCreateBuilder5.instance;
                auhoVar8.b |= 1;
                auhoVar8.c = fFloatValue3;
                aihfVarCreateBuilder5.copyOnWrite();
                auho auhoVar9 = (auho) aihfVarCreateBuilder5.instance;
                auhoVar9.b |= 2;
                auhoVar9.d = fFloatValue3;
                auhoVarB = (auho) aihfVarCreateBuilder5.build();
            } else if (z) {
                auhoVarB = b(sizeL);
            } else {
                auhoVarB = b(sizeL);
            }
            auho auhoVarU3 = u(auhoVarB, rangeB);
            if ((augyVar.b & SemanticState.Obscured) != 0) {
                auhnVar = augyVar.r;
                if (auhnVar == null) {
                    auhnVar = auhn.a;
                }
                sizeL = usj.c(auhnVar);
            }
            a(v(ahgbVar, augyVar, auhoVarU3, sizeL, d3));
        }
        agjz agjzVar = new agjz(4);
        optionalO.isPresent();
        optionalM.isPresent();
        agke agkeVarG = agjzVar.g();
        if (agkeVarG.isEmpty()) {
            return;
        }
        this.f.l(new utt(agkeVarG));
    }
}
