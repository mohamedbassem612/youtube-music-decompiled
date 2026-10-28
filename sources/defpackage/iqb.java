package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iqb implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iqb(Context context, int i) {
        this.$cid = i;
        this.a = context;
        this.b = "account";
        this.c = "account.pb";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v11, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v66, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, mzg] */
    /* JADX WARN: Type inference failed for: r13v52, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, tns] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 0;
        int i2 = 3;
        int i3 = 1;
        int i4 = 8;
        int i5 = 16;
        switch (this.$cid) {
            case 0:
                ?? r0 = this.a;
                ahno.R(r0.isDone(), "Future was expected to be done: %s", r0);
                boolean zBooleanValue = ((Boolean) a.i(r0)).booleanValue();
                ?? r1 = this.b;
                ahno.R(r1.isDone(), "Future was expected to be done: %s", r1);
                Integer num = (Integer) a.i(r1);
                aihf aihfVarCreateBuilder = ajev.a.createBuilder();
                aihf aihfVar = (aihf) this.c;
                aihfVar.copyOnWrite();
                ajeu ajeuVar = (ajeu) aihfVar.instance;
                ajeu ajeuVar2 = ajeu.a;
                ajeuVar.b |= SemanticState.LiveRegion;
                ajeuVar.i = zBooleanValue;
                int iIntValue = num.intValue();
                aihfVar.copyOnWrite();
                ajeu ajeuVar3 = (ajeu) aihfVar.instance;
                ajeuVar3.b |= SemanticState.ReadOnly;
                ajeuVar3.j = iIntValue;
                aihfVarCreateBuilder.copyOnWrite();
                ajev ajevVar = (ajev) aihfVarCreateBuilder.instance;
                ajeu ajeuVar4 = (ajeu) aihfVar.build();
                ajeuVar4.getClass();
                ajevVar.c = ajeuVar4;
                ajevVar.b |= 8;
                return aihfVarCreateBuilder;
            case 1:
                WorkDatabase workDatabase = ((eam) this.a).e;
                String str = (String) this.b;
                ((ArrayList) this.c).addAll(workDatabase.D().a(str));
                return workDatabase.C().c(str);
            case 2:
                return ((abvn) this.b.io()).P().V((avmb) this.c).al(new jnb(this.a, i5), new ihp(i5));
            case 3:
                return ((abvn) this.b.io()).F().x(new jna(i2)).V((avmb) this.c).al(new jnb(this.a, 15), new ihp(i5));
            case 4:
                return ((hfn) this.b.io()).y().H(new igz(i2)).p().V((avmb) this.c).al(new jnb(this.a, 17), new ihp(i5));
            case 5:
                return ((hfn) this.a).y().p().L((avmb) this.c).al(new joc(this.b, i4), new jop(i3));
            case 6:
                return omj.y(this.a, this.c, (nsl) this.b);
            case 7:
                Pattern pattern = qpr.a;
                Context context = (Context) this.a;
                qpq qpqVar = new qpq(context);
                qpqVar.c((String) this.b);
                qpqVar.d((String) this.c);
                List<String> pathSegments = qpqVar.a().getPathSegments();
                return new File(context.getFilesDir(), new ager("/").b(pathSegments.subList(1, pathSegments.size())));
            case 8:
                ?? r2 = this.c;
                ?? r3 = this.b;
                rrq rrqVar = (rrq) this.a;
                aihf aihfVarA = rrqVar.a(r3, r2);
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                ajfh ajfhVar = (ajfh) aihfVarA.build();
                ajfhVar.getClass();
                alouVar.d = ajfhVar;
                alouVar.c = 431;
                return Boolean.valueOf(((xeu) rrqVar.c).b((alou) alosVar.build()));
            case 9:
                return ((avlr) this.b).U(((wdf) this.a).g((String) this.c).r(new vup(20)).h(agdf.a).z());
            case 10:
                byte[] bytes = ((String) this.b.io()).getBytes(StandardCharsets.UTF_8);
                int iIntValue2 = ((Integer) this.c.io()).intValue();
                Object obj = this.a;
                zfo zfoVar = (zfo) obj;
                zfr zfrVar = (zfr) zfoVar.a.io();
                mbc mbcVar = zfoVar.e;
                apbm apbmVarAa = zfoVar.c.aa();
                long epochMilli = mbcVar.f().toEpochMilli();
                zfp zfpVarA = zfrVar.a(bytes, iIntValue2, apbmVarAa, zfoVar.d);
                long epochMilli2 = mbcVar.f().toEpochMilli();
                if (zfpVarA != null && !zfpVarA.a() && zfoVar.i.compareAndSet(false, true)) {
                    zfoVar.b.execute(afwl.i(new zfl(obj, epochMilli, epochMilli2, 3)));
                }
                return zfpVarA;
            case 11:
                Object objI = a.i(this.b);
                Boolean bool = Boolean.TRUE;
                boolean zEquals = Objects.equals(objI, bool);
                ?? r4 = this.a;
                if (!zEquals && !Objects.equals(a.i(this.c), bool)) {
                    return null;
                }
                try {
                    for (String str2 : r4.v()) {
                    }
                    return null;
                } catch (tmg e) {
                    ((agrc) ((agrc) ((agrc) zyc.b.b()).j(e)).k("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger", "onStartRequest", 'D', "LogcatNetworkLogger.java")).t("Auth failure.");
                    return null;
                }
            default:
                avso avsoVar = new avso(((avlh) this.c.io()).p().H(new xee(i4)).p(), new zze(this.a, this.b, i));
                avnn avnnVar = atqp.j;
                return avsoVar;
        }
    }

    public /* synthetic */ iqb(awmd awmdVar, vxz vxzVar, avmb avmbVar, int i) {
        this.$cid = i;
        this.c = awmdVar;
        this.a = vxzVar;
        this.b = avmbVar;
    }

    public /* synthetic */ iqb(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, tns tnsVar, int i) {
        this.$cid = i;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.a = tnsVar;
    }

    public /* synthetic */ iqb(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ iqb(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ iqb(jon jonVar, hfn hfnVar, avmb avmbVar, int i) {
        this.$cid = i;
        this.b = jonVar;
        this.a = hfnVar;
        this.c = avmbVar;
    }
}
