package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xnp {
    public static final /* synthetic */ int h = 0;
    private static final agrf i = agrf.h("com/google/android/libraries/youtube/mdx/devicemanagement/MdxDeviceStore");
    private static final long j;
    public final mbc a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;
    public final boolean f;
    public final qrx g;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        j = 2678400000L;
    }

    public xnp(qrx qrxVar, mbc mbcVar, xla xlaVar) {
        this.g = qrxVar;
        this.a = mbcVar;
        this.b = xlaVar.A() > 0 ? xlaVar.A() : j;
        this.c = xlaVar.N() > 0 ? TimeUnit.HOURS.toMillis(xlaVar.N()) : 0L;
        this.d = Math.max(xlaVar.O(), 0L);
        this.e = Math.max(xlaVar.t(), 0.0d);
        this.f = xlaVar.ac();
        ListenableFuture listenableFutureA = qrxVar.a(new wvk(4), MoreExecutors.directExecutor());
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(taf.c, null, new hmb(11));
        long j2 = afwl.a;
        listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    public final void d(final xvr xvrVar) {
        taf.h(this.g.a(new agek() { // from class: xno
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                atpa atpaVar = (atpa) obj;
                xvr xvrVar2 = xvrVar;
                String str = xvrVar2.d().b;
                atoy atoyVar = atoy.a;
                atoy atoyVar2 = (atoy) atpaVar.b.get(str);
                if (atoyVar2 != null) {
                    atoyVar = atoyVar2;
                }
                aihf builder = atoyVar.toBuilder();
                builder.copyOnWrite();
                atoy atoyVar3 = (atoy) builder.instance;
                atoyVar3.b |= 1;
                atoyVar3.c = str;
                atoz atozVar = atoyVar3.d;
                if (atozVar == null) {
                    atozVar = atoz.a;
                }
                xnp xnpVar = this.a;
                aihf builder2 = atozVar.toBuilder();
                String strC = xvrVar2.c();
                builder2.copyOnWrite();
                atoz atozVar2 = (atoz) builder2.instance;
                strC.getClass();
                atozVar2.b |= 8;
                atozVar2.f = strC;
                mbc mbcVar = xnpVar.a;
                long epochMilli = mbcVar.f().toEpochMilli();
                builder2.copyOnWrite();
                atoz atozVar3 = (atoz) builder2.instance;
                atozVar3.b |= 32;
                atozVar3.h = epochMilli;
                if (xvrVar2 instanceof xvj) {
                    builder2.copyOnWrite();
                    atoz atozVar4 = (atoz) builder2.instance;
                    atozVar4.g = 1;
                    atozVar4.b |= 16;
                    CastDevice castDevice = ((xvj) xvrVar2).a;
                    builder2.copyOnWrite();
                    atoz atozVar5 = (atoz) builder2.instance;
                    atozVar5.b |= 2;
                    atozVar5.d = castDevice.e;
                } else if (xvrVar2 instanceof xvn) {
                    xvn xvnVar = (xvn) xvrVar2;
                    builder2.copyOnWrite();
                    atoz atozVar6 = (atoz) builder2.instance;
                    atozVar6.g = 2;
                    atozVar6.b |= 16;
                    String str2 = xvnVar.c;
                    builder2.copyOnWrite();
                    atoz atozVar7 = (atoz) builder2.instance;
                    str2.getClass();
                    atozVar7.b |= 4;
                    atozVar7.e = str2;
                    String str3 = xvnVar.f;
                    builder2.copyOnWrite();
                    atoz atozVar8 = (atoz) builder2.instance;
                    str3.getClass();
                    atozVar8.b |= 2;
                    atozVar8.d = str3;
                    String str4 = xvnVar.e;
                    builder2.copyOnWrite();
                    atoz atozVar9 = (atoz) builder2.instance;
                    str4.getClass();
                    atozVar9.b |= 1;
                    atozVar9.c = str4;
                    Map mapO = xvnVar.o();
                    if (mapO != null) {
                        String str5 = (String) mapO.get("brand");
                        if (!TextUtils.isEmpty(str5)) {
                            builder2.copyOnWrite();
                            atoz atozVar10 = (atoz) builder2.instance;
                            str5.getClass();
                            atozVar10.b |= SemanticState.Focused;
                            atozVar10.j = str5;
                        }
                        String str6 = (String) mapO.get("model");
                        if (!TextUtils.isEmpty(str6)) {
                            builder2.copyOnWrite();
                            atoz atozVar11 = (atoz) builder2.instance;
                            str6.getClass();
                            atozVar11.b |= SemanticState.Hidden;
                            atozVar11.k = str6;
                        }
                    }
                    if (xvnVar.s()) {
                        atpc atpcVar = ((atoz) builder2.instance).i;
                        if (atpcVar == null) {
                            atpcVar = atpc.a;
                        }
                        String str7 = xvnVar.d;
                        aihf builder3 = atpcVar.toBuilder();
                        builder3.copyOnWrite();
                        atpc atpcVar2 = (atpc) builder3.instance;
                        str7.getClass();
                        atpcVar2.b |= 1;
                        atpcVar2.c = str7;
                        String str8 = xvnVar.i;
                        builder3.copyOnWrite();
                        atpc atpcVar3 = (atpc) builder3.instance;
                        str8.getClass();
                        atpcVar3.b |= 2;
                        atpcVar3.d = str8;
                        long j2 = xvnVar.j;
                        builder3.copyOnWrite();
                        atpc atpcVar4 = (atpc) builder3.instance;
                        atpcVar4.b |= 4;
                        atpcVar4.e = j2;
                        long epochMilli2 = mbcVar.f().toEpochMilli();
                        builder3.copyOnWrite();
                        atpc atpcVar5 = (atpc) builder3.instance;
                        atpcVar5.b |= 8;
                        atpcVar5.f = epochMilli2;
                        builder2.copyOnWrite();
                        atoz atozVar12 = (atoz) builder2.instance;
                        atpc atpcVar6 = (atpc) builder3.build();
                        atpcVar6.getClass();
                        atozVar12.i = atpcVar6;
                        atozVar12.b |= 64;
                    } else {
                        builder2.copyOnWrite();
                        atoz atozVar13 = (atoz) builder2.instance;
                        atozVar13.i = null;
                        atozVar13.b &= -65;
                    }
                }
                builder.copyOnWrite();
                atoy atoyVar4 = (atoy) builder.instance;
                atoz atozVar14 = (atoz) builder2.build();
                atozVar14.getClass();
                atoyVar4.d = atozVar14;
                atoyVar4.b |= 2;
                aihf builder4 = atpaVar.toBuilder();
                builder4.cI(str, (atoy) builder.build());
                return (atpa) builder4.build();
            }
        }, MoreExecutors.directExecutor()), MoreExecutors.directExecutor(), new tsq(15));
    }
}
