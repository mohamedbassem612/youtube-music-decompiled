package defpackage;

import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujl extends ujg implements uhn, urc, uvw {
    public final Executor b;

    public ujl(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.uvw
    public final void A(augy augyVar) {
        d(new usf(augyVar, 4));
    }

    @Override // defpackage.uhn
    public final void a(CreationButtonView creationButtonView) {
        d(new tsd(creationButtonView, 7));
    }

    @Override // defpackage.uhn
    public final void b(final CreationButtonView creationButtonView, final boolean z) {
        d(new Consumer() { // from class: uhm
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                ((uhn) obj).b(creationButtonView, z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.uhn
    public final void c(CreationButtonView creationButtonView) {
        d(new tsd(creationButtonView, 8));
    }

    @Override // defpackage.ujg
    protected final void d(final Consumer consumer) {
        Set set = this.a;
        if (set.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(set, new Consumer() { // from class: ujk
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(final Object obj) {
                final Consumer consumer2 = consumer;
                this.a.b.execute(afwl.i(new Runnable() { // from class: ujj
                    @Override // java.lang.Runnable
                    public final void run() {
                        consumer2.r(obj);
                    }
                }));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        });
    }

    @Override // defpackage.urc
    public final void j(final Optional optional, final Optional optional2, final Optional optional3, final boolean z) {
        d(new Consumer() { // from class: uqz
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                ((urc) obj).j(optional, optional2, optional3, z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.urc
    public final void k(auaj auajVar) {
        d(new tsd(auajVar, 20));
    }

    @Override // defpackage.urc
    public final void l(auan auanVar) {
        d(new tsd(auanVar, 19));
    }

    @Override // defpackage.urc
    public final void m(final long j, final boolean z, final boolean z2) {
        d(new Consumer() { // from class: ura
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                ((urc) obj).m(j, z, z2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.urc
    public final void n(final long j, final Optional optional) {
        d(new Consumer() { // from class: urb
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                ((urc) obj).n(j, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.urc
    public final void o(final long j, final Duration duration, final Duration duration2) {
        d(new Consumer() { // from class: uqy
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                ((urc) obj).o(j, duration, duration2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.urc
    public final void p(augy augyVar, Optional optional, Optional optional2, Optional optional3) {
        d(new hnw(augyVar, optional, optional2, optional3, 4));
    }

    @Override // defpackage.urc
    public final void q() {
        d(new ulo(5));
    }

    @Override // defpackage.urc
    public final void r(boolean z) {
        d(new uvu(z, 1));
    }

    @Override // defpackage.urc
    public final void s(int i) {
        d(new ulc(i, 4));
    }

    @Override // defpackage.uvw
    public final void t(uxi uxiVar) {
        d(new usf(uxiVar, 7));
    }

    @Override // defpackage.uvw
    public final void u(auaj auajVar) {
        d(new usf(auajVar, 3));
    }

    @Override // defpackage.uvw
    public final void v(auan auanVar) {
        d(new usf(auanVar, 5));
    }

    @Override // defpackage.uvw
    public final void w(uxi uxiVar) {
        d(new usf(uxiVar, 6));
    }

    @Override // defpackage.uvw
    public final void x() {
        d(new ulo(6));
    }

    @Override // defpackage.uvw
    public final void y(boolean z) {
        d(new uvu(z, 0));
    }

    @Override // defpackage.uvw
    public final void z(final boolean z, final boolean z2) {
        d(new Consumer() { // from class: uvt
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                ((uvw) obj).z(z, z2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
