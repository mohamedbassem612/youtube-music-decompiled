package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sca extends sbk implements rsq {
    public final awmd a;
    public final tun b;
    private final ahey c;
    private String d;
    private int e;
    private final aboi i;
    private final List h = new ArrayList();
    private abnr f = abnr.DEFAULT;

    public sca(awmd awmdVar, tun tunVar, aboi aboiVar, ahey aheyVar) {
        this.a = awmdVar;
        this.b = tunVar;
        this.i = aboiVar;
        this.c = aheyVar;
    }

    private final void c() {
        hgi hgiVar = new hgi(17);
        List list = this.h;
        Iterable$EL.forEach(list, hgiVar);
        list.clear();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof ske) {
                ske skeVar = (ske) snkVar;
                if (this.e == 3 && TextUtils.equals(skeVar.f(), this.d) && this.f == abnr.DEFAULT && (this.i.b || !skeVar.g())) {
                    b(sniVar, skeVar.e(), skeVar.c());
                }
            } else if (snkVar instanceof skd) {
                skd skdVar = (skd) snkVar;
                if (this.e == 3 && TextUtils.equals(skdVar.f(), this.d) && this.f == abnr.FULLSCREEN && (this.i.b || !skdVar.g())) {
                    b(sniVar, skdVar.e(), skdVar.c());
                }
            }
        }
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.q(ske.class, skd.class);
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        if (this.f != abnrVar) {
            this.f = abnrVar;
            c();
        }
    }

    public final void b(final sni sniVar, long j, final long j2) {
        this.h.add(ahng.p(new ahcx() { // from class: sbz
            @Override // defpackage.ahcx
            public final ListenableFuture a() {
                sca scaVar = this.a;
                tun tunVar = scaVar.b;
                long jB = tunVar.c.b();
                long j3 = tunVar.a;
                long j4 = j3 != -1 ? jB - j3 : -1L;
                long j5 = j2;
                sni sniVar2 = sniVar;
                if (j4 >= j5) {
                    ((rsk) scaVar.a.io()).q(Arrays.asList(sniVar2));
                } else {
                    scaVar.b(sniVar2, j5 - j4, j5);
                }
                return aher.a;
            }
        }, j, TimeUnit.MILLISECONDS, this.c));
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        if (i != 3 && i != 2) {
            if (i != 4) {
                return;
            } else {
                i = 4;
            }
        }
        if (Objects.equals(this.d, str) && this.e == i) {
            return;
        }
        this.d = str;
        this.e = i;
        c();
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
