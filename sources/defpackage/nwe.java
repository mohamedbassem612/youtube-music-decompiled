package defpackage;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nwe {
    public nxg a;
    public Object b;
    public agkj c;
    public SenderStateOuterClass$SenderState d;
    public ntq e;
    public ntx f;
    public nsl g;
    public MotionEvent h;
    public agfr i;
    public SparseArray j;
    public int k;
    public int l;
    public byte m;
    public int n;

    public nwe() {
        new agkh(4);
    }

    public final void a(nsl nslVar) {
        if (nslVar == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.g = nslVar;
    }

    public final void b(int i) {
        this.l = i;
        this.m = (byte) (this.m | 2);
    }

    public final void c(int i) {
        this.k = i;
        this.m = (byte) (this.m | 1);
    }
}
