package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import androidx.car.app.model.Alert;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uqt implements Consumer {
    public final /* synthetic */ uqx a;
    public final /* synthetic */ uro b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ uqt(uqx uqxVar, uro uroVar, boolean z) {
        this.a = uqxVar;
        this.b = uroVar;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x02e0  */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        float f;
        urn urnVarA;
        Optional optionalEmpty;
        uqp uqpVar;
        Rect rect;
        Optional optionalEmpty2;
        Rect rect2;
        int i;
        Optional optionalEmpty3;
        Optional optionalEmpty4;
        uro uroVar = (uro) obj;
        uqx uqxVar = this.a;
        uqv uqvVar = (uqv) uqxVar.b.get();
        int i2 = uroVar.a;
        uro uroVar2 = this.b;
        byte[] bArr = null;
        if (i2 != uroVar2.a) {
            Optional optionalN = uqxVar.h.n(uqvVar.a, uqvVar.k);
            hqb hqbVar = new hqb(uqxVar, uqvVar, 11, bArr);
            if (true == optionalN.isPresent()) {
                optionalN = ((uqx) hqbVar.b).a((qub) optionalN.get(), ((uqv) hqbVar.a).k);
            }
            sla slaVar = new sla(uqvVar, 14);
            if (true == optionalN.isPresent()) {
                Object obj2 = optionalN.get();
                Object obj3 = slaVar.a;
                uqv uqvVar2 = (uqv) obj2;
                uqu uquVar = new uqu(uqvVar2);
                uqv uqvVar3 = (uqv) obj3;
                uquVar.f(uqvVar3.e);
                uquVar.d(uqvVar3.f);
                jrr jrrVar = (jrr) uqvVar2.c.toBuilder();
                augy augyVar = uqvVar3.c;
                aigu aiguVar = augyVar.i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                jrrVar.copyOnWrite();
                augy augyVar2 = (augy) jrrVar.instance;
                aiguVar.getClass();
                augyVar2.i = aiguVar;
                augyVar2.b |= 16;
                aigu aiguVar2 = augyVar.j;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                jrrVar.copyOnWrite();
                augy augyVar3 = (augy) jrrVar.instance;
                aiguVar2.getClass();
                augyVar3.j = aiguVar2;
                augyVar3.b |= 32;
                uquVar.e((augy) jrrVar.build());
                optionalN = Optional.ofNullable(uquVar.a());
            }
            if (!optionalN.isPresent()) {
                ((agrc) ((agrc) uqx.a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/MediaEngineGestureController", "handleMoveWithPrevious", 367, "MediaEngineGestureController.java")).t("Failed to reset focused state on pointer count change.");
                return;
            }
            uqxVar.b = optionalN;
            if (!uqvVar.g.isEmpty()) {
                uqxVar.j.l(auan.a);
            }
            if (uqvVar.h.isPresent()) {
                uqxVar.j.k(auaj.a);
                return;
            }
            return;
        }
        Optional optional = uroVar.c;
        ujr ujrVar = urn.a;
        if (optional.isEmpty() && uroVar2.c.isEmpty()) {
            urnVarA = new urn(Optional.of(ujr.a(uroVar.b, uroVar2.b)), Optional.empty(), Optional.empty());
            f = 1.0f;
        } else if (optional.isPresent()) {
            Optional optional2 = uroVar2.c;
            if (optional2.isPresent()) {
                Object obj4 = optional.get();
                Object obj5 = optional2.get();
                PointF pointF = uroVar.b;
                PointF pointF2 = (PointF) obj4;
                PointF pointFQ = nuo.q(pointF, pointF2);
                PointF pointF3 = uroVar2.b;
                PointF pointF4 = (PointF) obj5;
                f = 1.0f;
                ujr ujrVarA = ujr.a(pointFQ, nuo.q(pointF3, pointF4));
                double degrees = Math.toDegrees(nuo.o(pointF3, pointF4) - nuo.o(pointF, pointF2));
                float fP = nuo.p(pointF3, pointF4);
                float fP2 = nuo.p(pointF, pointF2);
                float f2 = fP2 == 0.0f ? 1.0f : fP / fP2;
                urnVarA = new urn(Optional.of(ujrVarA), Optional.of(Double.valueOf(degrees)), Optional.of(new SizeF(f2, f2)));
            } else {
                f = 1.0f;
                urnVarA = urn.a();
            }
        } else {
            f = 1.0f;
            urnVarA = urn.a();
        }
        uqu uquVar2 = new uqu(uqvVar);
        urn urnVar = uqvVar.d;
        Optional optional3 = urnVar.c;
        ujr ujrVar2 = urn.a;
        ujr ujrVar3 = (ujr) optional3.orElse(ujrVar2);
        ujr ujrVar4 = (ujr) urnVarA.c.orElse(ujrVar2);
        ujr ujrVar5 = new ujr(ujrVar4.a + ujrVar3.a, ujrVar4.b + ujrVar3.b);
        Optional optional4 = urnVar.d;
        Double dValueOf = Double.valueOf(0.0d);
        double dDoubleValue = ((Double) optional4.orElse(dValueOf)).doubleValue() + ((Double) urnVarA.d.orElse(dValueOf)).doubleValue();
        Optional optional5 = urnVar.e;
        SizeF sizeF = urn.b;
        SizeF sizeF2 = (SizeF) optional5.orElse(sizeF);
        SizeF sizeF3 = (SizeF) urnVarA.e.orElse(sizeF);
        SizeF sizeF4 = new SizeF(sizeF2.getWidth() * sizeF3.getWidth(), sizeF2.getHeight() * sizeF3.getHeight());
        double d = dDoubleValue % 360.0d;
        uquVar2.c = new urn(ujrVar5.equals(ujrVar2) ? Optional.empty() : Optional.of(ujrVar5), d == 0.0d ? Optional.empty() : Optional.of(Double.valueOf(d)), sizeF4.equals(sizeF) ? Optional.empty() : Optional.of(sizeF4));
        uqv uqvVarA = uquVar2.a();
        if (uqvVarA.e) {
            urn urnVar2 = uqvVarA.d;
            if (uroVar2.c.isEmpty()) {
                Optional optionalOfNullable = urnVar2.c;
                if (true == optionalOfNullable.isPresent()) {
                    ujr ujrVar6 = (ujr) optionalOfNullable.get();
                    optionalOfNullable = Optional.ofNullable(Double.valueOf(Math.hypot(ujrVar6.a, ujrVar6.b)));
                }
                if (((Double) optionalOfNullable.orElse(dValueOf)).doubleValue() <= 20.0d) {
                    Optional optionalOfNullable2 = urnVar2.e;
                    if (true == optionalOfNullable2.isPresent()) {
                        optionalOfNullable2 = Optional.ofNullable(Boolean.valueOf(!((SizeF) optionalOfNullable2.get()).equals(sizeF)));
                    }
                    Boolean bool = Boolean.FALSE;
                    if (((Boolean) optionalOfNullable2.orElse(bool)).booleanValue()) {
                        uqu uquVar3 = new uqu(uqvVarA);
                        uquVar3.f(false);
                        uqvVarA = uquVar3.a();
                        augy augyVar4 = uqvVarA.c;
                        ujl ujlVar = uqxVar.j;
                        usd usdVar = uqxVar.g;
                        long j = augyVar4.e;
                        ujlVar.o(j, Duration.ZERO, usdVar.d());
                        ujlVar.m(j, true, uroVar2.e);
                    } else {
                        Optional optionalOfNullable3 = urnVar2.d;
                        if (true == optionalOfNullable3.isPresent()) {
                            optionalOfNullable3 = Optional.ofNullable(Boolean.valueOf(((Double) optionalOfNullable3.get()).doubleValue() != 0.0d));
                        }
                        if (((Boolean) optionalOfNullable3.orElse(bool)).booleanValue()) {
                            uqu uquVar4 = new uqu(uqvVarA);
                            uquVar4.f(false);
                            uqvVarA = uquVar4.a();
                            augy augyVar5 = uqvVarA.c;
                            ujl ujlVar2 = uqxVar.j;
                            usd usdVar2 = uqxVar.g;
                            long j2 = augyVar5.e;
                            ujlVar2.o(j2, Duration.ZERO, usdVar2.d());
                            ujlVar2.m(j2, true, uroVar2.e);
                        }
                    }
                } else {
                    uqu uquVar5 = new uqu(uqvVarA);
                    uquVar5.f(false);
                    uqvVarA = uquVar5.a();
                    augy augyVar6 = uqvVarA.c;
                    ujl ujlVar3 = uqxVar.j;
                    usd usdVar3 = uqxVar.g;
                    long j3 = augyVar6.e;
                    ujlVar3.o(j3, Duration.ZERO, usdVar3.d());
                    ujlVar3.m(j3, true, uroVar2.e);
                }
            } else {
                uqu uquVar6 = new uqu(uqvVarA);
                uquVar6.f(false);
                uqvVarA = uquVar6.a();
                augy augyVar7 = uqvVarA.c;
                ujl ujlVar4 = uqxVar.j;
                usd usdVar4 = uqxVar.g;
                long j4 = augyVar7.e;
                ujlVar4.o(j4, Duration.ZERO, usdVar4.d());
                ujlVar4.m(j4, true, uroVar2.e);
            }
        }
        if (!uqvVarA.e) {
            boolean z = uroVar2.e;
            if (z != uqvVarA.f) {
                uqxVar.j.r(z);
                uqu uquVar7 = new uqu(uqvVarA);
                uquVar7.d(z);
                uqvVarA = uquVar7.a();
            }
            urd urdVar = (urd) uqvVarA.j.orElse(null);
            Size size = uqvVarA.b;
            if (urdVar != null) {
                Optional optionalM = uqxVar.h.m(uqvVarA.a);
                if (optionalM.isPresent()) {
                    size = new Size(((qub) optionalM.get()).b.width(), ((qub) optionalM.get()).b.height());
                } else {
                    ((agrc) ((agrc) uqx.a.c()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/MediaEngineGestureController", "handleMoveWithPrevious", 405, "MediaEngineGestureController.java")).t("Unable to find the focused segment ");
                }
            }
            Size size2 = size;
            Size size3 = uqvVarA.k;
            agkz agkzVar = uqvVar.g;
            int i3 = true != uroVar2.c.isEmpty() ? 2 : 1;
            urn urnVar3 = uqvVarA.d;
            augy augyVar8 = uqvVarA.c;
            urm urmVarE = uqxVar.e(agkzVar, i3, urnVar3, augyVar8, uqvVarA.i, size2, size3, uqvVar.l);
            if (urdVar != null) {
                hqb hqbVar2 = new hqb(augyVar8, size3, 14, null);
                Optional optionalOfNullable4 = urnVar3.c;
                if (true == optionalOfNullable4.isPresent()) {
                    Object obj6 = optionalOfNullable4.get();
                    Object obj7 = hqbVar2.b;
                    Object obj8 = hqbVar2.a;
                    auhp auhpVar = auhp.a;
                    aihf aihfVarCreateBuilder = auhpVar.createBuilder();
                    augy augyVar9 = (augy) obj7;
                    auhp auhpVar2 = augyVar9.k;
                    if (auhpVar2 == null) {
                        auhpVar2 = auhpVar;
                    }
                    ujr ujrVar7 = (ujr) obj6;
                    Size size4 = (Size) obj8;
                    float fC = auhpVar2.c + uqx.c(ujrVar7.a, size4);
                    aihfVarCreateBuilder.copyOnWrite();
                    auhp auhpVar3 = (auhp) aihfVarCreateBuilder.instance;
                    auhpVar3.b |= 1;
                    auhpVar3.c = fC;
                    auhp auhpVar4 = augyVar9.k;
                    if (auhpVar4 != null) {
                        auhpVar = auhpVar4;
                    }
                    float fC2 = auhpVar.d + uqx.c(ujrVar7.b, size4);
                    aihfVarCreateBuilder.copyOnWrite();
                    auhp auhpVar5 = (auhp) aihfVarCreateBuilder.instance;
                    auhpVar5.b |= 2;
                    auhpVar5.d = fC2;
                    optionalOfNullable4 = Optional.ofNullable((auhp) aihfVarCreateBuilder.build());
                }
                auhp auhpVar6 = augyVar8.k;
                if (auhpVar6 == null) {
                    auhpVar6 = auhp.a;
                }
                Rect rectD = uqx.d(size2, (auhp) optionalOfNullable4.orElse(auhpVar6), size3);
                aihf aihfVarCreateBuilder2 = auaj.a.createBuilder();
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
                    int i4 = rect.right;
                    float fFloatValue = f - ((Float) optionalEmpty2.get()).floatValue();
                    Size size5 = urdVar.i;
                    int i5 = urdVar.g;
                    i = Integer.MIN_VALUE;
                    Rect rect3 = rect;
                    Optional optionalC = uqo.c(uqpVar, i4, fFloatValue, size5.getWidth(), i5, Range.create(Integer.MIN_VALUE, Integer.valueOf(urdVar.f)), 7, rect3, true);
                    rect2 = rect3;
                    Optional optionalC2 = uqo.c(uqpVar, rect2.right, f - ((Float) optionalEmpty2.get()).floatValue(), size5.getWidth(), i5, Range.create(Integer.MIN_VALUE, Integer.valueOf(urdVar.e)), 7, rect3, true);
                    if (optionalC.isPresent() || optionalC2.isPresent()) {
                        hashSet.add(urd.a);
                        hashSet.add(urd.b);
                        hashSet.add(urd.c);
                        hashSet.add(urd.d);
                    }
                } else {
                    rect2 = rect;
                    i = Integer.MIN_VALUE;
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
                    if (uqo.c(uqpVar, rect2.top, ((Float) optionalEmpty3.get()).floatValue(), urdVar.i.getHeight(), urdVar.g, Range.create(Integer.valueOf(-urdVar.e), Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)), 4, rect2, true).isPresent()) {
                        aihf aihfVarCreateBuilder3 = auai.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        auai auaiVar = (auai) aihfVarCreateBuilder3.instance;
                        auaiVar.c = 1;
                        auaiVar.b |= 1;
                        hashSet.add((auai) aihfVarCreateBuilder3.build());
                    }
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
                    if (uqo.c(uqpVar, rect2.bottom, f - ((Float) optionalEmpty4.get()).floatValue(), urdVar.i.getHeight(), urdVar.g, Range.create(Integer.valueOf(i), Integer.valueOf(urdVar.e)), 5, rect2, true).isPresent()) {
                        hashSet.add(urd.c);
                        hashSet.add(urd.d);
                        hashSet.add(urd.a);
                        hashSet.add(urd.b);
                    }
                }
                aihfVarCreateBuilder2.copyOnWrite();
                auaj auajVar = (auaj) aihfVarCreateBuilder2.instance;
                aiie aiieVar = auajVar.b;
                if (!aiieVar.c()) {
                    auajVar.b = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(hashSet, auajVar.b);
                auaj auajVar2 = (auaj) aihfVarCreateBuilder2.build();
                uqxVar.j.k(auajVar2);
                uqu uquVar8 = new uqu(uqvVarA);
                uquVar8.b(auajVar2);
                uqvVarA = uquVar8.a();
            }
            usd usdVar5 = uqxVar.g;
            augy augyVar10 = uqvVarA.c;
            if (usj.r(augyVar10.e, usdVar5.c())) {
                uqxVar.j.j(urmVarE.a, urmVarE.b, urmVarE.c, this.c);
            } else {
                uqxVar.j.p(augyVar10, urmVarE.a, urmVarE.b, urmVarE.c);
            }
            agkz agkzVar2 = urmVarE.d;
            if (!agkzVar2.equals(uqvVarA.g)) {
                ujl ujlVar5 = uqxVar.j;
                aihf aihfVarCreateBuilder4 = auan.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                auan auanVar = (auan) aihfVarCreateBuilder4.instance;
                aiie aiieVar2 = auanVar.b;
                if (!aiieVar2.c()) {
                    auanVar.b = aihn.mutableCopy(aiieVar2);
                }
                aifs.addAll(agkzVar2, auanVar.b);
                ujlVar5.l((auan) aihfVarCreateBuilder4.build());
                uqu uquVar9 = new uqu(uqvVarA);
                uquVar9.c(agkzVar2);
                uqvVarA = uquVar9.a();
            }
        }
        uqxVar.b = Optional.of(uqvVarA);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
