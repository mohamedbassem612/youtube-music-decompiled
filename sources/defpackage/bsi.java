package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsi {
    public String a;
    public Uri b;
    public String c;
    public Object d;
    public bsn e;
    private String f;
    private bsj g;
    private List h;
    private agke i;
    private long j;
    private bsv k;
    private final bsq l;
    private ggu m;

    public bsi(bss bssVar) {
        this();
        this.g = new bsj(bssVar.f);
        this.a = bssVar.b;
        this.k = bssVar.e;
        this.e = new bsn(bssVar.d);
        this.l = bssVar.g;
        bsp bspVar = bssVar.c;
        if (bspVar != null) {
            this.c = bspVar.f;
            this.f = bspVar.b;
            this.b = bspVar.a;
            this.h = bspVar.e;
            this.i = bspVar.g;
            this.d = bspVar.h;
            bsm bsmVar = bspVar.c;
            this.m = bsmVar != null ? new ggu(bsmVar) : new ggu();
            this.j = bspVar.i;
        }
    }

    public final bss a() {
        Object obj = this.m.b;
        Uri uri = this.b;
        bsp bspVar = null;
        if (uri != null) {
            bsm bsmVar = null;
            String str = this.f;
            ggu gguVar = this.m;
            if (gguVar.c != null) {
                bsmVar = new bsm(gguVar);
            }
            bspVar = new bsp(uri, str, bsmVar, this.h, this.c, this.i, this.d, this.j);
        }
        bsp bspVar2 = bspVar;
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        bsl bslVar = new bsl(this.g);
        bso bsoVar = new bso(this.e);
        bsv bsvVar = this.k;
        if (bsvVar == null) {
            bsvVar = bsv.a;
        }
        return new bss(str2, bslVar, bspVar2, bsoVar, bsvVar, this.l);
    }

    public final void b(bsk bskVar) {
        this.g = new bsj(bskVar);
    }

    public bsi() {
        this.g = new bsj();
        this.m = new ggu();
        this.h = Collections.EMPTY_LIST;
        this.i = agpi.a;
        this.e = new bsn();
        this.l = bsq.a;
        this.j = -9223372036854775807L;
    }
}
