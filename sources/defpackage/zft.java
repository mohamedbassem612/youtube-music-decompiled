package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zft implements zhp {
    public final zga a;
    public long b;
    public int c;
    public long d;
    public long e;
    private final String f;
    private final zgk g;
    private final hno h;

    public zft(hno hnoVar, String str, zga zgaVar, zgk zgkVar) {
        this.h = hnoVar;
        this.f = str;
        this.a = zgaVar;
        this.g = zgkVar;
    }

    @Override // defpackage.zhp
    public final void a(zih zihVar) {
        if (zihVar.d) {
            if (((zhl) this.h.j).cF()) {
                String str = zihVar.e;
                if (!TextUtils.isEmpty(str) && !Objects.equals(str, this.f)) {
                    return;
                }
            }
            this.b += zihVar.c;
            this.c += zihVar.b;
        }
    }

    @Override // defpackage.zhp
    public final void d(long j, long j2) {
        this.d += j2;
        this.e += j;
    }

    @Override // defpackage.zhp
    public final void e(zih zihVar) {
        if (((zhl) this.h.j).cF()) {
            String str = zihVar.e;
            if (!TextUtils.isEmpty(str) && !Objects.equals(str, this.f)) {
                return;
            }
        }
        String str2 = "c.bw.mismatch;src." + zihVar.a + ";bwt." + zihVar.b + ";bwb." + zihVar.c + ";net." + (zihVar.d ? 1 : 0);
        zhv zhvVar = new zhv("player.exception");
        zhvVar.c = str2;
        this.g.w(zhvVar.a());
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void f(long j) {
    }
}
