package defpackage;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqx {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/MediaEngineGestureController");
    public final usd g;
    public final uli h;
    public final DisplayMetrics i;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public final ujl j = new ujl(MoreExecutors.directExecutor());

    public uqx(usd usdVar, uli uliVar, DisplayMetrics displayMetrics) {
        this.g = usdVar;
        this.h = uliVar;
        this.i = displayMetrics;
    }

    public static final float c(double d, Size size) {
        return (float) ujt.a(size, d);
    }

    public static final Rect d(Size size, auhp auhpVar, Size size2) {
        int width = size.getWidth() / 2;
        int height = size.getHeight() / 2;
        int iF = f(auhpVar.c, size2);
        int iF2 = f(auhpVar.d, size2);
        Rect rect = new Rect(-width, -height, width, height);
        rect.offset((size2.getWidth() / 2) + iF, (size2.getHeight() / 2) + iF2);
        return rect;
    }

    private static final int f(double d, Size size) {
        return (int) Math.round((d * ((double) size.getHeight())) / 2.0d);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [auht, java.lang.Object] */
    public final Optional a(qub qubVar, Size size) {
        xsc xscVar;
        Optional optionalEmpty;
        usd usdVar = this.g;
        UUID uuid = qubVar.a;
        auhs auhsVarC = usdVar.c();
        Optional optionalF = usdVar.f(uuid);
        rub rubVar = new rub(auhsVarC, 5);
        int i = 0;
        if (true == optionalF.isPresent()) {
            Object obj = optionalF.get();
            ?? r1 = rubVar.a;
            long j = ((augy) obj).e;
            Stream stream = Collection.EL.stream(((aufx) yno.gx(r1, aufx.b)).c);
            Optional optionalN = usj.n((auhs) r1, j);
            if (true == optionalN.isPresent()) {
                optionalN = Optional.ofNullable(Boolean.valueOf(!yno.gb((augy) optionalN.get(), augf.NOT_SHOW_IN_TIMELINE)));
            }
            if (!((Boolean) optionalN.orElse(Boolean.TRUE)).booleanValue() || !stream.noneMatch(new uqr(j, i))) {
                optionalF = Optional.empty();
            }
        }
        ure ureVar = new ure(this, qubVar, auhsVarC, size, 1);
        if (true != optionalF.isPresent()) {
            return optionalF;
        }
        Object obj2 = optionalF.get();
        Object obj3 = ureVar.b;
        Object obj4 = ureVar.a;
        Object obj5 = ureVar.c;
        Object obj6 = ureVar.d;
        augy augyVar = (augy) obj2;
        uqu uquVar = new uqu();
        qub qubVar2 = (qub) obj4;
        uquVar.a = qubVar2.a;
        Rect rect = qubVar2.b;
        uquVar.b = new Size(rect.width(), rect.height());
        uquVar.e(augyVar);
        uquVar.c = urn.a();
        uquVar.f(true);
        uquVar.d(false);
        uquVar.c(agpr.a);
        uquVar.d = usj.b(usj.g((auhs) obj5, augyVar.e));
        uqx uqxVar = (uqx) obj3;
        if (uqxVar.d.isPresent()) {
            xscVar = new xsc(Optional.of(uqp.a((akgx) uqxVar.d.get(), uqxVar.i)), Optional.empty(), (Size) obj6);
        } else {
            xscVar = new xsc(Optional.empty(), uqxVar.e, (Size) obj6);
        }
        uquVar.g = xscVar;
        if (uqxVar.f.isEmpty() || uqxVar.d.isEmpty()) {
            optionalEmpty = Optional.empty();
        } else {
            Object obj7 = uqxVar.d.get();
            DisplayMetrics displayMetrics = uqxVar.i;
            uqp uqpVarA = uqp.a((akgx) obj7, displayMetrics);
            Object obj8 = uqxVar.f.get();
            Object obj9 = uqxVar.f.get();
            int iGz = yno.gz((akgx) uqxVar.d.get(), displayMetrics);
            float f = ((akgs) obj9).b;
            agrf agrfVar = twm.a;
            optionalEmpty = Optional.of(new urd(uqpVarA, new uqm((akgs) obj8, Math.max(iGz, (int) TypedValue.applyDimension(1, f, displayMetrics))), (Size) obj6));
        }
        uquVar.e = optionalEmpty;
        if (obj6 == null) {
            throw new NullPointerException("Null playerDimensions");
        }
        uquVar.f = (Size) obj6;
        return Optional.ofNullable(uquVar.a());
    }

    public final Optional b(PointF pointF, Size size) {
        Optional optionalO = this.h.o(pointF, size);
        hqb hqbVar = new hqb(this, size, 10, null);
        if (true != optionalO.isPresent()) {
            return optionalO;
        }
        Object obj = optionalO.get();
        return ((uqx) hqbVar.b).a((qub) obj, (Size) hqbVar.a);
    }

    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.Collection] */
    public final urm e(agkz agkzVar, int i, urn urnVar, augy augyVar, Range range, Size size, Size size2, final xsc xscVar) {
        int i2;
        akgw akgwVar;
        Object urmVar;
        Optional optionalOfNullable;
        Optional optionalOfNullable2;
        auhp auhpVar;
        Optional optionalOf;
        Optional optionalOf2;
        auhp auhpVar2;
        Optional optionalEmpty;
        Optional optionalEmpty2;
        int i3 = 12;
        byte[] bArr = null;
        hqb hqbVar = new hqb(augyVar, size2, i3, bArr);
        Optional optionalOfNullable3 = urnVar.c;
        if (true != optionalOfNullable3.isPresent()) {
            i2 = 2;
        } else {
            Object obj = optionalOfNullable3.get();
            Object obj2 = hqbVar.b;
            Object obj3 = hqbVar.a;
            auhp auhpVar3 = auhp.a;
            aihf aihfVarCreateBuilder = auhpVar3.createBuilder();
            augy augyVar2 = (augy) obj2;
            auhp auhpVar4 = augyVar2.k;
            if (auhpVar4 == null) {
                auhpVar4 = auhpVar3;
            }
            ujr ujrVar = (ujr) obj;
            i2 = 2;
            Size size3 = (Size) obj3;
            float fC = auhpVar4.c + c(ujrVar.a, size3);
            aihfVarCreateBuilder.copyOnWrite();
            auhp auhpVar5 = (auhp) aihfVarCreateBuilder.instance;
            auhpVar5.b |= 1;
            auhpVar5.c = fC;
            auhp auhpVar6 = augyVar2.k;
            if (auhpVar6 != null) {
                auhpVar3 = auhpVar6;
            }
            float fC2 = auhpVar3.d + c(ujrVar.b, size3);
            aihfVarCreateBuilder.copyOnWrite();
            auhp auhpVar7 = (auhp) aihfVarCreateBuilder.instance;
            auhpVar7.b |= 2;
            auhpVar7.d = fC2;
            optionalOfNullable3 = Optional.ofNullable((auhp) aihfVarCreateBuilder.build());
        }
        Optional optionalOfNullable4 = urnVar.e;
        int i4 = 13;
        hqb hqbVar2 = new hqb(augyVar, range, i4, bArr);
        if (true == optionalOfNullable4.isPresent()) {
            Object obj4 = optionalOfNullable4.get();
            Object obj5 = hqbVar2.b;
            Object obj6 = hqbVar2.a;
            auho auhoVar = ((augy) obj5).l;
            if (auhoVar == null) {
                auhoVar = auho.a;
            }
            aihf aihfVarCreateBuilder2 = auho.a.createBuilder();
            SizeF sizeF = (SizeF) obj4;
            Range range2 = (Range) obj6;
            float fFloatValue = ((Float) range2.clamp(Float.valueOf(auhoVar.c * sizeF.getWidth()))).floatValue();
            aihfVarCreateBuilder2.copyOnWrite();
            auho auhoVar2 = (auho) aihfVarCreateBuilder2.instance;
            auhoVar2.b |= 1;
            auhoVar2.c = fFloatValue;
            float fFloatValue2 = ((Float) range2.clamp(Float.valueOf(auhoVar.d * sizeF.getHeight()))).floatValue();
            aihfVarCreateBuilder2.copyOnWrite();
            auho auhoVar3 = (auho) aihfVarCreateBuilder2.instance;
            auhoVar3.b |= 2;
            auhoVar3.d = fFloatValue2;
            optionalOfNullable4 = Optional.ofNullable((auho) aihfVarCreateBuilder2.build());
        }
        Optional optionalOfNullable5 = urnVar.d;
        sla slaVar = new sla(augyVar, 15);
        if (true == optionalOfNullable5.isPresent()) {
            optionalOfNullable5 = Optional.ofNullable(Double.valueOf(((augy) slaVar.a).o + ((Double) optionalOfNullable5.get()).doubleValue()));
        }
        auhp auhpVar8 = augyVar.k;
        if (auhpVar8 == null) {
            auhpVar8 = auhp.a;
        }
        final Rect rectD = d(size, (auhp) optionalOfNullable3.orElse(auhpVar8), size2);
        if (i != 1) {
            Optional optional = (Optional) xscVar.a;
            if (!optional.isPresent()) {
                Optional optional2 = (Optional) xscVar.c;
                if (optional2.isEmpty() || !((atzw) optional2.get()).c || optionalOfNullable5.isEmpty()) {
                    return new urm(optionalOfNullable3, optionalOfNullable4, optionalOfNullable5, agpr.a);
                }
                atzw atzwVar = (atzw) optional2.get();
                Optional optionalP = xsc.P(((Double) optionalOfNullable5.get()).doubleValue(), atzwVar.g, atzwVar.h);
                ure ureVar = new ure(xscVar, optionalOfNullable3, optionalOfNullable4, new Point(rectD.centerX(), rectD.centerY()), 0);
                if (true == optionalP.isPresent()) {
                    Object obj7 = optionalP.get();
                    Object obj8 = ureVar.a;
                    Object obj9 = ureVar.b;
                    Optional optional3 = (Optional) obj9;
                    optionalP = Optional.ofNullable(new urm(optional3, (Optional) ureVar.c, Optional.of(obj7), new agqj(xsc.O((Size) ((xsc) obj8).b, ((Double) obj7).doubleValue(), (Point) ureVar.d, Optional.empty()))));
                }
                urf urfVar = new urf(optionalOfNullable3, optionalOfNullable4, optionalOfNullable5);
                return (urm) (true != optionalP.isPresent() ? new urm(urfVar.a, urfVar.b, urfVar.c, agpr.a) : optionalP.get());
            }
            if (optional.isEmpty()) {
                return new urm(optionalOfNullable3, optionalOfNullable4, optionalOfNullable5, agpr.a);
            }
            uqp uqpVar = (uqp) optional.get();
            url urlVarN = xscVar.N(uqpVar, rectD, false, true);
            if (optionalOfNullable5.isEmpty()) {
                return new urm(optionalOfNullable3, optionalOfNullable4, optionalOfNullable5, (agkz) Stream.CC.concat(Collection.EL.stream(urlVarN.a).map(new uri()), Collection.EL.stream(urlVarN.b).map(new uri())).collect(aghu.b));
            }
            double dDoubleValue = ((Double) optionalOfNullable5.get()).doubleValue();
            akgx akgxVar = uqpVar.a;
            Optional optionalEmpty3 = Optional.empty();
            Iterator it = akgxVar.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    akgwVar = null;
                    break;
                }
                akgw akgwVar2 = (akgw) it.next();
                Optional optionalP2 = xsc.P(dDoubleValue, akgwVar2.c, akgxVar.i);
                if (optionalP2.isPresent()) {
                    akgwVar = akgwVar2;
                    optionalEmpty3 = optionalP2;
                    break;
                }
                optionalEmpty3 = optionalP2;
            }
            urj urjVar = new urj(xscVar, urlVarN, new Point(rectD.centerX(), rectD.centerY()), akgwVar, optionalOfNullable3, optionalOfNullable4, 0);
            if (true == optionalEmpty3.isPresent()) {
                Object obj10 = optionalEmpty3.get();
                Object obj11 = urjVar.a;
                Object obj12 = urjVar.b;
                Object obj13 = urjVar.c;
                aihn aihnVar = urjVar.d;
                Object obj14 = urjVar.e;
                Object obj15 = urjVar.f;
                agkx agkxVar = new agkx();
                url urlVar = (url) obj12;
                agkxVar.k(Collection.EL.stream(urlVar.a).map(new uri()).iterator());
                agkxVar.k(Collection.EL.stream(urlVar.b).map(new uri()).iterator());
                agkxVar.c(xsc.O((Size) ((xsc) obj11).b, ((Double) obj10).doubleValue(), (Point) obj13, Optional.ofNullable(aihnVar)));
                optionalEmpty3 = Optional.ofNullable(new urm((Optional) obj14, (Optional) obj15, Optional.of(obj10), agkxVar.g()));
            }
            urk urkVar = new urk(optionalOfNullable3, optionalOfNullable4, optionalOfNullable5, urlVarN);
            if (true != optionalEmpty3.isPresent()) {
                Optional optional4 = urkVar.a;
                Optional optional5 = urkVar.b;
                Optional optional6 = urkVar.c;
                url urlVar2 = urkVar.d;
                urmVar = new urm(optional4, optional5, optional6, (agkz) Stream.CC.concat(Collection.EL.stream(urlVar2.a).map(new uri()), Collection.EL.stream(urlVar2.b).map(new uri())).collect(aghu.b));
            } else {
                urmVar = optionalEmpty3.get();
            }
            return (urm) urmVar;
        }
        Optional optional7 = (Optional) xscVar.a;
        int i5 = 19;
        int i6 = 18;
        if (!optional7.isPresent()) {
            Optional optional8 = (Optional) xscVar.c;
            if (optional8.isEmpty() || !((atzw) optional8.get()).c || optionalOfNullable3.isEmpty()) {
                return new urm(optionalOfNullable3, optionalOfNullable4, optionalOfNullable5, agpr.a);
            }
            Object obj16 = optional8.get();
            auhp auhpVar9 = (auhp) optionalOfNullable3.get();
            atzw atzwVar2 = (atzw) obj16;
            final int i7 = atzwVar2.d;
            final float f = atzwVar2.e;
            final int i8 = 2;
            final int i9 = 3;
            Optional optionalOr = xscVar.S(rectD.centerX(), 0.5f, i7, 3).or(new Supplier() { // from class: urg
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i10 = i8;
                    if (i10 == 0) {
                        float f2 = f;
                        Rect rect = rectD;
                        return xscVar.R(rect.bottom, 1.0f - f2, i7, 5);
                    }
                    if (i10 == 1) {
                        Rect rect2 = rectD;
                        int i11 = i7;
                        return xscVar.R(rect2.top, f, i11, 4);
                    }
                    if (i10 != 2) {
                        float f3 = f;
                        Rect rect3 = rectD;
                        return xscVar.S(rect3.right, 1.0f - f3, i7, 7);
                    }
                    Rect rect4 = rectD;
                    int i12 = i7;
                    return xscVar.S(rect4.left, f, i12, 6);
                }
            }).or(new Supplier() { // from class: urg
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i10 = i9;
                    if (i10 == 0) {
                        float f2 = f;
                        Rect rect = rectD;
                        return xscVar.R(rect.bottom, 1.0f - f2, i7, 5);
                    }
                    if (i10 == 1) {
                        Rect rect2 = rectD;
                        int i11 = i7;
                        return xscVar.R(rect2.top, f, i11, 4);
                    }
                    if (i10 != 2) {
                        float f3 = f;
                        Rect rect3 = rectD;
                        return xscVar.S(rect3.right, 1.0f - f3, i7, 7);
                    }
                    Rect rect4 = rectD;
                    int i12 = i7;
                    return xscVar.S(rect4.left, f, i12, 6);
                }
            });
            final float f2 = atzwVar2.f;
            final int i10 = 1;
            final int i11 = 0;
            Optional optionalOr2 = xscVar.R(rectD.centerY(), 0.5f, i7, i2).or(new Supplier() { // from class: urg
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i12 = i10;
                    if (i12 == 0) {
                        float f3 = f2;
                        Rect rect = rectD;
                        return xscVar.R(rect.bottom, 1.0f - f3, i7, 5);
                    }
                    if (i12 == 1) {
                        Rect rect2 = rectD;
                        int i13 = i7;
                        return xscVar.R(rect2.top, f2, i13, 4);
                    }
                    if (i12 != 2) {
                        float f4 = f2;
                        Rect rect3 = rectD;
                        return xscVar.S(rect3.right, 1.0f - f4, i7, 7);
                    }
                    Rect rect4 = rectD;
                    int i14 = i7;
                    return xscVar.S(rect4.left, f2, i14, 6);
                }
            }).or(new Supplier() { // from class: urg
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i12 = i11;
                    if (i12 == 0) {
                        float f3 = f2;
                        Rect rect = rectD;
                        return xscVar.R(rect.bottom, 1.0f - f3, i7, 5);
                    }
                    if (i12 == 1) {
                        Rect rect2 = rectD;
                        int i13 = i7;
                        return xscVar.R(rect2.top, f2, i13, 4);
                    }
                    if (i12 != 2) {
                        float f4 = f2;
                        Rect rect3 = rectD;
                        return xscVar.S(rect3.right, 1.0f - f4, i7, 7);
                    }
                    Rect rect4 = rectD;
                    int i14 = i7;
                    return xscVar.S(rect4.left, f2, i14, 6);
                }
            });
            qze qzeVar = new qze(xscVar, agkzVar, auhpVar9, 5);
            if (true != optionalOr.isPresent()) {
                optionalOfNullable = optionalOr;
            } else {
                Object obj17 = optionalOr.get();
                uqn uqnVar = (uqn) obj17;
                optionalOfNullable = Optional.ofNullable(((agkz) qzeVar.a).contains(uqnVar.a) ? Optional.empty() : Optional.of(Float.valueOf(((auhp) qzeVar.c).c + ((xsc) qzeVar.b).M(uqnVar.b))));
            }
            Optional optional9 = (Optional) optionalOfNullable.orElse(Optional.of(Float.valueOf(auhpVar9.c)));
            qze qzeVar2 = new qze(xscVar, agkzVar, auhpVar9, 6);
            if (true != optionalOr2.isPresent()) {
                optionalOfNullable2 = optionalOr2;
            } else {
                Object obj18 = optionalOr2.get();
                uqn uqnVar2 = (uqn) obj18;
                optionalOfNullable2 = Optional.ofNullable(((agkz) qzeVar2.a).contains(uqnVar2.a) ? Optional.empty() : Optional.of(Float.valueOf(((auhp) qzeVar2.c).d + ((xsc) qzeVar2.b).M(uqnVar2.b))));
            }
            Optional optional10 = (Optional) optionalOfNullable2.orElse(Optional.of(Float.valueOf(auhpVar9.d)));
            if (optional9.isPresent() || optional10.isPresent()) {
                aihf aihfVarCreateBuilder3 = auhp.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                uhe uheVar = new uhe(aihfVarCreateBuilder3, i6);
                if (true == optional9.isPresent()) {
                    Object obj19 = optional9.get();
                    Object obj20 = uheVar.a;
                    float fFloatValue3 = ((Float) obj19).floatValue();
                    aihf aihfVar = (aihf) obj20;
                    aihfVar.copyOnWrite();
                    auhp auhpVar10 = (auhp) aihfVar.instance;
                    auhpVar10.b |= 1;
                    auhpVar10.c = fFloatValue3;
                }
                uhe uheVar2 = new uhe(aihfVarCreateBuilder3, i5);
                if (true == optional10.isPresent()) {
                    Object obj21 = optional10.get();
                    Object obj22 = uheVar2.a;
                    float fFloatValue4 = ((Float) obj21).floatValue();
                    aihf aihfVar2 = (aihf) obj22;
                    aihfVar2.copyOnWrite();
                    auhp auhpVar11 = (auhp) aihfVar2.instance;
                    auhpVar11.b |= 2;
                    auhpVar11.d = fFloatValue4;
                }
                auhpVar = (auhp) aihfVarCreateBuilder3.build();
            } else {
                auhpVar = null;
            }
            agkx agkxVar2 = new agkx();
            if (true == optionalOr.isPresent()) {
                optionalOr = Optional.ofNullable(((uqn) optionalOr.get()).a);
            }
            uhe uheVar3 = new uhe(agkxVar2, 20);
            if (true == optionalOr.isPresent()) {
                ((agkx) uheVar3.a).c((auak) optionalOr.get());
            }
            if (true == optionalOr2.isPresent()) {
                optionalOr2 = Optional.ofNullable(((uqn) optionalOr2.get()).a);
            }
            uhe uheVar4 = new uhe(agkxVar2, 20);
            if (true == optionalOr2.isPresent()) {
                ((agkx) uheVar4.a).c((auak) optionalOr2.get());
            }
            return new urm(Optional.ofNullable(auhpVar), optionalOfNullable4, optionalOfNullable5, agkxVar2.g());
        }
        if (optional7.isEmpty() || optionalOfNullable3.isEmpty()) {
            return new urm(optionalOfNullable3, optionalOfNullable4, optionalOfNullable5, agpr.a);
        }
        uqp uqpVar2 = (uqp) optional7.get();
        auhp auhpVar12 = (auhp) optionalOfNullable3.get();
        url urlVarN2 = xscVar.N(uqpVar2, rectD, true, false);
        agke agkeVar = urlVarN2.a;
        if (agkeVar.size() == 1) {
            Optional optionalFindFirst = Collection.EL.stream(agkeVar).findFirst();
            qze qzeVar3 = new qze(xscVar, auhpVar12, agkzVar, 7);
            if (true == optionalFindFirst.isPresent()) {
                Object obj23 = optionalFindFirst.get();
                Object obj24 = qzeVar3.b;
                Object obj25 = qzeVar3.c;
                ?? r15 = qzeVar3.a;
                uqn uqnVar3 = (uqn) obj23;
                if (uqnVar3.a.g) {
                    optionalEmpty2 = Collection.EL.stream(r15).anyMatch(new sco(uqnVar3, i4)) ? Optional.empty() : Optional.of(Float.valueOf(((auhp) obj25).c + ((xsc) obj24).M(uqnVar3.b)));
                } else {
                    optionalEmpty2 = Optional.of(Float.valueOf(((auhp) obj25).c));
                }
                optionalFindFirst = Optional.ofNullable(optionalEmpty2);
            }
            optionalOf = (Optional) optionalFindFirst.orElse(Optional.of(Float.valueOf(auhpVar12.c)));
        } else {
            optionalOf = Optional.of(Float.valueOf(auhpVar12.c));
        }
        if (optionalOf.isPresent() && agkeVar.size() == 1) {
            zak zakVar = new zak();
            zakVar.f((agke) Collection.EL.stream(agkeVar).map(new snm(17)).collect(aghu.a));
            zakVar.g(urlVarN2.b);
            urlVarN2 = zakVar.e();
        }
        agke agkeVar2 = urlVarN2.b;
        if (agkeVar2.size() == 1) {
            Optional optionalFindFirst2 = Collection.EL.stream(agkeVar2).findFirst();
            qze qzeVar4 = new qze(xscVar, auhpVar12, agkzVar, 4);
            if (true == optionalFindFirst2.isPresent()) {
                Object obj26 = optionalFindFirst2.get();
                Object obj27 = qzeVar4.b;
                Object obj28 = qzeVar4.c;
                ?? r10 = qzeVar4.a;
                uqn uqnVar4 = (uqn) obj26;
                if (uqnVar4.a.g) {
                    optionalEmpty = Collection.EL.stream(r10).anyMatch(new sco(uqnVar4, i3)) ? Optional.empty() : Optional.of(Float.valueOf(((auhp) obj28).d + ((xsc) obj27).M(uqnVar4.b)));
                } else {
                    optionalEmpty = Optional.of(Float.valueOf(((auhp) obj28).d));
                }
                optionalFindFirst2 = Optional.ofNullable(optionalEmpty);
            }
            optionalOf2 = (Optional) optionalFindFirst2.orElse(Optional.of(Float.valueOf(auhpVar12.d)));
        } else {
            optionalOf2 = Optional.of(Float.valueOf(auhpVar12.d));
        }
        if (optionalOf2.isPresent() && agkeVar2.size() == 1) {
            zak zakVar2 = new zak();
            zakVar2.f(urlVarN2.a);
            zakVar2.g((agke) Collection.EL.stream(agkeVar2).map(new snm(i6)).collect(aghu.a));
            urlVarN2 = zakVar2.e();
        }
        if (optionalOf.isPresent() || optionalOf2.isPresent()) {
            aihf aihfVarCreateBuilder4 = auhp.a.createBuilder();
            aihfVarCreateBuilder4.getClass();
            uhe uheVar5 = new uhe(aihfVarCreateBuilder4, i6);
            if (true == optionalOf.isPresent()) {
                Object obj29 = optionalOf.get();
                Object obj30 = uheVar5.a;
                float fFloatValue5 = ((Float) obj29).floatValue();
                aihf aihfVar3 = (aihf) obj30;
                aihfVar3.copyOnWrite();
                auhp auhpVar13 = (auhp) aihfVar3.instance;
                auhpVar13.b |= 1;
                auhpVar13.c = fFloatValue5;
            }
            uhe uheVar6 = new uhe(aihfVarCreateBuilder4, i5);
            if (true == optionalOf2.isPresent()) {
                Object obj31 = optionalOf2.get();
                Object obj32 = uheVar6.a;
                float fFloatValue6 = ((Float) obj31).floatValue();
                aihf aihfVar4 = (aihf) obj32;
                aihfVar4.copyOnWrite();
                auhp auhpVar14 = (auhp) aihfVar4.instance;
                auhpVar14.b |= 2;
                auhpVar14.d = fFloatValue6;
            }
            auhpVar2 = (auhp) aihfVarCreateBuilder4.build();
        } else {
            auhpVar2 = null;
        }
        agkx agkxVar3 = new agkx();
        int i12 = 20;
        Collection.EL.stream(urlVarN2.a).map(new uri()).forEach(new uhe(agkxVar3, i12));
        Collection.EL.stream(urlVarN2.b).map(new uri()).forEach(new uhe(agkxVar3, i12));
        return new urm(Optional.ofNullable(auhpVar2), optionalOfNullable4, optionalOfNullable5, agkxVar3.g());
    }
}
