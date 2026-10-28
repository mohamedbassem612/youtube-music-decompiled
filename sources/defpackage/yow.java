package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yow extends zir {
    public final agfr b;
    public byi c;
    public byw d;
    public final Map e;
    public final ywn f;
    private final wiu g;
    private final zjr h;
    private final zha i;
    private final mbc j;
    private final ExecutorService k;
    private Exception l;
    private Uri m;
    private String n;
    private Future o;
    private final tfq p;
    private final auzc q;

    public yow(agfr agfrVar, byw bywVar, tfq tfqVar, wiu wiuVar, zjr zjrVar, zha zhaVar, mbc mbcVar, ExecutorService executorService, ywn ywnVar) {
        super(bywVar);
        Optional.empty();
        this.b = agfrVar;
        this.p = tfqVar;
        this.g = wiuVar;
        this.h = zjrVar;
        this.i = zhaVar;
        this.j = mbcVar;
        this.k = executorService;
        this.q = new auzc((byte[]) null);
        this.f = ywnVar;
        this.e = DesugarCollections.synchronizedMap(new HashMap());
    }

    private final long h(long j) {
        auzc auzcVar = this.q;
        if (auzcVar.a != 1) {
            return 0L;
        }
        int i = auzcVar.d(0).d;
        zjr zjrVar = this.h;
        double d = zjrVar.R().m;
        double d2 = zjrVar.R().k;
        double d3 = i;
        if (d <= 0.0d) {
            d = 1.0d;
        }
        double dPow = d2 * Math.pow(d, d3);
        zhq zhqVar = zhq.ABR;
        return j + ((long) dPow);
    }

    private final void i(byt bytVar) {
        if (this.p.h()) {
            if (this.h.R().t && bytVar.getCause() != null && (bytVar.getCause() instanceof InterruptedIOException)) {
                return;
            }
            if ((bytVar instanceof zhm) && ((zhm) bytVar).e == 204) {
                return;
            }
            if ((bytVar instanceof zhn) && "x-segment-lmt".equals(((zhn) bytVar).e)) {
                return;
            }
            boolean zD = yno.d(bytVar);
            auzc auzcVar = this.q;
            if (zD) {
                auzcVar.d(auzcVar.a).b++;
            } else {
                auzcVar.d(auzcVar.a).a++;
            }
            if (this.q.a == 0) {
                this.l = bytVar;
            }
            zhq zhqVar = zhq.ABR;
        }
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byt {
        try {
            int iA = super.a(bArr, i, i2);
            g(this.j.f().toEpochMilli());
            return iA;
        } catch (byt e) {
            i(e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x019d  */
    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final long b(byi byiVar) throws byt {
        Optional optionalOf;
        Uri uriBuild = byiVar.a;
        zkf.d(uriBuild);
        wiu wiuVar = this.g;
        boolean zAX = wiuVar.aX();
        Uri uri = this.m;
        if (!(zAX ? yno.f(uriBuild, uri) : uriBuild.equals(uri))) {
            Exception exc = this.l;
            if (exc == null || !yno.d(exc)) {
                this.l = null;
                Arrays.fill((Object[]) this.q.b, 0, 3, (Object) null);
            }
            this.m = uriBuild;
        }
        this.c = byiVar;
        zjr zjrVar = this.h;
        String strJ = zjrVar.m.j(0, 45354792L);
        Optional optionalEmpty = TextUtils.isEmpty(strJ) ? Optional.empty() : Optional.of(strJ);
        if (yno.g(uriBuild)) {
            String queryParameter = uriBuild.getQueryParameter("fvip");
            String strE = yno.e(uriBuild);
            zkf.d(queryParameter);
            zkf.d(strE);
            optionalOf = optionalEmpty.isPresent() ? Optional.of(((String) optionalEmpty.get()).replace("{fvip}", queryParameter).replace("{mn}", strE).concat(".googlevideo.com")) : Optional.of(String.format("r%s---%s%s", queryParameter, strE, ".googlevideo.com"));
        } else {
            optionalOf = Optional.empty();
        }
        if (optionalOf.isPresent()) {
            auzc auzcVar = this.q;
            yov yovVarD = auzcVar.d(0);
            yov yovVarD2 = auzcVar.d(1);
            if (zjrVar.aQ() && ((yovVarD.a >= zjrVar.R().j || yovVarD.b >= zjrVar.R().l) && yovVarD2.a + yovVarD2.b <= yovVarD.a + yovVarD.b)) {
                Uri.Builder builderAuthority = uriBuild.buildUpon().authority((String) optionalOf.get());
                builderAuthority.appendQueryParameter("fallback_count", "1");
                byiVar = byiVar.c(builderAuthority.build());
                auzcVar.a = 1;
                if (auzcVar.d(0).c == 0) {
                    auzcVar.d(0).c = h(this.j.f().toEpochMilli());
                }
            } else if (zjrVar.R().o || !yno.g(uriBuild)) {
                auzc auzcVar2 = this.q;
                yov yovVarD3 = auzcVar2.d(0);
                yov yovVarD4 = auzcVar2.d(2);
                if (wiuVar.af() || yovVarD3.a + yovVarD3.b <= wiuVar.r() || yovVarD4.a + yovVarD4.b != 0) {
                    this.q.a = 0;
                } else {
                    String authority = uriBuild.getAuthority();
                    Uri.Builder builderAuthority2 = uriBuild.buildUpon().authority("redirector.googlevideo.com");
                    zkf.d(authority);
                    if (authority.endsWith("a1.googlevideo.com")) {
                        uriBuild = builderAuthority2.appendQueryParameter("cmo", "pf=1").appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
                    } else if (authority.endsWith(".googlevideo.com")) {
                        uriBuild = builderAuthority2.appendQueryParameter("cmo", "pf=1").build();
                    } else if (authority.endsWith("c.youtube.com")) {
                        uriBuild = builderAuthority2.appendQueryParameter("cmo", "td=c.youtube.com").build();
                    }
                    byiVar = byiVar.c(uriBuild);
                    auzcVar2.a = 2;
                }
            } else {
                this.q.a = 0;
            }
        } else if (zjrVar.R().o) {
            auzc auzcVar3 = this.q;
            yov yovVarD5 = auzcVar3.d(0);
            yov yovVarD6 = auzcVar3.d(2);
            if (wiuVar.af()) {
                this.q.a = 0;
            } else {
                this.q.a = 0;
            }
        } else {
            auzc auzcVar4 = this.q;
            yov yovVarD7 = auzcVar4.d(0);
            yov yovVarD8 = auzcVar4.d(2);
            if (wiuVar.af()) {
                this.q.a = 0;
            } else {
                this.q.a = 0;
            }
        }
        try {
            zhq zhqVar = zhq.ABR;
            long jB = super.b(byiVar);
            this.i.m(super.k(), super.d());
            g(this.j.f().toEpochMilli());
            if (yno.aA(wiuVar, byiVar, this.n)) {
                this.f.w("ppp", "bif");
                this.n = byiVar.a.getQueryParameter("cpn");
            }
            return jB;
        } catch (byt e) {
            i(e);
            throw e;
        }
    }

    final void g(long j) {
        auzc auzcVar = this.q;
        auzcVar.d(auzcVar.a).a();
        if (this.h.R().k <= 0 || auzcVar.a != 1) {
            return;
        }
        if (this.o == null && auzcVar.d(0).c != 0 && j > auzcVar.d(0).c) {
            zkf.d(this.c);
            this.o = this.k.submit(new wko(this, 12));
            return;
        }
        Future future = this.o;
        if (future == null || !future.isDone()) {
            return;
        }
        try {
            if (((Boolean) this.o.get()).booleanValue()) {
                auzcVar.d(0).a();
                auzcVar.d(0).c = 0L;
            } else {
                auzcVar.d(0).d++;
                auzcVar.d(0).c = h(j);
            }
            this.o = null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.zir, defpackage.byw
    public final void l() {
        super.l();
        this.e.clear();
    }

    @Override // defpackage.zir, defpackage.byw
    public final void m(String str, String str2) {
        super.m(str, str2);
        this.e.put(str, str2);
    }
}
