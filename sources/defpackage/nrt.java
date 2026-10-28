package defpackage;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrt {
    public final agkh a;
    public View b;
    public nxg c;
    public Object d;
    public SenderStateOuterClass$SenderState e;
    public ntq f;
    public ntx g;
    public MotionEvent h;
    public agfr i;
    public SparseArray j;
    public int k;
    private WeakReference l;
    private agkj m;
    private nsl n;
    private int o;
    private int p;
    private byte q;

    public nrt(nrv nrvVar) {
        this();
        this.l = nrvVar.a;
        this.b = nrvVar.b;
        this.k = nrvVar.o;
        this.c = nrvVar.c;
        this.d = nrvVar.d;
        this.m = nrvVar.e;
        this.e = nrvVar.f;
        this.f = nrvVar.g;
        this.g = nrvVar.h;
        this.n = nrvVar.i;
        this.h = nrvVar.j;
        this.i = nrvVar.k;
        this.j = nrvVar.l;
        this.o = nrvVar.m;
        this.p = nrvVar.n;
        this.q = (byte) 3;
    }

    public final nrv a() {
        nsl nslVar;
        agkj agkjVarD = this.a.d(false);
        this.m = agkjVarD;
        if (this.q == 3 && agkjVarD != null && (nslVar = this.n) != null) {
            return new nrv(this.l, this.b, this.k, this.c, this.d, agkjVarD, this.e, this.f, this.g, nslVar, this.h, this.i, this.j, this.o, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.m == null) {
            sb.append(" customMap");
        }
        if (this.n == null) {
            sb.append(" conversionContext");
        }
        if ((this.q & 1) == 0) {
            sb.append(" viewKey");
        }
        if ((this.q & 2) == 0) {
            sb.append(" nodeId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(nsl nslVar) {
        if (nslVar == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.n = nslVar;
    }

    public final void c(int i) {
        this.p = i;
        this.q = (byte) (this.q | 2);
    }

    public final void d(View view) {
        if (view == null) {
            this.l = null;
        } else {
            this.l = new WeakReference(view);
        }
    }

    public final void e(int i) {
        this.o = i;
        this.q = (byte) (this.q | 1);
    }

    public nrt() {
        this.a = new agkh(4);
    }
}
