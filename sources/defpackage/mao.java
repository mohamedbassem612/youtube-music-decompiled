package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mao {
    private static final HashMap a;
    private final mak b;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(maq.WEATHER, 105485385);
        map.put(maq.SMARTSPACE, 105485385);
        map.put(maq.WEATHER_FREEFORM, 105485385);
    }

    public mao() {
        this(new mal(1));
    }

    public final mad a(Context context, ExecutorService executorService) {
        rrq rrqVarA = this.b.a(context, executorService);
        mac macVar = mad.a;
        mad madVar = mac.b;
        if (madVar == null) {
            synchronized (macVar) {
                madVar = mac.b;
                if (madVar == null) {
                    maa maaVar = mab.d;
                    mab lzzVar = maa.b;
                    if (lzzVar == null) {
                        synchronized (maaVar) {
                            lzzVar = maa.b;
                            if (lzzVar == null) {
                                lzzVar = new lzz(context, rrqVarA, executorService);
                                maa.b = lzzVar;
                            }
                        }
                    }
                    Context context2 = ((lzz) lzzVar).a;
                    Pattern pattern = qpr.a;
                    qpq qpqVar = new qpq(context2);
                    qpqVar.c("androidatgoogle_widgets");
                    qpqVar.d("WidgetInstallations.pb");
                    Uri uriA = qpqVar.a();
                    qrl qrlVarA = qrm.a();
                    qrlVarA.f(uriA);
                    qrlVarA.e(ainx.a);
                    Iterator it = ((lzz) lzzVar).b.iterator();
                    while (it.hasNext()) {
                        qrlVarA.b((qrp) it.next());
                    }
                    qrx qrxVarC = ((lzz) lzzVar).c.c(qrlVarA.a());
                    qrxVarC.getClass();
                    maf mafVar = new maf(qrxVarC);
                    mac.b = mafVar;
                    madVar = mafVar;
                }
            }
        }
        return madVar;
    }

    public final void b(maq maqVar, Context context, int[] iArr, ExecutorService executorService) {
        if (iArr.length != 0) {
            aihf aihfVarCreateBuilder = ainv.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ainv ainvVar = (ainv) aihfVarCreateBuilder.instance;
            int i = 4;
            ainvVar.c = 4;
            ainvVar.b |= 1;
            c(maqVar, context, aihfVarCreateBuilder);
            mad madVarA = a(context, executorService);
            for (final int i2 : iArr) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final awri awriVar = new awri();
                mdu.i(mdu.m(mdu.l(((maf) madVarA).b, new iun(new awqg() { // from class: mae
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj) {
                        ainx ainxVar = (ainx) obj;
                        ainxVar.getClass();
                        aiie aiieVar = ainxVar.b;
                        aiieVar.getClass();
                        boolean zIsEmpty = aiieVar.isEmpty();
                        int i3 = i2;
                        if (!zIsEmpty) {
                            Iterator<E> it = aiieVar.iterator();
                            while (it.hasNext()) {
                                if (((ainw) it.next()).c == i3) {
                                    return ainxVar;
                                }
                            }
                        }
                        long j = jCurrentTimeMillis;
                        awriVar.a = true;
                        aihf aihfVarCreateBuilder2 = ainw.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ainw ainwVar = (ainw) aihfVarCreateBuilder2.instance;
                        ainwVar.b |= 1;
                        ainwVar.c = i3;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ainw ainwVar2 = (ainw) aihfVarCreateBuilder2.instance;
                        ainwVar2.b |= 2;
                        ainwVar2.d = j;
                        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                        aihnVarBuild.getClass();
                        aihf builder = ainxVar.toBuilder();
                        builder.aD((ainw) aihnVarBuild);
                        return (ainx) builder.build();
                    }
                }, 3)), new iun(awriVar, i)), new abux(this, maqVar, context, i2, 1));
            }
        }
    }

    public final void c(maq maqVar, Context context, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ainv ainvVar = (ainv) aihfVar.instance;
        ainv ainvVar2 = ainv.a;
        String str = maqVar.ar;
        str.getClass();
        ainvVar.b |= 2;
        ainvVar.d = str;
        HashMap map = a;
        if (map.containsKey(maqVar)) {
            ConcurrentHashMap concurrentHashMap = maj.a;
            map mapVarK = mdu.k(context, ((Number) atqq.x(map, maqVar)).intValue());
            aihn aihnVarBuild = aihfVar.build();
            aihnVarBuild.getClass();
            mapVarK.a((ainv) aihnVarBuild);
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = maj.a;
        map mapVarJ = mdu.j(context);
        aihn aihnVarBuild2 = aihfVar.build();
        aihnVarBuild2.getClass();
        mapVarJ.a((ainv) aihnVarBuild2);
    }

    public mao(mak makVar) {
        this.b = makVar;
    }
}
