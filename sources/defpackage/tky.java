package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tky implements tgm {
    private final awmd a;
    private final Optional b;
    private final Optional c;
    private final mbc d;
    private final awmd e;
    private final awmd f;
    private final ajcb g;
    private final tao h;
    private final tqj i;
    private final ScheduledExecutorService j;
    private final tfx k;
    private final Executor l;
    private final long m;
    private final boolean n;
    private final tli o;
    private final tli p;
    private final awmd q;
    private final tgv r;
    private final vxz s;
    private final vwt t;
    private final hhb u;

    public tky(mbc mbcVar, awmd awmdVar, awmd awmdVar2, ajcb ajcbVar, tao taoVar, tqj tqjVar, ScheduledExecutorService scheduledExecutorService, tfx tfxVar, Executor executor, awmd awmdVar3, tgv tgvVar, hhb hhbVar, awmd awmdVar4, Optional optional, Optional optional2, vxz vxzVar) {
        b(ajcbVar);
        this.a = awmdVar4;
        this.b = optional;
        this.c = optional2;
        this.d = mbcVar;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.g = ajcbVar;
        this.h = taoVar;
        this.i = tqjVar;
        this.j = scheduledExecutorService;
        this.k = tfxVar;
        this.l = executor;
        int i = tqr.a;
        long jA = tqjVar.a(1075321409);
        this.m = jA <= 0 ? 5000L : jA;
        this.n = tqjVar.k(1073814080);
        this.r = tgvVar;
        this.q = awmdVar3;
        this.s = vxzVar;
        this.t = new vwt((short[]) null);
        this.o = new tkx(ajcbVar);
        this.p = new tkx(ajcbVar);
        this.u = hhbVar;
    }

    public static void b(ajcb ajcbVar) {
        ajcbVar.getClass();
        int i = ajcbVar.h;
        if (i < 0) {
            throw new IllegalArgumentException("normalCoreSize < 0");
        }
        int i2 = ajcbVar.i;
        if (i2 <= 0) {
            throw new IllegalArgumentException("normalMaxSize <= 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("normalMaxSize < normalCoreSize");
        }
        int i3 = ajcbVar.f;
        if (i3 < 0) {
            throw new IllegalArgumentException("priorityCoreSize < 0");
        }
        int i4 = ajcbVar.g;
        if (i4 <= 0) {
            throw new IllegalArgumentException("priorityMaxSize <= 0");
        }
        if (i4 < i3) {
            throw new IllegalArgumentException("priorityMaxSize < priorityCoreSize");
        }
        if (ajcbVar.e < 0) {
            throw new IllegalArgumentException("keepAliveTime < 0");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [aunn] */
    /* JADX WARN: Type inference failed for: r2v26 */
    @Override // defpackage.tgm
    public final tgg a(tgi tgiVar) {
        ?? r2;
        Optional.empty();
        Optional.empty();
        Optional.empty();
        mbc mbcVar = this.d;
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        if (mbcVar == null) {
            throw new NullPointerException("Null clock");
        }
        awmd awmdVar = this.e;
        if (awmdVar == null) {
            throw new NullPointerException("Null cronetEngineProvider");
        }
        awmd awmdVar2 = this.f;
        if (awmdVar2 == null) {
            throw new NullPointerException("Null headerDecoratorProvider");
        }
        ajcb ajcbVar = this.g;
        if (ajcbVar == null) {
            throw new NullPointerException("Null androidCrolleyConfig");
        }
        tao taoVar = this.h;
        if (taoVar == null) {
            throw new NullPointerException("Null commonConfigs");
        }
        tqj tqjVar = this.i;
        if (tqjVar == null) {
            throw new NullPointerException("Null bootstrapStore");
        }
        ScheduledExecutorService scheduledExecutorService = this.j;
        if (scheduledExecutorService == null) {
            throw new NullPointerException("Null timeoutExecutor");
        }
        tfx tfxVar = this.k;
        Executor executor = this.l;
        long j = this.m;
        boolean z = this.n;
        tli tliVar = this.o;
        tli tliVar2 = this.p;
        awmd awmdVar3 = this.q;
        if (awmdVar3 == null) {
            throw new NullPointerException("Null requestCompletionListenerProvider");
        }
        tgv tgvVar = this.r;
        vwt vwtVar = this.t;
        tmo tmoVar = tgiVar.a;
        if (tmoVar == null) {
            throw new NullPointerException("Null cache");
        }
        Optional optional = tgiVar.b;
        if (optional == null) {
            throw new NullPointerException("Null cacheEventLogger");
        }
        tgl tglVar = tgiVar.c;
        if (tglVar == null) {
            throw new NullPointerException("Null volleyNetworkConfig");
        }
        int i = tgiVar.i;
        String str = tgiVar.j;
        if (str == null) {
            throw new NullPointerException("Null threadPoolTag");
        }
        Optional optional2 = tgiVar.d;
        if (optional2 == null) {
            throw new NullPointerException("Null priorityExecutorOverride");
        }
        Optional optional3 = tgiVar.f;
        if (optional3 == null) {
            throw new NullPointerException("Null normalExecutorOverride");
        }
        Executor executor2 = tgiVar.h;
        if (executor2 == null) {
            throw new NullPointerException("Null deliveryExecutor");
        }
        vxz vxzVar = this.s;
        if (vxzVar == null) {
            throw new NullPointerException("Null mobileFrameworksFlags");
        }
        if (!tgiVar.k) {
            hhb hhbVar = this.u;
            tlj tljVarBk = taq.bk(awmdVar, awmdVar2, taoVar, mbcVar, ajcbVar, scheduledExecutorService, tfxVar, executor, tglVar, tmoVar, optional, i, str, j, z, executor2, tliVar, tliVar2, optional3, optional2, optionalEmpty, optionalEmpty2, awmdVar3, tgvVar, tqjVar, vwtVar, (byte) 7, vxzVar);
            ght ghtVar = ((ghs) hhbVar.a).a;
            return new tku(tljVarBk, new ayq((tqj) ghtVar.q.io(), ghtVar.rf, ghtVar.Q), new ayq((tqj) ghtVar.q.io(), ghtVar.rf, ghtVar.Q));
        }
        Optional optional4 = tgiVar.g;
        tlj tljVarBk2 = taq.bk(awmdVar, awmdVar2, taoVar, mbcVar, ajcbVar, scheduledExecutorService, tfxVar, executor, tglVar, tmoVar, optional, i, str, j, z, executor2, tliVar, tliVar2, optional3, optional2, Optional.of(optional4.get()), Optional.of((awut) tgiVar.e.orElse(optional4.get())), awmdVar3, tgvVar, tqjVar, vwtVar, (byte) 7, vxzVar);
        tjl tjlVar = (tjl) this.a.io();
        int i2 = tqr.a;
        if (tqjVar.k(1073828808)) {
            r2 = 0;
        } else {
            Optional optional5 = this.b;
            optional5.isPresent();
            r2 = optional5.get();
        }
        return new tir(tljVarBk2, tjlVar, r2, (awmd) this.c.orElse(null));
    }
}
