package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import internal.org.jni_zero.JniZero;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affs extends affh implements bnu, afgh {
    private static final affv l;
    public final aunr b;
    public final affq c;
    public final agev d;
    public final afgw e;
    public final afhk f;
    public final boolean g;
    public afhb h;
    public affp i;
    public final hhb j;
    private final afft m;
    private final afki n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final affr r;
    private ListenableFuture s;
    private boolean t;
    private final afgj u;
    private final axfd v;
    private final jij w;
    public static final aguu k = new aguu(null);
    public static final agrf a = agrf.h("AccountControllerImpl");

    static {
        aihf aihfVarCreateBuilder = affv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        affv affvVar = (affv) aihfVarCreateBuilder.instance;
        affvVar.b |= 1;
        affvVar.c = -1;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        l = (affv) aihnVarBuild;
    }

    public affs(aunr aunrVar, afft afftVar, affq affqVar, agev agevVar, afgw afgwVar, afki afkiVar, jij jijVar, afhk afhkVar, axfd axfdVar, afgj afgjVar, agev agevVar2, agev agevVar3) {
        aunrVar.getClass();
        afftVar.getClass();
        afgwVar.getClass();
        jijVar.getClass();
        afhkVar.getClass();
        axfdVar.getClass();
        afgjVar.getClass();
        agevVar2.getClass();
        this.b = aunrVar;
        this.m = afftVar;
        this.c = affqVar;
        this.d = agevVar;
        this.e = afgwVar;
        this.n = afkiVar;
        this.w = jijVar;
        this.f = afhkVar;
        this.v = axfdVar;
        this.u = afgjVar;
        this.j = new hhb(this);
        this.r = new affr(this);
        Boolean bool = Boolean.FALSE;
        this.o = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.p = ((Boolean) agevVar3.e(bool)).booleanValue();
        bool.booleanValue();
        final int i = 1;
        this.g = true;
        bool.booleanValue();
        this.q = true;
        bool.booleanValue();
        Object obj = afgwVar.b;
        if (obj != null && !awrc.c(obj, this)) {
            throw new IllegalStateException("Check failed.");
        }
        afgwVar.b = this;
        aunrVar.getLifecycle().b(new afxb(this));
        rb rbVar = new rb(this) { // from class: affi
            public final /* synthetic */ affs a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x00df  */
            @Override // defpackage.rb
            public final void a(Object obj2) {
                Object objPrevious;
                affx afgeVar = null;
                if (i != 0) {
                    ra raVar = (ra) obj2;
                    raVar.getClass();
                    Intent intent = raVar.b;
                    int i2 = raVar.a;
                    affs affsVar = this.a;
                    if (i2 == -1) {
                        intent.getClass();
                        affsVar.k(affd.a(intent.getIntExtra("new_account_id", -1)), false, 0);
                    } else {
                        afgw afgwVar2 = affsVar.e;
                        if (!afgwVar2.g()) {
                            afgeVar = intent != null ? affs.n(intent) : null;
                            if (afgeVar == null) {
                                afgeVar = new afge();
                            }
                            afgwVar2.e(afgeVar);
                        }
                        affsVar.h();
                    }
                    affsVar.i();
                    return;
                }
                ra raVar2 = (ra) obj2;
                raVar2.getClass();
                affs affsVar2 = this.a;
                int i3 = raVar2.a;
                Intent intent2 = raVar2.b;
                if (i3 == -1) {
                    intent2.getClass();
                    affsVar2.k(affd.a(intent2.getIntExtra("new_account_id", -1)), false, 0);
                } else {
                    if (intent2 == null) {
                        afgw afgwVar3 = affsVar2.e;
                        if (afgeVar == null) {
                            afgeVar = new afge();
                        }
                        afgwVar3.e(afgeVar);
                    } else if (intent2.getBooleanExtra("restart_account_selector", false)) {
                        affsVar2.g();
                        afhb afhbVar = affsVar2.h;
                        if (afhbVar == null) {
                            awrc.b("config");
                            afhbVar = null;
                        }
                        if (!afhbVar.b) {
                            throw new IllegalStateException("Activity not configured for account selection.");
                        }
                        afuu afuuVarC = afwt.c(101, "Switch Account Interactive");
                        try {
                            afhb afhbVar2 = affsVar2.h;
                            if (afhbVar2 == null) {
                                awrc.b("config");
                                afhbVar2 = null;
                            }
                            agke agkeVar = afhbVar2.c;
                            agkeVar.getClass();
                            agqs agqsVarListIterator = agkeVar.listIterator(((agpi) agkeVar).d);
                            do {
                                if (!agqsVarListIterator.hasPrevious()) {
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = agqsVarListIterator.previous();
                            } while (!afgo.class.isAssignableFrom((Class) objPrevious));
                            Class cls = (Class) objPrevious;
                            if (cls == null) {
                                throw new IllegalStateException("No interactive selector found.");
                            }
                            affsVar2.j(agke.q(cls), 0);
                            JniZero.l(afuuVarC, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                JniZero.l(afuuVarC, th);
                                throw th2;
                            }
                        }
                    } else {
                        afgeVar = affs.n(intent2);
                        afgw afgwVar4 = affsVar2.e;
                        if (afgeVar == null) {
                            afgeVar = new afge();
                        }
                        afgwVar4.e(afgeVar);
                    }
                    affsVar2.h();
                }
                affsVar2.i();
            }
        };
        final int i2 = 0;
        affqVar.d(rbVar, new rb(this) { // from class: affi
            public final /* synthetic */ affs a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x00df  */
            @Override // defpackage.rb
            public final void a(Object obj2) {
                Object objPrevious;
                affx afgeVar = null;
                if (i2 != 0) {
                    ra raVar = (ra) obj2;
                    raVar.getClass();
                    Intent intent = raVar.b;
                    int i3 = raVar.a;
                    affs affsVar = this.a;
                    if (i3 == -1) {
                        intent.getClass();
                        affsVar.k(affd.a(intent.getIntExtra("new_account_id", -1)), false, 0);
                    } else {
                        afgw afgwVar2 = affsVar.e;
                        if (!afgwVar2.g()) {
                            afgeVar = intent != null ? affs.n(intent) : null;
                            if (afgeVar == null) {
                                afgeVar = new afge();
                            }
                            afgwVar2.e(afgeVar);
                        }
                        affsVar.h();
                    }
                    affsVar.i();
                    return;
                }
                ra raVar2 = (ra) obj2;
                raVar2.getClass();
                affs affsVar2 = this.a;
                int i4 = raVar2.a;
                Intent intent2 = raVar2.b;
                if (i4 == -1) {
                    intent2.getClass();
                    affsVar2.k(affd.a(intent2.getIntExtra("new_account_id", -1)), false, 0);
                } else {
                    if (intent2 == null) {
                        afgw afgwVar4 = affsVar2.e;
                        if (afgeVar == null) {
                            afgeVar = new afge();
                        }
                        afgwVar4.e(afgeVar);
                    } else if (intent2.getBooleanExtra("restart_account_selector", false)) {
                        affsVar2.g();
                        afhb afhbVar = affsVar2.h;
                        if (afhbVar == null) {
                            awrc.b("config");
                            afhbVar = null;
                        }
                        if (!afhbVar.b) {
                            throw new IllegalStateException("Activity not configured for account selection.");
                        }
                        afuu afuuVarC = afwt.c(101, "Switch Account Interactive");
                        try {
                            afhb afhbVar2 = affsVar2.h;
                            if (afhbVar2 == null) {
                                awrc.b("config");
                                afhbVar2 = null;
                            }
                            agke agkeVar = afhbVar2.c;
                            agkeVar.getClass();
                            agqs agqsVarListIterator = agkeVar.listIterator(((agpi) agkeVar).d);
                            do {
                                if (!agqsVarListIterator.hasPrevious()) {
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = agqsVarListIterator.previous();
                            } while (!afgo.class.isAssignableFrom((Class) objPrevious));
                            Class cls = (Class) objPrevious;
                            if (cls == null) {
                                throw new IllegalStateException("No interactive selector found.");
                            }
                            affsVar2.j(agke.q(cls), 0);
                            JniZero.l(afuuVarC, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                JniZero.l(afuuVarC, th);
                                throw th2;
                            }
                        }
                    } else {
                        afgeVar = affs.n(intent2);
                        afgw afgwVar5 = affsVar2.e;
                        if (afgeVar == null) {
                            afgeVar = new afge();
                        }
                        afgwVar5.e(afgeVar);
                    }
                    affsVar2.h();
                }
                affsVar2.i();
            }
        });
    }

    public static final void m(affv affvVar) {
        if ((affvVar.b & 32) == 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (affvVar.h <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        int iBt = a.bt(affvVar.e);
        if (iBt == 0) {
            iBt = 1;
        }
        int i = iBt - 1;
        if (i == 1 || i == 2) {
            if ((affvVar.b & 2) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (affvVar.f.size() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            int i2 = affvVar.b;
            if ((i2 & 8) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (affvVar.i) {
                throw new IllegalStateException("Check failed.");
            }
            if ((i2 & 64) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            return;
        }
        if (i == 3) {
            if ((affvVar.b & 2) == 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (affvVar.f.size() != 0) {
                throw new IllegalStateException("Check failed.");
            }
            int i3 = affvVar.b;
            if ((i3 & 8) == 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (affvVar.i) {
                throw new IllegalStateException("Check failed.");
            }
            if ((i3 & 64) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            return;
        }
        if (i == 4) {
            if ((affvVar.b & 2) == 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (affvVar.f.size() != 0) {
                throw new IllegalStateException("Check failed.");
            }
            int i4 = affvVar.b;
            if ((i4 & 8) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (affvVar.i) {
                throw new IllegalStateException("Check failed.");
            }
            if ((i4 & 64) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            return;
        }
        if (i != 5) {
            throw new IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
        }
        if ((affvVar.b & 2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (affvVar.f.size() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i5 = affvVar.b;
        if ((i5 & 8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (!affvVar.i) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i5 & 64) == 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public static final affx n(Intent intent) {
        return (affx) atv.b(intent, "account_error", affx.class);
    }

    private final void q(agke agkeVar, ListenableFuture listenableFuture, int i) {
        boolean zIsDone = listenableFuture.isDone();
        afgw afgwVar = this.e;
        if (!zIsDone) {
            afgwVar.f();
            agfa agfaVar = new agfa(agkeVar);
            agdf agdfVar = agdf.a;
            p(2, null, agfaVar, agdfVar, false, agdfVar, listenableFuture, i);
            return;
        }
        afgwVar.c();
        agfa agfaVar2 = new agfa(agkeVar);
        agdf agdfVar2 = agdf.a;
        affv affvVarO = o(2, null, agfaVar2, agdfVar2, false, agdfVar2, i);
        try {
            hhb hhbVar = this.j;
            ProtoParsers$InternalDontUse protoParsers$InternalDontUse = new ProtoParsers$InternalDontUse(null, affvVarO);
            ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            Object objI = a.i(listenableFuture);
            objI.getClass();
            hhbVar.b(protoParsers$InternalDontUse, (affg) objI);
        } catch (ExecutionException e) {
            ExecutionException executionException = e;
            hhb hhbVar2 = this.j;
            ProtoParsers$InternalDontUse protoParsers$InternalDontUse2 = new ProtoParsers$InternalDontUse(null, affvVarO);
            Throwable cause = executionException.getCause();
            if (cause != null) {
                executionException = cause;
            }
            hhbVar2.a(protoParsers$InternalDontUse2, executionException);
        }
    }

    @Override // defpackage.affh
    public final affh a(afhb afhbVar) {
        g();
        if (this.h != null) {
            throw new IllegalStateException("Config can be set once, in the constructor only.");
        }
        this.h = afhbVar;
        return this;
    }

    @Override // defpackage.affh
    public final void b(agke agkeVar) {
        l(agkeVar, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.affh
    public final void c(afgr afgrVar) {
        g();
        jij jijVar = this.w;
        ?? r0 = jijVar.b;
        ((ArrayList) r0).add(afgrVar);
        Collections.shuffle(r0, (Random) jijVar.a);
    }

    public final ListenableFuture d(agke agkeVar, afff afffVar, boolean z) {
        affq affqVar = this.c;
        afgp afgpVar = new afgp(affqVar.a());
        if (!z) {
            affp affpVar = this.i;
            if (affpVar == null) {
                awrc.b("viewModel");
                affpVar = null;
            }
            affpVar.c = false;
        }
        axfd axfdVar = this.v;
        ListenableFuture listenableFutureI = axfdVar.i(afgpVar, agkeVar, afffVar);
        if (this.h == null) {
            awrc.b("config");
        }
        okv okvVar = new okv(axfdVar, affqVar.a(), listenableFutureI, 6);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), okvVar, 1);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        ahcq ahcqVar = new ahcq(listenableFutureI, ahdbVar);
        listenableFutureI.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.afgh
    public final ListenableFuture e() {
        affp affpVar = this.i;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        affpVar.c = true;
        affp affpVar2 = this.i;
        if (affpVar2 == null) {
            awrc.b("viewModel");
            affpVar2 = null;
        }
        if (!affpVar2.b) {
            affq affqVar = this.c;
            if (!affqVar.g() && !affqVar.f()) {
                return f(0);
            }
        }
        return ahng.n(null);
    }

    public final ListenableFuture f(int i) {
        ListenableFuture listenableFuture;
        affp affpVar = this.i;
        affp affpVar2 = null;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        if (!affpVar.c) {
            return aher.a;
        }
        affp affpVar3 = this.i;
        if (affpVar3 == null) {
            awrc.b("viewModel");
        } else {
            affpVar2 = affpVar3;
        }
        affpVar2.c = false;
        afuu afuuVarD = afwt.d(100, "Revalidate Account", afux.a, true);
        try {
            int iA = this.e.a();
            if (iA == -1) {
                listenableFuture = aher.a;
            } else {
                affd affdVarA = affd.a(iA);
                axfd axfdVar = this.v;
                if (this.h == null) {
                    awrc.b("config");
                }
                ListenableFuture listenableFutureK = axfdVar.k(affdVarA, this.c.a(), new afff());
                agdf agdfVar = agdf.a;
                afuuVarD.a(listenableFutureK);
                p(5, affdVarA, agdfVar, agdfVar, false, agdfVar, listenableFutureK, i);
                listenableFuture = listenableFutureK;
            }
            afuuVarD.close();
            return listenableFuture;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    afuuVarD.close();
                    throw th2;
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        if (this.o) {
            throw new IllegalStateException("Attempted to use the account controller when accounts are disabled");
        }
    }

    public final void h() {
        affp affpVar = this.i;
        affp affpVar2 = null;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        affpVar.b = false;
        if (this.e.g()) {
            return;
        }
        affp affpVar3 = this.i;
        if (affpVar3 == null) {
            awrc.b("viewModel");
        } else {
            affpVar2 = affpVar3;
        }
        affpVar2.c = false;
    }

    public final void i() {
        affp affpVar = this.i;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        if (affpVar.b) {
            return;
        }
        this.f.a();
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(agke agkeVar, int i) {
        if (agkeVar.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        agqs agqsVarListIterator = agkeVar.listIterator(0);
        agqsVarListIterator.getClass();
        while (agqsVarListIterator.hasNext()) {
            E next = agqsVarListIterator.next();
            next.getClass();
            Class cls = (Class) next;
            if (!afgo.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(a.bV(cls, "selector ", " is not an interactive selector"));
            }
        }
        ListenableFuture listenableFutureI = this.v.i(new afgp(this.c.a()), agkeVar, new afff());
        agev agevVarH = agev.h(agkeVar);
        agdf agdfVar = agdf.a;
        p(3, null, agevVarH, agdfVar, false, agdfVar, listenableFutureI, i);
    }

    public final void k(affd affdVar, boolean z, int i) {
        affd affdVar2;
        ListenableFuture listenableFutureK;
        afuu afuuVarC = afwt.c(102, "Switch Account");
        try {
            affp affpVar = this.i;
            if (affpVar == null) {
                awrc.b("viewModel");
                affpVar = null;
            }
            affpVar.c = false;
            axfd axfdVar = this.v;
            if (z) {
                if (this.h == null) {
                    awrc.b("config");
                }
                affdVar2 = affdVar;
                listenableFutureK = ahcs.f(((abhh) axfdVar.e).w(affdVar), afwl.d(new qmw(axfdVar, affdVar2, this.c.a(), new afff(), 17)), MoreExecutors.directExecutor());
            } else {
                affdVar2 = affdVar;
                if (this.h == null) {
                    awrc.b("config");
                }
                listenableFutureK = axfdVar.k(affdVar2, this.c.a(), new afff());
            }
            ListenableFuture listenableFuture = listenableFutureK;
            if (!listenableFuture.isDone()) {
                int i2 = affdVar2.a;
                afgw afgwVar = this.e;
                if (i2 != afgwVar.a()) {
                    afgwVar.f();
                }
            }
            agdf agdfVar = agdf.a;
            agev agevVarH = agev.h(Boolean.valueOf(z));
            afuuVarC.a(listenableFuture);
            p(4, affdVar2, agdfVar, agevVarH, false, agdfVar, listenableFuture, i);
            JniZero.l(afuuVarC, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afuuVarC, th);
                throw th2;
            }
        }
    }

    public final void l(agke agkeVar, int i) {
        if (agkeVar.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        afuu afuuVarC = afwt.c(103, "Switch Account With Custom Selectors");
        try {
            q(agkeVar, d(agkeVar, new afff(), false), i);
            JniZero.l(afuuVarC, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afuuVarC, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final affv o(int i, affd affdVar, agev agevVar, agev agevVar2, boolean z, agev agevVar3, int i2) {
        int i3;
        if (this.q) {
            qpj.c();
        }
        affp affpVar = this.i;
        affp affpVar2 = null;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        if (affpVar.a().c == Integer.MAX_VALUE) {
            i3 = 0;
        } else {
            affp affpVar3 = this.i;
            if (affpVar3 == null) {
                awrc.b("viewModel");
                affpVar3 = null;
            }
            i3 = affpVar3.a().c + 1;
        }
        aihf aihfVarCreateBuilder = affv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        affv affvVar = (affv) aihfVarCreateBuilder.instance;
        affvVar.b |= 1;
        affvVar.c = i3;
        if (affdVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            affv affvVar2 = (affv) aihfVarCreateBuilder.instance;
            affvVar2.b |= 2;
            affvVar2.d = affdVar.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        affv affvVar3 = (affv) aihfVarCreateBuilder.instance;
        affvVar3.e = i - 1;
        affvVar3.b |= 4;
        if (agevVar.g()) {
            agke agkeVar = (agke) agevVar.c();
            if (agkeVar.isEmpty()) {
                throw new IllegalStateException("Check failed.");
            }
            ArrayList arrayList = new ArrayList(agkeVar.size());
            agqs agqsVarListIterator = agkeVar.listIterator(0);
            agqsVarListIterator.getClass();
            while (agqsVarListIterator.hasNext()) {
                E next = agqsVarListIterator.next();
                next.getClass();
                String name = ((Class) next).getName();
                name.getClass();
                arrayList.add(name);
            }
            aihfVarCreateBuilder.copyOnWrite();
            affv affvVar4 = (affv) aihfVarCreateBuilder.instance;
            aiie aiieVar = affvVar4.f;
            if (!aiieVar.c()) {
                affvVar4.f = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(arrayList, affvVar4.f);
        }
        if (agevVar2.g()) {
            boolean zBooleanValue = ((Boolean) agevVar2.c()).booleanValue();
            aihfVarCreateBuilder.copyOnWrite();
            affv affvVar5 = (affv) aihfVarCreateBuilder.instance;
            affvVar5.b |= 8;
            affvVar5.g = zBooleanValue;
        }
        aihfVarCreateBuilder.copyOnWrite();
        affv affvVar6 = (affv) aihfVarCreateBuilder.instance;
        affvVar6.b |= 32;
        affvVar6.i = z;
        if (agevVar3.g()) {
            int iA = this.f.a.a((afhj) agevVar3.c());
            aihfVarCreateBuilder.copyOnWrite();
            affv affvVar7 = (affv) aihfVarCreateBuilder.instance;
            affvVar7.b |= 64;
            affvVar7.j = iA;
        }
        aihfVarCreateBuilder.copyOnWrite();
        affv affvVar8 = (affv) aihfVarCreateBuilder.instance;
        affvVar8.b |= 16;
        affvVar8.h = i2 + 1;
        affp affpVar4 = this.i;
        if (affpVar4 == null) {
            awrc.b("viewModel");
            affpVar4 = null;
        }
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        affpVar4.b((affv) aihnVarBuild);
        affp affpVar5 = this.i;
        if (affpVar5 == null) {
            awrc.b("viewModel");
            affpVar5 = null;
        }
        m(affpVar5.a());
        affp affpVar6 = this.i;
        if (affpVar6 == null) {
            awrc.b("viewModel");
        } else {
            affpVar2 = affpVar6;
        }
        return affpVar2.a();
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) throws IOException {
        String str;
        String strConcat;
        aunr aunrVar = this.b;
        afft afftVar = this.m;
        int iD = aunrVar.d();
        int i = afftVar.a;
        if (i == 0) {
            afftVar.a = iD;
        } else if (iD != i) {
            StringBuilder sb = new StringBuilder("Failed to use AccountController in ");
            sb.append(aunrVar);
            sb.append(". AccountController cannot be injected into both an Activity and a screen Fragment in the same hierarchy. Previously injected in ");
            if (i != 1) {
                str = i != 2 ? "FRAGMENT" : "FRAGMENT_HOST";
            } else {
                str = "ACTIVITY";
            }
            sb.append((Object) str);
            throw new IllegalStateException(sb.toString());
        }
        affp affpVar = (affp) new bpn(aunrVar).a(affp.class);
        this.i = affpVar;
        afhb afhbVar = null;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        affpVar.d.c = this.o;
        if (this.h == null) {
            this.h = afhb.a().a();
        }
        if (this.c.a().hasExtra("$tiktok$for_requirement_activity")) {
            if (this.h == null) {
                awrc.b("config");
            }
            axfd axfdVar = this.v;
            if (this.h == null) {
                awrc.b("config");
            }
            agke agkeVarJ = axfdVar.j();
            if (agkeVarJ.isEmpty()) {
                strConcat = "";
            } else {
                Objects.toString(agkeVarJ);
                strConcat = " Requirements: ".concat(String.valueOf(agkeVarJ));
            }
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(strConcat));
            if (!this.p) {
                throw illegalStateException;
            }
            ((agrc) ((agrc) a.b()).j(illegalStateException).k("com/google/apps/tiktok/account/api/controller/AccountControllerImpl", "onCreate", 212, "AccountControllerImpl.kt")).t("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
        }
        affp affpVar2 = this.i;
        if (affpVar2 == null) {
            awrc.b("viewModel");
            affpVar2 = null;
        }
        if (affpVar2.d.a()) {
            affp affpVar3 = this.i;
            if (affpVar3 == null) {
                awrc.b("viewModel");
                affpVar3 = null;
            }
            affpVar3.b(l);
            afuu afuuVarD = afwt.d(99, "AccountController getInitialAccount", afux.a, true);
            try {
                afff afffVar = new afff();
                if (this.h == null) {
                    awrc.b("config");
                }
                afhb afhbVar2 = this.h;
                if (afhbVar2 == null) {
                    awrc.b("config");
                } else {
                    afhbVar = afhbVar2;
                }
                agke agkeVar = afhbVar.c;
                agkeVar.getClass();
                ListenableFuture listenableFutureD = d(agkeVar, afffVar, false);
                afuuVarD.a(listenableFutureD);
                afuuVarD.close();
                this.s = listenableFutureD;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        afuuVarD.close();
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                    }
                    throw th2;
                }
            }
        }
        this.n.b(this.r);
        afgj afgjVar = this.u;
        qpj.c();
        List list = afgjVar.d;
        synchronized (list) {
            list.add(this);
        }
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        qpj.c();
        List list = this.u.d;
        synchronized (list) {
            list.remove(this);
        }
        affp affpVar = this.i;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        affo affoVar = affpVar.d;
        affoVar.b = agev.h(Boolean.valueOf(affoVar.c));
        affoVar.a = null;
        affoVar.d = 3;
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        i();
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        if (this.t) {
            i();
            return;
        }
        this.t = true;
        affp affpVar = this.i;
        affp affpVar2 = null;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        boolean zA = affpVar.d.a();
        afgw afgwVar = this.e;
        if (!zA) {
            afgwVar.d();
            afhg afhgVar = afgwVar.b().a;
            if (afhgVar instanceof afhe) {
                jij jijVar = afgwVar.d;
                afhe afheVar = (afhe) afhgVar;
                affd.a(afheVar.a);
                jijVar.P(afheVar.b);
            }
            i();
        } else {
            if (afgwVar.g()) {
                throw new IllegalArgumentException("Should not have account before initial start.");
            }
            if (this.s == null) {
                throw new IllegalStateException("Should have had initial account fetch.");
            }
            affp affpVar3 = this.i;
            if (affpVar3 == null) {
                awrc.b("viewModel");
                affpVar3 = null;
            }
            if (affpVar3.a() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            affp affpVar4 = this.i;
            if (affpVar4 == null) {
                awrc.b("viewModel");
                affpVar4 = null;
            }
            if (awrc.c(affpVar4.a(), l)) {
                afhb afhbVar = this.h;
                if (afhbVar == null) {
                    awrc.b("config");
                    afhbVar = null;
                }
                agke agkeVar = afhbVar.c;
                agkeVar.getClass();
                ListenableFuture listenableFuture = this.s;
                listenableFuture.getClass();
                q(agkeVar, listenableFuture, 0);
            }
            this.s = null;
        }
        affp affpVar5 = this.i;
        if (affpVar5 == null) {
            awrc.b("viewModel");
            affpVar5 = null;
        }
        if (affpVar5.d.b.g()) {
            affp affpVar6 = this.i;
            if (affpVar6 == null) {
                awrc.b("viewModel");
            } else {
                affpVar2 = affpVar6;
            }
            if (((Boolean) affpVar2.d.b.c()).booleanValue() || !this.o) {
                return;
            }
            this.e.c();
        }
    }

    public final void p(int i, affd affdVar, agev agevVar, agev agevVar2, boolean z, agev agevVar3, ListenableFuture listenableFuture, int i2) {
        affv affvVarO = o(i, affdVar, agevVar, agevVar2, z, agevVar3, i2);
        affp affpVar = this.i;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        affpVar.b = true;
        try {
            this.n.e(new ahub(listenableFuture), new ahub(new ProtoParsers$InternalDontUse(null, affvVarO)), this.r);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
