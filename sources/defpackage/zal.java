package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zal extends czc {
    String s;
    private final ArrayDeque t;
    private final xur u;

    public zal(xur xurVar) {
        super(null);
        this.t = new ArrayDeque();
        this.s = null;
        this.u = xurVar;
    }

    @Override // defpackage.czc, defpackage.cvi
    public final void d(long j, long j2) {
        this.t.clear();
        super.d(j, j2);
    }

    @Override // defpackage.czc
    public final int h(int i) {
        if (i == 17543 || i == 17827) {
            return 3;
        }
        if (i == 26568 || i == 29555 || i == 307544935) {
            return 1;
        }
        return super.h(i);
    }

    @Override // defpackage.czc
    protected final void n(int i) throws bsz {
        String str;
        Object obj;
        if (i == 26568) {
            zak zakVar = (zak) this.t.removeFirst();
            Object obj2 = zakVar.a;
            if (obj2 != null && (obj = zakVar.b) != null) {
                this.u.c((String) obj2, (String) obj);
                if (((String) zakVar.b).contains("Crypto-Period-Index")) {
                    this.s = (String) zakVar.b;
                }
            }
            i = 26568;
        }
        super.n(i);
        if (i != 25152 || (str = this.s) == null) {
            return;
        }
        k(25152).n = new bsa(null, true, new brz(brt.a, null, "video/webm", a.N(str).getBytes(StandardCharsets.UTF_8)));
        this.s = null;
    }

    @Override // defpackage.czc
    protected final void o(int i, long j, long j2) throws bsz {
        if (i == 26568) {
            this.t.addFirst(new zak());
            i = 26568;
        }
        super.o(i, j, j2);
    }

    @Override // defpackage.czc
    protected final void p(int i, String str) throws bsz {
        zak zakVar = (zak) this.t.peekFirst();
        if (i == 17827) {
            zkf.d(zakVar);
            zakVar.a = str;
        } else if (i == 17543) {
            zkf.d(zakVar);
            zakVar.b = str;
            i = 17543;
        }
        super.p(i, str);
    }
}
