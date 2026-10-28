package defpackage;

import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ydu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/user/MdxUserProfile");
    public final ListenableFuture b;
    public final int[] c;
    public final int[] d;
    public final yds e;
    public final awli f = new awli();
    public final mbc g;
    public final SharedPreferences h;
    private final Executor i;

    public ydu(yds ydsVar, mbc mbcVar, SharedPreferences sharedPreferences, Executor executor) {
        int[] iArr = new int[28];
        this.c = iArr;
        int[] iArr2 = new int[28];
        this.d = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.e = ydsVar;
        this.g = mbcVar;
        this.h = sharedPreferences;
        this.i = executor;
        ListenableFuture listenableFutureA = ((tpq) ydsVar.b.io()).a();
        thc thcVar = new thc(ydsVar, 10);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), thcVar, 1);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureA, ahdbVar);
        listenableFutureA.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        ahcr ahcrVar = new ahcr(ahcqVar, new afwi(afty.c(false), new idv(this, ydsVar, 6, null)));
        ahcqVar.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        this.b = ahcrVar;
    }

    public static int c(int[] iArr, int i) {
        int i2 = i != 0 ? i != 1 ? 28 : 7 : 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int a(String str) {
        yds ydsVar = this.e;
        ydsVar.k(str);
        atpf atpfVar = (atpf) ydsVar.d().get(str);
        if (atpfVar != null) {
            return (int) atpfVar.d;
        }
        return 0;
    }

    public final int b() {
        Iterator it = this.e.d().values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += (int) ((atpf) it.next()).d;
        }
        return i;
    }

    public final long d() {
        long jA = this.e.a();
        if (jA >= 0) {
            return this.g.f().minusMillis(jA).toEpochMilli();
        }
        return 0L;
    }

    public final agke e() {
        yds ydsVar = this.e;
        return (agke) Collection.EL.stream(ydsVar.b()).map(new hpc(ydsVar.c.f(), 6)).collect(aghu.a);
    }

    public final List f() {
        yds ydsVar = this.e;
        final long epochMilli = ydsVar.c.f().toEpochMilli();
        return (List) Collection.EL.stream(ydsVar.m()).map(new Function() { // from class: ydq
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                atpg atpgVar = (atpg) obj;
                long j = epochMilli - atpgVar.c;
                int iAU = a.aU(atpgVar.d);
                if (iAU == 0) {
                    iAU = 1;
                }
                aihf aihfVarCreateBuilder = amyq.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amyq amyqVar = (amyq) aihfVarCreateBuilder.instance;
                amyqVar.d = iAU - 1;
                amyqVar.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                amyq amyqVar2 = (amyq) aihfVarCreateBuilder.instance;
                amyqVar2.b |= 1;
                amyqVar2.c = (int) (j / 1000);
                return (amyq) aihfVarCreateBuilder.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new idl(8)));
    }

    public final void g() {
        this.f.kk(Boolean.TRUE);
    }

    public final void h(final int i) {
        taf.g(this.b, new tae() { // from class: ydt
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj) {
                aihf aihfVarCreateBuilder = atph.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                atph atphVar = (atph) aihfVarCreateBuilder.instance;
                atphVar.b |= 2;
                atphVar.d = i - 1;
                ydu yduVar = this.a;
                yds ydsVar = yduVar.e;
                aijp aijpVarB = aikz.b(ydsVar.c.f().toEpochMilli());
                aihfVarCreateBuilder.copyOnWrite();
                atph atphVar2 = (atph) aihfVarCreateBuilder.instance;
                aijpVarB.getClass();
                atphVar2.c = aijpVarB;
                atphVar2.b |= 1;
                ydsVar.k.add((atph) aihfVarCreateBuilder.build());
                yduVar.g();
            }
        });
    }

    public final void i() {
        taf.g(this.b, new ixb(this, 19));
    }
}
