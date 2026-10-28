package defpackage;

import app.rive.semantics.SemanticState;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcw extends avcz {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final auyp b = new auyp("cronet-annotation", null);
    public static final auyp c = new auyp("cronet-annotations", null);
    static final auyp d = new auyp("cronet-read-buffer-size", Integer.valueOf(SemanticState.Obscured));
    public final String e;
    public final String f;
    public final avjz g;
    public final Executor h;
    public final avbe i;
    public final avcy j;
    public final Runnable k;
    public BidirectionalStream l;
    public final boolean m;
    public final Object n;
    public final Collection o;
    public final int p;
    public final avfs q;
    public axst r;
    private final avgj u;

    public avcw(String str, String str2, Executor executor, avbe avbeVar, avcy avcyVar, Runnable runnable, Object obj, int i, avbh avbhVar, avjz avjzVar, auyq auyqVar, avkf avkfVar) {
        super(avjzVar, avbeVar, auyqVar);
        this.u = new avgj(this);
        this.e = str;
        this.f = str2;
        this.g = avjzVar;
        this.h = executor;
        this.i = avbeVar;
        this.j = avcyVar;
        this.k = runnable;
        this.m = avbhVar.a == avbg.a;
        this.n = auyqVar.d(b);
        this.o = (Collection) auyqVar.d(c);
        this.q = new avfs(this, i, avjzVar, obj, avkfVar);
        this.p = ((Integer) auyqVar.d(d)).intValue();
        s();
    }

    @Override // defpackage.avdu
    public final auyo a() {
        return auyo.a;
    }

    @Override // defpackage.avcz, defpackage.avdc
    public final /* synthetic */ avdb b() {
        return this.q;
    }

    public final void c(Status status) {
        this.j.d(this, status);
    }

    public final void d(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.l;
        if (bidirectionalStream != null) {
            bidirectionalStream.write(byteBuffer, z);
            if (z2) {
                this.l.flush();
            }
        }
    }

    @Override // defpackage.avcz
    protected final /* synthetic */ avdb e() {
        return this.q;
    }

    @Override // defpackage.avcz
    protected final /* synthetic */ avgj f() {
        return this.u;
    }
}
