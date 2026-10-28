package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.chromium.net.BidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avfs extends avdb {
    private static final avab B;
    public static final avbb n;
    public final /* synthetic */ avcw A;
    public Status o;
    public avbe p;
    public Charset q;
    public boolean r;
    public final Object s;
    public final Collection t;
    public boolean u;
    public boolean v;
    public int w;
    public Status x;
    public boolean y;
    public boolean z;

    static {
        avfr avfrVar = new avfr(0);
        B = avfrVar;
        n = avac.a(":status", avfrVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfs(avcw avcwVar, int i, avjz avjzVar, Object obj, avkf avkfVar) {
        super(i, avjzVar, avkfVar);
        this.A = avcwVar;
        this.q = StandardCharsets.UTF_8;
        this.t = new ArrayList();
        this.v = false;
        this.s = obj;
    }

    public static Charset g(avbe avbeVar) {
        String str = (String) avbeVar.b(avfp.g);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    public static void h(avbe avbeVar) {
        avbeVar.c(n);
        avbeVar.c(avad.b);
        avbeVar.c(avad.a);
    }

    public static final Status i(avbe avbeVar) {
        char cCharAt;
        Integer num = (Integer) avbeVar.b(n);
        if (num == null) {
            return Status.l.withDescription("Missing HTTP status code");
        }
        String str = (String) avbeVar.b(avfp.g);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        Status statusA = avfp.a(num.intValue());
        return str == null ? statusA.a("missing content-type in response headers") : statusA.a("invalid content-type: ".concat(str));
    }

    @Override // defpackage.avhn
    public final void j(int i) {
        avcw avcwVar = this.A;
        BidirectionalStream bidirectionalStream = avcwVar.l;
        bidirectionalStream.getClass();
        int i2 = this.w - i;
        this.w = i2;
        if (i2 != 0 || this.y) {
            return;
        }
        bidirectionalStream.read(ByteBuffer.allocateDirect(avcwVar.p));
    }

    @Override // defpackage.avhn
    public final void k(Throwable th) {
        l(Status.b(th), true, new avbe());
    }

    public final void l(Status status, boolean z, avbe avbeVar) {
        BidirectionalStream bidirectionalStream = this.A.l;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        e(status, z, avbeVar);
    }

    public final void m() {
        ahno.O(this.j != null);
        synchronized (this.b) {
            ahno.P(!this.f, "Already allocated");
            this.f = true;
        }
        super.a();
    }
}
