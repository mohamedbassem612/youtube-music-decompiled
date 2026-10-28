package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yph extends zir {
    private final Set b;
    private final ywn c;
    private final zjr d;
    private Uri e;
    private Uri f;
    private long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yph(byw bywVar, Set set, ywn ywnVar, zjr zjrVar) {
        super(bywVar);
        zkf.d(bywVar);
        zkf.d(set);
        this.b = set;
        this.c = ywnVar;
        this.d = zjrVar;
    }

    private final void h() {
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byt {
        try {
            return super.a(bArr, i, i2);
        } catch (byt e) {
            h();
            throw e;
        }
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final long b(byi byiVar) throws byt {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f != null && jElapsedRealtime - this.g > 600000) {
            h();
        }
        Uri uri = byiVar.a;
        if (!yno.f(uri, this.e)) {
            h();
        }
        Uri uri2 = this.f;
        if (uri2 != null) {
            Uri uri3 = this.e;
            zkf.d(uri3);
            zkf.d(uri2);
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(uri.getQueryParameterNames());
            linkedHashSet.addAll(uri3.getQueryParameterNames());
            Set set = this.b;
            linkedHashSet.addAll(set);
            tyt tytVar = new tyt(uri2);
            for (String str : linkedHashSet) {
                if (!TextUtils.equals(uri.getQueryParameter(str), uri3.getQueryParameter(str)) || set.contains(str)) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter == null) {
                        tytVar.h(str);
                    } else {
                        tytVar.e(str, queryParameter);
                    }
                }
            }
            byiVar = byiVar.c(tytVar.a());
        }
        try {
            long jB = super.b(byiVar);
            Uri uriC = super.c();
            if (!yno.f(byiVar.a, uriC)) {
                this.e = uri;
                this.f = uriC;
                this.g = SystemClock.elapsedRealtime();
                if (this.d.i.l(19, 45372904L, false)) {
                    Uri uri4 = this.e;
                    Uri uri5 = this.f;
                    this.c.w("sr", a.ca(uri5 != null ? uri5.getHost() : "null", uri4 != null ? uri4.getHost() : "null", "o.", ";r."));
                }
            }
            return jB;
        } catch (byt e) {
            h();
            throw e;
        }
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final void f() throws byt {
        try {
            super.f();
        } catch (byt e) {
            h();
            throw e;
        }
    }
}
