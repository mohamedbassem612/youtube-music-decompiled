package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iky {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/playlistfiltersearch/PlaylistFilterSearchDataService");
    private static final awtk n = new awtk("[^\\p{L}\\p{N}]");
    public final wom b;
    public final Executor c;
    public final awut d;
    public final axaf e;
    public final axaf f;
    public final axaf g;
    public final axaf h;
    public final axaf i;
    public final axaf j;
    public final axat k;
    public final axat l;
    public final aend m;
    private final awou o;
    private final awou p;
    private final awut q;

    public iky(aend aendVar, wom womVar, awou awouVar, awou awouVar2, Executor executor) {
        aendVar.getClass();
        womVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        executor.getClass();
        this.m = aendVar;
        this.b = womVar;
        this.o = awouVar;
        this.p = awouVar2;
        this.c = executor;
        this.d = awrc.K(awouVar.plus(new awxf(null)));
        awut awutVarK = awrc.K(awouVar2.plus(new awxf(null)));
        this.q = awutVarK;
        this.e = axaw.a(awno.a);
        axaf axafVarA = axaw.a("");
        this.f = axafVarA;
        axaf axafVarA2 = axaw.a("");
        this.g = axafVarA2;
        axaf axafVarA3 = axaw.a(0);
        this.h = axafVarA3;
        Boolean bool = Boolean.FALSE;
        axaf axafVarA4 = axaw.a(bool);
        this.i = axafVarA4;
        axaf axafVarA5 = axaw.a(bool);
        this.j = axafVarA5;
        this.k = new axag(axafVarA5, null);
        awzc awzcVarA = awzu.a(new ikx(new awzl(new awzc[]{axafVarA2, axafVarA, axafVarA3, axafVarA4}, new iku(this, null), 4), 0), new ikv(this, null));
        axas axasVar = new axas();
        ilf ilfVar = ilf.a;
        boolean z = awuv.a;
        int i = awye.zb;
        awov awovVar = awov.a;
        axaf axafVarA6 = axaw.a(ilfVar);
        boolean zC = awrc.c(axasVar, axao.a);
        this.l = new axag(axafVarA6, awro.s(awutVarK, awovVar, true == zC ? 1 : 4, new egh(axasVar, awzcVarA, axafVarA6, ilfVar, (awoq) null, 13)));
    }

    public static final List a(String str) {
        List listH;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Matcher matcher = new awtk("\\s+").a.matcher(lowerCase);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(lowerCase.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(lowerCase.subSequence(iEnd, lowerCase.length()).toString());
            listH = arrayList;
        } else {
            listH = atqq.H(lowerCase);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listH) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(atqq.N(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(n.a((String) it.next(), ""));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((String) obj2).length() > 0) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }
}
