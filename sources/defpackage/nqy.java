package defpackage;

import android.content.Context;
import android.util.TypedValue;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nqy {
    public static void a(nuc nucVar, aslh aslhVar, String str, Object... objArr) {
        nucVar.f(aslhVar, nsl.b().a(), null, str, objArr);
    }

    public static void b(nuc nucVar, asnc asncVar, String str, Object... objArr) {
        nsk nskVarB = nsl.b();
        StringBuilder sb = new StringBuilder();
        sb.append(asncVar.f);
        nskVarB.f = sb;
        nucVar.g(asncVar, nskVarB.a(), null, str, objArr);
    }

    public static void c(nuc nucVar, asnc asncVar, Throwable th, String str, Object... objArr) {
        nsk nskVarB = nsl.b();
        StringBuilder sb = new StringBuilder();
        sb.append(asncVar.f);
        nskVarB.f = sb;
        nucVar.g(asncVar, nskVarB.a(), th, str, objArr);
    }

    public static void d(nuc nucVar, aslh aslhVar, nsl nslVar, Throwable th, asmw asmwVar, String str, Object... objArr) {
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        nucVar.i((asnc) aihfVarCreateBuilder.build(), nslVar, th, asmwVar, str, objArr);
    }

    public static final int e(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final float f(float f, Context context) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static final pys g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return pys.b;
        }
        if (i2 == 2) {
            return pys.e;
        }
        if (i2 == 3) {
            return pys.f;
        }
        throw new IllegalStateException("REQUIREMENTS_MET is not a failed outcome and should not be passed here.");
    }

    public static final int h(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    public static void i(agyz agyzVar) {
        final qzo qzoVar = new qzo(0);
        final agyt agytVar = (agyt) agyzVar;
        agytVar.a.forEach(new Consumer() { // from class: agyr
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                BiConsumer biConsumer = qzoVar;
                agyt agytVar2 = agytVar;
                biConsumer.accept(agytVar2.b.apply(obj), agytVar2.c.apply(obj));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public static qzg j(agke agkeVar, agke agkeVar2) {
        if (agkeVar.isEmpty()) {
            return agkeVar2.isEmpty() ? qzg.d : qzg.b;
        }
        if (agkeVar2.isEmpty()) {
            return qzg.a;
        }
        if (agkeVar.size() == agkeVar2.size()) {
            agyz agyzVarD = agyz.d(agkeVar, agkeVar2);
            rjm rjmVar = rjm.a;
            rjmVar.getClass();
            agkz agkzVar = (agkz) agyzVarD.a(new ito(rjmVar, 2)).collect(aghu.b);
            if (!Collection.EL.stream(agkzVar).anyMatch(new jor(10))) {
                return Collection.EL.stream(agkzVar).anyMatch(new jor(11)) ? qzg.c : qzg.d;
            }
        }
        return qzg.b;
    }

    public static /* synthetic */ int k(int i, int i2) {
        int i3 = i % i2;
        if (i3 == 0) {
            return 0;
        }
        return (((i ^ i2) >> 31) | 1) <= 0 ? i3 + i2 : i3;
    }
}
