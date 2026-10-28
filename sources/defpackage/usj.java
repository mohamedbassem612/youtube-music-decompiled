package defpackage;

import android.util.Range;
import android.util.Size;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositions");
    public static final auho b;

    static {
        aihf aihfVarCreateBuilder = auho.a.createBuilder();
        float width = qvs.a.getWidth();
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar = (auho) aihfVarCreateBuilder.instance;
        auhoVar.b |= 1;
        auhoVar.c = width;
        float height = qvs.a.getHeight();
        aihfVarCreateBuilder.copyOnWrite();
        auho auhoVar2 = (auho) aihfVarCreateBuilder.instance;
        auhoVar2.b |= 2;
        auhoVar2.d = height;
        b = (auho) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r0 == 3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(defpackage.augy r5) {
        /*
            boolean r0 = defpackage.yno.ff(r5)
            r1 = 100
            if (r0 == 0) goto L73
            boolean r0 = defpackage.yno.ff(r5)
            if (r0 == 0) goto L73
            int r0 = r5.c
            r1 = 102(0x66, float:1.43E-43)
            r2 = 800(0x320, float:1.121E-42)
            if (r0 == r1) goto L53
            r1 = 107(0x6b, float:1.5E-43)
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r5.d
            auhv r0 = (defpackage.auhv) r0
            goto L21
        L1f:
            auhv r0 = defpackage.auhv.a
        L21:
            int r3 = r0.c
            r4 = 2
            if (r3 != r4) goto L2b
            java.lang.Object r0 = r0.d
            auih r0 = (defpackage.auih) r0
            goto L2d
        L2b:
            auih r0 = defpackage.auih.a
        L2d:
            int r0 = r0.b
            r0 = r0 & r4
            if (r0 == 0) goto L55
            int r0 = r5.c
            if (r0 != r1) goto L3b
            java.lang.Object r0 = r5.d
            auhv r0 = (defpackage.auhv) r0
            goto L3d
        L3b:
            auhv r0 = defpackage.auhv.a
        L3d:
            int r3 = r0.c
            if (r3 != r4) goto L46
            java.lang.Object r0 = r0.d
            auih r0 = (defpackage.auih) r0
            goto L48
        L46:
            auih r0 = defpackage.auih.a
        L48:
            int r0 = r0.f
            int r0 = defpackage.a.bi(r0)
            if (r0 == 0) goto L55
            r3 = 3
            if (r0 != r3) goto L55
        L53:
            r1 = r2
            goto L73
        L55:
            int r0 = r5.c
            if (r0 != r1) goto L5e
            java.lang.Object r5 = r5.d
            auhv r5 = (defpackage.auhv) r5
            goto L60
        L5e:
            auhv r5 = defpackage.auhv.a
        L60:
            int r0 = r5.c
            if (r0 != r4) goto L69
            java.lang.Object r5 = r5.d
            auih r5 = (defpackage.auih) r5
            goto L6b
        L69:
            auih r5 = defpackage.auih.a
        L6b:
            ameh r5 = r5.e
            if (r5 != 0) goto L71
            ameh r5 = defpackage.ameh.a
        L71:
            int r1 = r5.d
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usj.a(augy):int");
    }

    public static Range b(auga augaVar) {
        return new Range(Float.valueOf((augaVar.b & 1) != 0 ? augaVar.c : Float.NEGATIVE_INFINITY), Float.valueOf((augaVar.b & 2) != 0 ? augaVar.d : Float.POSITIVE_INFINITY));
    }

    public static Size c(auhn auhnVar) {
        return new Size(auhnVar.c, auhnVar.d);
    }

    public static agke d(auhs auhsVar) {
        return (agke) Collection.EL.stream(((augp) yno.gx(auhsVar, augp.b)).c).map(new uot(auhsVar, 3)).filter(new sde(16)).collect(aghu.a);
    }

    public static agke e(auhs auhsVar) {
        return t(auhsVar, new sco(u(auhsVar), 19));
    }

    public static agke f(auhs auhsVar) {
        return t(auhsVar, new sco(u(auhsVar), 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static auga g(auhs auhsVar, long j) {
        augb augbVar = (augb) yno.gx(auhsVar, augb.b);
        auga augaVar = auga.a;
        auga augaVar2 = (auga) augbVar.c.get(Long.valueOf(j));
        return augaVar2 != null ? augaVar2 : augaVar;
    }

    public static auhs h(auhs auhsVar, aufa aufaVar) {
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).e = auhs.emptyProtobufList();
        auhqVar.a((Iterable) Collection.EL.stream(auhsVar.e).filter(new sco(aufaVar, 17)).collect(aghu.a));
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        aufaVar.getClass();
        auhsVar2.a();
        auhsVar2.e.add(aufaVar);
        return (auhs) auhqVar.build();
    }

    public static auhs i(auhs auhsVar, augy augyVar) {
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).d = auhs.emptyProtobufList();
        auhqVar.b((Iterable) Collection.EL.stream(auhsVar.d).filter(new sco(augyVar, 16)).collect(aghu.a));
        auhqVar.d(augyVar);
        if ((auhsVar.b & 2) != 0) {
            aigu aiguVarAu = ahng.au(l((auhs) auhqVar.build()));
            auhqVar.copyOnWrite();
            auhs auhsVar2 = (auhs) auhqVar.instance;
            aiguVarAu.getClass();
            auhsVar2.h = aiguVarAu;
            auhsVar2.b |= 2;
        }
        return (auhs) auhqVar.build();
    }

    public static auhs j(final auhs auhsVar, final long j, final Function function) {
        return yno.gw(auhsVar, augb.b, new Function() { // from class: usi
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                agrf agrfVar = usj.a;
                aihf builder = ((augb) obj).toBuilder();
                Function function2 = function;
                auhs auhsVar2 = auhsVar;
                long j2 = j;
                auga augaVar = (auga) function2.apply(usj.g(auhsVar2, j2));
                augaVar.getClass();
                builder.copyOnWrite();
                augb augbVar = (augb) builder.instance;
                aiip aiipVar = augbVar.c;
                if (!aiipVar.b) {
                    augbVar.c = aiipVar.a();
                }
                augbVar.c.put(Long.valueOf(j2), augaVar);
                return (augb) builder.build();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
    }

    public static auin k(aufa aufaVar) {
        aihf aihfVarCreateBuilder = auin.a.createBuilder();
        aigu aiguVar = aufaVar.f;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        int iB = (int) aikw.b(aiguVar);
        aihfVarCreateBuilder.copyOnWrite();
        auin auinVar = (auin) aihfVarCreateBuilder.instance;
        auinVar.b |= 1;
        auinVar.c = iB;
        aigu aiguVar2 = aufaVar.g;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        int iB2 = (int) aikw.b(aiguVar2);
        aihfVarCreateBuilder.copyOnWrite();
        auin auinVar2 = (auin) aihfVarCreateBuilder.instance;
        auinVar2.b |= 2;
        auinVar2.d = iB2;
        return (auin) aihfVarCreateBuilder.build();
    }

    public static Duration l(auhs auhsVar) {
        agkz agkzVar = (agkz) Collection.EL.stream(yno.gv(auhsVar).c).map(new ush(1)).collect(aghu.b);
        if (!agkzVar.isEmpty()) {
            agke agkeVar = (agke) Collection.EL.stream(auhsVar.d).filter(new sco(agkzVar, 18)).collect(aghu.a);
            return ((Duration) Collection.EL.stream(agkeVar).map(new ush(3)).max(Comparator$CC.naturalOrder()).orElse(Duration.ZERO)).minus((Duration) Collection.EL.stream(agkeVar).map(new ush(2)).min(Comparator$CC.naturalOrder()).orElse(Duration.ZERO));
        }
        aigu aiguVar = auhsVar.h;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        return ahng.aw(aiguVar);
    }

    public static Optional m(auhs auhsVar, long j) {
        return Collection.EL.stream(auhsVar.e).filter(new uqr(j, 5)).findFirst();
    }

    public static Optional n(auhs auhsVar, long j) {
        return o(auhsVar.d, j);
    }

    public static Optional o(List list, long j) {
        return Collection.EL.stream(list).filter(new uqr(j, 4)).findFirst();
    }

    public static Optional p(auhs auhsVar, int i) {
        Optional optionalMax = Collection.EL.stream(auhsVar.d).filter(new mob(i, 4)).max(Comparator$CC.comparingInt(new ddc(11)));
        return true == optionalMax.isPresent() ? Optional.ofNullable(Integer.valueOf(((augy) optionalMax.get()).g)) : optionalMax;
    }

    public static Optional q(auhs auhsVar, arfu arfuVar) {
        Optional optionalFindFirst = Collection.EL.stream(auhsVar.k).filter(new sco(arfuVar, 15)).findFirst();
        if (true == optionalFindFirst.isPresent()) {
            optionalFindFirst = Optional.ofNullable(Float.valueOf(((auhr) optionalFindFirst.get()).c));
        }
        return optionalFindFirst.stream().findFirst();
    }

    public static boolean r(long j, auhs auhsVar) {
        return Collection.EL.stream(((augj) yno.gx(auhsVar, augj.b)).c).anyMatch(new uqr(j, 3));
    }

    public static jrr s(Duration duration, Duration duration2, long j) {
        jrr jrrVar = (jrr) augy.a.createBuilder();
        jrrVar.copyOnWrite();
        augy augyVar = (augy) jrrVar.instance;
        augyVar.b |= 1;
        augyVar.e = j;
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        augyVar2.b |= 2;
        augyVar2.f = "primary video segment";
        jrrVar.copyOnWrite();
        augy augyVar3 = (augy) jrrVar.instance;
        augyVar3.b |= 4;
        augyVar3.g = 0;
        aigu aiguVarAu = ahng.au(duration2);
        jrrVar.copyOnWrite();
        augy augyVar4 = (augy) jrrVar.instance;
        aiguVarAu.getClass();
        augyVar4.i = aiguVarAu;
        augyVar4.b |= 16;
        aigu aiguVarAu2 = ahng.au((Duration) afyd.e(duration, urw.a));
        jrrVar.copyOnWrite();
        augy augyVar5 = (augy) jrrVar.instance;
        aiguVarAu2.getClass();
        augyVar5.j = aiguVarAu2;
        augyVar5.b |= 32;
        return jrrVar;
    }

    private static agke t(auhs auhsVar, Predicate predicate) {
        return (agke) Collection.EL.stream(auhsVar.d).filter(predicate).collect(aghu.a);
    }

    private static agkz u(auhs auhsVar) {
        return (agkz) Collection.EL.stream(((aufx) yno.gx(auhsVar, aufx.b)).c).map(new ush(1)).collect(aghu.b);
    }
}
