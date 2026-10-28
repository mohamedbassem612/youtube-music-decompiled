package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.io.BufferedInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablj {
    public final long a;
    public final Object b;
    public final Object c;

    public ablj(agfr agfrVar, zjr zjrVar) {
        long jD = zjrVar.l.d(2, 45693440L);
        this.a = jD;
        this.c = jD == yhh.MEMOIZED.d ? aguu.al(agfrVar) : agfrVar;
        this.b = jD == yhh.GET_IN_CONSTRUCTOR.d ? (jsk) agfrVar.io() : null;
    }

    public static ablj c(ContentResolver contentResolver, Uri uri) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(contentResolver.openInputStream(uri), SemanticState.Multiline);
            DigestInputStream digestInputStream = null;
            try {
                DigestInputStream digestInputStream2 = new DigestInputStream(bufferedInputStream, messageDigest);
                try {
                    byte[] bArr = new byte[SemanticState.Multiline];
                    long j = 0;
                    while (true) {
                        int i = digestInputStream2.read(bArr);
                        if (i < 0) {
                            ablj abljVar = new ablj(uri, digestInputStream2.getMessageDigest(), j);
                            digestInputStream2.close();
                            return abljVar;
                        }
                        j += (long) i;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = null;
                    digestInputStream = digestInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (digestInputStream != null) {
                        digestInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ywj] */
    public final void a(long j, int i) {
        String str;
        agfp agfpVar = (agfp) this.c;
        if (agfpVar.a) {
            long j2 = this.a;
            if (j2 == 0 || j2 <= 0 || agfpVar.a(TimeUnit.MILLISECONDS) >= j2) {
                return;
            }
            ?? r5 = this.b;
            zhv zhvVar = new zhv("player.exception");
            zhvVar.e(j);
            if (i == 1) {
                str = "PAUSE";
            } else if (i != 2) {
                str = i != 3 ? "NEXT" : "SEEK";
            } else {
                str = "STOP";
            }
            zhvVar.c = "suspicious.".concat(str);
            zhvVar.d = new Exception();
            r5.h(zhvVar.a());
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, jsk] */
    public final jsk b() {
        return this.a == yhh.GET_IN_CONSTRUCTOR.d ? this.b : (jsk) this.c.io();
    }

    public ablj(aunn aunnVar, omj omjVar, long j) {
        this.c = aunnVar;
        this.b = omjVar;
        this.a = j;
    }

    public ablj(String str, wjf wjfVar, long j) {
        this.b = str;
        this.c = wjfVar;
        this.a = j;
    }

    private ablj(Uri uri, MessageDigest messageDigest, long j) {
        this.c = messageDigest;
        this.b = uri;
        this.a = j;
    }

    public ablj(zjr zjrVar, ywj ywjVar) {
        this.c = new agfp(agdd.a);
        this.a = Math.max(zjrVar.i.d(11, 45416677L), zjrVar.j.d(20, 45409272L));
        this.b = ywjVar;
    }
}
